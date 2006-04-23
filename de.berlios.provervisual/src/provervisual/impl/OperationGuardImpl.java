/**
 * <copyright>
 * </copyright>
 *
 * $Id: OperationGuardImpl.java,v 1.1 2006/04/23 14:50:50 rustikus Exp $
 */
package provervisual.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import provervisual.OperationGuard;
import provervisual.ProvervisualPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link provervisual.impl.OperationGuardImpl#getGuardConstraint <em>Guard Constraint</em>}</li>
 *   <li>{@link provervisual.impl.OperationGuardImpl#getGuardDescription <em>Guard Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationGuardImpl extends EObjectImpl implements OperationGuard {
	/**
	 * The default value of the '{@link #getGuardConstraint() <em>Guard Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_CONSTRAINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardConstraint() <em>Guard Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardConstraint()
	 * @generated
	 * @ordered
	 */
	protected String guardConstraint = GUARD_CONSTRAINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardDescription() <em>Guard Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardDescription() <em>Guard Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardDescription()
	 * @generated
	 * @ordered
	 */
	protected String guardDescription = GUARD_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationGuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProvervisualPackage.Literals.OPERATION_GUARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardConstraint() {
		return guardConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardConstraint(String newGuardConstraint) {
		String oldGuardConstraint = guardConstraint;
		guardConstraint = newGuardConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvervisualPackage.OPERATION_GUARD__GUARD_CONSTRAINT, oldGuardConstraint, guardConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardDescription() {
		return guardDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardDescription(String newGuardDescription) {
		String oldGuardDescription = guardDescription;
		guardDescription = newGuardDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvervisualPackage.OPERATION_GUARD__GUARD_DESCRIPTION, oldGuardDescription, guardDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProvervisualPackage.OPERATION_GUARD__GUARD_CONSTRAINT:
				return getGuardConstraint();
			case ProvervisualPackage.OPERATION_GUARD__GUARD_DESCRIPTION:
				return getGuardDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProvervisualPackage.OPERATION_GUARD__GUARD_CONSTRAINT:
				setGuardConstraint((String)newValue);
				return;
			case ProvervisualPackage.OPERATION_GUARD__GUARD_DESCRIPTION:
				setGuardDescription((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProvervisualPackage.OPERATION_GUARD__GUARD_CONSTRAINT:
				setGuardConstraint(GUARD_CONSTRAINT_EDEFAULT);
				return;
			case ProvervisualPackage.OPERATION_GUARD__GUARD_DESCRIPTION:
				setGuardDescription(GUARD_DESCRIPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProvervisualPackage.OPERATION_GUARD__GUARD_CONSTRAINT:
				return GUARD_CONSTRAINT_EDEFAULT == null ? guardConstraint != null : !GUARD_CONSTRAINT_EDEFAULT.equals(guardConstraint);
			case ProvervisualPackage.OPERATION_GUARD__GUARD_DESCRIPTION:
				return GUARD_DESCRIPTION_EDEFAULT == null ? guardDescription != null : !GUARD_DESCRIPTION_EDEFAULT.equals(guardDescription);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (guardConstraint: ");
		result.append(guardConstraint);
		result.append(", guardDescription: ");
		result.append(guardDescription);
		result.append(')');
		return result.toString();
	}

} //OperationGuardImpl