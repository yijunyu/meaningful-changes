/**
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.edit.parts.update;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.FilterManager;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.lite.edit.parts.update.canonical.INotationModelRefresher;
import org.eclipse.gmf.runtime.notation.CanonicalStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * Manages update for the diagram by requesting refresh of affected edit parts at the end of each transaction.
 * Also manages notation model refreshers which are allowed to contribute their trigger commands before the transaction is committed.
 */
public class TransactionalUpdateManager extends ResourceSetListenerImpl {
	private final EditPartViewer myEditPartViewer;

	private final HashMap<EObject, Collection<IUpdatableEditPart>> myRegisteredListeners = new HashMap<EObject, Collection<IUpdatableEditPart>>();

	private final NotationModelRefresherHolder myNotationModelRefreshers = new NotationModelRefresherHolder();

	private TransactionalEditingDomain myEditingDomain;

	/**
	 * Creates an instance of <code>TransactionalUpdateManager</code>.
	 */
	public TransactionalUpdateManager(EditPartViewer editPartViewer) {
		myEditPartViewer = editPartViewer;
	}

	/**
	 * Installs the update manager as a listener to  the given editing domain. The receiver will start listening and dispatching notification to 
	 * registered refreshers.
	 */
	public void install(TransactionalEditingDomain editingDomain) {
		if (myEditingDomain != null) {
			throw new IllegalStateException("Already listening to an editing domain");
		}
		myEditingDomain = editingDomain;
		myEditingDomain.addResourceSetListener(this);
	}

	/**
	 * Tells whether the update manager is installed. Only installed update managers dispatch notifications.
	 */
	public boolean isInstalled() {
		return myEditingDomain != null;
	}

	/**
	 * Uninstalls the update manager. It will stop receiving and dispatching notifications to any listeners.
	 */
	public void uninstall() {
		if (isInstalled()) {
			myEditingDomain.removeResourceSetListener(this);
			myEditingDomain = null;
		}
	}

	/**
	 * Returns the command that, if applied, synchronizes the notational model with the underlying domain model.
	 */
	public Command buildRefreshNotationModelCommand() {
		return myNotationModelRefreshers.buildNotationRefreshCommand();
	}

	public void addNotationModelRefresher(INotationModelRefresher refresher) {
		myNotationModelRefreshers.addNotationModelRefresher(refresher);
	}

	public void removeNotationModelRefresher(INotationModelRefresher refresher) {
		myNotationModelRefreshers.removeNotationModelRefresher(refresher);
	}

	public boolean isNotationModelRefresherInstalled(INotationModelRefresher refresher) {
		return myNotationModelRefreshers.isNotationModelRefresherInstalled(refresher);
	}

	/**
	 * Registers the given updatable edit part as a listener to the given <code>EObject</code>. 
	 */
	public void addUpdatableEditPart(EObject source, IUpdatableEditPart listener) {
		if (source == null || listener == null) {
			return;
		}
		Collection<IUpdatableEditPart> listeners = myRegisteredListeners.get(source);
		if (listeners == null) {
			listeners = new LinkedList<IUpdatableEditPart>();
			myRegisteredListeners.put(source, listeners);
		}
		listeners.add(listener);
	}

	/**
	 * Unregisters the given updatable edit part as a listener to the given <code>EObject</code>. 
	 */
	public void removeUpdatableEditPart(EObject source, IUpdatableEditPart listener) {
		if (source == null || listener == null) {
			return;
		}
		Collection<IUpdatableEditPart> listeners = myRegisteredListeners.get(source);
		if (listeners == null) {
			return;
		}
		listeners.remove(listener);
		if (listeners.isEmpty()) {
			myRegisteredListeners.remove(source);
		}
	}

	public void dispose() {
		myRegisteredListeners.clear();
		myNotationModelRefreshers.dispose();
	}

	protected final Collection<IUpdatableEditPart> getRegisteredListeners(EObject source) {
		return myRegisteredListeners.get(source);
	}

	protected final Collection<IUpdatableEditPart> getRegisteredListeners(Notification msg) {
		Object notifier = msg.getNotifier();
		if (notifier instanceof EObject) {
			Collection<IUpdatableEditPart> result = getRegisteredListeners((EObject) notifier);
			if (result != null) {
				return result;
			}
		}
		return Collections.emptyList();
	}

	@Override
	public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
		myNotationModelRefreshers.startRecording();
		try {
			executeRefreshers(event);
			return myNotationModelRefreshers.buildNotationRefreshCommand(event);
		} finally {
			myNotationModelRefreshers.stopRecording();
		}
	}

	@SuppressWarnings("unchecked")
	private void executeRefreshers(ResourceSetChangeEvent event) {
		ComposeableRefresherImpl affectedRefreshers = new ComposeableRefresherImpl();
		for (Notification msg : (Collection<Notification>) event.getNotifications()) {
			Collection<IUpdatableEditPart> affectedEditParts = findAffectedParts(msg);
			for(IUpdatableEditPart next : affectedEditParts) {
				processRefreshers(affectedRefreshers, next, msg);
			}
			Collection<IUpdatableEditPart> registeredListeners = getRegisteredListeners(msg);
			for(IUpdatableEditPart next : registeredListeners) {
				processRefreshers(affectedRefreshers, next, msg);
			}
			if (isCanonicalStyleEvent(msg)) {
				myNotationModelRefreshers.processCanonicalStyleEvent(msg);
			}
		}
		affectedRefreshers.refresh();
	}

	@Override
	public void resourceSetChanged(ResourceSetChangeEvent event) {
		if (event.getTransaction() == null) {
			//Although the API doc explicitly states that this should never happen, transaction is in fact <code>null</code> while broadcasting
			//unbatched notifications. However, it seems that this only occurs inside read-only transactions, and thus it is not necessary to do something 
			//about such situations.
			return;
		}
		if (Boolean.TRUE.equals(event.getTransaction().getOptions().get(Transaction.OPTION_NO_TRIGGERS))) {
			//the transaction did not contain triggers, e.g., because it was an undo/redo transaction. We should execute the 
			//associated refreshers, but should not build the notation refresh command, since it is not requested.
			executeRefreshers(event);
		}
		for (Iterator<EObject> it = myRegisteredListeners.keySet().iterator(); it.hasNext(); ) {
			EObject next = it.next();
			if (next.eResource() == null) {
				it.remove();
			}
		}
		myNotationModelRefreshers.removeStaleRefreshers();
	}

	public boolean isCanonicalStyleEvent(org.eclipse.emf.common.notify.Notification msg) {
		if (NotationPackage.eINSTANCE.getCanonicalStyle_Canonical() == msg.getFeature()) {
			return msg.getNewBooleanValue();
		}
		if (NotationPackage.eINSTANCE.getView_Styles() == msg.getFeature()) {
			if (UpdaterUtil.affects(msg, NotationPackage.eINSTANCE.getCanonicalStyle())) {
				CanonicalStyle style = (CanonicalStyle) ((View) msg.getNotifier()).getStyle(NotationPackage.eINSTANCE.getCanonicalStyle());
				if (style == null) {
					return true;
				}
				return style.isCanonical();
			}
		}
		return false;
	}

	protected void processRefreshers(ComposeableRefresherImpl affectedRefreshers, IUpdatableEditPart next, Notification msg) {
		if (next instanceof IExternallyUpdatableEditPart) {
			for (IExternallyUpdatableEditPart.ExternalRefresher nextExternalRefresher : ((IExternallyUpdatableEditPart) next).getExternalRefreshers()) {
				if (nextExternalRefresher.isAffectingEvent(msg)) {
					affectedRefreshers.addRefresher(nextExternalRefresher);
				}
			}
		}
		IUpdatableEditPart.Refresher refresher = next.getRefresher((EStructuralFeature)msg.getFeature(), msg);
		affectedRefreshers.addRefresher(refresher);
	}

	protected final EditPartViewer getEditPartViewer() {
		return myEditPartViewer;
	}

	protected Collection<IUpdatableEditPart> findAffectedParts(Notification msg) {
		Object notifier = msg.getNotifier();
		if (notifier instanceof EObject) {
			View view = getView((EObject) notifier);
			if (view != null) {
				EditPart affectedEditPart = (EditPart) myEditPartViewer.getEditPartRegistry().get(view);
				if (affectedEditPart instanceof IUpdatableEditPart) {
					if (shouldNotifyParent(msg) && affectedEditPart.getModel() == view && affectedEditPart.getParent() instanceof IUpdatableEditPart) {
						return Arrays.asList((IUpdatableEditPart) affectedEditPart, (IUpdatableEditPart) affectedEditPart.getParent());
					}
					return Collections.singleton((IUpdatableEditPart) affectedEditPart);
				}
				return Collections.emptyList();
			}
		}
		return Collections.emptyList();
	}

	protected boolean shouldNotifyParent(Notification msg) {
		if (msg.getFeature() == NotationPackage.eINSTANCE.getView_Visible()) {
			return true;
		}
		if (msg.getFeature() == EcorePackage.eINSTANCE.getEModelElement_EAnnotations()) {
			return msg.getNotifier() instanceof View;
		}
		return false;
	}

	private View getView(EObject offspring) {
		while (offspring != null && (offspring instanceof View == false || isFiltered((View) offspring))) {
			offspring = offspring.eContainer();
		}
		return (View) offspring;
	}

	protected boolean isFiltered(View view) {
		return false == myEditPartViewer.getEditPartRegistry().get(view) instanceof IUpdatableEditPart;
	}

	private static class NotationModelRefresherHolder {
		private final HashMap<View, Collection<INotationModelRefresher>> myListeners = new HashMap<View, Collection<INotationModelRefresher>>();
		private Set<INotationModelRefresher> myJustAddedListeners;

		void addNotationModelRefresher(INotationModelRefresher refresher) {
			if (refresher == null) {
				return;
			}
			View view = refresher.getView();
			if (view == null || view.eResource() == null) {
				return;
			}
			Collection<INotationModelRefresher> listeners = myListeners.get(view);
			if (listeners == null) {
				listeners = new LinkedList<INotationModelRefresher>();
				myListeners.put(view, listeners);
			}
			if (!listeners.contains(refresher)) {
				listeners.add(refresher);
			}
			if (myJustAddedListeners != null) {
				myJustAddedListeners.add(refresher);
			}
		}

		boolean isNotationModelRefresherInstalled(INotationModelRefresher refresher) {
			if (myJustAddedListeners != null && myJustAddedListeners.contains(refresher)) {
				return true;
			}
			if (refresher == null) {
				return false;
			}
			View view = refresher.getView();
			if (view == null) {
				return false;
			}
			Collection<INotationModelRefresher> listeners = myListeners.get(view);
			if (listeners == null) {
				return false;
			}
			return listeners.contains(refresher);
		}

		void processCanonicalStyleEvent(Notification msg) {
			assert myJustAddedListeners != null;
			Collection<INotationModelRefresher> affectedRefreshers = myListeners.get(msg.getNotifier());
			if (affectedRefreshers != null) {
				myJustAddedListeners.addAll(affectedRefreshers);
			}
		}

		Command buildNotationRefreshCommand() {
			CompoundCommand result = new CompoundCommand();
			for(INotationModelRefresher next : getAllNotationModelRefreshers()) {
				Command refreshNotationModelCommand = next.buildRefreshNotationModelCommand();
				result.appendIfCanExecute(refreshNotationModelCommand);
			}
			return result.isEmpty() ? null : result;
		}

		Command buildNotationRefreshCommand(ResourceSetChangeEvent event) throws RollbackException {
			CompoundCommand result = new CompoundCommand();
			ArrayList<Notification> cache = new ArrayList<Notification>(event.getNotifications().size());
			for(INotationModelRefresher next : getAllNotationModelRefreshers()) {
				ResourceSetChangeEvent nextEvent;
				if (myJustAddedListeners.contains(next)) {
					nextEvent = event;
				} else {
					List<?> filtered = FilterManager.getInstance().select(event.getNotifications(), next.getFilter(), cache);
					if (filtered.isEmpty()) {
						continue;
					}
					nextEvent = new ResourceSetChangeEvent(event.getEditingDomain(), event.getTransaction(), event.getNotifications());
				}
				if (nextEvent != null) {
					Command nextCommand = next.transactionAboutToCommit(nextEvent);
					if (nextCommand != null) {
						result.append(nextCommand);
					}
				}
			}
			return result.isEmpty() ? null : result;
		}

		void removeNotationModelRefresher(INotationModelRefresher refresher) {
			if (refresher == null) {
				return;
			}
			View view = refresher.getView();
			if (view == null) {
				return;
			}
			Collection<INotationModelRefresher> listeners = myListeners.get(view);
			if (listeners != null) {
				listeners.remove(refresher);
			}
			if (myJustAddedListeners != null) {
				myJustAddedListeners.remove(refresher);
			}
		}

		private Collection<INotationModelRefresher> getAllNotationModelRefreshers() {
			Collection<INotationModelRefresher> result = new HashSet<INotationModelRefresher>();
			for(Collection<INotationModelRefresher> next : myListeners.values()) {
				if (next != null) {
					result.addAll(next);
				}
			}
			return result;
		}

		void startRecording() {
			myJustAddedListeners = new HashSet<INotationModelRefresher>();
		}

		void stopRecording() {
			myJustAddedListeners.clear();
			myJustAddedListeners = null;
		}

		void removeStaleRefreshers() {
			for (Iterator<Map.Entry<View, Collection<INotationModelRefresher>>> it = myListeners.entrySet().iterator(); it.hasNext(); ) {
				Map.Entry<View, Collection<INotationModelRefresher>> next = it.next();
				if (next.getKey().eResource() == null) {
					it.remove();
				}
			}
		}

		void dispose() {
			myListeners.clear();
		}
	}
}
