package provervisual.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.StackLayout;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;

import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.handles.ResizableHandleKit;

import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;

import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;

import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

import org.eclipse.gmf.runtime.notation.View;

import provervisual.diagram.edit.policies.OperationCanonicalEditPolicy;
import provervisual.diagram.edit.policies.OperationGraphicalNodeEditPolicy;
import provervisual.diagram.edit.policies.OperationItemSemanticEditPolicy;
import provervisual.diagram.edit.policies.ProVerVisualTextSelectionEditPolicy;

/**
 * @generated
 */
public class OperationEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static String VISUAL_ID = "1004";

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public OperationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new OperationItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new OperationGraphicalNodeEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new OperationCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new ConstrainedToolbarLayoutEditPolicy() {

					protected EditPolicy createChildEditPolicy(EditPart child) {
						if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
							if (child instanceof ITextAwareEditPart) {
								return new ProVerVisualTextSelectionEditPolicy();
							}
						}
						return super.createChildEditPolicy(child);
					}
				});
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		OperationOverview figure = new OperationOverview();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public OperationOverview getPrimaryShape() {
		return (OperationOverview) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Operation_operationAbbrevEditPart) {
			((Operation_operationAbbrevEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureOperationOperationAbbrevFigure());
			return true;
		}
		if (childEditPart instanceof Operation_operationNameEditPart) {
			((Operation_operationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureOperationOperationNameFigure());
			return true;
		}
		if (childEditPart instanceof Operation_operationDescriptionEditPart) {
			((Operation_operationDescriptionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureOperationOperationDescriptionFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		return new DefaultSizeNodeFigure(getMapMode().DPtoLP(40), getMapMode()
				.DPtoLP(40));
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		return new ResizableShapeEditPolicy() {
			protected List createSelectionHandles() {
				final GraphicalEditPart part = (GraphicalEditPart) getHost();
				final List list = new ArrayList();
				addMoveHandle(part, list);

				ResizableHandleKit.addHandle(part, list,
						PositionConstants.NORTH);

				ResizableHandleKit.addHandle(part, list,
						PositionConstants.SOUTH);

				ResizableHandleKit
						.addHandle(part, list, PositionConstants.WEST);

				ResizableHandleKit
						.addHandle(part, list, PositionConstants.EAST);

				ResizableHandleKit.addHandle(part, list,
						PositionConstants.NORTH_EAST);

				ResizableHandleKit.addHandle(part, list,
						PositionConstants.NORTH_WEST);

				ResizableHandleKit.addHandle(part, list,
						PositionConstants.SOUTH_EAST);

				ResizableHandleKit.addHandle(part, list,
						PositionConstants.SOUTH_WEST);

				return list;
			}

			private void addMoveHandle(final GraphicalEditPart part,
					final List list) {
				MoveHandle moveHandle = new MoveHandle(part);
				// just make it look nice 
				moveHandle.setBorder(null);
				list.add(moveHandle);
			}
		};
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(getMapMode().DPtoLP(5));
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(Operation_operationAbbrevEditPart.VISUAL_ID);
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (!addFixedChild(childEditPart)) {
			super.addChildVisual(childEditPart, -1);
		}
	}

	/**
	 * @generated
	 */
	public class OperationOverview extends org.eclipse.draw2d.RoundedRectangle {

		/**
		 * @generated
		 */
		public OperationOverview() {

			this.setLineWidth(2);
			this.setBackgroundColor(new org.eclipse.swt.graphics.Color(null,
					240, 255, 0));
			this.setPreferredSize(getMapMode().DPtoLP(140), getMapMode()
					.DPtoLP(70));
			this.setCornerDimensions(new org.eclipse.draw2d.geometry.Dimension(
					getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));

			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel childOperationOperationAbbrevFigure = createFigureOperationOperationAbbrevFigure();
			setFigureOperationOperationAbbrevFigure(childOperationOperationAbbrevFigure);
			add(childOperationOperationAbbrevFigure);

			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel childOperationOperationDescriptionFigure = createFigureOperationOperationDescriptionFigure();
			setFigureOperationOperationDescriptionFigure(childOperationOperationDescriptionFigure);
			add(childOperationOperationDescriptionFigure);

			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel childOperationOperationNameFigure = createFigureOperationOperationNameFigure();
			setFigureOperationOperationNameFigure(childOperationOperationNameFigure);
			add(childOperationOperationNameFigure);

		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fOperationOperationAbbrevFigure;

		/**
		 * @generated
		 */
		public org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel getFigureOperationOperationAbbrevFigure() {
			return fOperationOperationAbbrevFigure;
		}

		/**
		 * @generated
		 */
		protected void setFigureOperationOperationAbbrevFigure(
				org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel figure) {
			fOperationOperationAbbrevFigure = figure;
		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel createFigureOperationOperationAbbrevFigure() {
			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel OperationOperationAbbrevFigure = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			OperationOperationAbbrevFigure.setText("<...>");

			return OperationOperationAbbrevFigure;
		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fOperationOperationDescriptionFigure;

		/**
		 * @generated
		 */
		public org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel getFigureOperationOperationDescriptionFigure() {
			return fOperationOperationDescriptionFigure;
		}

		/**
		 * @generated
		 */
		protected void setFigureOperationOperationDescriptionFigure(
				org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel figure) {
			fOperationOperationDescriptionFigure = figure;
		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel createFigureOperationOperationDescriptionFigure() {
			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel OperationOperationDescriptionFigure = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			OperationOperationDescriptionFigure.setText("<...>");

			return OperationOperationDescriptionFigure;
		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fOperationOperationNameFigure;

		/**
		 * @generated
		 */
		public org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel getFigureOperationOperationNameFigure() {
			return fOperationOperationNameFigure;
		}

		/**
		 * @generated
		 */
		protected void setFigureOperationOperationNameFigure(
				org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel figure) {
			fOperationOperationNameFigure = figure;
		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel createFigureOperationOperationNameFigure() {
			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel OperationOperationNameFigure = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			OperationOperationNameFigure.setText("<...>");

			return OperationOperationNameFigure;
		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

	}

}
