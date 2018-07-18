/**
 */
package uppaalTrace.transitions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uppaalTrace.transitions.TransitionsFactory
 * @model kind="package"
 * @generated
 */
public interface TransitionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "transitions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "uppaalTrace.transitions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uppaalTrace.transitions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransitionsPackage eINSTANCE = uppaalTrace.transitions.impl.TransitionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link uppaalTrace.transitions.impl.AbstractTransitionImpl <em>Abstract Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uppaalTrace.transitions.impl.AbstractTransitionImpl
	 * @see uppaalTrace.transitions.impl.TransitionsPackageImpl#getAbstractTransition()
	 * @generated
	 */
	int ABSTRACT_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Abstract Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uppaalTrace.transitions.impl.DelayTransitionImpl <em>Delay Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uppaalTrace.transitions.impl.DelayTransitionImpl
	 * @see uppaalTrace.transitions.impl.TransitionsPackageImpl#getDelayTransition()
	 * @generated
	 */
	int DELAY_TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_TRANSITION__SOURCE = ABSTRACT_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_TRANSITION__TARGET = ABSTRACT_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_TRANSITION__DELAY = ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delay Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_TRANSITION_FEATURE_COUNT = ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uppaalTrace.transitions.impl.EdgeTransitionImpl <em>Edge Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uppaalTrace.transitions.impl.EdgeTransitionImpl
	 * @see uppaalTrace.transitions.impl.TransitionsPackageImpl#getEdgeTransition()
	 * @generated
	 */
	int EDGE_TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_TRANSITION__SOURCE = ABSTRACT_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_TRANSITION__TARGET = ABSTRACT_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_TRANSITION__EDGES = ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Edge Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_TRANSITION_FEATURE_COUNT = ABSTRACT_TRANSITION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link uppaalTrace.transitions.AbstractTransition <em>Abstract Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Transition</em>'.
	 * @see uppaalTrace.transitions.AbstractTransition
	 * @generated
	 */
	EClass getAbstractTransition();

	/**
	 * Returns the meta object for the reference '{@link uppaalTrace.transitions.AbstractTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see uppaalTrace.transitions.AbstractTransition#getSource()
	 * @see #getAbstractTransition()
	 * @generated
	 */
	EReference getAbstractTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link uppaalTrace.transitions.AbstractTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see uppaalTrace.transitions.AbstractTransition#getTarget()
	 * @see #getAbstractTransition()
	 * @generated
	 */
	EReference getAbstractTransition_Target();

	/**
	 * Returns the meta object for class '{@link uppaalTrace.transitions.DelayTransition <em>Delay Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay Transition</em>'.
	 * @see uppaalTrace.transitions.DelayTransition
	 * @generated
	 */
	EClass getDelayTransition();

	/**
	 * Returns the meta object for the attribute '{@link uppaalTrace.transitions.DelayTransition#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see uppaalTrace.transitions.DelayTransition#getDelay()
	 * @see #getDelayTransition()
	 * @generated
	 */
	EAttribute getDelayTransition_Delay();

	/**
	 * Returns the meta object for class '{@link uppaalTrace.transitions.EdgeTransition <em>Edge Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Transition</em>'.
	 * @see uppaalTrace.transitions.EdgeTransition
	 * @generated
	 */
	EClass getEdgeTransition();

	/**
	 * Returns the meta object for the reference list '{@link uppaalTrace.transitions.EdgeTransition#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edges</em>'.
	 * @see uppaalTrace.transitions.EdgeTransition#getEdges()
	 * @see #getEdgeTransition()
	 * @generated
	 */
	EReference getEdgeTransition_Edges();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TransitionsFactory getTransitionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uppaalTrace.transitions.impl.AbstractTransitionImpl <em>Abstract Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uppaalTrace.transitions.impl.AbstractTransitionImpl
		 * @see uppaalTrace.transitions.impl.TransitionsPackageImpl#getAbstractTransition()
		 * @generated
		 */
		EClass ABSTRACT_TRANSITION = eINSTANCE.getAbstractTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TRANSITION__SOURCE = eINSTANCE.getAbstractTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TRANSITION__TARGET = eINSTANCE.getAbstractTransition_Target();

		/**
		 * The meta object literal for the '{@link uppaalTrace.transitions.impl.DelayTransitionImpl <em>Delay Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uppaalTrace.transitions.impl.DelayTransitionImpl
		 * @see uppaalTrace.transitions.impl.TransitionsPackageImpl#getDelayTransition()
		 * @generated
		 */
		EClass DELAY_TRANSITION = eINSTANCE.getDelayTransition();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY_TRANSITION__DELAY = eINSTANCE.getDelayTransition_Delay();

		/**
		 * The meta object literal for the '{@link uppaalTrace.transitions.impl.EdgeTransitionImpl <em>Edge Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uppaalTrace.transitions.impl.EdgeTransitionImpl
		 * @see uppaalTrace.transitions.impl.TransitionsPackageImpl#getEdgeTransition()
		 * @generated
		 */
		EClass EDGE_TRANSITION = eINSTANCE.getEdgeTransition();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_TRANSITION__EDGES = eINSTANCE.getEdgeTransition_Edges();

	}

} //TransitionsPackage
