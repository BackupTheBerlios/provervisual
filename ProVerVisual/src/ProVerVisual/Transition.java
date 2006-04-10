/**
 * <copyright>
 * </copyright>
 *
 * $Id: Transition.java,v 1.1 2006/04/10 06:02:39 rustikus Exp $
 */
package ProVerVisual;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ProVerVisual.Transition#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link ProVerVisual.Transition#getStateSource <em>State Source</em>}</li>
 *   <li>{@link ProVerVisual.Transition#getStateTarget <em>State Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see ProVerVisual.ProVerVisualPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' attribute.
	 * @see #setConstraint(String)
	 * @see ProVerVisual.ProVerVisualPackage#getTransition_Constraint()
	 * @model
	 * @generated
	 */
	String getConstraint();

	/**
	 * Sets the value of the '{@link ProVerVisual.Transition#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(String value);

	/**
	 * Returns the value of the '<em><b>State Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Source</em>' reference.
	 * @see #setStateSource(State)
	 * @see ProVerVisual.ProVerVisualPackage#getTransition_StateSource()
	 * @model required="true"
	 * @generated
	 */
	State getStateSource();

	/**
	 * Sets the value of the '{@link ProVerVisual.Transition#getStateSource <em>State Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Source</em>' reference.
	 * @see #getStateSource()
	 * @generated
	 */
	void setStateSource(State value);

	/**
	 * Returns the value of the '<em><b>State Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Target</em>' reference.
	 * @see #setStateTarget(State)
	 * @see ProVerVisual.ProVerVisualPackage#getTransition_StateTarget()
	 * @model required="true"
	 * @generated
	 */
	State getStateTarget();

	/**
	 * Sets the value of the '{@link ProVerVisual.Transition#getStateTarget <em>State Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Target</em>' reference.
	 * @see #getStateTarget()
	 * @generated
	 */
	void setStateTarget(State value);

} // Transition