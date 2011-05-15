package org.eclipse.gmf.internal.common.ui;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Composite;

/**
 * @author dstadnik
 */
public interface ModelSelectionPageExtension {

	public void createControl(Composite parent);

	public void setResource(Resource resource);
}