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

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gef.commands.UnexecutableCommand;

import org.eclipse.gmf.map.editor.providers.GMFMapElementTypes;

import org.eclipse.gmf.mappings.ChildReference;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.GMFMapPackage;

import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;

/**
 * @generated
 */
public class ChildReferenceItemSemanticEditPolicy extends GMFMapBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getMSLWrapper(new DestroyElementCommand(req) {

			protected EObject getElementToDestroy() {
				View view = (View) getHost().getModel();
				EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
				if (annotation != null) {
					return view;
				}
				return super.getElementToDestroy();
			}

		});
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (GMFMapElementTypes.ChildReferenceOwnedChild_4004 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingChildReference_OwnedChild4004Command(req) : null;
		}
		if (GMFMapElementTypes.ChildReferenceReferencedChild_4002 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingChildReference_ReferencedChild4002Command(req) : null;
		}
		if (GMFMapElementTypes.CompartmentMappingChildren_4003 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingCompartmentMapping_Children4003Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingChildReference_OwnedChild4004Command(CreateRelationshipRequest req) {
		ChildReference element = (ChildReference) getSemanticElement();
		if (element.getOwnedChild() != null) {
			return UnexecutableCommand.INSTANCE;
		}

		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingChildReference_ReferencedChild4002Command(CreateRelationshipRequest req) {
		ChildReference element = (ChildReference) getSemanticElement();
		if (element.getReferencedChild() != null) {
			return UnexecutableCommand.INSTANCE;
		}

		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingCompartmentMapping_Children4003Command(CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof CompartmentMapping)) {
			return UnexecutableCommand.INSTANCE;
		}
		CompartmentMapping element = (CompartmentMapping) req.getSource();
		if (element.getChildren().contains(req.getTarget())) {
			return UnexecutableCommand.INSTANCE;
		}
		SetRequest setReq = new SetRequest(req.getSource(), GMFMapPackage.eINSTANCE.getCompartmentMapping_Children(), req.getTarget());
		return getMSLWrapper(new SetValueCommand(setReq));
	}
}
