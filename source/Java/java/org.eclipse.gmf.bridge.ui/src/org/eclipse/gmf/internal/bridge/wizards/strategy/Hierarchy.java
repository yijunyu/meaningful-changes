/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.wizards.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * FIXME Tests!!!
 * @author artem
 */
public class Hierarchy {
	private final List<EReference> myRefs;
	private final EPackage myDomainModel;
	private final Map<EClass, Set<EClass>> myResult;
	private Set<EClass> myAccessibleLeaves;
	private Set<EClass> myAccessibleClasses = new HashSet<EClass>();
	/**
	 * EClasses that may suit as link
	 */
	private Set<EClass> myAccessibleLinkClasses = new HashSet<EClass>();
	/**
	 * Containment references to get to classes in myAccessibleLinkClasses set
	 */
	private Set<EReference> myLinkClassContainmentRefs = new HashSet<EReference>();

	private final EClass myDiagramContainer;

	/**
	 * 
	 * @param eRefs
	 * @param diagramContainer - can be <code>null</code> 
	 * @param domainModel
	 */
	public Hierarchy(List<EReference> eRefs, EClass diagramContainer, EPackage domainModel) {
		myRefs = eRefs;
		myDiagramContainer = diagramContainer;
		myDomainModel = domainModel;
		myResult = new HashMap<EClass, Set<EClass>>();
		for (EReference element : eRefs) {
			myResult.put(element.getEReferenceType(), new HashSet<EClass>());
		}
	}

	public Hierarchy(EClass diagramContainer) {
		this(diagramContainer.getEAllContainments(), diagramContainer, diagramContainer.getEPackage());
	}

	public Hierarchy(EClass diagramContainer, EPackage domainModel) {
		this(diagramContainer.getEAllContainments(), diagramContainer, domainModel);
	}

	/**
	 * @return domain element associated with diagram itself, or <code>null</code> if not specified.
	 */
	public EClass getDiagramContainer() {
		return myDiagramContainer;
	}

	public EReference nodeBackRef(EClass nodeElement) {
		for (EReference r : myRefs) {
			if (r.getEReferenceType().isSuperTypeOf(nodeElement)) {
				return r;
			}
		}
		return null;
	}

	public EReference linkBackRef(EClass linkElement) {
		ArrayList<EReference> compatible = new ArrayList<EReference>();
		for (EReference r : myLinkClassContainmentRefs) {
			if (r.getEReferenceType().isSuperTypeOf(linkElement)) {
				compatible.add(r);
			}
		}
		if (compatible.isEmpty()) {
			return null;
		}
		// try exact match
		for (int i = compatible.size() - 1; i >= 0; i--) {
			EReference r = compatible.get(i);
			if (r.getEReferenceType().equals(linkElement)) {
				return r;
			}
		}
		// just pick any 
		return compatible.get(0);
	}

	public boolean isLeaf(EClass element) {
		return myAccessibleLeaves.contains(element);
	}

	public EReference getLinkFeature(EClass element) {
		List<EReference> l = collectAllNonContainment(element);
		if (l.isEmpty()) {
			return null;
		}
		for (EReference ref : l) {
			if (element.isSuperTypeOf(ref.getEReferenceType())) {
				continue;
			}
			// check that target is accessible (part of the scope) 
			// i.e. link target could be either superclass or subclass of one of root classes.
			for (EClass c : myResult.keySet()) {
				if (c.isSuperTypeOf(ref.getEReferenceType()) || ref.getEReferenceType().isSuperTypeOf(c)) {
					return ref;
				}
			}
		}
		return null;
	}
	public void collect() {
		collect(true);
	}

	@SuppressWarnings("unchecked")
	void collect(boolean recurse) {
		Set<EClass> nonLeaves = new HashSet<EClass>();
		final HashSet<EClass> leavesSet = new HashSet<EClass>();
		for (Iterator it = myDomainModel.getEClassifiers().iterator(); it.hasNext();) {
			Object next = it.next();
			if (next instanceof EClass) {
				EClass eClass = (EClass) next;
				for (Map.Entry<EClass, Set<EClass>> entry : myResult.entrySet()) {
					final EClass element = entry.getKey();
					if (element.isSuperTypeOf(eClass)) {
						entry.getValue().add(eClass);
						if (recurse) {
							Hierarchy h2 = new Hierarchy(eClass.getEAllContainments(), null, myDomainModel);
							h2.collect(false);
							myLinkClassContainmentRefs.addAll(eClass.getEAllContainments());
							myAccessibleLinkClasses .addAll(h2.getAccessibleClasses());
							leavesSet.addAll(h2.myAccessibleLeaves);
						}
						if (!eClass.isAbstract() &&  !eClass.isInterface()) {
							myAccessibleClasses.add(eClass);
						}
						nonLeaves.addAll(eClass.getESuperTypes());
					}
				}
			}
		}
		leavesSet.addAll(myAccessibleClasses);
		leavesSet.removeAll(nonLeaves);
		myAccessibleLeaves = Collections.unmodifiableSet(leavesSet);
		myAccessibleClasses = Collections.unmodifiableSet(myAccessibleClasses);
		myAccessibleLinkClasses = Collections.unmodifiableSet(myAccessibleLinkClasses);
	}

	public Set<EClass> getAllClasses() {
		HashSet<EClass> rv = new HashSet<EClass>();
		for (Set<EClass> next : myResult.values()) {
			rv.addAll(next);
		}
		return rv;
	}

	public Set<EClass> getAccessibleClasses() {
		return myAccessibleClasses;
	}

	public Set<EClass> getAccessibleLinkClasses() {
		return myAccessibleLinkClasses;
	}

	public Set<EReference> getAccessibleReferences() {
		return getAccessibleReferences(myAccessibleClasses.iterator());
	}

	public Set<EReference> getAccessibleReferences(Iterator<EClass> iter) {
		HashSet<EReference> rv = new HashSet<EReference>();
		for (; iter.hasNext();) {
			EClass element = iter.next();
			rv.addAll(collectAllNonContainment(element));
		}
		return rv;
	}

	@SuppressWarnings({"unchecked" })
	List<EReference> collectAllNonContainment(EClass element) {
		List<EReference> l = new LinkedList<EReference>(element.getEAllReferences());
		l.removeAll(element.getEAllContainments());
		return l;
	}
}
