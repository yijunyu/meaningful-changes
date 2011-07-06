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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.map.editor.providers.GMFMapElementTypes;

import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.GMFMapPackage;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CanvasMappingContentsItemSemanticEditPolicy extends GMFMapBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GMFMapElementTypes.TopNodeReference_3001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFMapPackage.eINSTANCE.getMapping_Nodes());
			}
			return getMSLWrapper(new CreateTopNodeReference_3001Command(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	private static class CreateTopNodeReference_3001Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateTopNodeReference_3001Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated NOT
		 */
		protected EClass getEClassToEdit() {
			return GMFMapPackage.eINSTANCE.getMapping();
		};

		/**
		 * @generated
		 */
		protected EObject getElementToEditGen() {
			EObject container = ((CreateElementRequest) getRequest()).getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}

		protected EObject getElementToEdit() {
			EObject element = getElementToEditGen();
			return element == null ? null : element.eContainer();
		}
	}

}
