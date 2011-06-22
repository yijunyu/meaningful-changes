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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * @author dstadnik
 */
public class ContainmentClosure {

	private WeakReference<EClass> rootRef = new WeakReference<EClass>(null); // : EClass

	private WeakReference<EPackage> scopeRef = new WeakReference<EPackage>(null); // : EPackage

	private WeakReference<Set<EClass>> closureRef = new WeakReference<Set<EClass>>(null); // : Set : EClass

	public ContainmentClosure() {
	}

	/**
	 * Checks whether type is contained within the containment closure of the root type.
	 */
	public synchronized boolean contains(EClass root, EClass type, EPackage scope) {
		assert root != null;
		assert type != null;
		assert scope != null;
		Set<EClass> closure = closureRef.get();
		if (rootRef.get() != root || scopeRef.get() != scope || closure == null) {
			closure = build(root, scope);
			rootRef = new WeakReference<EClass>(root);
			scopeRef = new WeakReference<EPackage>(scope);
			closureRef = new WeakReference<Set<EClass>>(closure);
		}
		return closure.contains(type);
	}

	private static Set<EClass> build(EClass type, EPackage scope) {
		assert type != null;
		Set<EClass> closure = new HashSet<EClass>();
		Set<EClass> roots = new HashSet<EClass>(); // types that should be investigated
		roots.add(type);
		while (!roots.isEmpty()) {
			Set<EClass> localRoots = roots;
			roots = new HashSet<EClass>();
			for (Iterator<EClass> it = localRoots.iterator(); it.hasNext();) {
				EClass root = it.next();
				for (Iterator<EReference> it1 = root.getEAllContainments().iterator(); it1.hasNext();) {
					EClass refType = it1.next().getEReferenceType();
					if (closure.contains(refType)) {
						continue; // do not traverse loops
					}
					closure.add(refType);
					roots.add(refType);
					Collection<EClass> subtypes = getSubtypes(refType, scope);
					if (subtypes != null) {
						for (Iterator<EClass> it2 = subtypes.iterator(); it2.hasNext();) {
							EClass subtype = it2.next();
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

	private static Collection<EClass> getSubtypes(EClass type, EPackage scope) {
		Collection<EClass> subtypes = null;
		for (Iterator<EObject> it = scope.eAllContents(); it.hasNext();) {
			EObject next = it.next();
			if (next instanceof EClass) {
				EClass nextType = (EClass) next;
				if (type != nextType && type.isSuperTypeOf(nextType)) {
					if (subtypes == null) {
						subtypes = new HashSet<EClass>();
					}
					subtypes.add(nextType);
				}
			}
		}
		return subtypes;
	}
}
