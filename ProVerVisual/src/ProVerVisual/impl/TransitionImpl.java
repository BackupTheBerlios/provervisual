/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransitionImpl.java,v 1.2 2006/04/12 15:03:46 rustikus Exp $
 */
package ProVerVisual.impl;

import ProVerVisual.Branch;
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
 *   <li>{@link ProVerVisual.impl.TransitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ProVerVisual.impl.TransitionImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link ProVerVisual.impl.TransitionImpl#getSourceState <em>Source State</em>}</li>
 *   <li>{@link ProVerVisual.impl.TransitionImpl#getDestinationState <em>Destination State</em>}</li>
 *   <li>{@link ProVerVisual.impl.TransitionImpl#getBranch <em>Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends EObjectImpl implements Transition {
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
	 * The cached value of the '{@link #getSourceState() <em>Source State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceState()
	 * @generated
	 * @ordered
	 */
	protected State sourceState = null;

	/**
	 * The cached value of the '{@link #getDestinationState() <em>Destination State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationState()
	 * @generated
	 * @ordered
	 */
	protected State destinationState = null;

	/**
	 * The cached value of the '{@link #getBranch() <em>Branch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch()
	 * @generated
	 * @ordered
	 */
	protected Branch branch = null;

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
			eNotify(new ENotificationImpl(this, Notification.SET, ProVerVisualPackage.TRANSITION__DESCRIPTION, oldDescription, description));
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
	public State getSourceState() {
		if (sourceState != null && sourceState.eIsProxy()) {
			InternalEObject oldSourceState = (InternalEObject)sourceState;
			sourceState = (State)eResolveProxy(oldSourceState);
			if (sourceState != oldSourceState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProVerVisualPackage.TRANSITION__SOURCE_STATE, oldSourceState, sourceState));
			}
		}
		return sourceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSourceState() {
		return sourceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceState(State newSourceState) {
		State oldSourceState = sourceState;
		sourceState = newSourceState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProVerVisualPackage.TRANSITION__SOURCE_STATE, oldSourceState, sourceState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getDestinationState() {
		if (destinationState != null && destinationState.eIsProxy()) {
			InternalEObject oldDestinationState = (InternalEObject)destinationState;
			destinationState = (State)eResolveProxy(oldDestinationState);
			if (destinationState != oldDestinationState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProVerVisualPackage.TRANSITION__DESTINATION_STATE, oldDestinationState, destinationState));
			}
		}
		return destinationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetDestinationState() {
		return destinationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationState(State newDestinationState) {
		State oldDestinationState = destinationState;
		destinationState = newDestinationState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProVerVisualPackage.TRANSITION__DESTINATION_STATE, oldDestinationState, destinationState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch getBranch() {
		if (branch != null && branch.eIsProxy()) {
			InternalEObject oldBranch = (InternalEObject)branch;
			branch = (Branch)eResolveProxy(oldBranch);
			if (branch != oldBranch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProVerVisualPackage.TRANSITION__BRANCH, oldBranch, branch));
			}
		}
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch basicGetBranch() {
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranch(Branch newBranch) {
		Branch oldBranch = branch;
		branch = newBranch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProVerVisualPackage.TRANSITION__BRANCH, oldBranch, branch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProVerVisualPackage.TRANSITION__DESCRIPTION:
				return getDescription();
			case ProVerVisualPackage.TRANSITION__CONSTRAINT:
				return getConstraint();
			case ProVerVisualPackage.TRANSITION__SOURCE_STATE:
				if (resolve) return getSourceState();
				return basicGetSourceState();
			case ProVerVisualPackage.TRANSITION__DESTINATION_STATE:
				if (resolve) return getDestinationState();
				return basicGetDestinationState();
			case ProVerVisualPackage.TRANSITION__BRANCH:
				if (resolve) return getBranch();
				return basicGetBranch();
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
			case ProVerVisualPackage.TRANSITION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProVerVisualPackage.TRANSITION__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case ProVerVisualPackage.TRANSITION__SOURCE_STATE:
				setSourceState((State)newValue);
				return;
			case ProVerVisualPackage.TRANSITION__DESTINATION_STATE:
				setDestinationState((State)newValue);
				return;
			case ProVerVisualPackage.TRANSITION__BRANCH:
				setBranch((Branch)newValue);
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
			case ProVerVisualPackage.TRANSITION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProVerVisualPackage.TRANSITION__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case ProVerVisualPackage.TRANSITION__SOURCE_STATE:
				setSourceState((State)null);
				return;
			case ProVerVisualPackage.TRANSITION__DESTINATION_STATE:
				setDestinationState((State)null);
				return;
			case ProVerVisualPackage.TRANSITION__BRANCH:
				setBranch((Branch)null);
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
			case ProVerVisualPackage.TRANSITION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ProVerVisualPackage.TRANSITION__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? constraint != null : !CONSTRAINT_EDEFAULT.equals(constraint);
			case ProVerVisualPackage.TRANSITION__SOURCE_STATE:
				return sourceState != null;
			case ProVerVisualPackage.TRANSITION__DESTINATION_STATE:
				return destinationState != null;
			case ProVerVisualPackage.TRANSITION__BRANCH:
				return branch != null;
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
		result.append(" (description: ");
		result.append(description);
		result.append(", constraint: ");
		result.append(constraint);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl