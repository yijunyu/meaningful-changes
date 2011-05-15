/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2002, 2004.  All Rights Reserved.              |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.diagram.ui.editparts;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.AccessibleEditPart;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.DropRequest;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gef.requests.TargetRequest;
import org.eclipse.jface.util.Assert;
import org.eclipse.swt.SWT;
import org.eclipse.swt.accessibility.AccessibleEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionFilter;

import org.eclipse.gmf.runtime.common.core.util.IAdaptableSelection;
import org.eclipse.gmf.runtime.common.ui.services.action.filter.ActionFilterService;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.diagram.core.internal.util.MEditingDomainGetter;
import org.eclipse.gmf.runtime.diagram.core.internal.view.IView;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationEvent;
import org.eclipse.gmf.runtime.diagram.core.listener.PresentationListener;
import org.eclipse.gmf.runtime.diagram.core.listener.PropertyChangeNotifier;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.commands.ToggleCanonicalModeCommand;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DecorationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.PropertyHandlerEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.internal.editparts.DefaultEditableEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.editparts.IEditableEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.editpolicy.EditPolicyService;
import org.eclipse.gmf.runtime.diagram.ui.internal.util.IncarnationUtil;
import org.eclipse.gmf.runtime.diagram.ui.l10n.PresentationResourceManager;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.properties.Properties;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.diagram.ui.tools.DragEditPartsTrackerEx;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.emf.core.edit.MRunnable;
import org.eclipse.gmf.runtime.emf.core.util.ProxyUtil;
import org.eclipse.gmf.runtime.gef.ui.internal.editpolicies.GraphicalEditPolicyEx;
import com.ibm.xtools.notation.Diagram;
import com.ibm.xtools.notation.FillStyle;
import com.ibm.xtools.notation.FontStyle;
import com.ibm.xtools.notation.LineStyle;
import com.ibm.xtools.notation.NotationPackage;
import com.ibm.xtools.notation.View;

/**
 * @author melaasar
 * 
 * The root of all component graphical edit parts that own a view as a model
 */
public abstract class GraphicalEditPart
	extends AbstractGraphicalEditPart
	implements IGraphicalEditPart, PropertyChangeListener, IAdaptableSelection {

	/** A map of listener filters ids to filter data */
	private Map listenerFilters;

	/** Used for accessibility. */
	protected AccessibleEditPart accessibleEP;

	/** Used for registering and unregistering the edit part */
	private String elementGuid;

	/** Used for handling the editable status of the edit part */
	private final IEditableEditPart editableEditPart;
	
	private IView incarnatedView = null;
	
	//	protected Command getPropertyChangeCommand(
	//		Object property,
	//		Object oldValue,
	//		Object newValue) {
	//		// by default return null, which means there is no special command to
	// change the property
	//		return null;
	//	}

	/**
	 * Create an instance.
	 * 
	 * @param view
	 *            the underlying model.
	 */
	public GraphicalEditPart(View view) {
		setModel(view);
		this.editableEditPart = new DefaultEditableEditPart(this);
	}

	/** Registers this editpart to recieve notation and semantic events. */
	public void activate() {
		addNotationalListeners();
		
		EObject semanticProxy = ((View) getModel()).getElement();
		EObject semanticElement = ProxyUtil.resolve(MEditingDomainGetter.getMEditingDomain((View)getModel()), semanticProxy);
		
		if (semanticElement != null)
			addSemanticListeners();
		else if (semanticProxy != null) {
			addListenerFilter("SemanticProxy", this, PresentationListener.getNotifier(semanticProxy)); //$NON-NLS-1$
		}
		GraphicalEditPart.super.activate();
	}

	/**
	 * Adds a listener filter by adding the given listener to a passed notifier
	 * 
	 * @param filterId
	 *            A unique filter id (within the same editpart instance)
	 * @param listener
	 *            A listener instance
	 * @param notifier
	 *            An element notifer to add the listener to
	 */
	protected void addListenerFilter(String filterId,
			PropertyChangeListener listener, PropertyChangeNotifier notifier) {
		if (notifier == null)
			return;
		Assert.isNotNull(filterId);
		Assert.isNotNull(listener);
		if (listenerFilters == null)
			listenerFilters = new HashMap();
		notifier.addPropertyChangeListener(listener);
		listenerFilters.put(filterId, new Object[] {notifier, listener});
	}

	/** Creates a connector editpart. */
	final protected org.eclipse.gef.ConnectionEditPart createConnection(
			Object connectorView) {
		return (org.eclipse.gef.ConnectionEditPart) createChild(connectorView);
	}

	/**
	 * Overridden to support editpolicies installed programmatically and via the
	 * <code>EditPolicyService</code>. Subclasses should override
	 * <code>createDefaultEditPolicies()</code>.
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 */
	final protected void createEditPolicies() {
		createDefaultEditPolicies();
		EditPolicyService.getInstance().createEditPolicies(this);
	}

	/**
	 * Should be overridden to install editpolicies programmatically.
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
			new SemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.PROPERTY_HANDLER_ROLE,
			new PropertyHandlerEditPolicy());
		installEditPolicy(EditPolicyRoles.DECORATION_ROLE,
			new DecorationEditPolicy());
	}

	public void deactivate() {
		if ( !isActive() ) {
			return;
		}
		removeNotationalListeners();
		if (listenerFilters != null ) {
			for (Iterator i = listenerFilters.keySet().iterator(); i.hasNext();) {
				Object[] obj = (Object[]) listenerFilters.get(i.next());
				((PropertyChangeNotifier) obj[0]).removePropertyChangeListener((PropertyChangeListener) obj[1]);
			}
		}
		super.deactivate();
	}

	/**
	 * executes the passed <code>Command</code>
	 * @param command the command to exectue
	 */
	protected void executeCommand(Command command) {
		getViewer().getEditDomain().getCommandStack().execute(command);
	}

	/** Adds the ability to adapt to the edit part's view class. */
	public Object getAdapter(Class key) {
		
		Object model = getModel();

		// Adapt to IActionFilter
		if (key == IActionFilter.class) {
			return ActionFilterService.getInstance();
		}

		if ( View.class.isAssignableFrom(key) && model instanceof View) {
			return model;
		}
		
		if (model != null &&
			model instanceof View &&
			EObject.class.isAssignableFrom(key)) {
			// Adapt to semantic element
			EObject semanticObject = ViewUtil.resolveSemanticElement((View)model);
			if (key.isInstance(semanticObject)) {
				return semanticObject;
			}
			else if (key.isInstance(model)){
				return model;
			}
			
		}

		// Delegate
		Object adapter = super.getAdapter(key);
		if (adapter != null)
			return adapter;
		return Platform.getAdapterManager().getAdapter(this, key);
	}

	/**
	 * Utility method to get the primary view and then query for a child based on the
	 * semantic hint
	 * 
	 * @param semanticHint <code>String</code> that is the hint that can retrieved on the getType
	 * method of <code>View</code>
	 * @return <code>IGraphicalEditPart</code> that matches with the given semanticHint
	 */
	public IGraphicalEditPart getChildBySemanticHintOnPrimaryView(String semanticHint) {
		View primaryView = getPrimaryView();
		View childView = ViewUtil.getChildBySemanticHint(primaryView, semanticHint);
		if (childView != null)
			return  (IGraphicalEditPart)getViewer().getEditPartRegistry().get(childView);

		return null;
	}
	
	/**
	 * Method getChildBySemanticHint.
	 * 
	 * @param semanticHint
	 * @return IGraphicalEditPart
	 */
	public IGraphicalEditPart getChildBySemanticHint(String semanticHint) {
		if (getModel()!=null){
			View view = ViewUtil.getChildBySemanticHint((View)getModel(),semanticHint);
			if (view != null)
				return  (IGraphicalEditPart)getViewer().getEditPartRegistry().get(view);
		}
		return null;
	}

	
	/** counter that tracs the recursive depth of the getCommand() method. */
	private static volatile int GETCOMMAND_RECURSIVE_COUNT = 0;
	
	/** A list of editparts who's canonical editpolicies are to be temporarily disabled. */
	private static Set _disableCanonicalEditPolicyList = new HashSet();
	

	/** Return a command for the supplied request. */
	public Command getCommand(Request _request) {
		if ( !isEditModeEnabled() ) {
			if (RequestConstants.REQ_OPEN.equals(_request.getType())) {
				//allowed, continue
			}
			else {
				return UnexecutableCommand.INSTANCE;
			}			
		}
		
		Command cmd = null;
		try {
			GETCOMMAND_RECURSIVE_COUNT++;
			final Request request = _request;
			cmd =  (Command) MEditingDomainGetter.getMEditingDomain((View)getModel()).runAsRead(new MRunnable() {
				
				public Object run() {
					return GraphicalEditPart.super.getCommand(request);
				}
			});
			

			if ( cmd != null ) {
				_disableCanonicalEditPolicyList.addAll(disableCanonicalFor(_request));
			}
			
			GETCOMMAND_RECURSIVE_COUNT--;
			
			if ( GETCOMMAND_RECURSIVE_COUNT == 0 ) {
				if ( cmd != null 
						&& !_disableCanonicalEditPolicyList.isEmpty() ) {
					CompoundCommand cc = new CompoundCommand();
					cc.setLabel( cmd.getLabel() );
					ToggleCanonicalModeCommand tcmd = 
						ToggleCanonicalModeCommand.getToggleCanonicalModeCommand(_disableCanonicalEditPolicyList, false);
					cc.add( tcmd );
					cc.add( cmd );
					cc.add( ToggleCanonicalModeCommand.getToggleCanonicalModeCommand(tcmd, true));
					_disableCanonicalEditPolicyList.clear();
					return cc.unwrap();
				}
			}
		}
		catch( RuntimeException t ) {
			GETCOMMAND_RECURSIVE_COUNT = 0;
			throw t;
		}
		return cmd;
		
	}
	
	/**
	 * Return a list of editparts who's canonical editpolicies should be disabled
	 * prior to executing the commands associated to the supplied request.
	 * This implementation will return the editpart honoring a <code>SemanticWrapperRequest</code>
	 * and a <code>CreateConnectorViewRequest</code>'s source and target editparts.
	 *
	 * @param request a request that has returned a command.
	 * @return list of editparts.
	 */
	Collection disableCanonicalFor( final Request request ) {
		//
		// not the most generic of solution; however, it will have to do for now...
		//
		// Alternate solutions
		// 1. common request interface on all the requests
		//  IRequest#getAffectedEditParts
		//
		// 2. Traverse down the command and collect of the ICommand#getAffectedObjects()
		//  -- this requires that all our commands properly set this value.
		
		Set hosts = new HashSet();
		if ( (request instanceof EditCommandRequestWrapper)  
				|| request instanceof TargetRequest
				|| request instanceof DropRequest ) {
			hosts.add(this);
			hosts.add(getParent());
		}
		if ((request instanceof CreateConnectionRequest) ) {
			CreateConnectionRequest ccvr = (CreateConnectionRequest)request;
			hosts.add(this);
			hosts.add(getParent());
			if ( ccvr.getSourceEditPart() != null ) {
				hosts.add( ccvr.getSourceEditPart());
				hosts.add( ccvr.getSourceEditPart().getParent());
			}
			if ( ccvr.getTargetEditPart() != null ) {
				hosts.add( ccvr.getTargetEditPart());
				hosts.add( ccvr.getTargetEditPart().getParent());
			}
		}
		if ((request instanceof GroupRequest)) {
			List parts = ((GroupRequest)request).getEditParts();
			hosts.add(this);
			hosts.add(getParent());
		
			Iterator editparts = parts == null ? Collections.EMPTY_LIST.iterator() : parts.iterator();	
			while ( editparts.hasNext() ) {
				EditPart ep = (EditPart)editparts.next();
				hosts.add(ep);
				hosts.add(ep.getParent());
			}
		}
		return hosts;
	}

	/**
	 * gets the content pane for the supplied editpart.
	 * @param editPart the edit part to use to get the contents pane
	 * @return <code>IFigure</code>
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * Convenience method returning the editpart's parimary view. 
	 * @return the diagram
	 */
	protected Diagram getDiagramView() {
		return (Diagram) getRoot().getContents().getModel();
	}

	/**
	 * Convenience method returning the editpart's parimary view. Same as
	 * calling <code>getView().getPrimaryView()</code>
	 */
	public final View getPrimaryView() {
		for (EditPart parent = this; parent != null; parent = parent.getParent())
			if (parent instanceof IPrimaryEditPart)
				return (View)parent.getModel();
		return null;
	}

	/**
	 * gets this editpart's edit domain.
	 * @return the edit domain
	 */
	protected EditDomain getEditDomain() {
		EditDomain result = null;

		try {
			result = getRoot().getViewer().getEditDomain();
		} catch (NullPointerException nullPointerException) {
			/*
			 * The reason why we would the code in try block throws a NPE is
			 * partly because when the diagram is saved as another diagram, the
			 * an event is generated which forces the refreshing of the
			 * properties and if the selection is this editpart, then in order
			 * to open a read action, properties provider will grab its
			 * editDomain. Since this editPart would be in the state of flux and
			 * may not have the root or the viewer set yet, therefore, a null
			 * pointer exception can be thrown.
			 *  
			 */
			return null;
		}
		return result;
	}

	/** Return the editpart's diagram edit domain. */
	public IDiagramEditDomain getDiagramEditDomain() {
		EditDomain editDomain = getEditDomain();
		if (editDomain != null) {
			return (IDiagramEditDomain) editDomain;
		}
		return null;
	}

	/**
	 * Return this editpart's view (model) children.
	 * 
	 * @return list of views.
	 */
	protected List getModelChildren() {
		Object model = getModel();
		if(model!=null && model instanceof View){
			return new ArrayList(((View)model).getChildren());
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * Convenience method to retreive the value for the supplied value from the
	 * editpart's associated view element. Same as calling
	 * <code> getView().getPropertyValue(id)</code>.
	 */

	public Object getPropertyValue(Object id) {
		return ViewUtil.getPropertyValue((View) getModel(), id);
	}

	
	/**
	 * gets the semantic element associated to this editpart.
	 * @return the semantic element or <code>null</code> if the semantic element was
	 * <code>null</code> or unresolvable 
	 */
	protected EObject resolveSemanticElement() {
		return (EObject) MEditingDomainGetter.getMEditingDomain((View)getModel()).runAsRead(new MRunnable() {

			public Object run() {
				return ViewUtil.resolveSemanticElement((View) getModel());
			}
		});
	}

	/**
	 * Walks up the editpart hierarchy to find and return the
	 * <code>TopGraphicEditPart</code> instance.
	 */
	public TopGraphicEditPart getTopGraphicEditPart() {
		EditPart editPart = this;
		while (editPart instanceof IGraphicalEditPart) {
			if (editPart instanceof TopGraphicEditPart)
				return (TopGraphicEditPart) editPart;
			editPart = editPart.getParent();
		}
		return null;
	}

	/**
	 * Return the editpart's associated view. Same as calling
	 * <code>(IView)getModel()</code>
	 */
	public IView getView() {
		if (incarnatedView==null){
			incarnatedView = IncarnationUtil.incarnateView((View)getModel()); 
		}
		return incarnatedView;
	}
	
	/**
	 * Return the editpart's associated Notation View.
	 * @return <code>View</code>, the associated view or null if there is no associated Notation View
	 */
	public View getNotationView() {
		Object model = getModel();
		if (model instanceof View)
			return (View)model;
		return null;
	}

	/**
	 * Handles the passed property changed event only if the editpart's view is
	 * not deleted.
	 */
	public final void propertyChange(PropertyChangeEvent event) {
		if (isActive())
			handlePropertyChangeEvent(event);
	}

	/**
	 * Handles the property changed event
	 * 
	 * @param event
	 *            the property changed event
	 */
	protected void handlePropertyChangeEvent(PropertyChangeEvent event) {
		if (Properties.ID_PERSISTED_CHILDREN.equals(event.getPropertyName())||
			Properties.ID_TRANSIENT_CHILDREN.equals(event.getPropertyName())) {
			refreshChildren();
		}
		else if (Properties.ID_ISVISIBLE.equals(event.getPropertyName())) {
			refreshVisibility();
		}
		else if (Properties.ID_SEMANTICREF.equals(event.getPropertyName())) {
			handleMajorSemanticChange();
		} else if (event instanceof NotificationEvent) {
			handleNotificationEvent((NotificationEvent) event);
		}
	}

	/**
	 * Handles the supplied notification event.
	 * 
	 * @param e event to handle
	 */
	protected void handleNotificationEvent(NotificationEvent e) {
		// for children to override
	}

	/**
	 * Method reactivateSemanticModel. This method reactivates the edit part's
	 * emantic model by: 1- removing semantic listeners 2- adding semantic
	 * listeners if the semantic reference is resolvable 3- Refreshing it
	 * 
	 * This method is called in response to IView's Properties.ID_SEMANTICREF
	 * property change event However, it will only work under the following
	 * assumptions: 1- The old and new semantic models are compatible in their
	 * kind 2- The deltas between old and new semantic models do not affect
	 * notation 3- Connectors are not refereshed since they are maintained by
	 * the diagram
	 */
	protected void reactivateSemanticModel() {
		removeSemanticListeners();
		if (resolveSemanticElement() != null)
			addSemanticListeners();
	}

	/** Finds an editpart given a starting editpart and an EObject */
	public EditPart findEditPart(EditPart epBegin, EObject theElement) {
		if (theElement == null) {
			return null;
		}
		EditPart epStart = null;
		if (epBegin == null) {
			epStart = this;
		} else {
			epStart = epBegin;
		}

		final View view = (View) ((IAdaptable) epStart)
			.getAdapter(View.class);

		if (view != null) {
			EObject el = ViewUtil.resolveSemanticElement(view);

			if ((el != null) && el.equals(theElement)) {
				return epStart;
			}
		}

		ListIterator childLI = epStart.getChildren().listIterator();
		while (childLI.hasNext()) {
			EditPart epChild = (EditPart) childLI.next();

			EditPart elementEP = findEditPart(epChild, theElement);
			if (elementEP != null) {
				return elementEP;
			}
		}
		return null;
	}

	/** Invoke the editpart's refresh mechanism. */
	public void refresh() {
		MEditingDomainGetter.getMEditingDomain((View)getModel()).runAsRead(new MRunnable() {

			public Object run() {
				EditPolicyIterator i = getEditPolicyIterator();
				while (i.hasNext()) {
					EditPolicy policy = i.next();
					if (policy instanceof GraphicalEditPolicyEx) {
						((GraphicalEditPolicyEx) policy).refresh();
					}
				}
				GraphicalEditPart.super.refresh();
				return null;
			}
		});
	}

	/** Refresh the editpart's figure background colour. */
	protected void refreshBackgroundColor() {
		FillStyle style = (FillStyle)getPrimaryView().getStyle(NotationPackage.eINSTANCE.getFillStyle());
		if ( style != null ) {
			setBackgroundColor(PresentationResourceManager.getInstance().getColor(new Integer(style.getFillColor())));
		}
	}

	/** Refresh the editpart's figure font. */
	protected void refreshFont() {
		FontStyle style = (FontStyle) getPrimaryView().getStyle(NotationPackage.eINSTANCE.getFontStyle());
		if (style != null) {
			setFont(new FontData(
				style.getFontName(), 
				style.getFontHeight(), 
				(style.isBold() ? SWT.BOLD : SWT.NORMAL) | 
				(style.isItalic() ? SWT.ITALIC : SWT.NORMAL)));
		}
	}

	/** Refresh the editpart's figure font colour. */
	protected void refreshFontColor() {
		FontStyle style = (FontStyle)  getPrimaryView().getStyle(NotationPackage.eINSTANCE.getFontStyle());
		if ( style != null ) {
			setFontColor(PresentationResourceManager.getInstance().getColor(new Integer(style.getFontColor())));
		}
	}

	/** Refresh the editpart's figure foreground colour. */
	protected void refreshForegroundColor() {
		LineStyle style = (LineStyle)  getPrimaryView().getStyle(NotationPackage.eINSTANCE.getLineStyle());
		if ( style != null ) {
			setForegroundColor(PresentationResourceManager.getInstance().getColor(new Integer(style.getLineColor())));
		}
	}

	/** Refresh the editpart's figure visibility. */
	protected void refreshVisibility() {
		setVisibility(((View)getModel()).isVisible());
	}

	/** Refresh the editpart's figure visual properties. */
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshVisibility();
	}

	/**
	 * Removes a listener previously added with the given id
	 * 
	 * @param filterId the filter ID
	 */
	protected void removeListenerFilter(String filterId) {
		if (listenerFilters == null)
			return;
		Object[] objects = (Object[]) listenerFilters.get(filterId);
		if (objects == null)
			return;
		((PropertyChangeNotifier) objects[0])
			.removePropertyChangeListener((PropertyChangeListener) objects[1]);
		listenerFilters.remove(filterId);
	}

	/**
	 * sets the back ground color of this edit part
	 * @param color the new value of the back ground color
	 */
	protected void setBackgroundColor(Color color) {
		getFigure().setBackgroundColor(color);
	}

	/**
	 * Sets the font to the label.
	 * This method could be overriden to change the font data of the font
	 * overrides typically look like this:
	 * 		super.setFont(
	 *		new FontData(
	 *			fontData.getName(),
	 *			fontData.getHeight(),
	 *			fontData.getStyle() <| &> SWT.????));
	 * @param fontData the font data
	 */
	protected void setFont(FontData fontData) {
		getFigure().setFont(
			PresentationResourceManager.getInstance().getFont(
				Display.getDefault(),
				fontData));
		getFigure().repaint();
	}

	/**
	 * sets the font color
	 * @param color the new value of the font color
	 */
	protected void setFontColor(Color color) {
		// NULL implementation
	}

	/**
	 * sets the fore ground color of this edit part's figure
	 * @param color the new value of the foregroundcolor
	 */
	protected void setForegroundColor(Color color) {
		getFigure().setForegroundColor(color);
	}

	public void setPropertyValue(Object id, Object value) {
		ViewUtil.setPropertyValue((View) getModel(), id, value);
	}

	/**
	 * sets the visibility of this edit part
	 * @param vis the new value of the visibility
	 */
	protected void setVisibility(boolean vis) {
		if (!vis && getSelected() != SELECTED_NONE)
			getViewer().deselect(this);

		getFigure().setVisible(vis);
		getFigure().revalidate();
	}
	
	/**
	 * This method adds all listeners to the notational world (views, figures,
	 * editpart...etc) Override this method to add more notational listeners
	 * down the hierarchy
	 */
	protected void addNotationalListeners() {
		addListenerFilter("View", this, ViewUtil.getPropertyChangeNotifier((View)getModel())); //$NON-NLS-1$
	}

	/**
	 * This method adds all listeners to the semantic world (IUMLElement...etc)
	 * Override this method to add more semantic listeners down the hierarchy
	 * This method is called only if the semantic element is resolvable
	 */
	protected void addSemanticListeners() {
		addListenerFilter("SemanticElement", this, PresentationListener.getNotifier(resolveSemanticElement()));//$NON-NLS-1$
	}

	/**
	 * This method removes all listeners to the notational world (views,
	 * figures, editpart...etc) Override this method to remove notational
	 * listeners down the hierarchy
	 */
	protected void removeNotationalListeners() {
		removeListenerFilter("View"); //$NON-NLS-1$
	}

	/**
	 * This method removes all listeners to the semantic world
	 * (IUMLElement...etc) Override this method to remove semantic listeners
	 * down the hierarchy
	 */
	protected void removeSemanticListeners() {
		removeListenerFilter("SemanticElement"); //$NON-NLS-1$
	}

	/**
	 * Return a Map of all the appearance property ids supported by the edit
	 * part and its children.
	 * 
	 * Each entry in the map is the factory hint of the edit part as key and a
	 * dictionary of appearance properties as values. The edit parts are the
	 * receiver itself and it's children.
	 * 
	 * For example, the connectable shape edit part with name, attribute,
	 * operation and shape compartments will return a map where: 1 entry:
	 * connectable shape factory hint -> dictionary: Properties.ID_FONT -> font
	 * data Properties.ID_FONTCOLOR -> font color Properties.ID_LINECOLOR ->
	 * line color Properties.ID_FILLCOLOR -> fill color 2d entry: attribute
	 * compartment hint -> dictionary(empty) 3d entry: operation compartment
	 * hint -> dictionary(empty) 4d entry: shape compartment hint ->
	 * dictionary(empty)
	 * 
	 * @return Map
	 */
	public Map getAppearancePropertiesMap() {
		Map properties = new HashMap();
		fillAppearancePropertiesMap(properties);
		// for each of the children fill
		Iterator iterator = getChildren().iterator();
		while (iterator.hasNext()) {
			IGraphicalEditPart child = (IGraphicalEditPart) iterator.next();
			child.fillAppearancePropertiesMap(properties);
		}
		return properties;
	}

	/**
	 * Add to the parent edit part appearance properties map. Edit parts that
	 * have thier own appearance properties in addition to the parent edit part
	 * font, font color, line color and fill color should override this method
	 * to include their specific appearance properties.
	 * 
	 * @param properties -
	 *            map of appearence properties to which we add our own. The map
	 *            has the reciever as a key and string array of the supported
	 *            appearance property ids.
	 */
	public void fillAppearancePropertiesMap(Map properties) {
		if (getAppearancePropertyIDs().length > 0) {
			// only if there are any appearance properties
			final Dictionary local_properties = new Hashtable();
			for (int i = 0; i < getAppearancePropertyIDs().length; i++) {
				String prob = getAppearancePropertyIDs()[i];
				if (ViewUtil.isPropertySupported((View)getModel(), prob))
					local_properties.put(
						getAppearancePropertyIDs()[i],
						getPropertyValue(prob));
			}
			properties.put(((View) getModel()).getType(), local_properties);
		}
	}

	/**
	 * a static array of appearance property ids applicable to shapes
	 */
	private static final String[] appearanceProperties = new String[] {Properties.ID_ISVISIBLE};

	/**
	 * Returns an array of the appearance property ids applicable to the
	 * receiver. Fro this type it is Properties.ID_ISVISIBLE
	 * 
	 * @return - an array of the appearance property ids applicable to the
	 *         receiver
	 */
	private String[] getAppearancePropertyIDs() {
		return appearanceProperties;
	}

	/**
	 * Perform a request by executing a command from the target editpart of the
	 * request For the Direct_Edit request, we need to show up an editor first
	 * 
	 * @see org.eclipse.gef.EditPart#performRequest(org.eclipse.gef.Request)
	 */
	public void performRequest(Request request) {
		if ( !isEditModeEnabled() ) {
			if (RequestConstants.REQ_OPEN.equals(request.getType())) {
				//allowed, continue
			}
			else {
				return;
			}
		}
		
		if (RequestConstants.REQ_DIRECT_EDIT == request.getType()) {
			performDirectEditRequest(request);
		} else {
			EditPart targetEditPart = getTargetEditPart(request);
			if (targetEditPart != null) {
				Command command = targetEditPart.getCommand(request);
				if (command != null) {
					getDiagramEditDomain().getDiagramCommandStack().execute(
						command);
					return;
				}
			}
		}
	}

	/**
	 * Performs a direct edit request (usually by showing some type of editor)
	 * 
	 * @param request
	 *            the direct edit request
	 */
	protected void performDirectEditRequest(Request request) {
		// NULL implementation
	}

	/**
	 * @see org.eclipse.gef.editparts.AbstractEditPart#getAccessibleEditPart()
	 */
	protected AccessibleEditPart getAccessibleEditPart() {
		if (accessibleEP == null)
			accessibleEP = new AccessibleGraphicalEditPart() {

			private String getSemanticName() {
				EObject semanticElement = resolveSemanticElement();
			
				if( semanticElement != null ) {
					String name = semanticElement.getClass().getName();
					int startIndex = name.lastIndexOf('.') + 1;
					int endIndex = name.lastIndexOf( "Impl" ); //$NON-NLS-1$
					return name.substring(startIndex, endIndex);
				}
			
				return null;
			}

			public void getName(AccessibleEvent e) {
				IGraphicalEditPart childEP = getChildBySemanticHint(CommonParserHint.NAME);
				if (childEP == null) {
					childEP = getChildBySemanticHint(CommonParserHint.DESCRIPTION);
				}
				if (childEP != null) {
					IFigure fig = childEP.getFigure();
					if (fig instanceof WrapLabel) {
						e.result = ((WrapLabel) fig).getText();
					}
				} else {
					e.result = getSemanticName();
				}
			}
			};

		return accessibleEP;
	}

	/** Adds a [ref, editpart] mapping to the EditPartForElement map. */
	protected void registerModel() {
		super.registerModel();

		//Save the elements Guid to use during unregister.
		//If the reference is null, do not register.
		EObject ref = ((View) getModel()).getElement();
		if (ref == null) {
			return;
		}
		elementGuid = ProxyUtil.getProxyID(ref);

		((IDiagramGraphicalViewer) getViewer()).registerEditPartForElement(
			elementGuid, this);
	}

	/** Remove this editpart from the EditPartForElement map. */
	protected void unregisterModel() {
		super.unregisterModel();

		//Do not need to unregister if the guid is null.
		if (elementGuid == null) {
			return;
		}
		((IDiagramGraphicalViewer) getViewer()).unregisterEditPartForElement(
			elementGuid, this);
	}

	/**
	 * Refreshes a child editpart by removing it and refreshing children
	 * @param child the child to refresh
	 */
	protected final void refreshChild(GraphicalEditPart child) {
		removeChild(child);
		refreshChildren();
	}
	
	/**
	 * Refreshes a source connection editpart by removing it and refreshing source connections
	 * @param conn the connection to refresh
	 */
	protected final void refreshSourceConnection(ConnectionEditPart conn) {
		removeSourceConnection(conn);
		refreshSourceConnections();
	}

	/**
	 * Refreshes a target connection editpart by removing it and refreshing target connections
	 * @param conn the connection to refresh
	 */
	protected final void refreshTargetConnection(ConnectionEditPart conn) {
		removeTargetConnection(conn);
		refreshTargetConnections();
	}

	/**
	 * Handles the case where the semantic reference has changed.
	 */
	protected final void handleMajorSemanticChange() {
		if (getParent() instanceof GraphicalEditPart)
			((GraphicalEditPart) getParent()).refreshChild(this);
		else if (getParent() instanceof ConnectionEditPart)
			((ConnectionEditPart) getParent()).refreshChild(this);
	}
	
	/**
	 * @see org.eclipse.gef.EditPart#getDragTracker(org.eclipse.gef.Request)
	 */
	public DragTracker getDragTracker(Request request) {
		return new DragEditPartsTrackerEx(this);
	}

	/**
	 * @return <tt>true</tt> a canonical editpolicy has been installed on this editpart
	 * and it is active; otherwise <tt>false</tt>.
	 */
	public final boolean isCanonical() {
		CanonicalEditPolicy policy = (CanonicalEditPolicy)getEditPolicy(EditPolicyRoles.CANONICAL_ROLE);
		return policy == null ? false : policy.isActive();
	}

	/**
	 * Return <tt>true</tt> if the editpart's figure is visible;
	 * <tt>false</tt> otherwise.
	 */
	public boolean isSelectable() {
		return getFigure().isShowing();
	}

	/* 
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart#disableEditMode()
	 */
	public void disableEditMode() {
		this.editableEditPart.disableEditMode();		
	}
	
	/* 
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart#enableEditMode()
	 */
	public void enableEditMode() {
		this.editableEditPart.enableEditMode();
	}
	
	/* 
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart#isEditModeEnabled()
	 */
	public boolean isEditModeEnabled() {
		return this.editableEditPart.isEditModeEnabled();
	}
	
	/* 
	 * @see org.eclipse.gef.EditPart#showSourceFeedback(org.eclipse.gef.Request)
	 */
	public void showSourceFeedback(Request request) {
		if ( !isEditModeEnabled()) {
			return;
		}
		
		super.showSourceFeedback(request);
	}
	
	/* 
	 * @see org.eclipse.gef.EditPart#showTargetFeedback(org.eclipse.gef.Request)
	 */
	public void showTargetFeedback(Request request) {
		if ( !isEditModeEnabled()) {
			return;
		}
		
		super.showTargetFeedback(request);
	}

	/* 
	 * @see org.eclipse.gef.EditPart#eraseSourceFeedback(org.eclipse.gef.Request)
	 */
	public void eraseSourceFeedback(Request request) {
		if ( !isEditModeEnabled()) {
			return;
		}
		
		super.eraseSourceFeedback(request);
	}
	/* 
	 * @see org.eclipse.gef.EditPart#eraseTargetFeedback(org.eclipse.gef.Request)
	 */
	public void eraseTargetFeedback(Request request) {
		if ( !isEditModeEnabled()) {
			return;
		}

		super.eraseTargetFeedback(request);
	}
	
	/**
	 * this method will return the primary child EditPart  inside this edit part
	 * @return the primary child view inside this edit part
	 */
	public EditPart getPrimaryChildEditPart(){
		if (getChildren().size() > 0)
			return (EditPart) getChildren().get(0);
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart#getDiagramPreferencesHint()
	 */
	public PreferencesHint getDiagramPreferencesHint() {
		if (getRoot() instanceof IDiagramPreferenceSupport) {
			return ((IDiagramPreferenceSupport) getRoot()).getPreferencesHint();
		}
		return PreferencesHint.USE_DEFAULTS;
	}

}