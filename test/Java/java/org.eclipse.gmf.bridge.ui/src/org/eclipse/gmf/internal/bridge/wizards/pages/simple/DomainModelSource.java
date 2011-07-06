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
public interface DomainModelSource {

	public EPackage getContents();

	/**
	 * EClass mapped to diagram canvas.
	 */
	public EClass getDiagramElement();

	/**
	 * Returns true if domain element should be ignored.
	 * When model is being reconciled these elements are
	 * represented in it and should not be processed.
	 */
	public boolean isDisabled(EObject domainElement);
}
