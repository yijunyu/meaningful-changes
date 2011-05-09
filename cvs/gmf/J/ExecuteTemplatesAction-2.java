/*
 * Copyright (c) 2005 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.codegen.popup.actions;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.util.Generator;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;


/**
 * Runs generation of diagram editor project
 * @author artem
 */
public class ExecuteTemplatesAction implements IObjectActionDelegate, IRunnableWithProgress {
	private IFile mySelection;
	private IWorkbenchPart myPart;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		myPart = targetPart;
	}

	public void run(IAction action) {
		try {
			new ProgressMonitorDialog(myPart.getSite().getShell()).run(true, true, this);
		} catch (InvocationTargetException ex) {
			
		} catch (InterruptedException ex) {
		}
	}

	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		URI selected = URI.createPlatformResourceURI(mySelection.getFullPath().toString());
		ResourceSet srcResSet = new ResourceSetImpl();
		Resource srcRes = srcResSet.getResource(selected, true);
		GenDiagram gd = (GenDiagram) srcRes.getContents().get(0);
		Generator g = new Generator(gd);
		g.run(monitor);
	}

	public void selectionChanged(IAction action, ISelection selection) {
		mySelection = null;
		action.setEnabled(false);
		if (selection instanceof IStructuredSelection == false) {
			return;
		}
		mySelection = (IFile) ((IStructuredSelection) selection).getFirstElement();
		action.setEnabled(true);
	}

}
