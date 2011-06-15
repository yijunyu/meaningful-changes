/*
 * Copyright (c) 2008 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.xpand.ant;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.eclipse.core.runtime.IProgressMonitor;

public class InvokeFewTemplatesTask extends Task {
	private final LinkedList<InvokeTemplateTask> myTemplates = new LinkedList<InvokeTemplateTask>();
	private String[] myTemplateRoots;

	public void setTemplateRoot(String root) {
		ArrayList<String> roots = new ArrayList<String>();
		for (StringTokenizer st = new StringTokenizer(root, ";, "); st.hasMoreTokens(); ) {
			roots.add(st.nextToken().trim());
		}
		myTemplateRoots = roots.toArray(new String[roots.size()]);
	}

	public InvokeTemplateTask createTemplate() {
		InvokeTemplateTask tt = new InvokeTemplateTask();
		myTemplates.add(tt);
		return tt;
		
	}

	@Override
	public void execute() throws BuildException {
		IProgressMonitor pm = new ProgressSupport(this);
		pm.beginTask(getTaskName(), 3 * myTemplates.size());
		XpandFacade xf = createFacade();
		for (InvokeTemplateTask tt : myTemplates) {
			tt.setFacade(xf);
			tt.validate();
			pm.worked(1);
		}
		for (InvokeTemplateTask tt : myTemplates) {
			tt.doExecute();
			pm.worked(2);
		}
	}

	protected XpandFacade createFacade() throws BuildException {
		try {
			XpandFacade xf = new XpandFacade();
			for (String r : myTemplateRoots) {
				xf.addLocation(r);
			}
			return xf;
		} catch (MalformedURLException ex) {
			throw new BuildException(ex, getLocation());
		}
	}
}
