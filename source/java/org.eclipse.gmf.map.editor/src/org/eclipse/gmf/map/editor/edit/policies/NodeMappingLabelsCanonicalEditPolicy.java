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
package org.eclipse.gmf.map.editor.edit.policies;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.map.editor.edit.parts.DesignLabelMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.FeatureLabelMappingEditPart;

import org.eclipse.gmf.map.editor.edit.parts.LabelMappingEditPart;

import org.eclipse.gmf.map.editor.part.GMFMapVisualIDRegistry;

import org.eclipse.gmf.mappings.MappingEntry;

/**
 * @generated
 */
public class NodeMappingLabelsCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		List result = new LinkedList();
		EObject modelObject = ((View) getHost().getModel()).getElement();
		View viewObject = (View) getHost().getModel();
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((MappingEntry) modelObject).getLabelMappings().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = GMFMapVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			switch (nodeVID) {
			case FeatureLabelMappingEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case DesignLabelMappingEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case LabelMappingEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean shouldDeleteView(View view) {
		return view.isSetElement() && view.getElement() != null && view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

}
