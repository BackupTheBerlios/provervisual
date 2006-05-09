/**
 * <copyright>
 * </copyright>
 *
 * $Id: ActionStateTest.java,v 1.1 2006/05/09 20:36:53 rustikus Exp $
 */
package provervisual.tests;

import junit.textui.TestRunner;

import provervisual.ActionState;
import provervisual.ProvervisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Action State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionStateTest extends StateTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActionStateTest.class);
	}

	/**
	 * Constructs a new Action State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionStateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Action State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActionState getFixture() {
		return (ActionState)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(ProvervisualFactory.eINSTANCE.createActionState());
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

} //ActionStateTest
