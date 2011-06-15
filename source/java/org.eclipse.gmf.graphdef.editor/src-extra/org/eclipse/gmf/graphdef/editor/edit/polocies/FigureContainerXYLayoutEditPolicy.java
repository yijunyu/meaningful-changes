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
import org.eclipse.gmf.gmfgraph.Alignment;
import org.eclipse.gmf.gmfgraph.BorderLayout;
import org.eclipse.gmf.gmfgraph.BorderLayoutData;
import org.eclipse.gmf.gmfgraph.Dimension;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FlowLayout;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.GridLayout;
import org.eclipse.gmf.gmfgraph.Layout;
import org.eclipse.gmf.gmfgraph.Layoutable;
import org.eclipse.gmf.gmfgraph.StackLayout;
import org.eclipse.gmf.gmfgraph.XYLayout;
import org.eclipse.gmf.gmfgraph.XYLayoutData;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;

public class FigureContainerXYLayoutEditPolicy extends AbstractDomainBasedXYLayoutEditPolicy {

	public FigureContainerXYLayoutEditPolicy(IMapMode mapMode) {
		super(mapMode);
	}

	@Override
	protected ICommand createSetBoundsCommand(TransactionalEditingDomain editingDomain, String label, Resource resource, Rectangle bounds, EObject element) {
		if (element instanceof Figure) {
			Figure figure = (Figure) element;
			return new SetBoundsCommand(editingDomain, label, resource, bounds, figure, getMainFigureLayout());
		}
		return null;
	}

	@Override
	protected ICommand createSetBoundsCommand(TransactionalEditingDomain editingDomain, String label, Resource resource, ViewDescriptor viewDescriptor, Rectangle rect) {
		return new SetBoundsCommand(editingDomain, label, resource, viewDescriptor, rect, getMainFigureLayout());
	}

	private Layout getMainFigureLayout() {
		if (getHost().getModel() instanceof View) {
			EObject domainModelElement = ((View) getHost().getModel()).getElement();
			if (domainModelElement instanceof Layoutable) {
				return ((Layoutable) domainModelElement).getLayout();
			}
		}
		return null;
	}

	private final class SetBoundsCommand extends AbstractTransactionalCommand {

		private Rectangle myBounds;

		private Figure myFigure;

		private IAdaptable myAdaptable;

		private Layout myParentFigureLayout;

		protected SetBoundsCommand(TransactionalEditingDomain domain, String label, Resource resource, Rectangle bounds, Figure figure, Layout parentFigureLayout) {
			super(domain, label, Collections.singletonList(WorkspaceSynchronizer.getFile(resource)));
			myBounds = bounds;
			myFigure = figure;
			myParentFigureLayout = parentFigureLayout;
		}

		protected SetBoundsCommand(TransactionalEditingDomain domain, String label, Resource resource, IAdaptable adaptable, Rectangle bounds, Layout parentFigureLayout) {
			super(domain, label, Collections.singletonList(WorkspaceSynchronizer.getFile(resource)));
			myBounds = bounds;
			myAdaptable = adaptable;
			myParentFigureLayout = parentFigureLayout;
		}

		private Figure getFigure() {
			if (myFigure != null) {
				return myFigure;
			}
			View view = (View) myAdaptable.getAdapter(View.class);
			return (Figure) view.getElement();
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			int x = getMapMode().LPtoDP(myBounds.x);
			int y = getMapMode().LPtoDP(myBounds.y);
			int width = getMapMode().LPtoDP(myBounds.width);
			int height = getMapMode().LPtoDP(myBounds.height);

			if (myParentFigureLayout instanceof XYLayout) {
				setXYLayoutBounds(x, y, width, height, getFigure());
			} else if (myParentFigureLayout instanceof BorderLayout) {
				setBorderLayoutBounds(x, y, width, height, getFigure());
			} else if (myParentFigureLayout instanceof FlowLayout) {
				setFlowLayoutBounds(x, y, width, height, getFigure());
			} else if (myParentFigureLayout instanceof GridLayout) {
				setGridLayoutBounds(x, y, width, height, getFigure());
			} else if (myParentFigureLayout instanceof StackLayout) {
				// Nothing to do here
			} else {
				setNoLayoutBounds(x, y, width, height, getFigure());
			}
			return CommandResult.newOKCommandResult();
		}

		private void setNoLayoutBounds(int x, int y, int width, int height, Figure figure) {
			setLocation(x, y, figure);
			setPreferredSize(width, height, figure);
		}

		private void setLocation(int x, int y, Figure figure) {
			org.eclipse.gmf.gmfgraph.Point location = figure.getLocation() != null ? figure.getLocation() : GMFGraphFactory.eINSTANCE.createPoint();
			location.setX(x);
			location.setY(y);
			if (figure.getLocation() == null) {
				figure.setLocation(location);
			}
		}

		private void setPreferredSize(int width, int height, Figure figure) {
			Dimension preferredSize = figure.getPreferredSize() != null ? figure.getPreferredSize() : GMFGraphFactory.eINSTANCE.createDimension();
			preferredSize.setDx(width);
			preferredSize.setDy(height);
			if (figure.getPreferredSize() == null) {
				figure.setPreferredSize(preferredSize);
			}
		}

		private void setGridLayoutBounds(int x, int y, int width, int height, Figure figure) {
			setPreferredSize(width, height, figure);
		}

		private void setFlowLayoutBounds(int x, int y, int width, int height, Figure figure) {
			setPreferredSize(width, height, figure);
		}

		private void setBorderLayoutBounds(int x, int y, int width, int height, Figure figure) {
			if (false == figure.getLayoutData() instanceof BorderLayoutData) {
				BorderLayoutData layoutData = GMFGraphFactory.eINSTANCE.createBorderLayoutData();
				layoutData.setAlignment(Alignment.BEGINNING_LITERAL);
				figure.setLayoutData(layoutData);
			}
			BorderLayoutData borderLayoutData = (BorderLayoutData) figure.getLayoutData();
			if (borderLayoutData.getAlignment() == Alignment.CENTER_LITERAL) {
				return;
			}
			Dimension preferredSize = figure.getPreferredSize() != null ? figure.getPreferredSize() : GMFGraphFactory.eINSTANCE.createDimension();
			if (borderLayoutData.isVertical()) {
				preferredSize.setDy(height);
			} else {
				preferredSize.setDx(width);
			}
			if (figure.getPreferredSize() == null) {
				figure.setPreferredSize(preferredSize);
			}
		}

		private void setXYLayoutBounds(int x, int y, int width, int height, Figure figure) {
			// TODO: add -1 as a possible value to XYLayoutData property sheet -
			// > then preferred size should be used.
			// setPreferredSize(width, height, figure);
			XYLayoutData xyLayoutData = figure.getLayoutData() instanceof XYLayoutData ? (XYLayoutData) figure.getLayoutData() : createXYLayoutData();
			xyLayoutData.getTopLeft().setX(x);
			xyLayoutData.getTopLeft().setY(y);
			xyLayoutData.getSize().setDx(width);
			xyLayoutData.getSize().setDy(height);
			if (false == figure.getLayoutData() instanceof XYLayoutData) {
				figure.setLayoutData(xyLayoutData);
			}

		}

		private XYLayoutData createXYLayoutData() {
			XYLayoutData layoutData = GMFGraphFactory.eINSTANCE.createXYLayoutData();
			layoutData.setTopLeft(GMFGraphFactory.eINSTANCE.createPoint());
			layoutData.setSize(GMFGraphFactory.eINSTANCE.createDimension());
			return layoutData;
		}
	}

}
