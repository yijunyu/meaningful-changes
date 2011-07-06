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
package org.eclipse.gmf.runtime.lite.figures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;

/**
 * Positions creation feedback to give the user an idea where the element will be created.
 * @author bblajer
 */
public class SideAffixedFeedbackPositioner extends SideAffixedElementPositioner {
	private final GraphicalEditPart myHost;
	private IFigure mySiblingsParent;
	private Dimension myProposedSize;

	public SideAffixedFeedbackPositioner(GraphicalEditPart hostEditPart) {
		myHost = hostEditPart;
	}

	public void setSiblingsParent(IFigure figure) {
		mySiblingsParent = figure;
	}

	protected IFigure getSiblingsParent() {
		if (mySiblingsParent == null) {
			return myHost.getFigure();
		}
		return mySiblingsParent;
	}

	@Override
	public Rectangle getValidLocation(Rectangle proposedLocation) {
		myProposedSize = proposedLocation.getSize();
		return super.getValidLocation(proposedLocation);
	}

	@Override
	protected Dimension getBorderItemSize() {
		return myProposedSize == null ? new Dimension(-1, -1) : myProposedSize;
	}

	@Override
	protected IFigure getHostFigure() {
		return myHost.getFigure();
	}

	@Override
	protected Collection<? extends IFigure> getSiblings() {
		List<?> children = myHost.getChildren();
		Collection<IFigure> result = new ArrayList<IFigure>(children.size());
		for (Object next : children) {
			GraphicalEditPart nextChild = (GraphicalEditPart) next;
			if (!nextChild.isActive()) {
				continue;
			}
			IFigure nextFigure = nextChild.getFigure();
			if (nextFigure.getParent() == getSiblingsParent()) {
				result.add(nextChild.getFigure());
			}
		}
		return result;
	}

}
