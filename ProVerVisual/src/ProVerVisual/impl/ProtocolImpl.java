/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProtocolImpl.java,v 1.1 2006/04/10 06:02:39 rustikus Exp $
 */
package ProVerVisual.impl;

import ProVerVisual.ProVerVisualPackage;
import ProVerVisual.Protocol;
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
 *   <li>{@link ProVerVisual.impl.ProtocolImpl#getProtocolState <em>Protocol State</em>}</li>
 *   <li>{@link ProVerVisual.impl.ProtocolImpl#getProtocolTransition <em>Protocol Transition</em>}</li>
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
	 * The cached value of the '{@link #getProtocolState() <em>Protocol State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolState()
	 * @generated
	 * @ordered
	 */
	protected EList protocolState = null;

	/**
	 * The cached value of the '{@link #getProtocolTransition() <em>Protocol Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolTransition()
	 * @generated
	 * @ordered
	 */
	protected EList protocolTransition = null;

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
	public EList getProtocolState() {
		if (protocolState == null) {
			protocolState = new EObjectContainmentEList(State.class, this, ProVerVisualPackage.PROTOCOL__PROTOCOL_STATE);
		}
		return protocolState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProtocolTransition() {
		if (protocolTransition == null) {
			protocolTransition = new EObjectContainmentEList(Transition.class, this, ProVerVisualPackage.PROTOCOL__PROTOCOL_TRANSITION);
		}
		return protocolTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProVerVisualPackage.PROTOCOL__PROTOCOL_STATE:
				return ((InternalEList)getProtocolState()).basicRemove(otherEnd, msgs);
			case ProVerVisualPackage.PROTOCOL__PROTOCOL_TRANSITION:
				return ((InternalEList)getProtocolTransition()).basicRemove(otherEnd, msgs);
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
			case ProVerVisualPackage.PROTOCOL__PROTOCOL_STATE:
				return getProtocolState();
			case ProVerVisualPackage.PROTOCOL__PROTOCOL_TRANSITION:
				return getProtocolTransition();
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
			case ProVerVisualPackage.PROTOCOL__PROTOCOL_STATE:
				getProtocolState().clear();
				getProtocolState().addAll((Collection)newValue);
				return;
			case ProVerVisualPackage.PROTOCOL__PROTOCOL_TRANSITION:
				getProtocolTransition().clear();
				getProtocolTransition().addAll((Collection)newValue);
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
			case ProVerVisualPackage.PROTOCOL__PROTOCOL_STATE:
				getProtocolState().clear();
				return;
			case ProVerVisualPackage.PROTOCOL__PROTOCOL_TRANSITION:
				getProtocolTransition().clear();
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
			case ProVerVisualPackage.PROTOCOL__PROTOCOL_STATE:
				return protocolState != null && !protocolState.isEmpty();
			case ProVerVisualPackage.PROTOCOL__PROTOCOL_TRANSITION:
				return protocolTransition != null && !protocolTransition.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProtocolImpl