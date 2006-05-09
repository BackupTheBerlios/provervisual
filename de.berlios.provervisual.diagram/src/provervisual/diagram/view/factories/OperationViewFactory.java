package provervisual.diagram.view.factories;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EcoreFactory;

import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;

import org.eclipse.gmf.runtime.diagram.ui.view.factories.AbstractShapeViewFactory;

import org.eclipse.gmf.runtime.notation.View;

import provervisual.diagram.edit.parts.Operation_operationAbbrevEditPart;
import provervisual.diagram.edit.parts.Operation_operationDescriptionEditPart;
import provervisual.diagram.edit.parts.Operation_operationNameEditPart;
import provervisual.diagram.edit.parts.ProtocolEditPart;

import provervisual.diagram.part.ProVerVisualVisualIDRegistry;

/**
 * @generated
 */
public class OperationViewFactory extends AbstractShapeViewFactory {

	/**
	 * @generated
	 */
	protected void decorateView(View containerView, View view,
			IAdaptable semanticAdapter, String semanticHint, int index,
			boolean persisted) {
		if (semanticHint == null) {
			semanticHint = provervisual.diagram.edit.parts.OperationEditPart.VISUAL_ID;
			view.setType(semanticHint);
		}
		super.decorateView(containerView, view, semanticAdapter, semanticHint,
				index, persisted);
		if (!ProtocolEditPart.MODEL_ID.equals(ProVerVisualVisualIDRegistry
				.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation.getDetails().put("modelID",
					ProtocolEditPart.MODEL_ID);
		}
		getViewService().createNode(semanticAdapter, view,
				Operation_operationAbbrevEditPart.VISUAL_ID, ViewUtil.APPEND,
				true, getPreferencesHint());
		getViewService().createNode(semanticAdapter, view,
				Operation_operationNameEditPart.VISUAL_ID, ViewUtil.APPEND,
				true, getPreferencesHint());
		getViewService().createNode(semanticAdapter, view,
				Operation_operationDescriptionEditPart.VISUAL_ID,
				ViewUtil.APPEND, true, getPreferencesHint());
	}
}
