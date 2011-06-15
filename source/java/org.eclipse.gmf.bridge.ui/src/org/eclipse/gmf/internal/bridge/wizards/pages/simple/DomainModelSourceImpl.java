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
package org.eclipse.gmf.internal.bridge.wizards.pages.simple;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * @author dstadnik
 */
public class DomainModelSourceImpl implements DomainModelSource {

	private final EPackage contents;

	private final EClass diagramElement;

	public DomainModelSourceImpl(EPackage contents, EClass diagramElement) {
		this.contents = contents;
		this.diagramElement = diagramElement;
	}

	public EPackage getContents() {
		return contents;
	}

	public EClass getDiagramElement() {
		return diagramElement;
	}

	public boolean isDisabled(EObject domainElement) {
		return false;
	}

	public boolean like(DomainModelSource another) {
		return contents == another.getContents() && diagramElement == another.getDiagramElement();
	}
}
