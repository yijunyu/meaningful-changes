/*
 * Copyright (c) 2006, 2008 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *           Borland - initial API and implementation
 */
package org.eclipse.gmf.internal.common.migrate;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.gmf.internal.common.ToolingResourceFactory.ToolResource;

public abstract class MigrationResource extends ToolResource {

	private MigrationHelper myMigrationHelper;

	protected MigrationResource(URI uri) {
		super(uri);
	}

	@Override
	public final void doLoad(InputStream inputStream, Map<?,?> options) throws IOException {
		try {
			super.doLoad(inputStream, options);
			handlePostLoadSuccess();
		} catch (IOException e) {
			handlePostLoadException(e);
			throw e;
		} catch (RuntimeException e) {
			handlePostLoadException(e);
			throw e;
		}
	}

	protected void handlePostLoadSuccess() {
		if (myMigrationHelper == null) {
			return;
		}
		if (myMigrationHelper.isMigrationApplied()) {
			Diagnostic diagnostic = MigrationResource.createMessageDiagnostic(this, Messages.oldModelVersionLoadedMigrationRequired);
			getWarnings().add(0, diagnostic);
		}
	}

	protected void handlePostLoadException(Exception e) {
		if (myMigrationHelper == null) {
			return;
		}
		if (myMigrationHelper.isMigrationApplied()) {
			Diagnostic diagnostic = MigrationResource.createMessageDiagnostic(this, Messages.oldModelVersionLoadErrorMigrationMayBeRequired);
			getErrors().add(0, diagnostic);
		}
	}

	@Override
	protected XMLHelper createXMLHelper() {
		MigrationDelegate delegate = createDelegate();
		assert delegate != null;
		myMigrationHelper = new MigrationHelper(this, delegate);
		return myMigrationHelper;
	}

	protected abstract MigrationDelegate createDelegate();

	/**
	 * Creates resource diagnostic wrapping the given message.
	 * @param resource the resource associated with the created diagnostic
	 * @param message non-<code>null</code> message text to be wrapped as diagnostic
	 * 
	 * @return diagnostic object
	 */
	public static Diagnostic createMessageDiagnostic(Resource resource, final String message) {
		final String location = resource.getURI() == null ? null : resource.getURI().toString();
		return new Diagnostic(message, location);
	}

	/**
	 * Just a marker for diagnostic notification messages
	 */
	public static class Diagnostic implements Resource.Diagnostic {
		private final String myMessage;
		private final String myLocation;

		Diagnostic(String message, String  location) {
			myMessage = message;
			myLocation = location;
		}

		public String getMessage() {
			return myMessage;
		}		

		public String getLocation() {
			return myLocation;
		}

		public int getColumn() {
			return 0;
		}

		public int getLine() {
			return 0;
		}
	}
}
