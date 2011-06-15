/**
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.runtime.lite.commands;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * Command that should be used to destroy an underlying model element for which
 * a notational element may be registered. It behaves effectively the same way
 * as the {@link DeleteCommand}, but allows filtering of some references, so that they are not removed.
 */
public class DestroyElementCommand extends CompoundCommand {
	/**
	 * This is the editing doman in which this command operates.
	 */
	protected EditingDomain domain;
	
	/**
	 * This is the collection of objects to be deleted.
	 */
	protected Collection<?> collection;

	/**
	 * This creates a command that deletes the given object.
	 */
	public static Command create(EditingDomain domain, Object object) {
		return create(domain, Collections.singleton(object));
	}

	/**
	 * This creates a command that deletes the objects in the given collection.
	 */
	public static Command create(EditingDomain domain, Collection<?> collection) {
		return domain.createCommand(DestroyElementCommand.class, new CommandParameter(null, null, collection));
	}

	protected static final String LABEL = "Delete";

	protected static final String DESCRIPTION = "Remove the objects and clean up references to them from within the editing domain";

	/**
	 * This constructs a command that deletes the objects in the given
	 * collection.
	 */
	public DestroyElementCommand(EditingDomain domain, Collection<?> collection) {
		super(0, LABEL, DESCRIPTION);
	    this.domain = domain;
	    this.collection = collection;
	}

	/**
	 * This constructs a command that deletes the objects in the collection
	 * specified by the given command parameter. This constructor is called by
	 * default implementations of editing domains.
	 */
	public DestroyElementCommand(EditingDomain domain, CommandParameter commandParameter) {
		this(domain, commandParameter.getCollection());
	}

	/**
	 * Returns whether value should be removed from the reference identified by
	 * the given setting. 
	 */
	protected boolean shouldRemoveReference(EStructuralFeature.Setting setting) {
		return NotationPackage.eINSTANCE.getView_Element() != setting.getEStructuralFeature();
	}

	protected boolean prepare() {
		prepareCommand();
		return super.prepare();
	}

	protected void prepareCommand() {
		HashMap<Resource, Collection<Object>> uncontainedObjects = null;
		Collection<Object> otherObjects = new BasicEList<Object>();
		for (Object next : collection) {
			if (next instanceof EObject) {
				EObject nextEObject = (EObject) next;
				if (nextEObject.eContainer() == null && nextEObject.eResource() != null) {
					//Object directly contained within a resource should be removed differently
					if (uncontainedObjects == null) {
						uncontainedObjects = new HashMap<Resource, Collection<Object>>();
					}
					Collection<Object> uncontainedObjectsForResource = uncontainedObjects.get(nextEObject.eResource());
					if (uncontainedObjectsForResource == null) {
						uncontainedObjectsForResource = new BasicEList<Object>();
						uncontainedObjects.put(nextEObject.eResource(), uncontainedObjectsForResource);
					}
					uncontainedObjectsForResource.add(nextEObject);
					continue;
				}
			}
			otherObjects.add(next);
		}
		if (!otherObjects.isEmpty()) {
			append(RemoveCommand.create(domain, otherObjects));
		}
		if (uncontainedObjects != null) {
			for (Map.Entry<Resource, Collection<Object>> nextEntry : uncontainedObjects.entrySet()) {
				append(new RemoveCommand(domain, nextEntry.getKey().getContents(), nextEntry.getValue()));
			}
		}
	}

	@Override
	public void execute() {
		Collection<Object> eObjects = new UniqueEList<Object>();
		for (Iterator<?> i = collection.iterator(); i.hasNext(); ) {
			Object object = AdapterFactoryEditingDomain.unwrap(i.next());
			if (object instanceof EObject) {
				eObjects.add(object);
				for (Iterator<EObject> j = ((EObject) object).eAllContents(); j.hasNext(); ) {
					eObjects.add(j.next());
				}
			} else if (object instanceof Resource) {
				for (Iterator<EObject> j = ((Resource) object).getAllContents(); j.hasNext(); ) {
					eObjects.add(j.next());
				}
			}
		}

		Map<EObject, Collection<EStructuralFeature.Setting>> usages = EcoreUtil.UsageCrossReferencer.findAll(eObjects, domain.getResourceSet());

		super.execute();

		for (Iterator<Map.Entry<EObject, Collection<EStructuralFeature.Setting>>> i = usages.entrySet().iterator(); i.hasNext(); ) {
			Map.Entry<EObject, Collection<EStructuralFeature.Setting>> entry = i.next();
			EObject eObject = entry.getKey();
			Collection<EStructuralFeature.Setting> settings = entry.getValue();
			for (Iterator<EStructuralFeature.Setting> j = settings.iterator(); j.hasNext(); ) {
				EStructuralFeature.Setting setting = j.next();
				if (!shouldRemoveReference(setting)) {
					continue;
				}
				EObject referencingEObject = setting.getEObject();
				if (!eObjects.contains(referencingEObject)) {
					EStructuralFeature eStructuralFeature = setting.getEStructuralFeature();
					if (eStructuralFeature.isChangeable()) {
						if (eStructuralFeature.isMany()) {
							appendAndExecute(RemoveCommand.create(domain, referencingEObject, eStructuralFeature, eObject));
						} else {
							appendAndExecute(SetCommand.create(domain, referencingEObject, eStructuralFeature, null));
						}
					}
				}
			}
		}
	}
}
