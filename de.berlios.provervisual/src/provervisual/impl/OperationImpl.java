/**
 * <copyright>
 * </copyright>
 *
 * $Id: OperationImpl.java,v 1.3 2006/05/28 12:06:56 rustikus Exp $
 */
package provervisual.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import provervisual.Operation;
import provervisual.OperationParameter;
import provervisual.ProvervisualPackage;
import provervisual.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link provervisual.impl.OperationImpl#getOperationAbbrev <em>Operation Abbrev</em>}</li>
 *   <li>{@link provervisual.impl.OperationImpl#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link provervisual.impl.OperationImpl#getOperationGuard <em>Operation Guard</em>}</li>
 *   <li>{@link provervisual.impl.OperationImpl#getStartState <em>Start State</em>}</li>
 *   <li>{@link provervisual.impl.OperationImpl#getOperationParameter <em>Operation Parameter</em>}</li>
 *   <li>{@link provervisual.impl.OperationImpl#getEndState <em>End State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends EObjectImpl implements Operation {
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
	 * The default value of the '{@link #getOperationName() <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationName() <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName()
	 * @generated
	 * @ordered
	 */
	protected String operationName = OPERATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationGuard() <em>Operation Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_GUARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationGuard() <em>Operation Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationGuard()
	 * @generated
	 * @ordered
	 */
	protected String operationGuard = OPERATION_GUARD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartState() <em>Start State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartState()
	 * @generated
	 * @ordered
	 */
	protected State startState = null;

	/**
	 * The cached value of the '{@link #getOperationParameter() <em>Operation Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationParameter()
	 * @generated
	 * @ordered
	 */
	protected EList operationParameter = null;

	/**
	 * The cached value of the '{@link #getEndState() <em>End State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndState()
	 * @generated
	 * @ordered
	 */
	protected State endState = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProvervisualPackage.Literals.OPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProvervisualPackage.OPERATION__OPERATION_ABBREV, oldOperationAbbrev, operationAbbrev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationName() {
		return operationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationName(String newOperationName) {
		String oldOperationName = operationName;
		operationName = newOperationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvervisualPackage.OPERATION__OPERATION_NAME, oldOperationName, operationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStartState() {
		if (startState != null && startState.eIsProxy()) {
			InternalEObject oldStartState = (InternalEObject)startState;
			startState = (State)eResolveProxy(oldStartState);
			if (startState != oldStartState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProvervisualPackage.OPERATION__START_STATE, oldStartState, startState));
			}
		}
		return startState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetStartState() {
		return startState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartState(State newStartState) {
		State oldStartState = startState;
		startState = newStartState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvervisualPackage.OPERATION__START_STATE, oldStartState, startState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOperationParameter() {
		if (operationParameter == null) {
			operationParameter = new EObjectContainmentEList(OperationParameter.class, this, ProvervisualPackage.OPERATION__OPERATION_PARAMETER);
		}
		return operationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationGuard() {
		return operationGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationGuard(String newOperationGuard) {
		String oldOperationGuard = operationGuard;
		operationGuard = newOperationGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvervisualPackage.OPERATION__OPERATION_GUARD, oldOperationGuard, operationGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getEndState() {
		if (endState != null && endState.eIsProxy()) {
			InternalEObject oldEndState = (InternalEObject)endState;
			endState = (State)eResolveProxy(oldEndState);
			if (endState != oldEndState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProvervisualPackage.OPERATION__END_STATE, oldEndState, endState));
			}
		}
		return endState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetEndState() {
		return endState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndState(State newEndState) {
		State oldEndState = endState;
		endState = newEndState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvervisualPackage.OPERATION__END_STATE, oldEndState, endState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProvervisualPackage.OPERATION__OPERATION_PARAMETER:
				return ((InternalEList)getOperationParameter()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProvervisualPackage.OPERATION__OPERATION_ABBREV:
				return getOperationAbbrev();
			case ProvervisualPackage.OPERATION__OPERATION_NAME:
				return getOperationName();
			case ProvervisualPackage.OPERATION__OPERATION_GUARD:
				return getOperationGuard();
			case ProvervisualPackage.OPERATION__START_STATE:
				if (resolve) return getStartState();
				return basicGetStartState();
			case ProvervisualPackage.OPERATION__OPERATION_PARAMETER:
				return getOperationParameter();
			case ProvervisualPackage.OPERATION__END_STATE:
				if (resolve) return getEndState();
				return basicGetEndState();
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
			case ProvervisualPackage.OPERATION__OPERATION_ABBREV:
				setOperationAbbrev((String)newValue);
				return;
			case ProvervisualPackage.OPERATION__OPERATION_NAME:
				setOperationName((String)newValue);
				return;
			case ProvervisualPackage.OPERATION__OPERATION_GUARD:
				setOperationGuard((String)newValue);
				return;
			case ProvervisualPackage.OPERATION__START_STATE:
				setStartState((State)newValue);
				return;
			case ProvervisualPackage.OPERATION__OPERATION_PARAMETER:
				getOperationParameter().clear();
				getOperationParameter().addAll((Collection)newValue);
				return;
			case ProvervisualPackage.OPERATION__END_STATE:
				setEndState((State)newValue);
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
			case ProvervisualPackage.OPERATION__OPERATION_ABBREV:
				setOperationAbbrev(OPERATION_ABBREV_EDEFAULT);
				return;
			case ProvervisualPackage.OPERATION__OPERATION_NAME:
				setOperationName(OPERATION_NAME_EDEFAULT);
				return;
			case ProvervisualPackage.OPERATION__OPERATION_GUARD:
				setOperationGuard(OPERATION_GUARD_EDEFAULT);
				return;
			case ProvervisualPackage.OPERATION__START_STATE:
				setStartState((State)null);
				return;
			case ProvervisualPackage.OPERATION__OPERATION_PARAMETER:
				getOperationParameter().clear();
				return;
			case ProvervisualPackage.OPERATION__END_STATE:
				setEndState((State)null);
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
			case ProvervisualPackage.OPERATION__OPERATION_ABBREV:
				return OPERATION_ABBREV_EDEFAULT == null ? operationAbbrev != null : !OPERATION_ABBREV_EDEFAULT.equals(operationAbbrev);
			case ProvervisualPackage.OPERATION__OPERATION_NAME:
				return OPERATION_NAME_EDEFAULT == null ? operationName != null : !OPERATION_NAME_EDEFAULT.equals(operationName);
			case ProvervisualPackage.OPERATION__OPERATION_GUARD:
				return OPERATION_GUARD_EDEFAULT == null ? operationGuard != null : !OPERATION_GUARD_EDEFAULT.equals(operationGuard);
			case ProvervisualPackage.OPERATION__START_STATE:
				return startState != null;
			case ProvervisualPackage.OPERATION__OPERATION_PARAMETER:
				return operationParameter != null && !operationParameter.isEmpty();
			case ProvervisualPackage.OPERATION__END_STATE:
				return endState != null;
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
		result.append(", operationName: ");
		result.append(operationName);
		result.append(", operationGuard: ");
		result.append(operationGuard);
		result.append(')');
		return result.toString();
	}

} //OperationImpl