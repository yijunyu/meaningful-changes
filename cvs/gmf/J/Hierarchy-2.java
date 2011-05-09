/*
 * Copyright (c) 2006 Borland Software Corporation
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

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * FIXME Tests!!!
 * @author artem
 */
public class Hierarchy {
	private final List/*<EReference>*/ myRefs;
	private final EPackage myDomainModel;
	private final Map/*<EClass, Set<EClass>>*/ myResult;
	private Set myAccessibleLeaves;
	private Set myAccessibleClasses = new HashSet();
	private Set myAccessibleLinkClasses = new HashSet();
	private final EClass myDiagramContainer;

	/**
	 * 
	 * @param eRefs
	 * @param diagramContainer - can be <code>null</code> 
	 * @param domainModel
	 */
	public Hierarchy(List/*<EReference>*/ eRefs, EClass diagramContainer, EPackage domainModel) {
		myRefs = eRefs;
		myDiagramContainer = diagramContainer;
		myDomainModel = domainModel;
		myResult = new HashMap();
		for (Iterator iter = eRefs.iterator(); iter.hasNext();) {
			EReference element = (EReference) iter.next();
			myResult.put(element.getEReferenceType(), new HashSet());
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

	public EReference backRef(EClass element) {
		for (Iterator it2 = myRefs.iterator(); it2.hasNext();) {
			EReference r = (EReference) it2.next();
			if (r.getEReferenceType().isSuperTypeOf(element)) {
				return r;
			}
		}
		return null;
	}

	public boolean isLeaf(EClass element) {
		return myAccessibleLeaves.contains(element);
	}

	public EReference getLinkFeature(EClass element) {
		BasicEList l = collectAllNonContainment(element);
		if (l.isEmpty()) {
			return null;
		}
		for (Iterator iter = l.iterator(); iter.hasNext();) {
			EReference ref = (EReference) iter.next();
			if (element.isSuperTypeOf(ref.getEReferenceType())) {
				continue;
			}
			for (Iterator it2 = myResult.keySet().iterator(); it2.hasNext();) {
				EClass c = (EClass) it2.next();
				if (c.isSuperTypeOf(ref.getEReferenceType())) {
					return ref;
				}
			}
		}
		return null;
	}
	public void collect() {
		collect(true);
	}

	void collect(boolean recurse) {
		Set nonLeaves = new HashSet();
		final HashSet leavesSet = new HashSet();
		for (Iterator it = myDomainModel.getEClassifiers().iterator(); it.hasNext();) {
			Object next = it.next();
			if (next instanceof EClass) {
				EClass eClass = (EClass) next;
				for (Iterator it2 = myResult.entrySet().iterator(); it2.hasNext();) {
					Map.Entry entry = (Map.Entry) it2.next();
					EClass element = (EClass) entry.getKey();
					if (element.isSuperTypeOf(eClass)) {
						((Set) entry.getValue()).add(eClass);
						if (recurse) {
							Hierarchy h2 = new Hierarchy(eClass.getEAllContainments(), null, myDomainModel);
							h2.collect(false);
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

	public Set/*<EClass>*/ getAllClasses() {
		HashSet rv = new HashSet();
		for (Iterator it = myResult.values().iterator(); it.hasNext();) {
			Set next = (Set) it.next();
			rv.addAll(next);
		}
		return rv;
	}

	public Set/*<EClass>*/ getAccessibleClasses() {
		return myAccessibleClasses;
	}

	public Set/*<EClass>*/ getAccessibleLinkClasses() {
		return myAccessibleLinkClasses;
	}

	public Set/*<EReference>*/ getAccessibleReferences() {
		return getAccessibleReferences(myAccessibleClasses.iterator());
	}

	public Set/*<EReference>*/ getAccessibleReferences(Iterator/*<EClass>*/ iter) {
		HashSet rv = new HashSet();
		for (; iter.hasNext();) {
			EClass element = (EClass) iter.next();
			rv.addAll(collectAllNonContainment(element));
		}
		return rv;
	}

	BasicEList collectAllNonContainment(EClass element) {
		BasicEList l = new BasicEList(element.getEAllReferences());
		l.removeAll(element.getEAllContainments());
		return l;
	}
}