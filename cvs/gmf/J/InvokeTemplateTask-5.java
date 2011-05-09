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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.StringTokenizer;

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
	private String[] myTemplateRoots;
	private String myOutFile;

	public void setName(String name) {
		myTemplateName = name;
	}

	public void setBareInput(String input) {
		myTemplateTarget = input;
	}

	public void setInputURI(String uri) {
		myTemplateTarget = uri;
	}

	public void setOutFile(String uri) {
		myOutFile = uri;
	}

	public void setTemplateRoot(String root) {
		ArrayList<String> roots = new ArrayList<String>();
		for (StringTokenizer st = new StringTokenizer(root, ";, "); st.hasMoreTokens(); ) {
			roots.add(st.nextToken().trim());
		}
		myTemplateRoots = roots.toArray(new String[roots.size()]);
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
		if (myOutFile == null) {
			System.err.println("ITT:" + result);
		} else {
			try {
				File f = getProject().resolveFile(myOutFile);
				FileOutputStream os = new FileOutputStream(f);
				os.write(result.getBytes());
				os.close();
			} catch (IOException ex) {
				throw new BuildException("Can't write to " + myOutFile, ex, getLocation());
			}
		}
	}

	protected void validate() throws BuildException {
		if (myTemplateName == null) {
			throw new BuildException("Template name is missing", getLocation());
		}
		if (myTemplateTarget == null) {
			throw new BuildException("Target object is missing", getLocation());
		}
		if (myTemplateRoots == null || myTemplateRoots.length == 0) {
			throw new BuildException("No template root specified", getLocation());
		}
	}

	protected Object getTemplateTarget() {
		return myTemplateTarget;
	}

	protected Object[] getTemplateArguments() {
		return null;
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
