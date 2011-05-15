/******************************************************************************
 * Copyright (c) 2002, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.diagram.ui.editpolicies;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.jface.util.Assert;
import org.eclipse.swt.graphics.Image;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.decorator.Decoration;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.decorator.DecoratorService;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.decorator.IDecoratorTargetBase.Direction;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoration;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecorator;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.gmf.runtime.draw2d.ui.internal.figures.ImageFigureEx;
import org.eclipse.gmf.runtime.draw2d.ui.internal.figures.OnConnectionLocator;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapMode;
import org.eclipse.gmf.runtime.gef.ui.internal.editpolicies.GraphicalEditPolicyEx;
import org.eclipse.gmf.runtime.gef.ui.internal.figures.RelativeToBorderLocator;

/**
 * This editpolicy is responsible for adding the decorations from the
 * <code>DecoratorService</code>. The decorations are added to a different
 * layer so that they have the option of being printed or not.
 * 
 * @author cmahoney
 */
public class DecorationEditPolicy
	extends GraphicalEditPolicyEx {

	/**
	 * The decoratorTarget object to be passed to the service. This serves as a
	 * wrapper around this editpolicy.
	 */
	public class DecoratorTarget
		implements IDecoratorTarget {

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget#installDecorator(java.lang.Object,
		 *      org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecorator)
		 */
		public void installDecorator(Object key, IDecorator decorator) {
			Assert.isNotNull(key, "Decorators must be installed with keys"); //$NON-NLS-1$
			decorators.put(key, decorator);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
		 */
		public Object getAdapter(Class adapter) {
			return getHost().getAdapter(adapter);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget#createShapeDecoration(null,
		 *      int, int, boolean)
		 */
		public IDecoration addShapeDecoration(Image image, Direction direction,
				int margin, boolean isVolatile) {

			ImageFigureEx figure = new ImageFigureEx();
			figure.setImage(image);
			figure.setSize(MapMode.DPtoLP(image.getBounds().width), MapMode
				.DPtoLP(image.getBounds().height));

			return addShapeDecoration(figure, direction, margin, isVolatile);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget#createConnectionDecoration(null,
		 *      int, boolean)
		 */
		public IDecoration addConnectionDecoration(Image image,
				int percentageFromSource, boolean isVolatile) {

			ImageFigureEx figure = new ImageFigureEx();
			figure.setImage(image);
			figure.setSize(MapMode.DPtoLP(image.getBounds().width), MapMode
				.DPtoLP(image.getBounds().height));

			return addConnectionDecoration(figure, percentageFromSource,
				isVolatile);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget#deleteDecoration(org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoration)
		 */
		public void removeDecoration(IDecoration decoration) {
			if (decoration instanceof IFigure) {
				((IFigure) decoration).getParent().remove((IFigure) decoration);
			}
		}

		/**
		 * Adds a figure as a decoration on a shape.
		 * 
		 * @param figure
		 *            the figure to be used as the decoration
		 * @param direction
		 *            The direction relative to the shape to place the
		 *            decoration.
		 * @param margin
		 *            The margin is the space, in himetric units, between the
		 *            shape's edge and the decoration. A positive margin will
		 *            place the figure outside the shape, a negative margin will
		 *            place the decoration inside the shape.
		 * @param isVolatile
		 *            True if this decoration is volatile (i.e. not to be
		 *            included in the printed output of a diagram); false
		 *            otherwise.
		 * @return The decoration object, which is needed to later remove the
		 *         decoration.
		 */
		public IDecoration addShapeDecoration(IFigure figure,
				Direction direction, int margin, boolean isVolatile) {

			return addDecoration(figure, new RelativeToBorderLocator(
				((GraphicalEditPart) getAdapter(GraphicalEditPart.class))
					.getFigure(), getPositionConstant(direction), margin),
				isVolatile);
		}

		/**
		 * Adds a figure as a decoration on a connection.
		 * 
		 * @param figure
		 *            the figure to be used as the decoration
		 * @param percentageFromSource
		 *            The percentage of the connector length away from the
		 *            source end (range is from 0 to 100) where the decoration
		 *            should be positioned.
		 * @param isVolatile
		 *            True if this decoration is volatile (i.e. not to be
		 *            included in the printed output of a diagram); false
		 *            otherwise.
		 * @return The decoration object, which is needed to later remove the
		 *         decoration.
		 */
		public IDecoration addConnectionDecoration(IFigure figure,
				int percentageFromSource, boolean isVolatile) {

			IFigure hostFigure = ((GraphicalEditPart) getAdapter(GraphicalEditPart.class))
				.getFigure();
			Assert.isTrue(hostFigure instanceof Connection);

			return addDecoration(figure, new OnConnectionLocator(
				(Connection) hostFigure, percentageFromSource), isVolatile);
		}

		/**
		 * Adds a figure as a decoration on a shape or conenction.
		 * 
		 * @param figure
		 *            the figure to be used as the decoration
		 * @param locator
		 *            The locator to be used to position the decoration
		 * @param isVolatile
		 *            True if this decoration is volatile (i.e. not to be
		 *            included in the printed output of a diagram); false
		 *            otherwise.
		 * @return The decoration object, which is needed to later remove the
		 *         decoration.
		 */
		public IDecoration addDecoration(IFigure figure, Locator locator,
				boolean isVolatile) {

			Decoration decoration = new Decoration();
			decoration.add(figure);
			decoration.setSize(figure.getSize());
			decoration
				.setOwnerFigure(((GraphicalEditPart) getAdapter(GraphicalEditPart.class))
					.getFigure());
			decoration.setLocator(locator);

			IFigure pane = getLayer(isVolatile ? DiagramRootEditPart.DECORATION_UNPRINTABLE_LAYER
				: DiagramRootEditPart.DECORATION_PRINTABLE_LAYER);

			pane.add(decoration);
			return decoration;
		}
	}

	/** the decorators */
	protected Map decorators;

	/**
	 * Updates all the decorations for the host editpart by calling refresh() on
	 * each of the decorators installed on this editpart. If this is the first
	 * time refresh() is called, then the <code>DecorationService</code> is
	 * first called to create the decorators.
	 * 
	 * @see org.eclipse.gmf.runtime.gef.ui.internal.editpolicies.GraphicalEditPolicyEx#refresh()
	 */
	public void refresh() {
		if (decorators == null) {
			decorators = new HashMap();
			DecoratorService.getInstance().createDecorators(
				new DecoratorTarget());
		}
		for (Iterator iter = decorators.values().iterator(); iter.hasNext();) {
			IDecorator decorator = (IDecorator) iter.next();
			decorator.refresh();
		}
	}

	/**
	 * Activates all the decorators.
	 * 
	 * @see org.eclipse.gef.EditPolicy#activate()
	 */
	public void activate() {
		if (decorators == null) {
			decorators = new HashMap();
			DecoratorService.getInstance().createDecorators(
				new DecoratorTarget());
		}	
		if (decorators != null) {
			for (Iterator iter = decorators.values().iterator(); iter.hasNext();) {
				IDecorator decorator = (IDecorator) iter.next();
				decorator.activate();
			}
		}
	}

	/**
	 * Deactivates all the decorators.
	 * 
	 * @see org.eclipse.gef.EditPolicy#deactivate()
	 */
	public void deactivate() {
		if (decorators != null) {
			for (Iterator iter = decorators.values().iterator(); iter.hasNext();) {
				IDecorator decorator = (IDecorator) iter.next();
				decorator.deactivate();
			}
		}
	}

	/**
	 * Returns the decorators
	 * 
	 * @return the decorators.
	 */
	protected final Map getDecorators() {
		return this.decorators;
	}

	/**
	 * Sets the decorators
	 * 
	 * @param decorators
	 *            The decorators to set.
	 */
	protected final void setDecorators(Map decorators) {
		this.decorators = decorators;
	}

	/**
	 * Converts the direction to an int as defined in PositionConstant.
	 * 
	 * @param direction
	 * @return the int as defined in PositionConstant
	 */
	public int getPositionConstant(Direction direction) {

		if (direction == Direction.CENTER) {
			return PositionConstants.CENTER;
		} else

		if (direction == Direction.NORTH) {
			return PositionConstants.NORTH;
		} else

		if (direction == Direction.SOUTH) {
			return PositionConstants.SOUTH;
		} else

		if (direction == Direction.WEST) {
			return PositionConstants.WEST;
		} else

		if (direction == Direction.EAST) {
			return PositionConstants.EAST;
		} else

		if (direction == Direction.NORTH_EAST) {
			return PositionConstants.NORTH_EAST;
		} else

		if (direction == Direction.NORTH_WEST) {
			return PositionConstants.NORTH_WEST;
		} else

		if (direction == Direction.SOUTH_EAST) {
			return PositionConstants.SOUTH_EAST;
		} else

		if (direction == Direction.SOUTH_WEST) {
			return PositionConstants.SOUTH_WEST;
		}

		return PositionConstants.CENTER;
	}
}