/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_structure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.UATMM_structureFactory
 * @model kind="package"
 * @generated
 */
public interface UATMM_structurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UATMM_structure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore:UATMM_structure";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nl.utwente.ewi.fmt.UATMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UATMM_structurePackage eINSTANCE = nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl.init();

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.AttackTreeImpl <em>Attack Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.AttackTreeImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getAttackTree()
	 * @generated
	 */
	int ATTACK_TREE = 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_TREE__ROOT = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_TREE__NODES = 1;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_TREE__EDGES = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_TREE__METADATA = 3;

	/**
	 * The number of structural features of the '<em>Attack Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_TREE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attack Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_TREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.NodeImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHILDREN = 1;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARENTS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = 4;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NATURE = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ROLE = 6;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.EdgeImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Edge Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__EDGE_KIND = 2;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.ConnectorImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 3;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.ANDImpl <em>AND</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.ANDImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getAND()
	 * @generated
	 */
	int AND = 4;

	/**
	 * The number of structural features of the '<em>AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.ORImpl <em>OR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.ORImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getOR()
	 * @generated
	 */
	int OR = 5;

	/**
	 * The number of structural features of the '<em>OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.XORImpl <em>XOR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.XORImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getXOR()
	 * @generated
	 */
	int XOR = 6;

	/**
	 * The number of structural features of the '<em>XOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.TreeMetaDataImpl <em>Tree Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.TreeMetaDataImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getTreeMetaData()
	 * @generated
	 */
	int TREE_META_DATA = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_META_DATA__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_META_DATA__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Tree Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_META_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tree Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_META_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.PANDImpl <em>PAND</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.PANDImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getPAND()
	 * @generated
	 */
	int PAND = 8;

	/**
	 * The number of structural features of the '<em>PAND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAND_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PAND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAND_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.TANDImpl <em>TAND</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.TANDImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getTAND()
	 * @generated
	 */
	int TAND = 9;

	/**
	 * The number of structural features of the '<em>TAND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAND_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TAND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAND_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.KofNImpl <em>Kof N</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.KofNImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getKofN()
	 * @generated
	 */
	int KOF_N = 10;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOF_N__THRESHOLD = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kof N</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOF_N_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Kof N</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOF_N_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.WeightedImpl <em>Weighted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.WeightedImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getWeighted()
	 * @generated
	 */
	int WEIGHTED = 11;

	/**
	 * The feature id for the '<em><b>Treshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTED__TRESHOLD = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weights</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTED__WEIGHTS = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Weighted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTED_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Weighted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTED_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.SANDImpl <em>SAND</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.SANDImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getSAND()
	 * @generated
	 */
	int SAND = 12;

	/**
	 * The number of structural features of the '<em>SAND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAND_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SAND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAND_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.SORImpl <em>SOR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.SORImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getSOR()
	 * @generated
	 */
	int SOR = 13;

	/**
	 * The number of structural features of the '<em>SOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.FDEPImpl <em>FDEP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.FDEPImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getFDEP()
	 * @generated
	 */
	int FDEP = 14;

	/**
	 * The number of structural features of the '<em>FDEP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDEP_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FDEP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDEP_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.SpareImpl <em>Spare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.SpareImpl
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getSpare()
	 * @generated
	 */
	int SPARE = 15;

	/**
	 * The number of structural features of the '<em>Spare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARE_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARE_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.RoleType <em>Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.RoleType
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 16;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Nature <em>Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Nature
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getNature()
	 * @generated
	 */
	int NATURE = 17;

	/**
	 * The meta object id for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.EdgeKind <em>Edge Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.EdgeKind
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getEdgeKind()
	 * @generated
	 */
	int EDGE_KIND = 18;


	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.AttackTree <em>Attack Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attack Tree</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.AttackTree
	 * @generated
	 */
	EClass getAttackTree();

	/**
	 * Returns the meta object for the reference '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.AttackTree#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.AttackTree#getRoot()
	 * @see #getAttackTree()
	 * @generated
	 */
	EReference getAttackTree_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.AttackTree#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.AttackTree#getNodes()
	 * @see #getAttackTree()
	 * @generated
	 */
	EReference getAttackTree_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.AttackTree#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.AttackTree#getEdges()
	 * @see #getAttackTree()
	 * @generated
	 */
	EReference getAttackTree_Edges();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.AttackTree#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.AttackTree#getMetadata()
	 * @see #getAttackTree()
	 * @generated
	 */
	EReference getAttackTree_Metadata();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node#getConnector()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Connector();

	/**
	 * Returns the meta object for the reference list '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node#getChildren()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Children();

	/**
	 * Returns the meta object for the reference list '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parents</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node#getParents()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Parents();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node#getId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Id();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node#getLabel()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Label();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node#getNature()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Nature();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node#getRole()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Role();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for the reference '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Edge#getEdgeKind <em>Edge Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge Kind</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Edge#getEdgeKind()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_EdgeKind();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.AND <em>AND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.AND
	 * @generated
	 */
	EClass getAND();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.OR <em>OR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.OR
	 * @generated
	 */
	EClass getOR();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.XOR <em>XOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XOR</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.XOR
	 * @generated
	 */
	EClass getXOR();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.TreeMetaData <em>Tree Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Meta Data</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.TreeMetaData
	 * @generated
	 */
	EClass getTreeMetaData();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.TreeMetaData#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.TreeMetaData#getKey()
	 * @see #getTreeMetaData()
	 * @generated
	 */
	EAttribute getTreeMetaData_Key();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.TreeMetaData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.TreeMetaData#getValue()
	 * @see #getTreeMetaData()
	 * @generated
	 */
	EAttribute getTreeMetaData_Value();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.PAND <em>PAND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PAND</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.PAND
	 * @generated
	 */
	EClass getPAND();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.TAND <em>TAND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAND</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.TAND
	 * @generated
	 */
	EClass getTAND();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.KofN <em>Kof N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kof N</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.KofN
	 * @generated
	 */
	EClass getKofN();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.KofN#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.KofN#getThreshold()
	 * @see #getKofN()
	 * @generated
	 */
	EAttribute getKofN_Threshold();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Weighted <em>Weighted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weighted</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Weighted
	 * @generated
	 */
	EClass getWeighted();

	/**
	 * Returns the meta object for the attribute '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Weighted#getTreshold <em>Treshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Treshold</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Weighted#getTreshold()
	 * @see #getWeighted()
	 * @generated
	 */
	EAttribute getWeighted_Treshold();

	/**
	 * Returns the meta object for the attribute list '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Weighted#getWeights <em>Weights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Weights</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Weighted#getWeights()
	 * @see #getWeighted()
	 * @generated
	 */
	EAttribute getWeighted_Weights();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.SAND <em>SAND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAND</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.SAND
	 * @generated
	 */
	EClass getSAND();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.SOR <em>SOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SOR</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.SOR
	 * @generated
	 */
	EClass getSOR();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.FDEP <em>FDEP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FDEP</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.FDEP
	 * @generated
	 */
	EClass getFDEP();

	/**
	 * Returns the meta object for class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Spare <em>Spare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spare</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Spare
	 * @generated
	 */
	EClass getSpare();

	/**
	 * Returns the meta object for enum '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Type</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.RoleType
	 * @generated
	 */
	EEnum getRoleType();

	/**
	 * Returns the meta object for enum '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Nature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nature</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Nature
	 * @generated
	 */
	EEnum getNature();

	/**
	 * Returns the meta object for enum '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.EdgeKind <em>Edge Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Edge Kind</em>'.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.EdgeKind
	 * @generated
	 */
	EEnum getEdgeKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UATMM_structureFactory getUATMM_structureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.AttackTreeImpl <em>Attack Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.AttackTreeImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getAttackTree()
		 * @generated
		 */
		EClass ATTACK_TREE = eINSTANCE.getAttackTree();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_TREE__ROOT = eINSTANCE.getAttackTree_Root();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_TREE__NODES = eINSTANCE.getAttackTree_Nodes();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_TREE__EDGES = eINSTANCE.getAttackTree_Edges();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_TREE__METADATA = eINSTANCE.getAttackTree_Metadata();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.NodeImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CONNECTOR = eINSTANCE.getNode_Connector();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CHILDREN = eINSTANCE.getNode_Children();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PARENTS = eINSTANCE.getNode_Parents();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ID = eINSTANCE.getNode_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__LABEL = eINSTANCE.getNode_Label();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NATURE = eINSTANCE.getNode_Nature();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ROLE = eINSTANCE.getNode_Role();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.EdgeImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Edge Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__EDGE_KIND = eINSTANCE.getEdge_EdgeKind();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.ConnectorImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.ANDImpl <em>AND</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.ANDImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getAND()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAND();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.ORImpl <em>OR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.ORImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getOR()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOR();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.XORImpl <em>XOR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.XORImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getXOR()
		 * @generated
		 */
		EClass XOR = eINSTANCE.getXOR();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.TreeMetaDataImpl <em>Tree Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.TreeMetaDataImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getTreeMetaData()
		 * @generated
		 */
		EClass TREE_META_DATA = eINSTANCE.getTreeMetaData();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_META_DATA__KEY = eINSTANCE.getTreeMetaData_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_META_DATA__VALUE = eINSTANCE.getTreeMetaData_Value();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.PANDImpl <em>PAND</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.PANDImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getPAND()
		 * @generated
		 */
		EClass PAND = eINSTANCE.getPAND();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.TANDImpl <em>TAND</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.TANDImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getTAND()
		 * @generated
		 */
		EClass TAND = eINSTANCE.getTAND();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.KofNImpl <em>Kof N</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.KofNImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getKofN()
		 * @generated
		 */
		EClass KOF_N = eINSTANCE.getKofN();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KOF_N__THRESHOLD = eINSTANCE.getKofN_Threshold();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.WeightedImpl <em>Weighted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.WeightedImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getWeighted()
		 * @generated
		 */
		EClass WEIGHTED = eINSTANCE.getWeighted();

		/**
		 * The meta object literal for the '<em><b>Treshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEIGHTED__TRESHOLD = eINSTANCE.getWeighted_Treshold();

		/**
		 * The meta object literal for the '<em><b>Weights</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEIGHTED__WEIGHTS = eINSTANCE.getWeighted_Weights();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.SANDImpl <em>SAND</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.SANDImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getSAND()
		 * @generated
		 */
		EClass SAND = eINSTANCE.getSAND();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.SORImpl <em>SOR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.SORImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getSOR()
		 * @generated
		 */
		EClass SOR = eINSTANCE.getSOR();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.FDEPImpl <em>FDEP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.FDEPImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getFDEP()
		 * @generated
		 */
		EClass FDEP = eINSTANCE.getFDEP();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.SpareImpl <em>Spare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.SpareImpl
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getSpare()
		 * @generated
		 */
		EClass SPARE = eINSTANCE.getSpare();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.RoleType <em>Role Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.RoleType
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getRoleType()
		 * @generated
		 */
		EEnum ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Nature <em>Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Nature
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getNature()
		 * @generated
		 */
		EEnum NATURE = eINSTANCE.getNature();

		/**
		 * The meta object literal for the '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.EdgeKind <em>Edge Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.EdgeKind
		 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl.UATMM_structurePackageImpl#getEdgeKind()
		 * @generated
		 */
		EEnum EDGE_KIND = eINSTANCE.getEdgeKind();

	}

} //UATMM_structurePackage
