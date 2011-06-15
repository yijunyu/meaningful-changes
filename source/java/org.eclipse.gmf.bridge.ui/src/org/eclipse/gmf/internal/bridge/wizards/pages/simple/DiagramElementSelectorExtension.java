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
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.internal.common.ui.ListElementSelectorExtension;

/**
 * @author dstadnik
 */
public class DiagramElementSelectorExtension extends ListElementSelectorExtension {

	protected String getModelElementName() {
		return Messages.DiagramElementSelectorElement;
	}

	protected String getModelElementLabel(EObject modelElement) {
		String name = ((EClass) modelElement).getName();
		if (name == null || name.trim().length() == 0) {
			name = Messages.DiagramElementSelectorNoName;
		}
		return name;
	}

	protected EClass getModelElementClass() {
		return EcorePackage.eINSTANCE.getEClass();
	}
}
