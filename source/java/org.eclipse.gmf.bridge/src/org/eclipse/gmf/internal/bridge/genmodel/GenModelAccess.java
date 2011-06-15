/*
 * Copyright (c) 2005, 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.genmodel;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author artem
 *
 */
public interface GenModelAccess {

	GenModel model();
	IStatus load();
	IStatus load(ResourceSet resourceSet);
	void unload();

	public class Adapter implements GenModelAccess {
		private final GenModel model;

		public Adapter(GenModel aModel) {
			model = aModel;
		}
		public GenModel model() {
			return model;
		}
		public IStatus load() {
			return Status.OK_STATUS;
		}
		public IStatus load(ResourceSet rs) {
			return load();
		}
		public void unload() {
			// do nothing
		}
	}
}
