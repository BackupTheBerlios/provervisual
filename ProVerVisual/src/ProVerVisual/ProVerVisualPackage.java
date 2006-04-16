/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProVerVisualPackage.java,v 1.3 2006/04/16 12:08:20 rustikus Exp $
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
	 * The meta object id for the '{@link ProVerVisual.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProVerVisual.impl.TransitionImpl
	 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Destination Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESTINATION_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ProVerVisual.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProVerVisual.impl.ProtocolImpl
	 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__TRANSITIONS = 3;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__ELEMENTS = 4;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ProVerVisual.impl.ElementsImpl <em>Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProVerVisual.impl.ElementsImpl
	 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getElements()
	 * @generated
	 */
	int ELEMENTS = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ProVerVisual.impl.ActionStateImpl <em>Action State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProVerVisual.impl.ActionStateImpl
	 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getActionState()
	 * @generated
	 */
	int ACTION_STATE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_STATE__DESCRIPTION = ELEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Operation Abbrev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_STATE__OPERATION_ABBREV = ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_STATE__OPERATION_FULL_NAME = ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_STATE_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ProVerVisual.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProVerVisual.impl.InitialStateImpl
	 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__DESCRIPTION = ELEMENTS__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProVerVisual.impl.EndStateImpl <em>End State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProVerVisual.impl.EndStateImpl
	 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getEndState()
	 * @generated
	 */
	int END_STATE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE__DESCRIPTION = ELEMENTS__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>End State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_STATE_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__DESCRIPTION = ELEMENTS__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 0;

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
	 * Returns the meta object for class '{@link ProVerVisual.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ProVerVisual.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link ProVerVisual.Transition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ProVerVisual.Transition#getDescription()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Description();

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
	 * Returns the meta object for the reference '{@link ProVerVisual.Transition#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Element</em>'.
	 * @see ProVerVisual.Transition#getSourceElement()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_SourceElement();

	/**
	 * Returns the meta object for the reference '{@link ProVerVisual.Transition#getDestinationElement <em>Destination Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Element</em>'.
	 * @see ProVerVisual.Transition#getDestinationElement()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_DestinationElement();

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
	 * Returns the meta object for the attribute '{@link ProVerVisual.Protocol#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ProVerVisual.Protocol#getType()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Type();

	/**
	 * Returns the meta object for the attribute '{@link ProVerVisual.Protocol#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ProVerVisual.Protocol#getDescription()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link ProVerVisual.Protocol#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see ProVerVisual.Protocol#getTransitions()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link ProVerVisual.Protocol#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see ProVerVisual.Protocol#getElements()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Elements();

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
	 * Returns the meta object for the attribute '{@link ProVerVisual.ActionState#getOperationAbbrev <em>Operation Abbrev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Abbrev</em>'.
	 * @see ProVerVisual.ActionState#getOperationAbbrev()
	 * @see #getActionState()
	 * @generated
	 */
	EAttribute getActionState_OperationAbbrev();

	/**
	 * Returns the meta object for the attribute '{@link ProVerVisual.ActionState#getOperationFullName <em>Operation Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Full Name</em>'.
	 * @see ProVerVisual.ActionState#getOperationFullName()
	 * @see #getActionState()
	 * @generated
	 */
	EAttribute getActionState_OperationFullName();

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
	 * Returns the meta object for class '{@link ProVerVisual.EndState <em>End State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End State</em>'.
	 * @see ProVerVisual.EndState
	 * @generated
	 */
	EClass getEndState();

	/**
	 * Returns the meta object for class '{@link ProVerVisual.Elements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elements</em>'.
	 * @see ProVerVisual.Elements
	 * @generated
	 */
	EClass getElements();

	/**
	 * Returns the meta object for the attribute '{@link ProVerVisual.Elements#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ProVerVisual.Elements#getDescription()
	 * @see #getElements()
	 * @generated
	 */
	EAttribute getElements_Description();

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
		 * The meta object literal for the '{@link ProVerVisual.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProVerVisual.impl.TransitionImpl
		 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__DESCRIPTION = eINSTANCE.getTransition_Description();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__CONSTRAINT = eINSTANCE.getTransition_Constraint();

		/**
		 * The meta object literal for the '<em><b>Source Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE_ELEMENT = eINSTANCE.getTransition_SourceElement();

		/**
		 * The meta object literal for the '<em><b>Destination Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__DESTINATION_ELEMENT = eINSTANCE.getTransition_DestinationElement();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__TYPE = eINSTANCE.getProtocol_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__DESCRIPTION = eINSTANCE.getProtocol_Description();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__TRANSITIONS = eINSTANCE.getProtocol_Transitions();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__ELEMENTS = eINSTANCE.getProtocol_Elements();

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
		 * The meta object literal for the '<em><b>Operation Abbrev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_STATE__OPERATION_ABBREV = eINSTANCE.getActionState_OperationAbbrev();

		/**
		 * The meta object literal for the '<em><b>Operation Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_STATE__OPERATION_FULL_NAME = eINSTANCE.getActionState_OperationFullName();

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
		 * The meta object literal for the '{@link ProVerVisual.impl.EndStateImpl <em>End State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProVerVisual.impl.EndStateImpl
		 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getEndState()
		 * @generated
		 */
		EClass END_STATE = eINSTANCE.getEndState();

		/**
		 * The meta object literal for the '{@link ProVerVisual.impl.ElementsImpl <em>Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProVerVisual.impl.ElementsImpl
		 * @see ProVerVisual.impl.ProVerVisualPackageImpl#getElements()
		 * @generated
		 */
		EClass ELEMENTS = eINSTANCE.getElements();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTS__DESCRIPTION = eINSTANCE.getElements_Description();

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
