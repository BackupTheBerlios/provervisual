/**
 * <copyright>
 * </copyright>
 *
 * $Id: Protocol.java,v 1.3 2006/04/16 12:08:20 rustikus Exp $
 */
package ProVerVisual;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ProVerVisual.Protocol#getName <em>Name</em>}</li>
 *   <li>{@link ProVerVisual.Protocol#getType <em>Type</em>}</li>
 *   <li>{@link ProVerVisual.Protocol#getDescription <em>Description</em>}</li>
 *   <li>{@link ProVerVisual.Protocol#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link ProVerVisual.Protocol#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see ProVerVisual.ProVerVisualPackage#getProtocol()
 * @model
 * @generated
 */
public interface Protocol extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ProVerVisual.ProVerVisualPackage#getProtocol_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ProVerVisual.Protocol#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ProVerVisual.ProtocolType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ProVerVisual.ProtocolType
	 * @see #setType(ProtocolType)
	 * @see ProVerVisual.ProVerVisualPackage#getProtocol_Type()
	 * @model
	 * @generated
	 */
	ProtocolType getType();

	/**
	 * Sets the value of the '{@link ProVerVisual.Protocol#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ProVerVisual.ProtocolType
	 * @see #getType()
	 * @generated
	 */
	void setType(ProtocolType value);

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
	 * @see ProVerVisual.ProVerVisualPackage#getProtocol_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ProVerVisual.Protocol#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ProVerVisual.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see ProVerVisual.ProVerVisualPackage#getProtocol_Transitions()
	 * @model type="ProVerVisual.Transition" containment="true"
	 * @generated
	 */
	EList getTransitions();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ProVerVisual.Elements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see ProVerVisual.ProVerVisualPackage#getProtocol_Elements()
	 * @model type="ProVerVisual.Elements" containment="true"
	 * @generated
	 */
	EList getElements();

} // Protocol