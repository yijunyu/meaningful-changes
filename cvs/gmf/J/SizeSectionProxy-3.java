/*
 *  Copyright (c) 2006, 2007 Borland Software Corporation and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *      Borland Software Corporation - initial API and implementation
 */
package org.eclipse.gmf.graphdef.editor.sheet;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.gmfgraph.Ellipse;
import org.eclipse.gmf.gmfgraph.Polyline;
import org.eclipse.gmf.gmfgraph.Rectangle;
import org.eclipse.gmf.gmfgraph.RoundedRectangle;
import org.eclipse.gmf.graphdef.editor.part.PropertySectionFilters;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.jface.viewers.IFilter;

/**
 * @generated
 */
public class SizeSectionProxy extends SizeSection {

	/**
	 * @generated
	 */
	protected void commit() {
		final List<IFile> files = Collections.singletonList(WorkspaceSynchronizer.getFile(getInput().eResource()));
		AbstractTransactionalCommand cmd = new AbstractTransactionalCommand(TransactionUtil.getEditingDomain(getInput()), "", files) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				SizeSectionProxy.super.commit();
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(cmd, new NullProgressMonitor(), null);
		} catch (ExecutionException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * @generated
	 */
	protected Object unwrap(Object element) {
		Object rv = PropertySectionFilters.transformSelection(element);
		if (rv instanceof Rectangle || rv instanceof Ellipse || rv instanceof RoundedRectangle || rv instanceof Polyline) {
			return rv;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static class Filter implements IFilter {

		/**
		 * @generated
		 */
		public boolean select(Object toTest) {
			Object transformed = PropertySectionFilters.transformSelection(toTest);
			return transformed instanceof Rectangle || transformed instanceof Ellipse || transformed instanceof RoundedRectangle || transformed instanceof Polyline;
		}

	}

}
