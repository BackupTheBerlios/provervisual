package provervisual.diagram.edit.parts;

import javax.swing.text.StyleConstants.ColorConstants;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import provervisual.diagram.edit.policies.Operation2ItemSemanticEditPolicy;

/**
 * @generated
 */
public class Operation2EditPart extends ConnectionNodeEditPart {

	/**
	 * @generated
	 */
	public static String VISUAL_ID = "3001";

	/**
	 * @generated
	 */
	public Operation2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Operation2ItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected Connection createConnectionFigure() {
		return new Operation();
	}

	/**
	 * @generated
	 */
	public class Operation extends
			org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx {

		/**
		 * @generated
		 */
		public Operation() {

			this.setLineWidth(2);
			setTargetDecoration(createTargetDecoration());

		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.PolylineDecoration createTargetDecoration() {
			org.eclipse.draw2d.PolylineDecoration df = new org.eclipse.draw2d.PolylineDecoration();
			// dispatchNext?

			df.setLineWidth(2);
			org.eclipse.draw2d.geometry.PointList pl = new org.eclipse.draw2d.geometry.PointList();
			pl.addPoint(-2, -2);
			pl.addPoint(0, 0);
			pl.addPoint(-2, 2);
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));

			return df;
		}
	}
}
