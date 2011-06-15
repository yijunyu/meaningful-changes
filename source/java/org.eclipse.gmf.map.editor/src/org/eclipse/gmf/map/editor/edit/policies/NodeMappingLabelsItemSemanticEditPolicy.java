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

import org.eclipse.gmf.mappings.GMFMapPackage;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class NodeMappingLabelsItemSemanticEditPolicy extends GMFMapBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GMFMapElementTypes.FeatureLabelMapping_3006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFMapPackage.eINSTANCE.getMappingEntry_LabelMappings());
			}
			return getMSLWrapper(new CreateFeatureLabelMapping_3006Command(req));
		}
		if (GMFMapElementTypes.DesignLabelMapping_3007 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFMapPackage.eINSTANCE.getMappingEntry_LabelMappings());
			}
			return getMSLWrapper(new CreateDesignLabelMapping_3007Command(req));
		}
		if (GMFMapElementTypes.LabelMapping_3002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFMapPackage.eINSTANCE.getMappingEntry_LabelMappings());
			}
			return getMSLWrapper(new CreateLabelMapping_3002Command(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	private static class CreateFeatureLabelMapping_3006Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateFeatureLabelMapping_3006Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return GMFMapPackage.eINSTANCE.getNodeMapping();
		};

		/**
		 * @generated
		 */
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest()).getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateDesignLabelMapping_3007Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateDesignLabelMapping_3007Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return GMFMapPackage.eINSTANCE.getNodeMapping();
		};

		/**
		 * @generated
		 */
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest()).getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateLabelMapping_3002Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateLabelMapping_3002Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return GMFMapPackage.eINSTANCE.getNodeMapping();
		};

		/**
		 * @generated
		 */
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest()).getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}
	}

}
