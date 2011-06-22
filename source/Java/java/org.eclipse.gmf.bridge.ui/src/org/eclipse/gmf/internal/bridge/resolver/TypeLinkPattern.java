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
public class TypeLinkPattern extends TypePattern {

	private EReference source;

	private EReference target;

	public TypeLinkPattern(EClass type, EAttribute[] labels, EReference source, EReference target) {
		super(type, labels);
		this.source = source;
		this.target = target;
	}

	public EReference getSource() {
		return source;
	}

	public EReference getTarget() {
		return target;
	}
}
