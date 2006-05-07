/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProtocolImpl.java,v 1.4 2006/05/07 22:19:54 rustikus Exp $
 */
package provervisual.impl;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import provervisual.Operation;
import provervisual.Protocol;
import provervisual.ProtocolType;
import provervisual.ProvervisualFactory;
import provervisual.ProvervisualPackage;
import provervisual.State;
import provervisual.analyze.NFARegex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link provervisual.impl.ProtocolImpl#getName <em>Name</em>}</li>
 *   <li>{@link provervisual.impl.ProtocolImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link provervisual.impl.ProtocolImpl#getType <em>Type</em>}</li>
 *   <li>{@link provervisual.impl.ProtocolImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link provervisual.impl.ProtocolImpl#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolImpl extends EObjectImpl implements Protocol {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ProtocolType TYPE_EDEFAULT = ProtocolType.COMPONENT_LITERAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ProtocolType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList operations = null;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList states = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * The default constructor for a given URI.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ProtocolImpl(URI uri){
		
		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extentions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(ProvervisualPackage.eNS_URI,
				ProvervisualPackage.eINSTANCE);

		// If there are no arguments, emit an appropriate usage message.
		//
		if (uri == null) {
			System.out
					.println("Parameter should be a URIs that have content like this:");
			try {
				Resource resource = resourceSet.createResource(URI
						.createURI("http:///My.provervisual"));
				Protocol root = ProvervisualFactory.eINSTANCE.createProtocol();
				resource.getContents().add(root);
				resource.save(System.out, null);
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		} else {
			try {
				// Demand load resource for this file.
				//
				Resource resource = resourceSet.getResource(uri, true);
//				System.out.println("Loaded: \"" + uri + "\"");

				// Validate the contents of the loaded resource.
				//
				for (Iterator j = resource.getContents().iterator(); j
						.hasNext();) {
					EObject eObject = (EObject) j.next();
					Diagnostic diagnostic = Diagnostician.INSTANCE
							.validate(eObject);
					if (diagnostic.getSeverity() != Diagnostic.OK) {
						System.err.println(diagnostic.getMessage());
					} else {
//						System.out.println("File is valid!\n");
					}
				}

				// At the moment one file should contain only one protocol
				EObject eObject = (EObject) resource.getContents().get(0);
				Protocol protocol = (Protocol) eObject;
				this.type = protocol.getType();
				this.description = protocol.getDescription();
				this.name = protocol.getName();
				this.operations = protocol.getOperations();
				this.states = protocol.getStates();


			} catch (RuntimeException exception) {
				System.out.println("Problem loading " + uri);
				exception.printStackTrace();
			}
		}
		
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProvervisualPackage.Literals.PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvervisualPackage.PROTOCOL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvervisualPackage.PROTOCOL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ProtocolType newType) {
		ProtocolType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvervisualPackage.PROTOCOL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList(Operation.class, this, ProvervisualPackage.PROTOCOL__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStates() {
		if (states == null) {
			states = new EObjectContainmentEList(State.class, this, ProvervisualPackage.PROTOCOL__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProvervisualPackage.PROTOCOL__OPERATIONS:
				return ((InternalEList)getOperations()).basicRemove(otherEnd, msgs);
			case ProvervisualPackage.PROTOCOL__STATES:
				return ((InternalEList)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProvervisualPackage.PROTOCOL__NAME:
				return getName();
			case ProvervisualPackage.PROTOCOL__DESCRIPTION:
				return getDescription();
			case ProvervisualPackage.PROTOCOL__TYPE:
				return getType();
			case ProvervisualPackage.PROTOCOL__OPERATIONS:
				return getOperations();
			case ProvervisualPackage.PROTOCOL__STATES:
				return getStates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProvervisualPackage.PROTOCOL__NAME:
				setName((String)newValue);
				return;
			case ProvervisualPackage.PROTOCOL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProvervisualPackage.PROTOCOL__TYPE:
				setType((ProtocolType)newValue);
				return;
			case ProvervisualPackage.PROTOCOL__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection)newValue);
				return;
			case ProvervisualPackage.PROTOCOL__STATES:
				getStates().clear();
				getStates().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProvervisualPackage.PROTOCOL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProvervisualPackage.PROTOCOL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProvervisualPackage.PROTOCOL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ProvervisualPackage.PROTOCOL__OPERATIONS:
				getOperations().clear();
				return;
			case ProvervisualPackage.PROTOCOL__STATES:
				getStates().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProvervisualPackage.PROTOCOL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProvervisualPackage.PROTOCOL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ProvervisualPackage.PROTOCOL__TYPE:
				return type != TYPE_EDEFAULT;
			case ProvervisualPackage.PROTOCOL__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case ProvervisualPackage.PROTOCOL__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer();
		String test = name != null ? "Protocol Name: "
				+ name : "Protocol Name not specified";
		result.append(test + "\n");
		result.append("Protocol Type: " + type + "\n");
		test = description != null ? "Protocol Description: "
				+ description : "No Description available";
		result.append(test + "\n");
		result.append("Operations defined:\n");
		for (Iterator j = operations.iterator(); j.hasNext();) {
			result.append(((Operation) j.next()).getOperationName() + "\n");
		}

		result.append("\n" +getRegEx());
		
		return result.toString();

	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getRegEx(){
		
		NFARegex test = new NFARegex(this);
		return test.getSimpleRegExp().toString().replace(".","");
		
	}
	

} //ProtocolImpl