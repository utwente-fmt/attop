package nl.utwente.ewi.fmt.UATMM.standalone;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import nl.utwente.ewi.fmt.UATMM.transformers.UAT2Uppaal;

@SuppressWarnings("serial")
public class ATTGUI extends JFrame {
	
	private class FilePanel extends Panel implements ActionListener
	{
		public JComboBox<String> langBox = new JComboBox<String>();;
		public JTextField filename = new JTextField();
		private final boolean isInput;
		
		public FilePanel(boolean isInput)
		{
			super(new BorderLayout());
			this.isInput = isInput;
			int i = 0;
			Set<Language> languages = ATTMain.getLanguages(isInput, !isInput);
			String str[] = new String[languages.size()];
			for (Language l : languages)
				str[i++] = l.getName();
			Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);
			for (i = 0; i < str.length; i++)
				langBox.addItem(str[i]);
			add(langBox, BorderLayout.WEST);
			add(filename, BorderLayout.CENTER);
			filename.setColumns(20);
			JButton browseButton = new JButton("Browse");
			browseButton.addActionListener(this);
			add(browseButton, BorderLayout.EAST);
		}
		
		public void actionPerformed(ActionEvent e)
		{
			JFileChooser c = new JFileChooser(".");
			try {
				if (isInput && c.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
					filename.setText(c.getSelectedFile().getCanonicalPath());
				else if (!isInput && c.showSaveDialog(this) == JFileChooser.APPROVE_OPTION)
					filename.setText(c.getSelectedFile().getCanonicalPath());
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	private class ManyFilePanel extends JPanel
	{
		private ArrayList<FilePanel> files = new ArrayList<FilePanel>();
		private ActionListener listener = null;

		public ManyFilePanel(String label, boolean isInput)
		{
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			final JButton newFileButton = new JButton("Add file");
			files.add(new FilePanel(isInput));
			add(files.get(0));
			newFileButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FilePanel newFile = new FilePanel(isInput);
					if (listener != null)
						newFile.langBox.addActionListener(listener);
					files.add(newFile);
					remove(newFileButton);
					add(newFile);
					add(newFileButton);
					pack();
				}
			});
			Container c = new Container();
			c.setLayout(new FlowLayout(FlowLayout.CENTER));
			c.add(newFileButton);
			add(c);
			setBorder(BorderFactory.createTitledBorder(label));
		}
		
		public void setActionListener(ActionListener l)
		{
			for (FilePanel p : files)
				p.langBox.addActionListener(l);
			listener = l;
		}
		
		public String[][] getFileData()
		{
			int size = files.size(), i;
			String[][] ret = new String[size][2];
			for (i = 0; i < size; i++) {
				ret[i][0] = files.get(i).langBox.getSelectedItem().toString();
				ret[i][1] = files.get(i).filename.getText();
			}
			return ret;
		}
	}
	
	private ManyFilePanel inputFiles, outputFiles;
	private JRadioButton reachQuery, probQuery, optQuery, expectedQuery;
	private JRadioButton optCost, optTime, optSteps;
	private JTextField costField, timeField;
	
	private JPanel makeQueryTypePanel(final JPanel optPanel)
	{
		JPanel ret = new JPanel(new GridLayout(1, 3));
		ButtonGroup jg = new ButtonGroup();
		reachQuery = new JRadioButton();
		probQuery = new JRadioButton();
		optQuery = new JRadioButton();
		expectedQuery = new JRadioButton();
		ActionListener l = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("opt"))
					optPanel.setVisible(true);
				else
					optPanel.setVisible(false);
				pack();
			}
		};
		reachQuery.addActionListener(l);
		probQuery.addActionListener(l);
		optQuery.addActionListener(l);
		expectedQuery.addActionListener(l);
		reachQuery.setText("Reachability");
		reachQuery.setActionCommand("reach");
		jg.add(reachQuery);
		ret.add(reachQuery);
		reachQuery.setSelected(true);
		probQuery.setText("Probability");
		probQuery.setActionCommand("prob");
		jg.add(probQuery);
		ret.add(probQuery);
		optQuery.setText("Optimal");
		optQuery.setActionCommand("opt");
		jg.add(optQuery);
		ret.add(optQuery);
		expectedQuery.setText("Expected cost");
		expectedQuery.setActionCommand("expect");
		jg.add(expectedQuery);
		ret.add(expectedQuery);
		return ret;
	}
	
	private JPanel makeConstraintPanel()
	{
		JPanel ret = new JPanel(new GridLayout(1,2));
		costField = new JTextField();
		costField.setText("Max. cost");
		ret.add(costField);
		timeField = new JTextField();
		timeField.setText("Max. time");
		ret.add(timeField);
		return ret;
	}
	
	private JPanel makeOptimizationPanel()
	{
		JPanel ret = new JPanel(new GridLayout(1, 3));
		ButtonGroup jg = new ButtonGroup();
		optCost = new JRadioButton();
		optTime = new JRadioButton();
		optSteps = new JRadioButton();
		optTime.setText("Time");
		jg.add(optTime);
		ret.add(optTime);
		optTime.setSelected(true);
		optCost.setText("Cost");
		jg.add(optCost);
		ret.add(optCost);
		optSteps.setText("Steps");
		jg.add(optSteps);
		ret.add(optSteps);
		return ret;
	}
	
	private String[] constructUppaalQuery() throws IOException
	{
		String query;
		File queryFile = null;
		//if (ComposedTransformer.keepTemps) { //We cannot read this yet, because the options are set when we execute the ATTMain.main method, which will happen AFTER we call constructUppaalQuery
			queryFile = new File("UppaalXML.q");
			if (queryFile.exists())
				queryFile.delete();
			if (!queryFile.createNewFile())
				queryFile = null;
		//}
		if (queryFile == null) {
			queryFile = File.createTempFile("uppaalquery", ".txt");
			queryFile.deleteOnExit();
		}
		if (reachQuery.isSelected()) {
			query = "E<> toplevel.Completed";
			try {
				int maxTime = Integer.parseInt(timeField.getText());
				query += " && toplevel.time <= " + maxTime;
			} catch (NumberFormatException ex) {
			}
			try {
				int maxCost = Integer.parseInt(costField.getText());
				query += " && cost <= " + maxCost;
			} catch (NumberFormatException ex) {
			}
		} else if (probQuery.isSelected()) {
			query = "Pr[";
			try {
				int maxTime = Integer.parseInt(timeField.getText());
				query += "toplevel.time <= " + maxTime;
			} catch (NumberFormatException ex) {
				query += "<= 10000";
			}
			query += "](<>toplevel.Completed";
			try {
				int maxCost = Integer.parseInt(costField.getText());
				query += " && cost <= " + maxCost;
			} catch (NumberFormatException ex) {
			}
			query += ")";
		} else if (expectedQuery.isSelected()) {
			query = "E[";
			try {
				int maxTime = Integer.parseInt(timeField.getText());
				query += "<= " + maxTime;
			} catch (NumberFormatException ex) {
				query += "<= 10000";
			}
			query += ";1000](max:cost)";
		} else {
			query = "E<> toplevel.Completed";
			try {
				int maxTime = Integer.parseInt(timeField.getText());
				query += " && toplevel.time <= " + maxTime;
			} catch (NumberFormatException ex) {
			}
			try {
				int maxCost = Integer.parseInt(costField.getText());
				query += " && cost <= " + maxCost;
			} catch (NumberFormatException ex) {
			}
		}
		FileOutputStream out = new FileOutputStream(queryFile);
		out.write(query.getBytes());
		out.close();
		
		File optionFile = File.createTempFile("uppaaloptions", ".txt");
		out = new FileOutputStream(optionFile);
		UAT2Uppaal.USE_CORA = false;
		if (reachQuery.isSelected()) {
			out.write("-s -o2 -t0".getBytes());
		} else if (probQuery.isSelected()) {
			out.write("-s -E 0.01".getBytes());
		} else if (expectedQuery.isSelected()) {
			out.write("-s -E 0.01".getBytes());
		} else if (optQuery.isSelected()) {
			if (optSteps.isSelected()) {
				out.write("-s -o 1 -t 1".getBytes());
			} else if (optTime.isSelected()) {
				out.write("-s -o 1 -t 2".getBytes());
			} else { /* Optimize for cost in CORA */
				out.write("-s -o 3 -t 3".getBytes());
				UAT2Uppaal.USE_CORA = true;
			}
		}
		out.close();
		return new String[] {queryFile.getAbsolutePath(), optionFile.getAbsolutePath()};
	}

	public ATTGUI()
	{
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		inputFiles = new ManyFilePanel("Input files", true);
		add(inputFiles);
		
		final JPanel optPanel = makeOptimizationPanel();
		optPanel.setBorder(BorderFactory.createTitledBorder("Optimization criterion"));
		optPanel.setVisible(false);
		
		final JPanel queryPanel = makeQueryTypePanel(optPanel);
		queryPanel.setBorder(BorderFactory.createTitledBorder("Query type"));
		queryPanel.setVisible(false);
		add(queryPanel);

		final JPanel constraintPanel = makeConstraintPanel();
		constraintPanel.setBorder(BorderFactory.createTitledBorder("Constraints"));
		constraintPanel.setVisible(false);
		add(constraintPanel);
		add(optPanel);

		outputFiles = new ManyFilePanel("Output files", false);
		add(outputFiles);
		outputFiles.setActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (String[] data : outputFiles.getFileData()) {
					if (data[0].equals("UppaalTextResult") || data[0].equals("UPPAALTrace") || data[0].equals("Schedule")) {
						constraintPanel.setVisible(true);
						queryPanel.setVisible(true);
						if (optQuery.isSelected())
							optPanel.setVisible(true);
						pack();
						return;
					}
				}
				constraintPanel.setVisible(false);
				queryPanel.setVisible(false);
				optPanel.setVisible(false);
			}
		});
		
		JButton doTransform = new JButton("Transform");
		Container c = new Container();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		c.add(doTransform);
		add(c);
		doTransform.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean runPostProc = false;
				ArrayList<String> arguments = new ArrayList<String>();
				arguments.add("--keep-temporary-files");
				for (String[] data : inputFiles.getFileData()) {
					arguments.add("-i");
					arguments.add(data[0]);
					arguments.add(data[1]);
				}
				for (String[] data : outputFiles.getFileData()) {
					arguments.add("-o");
					arguments.add(data[0]);
					arguments.add(data[1]);
					if (data[0].equals("UppaalTextResult") || data[0].equals("UPPAALTrace") || data[0].equals("Schedule")) {
						try {
							String files[] = constructUppaalQuery();
							runPostProc = true;
							arguments.add("-i");
							arguments.add("UppaalTextQuery");
							arguments.add(files[0]);
							arguments.add("-i");
							arguments.add("UppaalOptions");
							arguments.add(files[1]);
							if (data[0].equals("UPPAALTrace") || data[0].equals("Schedule"))
								runPostProc = false;
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				try {
					ATTMain.main(arguments.toArray(new String[0]));
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				if (runPostProc && reachQuery.isSelected() || (optQuery.isSelected() && optTime.isSelected()) || (optQuery.isSelected() && optSteps.isSelected())) {
					try {
						Runtime.getRuntime().exec(new String[]{"/bin/sh", System.getProperty("user.dir") + File.separator + "postProcTrace.sh", outputFiles.getFileData()[0][1]}).waitFor();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				if (runPostProc && (optQuery.isSelected() && (optCost.isSelected()))) {
					try {
						Runtime.getRuntime().exec(new String[]{"/bin/sh", System.getProperty("user.dir") + File.separator + "postProcCost.sh", outputFiles.getFileData()[0][1]}).waitFor();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				if (runPostProc && probQuery.isSelected()) {
					try {
						Runtime.getRuntime().exec(new String[]{"/bin/sh", System.getProperty("user.dir") + File.separator + "postProcProb.sh", outputFiles.getFileData()[0][1]}).waitFor();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				if (runPostProc && expectedQuery.isSelected()) {
					try {
						Runtime.getRuntime().exec(new String[]{"/bin/sh", System.getProperty("user.dir") + File.separator + "postProcExpectedCost.sh", outputFiles.getFileData()[0][1]}).waitFor();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				if (runPostProc) {
					String filename = outputFiles.getFileData()[0][1];
					try {
						FileInputStream s = new FileInputStream(filename);
						BufferedReader r = new BufferedReader(new InputStreamReader(s));
						/*StringBuilder lines = new StringBuilder();
						String line;
						int countLine = 0;
						while ((line = r.readLine()) != null && countLine < 20) {
							lines.append(line);
							lines.append('\n');
							countLine++;
						}
						if (countLine >= 20 && line != null) {
							lines.append("...");
						}
						JOptionPane.showMessageDialog(null, lines);*/
						JTextArea queryResult = new JTextArea();
						queryResult.read(r, null);
						JScrollPane scroll = new JScrollPane(queryResult, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
						GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
						int width = gd.getDisplayMode().getWidth();
						int height = gd.getDisplayMode().getHeight();
						scroll.setPreferredSize(new Dimension(width / 2, height / 2));
						JOptionPane.showMessageDialog(null, scroll);
						r.close();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			}
		});

		pack();
	}

	public static void main(String[] args) {
		ATTGUI window = new ATTGUI();
		window.setVisible(true);
	}

}