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

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.gmf.map.editor.providers.GMFMapElementTypes;

import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.Mapping;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MappingItemSemanticEditPolicy extends GMFMapBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GMFMapElementTypes.CanvasMapping_2001 == req.getElementType()) {
			Mapping container = (Mapping) (req.getContainer() instanceof View ? ((View) req.getContainer()).getElement() : req.getContainer());
			if (container.getDiagram() != null) {
				return super.getCreateCommand(req);
			}
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFMapPackage.eINSTANCE.getMapping_Diagram());
			}
			return getMSLWrapper(new CreateCanvasMapping_2001Command(req));
		}
		if (GMFMapElementTypes.NodeMapping_2003 == req.getElementType()) {
			return getMSLWrapper(new CreateNodeMapping_2003Command(req));
		}
		if (GMFMapElementTypes.LinkMapping_2002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GMFMapPackage.eINSTANCE.getMapping_Links());
			}
			return getMSLWrapper(new CreateLinkMapping_2002Command(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	private static class CreateCanvasMapping_2001Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateCanvasMapping_2001Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return GMFMapPackage.eINSTANCE.getMapping();
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
	private static class CreateNodeMapping_2003Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateNodeMapping_2003Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return GMFMapPackage.eINSTANCE.getMapping();
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

		/**
		 * @generated
		 */
		public boolean canExecute() {
			if (getEClass() != null) {
				return getEClass().isSuperTypeOf(getEClassToEdit());
			}
			return true;
		}

		/**
		 * @generated
		 */
		protected EReference getContainmentFeature() {
			return null;
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			// Uncomment to put "phantom" objects into the diagram file.		
			//Resource resource = ((CreateElementRequest) getRequest()).getContainer().eResource();
			//if (resource == null) {
			//	return null;
			//}
			Resource resource = getElementToEdit().eResource();
			EClass eClass = getElementType().getEClass();
			EObject eObject = eClass.getEPackage().getEFactoryInstance().create(eClass);
			resource.getContents().add(eObject);
			return eObject;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateLinkMapping_2002Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateLinkMapping_2002Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return GMFMapPackage.eINSTANCE.getMapping();
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
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getMSLWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}
	}
}
