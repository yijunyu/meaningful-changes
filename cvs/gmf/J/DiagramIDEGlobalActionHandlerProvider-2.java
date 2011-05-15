/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2005.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.diagram.ui.providers.ide.providers;

import java.util.Hashtable;

import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;

import org.eclipse.gmf.runtime.common.ui.services.action.global.AbstractGlobalActionHandlerProvider;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionHandler;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionHandlerContext;

/**
 * The provider for the DiagramIDEGlobalActionHandler. 
 * 
 * @author Wayne Diu, wdiu
 */
public final class DiagramIDEGlobalActionHandlerProvider
	extends AbstractGlobalActionHandlerProvider {

	/**
	 * List that contains all the IGlobalActionHandlers mapped to the
	 * IWorkbenchParts
	 */
	private Hashtable handlerList = new Hashtable();

	/**
	 * Constructor for PresentationGlobalActionHandlerProvider.
	 */
	public DiagramIDEGlobalActionHandlerProvider() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.common.ui.services.action.filter.global.IGlobalActionHandlerProvider#getGlobalActionHandler(IGlobalActionHandlerContext)
	 */
	public IGlobalActionHandler getGlobalActionHandler(
			final IGlobalActionHandlerContext context) {
		/* create the handler */
		if (!getHandlerList().containsKey(context.getActivePart())) {
			getHandlerList().put(context.getActivePart(),
				new DiagramIDEGlobalActionHandler());
			/*
			 * register as a part listener so that the cache can be cleared when
			 * the part is disposed
			 */
			context.getActivePart().getSite().getPage().addPartListener(
				new IPartListener() {

					private IWorkbenchPart localPart = context.getActivePart();

					/**
					 * @see org.eclipse.ui.IPartListener#partActivated(IWorkbenchPart)
					 */
					public void partActivated(IWorkbenchPart part) {
						// NULL implementation
					}

					/**
					 * @see org.eclipse.ui.IPartListener#partBroughtToTop(IWorkbenchPart)
					 */
					public void partBroughtToTop(IWorkbenchPart part) {
						// NULL implementation
					}

					/**
					 * @see org.eclipse.ui.IPartListener#partClosed(IWorkbenchPart)
					 */
					public void partClosed(IWorkbenchPart part) {
						/* remove the cache associated with the part */
						if (part != null && part == localPart
							&& getHandlerList().containsKey(part)) {
							getHandlerList().remove(part);
							localPart.getSite().getPage().removePartListener(
								this);
							localPart = null;
						}
					}

					/**
					 * @see org.eclipse.ui.IPartListener#partDeactivated(IWorkbenchPart)
					 */
					public void partDeactivated(IWorkbenchPart part) {
						// NULL implementation
					}

					/**
					 * @see org.eclipse.ui.IPartListener#partOpened(IWorkbenchPart)
					 */
					public void partOpened(IWorkbenchPart part) {
						// NULL implementation
					}
				});
		}
		return (DiagramIDEGlobalActionHandler) getHandlerList().get(
			context.getActivePart());
	}

	/**
	 * Returns the handlerList.
	 * 
	 * @return Hashtable
	 */
	private Hashtable getHandlerList() {
		return handlerList;
	}
}