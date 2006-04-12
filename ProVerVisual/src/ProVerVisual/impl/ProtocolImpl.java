/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProtocolImpl.java,v 1.2 2006/04/12 15:03:46 rustikus Exp $
 */
package ProVerVisual.impl;

import ProVerVisual.Branch;
import ProVerVisual.ProVerVisualPackage;
import ProVerVisual.Protocol;
import ProVerVisual.ProtocolType;
import ProVerVisual.State;
import ProVerVisual.Transition;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ProVerVisual.impl.ProtocolImpl#getName <em>Name</em>}</li>
 *   <li>{@link ProVerVisual.impl.ProtocolImpl#getType <em>Type</em>}</li>
 *   <li>{@link ProVerVisual.impl.ProtocolImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ProVerVisual.impl.ProtocolImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link ProVerVisual.impl.ProtocolImpl#getStates <em>States</em>}</li>
 *   <li>{@link ProVerVisual.impl.ProtocolImpl#getBranches <em>Branches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolImpl extends EObjectImpl implements Protocol {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ProtocolType TYPE_EDEFAULT = ProtocolType.COMPONENT_LITERAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ProtocolType type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList transitions = null;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList states = null;

	/**
	 * The cached value of the '{@link #getBranches() <em>Branches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranches()
	 * @generated
	 * @ordered
	 */
	protected EList branches = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProVerVisualPackage.Literals.PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProVerVisualPackage.PROTOCOL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ProtocolType newType) {
		ProtocolType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProVerVisualPackage.PROTOCOL__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProVerVisualPackage.PROTOCOL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList(Transition.class, this, ProVerVisualPackage.PROTOCOL__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStates() {
		if (states == null) {
			states = new EObjectContainmentEList(State.class, this, ProVerVisualPackage.PROTOCOL__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBranches() {
		if (branches == null) {
			branches = new EObjectContainmentEList(Branch.class, this, ProVerVisualPackage.PROTOCOL__BRANCHES);
		}
		return branches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProVerVisualPackage.PROTOCOL__TRANSITIONS:
				return ((InternalEList)getTransitions()).basicRemove(otherEnd, msgs);
			case ProVerVisualPackage.PROTOCOL__STATES:
				return ((InternalEList)getStates()).basicRemove(otherEnd, msgs);
			case ProVerVisualPackage.PROTOCOL__BRANCHES:
				return ((InternalEList)getBranches()).basicRemove(otherEnd, msgs);
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
			case ProVerVisualPackage.PROTOCOL__NAME:
				return getName();
			case ProVerVisualPackage.PROTOCOL__TYPE:
				return getType();
			case ProVerVisualPackage.PROTOCOL__DESCRIPTION:
				return getDescription();
			case ProVerVisualPackage.PROTOCOL__TRANSITIONS:
				return getTransitions();
			case ProVerVisualPackage.PROTOCOL__STATES:
				return getStates();
			case ProVerVisualPackage.PROTOCOL__BRANCHES:
				return getBranches();
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
			case ProVerVisualPackage.PROTOCOL__NAME:
				setName((String)newValue);
				return;
			case ProVerVisualPackage.PROTOCOL__TYPE:
				setType((ProtocolType)newValue);
				return;
			case ProVerVisualPackage.PROTOCOL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProVerVisualPackage.PROTOCOL__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection)newValue);
				return;
			case ProVerVisualPackage.PROTOCOL__STATES:
				getStates().clear();
				getStates().addAll((Collection)newValue);
				return;
			case ProVerVisualPackage.PROTOCOL__BRANCHES:
				getBranches().clear();
				getBranches().addAll((Collection)newValue);
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
			case ProVerVisualPackage.PROTOCOL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProVerVisualPackage.PROTOCOL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ProVerVisualPackage.PROTOCOL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProVerVisualPackage.PROTOCOL__TRANSITIONS:
				getTransitions().clear();
				return;
			case ProVerVisualPackage.PROTOCOL__STATES:
				getStates().clear();
				return;
			case ProVerVisualPackage.PROTOCOL__BRANCHES:
				getBranches().clear();
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
			case ProVerVisualPackage.PROTOCOL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProVerVisualPackage.PROTOCOL__TYPE:
				return type != TYPE_EDEFAULT;
			case ProVerVisualPackage.PROTOCOL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ProVerVisualPackage.PROTOCOL__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case ProVerVisualPackage.PROTOCOL__STATES:
				return states != null && !states.isEmpty();
			case ProVerVisualPackage.PROTOCOL__BRANCHES:
				return branches != null && !branches.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ProtocolImpl