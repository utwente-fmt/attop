/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_structure.util;

import nl.utwente.ewi.fmt.UATMM.UATMM_structure.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.UATMM_structurePackage
 * @generated
 */
public class UATMM_structureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UATMM_structurePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UATMM_structureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UATMM_structurePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UATMM_structureSwitch<Adapter> modelSwitch =
		new UATMM_structureSwitch<Adapter>() {
			@Override
			public Adapter caseAttackTree(AttackTree object) {
				return createAttackTreeAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseAND(AND object) {
				return createANDAdapter();
			}
			@Override
			public Adapter caseOR(OR object) {
				return createORAdapter();
			}
			@Override
			public Adapter caseXOR(XOR object) {
				return createXORAdapter();
			}
			@Override
			public Adapter caseTreeMetaData(TreeMetaData object) {
				return createTreeMetaDataAdapter();
			}
			@Override
			public Adapter casePAND(PAND object) {
				return createPANDAdapter();
			}
			@Override
			public Adapter caseTAND(TAND object) {
				return createTANDAdapter();
			}
			@Override
			public Adapter caseKofN(KofN object) {
				return createKofNAdapter();
			}
			@Override
			public Adapter caseWeighted(Weighted object) {
				return createWeightedAdapter();
			}
			@Override
			public Adapter caseSAND(SAND object) {
				return createSANDAdapter();
			}
			@Override
			public Adapter caseSOR(SOR object) {
				return createSORAdapter();
			}
			@Override
			public Adapter caseFDEP(FDEP object) {
				return createFDEPAdapter();
			}
			@Override
			public Adapter caseSpare(Spare object) {
				return createSpareAdapter();
			}
			@Override
			public Adapter caseRDEP(RDEP object) {
				return createRDEPAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.AttackTree <em>Attack Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.AttackTree
	 * @generated
	 */
	public Adapter createAttackTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.AND <em>AND</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.AND
	 * @generated
	 */
	public Adapter createANDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.OR <em>OR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.OR
	 * @generated
	 */
	public Adapter createORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.XOR <em>XOR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.XOR
	 * @generated
	 */
	public Adapter createXORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.TreeMetaData <em>Tree Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.TreeMetaData
	 * @generated
	 */
	public Adapter createTreeMetaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.PAND <em>PAND</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.PAND
	 * @generated
	 */
	public Adapter createPANDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.TAND <em>TAND</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.TAND
	 * @generated
	 */
	public Adapter createTANDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.KofN <em>Kof N</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.KofN
	 * @generated
	 */
	public Adapter createKofNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Weighted <em>Weighted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Weighted
	 * @generated
	 */
	public Adapter createWeightedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.SAND <em>SAND</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.SAND
	 * @generated
	 */
	public Adapter createSANDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.SOR <em>SOR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.SOR
	 * @generated
	 */
	public Adapter createSORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.FDEP <em>FDEP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.FDEP
	 * @generated
	 */
	public Adapter createFDEPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.Spare <em>Spare</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.Spare
	 * @generated
	 */
	public Adapter createSpareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.utwente.ewi.fmt.UATMM.UATMM_structure.RDEP <em>RDEP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.utwente.ewi.fmt.UATMM.UATMM_structure.RDEP
	 * @generated
	 */
	public Adapter createRDEPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UATMM_structureAdapterFactory
