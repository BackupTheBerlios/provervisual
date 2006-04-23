/**
 * <copyright>
 * </copyright>
 *
 * $Id: State.java,v 1.1 2006/04/23 14:50:50 rustikus Exp $
 */
package provervisual;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link provervisual.State#getStateDescription <em>State Description</em>}</li>
 *   <li>{@link provervisual.State#getNumber <em>Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see provervisual.ProvervisualPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>State Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Description</em>' attribute.
	 * @see #setStateDescription(String)
	 * @see provervisual.ProvervisualPackage#getState_StateDescription()
	 * @model
	 * @generated
	 */
	String getStateDescription();

	/**
	 * Sets the value of the '{@link provervisual.State#getStateDescription <em>State Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Description</em>' attribute.
	 * @see #getStateDescription()
	 * @generated
	 */
	void setStateDescription(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see provervisual.ProvervisualPackage#getState_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link provervisual.State#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

} // State