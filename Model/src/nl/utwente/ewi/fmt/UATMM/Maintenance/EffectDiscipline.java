/**
 */
package nl.utwente.ewi.fmt.UATMM.Maintenance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Effect Discipline</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nl.utwente.ewi.fmt.UATMM.Maintenance.MaintenancePackage#getEffectDiscipline()
 * @model
 * @generated
 */
public enum EffectDiscipline implements Enumerator {
	/**
	 * The '<em><b>RANDOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_VALUE
	 * @generated
	 * @ordered
	 */
	RANDOM(0, "RANDOM", "RANDOM"),

	/**
	 * The '<em><b>IN ORDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	IN_ORDER(1, "IN_ORDER", "IN_ORDER"),

	/**
	 * The '<em><b>NONDETERMINISTIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONDETERMINISTIC_VALUE
	 * @generated
	 * @ordered
	 */
	NONDETERMINISTIC(2, "NONDETERMINISTIC", "NONDETERMINISTIC"), /**
	 * The '<em><b>CUSTOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM(3, "CUSTOM", "CUSTOM");

	/**
	 * The '<em><b>RANDOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RANDOM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RANDOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RANDOM_VALUE = 0;

	/**
	 * The '<em><b>IN ORDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IN ORDER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_ORDER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_ORDER_VALUE = 1;

	/**
	 * The '<em><b>NONDETERMINISTIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONDETERMINISTIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONDETERMINISTIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONDETERMINISTIC_VALUE = 2;

	/**
	 * The '<em><b>CUSTOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_VALUE = 3;

	/**
	 * An array of all the '<em><b>Effect Discipline</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EffectDiscipline[] VALUES_ARRAY =
		new EffectDiscipline[] {
			RANDOM,
			IN_ORDER,
			NONDETERMINISTIC,
			CUSTOM,
		};

	/**
	 * A public read-only list of all the '<em><b>Effect Discipline</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EffectDiscipline> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Effect Discipline</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EffectDiscipline get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EffectDiscipline result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Effect Discipline</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EffectDiscipline getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EffectDiscipline result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Effect Discipline</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EffectDiscipline get(int value) {
		switch (value) {
			case RANDOM_VALUE: return RANDOM;
			case IN_ORDER_VALUE: return IN_ORDER;
			case NONDETERMINISTIC_VALUE: return NONDETERMINISTIC;
			case CUSTOM_VALUE: return CUSTOM;
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
	private EffectDiscipline(int value, String name, String literal) {
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
	
} //EffectDiscipline