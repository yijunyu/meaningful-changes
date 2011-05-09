package org.eclipse.gmf.internal.common.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author dstadnik
 */
public abstract class ElementSelectorExtension implements ModelSelectionPageExtension {

	protected List modelElements = new ArrayList();

	protected EObject selectedModelElement;

	protected abstract String getModelElementName();

	protected abstract String getModelElementLabel(EObject modelElement);

	protected EClass getModelElementClass() {
		return null;
	}

	protected boolean isApplicable(EObject element) {
		return true;
	}

	protected List<EObject> getModelElements(Resource resource) {
		List<EObject> elements = new ArrayList<EObject>();
		for (Iterator it = resource.getAllContents(); it.hasNext();) {
			EObject next = (EObject) it.next();
			boolean applicableType = getModelElementClass() == null || next.eClass().equals(getModelElementClass());
			if (applicableType && isApplicable(next)) {
				elements.add(next);
			}
		}
		Collections.sort(elements, new Comparator<EObject>() {

			public int compare(EObject o1, EObject o2) {
				String n1 = getModelElementLabel(o1);
				String n2 = getModelElementLabel(o2);
				return n1.compareTo(n2);
			}
		});
		return elements;
	}

	public EObject getModelElement() {
		return selectedModelElement;
	}
}
