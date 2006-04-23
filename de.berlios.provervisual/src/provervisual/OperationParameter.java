/**
 * <copyright>
 * </copyright>
 *
 * $Id: OperationParameter.java,v 1.1 2006/04/23 14:50:50 rustikus Exp $
 */
package provervisual;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link provervisual.OperationParameter#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link provervisual.OperationParameter#getParameterAbbrev <em>Parameter Abbrev</em>}</li>
 * </ul>
 * </p>
 *
 * @see provervisual.ProvervisualPackage#getOperationParameter()
 * @model
 * @generated
 */
public interface OperationParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' attribute.
	 * @see #setParameterType(String)
	 * @see provervisual.ProvervisualPackage#getOperationParameter_ParameterType()
	 * @model
	 * @generated
	 */
	String getParameterType();

	/**
	 * Sets the value of the '{@link provervisual.OperationParameter#getParameterType <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' attribute.
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Abbrev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Abbrev</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Abbrev</em>' attribute.
	 * @see #setParameterAbbrev(String)
	 * @see provervisual.ProvervisualPackage#getOperationParameter_ParameterAbbrev()
	 * @model
	 * @generated
	 */
	String getParameterAbbrev();

	/**
	 * Sets the value of the '{@link provervisual.OperationParameter#getParameterAbbrev <em>Parameter Abbrev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Abbrev</em>' attribute.
	 * @see #getParameterAbbrev()
	 * @generated
	 */
	void setParameterAbbrev(String value);

} // OperationParameter