/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_structure.impl;

import nl.utwente.ewi.fmt.UATMM.UATMM_structure.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UATMM_structureFactoryImpl extends EFactoryImpl implements UATMM_structureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UATMM_structureFactory init() {
		try {
			UATMM_structureFactory theUATMM_structureFactory = (UATMM_structureFactory)EPackage.Registry.INSTANCE.getEFactory(UATMM_structurePackage.eNS_URI);
			if (theUATMM_structureFactory != null) {
				return theUATMM_structureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UATMM_structureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UATMM_structureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UATMM_structurePackage.ATTACK_TREE: return createAttackTree();
			case UATMM_structurePackage.NODE: return createNode();
			case UATMM_structurePackage.EDGE: return createEdge();
			case UATMM_structurePackage.CONNECTOR: return createConnector();
			case UATMM_structurePackage.AND: return createAND();
			case UATMM_structurePackage.OR: return createOR();
			case UATMM_structurePackage.XOR: return createXOR();
			case UATMM_structurePackage.TREE_META_DATA: return createTreeMetaData();
			case UATMM_structurePackage.PAND: return createPAND();
			case UATMM_structurePackage.TAND: return createTAND();
			case UATMM_structurePackage.KOF_N: return createKofN();
			case UATMM_structurePackage.WEIGHTED: return createWeighted();
			case UATMM_structurePackage.SAND: return createSAND();
			case UATMM_structurePackage.SOR: return createSOR();
			case UATMM_structurePackage.FDEP: return createFDEP();
			case UATMM_structurePackage.SPARE: return createSpare();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UATMM_structurePackage.ROLE_TYPE:
				return createRoleTypeFromString(eDataType, initialValue);
			case UATMM_structurePackage.NATURE:
				return createNatureFromString(eDataType, initialValue);
			case UATMM_structurePackage.EDGE_KIND:
				return createEdgeKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UATMM_structurePackage.ROLE_TYPE:
				return convertRoleTypeToString(eDataType, instanceValue);
			case UATMM_structurePackage.NATURE:
				return convertNatureToString(eDataType, instanceValue);
			case UATMM_structurePackage.EDGE_KIND:
				return convertEdgeKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackTree createAttackTree() {
		AttackTreeImpl attackTree = new AttackTreeImpl();
		return attackTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AND createAND() {
		ANDImpl and = new ANDImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OR createOR() {
		ORImpl or = new ORImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XOR createXOR() {
		XORImpl xor = new XORImpl();
		return xor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeMetaData createTreeMetaData() {
		TreeMetaDataImpl treeMetaData = new TreeMetaDataImpl();
		return treeMetaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PAND createPAND() {
		PANDImpl pand = new PANDImpl();
		return pand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAND createTAND() {
		TANDImpl tand = new TANDImpl();
		return tand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KofN createKofN() {
		KofNImpl kofN = new KofNImpl();
		return kofN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weighted createWeighted() {
		WeightedImpl weighted = new WeightedImpl();
		return weighted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAND createSAND() {
		SANDImpl sand = new SANDImpl();
		return sand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOR createSOR() {
		SORImpl sor = new SORImpl();
		return sor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FDEP createFDEP() {
		FDEPImpl fdep = new FDEPImpl();
		return fdep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spare createSpare() {
		SpareImpl spare = new SpareImpl();
		return spare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType createRoleTypeFromString(EDataType eDataType, String initialValue) {
		RoleType result = RoleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nature createNatureFromString(EDataType eDataType, String initialValue) {
		Nature result = Nature.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNatureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeKind createEdgeKindFromString(EDataType eDataType, String initialValue) {
		EdgeKind result = EdgeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UATMM_structurePackage getUATMM_structurePackage() {
		return (UATMM_structurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UATMM_structurePackage getPackage() {
		return UATMM_structurePackage.eINSTANCE;
	}

} //UATMM_structureFactoryImpl
