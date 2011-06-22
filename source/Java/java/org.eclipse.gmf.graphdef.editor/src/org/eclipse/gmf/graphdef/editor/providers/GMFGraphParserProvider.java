/*
 *  Copyright (c) 2006, 2007 Borland Software Corporation and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *      Borland Software Corporation - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.graphdef.editor.edit.parts.CompartmentNameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.ConnectionNameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.DiagramLabelNameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureDescriptorNameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.FigureGalleryNameEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.LabelText2EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.LabelText3EditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.LabelTextEditPart;
import org.eclipse.gmf.graphdef.editor.edit.parts.NodeNameEditPart;
import org.eclipse.gmf.graphdef.editor.parsers.CompositeParser;
import org.eclipse.gmf.graphdef.editor.parsers.MessageFormatParser;
import org.eclipse.gmf.graphdef.editor.parsers.RegexpParser;
import org.eclipse.gmf.graphdef.editor.part.GMFGraphVisualIDRegistry;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GMFGraphParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser compartmentName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getCompartmentName_5005Parser() {
		if (compartmentName_5005Parser == null) {
			compartmentName_5005Parser = createCompartmentName_5005Parser();
		}
		return compartmentName_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCompartmentName_5005Parser() {
		EAttribute[] features = new EAttribute[] { GMFGraphPackage.eINSTANCE.getIdentity_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5006Parser() {
		if (nodeName_5006Parser == null) {
			nodeName_5006Parser = createNodeName_5006Parser();
		}
		return nodeName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createNodeName_5006Parser() {
		EAttribute[] features = new EAttribute[] { GMFGraphPackage.eINSTANCE.getIdentity_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionName_5007Parser() {
		if (connectionName_5007Parser == null) {
			connectionName_5007Parser = createConnectionName_5007Parser();
		}
		return connectionName_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createConnectionName_5007Parser() {
		EAttribute[] features = new EAttribute[] { GMFGraphPackage.eINSTANCE.getIdentity_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser figureGalleryName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getFigureGalleryName_5009Parser() {
		if (figureGalleryName_5009Parser == null) {
			figureGalleryName_5009Parser = createFigureGalleryName_5009Parser();
		}
		return figureGalleryName_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFigureGalleryName_5009Parser() {
		EAttribute[] features = new EAttribute[] { GMFGraphPackage.eINSTANCE.getIdentity_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser diagramLabelName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getDiagramLabelName_5013Parser() {
		if (diagramLabelName_5013Parser == null) {
			diagramLabelName_5013Parser = createDiagramLabelName_5013Parser();
		}
		return diagramLabelName_5013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDiagramLabelName_5013Parser() {
		EAttribute[] features = new EAttribute[] { GMFGraphPackage.eINSTANCE.getIdentity_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser figureDescriptorName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getFigureDescriptorName_5008Parser() {
		if (figureDescriptorName_5008Parser == null) {
			figureDescriptorName_5008Parser = createFigureDescriptorName_5008Parser();
		}
		return figureDescriptorName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createFigureDescriptorName_5008Parser() {
		EAttribute[] features = new EAttribute[] { GMFGraphPackage.eINSTANCE.getIdentity_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser labelText_5010Parser;

	/**
	 * @generated
	 */
	private IParser getLabelText_5010Parser() {
		if (labelText_5010Parser == null) {
			labelText_5010Parser = createLabelText_5010Parser();
		}
		return labelText_5010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createLabelText_5010Parser() {
		EAttribute[] features = new EAttribute[] { GMFGraphPackage.eINSTANCE.getLabel_Text(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser labelText_5011Parser;

	/**
	 * @generated
	 */
	private IParser getLabelText_5011Parser() {
		if (labelText_5011Parser == null) {
			labelText_5011Parser = createLabelText_5011Parser();
		}
		return labelText_5011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createLabelText_5011Parser() {
		EAttribute[] features = new EAttribute[] { GMFGraphPackage.eINSTANCE.getLabel_Text(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser labelText_5012Parser;

	/**
	 * @generated
	 */
	private IParser getLabelText_5012Parser() {
		if (labelText_5012Parser == null) {
			labelText_5012Parser = createLabelText_5012Parser();
		}
		return labelText_5012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createLabelText_5012Parser() {
		EAttribute[] features = new EAttribute[] { GMFGraphPackage.eINSTANCE.getLabel_Text(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CompartmentNameEditPart.VISUAL_ID:
			return getCompartmentName_5005Parser();
		case NodeNameEditPart.VISUAL_ID:
			return getNodeName_5006Parser();
		case ConnectionNameEditPart.VISUAL_ID:
			return getConnectionName_5007Parser();
		case FigureGalleryNameEditPart.VISUAL_ID:
			return getFigureGalleryName_5009Parser();
		case DiagramLabelNameEditPart.VISUAL_ID:
			return getDiagramLabelName_5013Parser();
		case FigureDescriptorNameEditPart.VISUAL_ID:
			return getFigureDescriptorName_5008Parser();
		case LabelTextEditPart.VISUAL_ID:
			return getLabelText_5010Parser();
		case LabelText2EditPart.VISUAL_ID:
			return getLabelText_5011Parser();
		case LabelText3EditPart.VISUAL_ID:
			return getLabelText_5012Parser();
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

	/**
	 * @generated
	 */
	public static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
