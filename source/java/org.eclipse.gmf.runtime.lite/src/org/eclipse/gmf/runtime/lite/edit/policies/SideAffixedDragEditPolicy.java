/**
 * Copyright (c) 2007 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.edit.policies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Handle;
import org.eclipse.gef.SharedCursors;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.NonResizableHandleKit;
import org.eclipse.gef.requests.AlignmentRequest;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.tools.DragEditPartsTracker;
import org.eclipse.gmf.runtime.lite.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.lite.commands.WrappingCommand;
import org.eclipse.gmf.runtime.lite.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.swt.graphics.Cursor;

/**
 * Edit policy responsible for primary dragging.
 * @author bblajer
 * @see EditPolicy#PRIMARY_DRAG_ROLE
 */
public class SideAffixedDragEditPolicy extends NonResizableEditPolicy {
	@Override
	protected Command getMoveCommand(ChangeBoundsRequest request) {
		BorderItemLocator borderItemLocator = getBorderItemLocator();
		if (borderItemLocator == null) {
			return super.getMoveCommand(request);
		}
		final PrecisionRectangle rect = new PrecisionRectangle(getHostFigure().getBounds());	//.getCopy() is not needed: PrecisionRectangle does not change the argument
		getHostFigure().translateToAbsolute(rect);
		rect.translate(request.getMoveDelta());
		rect.resize(request.getSizeDelta());

		IFigure parentFigure = ((GraphicalEditPart) getHost().getParent()).getFigure();
		Point parentTopLeft = parentFigure.getBounds().getTopLeft();
		parentFigure.translateToRelative(rect);
		Rectangle realLocation = getBorderItemLocator().getValidLocation(rect);
		realLocation.translate(parentTopLeft.getNegated());
		final Node node = (Node) getHost().getModel();
		SetBoundsCommand command = new SetBoundsCommand(node, realLocation);
		return new WrappingCommand(TransactionUtil.getEditingDomain(node), command);
	}

	protected BorderItemLocator getBorderItemLocator() {
		Object result = getHostFigure().getParent().getLayoutManager().getConstraint(getHostFigure());
		return result instanceof BorderItemLocator ? (BorderItemLocator) result : null;
	}

	/** Return <tt>null</tt> to avoid handling the request. */
	protected Command getAlignCommand(AlignmentRequest request) {
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected List createSelectionHandles() {
		ArrayList<Handle> result = new ArrayList<Handle>();
		NonResizableHandleKit.addHandles((GraphicalEditPart) getHost(), result, getSideAffixedElementDragTracker(), getHandleCursor());
		return result;
	}

	/**
	 * Returns the drag tracker to be used by handles. By default, a drag tracker that interprets all drags as moves
	 * is used.
	 */
	private DragTracker getSideAffixedElementDragTracker() {
		return new DragEditPartsTracker(getHost()) {
			@Override
			protected boolean isMove() {
				return true;
			}
		};
	}

	/**
	 * Returns the cursor to be used by handles. By default, HAND cursor is used. Subclasses may override.
	 */
	protected Cursor getHandleCursor() {
		return SharedCursors.HAND;
	}

	@Override
	protected void showChangeBoundsFeedback(ChangeBoundsRequest request) {
		BorderItemLocator borderItemLocator = getBorderItemLocator();
		if (borderItemLocator == null) {
			super.showChangeBoundsFeedback(request);
			return;
		}
		PrecisionRectangle rect = new PrecisionRectangle(getInitialFeedbackBounds());	//.getCopy() is not needed: PrecisionRectangle does not change the argument
		getHostFigure().translateToAbsolute(rect);
		rect.translate(request.getMoveDelta());
		rect.resize(request.getSizeDelta());

		IFigure parentFigure = ((GraphicalEditPart) getHost().getParent()).getFigure();
		parentFigure.translateToRelative(rect);
		Rectangle realLocation = getBorderItemLocator().getValidLocation(rect);
		parentFigure.translateToAbsolute(realLocation);

		IFigure feedback = getDragSourceFeedbackFigure();
		feedback.translateToRelative(realLocation);
		feedback.setBounds(realLocation);
	}
}
