/**
 * <copyright>
 * </copyright>
 *
 * $Id: Protocol.java,v 1.1 2006/04/10 06:02:39 rustikus Exp $
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
 *   <li>{@link ProVerVisual.Protocol#getProtocolState <em>Protocol State</em>}</li>
 *   <li>{@link ProVerVisual.Protocol#getProtocolTransition <em>Protocol Transition</em>}</li>
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
	 * Returns the value of the '<em><b>Protocol State</b></em>' containment reference list.
	 * The list contents are of type {@link ProVerVisual.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol State</em>' containment reference list.
	 * @see ProVerVisual.ProVerVisualPackage#getProtocol_ProtocolState()
	 * @model type="ProVerVisual.State" containment="true"
	 * @generated
	 */
	EList getProtocolState();

	/**
	 * Returns the value of the '<em><b>Protocol Transition</b></em>' containment reference list.
	 * The list contents are of type {@link ProVerVisual.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Transition</em>' containment reference list.
	 * @see ProVerVisual.ProVerVisualPackage#getProtocol_ProtocolTransition()
	 * @model type="ProVerVisual.Transition" containment="true"
	 * @generated
	 */
	EList getProtocolTransition();

} // Protocol