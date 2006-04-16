/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransitionImpl.java,v 1.3 2006/04/16 12:08:20 rustikus Exp $
 */
package ProVerVisual.impl;

import ProVerVisual.Elements;
import ProVerVisual.ProVerVisualPackage;
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
 *   <li>{@link ProVerVisual.impl.TransitionImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link ProVerVisual.impl.TransitionImpl#getDestinationElement <em>Destination Element</em>}</li>
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
	 * The cached value of the '{@link #getSourceElement() <em>Source Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected Elements sourceElement = null;

	/**
	 * The cached value of the '{@link #getDestinationElement() <em>Destination Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationElement()
	 * @generated
	 * @ordered
	 */
	protected Elements destinationElement = null;

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
	public Elements getSourceElement() {
		if (sourceElement != null && sourceElement.eIsProxy()) {
			InternalEObject oldSourceElement = (InternalEObject)sourceElement;
			sourceElement = (Elements)eResolveProxy(oldSourceElement);
			if (sourceElement != oldSourceElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProVerVisualPackage.TRANSITION__SOURCE_ELEMENT, oldSourceElement, sourceElement));
			}
		}
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elements basicGetSourceElement() {
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceElement(Elements newSourceElement) {
		Elements oldSourceElement = sourceElement;
		sourceElement = newSourceElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProVerVisualPackage.TRANSITION__SOURCE_ELEMENT, oldSourceElement, sourceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elements getDestinationElement() {
		if (destinationElement != null && destinationElement.eIsProxy()) {
			InternalEObject oldDestinationElement = (InternalEObject)destinationElement;
			destinationElement = (Elements)eResolveProxy(oldDestinationElement);
			if (destinationElement != oldDestinationElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProVerVisualPackage.TRANSITION__DESTINATION_ELEMENT, oldDestinationElement, destinationElement));
			}
		}
		return destinationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elements basicGetDestinationElement() {
		return destinationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationElement(Elements newDestinationElement) {
		Elements oldDestinationElement = destinationElement;
		destinationElement = newDestinationElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProVerVisualPackage.TRANSITION__DESTINATION_ELEMENT, oldDestinationElement, destinationElement));
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
			case ProVerVisualPackage.TRANSITION__SOURCE_ELEMENT:
				if (resolve) return getSourceElement();
				return basicGetSourceElement();
			case ProVerVisualPackage.TRANSITION__DESTINATION_ELEMENT:
				if (resolve) return getDestinationElement();
				return basicGetDestinationElement();
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
			case ProVerVisualPackage.TRANSITION__SOURCE_ELEMENT:
				setSourceElement((Elements)newValue);
				return;
			case ProVerVisualPackage.TRANSITION__DESTINATION_ELEMENT:
				setDestinationElement((Elements)newValue);
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
			case ProVerVisualPackage.TRANSITION__SOURCE_ELEMENT:
				setSourceElement((Elements)null);
				return;
			case ProVerVisualPackage.TRANSITION__DESTINATION_ELEMENT:
				setDestinationElement((Elements)null);
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
			case ProVerVisualPackage.TRANSITION__SOURCE_ELEMENT:
				return sourceElement != null;
			case ProVerVisualPackage.TRANSITION__DESTINATION_ELEMENT:
				return destinationElement != null;
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