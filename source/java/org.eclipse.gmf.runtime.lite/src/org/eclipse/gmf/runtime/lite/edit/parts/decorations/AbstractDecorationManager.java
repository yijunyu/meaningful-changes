/**
 * Copyright (c) 2007 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.edit.parts.decorations;

import java.util.HashMap;

import org.eclipse.draw2d.IFigure;

/**
 * @author bblajer
 */
public abstract class AbstractDecorationManager implements IDecorationManager {
	private final IFigure myDecorationParent;
	private HashMap<String, IFigure> myDecorations;

	public AbstractDecorationManager(IFigure decorationParent) {
		myDecorationParent = decorationParent;
	}

	public void installDecoration(String key, IFigure decoration) {
		IFigure currentDecoration = getDecoration(key);
		if (currentDecoration != null) {
			myDecorations.remove(key);
			myDecorationParent.remove(currentDecoration);
		}
		if (decoration != null) {
			putDecoration(key, decoration);
			myDecorationParent.add(decoration, getConstraint(key, decoration));
		}
	}

	public IFigure getDecoration(String key) {
		return myDecorations == null ? null : myDecorations.get(key);
	}

	private void putDecoration(String key, IFigure decoration) {
		if (myDecorations == null) {
			myDecorations = new HashMap<String, IFigure>();
		}
		myDecorations.put(key, decoration);
	}

	protected IFigure getDecorationParent() {
		return myDecorationParent;
	}

	/**
	 * Returns the constraint with which the decoration will be added to the parent figure.
	 * @param key 
	 * @param decoration 
	 * @return
	 */
	protected abstract Object getConstraint(String key, IFigure decoration);
}
