/*
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.wizards.pages.simple;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.internal.bridge.ui.Plugin;
import org.eclipse.gmf.internal.bridge.wizards.pages.simple.ResolvedItem.Resolution;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

/**
 * @author dstadnik
 */
class DomainModelViewerFactory {

	private static final String P_NODE = "Node"; //$NON-NLS-1$

	private static final String P_LINK = "Link"; //$NON-NLS-1$

	private static final String P_LABEL = "Label"; //$NON-NLS-1$

	public static TreeViewer createViewer(Tree tree, boolean withLabes) {
		TreeViewer viewer = new TreeViewer(tree);
		viewer.setContentProvider(new ResolverContentProvider());
		AdapterFactory adapterFactory = new EcoreItemProviderAdapterFactory();
		viewer.setLabelProvider(new ResolverLabelProvider(new AdapterFactoryLabelProvider(adapterFactory)));
		if (withLabes) {
			viewer.setColumnProperties(new String[] { "no", P_NODE, P_LINK, P_LABEL }); //$NON-NLS-1$
			viewer.setCellEditors(new CellEditor[] { null, new CheckboxCellEditor(), new CheckboxCellEditor(), new CheckboxCellEditor() });
		} else {
			viewer.setColumnProperties(new String[] { "no", P_NODE, P_LINK }); //$NON-NLS-1$
			viewer.setCellEditors(new CellEditor[] { null, new CheckboxCellEditor(), new CheckboxCellEditor() });
		}
		viewer.setCellModifier(new ResolverCellModifier(viewer, withLabes));
		return viewer;
	}

	private static class ResolverCellModifier implements ICellModifier {

		private TreeViewer viewer;

		private boolean withLabels;

		public ResolverCellModifier(TreeViewer viewer, boolean withLabels) {
			this.viewer = viewer;
			this.withLabels = withLabels;
		}

		public Object getValue(Object element, String property) {
			ResolvedItem item = (ResolvedItem) element;
			return Boolean.valueOf(item.getResolution() == getResolution(property));
		}

		public boolean canModify(Object element, String property) {
			ResolvedItem item = (ResolvedItem) element;
			return !item.isDisabled();
		}

		public void modify(Object element, String property, Object value) {
			ResolvedItem item = (ResolvedItem) ((TreeItem) element).getData();
			Resolution resolution = getResolution(property);
			if (!item.isPossibleResolution(resolution)) {
				return;
			}
			item.setResolution(((Boolean) value).booleanValue() ? resolution : null);
			if (withLabels) {
				viewer.update(item, new String[] { P_NODE, P_LINK, P_LABEL });
			} else {
				viewer.update(item, new String[] { P_NODE, P_LINK });
			}
		}
		
		private Resolution getResolution(String property) {
			if (P_NODE.equals(property)) {
				return Resolution.NODE;
			} else if (P_LINK.equals(property)) {
				return Resolution.LINK;
			} else if (P_LABEL.equals(property)) {
				return Resolution.LABEL;
			}
			return null;
		}
	}

	private static class ResolverContentProvider implements ITreeContentProvider {

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		public Object getParent(Object element) {
			return ((ResolvedItem) element).getParent();
		}

		public Object[] getChildren(Object parentElement) {
			List<?> children = ((ResolvedItem) parentElement).getChildren();
			return children.toArray();
		}

		public boolean hasChildren(Object element) {
			List<?> children = ((ResolvedItem) element).getChildren();
			return !children.isEmpty();
		}

		public Object[] getElements(Object inputElement) {
			return getChildren(inputElement);
		}
	}

	private static class ResolverLabelProvider extends LabelProvider implements ITableLabelProvider {

		private ILabelProvider domainLabelProvider;

		public ResolverLabelProvider(ILabelProvider domainLabelProvider) {
			this.domainLabelProvider = domainLabelProvider;
		}

		public String getColumnText(Object element, int columnIndex) {
			if (columnIndex == 0) {
				Object domainRef = ((ResolvedItem) element).getDomainRef();
				return domainLabelProvider.getText(domainRef);
			} else {
				return null;
			}
		}

		public Image getColumnImage(Object element, int columnIndex) {
			if (columnIndex == 0) {
				Object domainRef = ((ResolvedItem) element).getDomainRef();
				return domainLabelProvider.getImage(domainRef);
			}
			ResolvedItem item = (ResolvedItem) element;
			Image image = getResolutionImage(element, columnIndex);
			if (item.isDisabled() && image != null) {
				return Plugin.getDefault().getImageRegistry().get(Plugin.GRAYED_ICON);
			}
			return image;
		}

		protected Image getResolutionImage(Object element, int columnIndex) {
			ResolvedItem item = (ResolvedItem) element;
			Image checkedIcon = Plugin.getDefault().getImageRegistry().get(Plugin.CHECKED_ICON);
			Image uncheckedIcon = Plugin.getDefault().getImageRegistry().get(Plugin.UNCHECKED_ICON);
			if (columnIndex == 1) {
				if (!item.isPossibleResolution(Resolution.NODE)) {
					return null;
				}
				return Resolution.NODE == item.getResolution() ? checkedIcon : uncheckedIcon;
			} else if (columnIndex == 2) {
				if (!item.isPossibleResolution(Resolution.LINK)) {
					return null;
				}
				return Resolution.LINK == item.getResolution() ? checkedIcon : uncheckedIcon;
			} else if (columnIndex == 3) {
				if (!item.isPossibleResolution(Resolution.LABEL)) {
					return null;
				}
				return Resolution.LABEL == item.getResolution() ? checkedIcon : uncheckedIcon;
			}
			return null;
		}
	}
}
