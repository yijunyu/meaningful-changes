/**
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alexander Fedorov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.transform;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Preferences;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.gmf.internal.bridge.ui.Plugin;


public class TransformOptions extends AbstractPreferenceInitializer {
	
	private static final String PREF_GENERATE_RCP = "generate_rcp"; //$NON-NLS-1$
	private static final String PREF_USE_MAP_MODE = "use_map_mode"; //$NON-NLS-1$
	private static final String PREF_USE_RUNTIME_FIGURES = "use_runtime_figures"; //$NON-NLS-1$
	private static final String PREF_FIGURE_TEMPLATES = "dynamic_figure_templates"; //$NON-NLS-1$
	
	private static String[] PROP_NAMES = new String[] {
		PREF_GENERATE_RCP, 
		PREF_USE_MAP_MODE, 
		PREF_USE_RUNTIME_FIGURES,
		PREF_FIGURE_TEMPLATES
		};
	
	private Preferences myPreferences;
	
	public TransformOptions() {
		reset();
	}

	private Preferences getPreferences() {
		if (myPreferences == null) {
			myPreferences = new Preferences();
		}
		return myPreferences;
	}
	
	public void reset() {
		Preferences pluginPrefs = Plugin.getDefault().getPluginPreferences();
		copyPreferences(pluginPrefs, getPreferences());
	}
	
	public void flush() {
		Preferences pluginPrefs = Plugin.getDefault().getPluginPreferences();
		copyPreferences(getPreferences(), pluginPrefs);
		Plugin.getDefault().savePluginPreferences();
	}
	
	private void copyPreferences(Preferences source, Preferences target) {
		for (String name : PROP_NAMES) {
			if (source.contains(name)) {
				target.setValue(name, source.getString(name));
			}
		}
	}
	
	public boolean getGenerateRCP() {
		return getPreferences().getBoolean(PREF_GENERATE_RCP);
	}

	public boolean getUseMapMode() {
		return getPreferences().getBoolean(PREF_USE_MAP_MODE);
	}

	public boolean getUseRuntimeFigures() {
		return getPreferences().getBoolean(PREF_USE_RUNTIME_FIGURES);
	}

	public URL getFigureTemplatesPath() {
		final String value = getPreferences().getString(PREF_FIGURE_TEMPLATES);
		if (value == null || value.length() == 0) {
			return null;
		}
		try {
			return new URL(value);
		} catch (MalformedURLException ex) {
			Plugin.log(ex);
		}
		return null;
	}

	public void setGenerateRCP(boolean value) {
		getPreferences().setValue(PREF_GENERATE_RCP, value);
	}

	public void setUseMapMode(boolean value) {
		getPreferences().setValue(PREF_USE_MAP_MODE, value);
	}

	public void setUseRuntimeFigures(boolean value) {
		getPreferences().setValue(PREF_USE_RUNTIME_FIGURES, value);
	}

	public void setFigureTemplatesPath(URL path) {
		getPreferences().setValue(PREF_FIGURE_TEMPLATES, path == null ? "" : path.toString()); //$NON-NLS-1$
	}

	@Override
	public void initializeDefaultPreferences() {
		DefaultScope scope = new DefaultScope();
		IEclipsePreferences node = scope.getNode(Plugin.getPluginID());
		node.putBoolean(PREF_GENERATE_RCP, false);
		node.putBoolean(PREF_USE_MAP_MODE, true);
		node.putBoolean(PREF_USE_RUNTIME_FIGURES, true);

	}
	
	static boolean checkLiteOptionPresent() {
		return Platform.getBundle("org.eclipse.gmf.codegen.lite") != null; //$NON-NLS-1$
	}
}