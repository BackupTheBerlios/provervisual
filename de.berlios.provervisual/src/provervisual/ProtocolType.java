/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProtocolType.java,v 1.2 2006/05/07 22:19:54 rustikus Exp $
 */
package provervisual;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Protocol Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see provervisual.ProvervisualPackage#getProtocolType()
 * @model
 * @generated
 */
public final class ProtocolType extends AbstractEnumerator {
	/**
	 * The '<em><b>COMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Component</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT = 0;

	/**
	 * The '<em><b>INTERACTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interaction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERACTION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERACTION = 1;

	/**
	 * The '<em><b>COMPONENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT
	 * @generated
	 * @ordered
	 */
	public static final ProtocolType COMPONENT_LITERAL = new ProtocolType(COMPONENT, "COMPONENT", "COMPONENT");

	/**
	 * The '<em><b>INTERACTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERACTION
	 * @generated
	 * @ordered
	 */
	public static final ProtocolType INTERACTION_LITERAL = new ProtocolType(INTERACTION, "INTERACTION", "INTERACTION");

	/**
	 * An array of all the '<em><b>Protocol Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProtocolType[] VALUES_ARRAY =
		new ProtocolType[] {
			COMPONENT_LITERAL,
			INTERACTION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Protocol Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Protocol Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProtocolType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtocolType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProtocolType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtocolType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProtocolType get(int value) {
		switch (value) {
			case COMPONENT: return COMPONENT_LITERAL;
			case INTERACTION: return INTERACTION_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProtocolType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ProtocolType
