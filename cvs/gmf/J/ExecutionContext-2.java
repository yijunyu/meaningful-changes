/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.gmf.internal.xpand.expression;

import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.gmf.internal.xpand.ResourceMarker;
import org.eclipse.gmf.internal.xpand.xtend.ast.Extension;

/**
 * @author Sven Efftinge
 * @author Arno Haase
 */
public interface ExecutionContext {

	/**
	 * XXX during analyze, we treat value of this variable as EClassifier,
	 * and during evaluate - as Object (i.e. rather instance than meta-type)
	 */
	public final static String IMPLICIT_VARIABLE = "this";

	<T extends ExecutionContext> T cloneWithVariable(Variable v);

	<T extends ExecutionContext> T cloneWithoutVariables();

	<T extends ExecutionContext> T cloneWithResource(ResourceMarker ns);

	<T extends ExecutionContext> T cloneWithoutResource();

	Variable getVariable(String name);

	Map<String, Variable> getVisibleVariables();

	/**
	 * accessible only through special extension methods
	 */
	Map<String, Variable> getGlobalVariables();

	ResourceMarker currentResource();

	Extension getExtension(String functionName, EClassifier[] parameterTypes);

	Set<? extends Extension> getAllExtensions();

	EClassifier getTypeForName(String name);//		!!!getImportedNamespaces()

	public EClassifier[] findTypesForPrefix(final String prefix);
	
	// instead of ResourceLoaderFactory.createResourceLoader()
	Class loadClass(String value);
}
