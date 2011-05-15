/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2004. All Rights Reserved.                     |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.notation.providers.internal.copypaste;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.emf.clipboard.core.ClipboardSupportUtil;
import org.eclipse.gmf.runtime.emf.clipboard.core.ObjectInfo;
import org.eclipse.gmf.runtime.emf.clipboard.core.OverridePasteChildOperation;
import org.eclipse.gmf.runtime.emf.clipboard.core.PasteChildOperation;
import org.eclipse.gmf.runtime.emf.clipboard.core.PostPasteChildOperation;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @author Yasser Lulu 
 */
public class ConnectorViewPasteOperation
	extends OverridePasteChildOperation {

	private boolean pasteSemanticElement;

	private Edge connectorView;

	private View sourceView;

	private View targetView;

	/**
	 * @param overriddenChildPasteOperation
	 */
	public ConnectorViewPasteOperation(
		PasteChildOperation overriddenChildPasteOperation) {
		super(overriddenChildPasteOperation);
	}

	/**
	 * @see com.ibm.xtools.bml.emf.internal.copypaste.PasteChildOperation#paste()
	 */
	public void paste() throws Exception {
		//basically delay...
		connectorView = (Edge) getEObject();
		sourceView = connectorView.getSource();
		targetView = connectorView.getTarget();
		EObject element = connectorView.getElement();
		if (element != null) {
			if (element.eIsProxy()) {
				element = ClipboardSupportUtil.resolve(element,
					getParentPasteProcess().getLoadedIDToEObjectMapCopy());
			}
			if (element.eIsProxy() == false) {
				pasteSemanticElement = true;
			}
		}
	}

	protected boolean shouldPasteAlwaysCopyObject(
		ObjectInfo alwaysCopyObjectInfo) {
		return false;
	}

	protected PasteChildOperation makeAuxiliaryChildPasteProcess(
		ObjectInfo auxiliaryChildEObjectInfo) {
		return null;
	}

	/**
	 * @see com.ibm.xtools.bml.emf.internal.copypaste.PasteChildOperation#getPostPasteOperation()
	 */
	public PasteChildOperation getPostPasteOperation() {
		return new PostPasteChildOperation(this, EMPTY_ARRAY) {

			public void paste() throws Exception {
				//delay
			}

			public PasteChildOperation getPostPasteOperation() {
				return new PostPasteChildOperation(this, EMPTY_ARRAY) {

					public void paste() throws Exception {
						//delay
					}

					public PasteChildOperation getPostPasteOperation() {
						return new ConnectorViewPostPasteChildOperation(
							ConnectorViewPasteOperation.this,
							ConnectorViewPasteOperation.this.pasteSemanticElement);
					}
				};
			}
		};
	}

	protected ObjectInfo getChildObjectInfo() {
		return super.getChildObjectInfo();
	}

	protected List getAlwaysCopyObjectPasteOperations() {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @return Returns the sourceView.
	 */
	protected View getSourceView() {
		return sourceView;
	}

	/**
	 * @return Returns the targetView.
	 */
	protected View getTargetView() {
		return targetView;
	}

	/**
	 * @return Returns the connectorView.
	 */
	protected Edge getConnectorView() {
		return connectorView;
	}
}