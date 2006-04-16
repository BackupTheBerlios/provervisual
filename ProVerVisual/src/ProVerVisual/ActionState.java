/**
 * <copyright>
 * </copyright>
 *
 * $Id: ActionState.java,v 1.3 2006/04/16 12:08:19 rustikus Exp $
 */
package ProVerVisual;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ProVerVisual.ActionState#getOperationAbbrev <em>Operation Abbrev</em>}</li>
 *   <li>{@link ProVerVisual.ActionState#getOperationFullName <em>Operation Full Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ProVerVisual.ProVerVisualPackage#getActionState()
 * @model
 * @generated
 */
public interface ActionState extends Elements {
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
	 * @see ProVerVisual.ProVerVisualPackage#getActionState_OperationAbbrev()
	 * @model
	 * @generated
	 */
	String getOperationAbbrev();

	/**
	 * Sets the value of the '{@link ProVerVisual.ActionState#getOperationAbbrev <em>Operation Abbrev</em>}' attribute.
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
	 * @see ProVerVisual.ProVerVisualPackage#getActionState_OperationFullName()
	 * @model
	 * @generated
	 */
	String getOperationFullName();

	/**
	 * Sets the value of the '{@link ProVerVisual.ActionState#getOperationFullName <em>Operation Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Full Name</em>' attribute.
	 * @see #getOperationFullName()
	 * @generated
	 */
	void setOperationFullName(String value);

} // ActionState