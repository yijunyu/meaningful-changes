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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * @author dstadnik
 */
public class StructureResolver {

	private Vocabulary nodeVocabulary;

	private Vocabulary linkVocabulary;

	private Vocabulary linkSourceVocabulary;

	private Vocabulary linkTargetVocabulary;

	public StructureResolver() {
		nodeVocabulary = new Vocabulary();
		nodeVocabulary.add(new String[] { "node", "item" }); //$NON-NLS-1$  //$NON-NLS-2$
		linkVocabulary = new Vocabulary();
		linkVocabulary.add(new String[] { "link", "connection", "relation", "dependency", "flow" }); //$NON-NLS-1$  //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
		linkSourceVocabulary = new Vocabulary();
		linkSourceVocabulary.add(new String[] { "source", "src", "from" }); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		linkTargetVocabulary = new Vocabulary();
		linkTargetVocabulary.add(new String[] { "destination", "dst", "dest", "to" }); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	}

	protected boolean guessNode(EClass type) {
		return nodeVocabulary.containsWords(type.getName());
	}

	protected boolean guessLink(EClass type) {
		return linkVocabulary.containsWords(type.getName());
	}

	protected EReference guessLinkSource(EReference[] refs) {
		for (int i = 0; i < refs.length; i++) {
			if (linkSourceVocabulary.containsWords(refs[i].getName())) {
				return refs[i];
			}
		}
		return null;
	}

	protected EReference guessLinkTarget(EReference[] refs) {
		for (int i = 0; i < refs.length; i++) {
			if (linkTargetVocabulary.containsWords(refs[i].getName())) {
				return refs[i];
			}
		}
		return null;
	}

	public TypePattern resolve(EClass type, EPackage scope) {
		if (type.isAbstract() || type.isInterface()) {
			return null;
		}
		EReference[] containments = getContainments(type, scope);
		if (containments.length == 0) {
			// skip diagram node and other unattached types
			return null;
		}
		EAttribute[] labels = getLabels(type);
		EReference[] refs = getEAllPotentialRefs(type, true);
		// heuristics : type without refs is a node
		// heuristics : type that has containment feature(s) is likely a node
		// heuristics : guess node by vocabulary
		if (refs.length == 0 || !type.getEAllContainments().isEmpty() || guessNode(type)) {
			refs = getEAllPotentialRefs(type, false);
			return new NodePattern(type, labels, refs);
		}
		EReference source;
		EReference target;
		if (refs.length == 1) {
			// heuristics : one ref is target; source is container
			source = null;
			target = refs[0];
		} else {
			// heuristics : guess source and target refs by vocabulary
			source = guessLinkSource(refs);
			target = guessLinkTarget(refs);
			if (source == null) {
				source = target == refs[0] ? refs[1] : refs[0];
			}
			if (target == null) {
				target = source == refs[1] ? refs[0] : refs[1];
			}
		}
		return new TypeLinkPattern(type, labels, source, target);
	}

	protected EAttribute[] getLabels(EClass type) {
		List<EAttribute> attrs = new ArrayList<EAttribute>();
		for (Iterator<EAttribute> it = type.getEAllAttributes().iterator(); it.hasNext();) {
			attrs.add(it.next());
		}
		return attrs.toArray(new EAttribute[attrs.size()]);
	}

	/**
	 * Finds all potential references. Such references are not containers, containments,
	 * derived and have type from the same package as the host type; thus they may
	 * connect types as links on diagram surface.
	 */
	protected EReference[] getEAllPotentialRefs(EClass type, boolean forLink) {
		List<EReference> refs = new ArrayList<EReference>();
		for (Iterator<EReference> it = type.getEAllReferences().iterator(); it.hasNext();) {
			EReference ref = it.next();
			EClass refType = ref.getEReferenceType();
			if (forLink && (refType.isSuperTypeOf(type) || ref.isMany())) {
				continue;
			}
			boolean samePackage = refType.getEPackage().equals(type.getEPackage());
			if (!ref.isDerived() && !ref.isContainer() && !ref.isContainment() && samePackage) {
				refs.add(ref);
			}
		}
		return refs.toArray(new EReference[refs.size()]);
	}

	/**
	 * Returns list of references that contain this type.
	 */
	protected EReference[] getContainments(EClass type, EPackage scope) {
		List<EReference> refs = new ArrayList<EReference>();
		for (Iterator<EObject> it = scope.eAllContents(); it.hasNext();) {
			EObject element = it.next();
			if (element instanceof EReference) {
				EReference ref = (EReference) element;
				if (ref.isContainment() && ref.getEReferenceType().isSuperTypeOf(type)) {
					refs.add(ref);
				}
			}
		}
		return refs.toArray(new EReference[refs.size()]);
	}
}
