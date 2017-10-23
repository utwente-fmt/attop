/**
 */
package nl.utwente.ewi.fmt.UATMM.UATMM_values;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cost Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nl.utwente.ewi.fmt.UATMM.UATMM_values.UATMM_valuesPackage#getCostType()
 * @model
 * @generated
 */
public enum CostType implements Enumerator {
	/**
	 * The '<em><b>ON ACTIVATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_ACTIVATION_VALUE
	 * @generated
	 * @ordered
	 */
	ON_ACTIVATION(1, "ON_ACTIVATION", "ON_ACTIVATION"),

	/**
	 * The '<em><b>ON COMPLETION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_COMPLETION_VALUE
	 * @generated
	 * @ordered
	 */
	ON_COMPLETION(2, "ON_COMPLETION", "ON_COMPLETION"),

	/**
	 * The '<em><b>ON ABORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_ABORT_VALUE
	 * @generated
	 * @ordered
	 */
	ON_ABORT(3, "ON_ABORT", "ON_ABORT"),

	/**
	 * The '<em><b>WHILE ACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHILE_ACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	WHILE_ACTIVE(4, "WHILE_ACTIVE", "WHILE_ACTIVE"),

	/**
	 * The '<em><b>WHILE COMPLETED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHILE_COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	WHILE_COMPLETED(5, "WHILE_COMPLETED", "WHILE_COMPLETED");

	/**
	 * The '<em><b>ON ACTIVATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ON ACTIVATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_ACTIVATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ON_ACTIVATION_VALUE = 1;

	/**
	 * The '<em><b>ON COMPLETION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ON COMPLETION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_COMPLETION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ON_COMPLETION_VALUE = 2;

	/**
	 * The '<em><b>ON ABORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ON ABORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_ABORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ON_ABORT_VALUE = 3;

	/**
	 * The '<em><b>WHILE ACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHILE ACTIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHILE_ACTIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHILE_ACTIVE_VALUE = 4;

	/**
	 * The '<em><b>WHILE COMPLETED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHILE COMPLETED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHILE_COMPLETED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHILE_COMPLETED_VALUE = 5;

	/**
	 * An array of all the '<em><b>Cost Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CostType[] VALUES_ARRAY =
		new CostType[] {
			ON_ACTIVATION,
			ON_COMPLETION,
			ON_ABORT,
			WHILE_ACTIVE,
			WHILE_COMPLETED,
		};

	/**
	 * A public read-only list of all the '<em><b>Cost Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CostType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cost Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CostType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CostType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cost Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CostType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CostType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cost Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CostType get(int value) {
		switch (value) {
			case ON_ACTIVATION_VALUE: return ON_ACTIVATION;
			case ON_COMPLETION_VALUE: return ON_COMPLETION;
			case ON_ABORT_VALUE: return ON_ABORT;
			case WHILE_ACTIVE_VALUE: return WHILE_ACTIVE;
			case WHILE_COMPLETED_VALUE: return WHILE_COMPLETED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CostType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CostType
