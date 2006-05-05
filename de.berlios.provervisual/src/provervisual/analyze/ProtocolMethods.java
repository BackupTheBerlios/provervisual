package provervisual.analyze;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import provervisual.Operation;
import provervisual.Protocol;
import provervisual.ProvervisualFactory;
import provervisual.ProvervisualPackage;

public class ProtocolMethods {

	/**
	 * <!-- begin-user-doc --> Load all the argument file paths or URIs as
	 * instances of the model. <!-- end-user-doc -->
	 * 
	 * @param args
	 *            the file paths or URIs.
	 */
	public static Protocol getProtocolFromUri(URI uri) {
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
				return null;
			} catch (IOException exception) {
				exception.printStackTrace();
				return null;
			}
		} else {
			try {
				// Demand load resource for this file.
				//
				Resource resource = resourceSet.getResource(uri, true);
				System.out.println("Loaded: \"" + uri + "\"");

				// Validate the contents of the loaded resource.
				//
				for (Iterator j = resource.getContents().iterator(); j
						.hasNext();) {
					EObject eObject = (EObject) j.next();
					Diagnostic diagnostic = Diagnostician.INSTANCE
							.validate(eObject);
					if (diagnostic.getSeverity() != Diagnostic.OK) {
						printDiagnostic(diagnostic, "");
						return null;
					} else {
						System.out.println("File is valid!\n");
					}
				}

				// At the moment one file should contain only one protocol
				EObject eObject = (EObject) resource.getContents().get(0);
				Protocol protocol = (Protocol) eObject;

				return protocol;

			} catch (RuntimeException exception) {
				System.out.println("Problem loading " + uri);
				exception.printStackTrace();
				return null;
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> Print basic informations about the protocol to
	 * stdout. <!-- end-user-doc -->
	 * 
	 * @param protocol
	 *            the protocol file.
	 */
	public static void print(Protocol protocol) {

		StringBuffer output = new StringBuffer();
		String test = protocol.getName() != null ? "Protocol Name: "
				+ protocol.getName() : "Protocol Name not specified";
		output.append(test + "\n");
		output.append("Protocol Type: " + protocol.getType() + "\n");
		test = protocol.getDescription() != null ? "Protocol Description: "
				+ protocol.getDescription() : "No Description available";
		output.append(test + "\n");
		output.append("Operations defined:\n");
		for (Iterator j = protocol.getOperations().iterator(); j.hasNext();) {
			output.append(((Operation) j.next()).getOperationAbbrev() + "\n");
		}

		System.out.println(output.toString());

	}

	/**
	 * <!-- begin-user-doc --> Prints diagnostics with indentation. <!--
	 * end-user-doc -->
	 * 
	 * @param diagnostic
	 *            the diagnostic to print.
	 * @param indent
	 *            the indentation for printing.
	 */
	protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Iterator i = diagnostic.getChildren().iterator(); i.hasNext();) {
			printDiagnostic((Diagnostic) i.next(), indent + "  ");
		}
	}

}
