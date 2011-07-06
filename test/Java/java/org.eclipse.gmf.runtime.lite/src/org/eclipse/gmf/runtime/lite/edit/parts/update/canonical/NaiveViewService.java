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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * Implementation of {@link IViewService} that does not use any information to match views with domain elements.  
 */
public class NaiveViewService extends DelegatingViewService {
	public NaiveViewService(Diagram diagram) {
		super(new ExactMatchViewService(diagram));
	}

	private static class ExactMatchViewService implements IExactMatchFinder {
		private Diagram myDiagram;
		public ExactMatchViewService(Diagram diagram) {
			myDiagram = diagram;
		}
		public View findView(EObject domainElement) {
			if (myDiagram.getElement() == domainElement) {
				return myDiagram;
			}
			return null;
		}
		public Diagram getDiagram() {
			return myDiagram;
		}
	}
}
