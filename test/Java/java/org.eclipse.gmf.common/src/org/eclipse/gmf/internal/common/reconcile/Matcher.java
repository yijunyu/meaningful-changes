/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland) - initial API and implementation
 */

package org.eclipse.gmf.internal.common.reconcile;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

public interface Matcher {
	public boolean match(EObject current, EObject old);
	
	public static final Matcher FALSE = new Matcher() {
		public boolean match(EObject current, EObject old) {
			return false;
		}
	};

	public static class OR implements Matcher {
		private final Matcher[] myMatchers;

		public OR(Matcher[] matchers){
			myMatchers = matchers;
		}
		
		public OR(Collection<Matcher> matchers){
			this(matchers.toArray(new Matcher[matchers.size()]));
		}
		
		public boolean match(EObject current, EObject old) {
			boolean result = false;
			for (int i = 0; !result && i < myMatchers.length; i++){
				result = myMatchers[i].match(current, old);
			}
			return result;
		}
	}

	public static class AND implements Matcher {
		private final Matcher[] myMatchers;

		public AND(Matcher[] matchers){
			myMatchers = matchers;
		}
		
		public AND(Collection<Matcher> matchers){
			this(matchers.toArray(new Matcher[matchers.size()]));
		}
		
		public boolean match(EObject current, EObject old) {
			boolean result = true;
			for (int i = 0; result && i < myMatchers.length; i++){
				result = myMatchers[i].match(current, old);
			}
			return result;
		}
	}

}
