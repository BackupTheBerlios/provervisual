package provervisual.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import provervisual.diagram.edit.policies.ProtocolCanonicalEditPolicy;
import provervisual.diagram.edit.policies.ProtocolItemSemanticEditPolicy;

/**
 * @generated
 */
public class ProtocolEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public static String MODEL_ID = "ProVerVisual";

	/**
	 * @generated
	 */
	public ProtocolEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ProtocolItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new ProtocolCanonicalEditPolicy());
	}
}
