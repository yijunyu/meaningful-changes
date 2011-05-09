package org.eclipse.gmf.graphdef.editor.part;

import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.wizards.EditorCreationWizard;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

/**
 * @generated
 */
public class GMFGraphCreationWizard extends EditorCreationWizard {

	/**
	 * @generated
	 */
	public void addPages() {
		super.addPages();
		if (page == null) {
			page = new GMFGraphCreationWizardPage(getWorkbench(), getSelection());
		}
		addPage(page);
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		setWindowTitle("New GMFGraph Diagram"); //$NON-NLS-1$
		setDefaultPageImageDescriptor(org.eclipse.gmf.graphdef.editor.part.GMFGraphDiagramEditorPlugin.getBundledImageDescriptor("icons/full/wizban/NewGMFGraph.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}
}
