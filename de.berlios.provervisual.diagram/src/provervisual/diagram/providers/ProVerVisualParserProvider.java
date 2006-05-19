package provervisual.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import provervisual.ProvervisualPackage;

import provervisual.diagram.edit.parts.Operation_guardConstraintEditPart;
import provervisual.diagram.edit.parts.Operation_operationAbbrev2EditPart;
import provervisual.diagram.edit.parts.Operation_operationAbbrevEditPart;
import provervisual.diagram.edit.parts.Operation_operationGuardEditPart;
import provervisual.diagram.edit.parts.Operation_operationDescriptionEditPart;
import provervisual.diagram.edit.parts.Operation_operationNameEditPart;

/**
 * @generated
 */
public class ProVerVisualParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser operationOperationOperationAbbrev_4001Parser;

	/**
	 * @generated
	 */
	private IParser getOperationOperationOperationAbbrev_4001Parser() {
		if (operationOperationOperationAbbrev_4001Parser == null) {
			operationOperationOperationAbbrev_4001Parser = createOperationOperationOperationAbbrev_4001Parser();
		}
		return operationOperationOperationAbbrev_4001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOperationOperationOperationAbbrev_4001Parser() {
		ProVerVisualStructuralFeatureParser parser = new ProVerVisualStructuralFeatureParser(
				ProvervisualPackage.eINSTANCE.getOperation()
						.getEStructuralFeature("operationAbbrev"));
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser operationOperationOperationName_4002Parser;

	/**
	 * @generated
	 */
	private IParser getOperationOperationOperationName_4002Parser() {
		if (operationOperationOperationName_4002Parser == null) {
			operationOperationOperationName_4002Parser = createOperationOperationOperationName_4002Parser();
		}
		return operationOperationOperationName_4002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOperationOperationOperationName_4002Parser() {
		ProVerVisualStructuralFeatureParser parser = new ProVerVisualStructuralFeatureParser(
				ProvervisualPackage.eINSTANCE.getOperation()
						.getEStructuralFeature("operationName"));
		parser.setViewPattern("FQN: {0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser operationOperationOperationGuard_4003Parser;

	/**
	 * @generated
	 */
	private IParser getOperationOperationOperationGuard_4003Parser() {
		if (operationOperationOperationGuard_4003Parser == null) {
			operationOperationOperationGuard_4003Parser = createOperationOperationOperationGuard_4003Parser();
		}
		return operationOperationOperationGuard_4003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOperationOperationOperationGuard_4003Parser() {
		ProVerVisualStructuralFeatureParser parser = new ProVerVisualStructuralFeatureParser(
				ProvervisualPackage.eINSTANCE.getOperation()
						.getEStructuralFeature("operationGuard"));
		parser.setViewPattern("Guard: {0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser operationOperationOperationAbbrev_4004Parser;

	/**
	 * @generated
	 */
	private IParser getOperationOperationOperationAbbrev_4004Parser() {
		if (operationOperationOperationAbbrev_4004Parser == null) {
			operationOperationOperationAbbrev_4004Parser = createOperationOperationOperationAbbrev_4004Parser();
		}
		return operationOperationOperationAbbrev_4004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOperationOperationOperationAbbrev_4004Parser() {
		ProVerVisualStructuralFeatureParser parser = new ProVerVisualStructuralFeatureParser(
				ProvervisualPackage.eINSTANCE.getOperation()
						.getEStructuralFeature("operationAbbrev"));
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(IElementType type, String viewType) {
		if (ProVerVisualElementTypes.Operation_1004 == type) {
			if (Operation_operationAbbrevEditPart.VISUAL_ID.equals(viewType)) {
				return getOperationOperationOperationAbbrev_4001Parser();
			}
			if (Operation_operationNameEditPart.VISUAL_ID.equals(viewType)) {
				return getOperationOperationOperationName_4002Parser();
			}
			if (Operation_operationGuardEditPart.VISUAL_ID.equals(viewType)) {
				return getOperationOperationOperationGuard_4003Parser();
			}
		}
		if (ProVerVisualElementTypes.Operation_3001 == type) {
			if (Operation_operationAbbrev2EditPart.VISUAL_ID.equals(viewType)) {
				return getOperationOperationOperationAbbrev_4004Parser();
			}
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String viewType = (String) hint.getAdapter(String.class);
		IElementType type = (IElementType) hint.getAdapter(IElementType.class);
		if (type == null) {
			EObject element = (EObject) hint.getAdapter(EObject.class);
			type = ElementTypeRegistry.getInstance().getElementType(element);
		}
		return getParser(type, viewType);
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			return getParser(((GetParserOperation) operation).getHint()) != null;
		}
		return false;
	}
}
