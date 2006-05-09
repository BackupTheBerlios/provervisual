package provervisual.diagram.providers;

import java.util.IdentityHashMap;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;

import org.eclipse.swt.graphics.Image;

import provervisual.ProvervisualPackage;

import provervisual.diagram.part.ProVerVisualDiagramEditorPlugin;

/**
 * @generated
 */
public class ProVerVisualElementTypes {

	/**
	 * @generated
	 */
	private ProVerVisualElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			element = ((EStructuralFeature) element).getEContainingClass();
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return ProVerVisualDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();
			elements.put(Protocol_79, ProvervisualPackage.eINSTANCE
					.getProtocol());
			elements.put(InitialState_1001, ProvervisualPackage.eINSTANCE
					.getInitialState());
			elements.put(FinalState_1002, ProvervisualPackage.eINSTANCE
					.getFinalState());
			elements.put(ActionState_1003, ProvervisualPackage.eINSTANCE
					.getActionState());
			elements.put(Operation_1004, ProvervisualPackage.eINSTANCE
					.getOperation());
			elements.put(Operation_3001, ProvervisualPackage.eINSTANCE
					.getOperation());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	public static final IElementType Protocol_79 = getElementType("de.berlios.provervisual.diagram.Protocol_79");

	/**
	 * @generated
	 */
	public static final IElementType InitialState_1001 = getElementType("de.berlios.provervisual.diagram.InitialState_1001");

	/**
	 * @generated
	 */
	public static final IElementType FinalState_1002 = getElementType("de.berlios.provervisual.diagram.FinalState_1002");

	/**
	 * @generated
	 */
	public static final IElementType ActionState_1003 = getElementType("de.berlios.provervisual.diagram.ActionState_1003");

	/**
	 * @generated
	 */
	public static final IElementType Operation_1004 = getElementType("de.berlios.provervisual.diagram.Operation_1004");

	/**
	 * @generated
	 */
	public static final IElementType Operation_3001 = getElementType("de.berlios.provervisual.diagram.Operation_3001");

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}
}
