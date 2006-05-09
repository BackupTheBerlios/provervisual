/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProVerVisualAllTests.java,v 1.1 2006/05/09 20:36:53 rustikus Exp $
 */
package provervisual.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ProVerVisual</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProVerVisualAllTests extends TestSuite {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ProVerVisualAllTests("ProVerVisual Tests");
		suite.addTest(ProvervisualTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProVerVisualAllTests(String name) {
		super(name);
	}

} //ProVerVisualAllTests
