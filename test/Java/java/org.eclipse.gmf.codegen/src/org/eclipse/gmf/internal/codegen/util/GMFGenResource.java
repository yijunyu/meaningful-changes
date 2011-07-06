/*
 * Copyright (c) 2007, 2008 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Borland - initial API and implementation
 */
package org.eclipse.gmf.internal.codegen.util;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.BasicResourceHandler;
import org.eclipse.gmf.internal.common.ToolingResourceFactory;
import org.eclipse.gmf.internal.common.migrate.Messages;
import org.eclipse.gmf.internal.common.migrate.MigrationResource;

public class GMFGenResource extends MigrationResource {

	/**
	 * Migration from 2005 model to 2006 dynamic model and then once again to 2008 normal model during XML reading 
	 */
	public static class Factory extends ToolingResourceFactory {
		@Override
		public Resource createResource(URI uri) {
			GMFGenResource r = new GMFGenResource(uri);
			r.getDefaultLoadOptions().put(XMLResource.OPTION_RESOURCE_HANDLER, new X());
			return r;
		}
	}


	/**
	 * Migration from 2006 dynamic model to 2008 normal model
	 */
	public static class Factory2 extends ToolingResourceFactory {
		@Override
		public Resource createResource(URI uri) {
			ToolResource r = (ToolResource) super.createResource(uri);
			r.getDefaultLoadOptions().put(XMLResource.OPTION_RESOURCE_HANDLER, new X());
			return r;
		}
	}

	private static class X extends BasicResourceHandler {
		@Override
		public void postLoad(XMLResource resource, InputStream inputStream, Map<?, ?> options) {
			LinkedList<EObject> migrated = new LinkedList<EObject>();
			for (EObject o : resource.getContents()) {
				if (o != null && "GenEditorGenerator".equals(o.eClass().getName()) && MigrationDelegate.get2006GenModelURI().equals(o.eClass().getEPackage().getNsURI())) {
					final Migrate2008 migrate = new Migrate2008();
					EObject m = migrate.go(o);
					if (m != null && migrate.wasMigrationApplied()) { // XXX multiple warnings if there are few GenEditorGenerators in the resource
						resource.getWarnings().add(0, MigrationResource.createMessageDiagnostic(resource, Messages.oldModelVersionLoadedMigrationRequired));
					}
					migrated.add(m != null ? m : o);
				} else {
					migrated.add(o);
				}
			}
			resource.getContents().clear();
			resource.getContents().addAll(migrated);
		}
	}

	private GMFGenResource(URI uri) {
		super(uri);
	}

	@Override
	protected org.eclipse.gmf.internal.common.migrate.MigrationDelegate createDelegate() {
		MigrationDelegate migrationHelper = new MigrationDelegate();
		migrationHelper.init();
		return migrationHelper;
	}
}
