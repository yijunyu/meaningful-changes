/*
 * Copyright (c) 2006, 2007 Eclipse.org
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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
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

	private static final String PREF_KEY = "gmf_dashboard"; //$NON-NLS-1$

	private static final String OPTION_PREFIX = "option_"; //$NON-NLS-1$

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

	private Set<String> enabledOptions;

	private IProject project;

	public DashboardState() {
		enabledOptions = new HashSet<String>();
	}

	public DashboardState(IProject project) {
		this();
		this.project = project;
		Preferences prefs = getPreferences();
		if (prefs != null) {
			readOptions(prefs);
			dm = read(prefs, DM_KEY);
			dgm = read(prefs, DGM_KEY);
			gdm = read(prefs, GDM_KEY);
			tdm = read(prefs, TDM_KEY);
			mm = read(prefs, MM_KEY);
			gm = read(prefs, GM_KEY);
		}
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

	public boolean getOption(String name) {
		return enabledOptions.contains(name);
	}

	public void setOption(String name, boolean value) {
		if (name == null) {
			throw new IllegalArgumentException();
		}
		if (value) {
			enabledOptions.add(name);
		} else {
			enabledOptions.remove(name);
		}
		Preferences prefs = getPreferences();
		if (prefs == null) {
			return;
		}
		String key = OPTION_PREFIX + name;
		if (value) {
			prefs.put(key, "*"); //$NON-NLS-1$
		} else {
			prefs.remove(key);
		}
		savePreferences(prefs);
	}

	private void readOptions(Preferences prefs) {
		try {
			for (String key : prefs.keys()) {
				if (key.startsWith(OPTION_PREFIX)) {
					enabledOptions.add(key.substring(OPTION_PREFIX.length()));
				}
			}
		} catch (BackingStoreException e) {
			IStatus status = Plugin.createError("Unable to read options", e);
			Plugin.getDefault().getLog().log(status);
		}
	}

	private URI read(Preferences prefs, String key) {
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
		if (project == null) {
			return;
		}
		String s = null;
		if (uri != null) {
			s = uri.toString();
		}
		Preferences prefs = getPreferences();
		prefs.put(key, s);
		savePreferences(prefs);
	}

	private void savePreferences(Preferences prefs) {
		try {
			prefs.flush();
		} catch (BackingStoreException e) {
			IStatus status = Plugin.createError("Unable to update state", e);
			Plugin.getDefault().getLog().log(status);
		}
	}

	private Preferences getPreferences() {
		if (project == null) {
			return null;
		}
		Preferences node = getExistingPreferences();
		if (node != null) {
			return node;
		}
		return new ProjectScope(project).getNode(Plugin.getPluginID()).node(PREF_KEY);
	}

	private Preferences getExistingPreferences() {
		if (project == null) {
			return null;
		}
		Preferences node = Platform.getPreferencesService().getRootNode().node(ProjectScope.SCOPE);
		try {
			if (!node.nodeExists(project.getName())) {
				return null;
			}
			node = node.node(project.getName());
			if (!node.nodeExists(Plugin.getPluginID())) {
				return null;
			}
			node = node.node(Plugin.getPluginID());
			if (!node.nodeExists(PREF_KEY)) {
				return null;
			}
			return node.node(PREF_KEY);
		} catch (BackingStoreException e) {
			IStatus status = Plugin.createError("Unable to read state", e);
			Plugin.getDefault().getLog().log(status);
		}
		return null;
	}
}
