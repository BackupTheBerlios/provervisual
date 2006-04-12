/**
 * <copyright>
 * </copyright>
 *
 * $Id: StateType.java,v 1.1 2006/04/12 15:03:46 rustikus Exp $
 */
package ProVerVisual;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>State Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ProVerVisual.ProVerVisualPackage#getStateType()
 * @model
 * @generated
 */
public final class StateType extends AbstractEnumerator {
	/**
	 * The '<em><b>Initial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Initial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIAL_LITERAL
	 * @model name="Initial"
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL = 0;

	/**
	 * The '<em><b>Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Action</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTION_LITERAL
	 * @model name="Action"
	 * @generated
	 * @ordered
	 */
	public static final int ACTION = 1;

	/**
	 * The '<em><b>Final</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Final</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINAL_LITERAL
	 * @model name="Final"
	 * @generated
	 * @ordered
	 */
	public static final int FINAL = 2;

	/**
	 * The '<em><b>Initial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIAL
	 * @generated
	 * @ordered
	 */
	public static final StateType INITIAL_LITERAL = new StateType(INITIAL, "Initial", "Initial");

	/**
	 * The '<em><b>Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION
	 * @generated
	 * @ordered
	 */
	public static final StateType ACTION_LITERAL = new StateType(ACTION, "Action", "Action");

	/**
	 * The '<em><b>Final</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINAL
	 * @generated
	 * @ordered
	 */
	public static final StateType FINAL_LITERAL = new StateType(FINAL, "Final", "Final");

	/**
	 * An array of all the '<em><b>State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StateType[] VALUES_ARRAY =
		new StateType[] {
			INITIAL_LITERAL,
			ACTION_LITERAL,
			FINAL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>State Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateType get(int value) {
		switch (value) {
			case INITIAL: return INITIAL_LITERAL;
			case ACTION: return ACTION_LITERAL;
			case FINAL: return FINAL_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StateType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //StateType
