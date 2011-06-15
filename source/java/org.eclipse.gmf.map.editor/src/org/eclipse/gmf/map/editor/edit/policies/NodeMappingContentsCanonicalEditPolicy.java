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

import org.eclipse.gmf.map.editor.edit.parts.ChildReferenceEditPart;
import org.eclipse.gmf.map.editor.edit.parts.CompartmentMappingEditPart;

import org.eclipse.gmf.map.editor.edit.parts.DesignLabelMappingEditPart;
import org.eclipse.gmf.map.editor.edit.parts.LabelMappingEditPart;

import org.eclipse.gmf.map.editor.part.GMFMapVisualIDRegistry;

import org.eclipse.gmf.mappings.MappingEntry;
import org.eclipse.gmf.mappings.NodeMapping;

/**
 * @generated
 */
public class NodeMappingContentsCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		List result = new LinkedList();
		EObject modelObject = ((View) getHost().getModel()).getElement();
		View viewObject = (View) getHost().getModel();
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((NodeMapping) modelObject).getChildren().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = GMFMapVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (ChildReferenceEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((NodeMapping) modelObject).getCompartments().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = GMFMapVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (CompartmentMappingEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
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
