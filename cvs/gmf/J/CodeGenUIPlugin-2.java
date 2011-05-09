/*
 * Copyright (c) 2005 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.codegen;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class CodeGenUIPlugin extends AbstractUIPlugin {
	private static CodeGenUIPlugin plugin;

	public CodeGenUIPlugin() {
		plugin = this;
	}

	public void start(BundleContext context) throws Exception {
		super.start(context);
		if (null == EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(GMFGenPackage.eNS_URI, new EPackage.Descriptor() {
				public EPackage getEPackage() {
					return GMFGenPackage.eINSTANCE;
				}
			});
		}
	}

	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	public static CodeGenUIPlugin getDefault() {
		return plugin;
	}
}
