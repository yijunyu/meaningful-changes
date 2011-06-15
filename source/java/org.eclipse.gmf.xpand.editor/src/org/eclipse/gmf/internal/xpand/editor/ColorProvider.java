/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.gmf.internal.xpand.editor;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

/**
 * Manager for colors used in the Template editor
 */
public class ColorProvider {
	private static final String HIGHLIGHT_KEYWORDS = "hl_keywords";

	private static final String HIGHLIGHT_TERMINALS = "hl_terminals";

	private static final String HIGHLIGHT_DEFINE = "hl_define";

	private static final String HIGHLIGHT_STRING = "hl_string";

	private static final String HIGHLIGHT_TEXT = "hl_text";

	private static final String HIGHLIGHT_COMMENT = "hl_comment";

	private static final String HIGHLIGHT_OTHER = "hl_other";

	
	private final Map<RGB, Color> ivColorTable = new HashMap<RGB, Color>();

	private final IPreferenceStore preferenceStore;

	public ColorProvider(IPreferenceStore preferenceStore) {
		assert preferenceStore != null;
		this.preferenceStore = preferenceStore;
	}

	public void initializeDefaults() {
		initializeDefaultValues(preferenceStore);
	}

	/**
	 * Release all of the color resources held onto by the receiver.
	 */
	public void dispose() {
		for (Color c : ivColorTable.values()) {
			c.dispose();
		}
	}

	/**
	 * Return the Color that is stored in the Color table as rgb. Create new
	 * entry, if none can be found.
	 * 
	 * @param rgb
	 *            RGB color to lookup from HashMap
	 */
	protected Color getColor(final RGB aRgb) {
        Color color = ivColorTable.get(aRgb);
        if (color == null) {
            color = createColor(aRgb);
            ivColorTable.put(aRgb, color);
        }
        return color;
    }

	protected Color createColor(final RGB aColor) {
		return new Color(Display.getCurrent(), aColor);
	}

	public Color getKeywordsColor() {
    	return getColor(PreferenceConverter.getColor(preferenceStore, HIGHLIGHT_KEYWORDS));
    }

	public Color getTerminalsColor() {
    	return getColor(PreferenceConverter.getColor(preferenceStore, HIGHLIGHT_TERMINALS));
    }

	public Color getDefineColor() {
    	return getColor(PreferenceConverter.getColor(preferenceStore, HIGHLIGHT_DEFINE));
    }

	public Color getStringColor() {
    	return getColor(PreferenceConverter.getColor(preferenceStore, HIGHLIGHT_STRING));
    }

	public Color getCommentColor() {
    	return getColor(PreferenceConverter.getColor(preferenceStore, HIGHLIGHT_COMMENT));
    }

	public Color getOtherColor() {
    	return getColor(PreferenceConverter.getColor(preferenceStore, HIGHLIGHT_OTHER));
    }

	public Color getTextColor() {
    	return getColor(PreferenceConverter.getColor(preferenceStore, HIGHLIGHT_TEXT));
    }

	public final static void initializeDefaultValues(final IPreferenceStore store) {
		PreferenceConverter.setDefault(store, HIGHLIGHT_KEYWORDS, new RGB(127, 0, 85));
		PreferenceConverter.setDefault(store, HIGHLIGHT_TERMINALS, new RGB(100, 100, 100));
		PreferenceConverter.setDefault(store, HIGHLIGHT_DEFINE, new RGB(127, 0, 85));
		PreferenceConverter.setDefault(store, HIGHLIGHT_STRING, new RGB(42, 0, 255));
		PreferenceConverter.setDefault(store, HIGHLIGHT_COMMENT, new RGB(63, 127, 95));
		PreferenceConverter.setDefault(store, HIGHLIGHT_OTHER, new RGB(0, 0, 0));
		PreferenceConverter.setDefault(store, HIGHLIGHT_TEXT, new RGB(42, 0, 255));
	}
}
