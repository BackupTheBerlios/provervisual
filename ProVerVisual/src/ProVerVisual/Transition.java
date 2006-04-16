/**
 * <copyright>
 * </copyright>
 *
 * $Id: Transition.java,v 1.3 2006/04/16 12:08:19 rustikus Exp $
 */
package ProVerVisual;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ProVerVisual.Transition#getDescription <em>Description</em>}</li>
 *   <li>{@link ProVerVisual.Transition#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link ProVerVisual.Transition#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link ProVerVisual.Transition#getDestinationElement <em>Destination Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ProVerVisual.ProVerVisualPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ProVerVisual.ProVerVisualPackage#getTransition_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ProVerVisual.Transition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' attribute.
	 * @see #setConstraint(String)
	 * @see ProVerVisual.ProVerVisualPackage#getTransition_Constraint()
	 * @model
	 * @generated
	 */
	String getConstraint();

	/**
	 * Sets the value of the '{@link ProVerVisual.Transition#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(String value);

	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' reference.
	 * @see #setSourceElement(Elements)
	 * @see ProVerVisual.ProVerVisualPackage#getTransition_SourceElement()
	 * @model required="true"
	 * @generated
	 */
	Elements getSourceElement();

	/**
	 * Sets the value of the '{@link ProVerVisual.Transition#getSourceElement <em>Source Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' reference.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(Elements value);

	/**
	 * Returns the value of the '<em><b>Destination Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Element</em>' reference.
	 * @see #setDestinationElement(Elements)
	 * @see ProVerVisual.ProVerVisualPackage#getTransition_DestinationElement()
	 * @model required="true"
	 * @generated
	 */
	Elements getDestinationElement();

	/**
	 * Sets the value of the '{@link ProVerVisual.Transition#getDestinationElement <em>Destination Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Element</em>' reference.
	 * @see #getDestinationElement()
	 * @generated
	 */
	void setDestinationElement(Elements value);

} // Transition