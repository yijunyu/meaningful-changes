/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2002, 2003.  All Rights Reserved.              |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.diagram.ui.actions.internal;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.FontDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;

import org.eclipse.gmf.runtime.diagram.ui.actions.internal.l10n.DiagramActionsResourceManager;
import org.eclipse.gmf.runtime.diagram.ui.actions.internal.l10n.Images;
import org.eclipse.gmf.runtime.diagram.ui.actions.internal.l10n.Messages;
import org.eclipse.gmf.runtime.diagram.ui.internal.requests.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.properties.Properties;
import org.eclipse.gmf.runtime.diagram.ui.requests.ChangePropertyValueRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;

/**
 * @author melaasar
 * @canBeSeenBy %level1
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class FontDialogAction extends PropertyChangeAction {

	/**
	 * @param workbenchPage
	 * @param propertyId
	 * @param propertyName
	 */
	public FontDialogAction(IWorkbenchPage workbenchPage) {
		super(workbenchPage, Properties.ID_FONTCOLOR, Messages.getString("PropertyDescriptorFactory.Font")); //$NON-NLS-1$
		setId(ActionIds.ACTION_FONT_DIALOG);
		setText(DiagramActionsResourceManager.getInstance().getString("FontAction.text")); //$NON-NLS-1$
		setToolTipText(DiagramActionsResourceManager.getInstance().getString("FontAction.tooltip")); //$NON-NLS-1$
		setImageDescriptor(Images.DESC_ACTION_FONT_COLOR); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.actions.internal.PropertyChangeAction#getNewPropertyValue()
	 */
	protected Object getNewPropertyValue() {
		return null;
	}

	/**
	 * @see org.eclipse.gmf.runtime.common.ui.action.AbstractActionHandler#doRun(org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected void doRun(IProgressMonitor progressMonitor) {
		String name = (String) getOperationSetPropertyValue(Properties.ID_FONTNAME);
		Integer height = (Integer) getOperationSetPropertyValue(Properties.ID_FONTSIZE);
		Boolean bold = (Boolean) getOperationSetPropertyValue(Properties.ID_FONTBOLD);
		Boolean italic = (Boolean) getOperationSetPropertyValue(Properties.ID_FONTITALIC);
		int style = (bold.booleanValue()? SWT.BOLD : SWT.NORMAL) | (italic.booleanValue()? SWT.ITALIC : SWT.NORMAL);
		FontData initFontData = new FontData(name, height.intValue(), style);

		Integer color = (Integer) getOperationSetPropertyValue(Properties.ID_FONTCOLOR);
		RGB initFontColor = FigureUtilities.integerToRGB(color);
		
		Shell shell = getDiagramGraphicalViewer().getControl().getShell();
		FontDialog fontDialog = new FontDialog(shell);
		fontDialog.setFontList(new FontData[] {initFontData});
		fontDialog.setRGB(initFontColor);
		FontData fData = fontDialog.open();
		RGB fColor = fontDialog.getRGB();

		if (fData != null && fColor != null) {
			CompoundCommand cc = new CompoundCommand(Messages.getString("PropertyDescriptorFactory.Font")); //$NON-NLS-1$
			cc.add(getCommand(new ChangePropertyValueRequest(Properties.ID_FONTNAME, Properties.ID_FONTNAME, fData.getName())));
			cc.add(getCommand(new ChangePropertyValueRequest(Properties.ID_FONTSIZE, Properties.ID_FONTSIZE, new Integer(fData.getHeight()))));
			cc.add(getCommand(new ChangePropertyValueRequest(Properties.ID_FONTBOLD, Properties.ID_FONTBOLD, new Boolean((fData.getStyle() & SWT.BOLD) != 0))));
			cc.add(getCommand(new ChangePropertyValueRequest(Properties.ID_FONTITALIC, Properties.ID_FONTITALIC, new Boolean((fData.getStyle() & SWT.ITALIC) != 0))));
			cc.add(getCommand(new ChangePropertyValueRequest(Properties.ID_FONTCOLOR, Properties.ID_FONTCOLOR, FigureUtilities.RGBToInteger(fColor))));
			execute(cc, progressMonitor);
		}
	}

}