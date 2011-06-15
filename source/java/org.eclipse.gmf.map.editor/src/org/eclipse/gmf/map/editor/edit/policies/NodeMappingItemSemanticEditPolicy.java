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
import org.eclipse.core.commands.ExecutionException;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.gef.commands.UnexecutableCommand;

import org.eclipse.gmf.map.editor.providers.GMFMapElementTypes;

import org.eclipse.gmf.mappings.ChildReference;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.TopNodeReference;

import org.eclipse.gmf.runtime.common.core.command.CommandResult;

import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;

/**
 * @generated
 */
public class NodeMappingItemSemanticEditPolicy extends GMFMapBaseItemSemanticEditPolicy {

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

			protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
				EObject eObject = getElementToDestroy();
				boolean removeFromResource = eObject.eContainer() == null;
				CommandResult result = super.doExecuteWithResult(progressMonitor, info);
				Resource resource = eObject.eResource();
				if (removeFromResource && resource != null) {
					resource.getContents().remove(eObject);
				}
				return result;
			}
		});
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (GMFMapElementTypes.TopNodeReferenceOwnedChild_4001 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingTopNodeReference_OwnedChild4001Command(req);
		}
		if (GMFMapElementTypes.ChildReferenceOwnedChild_4004 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingChildReference_OwnedChild4004Command(req);
		}
		if (GMFMapElementTypes.ChildReferenceReferencedChild_4002 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingChildReference_ReferencedChild4002Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingTopNodeReference_OwnedChild4001Command(CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof TopNodeReference)) {
			return UnexecutableCommand.INSTANCE;
		}
		TopNodeReference element = (TopNodeReference) req.getSource();
		if (element.getOwnedChild() != null) {
			return UnexecutableCommand.INSTANCE;
		}
		SetRequest setReq = new SetRequest(req.getSource(), GMFMapPackage.eINSTANCE.getTopNodeReference_OwnedChild(), req.getTarget());
		return getMSLWrapper(new SetValueCommand(setReq));
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingChildReference_OwnedChild4004Command(CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof ChildReference)) {
			return UnexecutableCommand.INSTANCE;
		}
		ChildReference element = (ChildReference) req.getSource();
		if (element.getOwnedChild() != null) {
			return UnexecutableCommand.INSTANCE;
		}
		SetRequest setReq = new SetRequest(req.getSource(), GMFMapPackage.eINSTANCE.getChildReference_OwnedChild(), req.getTarget());
		return getMSLWrapper(new SetValueCommand(setReq));
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingChildReference_ReferencedChild4002Command(CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof ChildReference)) {
			return UnexecutableCommand.INSTANCE;
		}
		ChildReference element = (ChildReference) req.getSource();
		if (element.getReferencedChild() != null) {
			return UnexecutableCommand.INSTANCE;
		}
		SetRequest setReq = new SetRequest(req.getSource(), GMFMapPackage.eINSTANCE.getChildReference_ReferencedChild(), req.getTarget());
		return getMSLWrapper(new SetValueCommand(setReq));
	}
}
