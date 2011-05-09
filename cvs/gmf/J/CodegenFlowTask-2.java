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
import org.apache.tools.ant.TaskContainer;

public class CodegenFlowTask extends Task implements TaskContainer {

	private final LinkedList<Task> myTasks = new LinkedList<Task>();

	public CodegenFlowTask() {
	}

	public void addTask(Task task) {
		if (task instanceof InvokeTemplateTask) {
//			((InvokeTemplateTask) task).bindContext(this);
		}
		myTasks.add(task);
	}

	public void setTemplateRoot(String templateRoot) {
	}

	public void setOutputRoot(String outputRoot) {
	}

	public void setInputModel(String input) {
	}

	@Override
	public void execute() throws BuildException {
		for (Task t : myTasks) {
			t.perform();
		}
	}
}
