/******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.diagram.ui.view.factories; 

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.internal.services.view.ViewService;
import org.eclipse.gmf.runtime.diagram.core.internal.util.MEditingDomainGetter;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.core.view.factories.DiagramFactory;
import org.eclipse.gmf.runtime.diagram.ui.IPreferenceConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;

/**
 * This is the bas factory class for all Diagram views, it will 
 * create the <code>Diagram</code> and decorate it using the default
 * decorations you can subclass it to add more decorations, or customize the 
 * way it looks, like adding new style
 * @see #createDiagram(IAdaptable, String, PreferencesHint)
 * @see #decorateView(View, IAdaptable, String)
 * @see #createStyles()
 * @author mmostafa
 * 
 */
public class DiagramViewFactory implements DiagramFactory{

	/**
	 * The hint used to find the appropriate preference store from which general
	 * diagramming preference values for properties of shapes, connectors, and
	 * diagrams can be retrieved. This hint is mapped to a preference store in
	 * the {@link DiagramPreferencesRegistry}.
	 */
	private PreferencesHint preferencesHint;

    /**
	 * factory method, that will be called by the view service to creat the
	 * <code>Diagram</code>
	 * 
	 * @param semanticAdapter
	 *            semanitc element of the diagram, it can be null
	 * @param diagramKind
	 *            a semantic hint to reflect the diagram type, it can be empty
	 * @param thePreferencesHint
	 *            The preference hint that is to be used to find the appropriate
	 *            preference store from which to retrieve diagram preference
	 *            values. The preference hint is mapped to a preference store in
	 *            the preference registry <@link DiagramPreferencesRegistry>.
	 */
	public Diagram createDiagram(IAdaptable semanticAdapter,
						 String diagramKind, PreferencesHint thePreferencesHint) {

		setPreferencesHint(thePreferencesHint);

		Diagram diagram = (Diagram)MEditingDomainGetter.getMEditingDomain(semanticAdapter).create(NotationPackage.eINSTANCE.getDiagram());
		diagram.getStyles().addAll(createStyles(diagram));

		if (diagramKind != null)
			diagram.setType(diagramKind);
		if (semanticAdapter != null)
			diagram.setElement((EObject)semanticAdapter.getAdapter(EObject.class));
		else
			// enforce a set to NULL
			diagram.setElement(null);

		// do the necessary initializations (creating children, setting properties...etc)
		decorateView(diagram,semanticAdapter, diagramKind);
		
		return diagram;
	}

	/**
	 * This method is responsible for decorating the created view, it get called
	 * by the Factory method @link #createView(IAdaptable, View, String, int, boolean),
	 * it will intiliaze the view with the default preferences also it will create 
	 * the default elements of the <code>View</code> if it had any
	 * @param view the view itself
	 * @param semanticAdapter the semantic elemnent of the view (it could be null)
	 * @param diagramKind the semantic hint of the diagram
	 */
	protected void decorateView(View view, IAdaptable semanticAdapter, String diagramKind){
		initializeFromPreferences(view);
	}

	/**
	 * this method is called by @link #createView(IAdaptable, View, String, int, boolean) to 
	 * create the styles for the view that will be created, you can override this 
	 * method in you factory sub class to provide additional styles
	 * @return a list of style for the newly created view or an empty list if none (do not return null)
	 */
	protected List createStyles(View view) {
		List styles = new ArrayList();
		styles.add(NotationFactory.eINSTANCE.createDiagramStyle());
		return styles;
	}
	
	/**
	 * Initialize the newly created view from the preference store, this
	 * method get called by @link #decorateView(View, IAdaptable, String)
	 * @param view the view to initialize
	 */
	protected void initializeFromPreferences(View view) {
		
		IPreferenceStore store = (IPreferenceStore) getPreferencesHint().getPreferenceStore();

		// line color
		RGB lineRGB =
			PreferenceConverter.getColor(
				store,
				IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(view,NotationPackage.eINSTANCE.getLineStyle_LineColor(), FigureUtilities.RGBToInteger(lineRGB));

		//default font
		FontData fontData =
			PreferenceConverter.getFontData(
				store,
				IPreferenceConstants.PREF_DEFAULT_FONT);
		
		ViewUtil.setStructuralFeatureValue(view,NotationPackage.eINSTANCE.getFontStyle_FontName(), fontData.getName());
		ViewUtil.setStructuralFeatureValue(view,NotationPackage.eINSTANCE.getFontStyle_FontHeight(), new Integer(fontData.getHeight()));
		ViewUtil.setStructuralFeatureValue(view,NotationPackage.eINSTANCE.getFontStyle_Bold(), Boolean.valueOf((fontData.getStyle() & SWT.BOLD) != 0));
		ViewUtil.setStructuralFeatureValue(view,NotationPackage.eINSTANCE.getFontStyle_Italic(), Boolean.valueOf((fontData.getStyle() & SWT.ITALIC) != 0));

		//font color
		RGB fontRGB =
			PreferenceConverter.getColor(
				store,
				IPreferenceConstants.PREF_FONT_COLOR);
		ViewUtil.setStructuralFeatureValue(view,NotationPackage.eINSTANCE.getFontStyle_FontColor(), FigureUtilities.RGBToInteger(fontRGB));
	}
	
			
	/**
	 * a utility method to return the view service instance
	 * @return ViewService
	 */
	protected static ViewService getViewService() {
		return ViewService.getInstance();
	}
	
	/**
	 * Gets the preferences hint that is to be used to find the appropriate
	 * preference store from which to retrieve diagram preference values. The
	 * preference hint is mapped to a preference store in the preference
	 * registry <@link DiagramPreferencesRegistry>.
	 * 
	 * @return the preferences hint
	 */
	protected PreferencesHint getPreferencesHint() {
		return preferencesHint;
	}
	
	/**
	 * Sets the preferences hint that is to be used to find the appropriate
	 * preference store from which to retrieve diagram preference values. The
	 * preference hint is mapped to a preference store in the preference
	 * registry <@link DiagramPreferencesRegistry>.
	 * 
	 * @param preferencesHint the preferences hint
	 */
	protected void setPreferencesHint(PreferencesHint preferencesHint) {
		this.preferencesHint = preferencesHint;
	}
}