/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.graphdef.codegen;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.gmf.common.codegen.ImportAssistant;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.util.FigureQualifiedNameSwitch;
import org.eclipse.gmf.internal.common.codegen.TextEmitter;
import org.eclipse.gmf.internal.graphdef.codegen.Activator;
import org.eclipse.gmf.internal.xpand.BufferOutput;
import org.eclipse.gmf.internal.xpand.ResourceManager;
import org.eclipse.gmf.internal.xpand.XpandFacade;
import org.eclipse.gmf.internal.xpand.expression.Variable;
import org.eclipse.gmf.internal.xpand.util.ContextFactory;

public class FigureGenerator implements TextEmitter {
	private final XpandFacade xpandFacade;

	private final StringBuilder result;

	private Variable packageStatement;

	private StringBuilder additionalMethods;

	private final boolean myIsInnerClassCode;

	private StringBuilder additionalFields;

	public FigureGenerator(FigureQualifiedNameSwitch fqnSwitch, boolean asInnerClass) {
		this(fqnSwitch, MapModeCodeGenStrategy.DYNAMIC, "getMapMode().", asInnerClass);
	}

	public FigureGenerator(FigureQualifiedNameSwitch fqnSwitch, MapModeCodeGenStrategy mapModeStrategy, String mapModeAccessor, boolean asInnerClass) {
		myIsInnerClassCode = asInnerClass;
		if (mapModeStrategy == MapModeCodeGenStrategy.STATIC) {
			if (mapModeAccessor != null && mapModeAccessor.trim().length() > 0) {
				throw new IllegalArgumentException("Can't use map mode accessor with identity map mode");
			}
		}
		final ArrayList<Variable> globals = new ArrayList<Variable>();
		if (mapModeStrategy == MapModeCodeGenStrategy.DYNAMIC) {
			globals.add(new Variable("mapModeAccessor", mapModeAccessor == null ? "" : mapModeAccessor));
		}
		globals.add(new Variable(FigureQualifiedNameSwitch.class.getSimpleName(), fqnSwitch));
		packageStatement = new Variable("packageStatement", "");
		globals.add(packageStatement);
		additionalMethods = new StringBuilder();
		globals.add(new Variable("outputAdditionalMethods", "") {
			public Object getValue() {
				return additionalMethods.toString();
			}
		});
		additionalFields = new StringBuilder();
		globals.add(new Variable("outputStaticFields", "") {
			public Object getValue() {
				return additionalFields.toString();
			}
		});
		result = new StringBuilder(200);
		Map<String, StringBuilder> slots = new HashMap<String, StringBuilder>();
		slots.put("additionalMethods", additionalMethods);
		slots.put("staticFields", additionalFields);
		BufferOutput bufferOutput = new BufferOutput(result, slots);

		ResourceManager resourceManager = Activator.createResourceEngine(mapModeStrategy);
		xpandFacade = new XpandFacade(ContextFactory.createXpandContext(resourceManager, bufferOutput, globals, getClass().getClassLoader()));
	}

	public String go(Figure figure, ImportAssistant importAssistant) {
		result.setLength(0);
		additionalMethods.setLength(0);
		additionalFields.setLength(0);
		StringBuffer ss = new StringBuffer();
		importAssistant.emitPackageStatement(ss);
		packageStatement.setValue(ss.toString());
		xpandFacade.evaluate("top::Figure::FigureClass", figure, new Object[] {myIsInnerClassCode});
		final String resultString = result.toString();
		return resultString;
	}

	public String generate(IProgressMonitor monitor, Object[] arguments) throws InterruptedException, InvocationTargetException, UnexpectedBehaviourException {
		if (arguments == null || arguments.length != 2 || false == arguments[0] instanceof Figure || false == arguments[1] instanceof ImportAssistant) {
			throw new UnexpectedBehaviourException("(Figure, ImportAssistant) expected as arguments, not " + arguments);
		}
		return go((Figure) arguments[0], (ImportAssistant) arguments[1]);
	}
}
