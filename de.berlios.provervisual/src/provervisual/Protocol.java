/**
 * <copyright>
 * </copyright>
 *
 * $Id: Protocol.java,v 1.1 2006/04/23 14:50:50 rustikus Exp $
 */
package provervisual;

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
 *   <li>{@link provervisual.Protocol#getName <em>Name</em>}</li>
 *   <li>{@link provervisual.Protocol#getDescription <em>Description</em>}</li>
 *   <li>{@link provervisual.Protocol#getType <em>Type</em>}</li>
 *   <li>{@link provervisual.Protocol#getOperations <em>Operations</em>}</li>
 *   <li>{@link provervisual.Protocol#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see provervisual.ProvervisualPackage#getProtocol()
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
	 * @see provervisual.ProvervisualPackage#getProtocol_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link provervisual.Protocol#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see provervisual.ProvervisualPackage#getProtocol_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link provervisual.Protocol#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link provervisual.ProtocolType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see provervisual.ProtocolType
	 * @see #setType(ProtocolType)
	 * @see provervisual.ProvervisualPackage#getProtocol_Type()
	 * @model
	 * @generated
	 */
	ProtocolType getType();

	/**
	 * Sets the value of the '{@link provervisual.Protocol#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see provervisual.ProtocolType
	 * @see #getType()
	 * @generated
	 */
	void setType(ProtocolType value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link provervisual.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see provervisual.ProvervisualPackage#getProtocol_Operations()
	 * @model type="provervisual.Operation" containment="true"
	 * @generated
	 */
	EList getOperations();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link provervisual.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see provervisual.ProvervisualPackage#getProtocol_States()
	 * @model type="provervisual.State" containment="true"
	 * @generated
	 */
	EList getStates();

} // Protocol