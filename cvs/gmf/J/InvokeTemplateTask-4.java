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

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * <p>... xmlns:xpt=<em>&quot;eclipse.org/gmf/2008/xpand&quot;</em>...
 * <p>
 * &lt;xpt:template name=&quot;a::b::Main&quot;/&gt;
 *
 * @author artem
 */
public class InvokeTemplateTask extends Task {

	private String myTemplateName;
	private Object myTemplateTarget;
	private String myTemplateRoot;

	public void setName(String name) {
		myTemplateName = name;
	}

	public void setBareInput(String input) {
		myTemplateTarget = input;
	}

	public void setBareInput(int i) {
		myTemplateTarget = i;
	}
	public void setTemplateRoot(String root) {
		myTemplateRoot = root;
	}

	@Override
	public void execute() throws BuildException {
		IProgressMonitor pm = new ProgressSupport(this);
		pm.beginTask(getTaskName(), 3);
		validate();
		pm.worked(1);
		//
		XpandFacade xf = createFacade();
		execute(xf);
		//
		pm.done();
	}
	
	protected void execute(XpandFacade xf) throws BuildException {
		String result = xf.xpand(myTemplateName, getTemplateTarget(), getTemplateArguments());
		System.err.println("ITT:" + result);
	}

	protected void validate() throws BuildException {
		if (myTemplateName == null) {
			throw new BuildException("Template name is missing", getLocation());
		}
		if (myTemplateTarget == null) {
			throw new BuildException("Target object is missing", getLocation());
		}
	}

	protected Object getTemplateTarget() {
		return myTemplateTarget;
	}

	protected Object[] getTemplateArguments() {
		return null;
	}

	protected XpandFacade createFacade() {
		try {
			XpandFacade xf = new XpandFacade();
			xf.addLocation(myTemplateRoot);
			return xf;
		} catch (Exception ex) {
			ex.printStackTrace();
			// FIXME
		}
		assert false;
		return null;
	}
}
