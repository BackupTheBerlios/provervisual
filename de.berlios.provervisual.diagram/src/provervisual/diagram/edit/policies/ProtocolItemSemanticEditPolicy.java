package provervisual.diagram.edit.policies;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import provervisual.ProvervisualPackage;

import provervisual.diagram.providers.ProVerVisualElementTypes;

/**
 * @generated
 */
public class ProtocolItemSemanticEditPolicy extends
		ProVerVisualBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ProVerVisualElementTypes.InitialState_1001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProvervisualPackage.eINSTANCE
						.getProtocol_States());
			}
			return getMSLWrapper(new CreateInitialState_1001Command(req));
		}
		if (ProVerVisualElementTypes.FinalState_1002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProvervisualPackage.eINSTANCE
						.getProtocol_States());
			}
			return getMSLWrapper(new CreateFinalState_1002Command(req));
		}
		if (ProVerVisualElementTypes.ActionState_1003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProvervisualPackage.eINSTANCE
						.getProtocol_States());
			}
			return getMSLWrapper(new CreateActionState_1003Command(req));
		}
		if (ProVerVisualElementTypes.Operation_1004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(ProvervisualPackage.eINSTANCE
						.getProtocol_Operations());
			}
			return getMSLWrapper(new CreateOperation_1004Command(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	private static class CreateInitialState_1001Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateInitialState_1001Command(CreateElementRequest req) {
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
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest())
					.getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateFinalState_1002Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateFinalState_1002Command(CreateElementRequest req) {
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
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest())
					.getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateActionState_1003Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateActionState_1003Command(CreateElementRequest req) {
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
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest())
					.getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateOperation_1004Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateOperation_1004Command(CreateElementRequest req) {
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
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest())
					.getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getMSLWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}
	}
}
