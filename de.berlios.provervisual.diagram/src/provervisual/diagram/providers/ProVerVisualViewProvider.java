package provervisual.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.notation.View;
import provervisual.diagram.edit.parts.ProtocolEditPart;

import provervisual.diagram.part.ProVerVisualVisualIDRegistry;

import provervisual.diagram.view.factories.ActionStateViewFactory;
import provervisual.diagram.view.factories.FinalStateViewFactory;
import provervisual.diagram.view.factories.InitialStateViewFactory;
import provervisual.diagram.view.factories.Operation2ViewFactory;
import provervisual.diagram.view.factories.OperationViewFactory;
import provervisual.diagram.view.factories.Operation_operationAbbrev2ViewFactory;
import provervisual.diagram.view.factories.Operation_operationAbbrevViewFactory;
import provervisual.diagram.view.factories.Operation_operationDescriptionViewFactory;
import provervisual.diagram.view.factories.Operation_operationNameViewFactory;
import provervisual.diagram.view.factories.ProtocolViewFactory;

/**
 * @generated
 */
public class ProVerVisualViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (ProtocolEditPart.MODEL_ID.equals(diagramKind)
				&& ProVerVisualVisualIDRegistry.INSTANCE
						.getDiagramVisualID(semanticElement) != -1) {
			return ProtocolViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}

		EClass semanticType = getSemanticEClass(semanticAdapter);
		EObject semanticElement = getSemanticElement(semanticAdapter);
		int nodeVID = ProVerVisualVisualIDRegistry.INSTANCE.getNodeVisualID(
				containerView, semanticElement, semanticType, semanticHint);

		switch (nodeVID) {
		case 1001:
			return InitialStateViewFactory.class;
		case 1002:
			return FinalStateViewFactory.class;
		case 1003:
			return ActionStateViewFactory.class;
		case 1004:
			return OperationViewFactory.class;
		case 4001:
			return Operation_operationAbbrevViewFactory.class;
		case 4002:
			return Operation_operationNameViewFactory.class;
		case 4003:
			return Operation_operationDescriptionViewFactory.class;
		case 4004:
			return Operation_operationAbbrev2ViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {

		EClass semanticType = getSemanticEClass(semanticAdapter);
		EObject semanticElement = getSemanticElement(semanticAdapter);

		int linkVID = ProVerVisualVisualIDRegistry.INSTANCE
				.getLinkWithClassVisualID(semanticElement, semanticType);

		switch (linkVID) {
		case 3001:
			return Operation2ViewFactory.class;
		}
		return getUnrecognizedConnectorViewClass(semanticAdapter,
				containerView, semanticHint);
	}

	/**
	 * @generated
	 */
	private Class getUnrecognizedConnectorViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		// Handle unrecognized child node classes here
		return null;
	}

}
