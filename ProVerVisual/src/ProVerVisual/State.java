/**
 * <copyright>
 * </copyright>
 *
 * $Id: State.java,v 1.2 2006/04/12 15:03:46 rustikus Exp $
 */
package ProVerVisual;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ProVerVisual.State#getType <em>Type</em>}</li>
 *   <li>{@link ProVerVisual.State#getDescription <em>Description</em>}</li>
 *   <li>{@link ProVerVisual.State#getOperationAbbrev <em>Operation Abbrev</em>}</li>
 *   <li>{@link ProVerVisual.State#getOperationFullName <em>Operation Full Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ProVerVisual.ProVerVisualPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ProVerVisual.StateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ProVerVisual.StateType
	 * @see #setType(StateType)
	 * @see ProVerVisual.ProVerVisualPackage#getState_Type()
	 * @model
	 * @generated
	 */
	StateType getType();

	/**
	 * Sets the value of the '{@link ProVerVisual.State#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ProVerVisual.StateType
	 * @see #getType()
	 * @generated
	 */
	void setType(StateType value);

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
	 * @see ProVerVisual.ProVerVisualPackage#getState_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ProVerVisual.State#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Operation Abbrev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Abbrev</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Abbrev</em>' attribute.
	 * @see #setOperationAbbrev(String)
	 * @see ProVerVisual.ProVerVisualPackage#getState_OperationAbbrev()
	 * @model
	 * @generated
	 */
	String getOperationAbbrev();

	/**
	 * Sets the value of the '{@link ProVerVisual.State#getOperationAbbrev <em>Operation Abbrev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Abbrev</em>' attribute.
	 * @see #getOperationAbbrev()
	 * @generated
	 */
	void setOperationAbbrev(String value);

	/**
	 * Returns the value of the '<em><b>Operation Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Full Name</em>' attribute.
	 * @see #setOperationFullName(String)
	 * @see ProVerVisual.ProVerVisualPackage#getState_OperationFullName()
	 * @model
	 * @generated
	 */
	String getOperationFullName();

	/**
	 * Sets the value of the '{@link ProVerVisual.State#getOperationFullName <em>Operation Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Full Name</em>' attribute.
	 * @see #getOperationFullName()
	 * @generated
	 */
	void setOperationFullName(String value);

} // State