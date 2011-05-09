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

import java.util.LinkedList;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.eclipse.core.runtime.IProgressMonitor;

public class InvokeFewTemplatesTask extends Task {
	private final LinkedList<InvokeTemplateTask> myTemplates = new LinkedList<InvokeTemplateTask>();

	public InvokeTemplateTask createTemplate() {
		InvokeTemplateTask tt = new InvokeTemplateTask(/*this*/);
		myTemplates.add(tt);
		return tt;
		
	}

	@Override
	public void execute() throws BuildException {
		IProgressMonitor pm = new ProgressSupport(this);
		pm.beginTask(getTaskName(), 3 * myTemplates.size());
		for (InvokeTemplateTask tt : myTemplates) {
			tt.validate();
			pm.worked(1);
		}
		XpandFacade xf = null;
		for (InvokeTemplateTask tt : myTemplates) {
			tt.execute(xf);
			pm.worked(2);
		}
	}
}
