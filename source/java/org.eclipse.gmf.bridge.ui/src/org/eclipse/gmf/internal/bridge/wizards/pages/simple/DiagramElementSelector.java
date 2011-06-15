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

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.internal.bridge.resolver.NodePattern;
import org.eclipse.gmf.internal.bridge.resolver.TypeLinkPattern;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * @deprecated move filtering functionality in DiagramElementSelectorExtension
 * 
 * @author dstadnik
 */
class DiagramElementSelector {

	private ResolvedItem domainModel;

	Combo control;

	private Button excludeContainedNodesChoice;

	private Button excludeLinksChoice;

	public void createControl(Composite plate) {
		Label diagramElementLabel = new Label(plate, SWT.NONE);
		diagramElementLabel.setText(Messages.DiagramElementSelectorElement);
		diagramElementLabel.setLayoutData(new GridData());
		control = new Combo(plate, SWT.DROP_DOWN);
		control.setLayoutData(createFillHorzGridData());
		excludeContainedNodesChoice = createChoice(plate, Messages.DiagramElementSelectorExContainedNodes);
		excludeLinksChoice = createChoice(plate, Messages.DiagramElementSelectorExLinks);
	}

	private Button createChoice(Composite plate, String text) {
		Label dummy = new Label(plate, SWT.NONE);
		dummy.setLayoutData(new GridData());
		Button choice = new Button(plate, SWT.CHECK);
		choice.setText(text);
		choice.setLayoutData(createFillHorzGridData());
		choice.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				updateDiagramElements();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		return choice;
	}

	protected GridData createFillHorzGridData() {
		GridData data = new GridData();
		data.horizontalAlignment = GridData.FILL;
		data.grabExcessHorizontalSpace = true;
		return data;
	}

	public ResolvedItem getDiagramElement() {
		return domainModel == null ? null : findResolvedItemByTypeName(domainModel, control.getText());
	}

	public void setDomainModel(ResolvedItem domainModel) {
		this.domainModel = domainModel;
		updateDiagramElements();
	}

	private void updateDiagramElements() {
		Set<ResolvedItem> types = new TreeSet<ResolvedItem>(new Comparator<ResolvedItem>() {

			public int compare(ResolvedItem arg0, ResolvedItem arg1) {
				EClass type0 = (EClass) arg0.getDomainRef();
				EClass type1 = (EClass) arg1.getDomainRef();
				return type0.getName().compareToIgnoreCase(type1.getName());
			}
		});
		if (domainModel != null) {
			collectResolvedDomainTypes(types, domainModel);
		}
		String contents = control.getText();
		control.removeAll();
		for (ResolvedItem next : types) {
			EClass type = (EClass) next.getDomainRef();
			control.add(type.getName());
			if (contents.equals(type.getName())) {
				control.setText(contents);
			}
		}
	}

	private void collectResolvedDomainTypes(Collection<ResolvedItem> types, ResolvedItem item) {
		if (item.getDomainRef() instanceof EClass) {
			boolean ignore = false;
			if (excludeContainedNodesChoice.getSelection()) {
				ignore |= item.getPattern() instanceof NodePattern;
			}
			if (excludeLinksChoice.getSelection()) {
				ignore |= item.getPattern() instanceof TypeLinkPattern;
			}
			if (!ignore) {
				types.add(item);
			}
		}
		for (ResolvedItem next : item.getChildren()) {
			collectResolvedDomainTypes(types, next);
		}
	}

	private ResolvedItem findResolvedItemByTypeName(ResolvedItem item, String typeName) {
		if (item.getDomainRef() instanceof EClass && ((EClass) item.getDomainRef()).getName().equals(typeName)) {
			return item;
		}
		for (ResolvedItem next : item.getChildren()) {
			ResolvedItem result = findResolvedItemByTypeName(next, typeName);
			if (result != null) {
				return result;
			}
		}
		return null;
	}
}
