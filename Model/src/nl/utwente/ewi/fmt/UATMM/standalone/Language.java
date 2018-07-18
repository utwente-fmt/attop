package nl.utwente.ewi.fmt.UATMM.standalone;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.ecore.EPackage;

import UMMAALScheduleSimple.UMMAALScheduleSimplePackage;
import nl.utwente.ewi.fmt.UATMM.UATMM_structure.UATMM_structurePackage;
import nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage;
import nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage;
import nl.utwente.ewi.fmt.uppaalSMC.UppaalSMCPackage;
import uppaalTrace.UppaalTracePackage;

public enum Language {
	/** The Universal Attack Tree meta-model. */
	UATS("UATS", UATMM_structurePackage.eINSTANCE, "validations/UATStructure.evl"),
	UATV("UATV", UATMM_valuesPackage.eINSTANCE),
	UATM("UATM", MaintenancePackage.eINSTANCE),
	UATS_BINARY("UATSBin", UATMM_structurePackage.eINSTANCE),
	/** Attack Tree Analyzer XML format. */
	ATA("ATA"),
	/** Attack Tree Evaluator XML format. */
	ATE("ATE"),
	/** ADTool XML format. */
	AD_TOOL("ADTool"),
	/** ATCalc textual format. */
	AT_CALC("ATCalc"),
	/** ADTool Binary Tree XML format*/
	AD_TOOL_BINARY("ADTBin"),
	FAULT_TREE_PLUS("FaultTreePlus"),
	/* Uppaal formats */
	UPPAAL_XML("UppaalXML"),
	UPPAAL("Uppaal", UppaalSMCPackage.eINSTANCE),
	/** Command-line options to the verifyta UPPAAL tool */
	UPPAAL_OPTIONS("UppaalOptions"),
	/** UPPAAL input query language (i.e., the content of .q files) */
	UPPAAL_TEXT_QUERY("UppaalTextQuery"),
	/** Textual output from verifyta */
	UPPAAL_TEXT_RESULT("UppaalTextResult"),
	UPPAAL_PLOT_RESULT("Uppaal plot"),
	/** Textual format for maintenance policies */
	AFT_MAINTENANCE("AFTM"),
	/** NuSMV model-checker format */
	NUSMV("NuSMV"),
	NUSMV_PROBS("NuSMV_probs"),
	STORM_IMC("Storm"),
	IMRMC("IMRMC"),
	/** Galileo textual format for fault trees */
	GALILEO("Galileo"),
	/** UPPAAL trace model */
	UPPAAL_TRACE("UPPAALTrace", UppaalTracePackage.eINSTANCE),
	/** (Generic) Schedule model */
	SCHEDULE("Schedule", UMMAALScheduleSimplePackage.eINSTANCE),
	;
	
	private final String name;
	private final String location;
	public final EPackage pkg;
	public final String validator;
	
	/** Constructs a language without location or validator. */
	private Language(String name) {
		this(name, (String)null, null);
	}

	/** Constructs a language without validator. */
	private Language(String name, String location) {
		this(name, location, null);
	}

	private Language(String name, EPackage pkg) {
		this(name, pkg, null);
	}
	
	private Language(String name, EPackage pkg, String validator) {
		this.name = name;
		this.validator = validator;
		this.pkg = pkg;
		EPackage.Registry.INSTANCE.put(pkg.getNsURI(), pkg);
		this.location = null;
	}
	
	/** Constructs a language with possibly null location. */
	private Language(String name, String location, String validator) {
		this.name = name;
		this.location = location;
		this.validator = validator;
		this.pkg = null;
	}
	
	/** Returns the name of this language. */
	public String getName() {
		return name;
	}
	
	/** Returns the (possibly <code>null</code>) location of the language definition. */
	public String getLocation() {
		return location;
	}
	
	private static final Map<String,Language> languageMap;
	
	static {
		languageMap = new TreeMap<>();
		for (Language l: Language.values()) {
			languageMap.put(l.getName(), l);
		}
	}
	
	/** Returns the language with a given name. */
	public static Language getLanguage(String name) {
		return languageMap.get(name);
	}
	
	/** Returns the map from language names to languages. */
	public static Map<String,Language> getLanguageMap() {
		return Collections.unmodifiableMap(languageMap);
	}
}
