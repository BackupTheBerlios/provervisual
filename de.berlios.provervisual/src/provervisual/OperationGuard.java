/**
 * <copyright>
 * </copyright>
 *
 * $Id: OperationGuard.java,v 1.1 2006/04/23 14:50:50 rustikus Exp $
 */
package provervisual;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link provervisual.OperationGuard#getGuardConstraint <em>Guard Constraint</em>}</li>
 *   <li>{@link provervisual.OperationGuard#getGuardDescription <em>Guard Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see provervisual.ProvervisualPackage#getOperationGuard()
 * @model
 * @generated
 */
public interface OperationGuard extends EObject {
	/**
	 * Returns the value of the '<em><b>Guard Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Constraint</em>' attribute.
	 * @see #setGuardConstraint(String)
	 * @see provervisual.ProvervisualPackage#getOperationGuard_GuardConstraint()
	 * @model
	 * @generated
	 */
	String getGuardConstraint();

	/**
	 * Sets the value of the '{@link provervisual.OperationGuard#getGuardConstraint <em>Guard Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Constraint</em>' attribute.
	 * @see #getGuardConstraint()
	 * @generated
	 */
	void setGuardConstraint(String value);

	/**
	 * Returns the value of the '<em><b>Guard Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Description</em>' attribute.
	 * @see #setGuardDescription(String)
	 * @see provervisual.ProvervisualPackage#getOperationGuard_GuardDescription()
	 * @model
	 * @generated
	 */
	String getGuardDescription();

	/**
	 * Sets the value of the '{@link provervisual.OperationGuard#getGuardDescription <em>Guard Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Description</em>' attribute.
	 * @see #getGuardDescription()
	 * @generated
	 */
	void setGuardDescription(String value);

} // OperationGuard