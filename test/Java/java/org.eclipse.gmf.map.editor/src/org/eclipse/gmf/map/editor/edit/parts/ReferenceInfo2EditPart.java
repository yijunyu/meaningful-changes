/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.map.editor.edit.parts;

import java.util.ArrayList;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.LabelDirectEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.transaction.RunnableWithResult;

import org.eclipse.gef.AccessibleEditPart;
import org.eclipse.gef.Request;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.NonResizableHandleKit;
import org.eclipse.gef.requests.DirectEditRequest;

import org.eclipse.gef.tools.DirectEditManager;

import org.eclipse.gmf.map.editor.edit.policies.GMFMapTextSelectionEditPolicy;

import org.eclipse.gmf.map.editor.part.GMFMapDiagramEditorPlugin;

import org.eclipse.gmf.map.editor.providers.GMFMapElementTypes;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;

import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;

import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;

import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;

import org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager;

import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;

import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;

import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

import org.eclipse.jface.resource.ImageDescriptor;

import org.eclipse.jface.text.contentassist.IContentAssistProcessor;

import org.eclipse.jface.viewers.ICellEditorValidator;

import org.eclipse.swt.SWT;

import org.eclipse.swt.accessibility.AccessibleEvent;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class ReferenceInfo2EditPart extends CompartmentEditPart implements ITextAwareEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 5006;

	/**
	 * @generated
	 */
	private DirectEditManager manager;

	/**
	 * @generated
	 */
	private IParser parser;

	/**
	 * @generated
	 */
	private List parserElements;

	/**
	 * @generated
	 */
	private String defaultText;

	/**
	 * @generated
	 */
	public ReferenceInfo2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new LabelDirectEditPolicy());
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new NonResizableEditPolicy() {

			protected List createSelectionHandles() {
				List handles = new ArrayList();
				NonResizableHandleKit.addMoveHandle((GraphicalEditPart) getHost(), handles);
				return handles;
			}

			public Command getCommand(Request request) {
				return null;
			}

			public boolean understandsRequest(Request request) {
				return false;
			}
		});

	}

	/**
	 * @generated
	 */
	protected String getLabelTextHelper(IFigure figure) {
		if (figure instanceof WrapLabel) {
			return ((WrapLabel) figure).getText();
		} else {
			return ((Label) figure).getText();
		}
	}

	/**
	 * @generated
	 */
	protected void setLabelTextHelper(IFigure figure, String text) {
		if (figure instanceof WrapLabel) {
			((WrapLabel) figure).setText(text);
		} else {
			((Label) figure).setText(text);
		}
	}

	/**
	 * @generated
	 */
	protected Image getLabelIconHelper(IFigure figure) {
		if (figure instanceof WrapLabel) {
			return ((WrapLabel) figure).getIcon();
		} else {
			return ((Label) figure).getIcon();
		}
	}

	/**
	 * @generated
	 */
	protected void setLabelIconHelper(IFigure figure, Image icon) {
		if (figure instanceof WrapLabel) {
			((WrapLabel) figure).setIcon(icon);
		} else {
			((Label) figure).setIcon(icon);
		}
	}

	/**
	 * @generated
	 */
	public void setLabel(WrapLabel figure) {
		unregisterVisuals();
		setFigure(figure);
		defaultText = getLabelTextHelper(figure);
		registerVisuals();
		refreshVisuals();
	}

	/**
	 * @generated
	 */
	protected List getModelChildren() {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public IGraphicalEditPart getChildBySemanticHint(String semanticHint) {
		return null;
	}

	/**
	 * @generated
	 */
	protected EObject getParserElement() {
		EObject element = resolveSemanticElement();
		return element != null ? element : (View) getModel();
	}

	/**
	 * @generated
	 */
	protected Image getLabelIcon() {
		ImageDescriptor descriptor = GMFMapDiagramEditorPlugin.getInstance().getItemImageDescriptor(getParserElement());
		if (descriptor == null) {
			descriptor = ImageDescriptor.getMissingImageDescriptor();
		}
		return descriptor.createImage();
	}

	/**
	 * @generated
	 */
	protected String getLabelText() {
		String text = null;
		if (getParser() != null) {
			text = getParser().getPrintString(new EObjectAdapter(getParserElement()), getParserOptions().intValue());
		}
		if (text == null || text.length() == 0) {
			text = defaultText;
		}
		return text;
	}

	/**
	 * @generated
	 */
	public void setLabelText(String text) {
		setLabelTextHelper(getFigure(), text);
		Object pdEditPolicy = getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
		if (pdEditPolicy instanceof GMFMapTextSelectionEditPolicy) {
			((GMFMapTextSelectionEditPolicy) pdEditPolicy).refreshFeedback();
		}
	}

	/**
	 * @generated
	 */
	public String getEditText() {
		if (getParser() == null) {
			return ""; //$NON-NLS-1$
		}
		return getParser().getEditString(new EObjectAdapter(getParserElement()), getParserOptions().intValue());
	}

	/**
	 * @generated
	 */
	protected boolean isEditable() {
		return false;
	}

	/**
	 * @generated
	 */
	public ICellEditorValidator getEditTextValidator() {
		return new ICellEditorValidator() {

			public String isValid(final Object value) {
				if (value instanceof String) {
					final EObject element = getParserElement();
					final IParser parser = getParser();
					try {
						IParserEditStatus valid = (IParserEditStatus) getEditingDomain().runExclusive(new RunnableWithResult.Impl() {

							public void run() {
								setResult(parser.isValidEditString(new EObjectAdapter(element), (String) value));
							}
						});
						return valid.getCode() == ParserEditStatus.EDITABLE ? null : valid.getMessage();
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}

				// shouldn't get here
				return null;
			}
		};
	}

	/**
	 * @generated
	 */
	public IContentAssistProcessor getCompletionProcessor() {
		if (getParser() == null) {
			return null;
		}
		return getParser().getCompletionProcessor(new EObjectAdapter(getParserElement()));
	}

	/**
	 * @generated
	 */
	public ParserOptions getParserOptions() {
		return ParserOptions.NONE;
	}

	/**
	 * @generated
	 */
	public IParser getParser() {
		if (parser == null) {
			String parserHint = ((View) getModel()).getType();
			ParserHintAdapter hintAdapter = new ParserHintAdapter(getParserElement(), parserHint) {

				public Object getAdapter(Class adapter) {
					if (IElementType.class.equals(adapter)) {
						return GMFMapElementTypes.ChildReference_3004;
					}
					return super.getAdapter(adapter);
				}
			};
			parser = ParserService.getInstance().getParser(hintAdapter);
		}
		return parser;
	}

	/**
	 * @generated
	 */
	protected DirectEditManager getManager() {
		if (manager == null) {
			setManager(new TextDirectEditManager(this, TextDirectEditManager.getTextCellEditorClass(this), GMFMapEditPartFactory.getTextCellEditorLocator(this)));
		}
		return manager;
	}

	/**
	 * @generated
	 */
	protected void setManager(DirectEditManager manager) {
		this.manager = manager;
	}

	/**
	 * @generated
	 */
	protected void performDirectEdit() {
		getManager().show();
	}

	/**
	 * @generated
	 */
	protected void performDirectEdit(Point eventLocation) {
		if (getManager().getClass() == TextDirectEditManager.class) {
			((TextDirectEditManager) getManager()).show(eventLocation.getSWTPoint());
		}
	}

	/**
	 * @generated
	 */
	private void performDirectEdit(char initialCharacter) {
		if (getManager() instanceof TextDirectEditManager) {
			((TextDirectEditManager) getManager()).show(initialCharacter);
		} else {
			performDirectEdit();
		}
	}

	/**
	 * @generated
	 */
	protected void performDirectEditRequest(Request request) {
		final Request theRequest = request;
		try {
			getEditingDomain().runExclusive(new Runnable() {

				public void run() {
					if (isActive() && isEditable()) {
						if (theRequest.getExtendedData().get(RequestConstants.REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR) instanceof Character) {
							Character initialChar = (Character) theRequest.getExtendedData().get(RequestConstants.REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR);
							performDirectEdit(initialChar.charValue());
						} else if ((theRequest instanceof DirectEditRequest) && (getEditText().equals(getLabelText()))) {
							DirectEditRequest editRequest = (DirectEditRequest) theRequest;
							performDirectEdit(editRequest.getLocation());
						} else {
							performDirectEdit();
						}
					}
				}
			});
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @generated
	 */
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshLabel();
		refreshFont();
		refreshFontColor();
		refreshUnderline();
		refreshStrikeThrough();
	}

	/**
	 * @generated
	 */
	protected void refreshLabel() {
		setLabelTextHelper(getFigure(), getLabelText());
		setLabelIconHelper(getFigure(), getLabelIcon());
		Object pdEditPolicy = getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
		if (pdEditPolicy instanceof GMFMapTextSelectionEditPolicy) {
			((GMFMapTextSelectionEditPolicy) pdEditPolicy).refreshFeedback();
		}
	}

	/**
	 * @generated
	 */
	protected void refreshUnderline() {
		FontStyle style = (FontStyle) getFontStyleOwnerView().getStyle(NotationPackage.eINSTANCE.getFontStyle());
		if (style != null && getFigure() instanceof WrapLabel) {
			((WrapLabel) getFigure()).setTextUnderline(style.isUnderline());
		}
	}

	/**
	 * @generated
	 */
	protected void refreshStrikeThrough() {
		FontStyle style = (FontStyle) getFontStyleOwnerView().getStyle(NotationPackage.eINSTANCE.getFontStyle());
		if (style != null && getFigure() instanceof WrapLabel) {
			((WrapLabel) getFigure()).setTextStrikeThrough(style.isStrikeThrough());
		}
	}

	/**
	 * @generated
	 */
	protected void refreshFont() {
		FontStyle style = (FontStyle) getFontStyleOwnerView().getStyle(NotationPackage.eINSTANCE.getFontStyle());
		if (style != null) {
			FontData fontData = new FontData(style.getFontName(), style.getFontHeight(), (style.isBold() ? SWT.BOLD : SWT.NORMAL) | (style.isItalic() ? SWT.ITALIC : SWT.NORMAL));
			setFont(fontData);
		}
	}

	/**
	 * @generated
	 */
	protected void setFontColor(Color color) {
		getFigure().setForegroundColor(color);
	}

	/**
	 * @generated
	 */
	protected void addSemanticListeners() {
		if (getParser() instanceof ISemanticParser) {
			EObject element = resolveSemanticElement();
			parserElements = ((ISemanticParser) getParser()).getSemanticElementsBeingParsed(element);
			for (int i = 0; i < parserElements.size(); i++) {
				addListenerFilter("SemanticModel" + i, this, (EObject) parserElements.get(i)); //$NON-NLS-1$
			}
		} else {
			super.addSemanticListeners();
		}
	}

	/**
	 * @generated
	 */
	protected void removeSemanticListeners() {
		if (parserElements != null) {
			for (int i = 0; i < parserElements.size(); i++) {
				removeListenerFilter("SemanticModel" + i); //$NON-NLS-1$
			}
		} else {
			super.removeSemanticListeners();
		}
	}

	/**
	 * @generated
	 */
	protected AccessibleEditPart getAccessibleEditPart() {
		if (accessibleEP == null) {
			accessibleEP = new AccessibleGraphicalEditPart() {

				public void getName(AccessibleEvent e) {
					e.result = getLabelTextHelper(getFigure());
				}
			};
		}
		return accessibleEP;
	}

	/**
	 * @generated
	 */
	private View getFontStyleOwnerView() {
		return getPrimaryView();
	}

	/**
	 * @generated
	 */
	protected void addNotationalListeners() {
		super.addNotationalListeners();
		addListenerFilter("PrimaryView", this, getPrimaryView()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	protected void removeNotationalListeners() {
		super.removeNotationalListeners();
		removeListenerFilter("PrimaryView"); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		Object feature = event.getFeature();
		if (NotationPackage.eINSTANCE.getFontStyle_FontColor().equals(feature)) {
			Integer c = (Integer) event.getNewValue();
			setFontColor(DiagramColorRegistry.getInstance().getColor(c));
		} else if (NotationPackage.eINSTANCE.getFontStyle_Underline().equals(feature)) {
			refreshUnderline();
		} else if (NotationPackage.eINSTANCE.getFontStyle_StrikeThrough().equals(feature)) {
			refreshStrikeThrough();
		} else if (NotationPackage.eINSTANCE.getFontStyle_FontHeight().equals(feature) || NotationPackage.eINSTANCE.getFontStyle_FontName().equals(feature)
				|| NotationPackage.eINSTANCE.getFontStyle_Bold().equals(feature) || NotationPackage.eINSTANCE.getFontStyle_Italic().equals(feature)) {
			refreshFont();
		} else {
			if (getParser() != null && getParser().isAffectingEvent(event, getParserOptions().intValue())) {
				refreshLabel();
			}
			if (getParser() instanceof ISemanticParser) {
				ISemanticParser modelParser = (ISemanticParser) getParser();
				if (modelParser.areSemanticElementsAffected(null, event)) {
					removeSemanticListeners();
					if (resolveSemanticElement() != null) {
						addSemanticListeners();
					}
					refreshLabel();
				}
			}
		}
		super.handleNotificationEvent(event);
	}

	/**
	 * @generated
	 */
	protected IFigure createFigure() {
		// Parent should assign one using setLabel method
		return null;
	}
}