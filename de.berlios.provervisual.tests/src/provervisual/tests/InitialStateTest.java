/**
 * <copyright>
 * </copyright>
 *
 * $Id: InitialStateTest.java,v 1.1 2006/05/09 20:36:53 rustikus Exp $
 */
package provervisual.tests;

import junit.textui.TestRunner;

import provervisual.InitialState;
import provervisual.ProvervisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Initial State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InitialStateTest extends StateTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InitialStateTest.class);
	}

	/**
	 * Constructs a new Initial State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialStateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Initial State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InitialState getFixture() {
		return (InitialState)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(ProvervisualFactory.eINSTANCE.createInitialState());
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

} //InitialStateTest
