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

import provervisual.diagram.edit.policies.FinalStateCanonicalEditPolicy;
import provervisual.diagram.edit.policies.FinalStateGraphicalNodeEditPolicy;
import provervisual.diagram.edit.policies.FinalStateItemSemanticEditPolicy;
import provervisual.diagram.edit.policies.ProVerVisualTextSelectionEditPolicy;

/**
 * @generated
 */
public class FinalStateEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static String VISUAL_ID = "1002";

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
	public FinalStateEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new FinalStateItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new FinalStateGraphicalNodeEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new FinalStateCanonicalEditPolicy());
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
		FinalState figure = new FinalState();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public FinalState getPrimaryShape() {
		return (FinalState) primaryShape;
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
	public class FinalState extends org.eclipse.draw2d.Ellipse {

		/**
		 * @generated
		 */
		public FinalState() {

			this.setLineWidth(3);
			this.setForegroundColor(new org.eclipse.swt.graphics.Color(null, 0,
					0, 0));
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
