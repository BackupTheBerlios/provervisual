/**
 * <copyright>
 * </copyright>
 *
 * $Id: Elements.java,v 1.1 2006/04/16 12:08:19 rustikus Exp $
 */
package ProVerVisual;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ProVerVisual.Elements#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see ProVerVisual.ProVerVisualPackage#getElements()
 * @model abstract="true"
 * @generated
 */
public interface Elements extends EObject {
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
	 * @see ProVerVisual.ProVerVisualPackage#getElements_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ProVerVisual.Elements#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Elements