/**
 * <copyright>
 * </copyright>
 *
 * $Id: OperationGuardTest.java,v 1.1 2006/05/09 20:36:53 rustikus Exp $
 */
package provervisual.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import provervisual.OperationGuard;
import provervisual.ProvervisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Operation Guard</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationGuardTest extends TestCase {
	/**
	 * The fixture for this Operation Guard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationGuard fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OperationGuardTest.class);
	}

	/**
	 * Constructs a new Operation Guard test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationGuardTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Operation Guard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OperationGuard fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Operation Guard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OperationGuard getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(ProvervisualFactory.eINSTANCE.createOperationGuard());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //OperationGuardTest
