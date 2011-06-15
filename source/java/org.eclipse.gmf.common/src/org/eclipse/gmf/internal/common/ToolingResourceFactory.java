/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.common;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * Resource factory for the tooling models.
 * Specifies very small line length value in xml so each attribute is positioned on
 * it's own line thus making merging easier in standard workbench text merger.
 * 
 * @author dstadnik
 */
public class ToolingResourceFactory extends XMIResourceFactoryImpl {
	

	public Resource createResource(URI uri) {
		return new ToolResource(uri);
	}
	
	
	public static class ToolResource extends XMIResourceImpl {

		public ToolResource(URI uri) {
			super(uri);
			setupOptions();
		}
		
		private void setupOptions() {
			// This option is necessary for correctly loading cross-references in the model.
			// See https://bugs.eclipse.org/bugs/show_bug.cgi?id=128998
			getDefaultLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);

			// Format xml so each attribute is positioned on it's own line.
			getDefaultSaveOptions().put(XMLResource.OPTION_LINE_WIDTH, new Integer(1));

			// Do not mark all resources referenced from resourceset as changed on any change
			// (e.g. saving .gmfmap should not result in changed .gmfgraph and .gmftool)
			getDefaultSaveOptions().put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);

			// It doesn't hurt to always allow to save schemaLocation
			// (is't not written unless there's model instance in use, with metamodel not from a registry).
			// This helps when GMF model refer to or extended by dynamic model instances.
			// @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=215282
			getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		}
	}	
}
