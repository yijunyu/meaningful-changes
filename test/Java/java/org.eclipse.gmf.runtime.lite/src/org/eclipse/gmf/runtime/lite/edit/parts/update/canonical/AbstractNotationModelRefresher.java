/**
 * Copyright (c) 2006, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.edit.parts.update.canonical;

import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.lite.commands.CreateNotationalElementCommand;
import org.eclipse.gmf.runtime.lite.edit.parts.update.TransactionalUpdateManager;
import org.eclipse.gmf.runtime.notation.View;

/**
 * Listens to the given transactional editing domain in order to update the notational model to reflect changes in the domain model.
 */
public abstract class AbstractNotationModelRefresher extends ResourceSetListenerImpl implements INotationModelRefresher {
	private NotificationFilter myFilter;
	private TransactionalEditingDomain myEditingDomain;

	public AbstractNotationModelRefresher() {
		myFilter = createFilter();
	}

	public final View getView() {
		return getHost();
	}

	/**
	 * @deprecated Use {@link TransactionalUpdateManager}.
	 */
	public void install(TransactionalEditingDomain editingDomain) {
		if (this.myEditingDomain != null && !this.myEditingDomain.equals(editingDomain)) {
			throw new IllegalStateException("Already listening to another editing domain");
		}
		this.myEditingDomain = editingDomain;
		this.myEditingDomain.addResourceSetListener(this);
	}

	/**
	 * @deprecated Use {@link TransactionalUpdateManager}.
	 */
	public boolean isInstalled() {
		return myEditingDomain != null;
	}

	/**
	 * @deprecated Use {@link TransactionalUpdateManager}.
	 */
	public void uninstall() {
		if (isInstalled()) {
			myEditingDomain.removeResourceSetListener(this);
			myEditingDomain = null;
		}
	}

	public boolean isPrecommitOnly() {
		return true;
	}

	public Command transactionAboutToCommit(ResourceSetChangeEvent event) {
		if (shouldHandleNotification(event)) {
			return buildRefreshNotationModelCommand();
		}
		return null;
	}

	public NotificationFilter getFilter() {
		return myFilter;
	}

	/**
	 * Creates and returns the command that will update the notational model to reflect changes in the domain model.
	 */
	public abstract Command buildRefreshNotationModelCommand();

	private boolean shouldHandleNotification(ResourceSetChangeEvent event) {
		if (getHost() == null || getHost().getElement() == null) {
			return false;
		}
		for(Iterator<?> it = event.getNotifications().iterator(); it.hasNext(); ) {
			Notification next = (Notification) it.next();
			if (shouldHandleNotification(next)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This method may be overridden in subclasses to filter unneeded notifications that passed the NotificationFilter.
	 * By default, it is assumed that all notifications that passed through the NotificationFilter could trigger the update.
	 */
	protected boolean shouldHandleNotification(Notification nofitication) {
		return true;
	}

	protected int getVisualID(View view) {
		try {
			return Integer.parseInt(view.getType());
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	/**
	 * Returns a command that will create a notational element to represent the domain model element described by the given <code>ElementDescriptor</code>.
	 */
	protected abstract CreateNotationalElementCommand getCreateNotationalElementCommand(ElementDescriptor descriptor);

	protected abstract NotificationFilter createFilter();

	protected abstract boolean shouldCreateView(ElementDescriptor descriptor);

	protected abstract View getHost();
}
