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

import org.apache.tools.ant.Task;
import org.eclipse.ant.core.AntCorePlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.ProgressMonitorWrapper;
import org.eclipse.core.runtime.SubProgressMonitor;

// XXX think over if just static method is sufficient
class ProgressSupport extends ProgressMonitorWrapper {
	private final Task myTask;
	private IProgressMonitor mySubProgress;
	private IProgressMonitor myOriginalMonitor;

	public ProgressSupport(Task task) {
		super(extractProgress(task));
		assert task != null;
		myTask = task;
	}

	public void pushSubProgress(int ticks) {
		assert mySubProgress == null;
		if (myTask.getProject() == null) {
			return;
		}
		myOriginalMonitor = (IProgressMonitor) myTask.getProject().getReference(AntCorePlugin.ECLIPSE_PROGRESS_MONITOR);
		if (myOriginalMonitor == null) {
			return;
		}
		mySubProgress = new SubProgressMonitor(this, ticks);
		myTask.getProject().addReference(AntCorePlugin.ECLIPSE_PROGRESS_MONITOR, mySubProgress);
		
	}
	
	public void popSubProgress() {
		if (myTask.getProject() == null) {
			return;
		}
		assert mySubProgress != null;
		IProgressMonitor pm = (IProgressMonitor) myTask.getProject().getReference(AntCorePlugin.ECLIPSE_PROGRESS_MONITOR);
		assert pm == mySubProgress;
		mySubProgress.done();
		mySubProgress = null;
		myTask.getProject().addReference(AntCorePlugin.ECLIPSE_PROGRESS_MONITOR, myOriginalMonitor);
	}

	private static IProgressMonitor extractProgress(Task task) {
		IProgressMonitor monitor = task.getProject() == null ? null : (IProgressMonitor) task.getProject().getReference(AntCorePlugin.ECLIPSE_PROGRESS_MONITOR);
		//the monitor, if passed, is already initialized with beginTask() with an incorrect amount of work.
		return monitor == null ? new NullProgressMonitor() : new SubProgressMonitor(monitor, 1);
	}
}
