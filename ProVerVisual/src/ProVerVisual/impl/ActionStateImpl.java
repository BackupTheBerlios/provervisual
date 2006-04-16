/**
 * <copyright>
 * </copyright>
 *
 * $Id: ActionStateImpl.java,v 1.3 2006/04/16 12:08:20 rustikus Exp $
 */
package ProVerVisual.impl;

import ProVerVisual.ActionState;
import ProVerVisual.ProVerVisualPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ProVerVisual.impl.ActionStateImpl#getOperationAbbrev <em>Operation Abbrev</em>}</li>
 *   <li>{@link ProVerVisual.impl.ActionStateImpl#getOperationFullName <em>Operation Full Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionStateImpl extends ElementsImpl implements ActionState {
	/**
	 * The default value of the '{@link #getOperationAbbrev() <em>Operation Abbrev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationAbbrev()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_ABBREV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationAbbrev() <em>Operation Abbrev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationAbbrev()
	 * @generated
	 * @ordered
	 */
	protected String operationAbbrev = OPERATION_ABBREV_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationFullName() <em>Operation Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_FULL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationFullName() <em>Operation Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationFullName()
	 * @generated
	 * @ordered
	 */
	protected String operationFullName = OPERATION_FULL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProVerVisualPackage.Literals.ACTION_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationAbbrev() {
		return operationAbbrev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationAbbrev(String newOperationAbbrev) {
		String oldOperationAbbrev = operationAbbrev;
		operationAbbrev = newOperationAbbrev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProVerVisualPackage.ACTION_STATE__OPERATION_ABBREV, oldOperationAbbrev, operationAbbrev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationFullName() {
		return operationFullName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationFullName(String newOperationFullName) {
		String oldOperationFullName = operationFullName;
		operationFullName = newOperationFullName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProVerVisualPackage.ACTION_STATE__OPERATION_FULL_NAME, oldOperationFullName, operationFullName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProVerVisualPackage.ACTION_STATE__OPERATION_ABBREV:
				return getOperationAbbrev();
			case ProVerVisualPackage.ACTION_STATE__OPERATION_FULL_NAME:
				return getOperationFullName();
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
			case ProVerVisualPackage.ACTION_STATE__OPERATION_ABBREV:
				setOperationAbbrev((String)newValue);
				return;
			case ProVerVisualPackage.ACTION_STATE__OPERATION_FULL_NAME:
				setOperationFullName((String)newValue);
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
			case ProVerVisualPackage.ACTION_STATE__OPERATION_ABBREV:
				setOperationAbbrev(OPERATION_ABBREV_EDEFAULT);
				return;
			case ProVerVisualPackage.ACTION_STATE__OPERATION_FULL_NAME:
				setOperationFullName(OPERATION_FULL_NAME_EDEFAULT);
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
			case ProVerVisualPackage.ACTION_STATE__OPERATION_ABBREV:
				return OPERATION_ABBREV_EDEFAULT == null ? operationAbbrev != null : !OPERATION_ABBREV_EDEFAULT.equals(operationAbbrev);
			case ProVerVisualPackage.ACTION_STATE__OPERATION_FULL_NAME:
				return OPERATION_FULL_NAME_EDEFAULT == null ? operationFullName != null : !OPERATION_FULL_NAME_EDEFAULT.equals(operationFullName);
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
		result.append(" (operationAbbrev: ");
		result.append(operationAbbrev);
		result.append(", operationFullName: ");
		result.append(operationFullName);
		result.append(')');
		return result.toString();
	}

} //ActionStateImpl