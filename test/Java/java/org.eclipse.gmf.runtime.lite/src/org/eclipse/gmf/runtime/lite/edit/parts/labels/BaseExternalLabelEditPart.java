/**
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.edit.parts.labels;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Handle;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.SharedCursors;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.handles.NonResizableHandleKit;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.tools.DragEditPartsTracker;
import org.eclipse.gmf.runtime.lite.commands.ChangeLocationCommand;
import org.eclipse.gmf.runtime.lite.commands.WrappingCommand;
import org.eclipse.gmf.runtime.lite.edit.parts.update.IExternallyUpdatableEditPart;
import org.eclipse.gmf.runtime.lite.edit.parts.update.UpdaterUtil;
import org.eclipse.gmf.runtime.lite.figures.ExternalChildPositionTracker;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.graphics.Cursor;

public abstract class BaseExternalLabelEditPart extends AbstractGraphicalEditPart {
	public BaseExternalLabelEditPart(View view) {
		setModel(view);
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ResizableEditPolicy() {
			@Override
			public EditPart getTargetEditPart(Request request) {
				if (RequestConstants.REQ_SELECTION.equals(request.getType())) {
					return getHost().getParent();
				}
				return super.getTargetEditPart(request);
			}
			@Override
			protected Command getMoveCommand(ChangeBoundsRequest request) {
				final Node node = (Node) getModel();
				ChangeLocationCommand emfCommand = new ChangeLocationCommand(node, request, getFigure());
				return new WrappingCommand(TransactionUtil.getEditingDomain(node.getDiagram().getElement()), emfCommand);
			}
		});
	}

	public List<Handle> createSelectionHandles() {
		ArrayList<Handle> result = new ArrayList<Handle>();
		NonResizableHandleKit.addHandles(this, result, getLabelDragTracker(), getHandleCursor());
		return result;
	}

	protected Cursor getHandleCursor() {
		return SharedCursors.HAND;
	}

	protected DragTracker getLabelDragTracker() {
		return new DragEditPartsTracker(this) {
			@Override
			protected boolean isMove() {
				return true;
			}
			@Override
			protected boolean handleButtonUp(int button) {
				boolean result = super.handleButtonUp(button);
				getViewer().setSelection(new StructuredSelection(getParent()));
				return result;
			}
		};
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(Class key) {
		if (ExternalChildPositionTracker.class == key) {
			return getPositionTracker();
		}
		return super.getAdapter(key);
	}

	@Override
	public DragTracker getDragTracker(Request request) {
		return getLabelDragTracker();
	}

	public ExternalChildPositionTracker getPositionTracker() {
		if (myPositionTracker == null) {
			myPositionTracker = new ExternalChildPositionTracker(this);
		}
		return myPositionTracker;
	}

	protected IExternallyUpdatableEditPart.ExternalRefresher boundsRefresher = new IExternallyUpdatableEditPart.ExternalRefresher() {
		public void refresh() {
			if (!isActive()) {
				return;
			}
			refreshBounds();
		}
		public boolean isAffectingEvent(Notification msg) {
			if (NotationPackage.eINSTANCE.getLocation().getEStructuralFeatures().contains(msg.getFeature())) {
				return true;
			}
			if (NotationPackage.eINSTANCE.getNode_LayoutConstraint() == msg.getFeature()) {
				return UpdaterUtil.affects(msg, NotationPackage.eINSTANCE.getLocation());
			}
			return false;
		}
	};

	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshBounds();
	}

	protected abstract void refreshBounds();

	private ExternalChildPositionTracker myPositionTracker;
}
