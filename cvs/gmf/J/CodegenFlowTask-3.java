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
import org.apache.tools.ant.TaskContainer;

public class CodegenFlowTask extends Task implements TaskContainer {

	private final LinkedList<Task> myTasks = new LinkedList<Task>();
	private final LinkedList<InvokeTemplateTask> myTemplateInvocations = new LinkedList<InvokeTemplateTask>();
	private String[] myTemplateRoots;

	public CodegenFlowTask() {
	}

	public void addTask(Task task) {
		if (task instanceof InvokeTemplateTask) {
			myTemplateInvocations.add((InvokeTemplateTask) task);
		}
		myTasks.add(task);
	}

	public void setTemplateRoot(String root) {
		ArrayList<String> roots = new ArrayList<String>();
		for (StringTokenizer st = new StringTokenizer(root, ";, "); st.hasMoreTokens(); ) {
			roots.add(st.nextToken().trim());
		}
		myTemplateRoots = roots.toArray(new String[roots.size()]);
	}

	public void setOutputRoot(String outputRoot) {
	}

	public void setInputModel(String input) {
	}

	@Override
	public void execute() throws BuildException {
		ProgressSupport ps = new ProgressSupport(this);
		ps.beginTask(getTaskName(), myTasks.size() + 2);
		XpandFacade xf = createFacade();
		for (InvokeTemplateTask t : myTemplateInvocations) {
			t.setFacade(xf);
		}
		ps.worked(2);
		try {
			ps.pushSubProgress(myTasks.size());
			for (Task t : myTasks) {
				t.perform();
				ps.worked(1);
			}
		} finally {
			ps.popSubProgress();
			ps.done();
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
