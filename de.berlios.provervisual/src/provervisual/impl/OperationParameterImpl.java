/**
 * <copyright>
 * </copyright>
 *
 * $Id: OperationParameterImpl.java,v 1.1 2006/04/23 14:50:50 rustikus Exp $
 */
package provervisual.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import provervisual.OperationParameter;
import provervisual.ProvervisualPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link provervisual.impl.OperationParameterImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link provervisual.impl.OperationParameterImpl#getParameterAbbrev <em>Parameter Abbrev</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationParameterImpl extends EObjectImpl implements OperationParameter {
	/**
	 * The default value of the '{@link #getParameterType() <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected String parameterType = PARAMETER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterAbbrev() <em>Parameter Abbrev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterAbbrev()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_ABBREV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterAbbrev() <em>Parameter Abbrev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterAbbrev()
	 * @generated
	 * @ordered
	 */
	protected String parameterAbbrev = PARAMETER_ABBREV_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProvervisualPackage.Literals.OPERATION_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterType() {
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterType(String newParameterType) {
		String oldParameterType = parameterType;
		parameterType = newParameterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvervisualPackage.OPERATION_PARAMETER__PARAMETER_TYPE, oldParameterType, parameterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterAbbrev() {
		return parameterAbbrev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterAbbrev(String newParameterAbbrev) {
		String oldParameterAbbrev = parameterAbbrev;
		parameterAbbrev = newParameterAbbrev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvervisualPackage.OPERATION_PARAMETER__PARAMETER_ABBREV, oldParameterAbbrev, parameterAbbrev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProvervisualPackage.OPERATION_PARAMETER__PARAMETER_TYPE:
				return getParameterType();
			case ProvervisualPackage.OPERATION_PARAMETER__PARAMETER_ABBREV:
				return getParameterAbbrev();
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
			case ProvervisualPackage.OPERATION_PARAMETER__PARAMETER_TYPE:
				setParameterType((String)newValue);
				return;
			case ProvervisualPackage.OPERATION_PARAMETER__PARAMETER_ABBREV:
				setParameterAbbrev((String)newValue);
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
			case ProvervisualPackage.OPERATION_PARAMETER__PARAMETER_TYPE:
				setParameterType(PARAMETER_TYPE_EDEFAULT);
				return;
			case ProvervisualPackage.OPERATION_PARAMETER__PARAMETER_ABBREV:
				setParameterAbbrev(PARAMETER_ABBREV_EDEFAULT);
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
			case ProvervisualPackage.OPERATION_PARAMETER__PARAMETER_TYPE:
				return PARAMETER_TYPE_EDEFAULT == null ? parameterType != null : !PARAMETER_TYPE_EDEFAULT.equals(parameterType);
			case ProvervisualPackage.OPERATION_PARAMETER__PARAMETER_ABBREV:
				return PARAMETER_ABBREV_EDEFAULT == null ? parameterAbbrev != null : !PARAMETER_ABBREV_EDEFAULT.equals(parameterAbbrev);
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
		result.append(" (parameterType: ");
		result.append(parameterType);
		result.append(", parameterAbbrev: ");
		result.append(parameterAbbrev);
		result.append(')');
		return result.toString();
	}

} //OperationParameterImpl