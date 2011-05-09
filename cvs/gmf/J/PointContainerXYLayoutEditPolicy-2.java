/**
 * Copyright (c) 2008 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alexander Shatalin (Borland) - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.edit.polocies;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;

public class PointContainerXYLayoutEditPolicy extends AbstractDomainBasedXYLayoutEditPolicy {

	public PointContainerXYLayoutEditPolicy(IMapMode mapMode) {
		super(mapMode);
	}

	@Override
	protected ICommand createSetBoundsCommand(TransactionalEditingDomain editingDomain, String label, Resource resource, ViewDescriptor viewDescriptor, Rectangle rect) {
		return new SetBoundsCommand(editingDomain, label, resource, viewDescriptor, rect);
	}

	@Override
	protected ICommand createSetBoundsCommand(TransactionalEditingDomain editingDomain, String label, Resource resource, Rectangle bounds, EObject element) {
		if (element instanceof Point) {
			Point point = (Point) element;
			return new SetBoundsCommand(editingDomain, label, resource, bounds, point);
		}
		return null;
	}

	private final class SetBoundsCommand extends AbstractTransactionalCommand {

		private Rectangle myBounds;

		private Point myPoint;

		private IAdaptable myAdaptable;

		protected SetBoundsCommand(TransactionalEditingDomain domain, String label, Resource resource, Rectangle bounds, Point point) {
			super(domain, label, Collections.singletonList(WorkspaceSynchronizer.getFile(resource)));
			myBounds = bounds;
			myPoint = point;
		}

		protected SetBoundsCommand(TransactionalEditingDomain domain, String label, Resource resource, IAdaptable adaptable, Rectangle bounds) {
			super(domain, label, Collections.singletonList(WorkspaceSynchronizer.getFile(resource)));
			myBounds = bounds;
			myAdaptable = adaptable;
		}

		private Point getPoint() {
			if (myPoint != null) {
				return myPoint;
			}
			View view = (View) myAdaptable.getAdapter(View.class);
			return (Point) view.getElement();
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			int x = getMapMode().LPtoDP(myBounds.x);
			int y = getMapMode().LPtoDP(myBounds.y);
			Point point = getPoint();
			point.setX(x);
			point.setY(y);
			return CommandResult.newOKCommandResult();
		}
	}

}
