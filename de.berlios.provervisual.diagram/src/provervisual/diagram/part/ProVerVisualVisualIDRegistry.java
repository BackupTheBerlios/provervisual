package provervisual.diagram.part;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import provervisual.ActionState;
import provervisual.FinalState;
import provervisual.InitialState;
import provervisual.Operation;
import provervisual.Protocol;
import provervisual.ProvervisualPackage;

import provervisual.diagram.edit.parts.ActionStateEditPart;
import provervisual.diagram.edit.parts.FinalStateEditPart;
import provervisual.diagram.edit.parts.InitialStateEditPart;
import provervisual.diagram.edit.parts.OperationEditPart;
import provervisual.diagram.edit.parts.Operation_operationAbbrev2EditPart;
import provervisual.diagram.edit.parts.Operation_operationAbbrevEditPart;
import provervisual.diagram.edit.parts.Operation_operationDescriptionEditPart;
import provervisual.diagram.edit.parts.Operation_operationNameEditPart;
import provervisual.diagram.edit.parts.ProtocolEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented 
 * by a domain model object.
 *
 * @generated
 */
public class ProVerVisualVisualIDRegistry {

	/**
	 * @generated
	 */
	public static final ProVerVisualVisualIDRegistry INSTANCE = new ProVerVisualVisualIDRegistry();

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ProtocolEditPart.MODEL_ID.equals(view.getType())) {
				return 79;
			} else {
				return -1;
			}
		}
		try {
			return Integer.parseInt(view.getType());
		} catch (NumberFormatException e) {
			ProVerVisualDiagramEditorPlugin.getInstance().logError(
					"Unable to parse view type as a visualID number: "
							+ view.getType(), e);
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getDiagramVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	public int getDiagramVisualID(EObject domainElement,
			EClass domainElementMetaclass) {
		if (ProvervisualPackage.eINSTANCE.getProtocol().equals(
				domainElementMetaclass)
				&& (domainElement == null || isDiagramProtocol_79((Protocol) domainElement))) {
			return 79;
		}
		return getUnrecognizedDiagramID(domainElement);
	}

	/**
	 * @generated
	 */
	public int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getNodeVisualID(containerView, domainElement,
				domainElementMetaclass, null);
	}

	/**
	 * @generated
	 */
	public int getNodeVisualID(View containerView, EObject domainElement,
			EClass domainElementMetaclass, String semanticHint) {
		String containerModelID = getModelID(containerView);
		if (!ProtocolEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ProtocolEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = 79;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case 1001:
			return getUnrecognizedInitialState_1001ChildNodeID(domainElement,
					semanticHint);
		case 1002:
			return getUnrecognizedFinalState_1002ChildNodeID(domainElement,
					semanticHint);
		case 1003:
			return getUnrecognizedActionState_1003ChildNodeID(domainElement,
					semanticHint);
		case 1004:
			if (Operation_operationAbbrevEditPart.VISUAL_ID
					.equals(semanticHint)) {
				return 4001;
			}
			if (Operation_operationNameEditPart.VISUAL_ID.equals(semanticHint)) {
				return 4002;
			}
			if (Operation_operationDescriptionEditPart.VISUAL_ID
					.equals(semanticHint)) {
				return 4003;
			}
			return getUnrecognizedOperation_1004ChildNodeID(domainElement,
					semanticHint);
		case 79:
			if ((semanticHint == null || InitialStateEditPart.VISUAL_ID
					.equals(semanticHint))
					&& ProvervisualPackage.eINSTANCE.getInitialState().equals(
							domainElementMetaclass)
					&& (domainElement == null || isNodeInitialState_1001((InitialState) domainElement))) {
				return 1001;
			}
			if ((semanticHint == null || FinalStateEditPart.VISUAL_ID
					.equals(semanticHint))
					&& ProvervisualPackage.eINSTANCE.getFinalState().equals(
							domainElementMetaclass)
					&& (domainElement == null || isNodeFinalState_1002((FinalState) domainElement))) {
				return 1002;
			}
			if ((semanticHint == null || ActionStateEditPart.VISUAL_ID
					.equals(semanticHint))
					&& ProvervisualPackage.eINSTANCE.getActionState().equals(
							domainElementMetaclass)
					&& (domainElement == null || isNodeActionState_1003((ActionState) domainElement))) {
				return 1003;
			}
			if ((semanticHint == null || OperationEditPart.VISUAL_ID
					.equals(semanticHint))
					&& ProvervisualPackage.eINSTANCE.getOperation().equals(
							domainElementMetaclass)
					&& (domainElement == null || isNodeOperation_1004((Operation) domainElement))) {
				return 1004;
			}
			return getUnrecognizedProtocol_79ChildNodeID(domainElement,
					semanticHint);
		case 3001:
			if (Operation_operationAbbrev2EditPart.VISUAL_ID
					.equals(semanticHint)) {
				return 4004;
			}
			return getUnrecognizedOperation_3001LinkLabelID(semanticHint);
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public int getLinkWithClassVisualID(EObject domainElement) {
		EClass domainElementMetaclass = domainElement.eClass();
		return getLinkWithClassVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	public int getLinkWithClassVisualID(EObject domainElement,
			EClass domainElementMetaclass) {
		if (ProvervisualPackage.eINSTANCE.getOperation().equals(
				domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassOperation_3001((Operation) domainElement))) {
			return 3001;
		} else {
			return getUnrecognizedLinkWithClassID(domainElement);
		}
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private boolean isDiagramProtocol_79(Protocol element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedDiagramID(EObject domainElement) {
		return -1;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private boolean isNodeInitialState_1001(InitialState element) {
		return ElementSelectors.acceptAllMatcher().matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private boolean isNodeFinalState_1002(FinalState element) {
		return ElementSelectors.acceptAllMatcher().matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private boolean isNodeActionState_1003(ActionState element) {
		return ElementSelectors.acceptAllMatcher().matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private boolean isNodeOperation_1004(Operation element) {
		return ElementSelectors.acceptAllMatcher().matches(element);
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedInitialState_1001ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedFinalState_1002ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedActionState_1003ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedOperation_1004ChildNodeID(EObject domainElement,
			String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedProtocol_79ChildNodeID(EObject domainElement,
			String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedOperation_3001LinkLabelID(String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private int getUnrecognizedLinkWithClassID(EObject domainElement) {
		return -1;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private boolean isLinkWithClassOperation_3001(Operation element) {
		return ElementSelectors.acceptAllMatcher().matches(element);
	}

	/**
	 * @generated
	 */
	private static class ElementSelectors {

		/**
		 * @generated
		 */
		private ElementSelectors() {
		}

		/**
		 * @generated
		 */
		static class AcceptAllMatcher {
			/**
			 * @generated
			 */
			static final AcceptAllMatcher INSTANCE = new AcceptAllMatcher();

			/**
			 * @generated
			 */
			boolean matches(Object element) {
				return true;
			}
		}

		/**
		 * @generated
		 */
		static AcceptAllMatcher acceptAllMatcher() {
			return AcceptAllMatcher.INSTANCE;
		}
	} // end of ElementSelectors
}
