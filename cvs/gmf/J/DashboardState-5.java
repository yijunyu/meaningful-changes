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
package org.eclipse.gmf.bridge.ui.dashboard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.internal.bridge.ui.dashboard.Plugin;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

/**
 * EXPERIMENTAL
 * 
 * @author dstadnik
 */
public final class DashboardState {

	private static final String DM_KEY = "domainModel"; //$NON-NLS-1$

	private static final String DGM_KEY = "domainGenerationModel"; //$NON-NLS-1$

	private static final String GDM_KEY = "graphicalDefinitionModel"; //$NON-NLS-1$

	private static final String TDM_KEY = "toolingDefinitionModel"; //$NON-NLS-1$

	private static final String MM_KEY = "mappingModel"; //$NON-NLS-1$

	private static final String GM_KEY = "generationModel"; //$NON-NLS-1$

	private URI dm;

	private URI dgm;

	private URI gdm;

	private URI tdm;

	private URI mm;

	private URI gm;

	private Preferences prefs;

	public DashboardState() {
	}

	public DashboardState(Preferences prefs) {
		this.prefs = prefs;
		dm = read(DM_KEY);
		dgm = read(DGM_KEY);
		gdm = read(GDM_KEY);
		tdm = read(TDM_KEY);
		mm = read(MM_KEY);
		gm = read(GM_KEY);
	}

	public URI getDM() {
		return dm;
	}

	public URI getDGM() {
		return dgm;
	}

	public URI getGDM() {
		return gdm;
	}

	public URI getTDM() {
		return tdm;
	}

	public URI getMM() {
		return mm;
	}

	public URI getGM() {
		return gm;
	}

	public void setDM(URI uri) {
		dm = uri;
		write(DM_KEY, dm);
	}

	public void setDGM(URI uri) {
		dgm = uri;
		write(DGM_KEY, dgm);
	}

	public void setGDM(URI uri) {
		gdm = uri;
		write(GDM_KEY, gdm);
	}

	public void setTDM(URI uri) {
		tdm = uri;
		write(TDM_KEY, tdm);
	}

	public void setMM(URI uri) {
		mm = uri;
		write(MM_KEY, mm);
	}

	public void setGM(URI uri) {
		gm = uri;
		write(GM_KEY, gm);
	}

	public void setDM(IFile file) {
		dm = getURI(file);
		write(DM_KEY, dm);
	}

	public void setDGM(IFile file) {
		dgm = getURI(file);
		write(DGM_KEY, dgm);
	}

	public void setGDM(IFile file) {
		gdm = getURI(file);
		write(GDM_KEY, gdm);
	}

	public void setTDM(IFile file) {
		tdm = getURI(file);
		write(TDM_KEY, tdm);
	}

	public void setMM(IFile file) {
		mm = getURI(file);
		write(MM_KEY, mm);
	}

	public void setGM(IFile file) {
		gm = getURI(file);
		write(GM_KEY, gm);
	}

	private static URI getURI(IFile file) {
		if (file == null) {
			return null;
		}
		return URI.createPlatformResourceURI(file.getFullPath().toString(), true);
	}

	public int getModelsCount() {
		return 6;
	}

	public int getSpecifiedModelsCount() {
		int count = 0;
		if (dm != null) {
			count++;
		}
		if (dgm != null) {
			count++;
		}
		if (gdm != null) {
			count++;
		}
		if (tdm != null) {
			count++;
		}
		if (mm != null) {
			count++;
		}
		if (gm != null) {
			count++;
		}
		return count;
	}

	private URI read(String key) {
		if (prefs == null) {
			return null;
		}
		String s = prefs.get(key, null);
		if (s == null) {
			return null;
		}
		try {
			return URI.createURI(s);
		} catch (IllegalArgumentException e) {
			IStatus status = Plugin.createError("Invalid URI", e);
			Plugin.getDefault().getLog().log(status);
		}
		return null;
	}

	private void write(String key, URI uri) {
		String s = null;
		if (uri != null) {
			s = uri.toString();
		}
		prefs.put(key, s);
		try {
			prefs.flush();
		} catch (BackingStoreException e) {
			IStatus status = Plugin.createError("Unable to update state", e);
			Plugin.getDefault().getLog().log(status);
		}
	}
}