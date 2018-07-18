package nl.utwente.ewi.fmt.UATMM.standalone;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import nl.utwente.ewi.fmt.UATMM.transformers.UAT2Uppaal;

@SuppressWarnings("serial")
public class FTGUI extends JFrame {
	
	private class FilePanel extends Panel implements ActionListener
	{
		public JComboBox<String> langBox = new JComboBox<String>();;
		public JTextField filename = new JTextField();
		private final boolean isInput;
		
		public FilePanel(boolean isInput)
		{
			super(new BorderLayout());
			this.isInput = isInput;
			for (Language l : Language.values())
				langBox.addItem(l.getName());
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
			files.add(new FilePanel(true));
			add(files.get(0));
			newFileButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FilePanel newFile = new FilePanel(true);
					if (listener != null)
						newFile.langBox.addActionListener(listener);
					files.add(newFile);
					remove(newFileButton);
					add(newFile);
					add(newFileButton);
					pack();
				}
			});
			newFileButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
			add(newFileButton);
			setBorder(BorderFactory.createTitledBorder(label));
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
	
	private ManyFilePanel inputFiles;
	private JRadioButton probQuery, numFailsQuery;
	private JTextField costField, timeField, numSimField, accField;
	
	private JPanel makeQueryTypePanel()
	{
		JPanel ret = new JPanel(new GridLayout(1, 3));
		ButtonGroup jg = new ButtonGroup();
		numFailsQuery = new JRadioButton();
		probQuery = new JRadioButton();
		probQuery.setText("Failure probability");
		probQuery.setActionCommand("prob");
		jg.add(probQuery);
		ret.add(probQuery);
		numFailsQuery.setText("Number of failures");
		numFailsQuery.setActionCommand("numFails");
		jg.add(numFailsQuery);
		ret.add(numFailsQuery);
		probQuery.setSelected(true);
		return ret;
	}
	
	private JPanel makeConstraintPanel()
	{
		JPanel ret = new JPanel(new GridLayout(2,2));
		costField = new JTextField();
		costField.setText("Max. cost");
		ret.add(costField);
		timeField = new JTextField();
		timeField.setText("Max. time");
		ret.add(timeField);
		accField = new JTextField();
		accField.setText("Desired accuracy (default 0.01)");
		ret.add(accField);
		numSimField = new JTextField();
		numSimField.setText("Desired number of simulations (default 10,000)");
		ret.add(numSimField);
		
		FocusListener l = new FocusListener() {
			public void focusLost(FocusEvent e) {}
			public void focusGained(FocusEvent e) {
				Object source = e.getSource();
				if (source instanceof JTextField) {
					((JTextField)source).selectAll();
				}
			}
		};
		costField.addFocusListener(l);
		timeField.addFocusListener(l);
		accField.addFocusListener(l);
		numSimField.addFocusListener(l);
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
		if (probQuery.isSelected()) {
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
		} else if (numFailsQuery.isSelected()) {
			int nRuns = 10000;
			try {
				nRuns = Integer.parseInt(numSimField.getText());
			} catch (NumberFormatException e) {
			}
			StringBuilder bld = new StringBuilder();
			int maxTime = 10;
			try {
				maxTime = Integer.parseInt(timeField.getText());
			} catch (NumberFormatException ex) {
			}
			for (int i = 1; i <= maxTime; i++) {
				bld.append("E[<=");
				bld.append(i);
				bld.append(';');
				bld.append(nRuns);
				bld.append("](max:toplevel.num_completions)\n");
			}
			query = bld.toString();
		} else {
			query = "No query possible";
		}
		FileOutputStream out = new FileOutputStream(queryFile);
		out.write(query.getBytes());
		out.close();
		
		File optionFile = File.createTempFile("uppaaloptions", ".txt");
		out = new FileOutputStream(optionFile);
		UAT2Uppaal.USE_CORA = false;
		double accuracy = 0.01;
		try {
			accuracy = Double.parseDouble(accField.getText());
		} catch (NumberFormatException e) {
		}
		out.write("-s -E ".getBytes());
		out.write(Double.toString(accuracy).getBytes());
		out.close();
		return new String[] {queryFile.getAbsolutePath(), optionFile.getAbsolutePath()};
	}
	
	public FTGUI()
	{
		super();
		final JFrame parent = this;
		this.setTitle("FMT GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		inputFiles = new ManyFilePanel("Input files", true);
		add(inputFiles);
		
		final JPanel queryPanel = makeQueryTypePanel();
		queryPanel.setBorder(BorderFactory.createTitledBorder("Query type"));
		add(queryPanel);

		final JPanel constraintPanel = makeConstraintPanel();
		constraintPanel.setBorder(BorderFactory.createTitledBorder("Constraints"));
		add(constraintPanel);

		JPanel outputPanel = new JPanel(new BorderLayout());
		outputPanel.setBorder(BorderFactory.createTitledBorder("Output file"));
		final JTextField outputFilename = new JTextField();
		outputFilename.setColumns(32);
		outputPanel.add(outputFilename, BorderLayout.CENTER);
		JButton browseButton = new JButton("Browse");
		browseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				JFileChooser c = new JFileChooser(".");
				c.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("PDF File (*.pdf)", "pdf"));
				c.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("PNG File (*.png)", "png"));
				c.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("SVG File (*.svg)", "svg"));
				try {
					if (c.showSaveDialog(parent) == JFileChooser.APPROVE_OPTION)
						outputFilename.setText(c.getSelectedFile().getCanonicalPath());
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		});
		outputPanel.add(browseButton, BorderLayout.EAST);
		add(outputPanel);
		
		JButton doTransform = new JButton("Transform");
		doTransform.setAlignmentX(JButton.CENTER_ALIGNMENT);
		add(doTransform);
		doTransform.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> arguments = new ArrayList<String>();
				arguments.add("--keep-temporary-files");
				for (String[] data : inputFiles.getFileData()) {
					arguments.add("-i");
					arguments.add(data[0]);
					arguments.add(data[1]);
				}

				arguments.add("-o");
				arguments.add("Uppaal plot");
				arguments.add(outputFilename.getText());
				try {
					String files[] = constructUppaalQuery();
					arguments.add("-i");
					arguments.add("UppaalTextQuery");
					arguments.add(files[0]);
					arguments.add("-i");
					arguments.add("UppaalOptions");
					arguments.add(files[1]);
				} catch (IOException ex) {
					ex.printStackTrace();
				}

				try {
					ATTMain.main(arguments.toArray(new String[0]));
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});

		pack();
	}

	public static void main(String[] args) {
		FTGUI window = new FTGUI();
		window.setVisible(true);
	}

}
