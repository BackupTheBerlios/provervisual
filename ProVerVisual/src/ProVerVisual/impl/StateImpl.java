/**
 * <copyright>
 * </copyright>
 *
 * $Id: StateImpl.java,v 1.2 2006/04/12 15:03:46 rustikus Exp $
 */
package ProVerVisual.impl;

import ProVerVisual.ProVerVisualPackage;
import ProVerVisual.State;

import ProVerVisual.StateType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ProVerVisual.impl.StateImpl#getType <em>Type</em>}</li>
 *   <li>{@link ProVerVisual.impl.StateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ProVerVisual.impl.StateImpl#getOperationAbbrev <em>Operation Abbrev</em>}</li>
 *   <li>{@link ProVerVisual.impl.StateImpl#getOperationFullName <em>Operation Full Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends EObjectImpl implements State {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final StateType TYPE_EDEFAULT = StateType.INITIAL_LITERAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected StateType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProVerVisualPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(StateType newType) {
		StateType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProVerVisualPackage.STATE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProVerVisualPackage.STATE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProVerVisualPackage.STATE__OPERATION_ABBREV, oldOperationAbbrev, operationAbbrev));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProVerVisualPackage.STATE__OPERATION_FULL_NAME, oldOperationFullName, operationFullName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProVerVisualPackage.STATE__TYPE:
				return getType();
			case ProVerVisualPackage.STATE__DESCRIPTION:
				return getDescription();
			case ProVerVisualPackage.STATE__OPERATION_ABBREV:
				return getOperationAbbrev();
			case ProVerVisualPackage.STATE__OPERATION_FULL_NAME:
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
			case ProVerVisualPackage.STATE__TYPE:
				setType((StateType)newValue);
				return;
			case ProVerVisualPackage.STATE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProVerVisualPackage.STATE__OPERATION_ABBREV:
				setOperationAbbrev((String)newValue);
				return;
			case ProVerVisualPackage.STATE__OPERATION_FULL_NAME:
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
			case ProVerVisualPackage.STATE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ProVerVisualPackage.STATE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProVerVisualPackage.STATE__OPERATION_ABBREV:
				setOperationAbbrev(OPERATION_ABBREV_EDEFAULT);
				return;
			case ProVerVisualPackage.STATE__OPERATION_FULL_NAME:
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
			case ProVerVisualPackage.STATE__TYPE:
				return type != TYPE_EDEFAULT;
			case ProVerVisualPackage.STATE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ProVerVisualPackage.STATE__OPERATION_ABBREV:
				return OPERATION_ABBREV_EDEFAULT == null ? operationAbbrev != null : !OPERATION_ABBREV_EDEFAULT.equals(operationAbbrev);
			case ProVerVisualPackage.STATE__OPERATION_FULL_NAME:
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
		result.append(" (type: ");
		result.append(type);
		result.append(", description: ");
		result.append(description);
		result.append(", operationAbbrev: ");
		result.append(operationAbbrev);
		result.append(", operationFullName: ");
		result.append(operationFullName);
		result.append(')');
		return result.toString();
	}

} //StateImpl