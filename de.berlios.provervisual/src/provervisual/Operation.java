/**
 * <copyright>
 * </copyright>
 *
 * $Id: Operation.java,v 1.2 2006/05/19 19:27:57 rustikus Exp $
 */
package provervisual;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link provervisual.Operation#getOperationAbbrev <em>Operation Abbrev</em>}</li>
 *   <li>{@link provervisual.Operation#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link provervisual.Operation#getOperationGuard <em>Operation Guard</em>}</li>
 *   <li>{@link provervisual.Operation#getStartState <em>Start State</em>}</li>
 *   <li>{@link provervisual.Operation#getOperationParameter <em>Operation Parameter</em>}</li>
 *   <li>{@link provervisual.Operation#getEndState <em>End State</em>}</li>
 * </ul>
 * </p>
 *
 * @see provervisual.ProvervisualPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
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
	 * @see provervisual.ProvervisualPackage#getOperation_OperationAbbrev()
	 * @model
	 * @generated
	 */
	String getOperationAbbrev();

	/**
	 * Sets the value of the '{@link provervisual.Operation#getOperationAbbrev <em>Operation Abbrev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Abbrev</em>' attribute.
	 * @see #getOperationAbbrev()
	 * @generated
	 */
	void setOperationAbbrev(String value);

	/**
	 * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Name</em>' attribute.
	 * @see #setOperationName(String)
	 * @see provervisual.ProvervisualPackage#getOperation_OperationName()
	 * @model
	 * @generated
	 */
	String getOperationName();

	/**
	 * Sets the value of the '{@link provervisual.Operation#getOperationName <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name</em>' attribute.
	 * @see #getOperationName()
	 * @generated
	 */
	void setOperationName(String value);

	/**
	 * Returns the value of the '<em><b>Start State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start State</em>' reference.
	 * @see #setStartState(State)
	 * @see provervisual.ProvervisualPackage#getOperation_StartState()
	 * @model required="true"
	 * @generated
	 */
	State getStartState();

	/**
	 * Sets the value of the '{@link provervisual.Operation#getStartState <em>Start State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start State</em>' reference.
	 * @see #getStartState()
	 * @generated
	 */
	void setStartState(State value);

	/**
	 * Returns the value of the '<em><b>Operation Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link provervisual.OperationParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Parameter</em>' containment reference list.
	 * @see provervisual.ProvervisualPackage#getOperation_OperationParameter()
	 * @model type="provervisual.OperationParameter" containment="true"
	 * @generated
	 */
	EList getOperationParameter();

	/**
	 * Returns the value of the '<em><b>Operation Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Guard</em>' attribute.
	 * @see #setOperationGuard(String)
	 * @see provervisual.ProvervisualPackage#getOperation_OperationGuard()
	 * @model
	 * @generated
	 */
	String getOperationGuard();

	/**
	 * Sets the value of the '{@link provervisual.Operation#getOperationGuard <em>Operation Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Guard</em>' attribute.
	 * @see #getOperationGuard()
	 * @generated
	 */
	void setOperationGuard(String value);

	/**
	 * Returns the value of the '<em><b>End State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End State</em>' reference.
	 * @see #setEndState(State)
	 * @see provervisual.ProvervisualPackage#getOperation_EndState()
	 * @model required="true"
	 * @generated
	 */
	State getEndState();

	/**
	 * Sets the value of the '{@link provervisual.Operation#getEndState <em>End State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End State</em>' reference.
	 * @see #getEndState()
	 * @generated
	 */
	void setEndState(State value);

} // Operation