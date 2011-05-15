/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2002, 2005.  All Rights Reserved.              |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.diagram.ui.editparts;
import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.RangeModel;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToGuides;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.eclipse.gef.requests.SelectionRequest;
import org.eclipse.gef.rulers.RulerProvider;
import org.eclipse.gef.tools.DeselectAllTracker;
import org.eclipse.swt.widgets.Display;

import org.eclipse.gmf.runtime.diagram.core.listener.NotificationEvent;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ActionBarEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ContainerEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ContainerNodeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.internal.editparts.ISurfaceEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.editpolicies.DiagramLinkDragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.internal.editpolicies.ShapeCompartmentDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.internal.tools.RubberbandDragTracker;
import org.eclipse.gmf.runtime.diagram.ui.properties.Properties;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
/**
 * A generic (sub) shape container that holds instances of <code>ShapeNodeEditPart</code>s and
 * manages the display of <code>ConnectionNodeEditPart</code>s anchored to these shape editpart 
 * instances.
 *
 * @author mhanner
 */
public abstract class ShapeCompartmentEditPart extends ResizableCompartmentEditPart implements ISurfaceEditPart {
	
	/** private connector refresh manager. */
	private ConnectorRefreshMgr _crMgr;
	
	private boolean _refreshQueued = false;
	
	private boolean isSupportingViewActions = false;
	
	/**
	 * Class used to refresh the connectors associated to the shape compartment's
	 * children.  This implementation will hide all connectors whose endpoints are
	 * not visible inside the shape compartment.
	 */
	public static class ConnectorRefreshMgr {
		/**
		 * Cycles through all the connectors associated to the editparts contained within
		 * the passed shape compartment and sets their visibility. 
		 * @see ConnectionNodeEditPart#getSourceConnectionAnchor()
		 * @see ConnectionNodeEditPart#getTargetConnectionAnchor()
		 * @param scep edit part to consider
		 */
		protected void refreshConnectors(ShapeCompartmentEditPart scep) {
			
			Iterator connectionNodes = getConnectionNodes(scep).iterator();
			while( connectionNodes.hasNext() ) {
				ConnectionNodeEditPart cep = (ConnectionNodeEditPart)connectionNodes.next();
				Connection connector =
					(Connection)cep.getFigure();
				IGraphicalEditPart source =
					(IGraphicalEditPart)getSourceEditPart(cep);
				IGraphicalEditPart target =
					(IGraphicalEditPart)getTargetEditPart(cep);
				ShapeCompartmentEditPart sContainer = getOwningShapeCompartment(source);
				ShapeCompartmentEditPart tContainer = getOwningShapeCompartment(target);
				// only deal with items contained within a shape compartment
				if ( sContainer == null && tContainer == null ) {
					continue;
				}
				boolean sfVisible = source != null;
				boolean tfVisible = target != null;
				ConnectionAnchor sc = cep.getSourceConnectionAnchor();
				ConnectionAnchor tc = cep.getTargetConnectionAnchor();
				//
				// get the connector locations
				Point sLoc = sc.getLocation(tc.getReferencePoint());
				Point tLoc = tc.getLocation(sc.getReferencePoint());
				

				Diagram diagram = ((View)scep.getModel()).getDiagram();
				Map registry = scep.getViewer().getEditPartRegistry();
				IGraphicalEditPart dep = (IGraphicalEditPart)registry.get(diagram);
				IFigure stopFigure = dep == null ? null : dep.getContentPane();
				
				//
				// if sContainer is null, then the source connector is a child of the diagram and not
				// a shape compartment.  It's visibility is, therefore, true.				
				if (sContainer != null) {
					ShapeCompartmentFigure fig = sContainer.getShapeCompartmentFigure();
					sfVisible = isFigureVisible(fig, sLoc, stopFigure);
					if( !sfVisible ) {
						sfVisible = isBorderItem(sContainer, source);
					}
				}
				//
				// if tContainer is null, then the source connector is a child of the diagram and not
				// a shape compartment.  It's visibility is, therefore, true.
				if (tContainer != null) {
					ShapeCompartmentFigure fig = tContainer.getShapeCompartmentFigure();
					tfVisible = isFigureVisible(fig, tLoc, stopFigure);
					if( !tfVisible ) {
						tfVisible = isBorderItem(tContainer, target);
					}
				}
				// set connector visibility true iff both anchor points are visible
				connector.setVisible(sfVisible && tfVisible);
			}
		}
		/** 
		 * Return the set of {@link ConnectionNodeEditPart}s
		 * contained in the supplied shape compartment.
		 * @param scep a shape compartment.
		 * @return a {@link Set} of  {@link ConnectionNodeEditPart}.
		 */

		protected Set getConnectionNodes( ShapeCompartmentEditPart scep ) {
			Set endPoints = new HashSet();
			Object modelObject = scep.getModel();
			if (scep.getViewer() == null ||
				modelObject  == null || 
				!(modelObject instanceof View)) {
				return endPoints;
			}

			Diagram diagram = ((View)modelObject).getDiagram();
			Map registry = scep.getViewer().getEditPartRegistry();
			List edges = diagram.getEdges();			
			Iterator connectors = edges.iterator();

			while( connectors.hasNext() ) {
				Edge connector = (Edge)connectors.next();
				EditPart endPoint = (EditPart)registry.get(connector.getSource() );
				if ( isChildOf(scep, endPoint) ) {
					Object cep = registry.get(connector);
					if ( cep != null ) {
						endPoints.add( cep );
					}
					continue;
				}
				endPoint = (EditPart)registry.get(connector.getTarget());
				if ( isChildOf(scep, endPoint) ) {
					Object cep = registry.get(connector);
					if ( cep != null ) {
						endPoints.add( cep );
					}
				}
			}
			return endPoints;
		}

		
		/**
		 * Return <tt>true</tt> if <tt>parent</tt> child's ancestor; otherwise <tt>false</tt>
		 * @param parent parent to consider
		 * @param child child to consider
		 * @return <tt>true</tt> or <tt>false</tt>
		 */
		protected boolean isChildOf( EditPart parent, EditPart child ) {
		 	EditPart walker = child;
		 	while( walker != null && walker != parent ) {
		 		walker = walker.getParent();
		 	}
		 	return walker != null;
		 }
		 
		/**
		 * gets the supplied editparts containing shape compartment.
		 * @param ep edit part 
		 * @return <code> ShapeCompartmentEditPart</code>
		 */
		protected ShapeCompartmentEditPart getOwningShapeCompartment( EditPart ep ) {
			EditPart walker = ep;
			while ( walker != null && !(walker instanceof ShapeCompartmentEditPart) ) {
				walker = walker.getParent();
			}
			return (ShapeCompartmentEditPart)walker;
		}
		
		/**
		 * This method can be overridden to allow connections between border items to be
		 * drawn to items within the interior of the compartment.  
		 * 
		 * @param scep
		 * @param itemEditPart
		 * @return false by default.  Override to allow connections to border items.
		 */
		protected boolean isBorderItem( ShapeCompartmentEditPart scep, IGraphicalEditPart itemEditPart ) {
			return false;
		}
		
		/**
		 * Returns source edit part.
		 * @param connectionEditPart
		 * @return EditPart
		 */
		protected EditPart getSourceEditPart(ConnectionEditPart connectionEditPart) {
			return connectionEditPart.getSource();
		}
		/**
		 * Returns target editPart
		 * @param connectionEditPart
		 * @return EditPart
		 */
		protected EditPart getTargetEditPart(ConnectionEditPart connectionEditPart) {
			return connectionEditPart.getTarget();
		}

		/**
		 * gets the source connections of the passed edit part
		 * @param editPart edit part to consider
		 * @return source connections
		 */
		protected List getSourceConnections(IGraphicalEditPart editPart) {
			return editPart.getSourceConnections();
		}
		/**
		 * get the target connections of the passed edit part
		 * @param editPart edit part to consider
		 * @return target connection 
		 */
		protected List getTargetConnections(IGraphicalEditPart editPart) {
			return editPart.getTargetConnections();
		}
		
		/**
		 * Walks up the hierarchy to make sure that supplied figure is visible
		 * inside its figure hierarchy. <BR>
		 * Same as calling <code>isFigureVisible(figure, loc, null);</code>
		 * @param figure The figure under test.
		 * @param loc the child's location in absolute coordinates.
		 * @return boolean visibility of the figure by going up the chain.
		 */
		protected boolean isFigureVisible(final IFigure figure, final Point loc ) {
			return isFigureVisible( figure, loc, null );
		}
		
		/**
		 * Walks up the hierarchy to make sure that supplied figure is visible
		 * inside its figure hierarchy. <BR>
		 * @param figure The figure under test.
		 * @param loc the child's location in absolute coordinates.
		 * @param stopFigure root figure in the figure hierarchy being tested.
		 * @return boolean visibility of the figure by going up the chain.
		 */
		protected boolean isFigureVisible(final IFigure figure, final Point loc, final IFigure stopFigure) {
			if (!(figure.isVisible())) {
				return false;
			}
			else {
				Rectangle bounds = figure.getBounds().getCopy();
				figure.translateToAbsolute(bounds);
				if (!(bounds.contains(loc))) {
					return false;
				}
			}
			
			IFigure parent = figure.getParent();
			while (parent != null && parent != stopFigure) {
				return isFigureVisible(parent, loc, stopFigure);
			}
			return true;
		}
	}
	
	
	/**
	 * Constructor for ShapeCompartmentEditPart.
	 * @param view the view <code>controlled</code> by this editpart.
	 */
	public ShapeCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * Returns the connector refresh manager.
	 * @return <code>ConnectorRefreshMgr</code> 
	 */
	protected final ConnectorRefreshMgr getConnectorRefreshMgr() {
		if (_crMgr == null) {
			_crMgr = createConnectorRefreshMgr();
		}
		return _crMgr;
	}

	/**
	 * Factory method to create a refresh connector.  This implementation returns
	 * a {@link ShapeCompartmentEditPart.ConnectorRefreshMgr} instance.
	 * @return <code>ConnectorRefreshMgr</code>
	 */
	protected ConnectorRefreshMgr createConnectorRefreshMgr() {
		return new ConnectorRefreshMgr();
	}
	
	/**
	 * Returns the layout manager to be used by this shape compartment.
	 * This implemantion returns a {@link FreeformLayout} instance.
	 * @return a layout manager.
	 */
	protected LayoutManager getLayoutManager() {
		return new FreeformLayout();
	}
	/**
	 * Creates a scrollpane (with auto scrollbars) in which the children are drawn.
	 * The factory hint property is used to set this compartments label.
	 */
	protected IFigure createFigure() {
		ShapeCompartmentFigure scf = new ShapeCompartmentFigure(getTitleName());
		scf.getContentPane().setLayoutManager(getLayoutManager());
		return scf;
	}
		
	/** 
	 * Convenience method to retrieve the shape compartment figure.
	 * Same as calling <code>(ShapeCompartmentFigure)getCompartmentFigure()</code>.
	 * @return <code>ShapeCompartmentFigure</code>
	 */
	public ShapeCompartmentFigure getShapeCompartmentFigure() {
		return (ShapeCompartmentFigure)getCompartmentFigure();
	}
	
	/** Return the container in which shape editparts are added. */
	public IFigure getContentPane() {
		return getShapeCompartmentFigure().getContentPane();
	}
	
	/**
	 * Adds the following editpolicies: <BR>
	 * <UL>
	 * <LI> {@link EditPolicyRoles#CREATION_ROLE} :: {@link CreationEditPolicy}
	 * <LI> {@link EditPolicy#LAYOUT_ROLE} :: {@link XYLayoutEditPolicy}
	 * <LI> {@link EditPolicy#CONTAINER_ROLE} :: {@link ContainerEditPolicy}
	 * <LI> {@link EditPolicyRoles#DRAG_DROP_ROLE} :: {@link DiagramLinkDragDropEditPolicy}
	 * <LI> {@link EditPolicy#GRAPHICAL_NODE_ROLE} :: {@link ContainerNodeEditPolicy}
	 * 
	 * <LI> {@link EditPolicyRoles#SNAP_FEEDBACK_ROLE} :: {@link SnapFeedbackPolicy}
	 * <LI> {@link EditPolicyRoles#DRAG_DROP_ROLE} :: {@link ShapeCompartmentDropEditPolicy}
	 * <LI> {@link EditPolicyRoles#ACTIONBAR_ROLE} :: {@link ActionBarEditPolicy}
	 * </UL>
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,new CreationEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new XYLayoutEditPolicy());
		installEditPolicy(EditPolicy.CONTAINER_ROLE, new ContainerEditPolicy());
		// TODO: this edit policy get overriden by code at the end of this function 
		// may be this breaks some use cases; it needs to be checked
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DiagramLinkDragDropEditPolicy());
		installEditPolicy(
			EditPolicy.GRAPHICAL_NODE_ROLE,
			new ContainerNodeEditPolicy());
		// Install an edit policy for snap
		installEditPolicy(EditPolicyRoles.SNAP_FEEDBACK_ROLE, new SnapFeedbackPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new ShapeCompartmentDropEditPolicy());
		installEditPolicy(EditPolicyRoles.ACTIONBAR_ROLE, new ActionBarEditPolicy());
	}
	
	/**
	 * Handles property change callbacks.  All unrecognized events are forwarded
	 * to the parent class.
	 * @param event a property change event.
	 */
	protected void handlePropertyChangeEvent(PropertyChangeEvent event) {
		String pName = event.getPropertyName();
		if (Properties.ID_EXTENTX.equals(pName)
			|| Properties.ID_EXTENTY.equals(pName)
			|| RangeModel.PROPERTY_EXTENT.equals(pName)
			|| RangeModel.PROPERTY_VALUE.equals(pName)) {
			refreshConnectors();
		}
		else {
			super.handlePropertyChangeEvent(event);
		}
	}
	
	/**
	 * Refreshes the connectors inside the shape compartment 
	 * if the supplied event is for an element inserted or
	 * removed from the editpart.
	 * @see #refreshConnectors()
	 * @param event a model server event.
	 */
	protected void handleNotificationEvent( NotificationEvent event ) {
		super.handleNotificationEvent(event);
		if ( event.isElementAddedToSlot() || event.isElementRemovedFromSlot() ) {
			refreshConnectors();
		}
	}

	
	/** Refresh the connectors associated the the children of this shape compartment. */
	protected void refreshConnectors() {
		if ( !_refreshQueued ) {
			_refreshQueued = true;
			Display.getDefault().asyncExec( new Runnable() {
				public void run() {
					try {
						//
						// test if active since the editpartg may have been deleted
						// by the time this method is executed.
						if ( ShapeCompartmentEditPart.this.isActive() ) {
							getConnectorRefreshMgr().refreshConnectors(ShapeCompartmentEditPart.this);
						}
					}
					finally {
						ShapeCompartmentEditPart.this._refreshQueued = false;
					}
				}
			});
		}
	}

	/** Unregisters this instance as a PropertyChangeListener on its figure. */
	protected void unregister() {
		super.unregister();
		getShapeCompartmentFigure().removePropertyChangeListener(this);
		EditPartViewer viewer = getViewer();
		if (viewer != null && viewer.getControl() instanceof FigureCanvas) {
			FigureCanvas figureCanvas = (FigureCanvas)viewer.getControl();
			figureCanvas.getViewport().getVerticalRangeModel().removePropertyChangeListener(this);
			figureCanvas.getViewport().getHorizontalRangeModel().removePropertyChangeListener(this);
		}
	}
	
	/** Registers this instance as a PropertyChangeListener on its figure. */
	protected void registerVisuals() {
		super.registerVisuals();
		getShapeCompartmentFigure().addPropertyChangeListener(this);
		
		EditPartViewer viewer = getViewer();
		if ( viewer != null && viewer.getControl() instanceof FigureCanvas) {
			FigureCanvas figureCanvas = (FigureCanvas)viewer.getControl();
			figureCanvas.getViewport().getVerticalRangeModel().addPropertyChangeListener(this);
			figureCanvas.getViewport().getHorizontalRangeModel().addPropertyChangeListener(this);
		}
	}
	
	/**
	 * @see org.eclipse.gef.EditPart#getDragTracker(org.eclipse.gef.Request)
	 */
	public DragTracker getDragTracker(Request req) {
		if (req instanceof SelectionRequest 
			&& ((SelectionRequest)req).getLastButtonPressed() == 3)
				return new DeselectAllTracker(this) {
					protected boolean handleButtonDown(int button) {
						getCurrentViewer().select(ShapeCompartmentEditPart.this);
						return true;
					}
				};
		return new RubberbandDragTracker() {
			protected void handleFinished() {
				if (getViewer().getSelectedEditParts().isEmpty())
					getViewer().select(ShapeCompartmentEditPart.this);
			}
		};
	}
	
	/** Return null. */
	protected String getTitleName() {
		return null;
	}
		
	/** Adds the ability to adapt to {@link SnapToHelper}. */
	public Object getAdapter(Class adapter) {

		if (adapter == SnapToHelper.class) {

			List snapStrategies = new ArrayList();

			Boolean val = (Boolean)getViewer().getProperty(RulerProvider.PROPERTY_RULER_VISIBILITY);
			if (val != null && val.booleanValue())
				snapStrategies.add(new SnapToGuides(this));

			val = (Boolean)getViewer().getProperty(SnapToGeometry.PROPERTY_SNAP_ENABLED);
			if (val != null && val.booleanValue())
				snapStrategies.add(new SnapToGrid((GraphicalEditPart)this.getParent()));

			if (snapStrategies.size() == 0)
				return null;

			if (snapStrategies.size() == 1)
				return (SnapToHelper)snapStrategies.get(0);

			SnapToHelper ss[] = new SnapToHelper[snapStrategies.size()];
			for (int i = 0; i < snapStrategies.size(); i++)
				ss[i] = (SnapToHelper)snapStrategies.get(i);
			return new CompoundSnapToHelper(ss);
		}

		return super.getAdapter(adapter);
	}
	
	/** Also calls {@link #refreshConnectors()}. */
	protected void refreshVisibility() {
		super.refreshVisibility();
		refreshConnectors();
	}
	
	
	/* (non-Javadoc)
	 */
	public boolean isSupportingViewActions(){
		return this.isSupportingViewActions;
	}
	
	/* (non-Javadoc)
	 */
	public void setIsSupportingViewActions(boolean supportsViewActions){
		this.isSupportingViewActions = supportsViewActions;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart#shouldAllowDisableCanonicalRefresh()
	 */
	protected boolean shouldAllowDisableCanonicalRefresh() {
		return false;
	}
}