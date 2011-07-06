/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.codegen;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IInitializer;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.ISourceRange;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

/**
 * @author dstadnik
 */
public class HideGeneratedFilter extends ViewerFilter {

	private static final String GENERATED = "@generated"; //$NON-NLS-1$

	private static final String NOT = "NOT"; //$NON-NLS-1$

	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if (element instanceof IPackageFragment) {
			IPackageFragment pfrag = (IPackageFragment) element;
			try {
				return !allGenerated(pfrag);
			} catch (JavaModelException jme) {
			}
		} else if (element instanceof ICompilationUnit) {
			ICompilationUnit unit = (ICompilationUnit) element;
			try {
				return !allGenerated(unit);
			} catch (JavaModelException jme) {
			}
		} else if (element instanceof IType) {
			try {
				return !allGenerated((IType) element);
			} catch (JavaModelException jme) {
			}
		} else if (element instanceof IMember) {
			IMember member = (IMember) element;
			return !hasGeneratedTag(member);
		}
		return true;
	}

	private boolean allGenerated(IPackageFragment pfrag) throws JavaModelException {
		for (ICompilationUnit unit : pfrag.getCompilationUnits()) {
			if (!allGenerated(unit)) {
				return false;
			}
		}
		return true;
	}

	private boolean allGenerated(ICompilationUnit unit) throws JavaModelException {
		for (IType type : unit.getTypes()) {
			if (!allGenerated(type)) {
				return false;
			}
		}
		return true;
	}

	private boolean allGenerated(IType type) throws JavaModelException {
		for (IField field : type.getFields()) {
			if (!hasGeneratedTag(field)) {
				return false;
			}
		}
		for (IMethod method : type.getMethods()) {
			if (!hasGeneratedTag(method)) {
				return false;
			}
		}
		for (IInitializer initializer : type.getInitializers()) {
			if (!hasGeneratedTag(initializer)) {
				return false;
			}
		}
		for (IType subtype : type.getTypes()) {
			if (!allGenerated(subtype)) {
				return false;
			}
		}
		return true;
	}

	private boolean hasGeneratedTag(IMember member) {
		try {
			ISourceRange range = member.getJavadocRange();
			if (range != null) {
				String source = member.getCompilationUnit().getSource();
				String javadoc = source.substring(range.getOffset(), range.getOffset() + range.getLength());
				if (javadoc != null) {
					int pos = javadoc.indexOf(GENERATED);
					if (pos >= 0) {
						javadoc = javadoc.substring(pos + GENERATED.length()).trim();
						if (!javadoc.startsWith(NOT)) {
							return true;
						}
					}
				}
			}
		} catch (JavaModelException jme) {
		}
		return false;
	}
}
