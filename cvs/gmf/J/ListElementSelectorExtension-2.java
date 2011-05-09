package org.eclipse.gmf.internal.common.ui;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;

/**
 * @author dstadnik
 */
public abstract class ListElementSelectorExtension extends ElementSelectorExtension {

	protected List list;

	public void createControl(Composite parent) {
		Composite plate = new Composite(parent, SWT.NONE);
		{
			GridLayout layout = new GridLayout();
			plate.setLayout(layout);

			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			data.verticalAlignment = GridData.FILL;
			data.grabExcessVerticalSpace = true;
			plate.setLayoutData(data);
		}
		Label label = new Label(plate, SWT.NONE);
		label.setText(getModelElementName());
		{
			GridData data = new GridData();
			label.setLayoutData(data);
		}
		list = new List(plate, SWT.SINGLE | SWT.V_SCROLL);
		list.setEnabled(false);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			data.verticalAlignment = GridData.FILL;
			data.grabExcessVerticalSpace = true;
			list.setLayoutData(data);
		}

		// logic

		list.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
			}

			public void widgetSelected(SelectionEvent e) {
				selectedModelElement = (EObject) modelElements.get(list.getSelectionIndex());
			}
		});
	}

	public void setResource(Resource resource) {
		selectedModelElement = null;
		modelElements.clear();
		list.removeAll();
		if (resource == null) {
			list.setEnabled(false);
		} else {
			list.setEnabled(true);
			modelElements = getModelElements(resource);
			for (Iterator it = modelElements.iterator(); it.hasNext();) {
				list.add(getModelElementLabel((EObject) it.next()));
			}
			if (!modelElements.isEmpty()) {
				selectedModelElement = (EObject) modelElements.get(0);
				list.select(0);
			}
		}
	}
}
