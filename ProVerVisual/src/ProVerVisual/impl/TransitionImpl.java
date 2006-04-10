/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransitionImpl.java,v 1.1 2006/04/10 06:02:39 rustikus Exp $
 */
package ProVerVisual.impl;

import ProVerVisual.ProVerVisualPackage;
import ProVerVisual.State;
import ProVerVisual.Transition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ProVerVisual.impl.TransitionImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link ProVerVisual.impl.TransitionImpl#getStateSource <em>State Source</em>}</li>
 *   <li>{@link ProVerVisual.impl.TransitionImpl#getStateTarget <em>State Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends EObjectImpl implements Transition {
	/**
	 * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected String constraint = CONSTRAINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStateSource() <em>State Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateSource()
	 * @generated
	 * @ordered
	 */
	protected State stateSource = null;

	/**
	 * The cached value of the '{@link #getStateTarget() <em>State Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateTarget()
	 * @generated
	 * @ordered
	 */
	protected State stateTarget = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProVerVisualPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(String newConstraint) {
		String oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProVerVisualPackage.TRANSITION__CONSTRAINT, oldConstraint, constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStateSource() {
		if (stateSource != null && stateSource.eIsProxy()) {
			InternalEObject oldStateSource = (InternalEObject)stateSource;
			stateSource = (State)eResolveProxy(oldStateSource);
			if (stateSource != oldStateSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProVerVisualPackage.TRANSITION__STATE_SOURCE, oldStateSource, stateSource));
			}
		}
		return stateSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetStateSource() {
		return stateSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateSource(State newStateSource) {
		State oldStateSource = stateSource;
		stateSource = newStateSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProVerVisualPackage.TRANSITION__STATE_SOURCE, oldStateSource, stateSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStateTarget() {
		if (stateTarget != null && stateTarget.eIsProxy()) {
			InternalEObject oldStateTarget = (InternalEObject)stateTarget;
			stateTarget = (State)eResolveProxy(oldStateTarget);
			if (stateTarget != oldStateTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProVerVisualPackage.TRANSITION__STATE_TARGET, oldStateTarget, stateTarget));
			}
		}
		return stateTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetStateTarget() {
		return stateTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateTarget(State newStateTarget) {
		State oldStateTarget = stateTarget;
		stateTarget = newStateTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProVerVisualPackage.TRANSITION__STATE_TARGET, oldStateTarget, stateTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProVerVisualPackage.TRANSITION__CONSTRAINT:
				return getConstraint();
			case ProVerVisualPackage.TRANSITION__STATE_SOURCE:
				if (resolve) return getStateSource();
				return basicGetStateSource();
			case ProVerVisualPackage.TRANSITION__STATE_TARGET:
				if (resolve) return getStateTarget();
				return basicGetStateTarget();
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
			case ProVerVisualPackage.TRANSITION__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case ProVerVisualPackage.TRANSITION__STATE_SOURCE:
				setStateSource((State)newValue);
				return;
			case ProVerVisualPackage.TRANSITION__STATE_TARGET:
				setStateTarget((State)newValue);
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
			case ProVerVisualPackage.TRANSITION__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case ProVerVisualPackage.TRANSITION__STATE_SOURCE:
				setStateSource((State)null);
				return;
			case ProVerVisualPackage.TRANSITION__STATE_TARGET:
				setStateTarget((State)null);
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
			case ProVerVisualPackage.TRANSITION__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? constraint != null : !CONSTRAINT_EDEFAULT.equals(constraint);
			case ProVerVisualPackage.TRANSITION__STATE_SOURCE:
				return stateSource != null;
			case ProVerVisualPackage.TRANSITION__STATE_TARGET:
				return stateTarget != null;
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
		result.append(" (constraint: ");
		result.append(constraint);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl