package provervisual.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import provervisual.diagram.part.ProVerVisualVisualIDRegistry;

/**
 * @generated
 */
public class ProVerVisualEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public static final String EXTERNAL_NODE_LABELS_LAYER = "External Node Labels";

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			if (!ProtocolEditPart.MODEL_ID.equals(ProVerVisualVisualIDRegistry
					.getModelID(view))) {
				return null;
			}

			int viewVisualID = ProVerVisualVisualIDRegistry.getVisualID(view);
			switch (viewVisualID) {
			case 1001:
				return new InitialStateEditPart(view);
			case 1002:
				return new FinalStateEditPart(view);
			case 1003:
				return new ActionStateEditPart(view);
			case 1004:
				return new OperationEditPart(view);
			case 4001:
				return new Operation_operationAbbrevEditPart(view);
			case 4002:
				return new Operation_operationNameEditPart(view);
			case 4003:
				return new Operation_operationDescriptionEditPart(view);
			case 79:
				return new ProtocolEditPart(view);
			case 3001:
				return new Operation2EditPart(view);
			case 4004:
				return new Operation_operationAbbrev2EditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrapLabel)
			return new TextCellEditorLocator((WrapLabel) source.getFigure());
		else {
			IFigure figure = source.getFigure();
			return new LabelCellEditorLocator((Label) figure);
		}
	}

	static private class TextCellEditorLocator implements CellEditorLocator {

		private WrapLabel wrapLabel;

		public TextCellEditorLocator(WrapLabel wrapLabel) {
			super();
			this.wrapLabel = wrapLabel;
		}

		public WrapLabel getWrapLabel() {
			return wrapLabel;
		}

		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);

			if (getWrapLabel().isTextWrapped()
					&& getWrapLabel().getText().length() > 0)
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}

			if (!rect.equals(new Rectangle(text.getBounds())))
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
		}

	}

	private static class LabelCellEditorLocator implements CellEditorLocator {

		private Label label;

		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		public Label getLabel() {
			return label;
		}

		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);

			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));

			if (!rect.equals(new Rectangle(text.getBounds())))
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
		}
	}
}
