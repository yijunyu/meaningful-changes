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

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.gmf.internal.xpand.ResourceMarker;
import org.eclipse.gmf.internal.xpand.eval.EvaluationListener;
import org.eclipse.gmf.internal.xpand.xtend.ast.Extension;

/**
 * @author Sven Efftinge
 * @author Arno Haase
 * XXX [artem] I'd better split this into two parts, "Scope" (no subtypes) with Variables and Resource - the part that 
 * is actually being changed/cloned, and "Context" itself, with methods to access types/definition/templates/output/whatever
 * XXX leave this as "Context" and add "Environment"?
 * Plus, would be great to have some cancellation behavior avialable from environment (i.e. for debuger to be able to stop execution)
 * XXX move to xpand.model out from xpand.expression package 
 */
public interface ExecutionContext {

	/**
	 * XXX during analyze, we treat value of this variable as EClassifier,
	 * and during evaluate - as Object (i.e. rather instance than meta-type)
	 */
	public final static String IMPLICIT_VARIABLE = "this";

	<T extends ExecutionContext> T cloneWithVariable(Variable... v);
	<T extends ExecutionContext> T cloneWithVariable(Collection<Variable> v);

	<T extends ExecutionContext> T cloneWithoutVariables();

	<T extends ExecutionContext> T cloneWithResource(ResourceMarker ns);

	Variable getVariable(String name);

	Collection<Variable> getVisibleVariables();

	/**
	 * accessible only through special extension methods
	 */
	Collection<Variable> getGlobalVariables();

	Variable getGlobalVariable(String name);

	ResourceMarker currentResource();

	Extension getExtension(String functionName, EClassifier[] parameterTypes);

	Set<? extends Extension> getAllExtensions();

	EClassifier getTypeForName(String name);//		!!!getImportedNamespaces()

	public EClassifier[] findTypesForPrefix(final String prefix);
	
	// instead of ResourceLoaderFactory.createResourceLoader()
	Class<?> loadClass(String value);

	// [artem] if not null, should be notified about entering/leaving xpand ast elements
	EvaluationListener getEvaluationListener();
}
