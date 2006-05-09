/**
 * <copyright>
 * </copyright>
 *
 * $Id: FinalStateTest.java,v 1.1 2006/05/09 20:36:53 rustikus Exp $
 */
package provervisual.tests;

import junit.textui.TestRunner;

import provervisual.FinalState;
import provervisual.ProvervisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Final State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FinalStateTest extends StateTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FinalStateTest.class);
	}

	/**
	 * Constructs a new Final State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalStateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Final State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FinalState getFixture() {
		return (FinalState)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(ProvervisualFactory.eINSTANCE.createFinalState());
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

} //FinalStateTest
