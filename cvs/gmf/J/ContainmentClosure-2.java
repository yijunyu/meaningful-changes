/*
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.resolver;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * @author dstadnik
 */
public class ContainmentClosure {

	private static WeakReference rootRef = new WeakReference(null); // : EClass

	private static WeakReference scopeRef = new WeakReference(null); // : EPackage

	private static WeakReference closureRef = new WeakReference(null); // : Set : EClass

	private ContainmentClosure() {
	}

	/**
	 * Checks whether type is contained within the containment closure of the root type.
	 */
	public static synchronized boolean contains(EClass root, EClass type, EPackage scope) {
		assert root != null;
		assert type != null;
		assert scope != null;
		Set closure = (Set) closureRef.get();
		if (rootRef.get() != root || scopeRef.get() != scope || closure == null) {
			closure = build(root, scope);
			rootRef = new WeakReference(root);
			scopeRef = new WeakReference(scope);
			closureRef = new WeakReference(closure);
		}
		return closure.contains(type);
	}

	private static Set build(EClass type, EPackage scope) {
		assert type != null;
		Set closure = new HashSet();
		Set roots = new HashSet(); // types that should be investigated
		roots.add(type);
		while (!roots.isEmpty()) {
			Set localRoots = roots;
			roots = new HashSet();
			for (Iterator it = localRoots.iterator(); it.hasNext();) {
				EClass root = (EClass) it.next();
				for (Iterator it1 = root.getEAllContainments().iterator(); it1.hasNext();) {
					EClass refType = ((EReference) it1.next()).getEReferenceType();
					if (closure.contains(refType)) {
						continue; // do not traverse loops
					}
					closure.add(refType);
					roots.add(refType);
					Collection subtypes = getSubtypes(refType, scope);
					if (subtypes != null) {
						for (Iterator it2 = subtypes.iterator(); it2.hasNext();) {
							EClass subtype = (EClass) it2.next();
							if (closure.contains(subtype)) {
								continue; // do not traverse loops
							}
							closure.add(subtype);
							roots.add(subtype);
						}
					}
				}
			}
		}
		return closure;
	}

	private static Collection getSubtypes(EClass type, EPackage scope) {
		Collection subtypes = null;
		for (Iterator it = scope.eAllContents(); it.hasNext();) {
			Object next = it.next();
			if (next instanceof EClass) {
				EClass nextType = (EClass) next;
				if (type != nextType && type.isSuperTypeOf(nextType)) {
					if (subtypes == null) {
						subtypes = new HashSet();
					}
					subtypes.add(nextType);
				}
			}
		}
		return subtypes;
	}
}
