/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2002, 2005.  All Rights Reserved.              |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.diagram.ui.editpolicies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.GroupRequest;

import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.util.ObjectAdapter;
import org.eclipse.gmf.runtime.common.ui.util.ICustomData;
import org.eclipse.gmf.runtime.diagram.core.internal.commands.BringForwardCommand;
import org.eclipse.gmf.runtime.diagram.core.internal.commands.BringToFrontCommand;
import org.eclipse.gmf.runtime.diagram.core.internal.commands.SendBackwardCommand;
import org.eclipse.gmf.runtime.diagram.core.internal.commands.SendToBackCommand;
import org.eclipse.gmf.runtime.diagram.core.internal.util.MEditingDomainGetter;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.EtoolsProxyCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.XtoolsProxyCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListItemCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.TopGraphicEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.commands.DuplicateViewsCommand;
import org.eclipse.gmf.runtime.diagram.ui.internal.commands.PasteCommand;
import org.eclipse.gmf.runtime.diagram.ui.internal.commands.RefreshEditPartCommand;
import org.eclipse.gmf.runtime.diagram.ui.internal.editparts.ISurfaceEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.requests.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.internal.requests.DuplicateRequest;
import org.eclipse.gmf.runtime.diagram.ui.internal.requests.PasteViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.layout.IInternalLayoutRunnable;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.layout.LayoutNode;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.layout.LayoutService;
import org.eclipse.gmf.runtime.diagram.ui.l10n.PresentationResourceManager;
import org.eclipse.gmf.runtime.diagram.ui.requests.ArrangeRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.diagram.ui.requests.ZOrderRequest;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutType;
import org.eclipse.gmf.runtime.emf.clipboard.core.ClipboardSupportUtil;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractModelCommand;
import org.eclipse.gmf.runtime.emf.core.edit.MEditingDomain;
import org.eclipse.gmf.runtime.emf.core.util.ProxyUtil;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import com.ibm.xtools.notation.Node;
import com.ibm.xtools.notation.View;

/*
 * @canBeSeenBy %partners
 */
/**
 * the container edit policy
 * @author sshaw
 */
public class ContainerEditPolicy
	extends org.eclipse.gef.editpolicies.ContainerEditPolicy {

	protected Command getAddCommand(GroupRequest request) {
		return null;
	}

	/**
	 * gets a delete dependant command  
	 * @param request the request
	 * @return command
	 */
	protected Command getDeleteDependantCommand(Request request) {
		return null;
	}

	protected Command getCreateCommand(CreateRequest request) {
		return null;
	}

	public Command getOrphanChildrenCommand(GroupRequest request) {
		return null;
	}

	/**
	 * Returns a command to paste the views
	 * @param request The PasteViewRequest
	 * @return Command the command to execute
	 */
	protected Command getPasteCommand(PasteViewRequest request) {
		/* Get the view context */
		IGraphicalEditPart editPart = (IGraphicalEditPart) getHost();
		View viewContext = (View) ((IAdaptable)editPart).getAdapter(View.class);

		/* Get the clipboard data */
		ICustomData[] data = request.getData();

		/* Return the paste command */
		if (data != null
			&& viewContext != null
			&& editPart instanceof ISurfaceEditPart) {
			return new EtoolsProxyCommand(new PasteCommand(PresentationResourceManager.getI18NString("PasteCommand.Label"), viewContext, data)); //$NON-NLS-1$
		}

		return null;
	}

	private class EditPartComparator implements Comparator {
		
		/* (non-Javadoc)
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		 */
		public int compare(Object arg0, Object arg1) {

			EditPart ep0 = (EditPart)arg0;
			EditPart ep1 = (EditPart)arg1;
			
			EditPart parent = ep0.getParent();
			int ep0Index = parent.getChildren().indexOf( ep0 );
			int ep1Index = parent.getChildren().indexOf( ep1 );
			
			return ep0Index - ep1Index;
		}
		
	}

	private List sortSelection( List editPartsToSort ) {

		// IF the list to be sorted is less than 2...
		if( editPartsToSort.size() < 2 ) {
			// Return the original list
			return editPartsToSort;
		}

		List toReturn = new ArrayList( editPartsToSort.size() );
		toReturn.addAll( editPartsToSort );

		Collections.sort( toReturn, new EditPartComparator() );
	
		return toReturn;
	}

	private List reverseSortSelection( List toSort ) {
		List toReturn = sortSelection( toSort );
		
		Collections.reverse( toReturn );
		return toReturn;
	}

	/**
	 * Returns a command that moves the selected views to the front
	 * @param request the ZOrder Request
	 * @return the command to execute
	 */
	protected Command getBringToFrontCommand( ZOrderRequest request ) {
		
		CompositeCommand toReturn = new CompositeCommand( "" ); //$NON-NLS-1$
		
		// Create commands for each view to move
		for (Iterator iter = sortSelection( request.getPartsToOrder() ).iterator();
			iter.hasNext(); ) {
			
			IGraphicalEditPart element = (IGraphicalEditPart) iter.next();
			toReturn.compose( new BringToFrontCommand((View) element.getModel() ));
		}
		
		return new EtoolsProxyCommand( toReturn );
	}

	/**
	 * Returns a command the moves the selected views one step toward the front
	 * @param request the ZOrder Request
	 * @return the command to execute
	 */
	protected Command getBringForwardCommand( ZOrderRequest request ) {
		
		CompositeCommand toReturn = new CompositeCommand( "" ); //$NON-NLS-1$
	
		// Create commands for each view to move
		for (Iterator iter = reverseSortSelection( request.getPartsToOrder() ).iterator(); iter.hasNext();) {
			IGraphicalEditPart toOrder = (IGraphicalEditPart) iter.next();
			
			toReturn.compose(new BringForwardCommand((View)toOrder.getModel() ));
		}
		
		return new EtoolsProxyCommand( toReturn );
	}

	/**
	 * Returns a command the moves the selected views to the back
	 * @param request the ZOrder Request
	 * @return the command to execute
	 */
	protected Command getSendToBackCommand( ZOrderRequest request ) {
		
		CompositeCommand toReturn = new CompositeCommand( "" ); //$NON-NLS-1$
		
		// Create commands for each view to move
		for (Iterator iter = reverseSortSelection(request.getPartsToOrder()).iterator(); iter.hasNext();) {
			IGraphicalEditPart toOrder = (IGraphicalEditPart) iter.next();
			
			toReturn.compose(new SendToBackCommand((View)toOrder.getModel() ));
		}
		
		return new EtoolsProxyCommand( toReturn );
	}
	
	/**
 	 * Returns a command the moves the selected views one step toward the back
	 * @param request the ZOrder Request
	 * @return the command to execute
	 */
	protected Command getSendBackwardCommand( ZOrderRequest request ) {

		CompositeCommand toReturn = new CompositeCommand( "" ); //$NON-NLS-1$
		
		// Create commands for each view to move
		for (Iterator iter = sortSelection(request.getPartsToOrder()).iterator(); iter.hasNext();) {
			IGraphicalEditPart toOrder = (IGraphicalEditPart) iter.next();
			
			toReturn.compose(new SendBackwardCommand((View)toOrder.getModel() ));
		}
		
		return new EtoolsProxyCommand( toReturn );
	}

	/**
	 * gets an arrange command 
	 * @param request
	 * @return command
	 */
	protected Command getArrangeCommand(ArrangeRequest request) {
		
		if (RequestConstants.REQ_ARRANGE_DEFERRED.equals(request.getType())) {
			String layoutType = request.getLayoutType();
			return new EtoolsProxyCommand(
				new DeferredLayoutCommand(
					request.getViewAdaptersToArrange(),
					(IGraphicalEditPart) getHost(),
					layoutType));
		}
		
		String layoutDesc = request.getLayoutType() != null ? request.getLayoutType() : LayoutType.DEFAULT;
		boolean offsetFromBoundingBox = false;
		List editparts = new ArrayList();
		
		if ( (ActionIds.ACTION_ARRANGE_ALL.equals(request.getType())) || 
			 (ActionIds.ACTION_TOOLBAR_ARRANGE_ALL.equals(request.getType()))) {
			editparts = ((IGraphicalEditPart)getHost()).getChildren();
		}
		if ( (ActionIds.ACTION_ARRANGE_SELECTION.equals(request.getType())) ||
			 (ActionIds.ACTION_TOOLBAR_ARRANGE_SELECTION.equals(request.getType()))) {
			editparts = request.getPartsToArrange();
			offsetFromBoundingBox = true;
		} 
		if (RequestConstants.REQ_ARRANGE_RADIAL.equals(request.getType())) {
			editparts = request.getPartsToArrange();
			offsetFromBoundingBox = true;
			layoutDesc = LayoutType.RADIAL;
		}
		
		List nodes = new ArrayList(editparts.size());
		ListIterator li = editparts.listIterator();
		while (li.hasNext()) {
			IGraphicalEditPart ep = (IGraphicalEditPart)li.next();
			View view = ep.getNotationView();
			if (view != null && view instanceof Node) {
				Rectangle bounds = ep.getFigure().getBounds();
				nodes.add(new LayoutNode((Node)view, bounds.width, bounds.height));
			}
		}
		
		List hints = new ArrayList(2);
		hints.add(layoutDesc);
		hints.add(getHost());
		IAdaptable layoutHint = new ObjectAdapter(hints);
		final Runnable layoutRun = layoutNodes(nodes, offsetFromBoundingBox, layoutHint);
		
		if (layoutRun instanceof IInternalLayoutRunnable) {
			return ((IInternalLayoutRunnable)layoutRun).getCommand();
		}
		else {
			return new EtoolsProxyCommand(new AbstractModelCommand("", null) {//$NON-NLS-1$
				protected CommandResult doExecute(IProgressMonitor progressMonitor) {
					layoutRun.run();
					return newOKCommandResult();
				}
			});
		}
	}
	
	/**
	 * @param offsetFromBoundingBox
	 * @param nodes
	 * @param layoutHint
	 * @return runnable
	 */
	public Runnable layoutNodes(List nodes, boolean offsetFromBoundingBox, IAdaptable layoutHint) {
		final Runnable layoutRun =  LayoutService.getInstance().layoutNodes(nodes, offsetFromBoundingBox, layoutHint);
		return layoutRun;
	}

	/**
	 * Returns a command to to duplicate views and their underlying semantic
	 * elements (if applicable) of the given editparts.
	 * 
	 * @param request
	 *            the <code>DuplicateElementsRequest</code> whose list of duplicated
	 *            views will be populated when the command is executed
	 * @return the command to perform the duplication
	 */
	private Command getDuplicateCommand(DuplicateRequest request) {
		List notationViewsToDuplicate = new ArrayList();
		Set elementsToDuplicate = new HashSet();

		for (Iterator iter = request.getEditParts().iterator(); iter.hasNext();) {
			Object ep = iter.next();
			if (ep instanceof ConnectionEditPart || ep instanceof ShapeEditPart
				|| ep instanceof ListItemCompartmentEditPart) {
				
				// TODO: Remove when I've had a chance to test this on machine
				// diagrams.
				TopGraphicEditPart topEP = ((IGraphicalEditPart) ep)
					.getTopGraphicEditPart();
				if (topEP != null
					&& topEP.getParent() instanceof ShapeCompartmentEditPart) {
					return null;
				}
				
				// More work needs to be done to duplicate connections whose
				// source or target isn't also duplicated, so disable for now.
				if (ep instanceof ConnectionEditPart) {
					ConnectionEditPart connectionEP = (ConnectionEditPart) ep;
					if (!request.getEditParts().contains(
						connectionEP.getSource())
						|| !request.getEditParts().contains(
							connectionEP.getTarget())) {
						return null;
					}
				}
				
				View notationView = (View)((IGraphicalEditPart) ep).getModel();
				if (notationView != null) {
					notationViewsToDuplicate.add(notationView);
				}
			}
		}
		
		// Remove views whose container view is getting copied.
		ClipboardSupportUtil.getCopyElements(notationViewsToDuplicate);
		
		MEditingDomain editingDomain = MEditingDomainGetter.getMEditingDomain((View)getHost().getModel());
		
		for (Iterator iter = notationViewsToDuplicate.iterator(); iter.hasNext();) {
			View view = (View) iter.next();
			EObject element = view.getElement();
			
			if (element != null) {
				EObject resolvedElement = ProxyUtil
					.resolve(editingDomain, element);
				if (resolvedElement != null) {
					elementsToDuplicate.add(resolvedElement);
				}
			}
		}

		if (!notationViewsToDuplicate.isEmpty()) {
			if (!elementsToDuplicate.isEmpty()) {
				org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest duplicateElementsRequest = new DuplicateElementsRequest(
					new ArrayList(elementsToDuplicate));
				Command duplicateElementsCommand = getHost().getCommand(
					new EditCommandRequestWrapper(duplicateElementsRequest));
				if (duplicateElementsCommand != null) {
					CompositeCommand cc = new CompositeCommand(
						PresentationResourceManager
							.getI18NString("Commands.Duplicate.Label")); //$NON-NLS-1$
					cc
						.compose(new XtoolsProxyCommand(
							duplicateElementsCommand));
					cc.compose(new DuplicateViewsCommand(
						PresentationResourceManager
							.getI18NString("Commands.Duplicate.Label"), //$NON-NLS-1$
						request, notationViewsToDuplicate,
						duplicateElementsRequest.getAllDuplicatedElementsMap()));
					return new EtoolsProxyCommand(cc);
				}
			} else {
				return new EtoolsProxyCommand(new DuplicateViewsCommand(
					PresentationResourceManager
						.getI18NString("Commands.Duplicate.Label"), //$NON-NLS-1$
					request, notationViewsToDuplicate));
			}
		}
		return null;
	}
	
	/**
	 * @see org.eclipse.gef.EditPolicy#getCommand(Request)
	 */
	public Command getCommand(Request request) {
		
		if (request instanceof ArrangeRequest) {
			return getArrangeCommand((ArrangeRequest)request);
		}

		if (RequestConstants.REQ_REFRESH.equals(request.getType())) {
			IGraphicalEditPart containerEP = (IGraphicalEditPart) getHost();

			CompositeCommand cc = new CompositeCommand(""); //$NON-NLS-1$
			ListIterator li = containerEP.getChildren().listIterator();
			while (li.hasNext()) {
				cc.compose(
					new RefreshEditPartCommand(
						(IGraphicalEditPart) li.next(),
						false));
			}
			cc.compose(
				new RefreshEditPartCommand(
					(IGraphicalEditPart) getHost(),
					true));

			return new EtoolsProxyCommand(cc);
		}

		if (RequestConstants.REQ_PASTE.equals(request.getType())) {
			return getPasteCommand((PasteViewRequest) request);
		}

		if (RequestConstants.REQ_DUPLICATE.equals(request.getType())) {
			return getDuplicateCommand(((DuplicateRequest) request));
		}

		if (ZOrderRequest.REQ_BRING_TO_FRONT.equals(request.getType())) {
			return getBringToFrontCommand((ZOrderRequest) request);
		}
		
		if (ZOrderRequest.REQ_BRING_FORWARD.equals(request.getType())) {
			return getBringForwardCommand((ZOrderRequest) request);
		}
		
		if (ZOrderRequest.REQ_SEND_TO_BACK.equals(request.getType())) {
			return getSendToBackCommand((ZOrderRequest) request);
		}
		
		if (ZOrderRequest.REQ_SEND_BACKWARD.equals(request.getType())) {
			return getSendBackwardCommand((ZOrderRequest) request);
		}

		return super.getCommand(request);
	}

	/**
	 * @see org.eclipse.gef.EditPolicy#getTargetEditPart(org.eclipse.gef.Request)
	 */
	public EditPart getTargetEditPart(Request request) {
		return understandsRequest(request) ? getHost() : null;
	}

	/**
	 * @see org.eclipse.gef.EditPolicy#understandsRequest(org.eclipse.gef.Request)
	 */
	public boolean understandsRequest(Request request) {
		return (
			ActionIds.ACTION_ARRANGE_ALL.equals(request.getType())
				|| ActionIds.ACTION_TOOLBAR_ARRANGE_ALL.equals(request.getType())
				|| ActionIds.ACTION_ARRANGE_SELECTION.equals(request.getType())
				|| ActionIds.ACTION_TOOLBAR_ARRANGE_SELECTION.equals(request.getType())
				|| RequestConstants.REQ_ARRANGE_RADIAL.equals(request.getType())
				|| RequestConstants.REQ_ARRANGE_DEFERRED.equals(request.getType())
				|| RequestConstants.REQ_REFRESH.equals(request.getType())
				|| RequestConstants.REQ_PASTE.equals(request.getType())
				|| RequestConstants.REQ_DUPLICATE.equals(request.getType())
				|| ZOrderRequest.REQ_BRING_TO_FRONT.equals(request.getType())
				|| ZOrderRequest.REQ_BRING_FORWARD.equals(request.getType())
				|| ZOrderRequest.REQ_SEND_TO_BACK.equals(request.getType())
				|| ZOrderRequest.REQ_SEND_BACKWARD.equals(request.getType()));
	}

}