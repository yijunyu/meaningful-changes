/**
 * Copyright (c) 2006 Borland Software Corporation
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

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.lite.commands.CreateNotationalElementCommand;
import org.eclipse.gmf.runtime.lite.commands.RemoveNotationalElementCommand;
import org.eclipse.gmf.runtime.lite.commands.ReplaceNotationalElementCommand;
import org.eclipse.gmf.runtime.notation.View;

/**
 * A notation model refresher that is specifically suited to update children of the element.
 */
public abstract class ChildNotationModelRefresher extends AbstractNotationModelRefresher {
	public ChildNotationModelRefresher() {
	}

	public Command buildRefreshNotationModelCommand() {
		List/*<ElementDescriptor>*/ semanticChildren = getSemanticChildNodes();
		List/*<View>*/ notationalChildren = getHost().getChildren();
		if (semanticChildren.isEmpty() && notationalChildren.isEmpty()) {
			return null;
		}
		final Map semanticToNotational = new HashMap();
		for(Iterator it = notationalChildren.iterator(); it.hasNext(); ) {
			View next = (View) it.next();
			if (next.isSetElement()) {
				EObject nextSemantic = next.getElement();
				if (nextSemantic != null) {
					semanticToNotational.put(nextSemantic, next);
				}
			}
		}
		CompoundCommand command = new CompoundCommand();
		for(Iterator it = semanticChildren.iterator(); it.hasNext(); ) {
			ElementDescriptor next = (ElementDescriptor) it.next();
			EObject node = next.getElement();
			View currentView = (View) semanticToNotational.remove(node);
			int nodeVisualID = next.getVisualID();
			if (currentView == null) {
				if (shouldCreateView(next)) {
					command.appendIfCanExecute(getCreateNotationalElementCommand(next));
				}
			} else if (nodeVisualID != getVisualID(currentView)) {
				CreateNotationalElementCommand notationalCommand = getCreateNotationalElementCommand(next);
				if (notationalCommand != null) {
					command.appendIfCanExecute(new ReplaceNotationalElementCommand(getHost(), notationalCommand, currentView));
				} else {
					command.appendIfCanExecute(new RemoveNotationalElementCommand(getHost(), currentView));
				}
			}
		}
		for(Iterator it = semanticToNotational.values().iterator(); it.hasNext(); ) {
			View obsoleteView = (View) it.next();
			command.appendIfCanExecute(new RemoveNotationalElementCommand(getHost(), obsoleteView));
		}
		return command.getCommandList().isEmpty() ? null : command;
	}

	protected abstract List/*<ElementDescriptor>*/ getSemanticChildNodes();
}
