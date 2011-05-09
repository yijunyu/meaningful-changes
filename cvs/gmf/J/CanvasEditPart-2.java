package org.eclipse.gmf.graphdef.editor.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.graphdef.editor.edit.policies.CanvasCanonicalEditPolicy;
import org.eclipse.gmf.graphdef.editor.edit.policies.CanvasItemSemanticEditPolicy;

/**
 * @generated
 */
public class CanvasEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public static String MODEL_ID = "GMFGraph";

	/**
	 * @generated
	 */
	public CanvasEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CanvasItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new CanvasCanonicalEditPolicy());
	}
}
