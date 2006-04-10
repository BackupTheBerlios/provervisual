/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProVerVisualPackage.java,v 1.1 2006/04/10 06:02:39 rustikus Exp $
 */
package ProVerVisual;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ProVerVisual.ProVerVisualFactory
 * @model kind="package"
 * @generated
 */
public interface ProVerVisualPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ProVerVisual";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ProVerVisual";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ProVerVisual";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProVerVisualPackage eINSTANCE = ProVerVisual.impl.ProVerVisualPackageImpl.init();

	/**
	 * The meta object id for the '{@link ProVerVisual.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProVerVisual.impl.ProtocolImpl
	 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Protocol State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__PROTOCOL_STATE = 1;

	/**
	 * The feature id for the '<em><b>Protocol Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__PROTOCOL_TRANSITION = 2;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ProVerVisual.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProVerVisual.impl.StateImpl
	 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ProVerVisual.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProVerVisual.impl.InitialStateImpl
	 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__NAME = STATE__NAME;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProVerVisual.impl.ActionStateImpl <em>Action State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProVerVisual.impl.ActionStateImpl
	 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getActionState()
	 * @generated
	 */
	int ACTION_STATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_STATE__NAME = STATE__NAME;

	/**
	 * The number of structural features of the '<em>Action State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProVerVisual.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProVerVisual.impl.FinalStateImpl
	 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME = STATE__NAME;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProVerVisual.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProVerVisual.impl.TransitionImpl
	 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>State Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__STATE_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>State Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__STATE_TARGET = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ProVerVisual.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProVerVisual.impl.BranchImpl
	 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = STATE__NAME;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProVerVisual.ProtocolType <em>Protocol Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProVerVisual.ProtocolType
	 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getProtocolType()
	 * @generated
	 */
	int PROTOCOL_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link ProVerVisual.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see ProVerVisual.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for the attribute '{@link ProVerVisual.Protocol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ProVerVisual.Protocol#getName()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ProVerVisual.Protocol#getProtocolState <em>Protocol State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocol State</em>'.
	 * @see ProVerVisual.Protocol#getProtocolState()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_ProtocolState();

	/**
	 * Returns the meta object for the containment reference list '{@link ProVerVisual.Protocol#getProtocolTransition <em>Protocol Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocol Transition</em>'.
	 * @see ProVerVisual.Protocol#getProtocolTransition()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_ProtocolTransition();

	/**
	 * Returns the meta object for class '{@link ProVerVisual.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see ProVerVisual.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link ProVerVisual.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ProVerVisual.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for class '{@link ProVerVisual.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see ProVerVisual.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link ProVerVisual.ActionState <em>Action State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action State</em>'.
	 * @see ProVerVisual.ActionState
	 * @generated
	 */
	EClass getActionState();

	/**
	 * Returns the meta object for class '{@link ProVerVisual.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see ProVerVisual.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link ProVerVisual.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ProVerVisual.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link ProVerVisual.Transition#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see ProVerVisual.Transition#getConstraint()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Constraint();

	/**
	 * Returns the meta object for the reference '{@link ProVerVisual.Transition#getStateSource <em>State Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Source</em>'.
	 * @see ProVerVisual.Transition#getStateSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_StateSource();

	/**
	 * Returns the meta object for the reference '{@link ProVerVisual.Transition#getStateTarget <em>State Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Target</em>'.
	 * @see ProVerVisual.Transition#getStateTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_StateTarget();

	/**
	 * Returns the meta object for class '{@link ProVerVisual.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see ProVerVisual.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for enum '{@link ProVerVisual.ProtocolType <em>Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol Type</em>'.
	 * @see ProVerVisual.ProtocolType
	 * @generated
	 */
	EEnum getProtocolType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProVerVisualFactory getProVerVisualFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ProVerVisual.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProVerVisual.impl.ProtocolImpl
		 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getProtocol()
		 * @generated
		 */
		EClass PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__NAME = eINSTANCE.getProtocol_Name();

		/**
		 * The meta object literal for the '<em><b>Protocol State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__PROTOCOL_STATE = eINSTANCE.getProtocol_ProtocolState();

		/**
		 * The meta object literal for the '<em><b>Protocol Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__PROTOCOL_TRANSITION = eINSTANCE.getProtocol_ProtocolTransition();

		/**
		 * The meta object literal for the '{@link ProVerVisual.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProVerVisual.impl.StateImpl
		 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '{@link ProVerVisual.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProVerVisual.impl.InitialStateImpl
		 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link ProVerVisual.impl.ActionStateImpl <em>Action State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProVerVisual.impl.ActionStateImpl
		 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getActionState()
		 * @generated
		 */
		EClass ACTION_STATE = eINSTANCE.getActionState();

		/**
		 * The meta object literal for the '{@link ProVerVisual.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProVerVisual.impl.FinalStateImpl
		 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link ProVerVisual.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProVerVisual.impl.TransitionImpl
		 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__CONSTRAINT = eINSTANCE.getTransition_Constraint();

		/**
		 * The meta object literal for the '<em><b>State Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__STATE_SOURCE = eINSTANCE.getTransition_StateSource();

		/**
		 * The meta object literal for the '<em><b>State Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__STATE_TARGET = eINSTANCE.getTransition_StateTarget();

		/**
		 * The meta object literal for the '{@link ProVerVisual.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProVerVisual.impl.BranchImpl
		 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '{@link ProVerVisual.ProtocolType <em>Protocol Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProVerVisual.ProtocolType
		 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getProtocolType()
		 * @generated
		 */
		EEnum PROTOCOL_TYPE = eINSTANCE.getProtocolType();

	}

} //ProVerVisualPackage
