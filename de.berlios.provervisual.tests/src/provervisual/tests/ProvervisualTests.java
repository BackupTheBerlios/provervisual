/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProvervisualTests.java,v 1.1 2006/05/09 20:36:53 rustikus Exp $
 */
package provervisual.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>provervisual</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProvervisualTests extends TestSuite {
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
		TestSuite suite = new ProvervisualTests("provervisual Tests");
		suite.addTestSuite(ProtocolTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvervisualTests(String name) {
		super(name);
	}

} //ProvervisualTests
