/*
 * Copyright (c) 2006, 2007 Borland Software Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

import org.eclipse.gmf.graphdef.editor.edit.parts.CompartmentNameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.ConnectionNameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureGalleryNameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.NodeNameEditPart;

import org.eclipse.gmf.graphdef.editor.part.GMFGraphVisualIDRegistry;

/**
 * @generated
 */
public class GMFGraphParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser compartmentCompartmentName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getCompartmentCompartmentName_5001Parser() {
		if (compartmentCompartmentName_5001Parser == null) {
			compartmentCompartmentName_5001Parser = createCompartmentCompartmentName_5001Parser();
		}
		return compartmentCompartmentName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCompartmentCompartmentName_5001Parser() {
		GMFGraphStructuralFeatureParser parser = new GMFGraphStructuralFeatureParser(GMFGraphPackage.eINSTANCE.getIdentity_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeNodeName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getNodeNodeName_5002Parser() {
		if (nodeNodeName_5002Parser == null) {
			nodeNodeName_5002Parser = createNodeNodeName_5002Parser();
		}
		return nodeNodeName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createNodeNodeName_5002Parser() {
		GMFGraphStructuralFeatureParser parser = new GMFGraphStructuralFeatureParser(GMFGraphPackage.eINSTANCE.getIdentity_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionConnectionName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionConnectionName_5003Parser() {
		if (connectionConnectionName_5003Parser == null) {
			connectionConnectionName_5003Parser = createConnectionConnectionName_5003Parser();
		}
		return connectionConnectionName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createConnectionConnectionName_5003Parser() {
		GMFGraphStructuralFeatureParser parser = new GMFGraphStructuralFeatureParser(GMFGraphPackage.eINSTANCE.getIdentity_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser figureGalleryFigureGalleryName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getFigureGalleryFigureGalleryName_5004Parser() {
		if (figureGalleryFigureGalleryName_5004Parser == null) {
			figureGalleryFigureGalleryName_5004Parser = createFigureGalleryFigureGalleryName_5004Parser();
		}
		return figureGalleryFigureGalleryName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFigureGalleryFigureGalleryName_5004Parser() {
		GMFGraphStructuralFeatureParser parser = new GMFGraphStructuralFeatureParser(GMFGraphPackage.eINSTANCE.getIdentity_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CompartmentNameEditPart.VISUAL_ID:
			return getCompartmentCompartmentName_5001Parser();
		case NodeNameEditPart.VISUAL_ID:
			return getNodeNodeName_5002Parser();
		case ConnectionNameEditPart.VISUAL_ID:
			return getConnectionConnectionName_5003Parser();
		case FigureGalleryNameEditPart.VISUAL_ID:
			return getFigureGalleryFigureGalleryName_5004Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(GMFGraphVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GMFGraphVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GMFGraphElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}
}
