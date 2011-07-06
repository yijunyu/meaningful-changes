/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.map.editor.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.draw2d.Connection;

import org.eclipse.gef.EditPolicy;

import org.eclipse.gmf.map.editor.edit.policies.GMFMapReferenceConnectionEditPolicy;
import org.eclipse.gmf.map.editor.edit.policies.TopNodeReferenceOwnedChildItemSemanticEditPolicy;

import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;

/**
 * @generated
 */
public class TopNodeReferenceOwnedChildEditPart extends ConnectionNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public TopNodeReferenceOwnedChildEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.CONNECTION_ROLE, new GMFMapReferenceConnectionEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new TopNodeReferenceOwnedChildItemSemanticEditPolicy());

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
		return new OwnedNodeFigure();
	}

	/**
	 * @generated
	 */
	public class OwnedNodeFigure extends org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx {

		/**
		 * @generated
		 */
		public OwnedNodeFigure() {
			this.setForegroundColor(org.eclipse.draw2d.ColorConstants.darkBlue);
			setSourceDecoration(createSourceDecoration());
		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.map.editor.figures.CircleDecoration createSourceDecoration() {
			org.eclipse.gmf.map.editor.figures.CircleDecoration df = new org.eclipse.gmf.map.editor.figures.CircleDecoration();

			df.setPreferredSize(getMapMode().DPtoLP(10), getMapMode().DPtoLP(10));

			return df;
		}

	}

}
