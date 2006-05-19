/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProvervisualPackage.java,v 1.3 2006/05/19 19:27:57 rustikus Exp $
 */
package provervisual;

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
 * @see provervisual.ProvervisualFactory
 * @model kind="package"
 * @generated
 */
public interface ProvervisualPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "provervisual";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://provervisual.berlios.de";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "provervisual";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProvervisualPackage eINSTANCE = provervisual.impl.ProvervisualPackageImpl.init();

	/**
	 * The meta object id for the '{@link provervisual.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see provervisual.impl.ProtocolImpl
	 * @see provervisual.impl.ProvervisualPackageImpl#getProtocol()
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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__OPERATIONS = 3;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__STATES = 4;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link provervisual.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see provervisual.impl.OperationImpl
	 * @see provervisual.impl.ProvervisualPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Operation Abbrev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATION_ABBREV = 0;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Operation Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATION_GUARD = 2;

	/**
	 * The feature id for the '<em><b>Start State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__START_STATE = 3;

	/**
	 * The feature id for the '<em><b>Operation Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATION_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>End State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__END_STATE = 5;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link provervisual.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see provervisual.impl.StateImpl
	 * @see provervisual.impl.ProvervisualPackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The feature id for the '<em><b>State Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NUMBER = 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link provervisual.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see provervisual.impl.InitialStateImpl
	 * @see provervisual.impl.ProvervisualPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 3;

	/**
	 * The feature id for the '<em><b>State Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__STATE_DESCRIPTION = STATE__STATE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__NUMBER = STATE__NUMBER;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link provervisual.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see provervisual.impl.FinalStateImpl
	 * @see provervisual.impl.ProvervisualPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 4;

	/**
	 * The feature id for the '<em><b>State Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__STATE_DESCRIPTION = STATE__STATE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NUMBER = STATE__NUMBER;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link provervisual.impl.ActionStateImpl <em>Action State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see provervisual.impl.ActionStateImpl
	 * @see provervisual.impl.ProvervisualPackageImpl#getActionState()
	 * @generated
	 */
	int ACTION_STATE = 5;

	/**
	 * The feature id for the '<em><b>State Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_STATE__STATE_DESCRIPTION = STATE__STATE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_STATE__NUMBER = STATE__NUMBER;

	/**
	 * The number of structural features of the '<em>Action State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link provervisual.impl.OperationParameterImpl <em>Operation Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see provervisual.impl.OperationParameterImpl
	 * @see provervisual.impl.ProvervisualPackageImpl#getOperationParameter()
	 * @generated
	 */
	int OPERATION_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER__PARAMETER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Parameter Abbrev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER__PARAMETER_ABBREV = 1;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER__PARAMETER_NAME = 2;

	/**
	 * The number of structural features of the '<em>Operation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link provervisual.ProtocolType <em>Protocol Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see provervisual.ProtocolType
	 * @see provervisual.impl.ProvervisualPackageImpl#getProtocolType()
	 * @generated
	 */
	int PROTOCOL_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link provervisual.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see provervisual.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for the attribute '{@link provervisual.Protocol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see provervisual.Protocol#getName()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Name();

	/**
	 * Returns the meta object for the attribute '{@link provervisual.Protocol#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see provervisual.Protocol#getDescription()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Description();

	/**
	 * Returns the meta object for the attribute '{@link provervisual.Protocol#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see provervisual.Protocol#getType()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link provervisual.Protocol#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see provervisual.Protocol#getOperations()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link provervisual.Protocol#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see provervisual.Protocol#getStates()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_States();

	/**
	 * Returns the meta object for class '{@link provervisual.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see provervisual.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link provervisual.Operation#getOperationAbbrev <em>Operation Abbrev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Abbrev</em>'.
	 * @see provervisual.Operation#getOperationAbbrev()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_OperationAbbrev();

	/**
	 * Returns the meta object for the attribute '{@link provervisual.Operation#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see provervisual.Operation#getOperationName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_OperationName();

	/**
	 * Returns the meta object for the reference '{@link provervisual.Operation#getStartState <em>Start State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start State</em>'.
	 * @see provervisual.Operation#getStartState()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_StartState();

	/**
	 * Returns the meta object for the containment reference list '{@link provervisual.Operation#getOperationParameter <em>Operation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Parameter</em>'.
	 * @see provervisual.Operation#getOperationParameter()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_OperationParameter();

	/**
	 * Returns the meta object for the attribute '{@link provervisual.Operation#getOperationGuard <em>Operation Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Guard</em>'.
	 * @see provervisual.Operation#getOperationGuard()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_OperationGuard();

	/**
	 * Returns the meta object for the reference '{@link provervisual.Operation#getEndState <em>End State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End State</em>'.
	 * @see provervisual.Operation#getEndState()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_EndState();

	/**
	 * Returns the meta object for class '{@link provervisual.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see provervisual.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link provervisual.State#getStateDescription <em>State Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Description</em>'.
	 * @see provervisual.State#getStateDescription()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_StateDescription();

	/**
	 * Returns the meta object for the attribute '{@link provervisual.State#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see provervisual.State#getNumber()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Number();

	/**
	 * Returns the meta object for class '{@link provervisual.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see provervisual.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link provervisual.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see provervisual.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link provervisual.ActionState <em>Action State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action State</em>'.
	 * @see provervisual.ActionState
	 * @generated
	 */
	EClass getActionState();

	/**
	 * Returns the meta object for class '{@link provervisual.OperationParameter <em>Operation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Parameter</em>'.
	 * @see provervisual.OperationParameter
	 * @generated
	 */
	EClass getOperationParameter();

	/**
	 * Returns the meta object for the attribute '{@link provervisual.OperationParameter#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Type</em>'.
	 * @see provervisual.OperationParameter#getParameterType()
	 * @see #getOperationParameter()
	 * @generated
	 */
	EAttribute getOperationParameter_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link provervisual.OperationParameter#getParameterAbbrev <em>Parameter Abbrev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Abbrev</em>'.
	 * @see provervisual.OperationParameter#getParameterAbbrev()
	 * @see #getOperationParameter()
	 * @generated
	 */
	EAttribute getOperationParameter_ParameterAbbrev();

	/**
	 * Returns the meta object for the attribute '{@link provervisual.OperationParameter#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see provervisual.OperationParameter#getParameterName()
	 * @see #getOperationParameter()
	 * @generated
	 */
	EAttribute getOperationParameter_ParameterName();

	/**
	 * Returns the meta object for enum '{@link provervisual.ProtocolType <em>Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol Type</em>'.
	 * @see provervisual.ProtocolType
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
	ProvervisualFactory getProvervisualFactory();

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
	interface Literals  {
		/**
		 * The meta object literal for the '{@link provervisual.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see provervisual.impl.ProtocolImpl
		 * @see provervisual.impl.ProvervisualPackageImpl#getProtocol()
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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__DESCRIPTION = eINSTANCE.getProtocol_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__TYPE = eINSTANCE.getProtocol_Type();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__OPERATIONS = eINSTANCE.getProtocol_Operations();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__STATES = eINSTANCE.getProtocol_States();

		/**
		 * The meta object literal for the '{@link provervisual.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see provervisual.impl.OperationImpl
		 * @see provervisual.impl.ProvervisualPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Operation Abbrev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__OPERATION_ABBREV = eINSTANCE.getOperation_OperationAbbrev();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__OPERATION_NAME = eINSTANCE.getOperation_OperationName();

		/**
		 * The meta object literal for the '<em><b>Start State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__START_STATE = eINSTANCE.getOperation_StartState();

		/**
		 * The meta object literal for the '<em><b>Operation Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OPERATION_PARAMETER = eINSTANCE.getOperation_OperationParameter();

		/**
		 * The meta object literal for the '<em><b>Operation Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__OPERATION_GUARD = eINSTANCE.getOperation_OperationGuard();

		/**
		 * The meta object literal for the '<em><b>End State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__END_STATE = eINSTANCE.getOperation_EndState();

		/**
		 * The meta object literal for the '{@link provervisual.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see provervisual.impl.StateImpl
		 * @see provervisual.impl.ProvervisualPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>State Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__STATE_DESCRIPTION = eINSTANCE.getState_StateDescription();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NUMBER = eINSTANCE.getState_Number();

		/**
		 * The meta object literal for the '{@link provervisual.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see provervisual.impl.InitialStateImpl
		 * @see provervisual.impl.ProvervisualPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link provervisual.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see provervisual.impl.FinalStateImpl
		 * @see provervisual.impl.ProvervisualPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link provervisual.impl.ActionStateImpl <em>Action State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see provervisual.impl.ActionStateImpl
		 * @see provervisual.impl.ProvervisualPackageImpl#getActionState()
		 * @generated
		 */
		EClass ACTION_STATE = eINSTANCE.getActionState();

		/**
		 * The meta object literal for the '{@link provervisual.impl.OperationParameterImpl <em>Operation Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see provervisual.impl.OperationParameterImpl
		 * @see provervisual.impl.ProvervisualPackageImpl#getOperationParameter()
		 * @generated
		 */
		EClass OPERATION_PARAMETER = eINSTANCE.getOperationParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_PARAMETER__PARAMETER_TYPE = eINSTANCE.getOperationParameter_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Parameter Abbrev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_PARAMETER__PARAMETER_ABBREV = eINSTANCE.getOperationParameter_ParameterAbbrev();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_PARAMETER__PARAMETER_NAME = eINSTANCE.getOperationParameter_ParameterName();

		/**
		 * The meta object literal for the '{@link provervisual.ProtocolType <em>Protocol Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see provervisual.ProtocolType
		 * @see provervisual.impl.ProvervisualPackageImpl#getProtocolType()
		 * @generated
		 */
		EEnum PROTOCOL_TYPE = eINSTANCE.getProtocolType();

	}

} //ProvervisualPackage
