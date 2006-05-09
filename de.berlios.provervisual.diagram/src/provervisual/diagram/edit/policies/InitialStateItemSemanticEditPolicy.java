package provervisual.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.gef.commands.UnexecutableCommand;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;

import provervisual.Operation;
import provervisual.Protocol;
import provervisual.ProvervisualPackage;
import provervisual.State;

import provervisual.diagram.providers.ProVerVisualElementTypes;

/**
 * @generated
 */
public class InitialStateItemSemanticEditPolicy extends
		ProVerVisualBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getMSLWrapper(new DestroyElementCommand(req) {

			protected EObject getElementToDestroy() {
				View view = (View) getHost().getModel();
				EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
				if (annotation != null) {
					return view;
				}
				return super.getElementToDestroy();
			}

		});
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ProVerVisualElementTypes.Operation_3001 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingOperation3001Command(req)
					: getCreateCompleteIncomingOperation3001Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingOperation3001Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingOperation3001Command(
			CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof State)) {
			return UnexecutableCommand.INSTANCE;
		}
		final Protocol element = (Protocol) getRelationshipContainer(req
				.getSource(), ProvervisualPackage.eINSTANCE.getProtocol(), req
				.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(ProvervisualPackage.eINSTANCE
					.getProtocol_Operations());
		}
		return getMSLWrapper(new CreateIncomingOperation3001Command(req) {

			/**
			 * @generated
			 */
			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingOperation3001Command extends
			CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingOperation3001Command(CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return ProvervisualPackage.eINSTANCE.getProtocol();
		};

		/**
		 * @generated
		 */
		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			Operation newElement = (Operation) super.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setEndState((State) getTarget());
				newElement.setStartState((State) getSource());
			}
			return newElement;
		}
	}
}
