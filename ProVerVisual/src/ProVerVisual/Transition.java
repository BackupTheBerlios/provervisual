/**
 * <copyright>
 * </copyright>
 *
 * $Id: Transition.java,v 1.2 2006/04/12 15:03:45 rustikus Exp $
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
 *   <li>{@link ProVerVisual.Transition#getDescription <em>Description</em>}</li>
 *   <li>{@link ProVerVisual.Transition#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link ProVerVisual.Transition#getSourceState <em>Source State</em>}</li>
 *   <li>{@link ProVerVisual.Transition#getDestinationState <em>Destination State</em>}</li>
 *   <li>{@link ProVerVisual.Transition#getBranch <em>Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see ProVerVisual.ProVerVisualPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ProVerVisual.ProVerVisualPackage#getTransition_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ProVerVisual.Transition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * Returns the value of the '<em><b>Source State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source State</em>' reference.
	 * @see #setSourceState(State)
	 * @see ProVerVisual.ProVerVisualPackage#getTransition_SourceState()
	 * @model required="true"
	 * @generated
	 */
	State getSourceState();

	/**
	 * Sets the value of the '{@link ProVerVisual.Transition#getSourceState <em>Source State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source State</em>' reference.
	 * @see #getSourceState()
	 * @generated
	 */
	void setSourceState(State value);

	/**
	 * Returns the value of the '<em><b>Destination State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination State</em>' reference.
	 * @see #setDestinationState(State)
	 * @see ProVerVisual.ProVerVisualPackage#getTransition_DestinationState()
	 * @model required="true"
	 * @generated
	 */
	State getDestinationState();

	/**
	 * Sets the value of the '{@link ProVerVisual.Transition#getDestinationState <em>Destination State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination State</em>' reference.
	 * @see #getDestinationState()
	 * @generated
	 */
	void setDestinationState(State value);

	/**
	 * Returns the value of the '<em><b>Branch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' reference.
	 * @see #setBranch(Branch)
	 * @see ProVerVisual.ProVerVisualPackage#getTransition_Branch()
	 * @model required="true"
	 * @generated
	 */
	Branch getBranch();

	/**
	 * Sets the value of the '{@link ProVerVisual.Transition#getBranch <em>Branch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch</em>' reference.
	 * @see #getBranch()
	 * @generated
	 */
	void setBranch(Branch value);

} // Transition