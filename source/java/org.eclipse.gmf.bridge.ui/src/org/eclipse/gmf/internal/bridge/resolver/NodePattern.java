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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

/**
 * @author dstadnik
 */
public class NodePattern extends TypePattern {

	private EReference[] refLinks;

	public NodePattern(EClass type, EAttribute[] labels, EReference[] refLinks) {
		super(type, labels);
		this.refLinks = refLinks;
	}

	public EReference[] getRefLinks() {
		return refLinks;
	}
}
