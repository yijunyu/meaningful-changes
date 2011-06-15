/**
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FontFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.accessibility.AccessibleAdapter;
import org.eclipse.swt.accessibility.AccessibleEvent;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;


public class ColorsAndFontsPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
	@Override
	protected void createFieldEditors() {
		FontFieldEditor defaultFont = new FontFieldEditor(IPreferenceConstants.DEFAULT_FONT, "Default font", getFieldEditorParent());
		addField(defaultFont);

		ColorFieldEditor defaultFontColor = new ColorFieldEditor(IPreferenceConstants.FONT_COLOR, "Default font color", getFieldEditorParent());
		addField(defaultFontColor);
		makeAccessible(defaultFontColor);

		ColorFieldEditor defaultFillColor = new ColorFieldEditor(IPreferenceConstants.FILL_COLOR, "Default fill color", getFieldEditorParent());
		addField(defaultFillColor);
		makeAccessible(defaultFillColor);

		ColorFieldEditor defaultLineColor = new ColorFieldEditor(IPreferenceConstants.LINE_COLOR, "Default line color", getFieldEditorParent());
		addField(defaultLineColor);
		makeAccessible(defaultLineColor);
	}

	protected final void makeAccessible(ColorFieldEditor editor) {
		editor.getColorSelector().getButton().getAccessible().addAccessibleListener(new ColorAccessibleListener(editor));
	}

	public void init(IWorkbench workbench) {
	}

	protected static class ColorsAndFontsPreferenceInitializer extends AbstractPreferenceInitializer {
		private final IPreferenceStore myStore;

		public ColorsAndFontsPreferenceInitializer(IPreferenceStore store) {
			myStore = store;
		}

		@Override
		public void initializeDefaultPreferences() {
	        PreferenceConverter.setDefault(myStore, IPreferenceConstants.DEFAULT_FONT, getDefaultFontData());
	        PreferenceConverter.setDefault(myStore, IPreferenceConstants.FONT_COLOR, getDefaultFontColor());
	        PreferenceConverter.setDefault(myStore, IPreferenceConstants.FILL_COLOR, getDefaultFillColor());
	        PreferenceConverter.setDefault(myStore, IPreferenceConstants.LINE_COLOR, getDefaultLineColor());
		}

		protected FontData getDefaultFontData() {
			FontData fontDataArray[] = JFaceResources.getDefaultFont().getFontData();
	        FontData fontData = fontDataArray[0];
	        fontData.setHeight(9);
			return fontData;
		}

		protected RGB getDefaultFontColor() {
			return new RGB(0, 0, 0);
		}

		protected RGB getDefaultFillColor() {
			return new RGB(255, 255, 255);
		}

		protected RGB getDefaultLineColor() {
			return new RGB(0, 0, 0);
		}
	}

	private static class ColorAccessibleListener extends AccessibleAdapter {
		private final ColorFieldEditor myEditor;
		public ColorAccessibleListener(ColorFieldEditor editor) {
			myEditor = editor;
		}
		@Override
		public void getName(AccessibleEvent e) {
			e.result = Action.removeMnemonics(myEditor.getLabelText());
		}
	}
}
