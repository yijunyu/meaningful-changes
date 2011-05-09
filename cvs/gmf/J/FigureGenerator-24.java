/*
 * Copyright (c) 2005 Borland Software Corporation
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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.gmf.common.codegen.ImportAssistant;
import org.eclipse.gmf.gmfgraph.BorderLayout;
import org.eclipse.gmf.gmfgraph.BorderLayoutData;
import org.eclipse.gmf.gmfgraph.CompoundBorder;
import org.eclipse.gmf.gmfgraph.CustomBorder;
import org.eclipse.gmf.gmfgraph.CustomFigure;
import org.eclipse.gmf.gmfgraph.CustomLayout;
import org.eclipse.gmf.gmfgraph.CustomLayoutData;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FlowLayout;
import org.eclipse.gmf.gmfgraph.GridLayout;
import org.eclipse.gmf.gmfgraph.GridLayoutData;
import org.eclipse.gmf.gmfgraph.Label;
import org.eclipse.gmf.gmfgraph.LineBorder;
import org.eclipse.gmf.gmfgraph.MarginBorder;
import org.eclipse.gmf.gmfgraph.PolygonDecoration;
import org.eclipse.gmf.gmfgraph.Polyline;
import org.eclipse.gmf.gmfgraph.PolylineConnection;
import org.eclipse.gmf.gmfgraph.PolylineDecoration;
import org.eclipse.gmf.gmfgraph.RoundedRectangle;
import org.eclipse.gmf.gmfgraph.Shape;
import org.eclipse.gmf.gmfgraph.XYLayoutData;
import org.eclipse.gmf.gmfgraph.util.FigureQualifiedNameSwitch;
import org.eclipse.gmf.graphdef.codegen.templates.CustomClassAttributesGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.CustomFigureAttrGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.FigureAttrGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.FigureChildrenGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.InitBorderLayoutDataGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.InitBorderLayoutGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.InitCustomLayoutDataGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.InitCustomLayoutGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.InitFlowLayoutGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.InitGridLayoutDataGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.InitGridLayoutGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.InitXYLayoutDataGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.LabelAttrGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.NewCompoundBorderExpressionGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.NewCustomBorderExpressionGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.NewFigureGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.NewLayoutDataGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.NewLayoutGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.NewLineBorderExpressionGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.NewMarginBorderExpressionGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.PolygonDecorationAttrGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.PolylineAttrGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.PolylineDecorationAttrGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.RoundedRectAttrGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.ShapeAttrGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.TopConnectionGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.TopFigureGenerator;
import org.eclipse.gmf.graphdef.codegen.templates.TopGenerator;
import org.eclipse.gmf.internal.codegen.dispatch.EmitterFactory;
import org.eclipse.gmf.internal.codegen.dispatch.HierarchyKeyMap;
import org.eclipse.gmf.internal.codegen.dispatch.KeyChain;
import org.eclipse.gmf.internal.codegen.dispatch.KeyMap;
import org.eclipse.gmf.internal.codegen.dispatch.StaticTemplateRegistry;
import org.eclipse.gmf.internal.codegen.dispatch.TemplateRegistry;
import org.eclipse.gmf.internal.common.codegen.TextEmitter;
import org.osgi.framework.Bundle;

/**
 * @author artem
 *
 */
public class FigureGenerator implements TextEmitter {
	private static final String ENTRY_POINT = "main";

	private final GraphDefDispatcher myTopDispatcher;
	private final GraphDefDispatcher myInnerDispatcher;
	private final boolean myIsInnerClassCode;

	public FigureGenerator(FigureQualifiedNameSwitch figureNameSwitch, boolean asInnerClass) {
		this(figureNameSwitch, new MapModeCodeGenStrategy.RuntimeUnspecifiedMapMode(), asInnerClass);
	}

	public FigureGenerator(FigureQualifiedNameSwitch figureNameSwitch, MapModeCodeGenStrategy mapModeStrategy, boolean placeStaticFieldsOutsideClassBody) {
		myIsInnerClassCode = placeStaticFieldsOutsideClassBody;
		final Bundle thisBundle = Platform.getBundle("org.eclipse.gmf.graphdef.codegen");
		final String[] variables = new String[] {
				"org.eclipse.gmf.graphdef",
				"org.eclipse.emf.ecore",
				"org.eclipse.emf.common",
				"org.eclipse.gmf.common",
				"org.eclipse.gmf.graphdef.codegen"
		};

		KeyMap keyMap = new ClassesOrStringsKeyMap();
		String[] templatePath = new String[] {thisBundle.getEntry("/templates/").toString()};
		EmitterFactory topFactory = new EmitterFactory(templatePath, fillTopLevel(), true, variables, true);
		myTopDispatcher = new GraphDefDispatcher(topFactory, keyMap, figureNameSwitch, mapModeStrategy);
		EmitterFactory innerFactory = new EmitterFactory(templatePath, fillAttrs(), true, variables, true);
		myInnerDispatcher = new GraphDefDispatcher(innerFactory, keyMap, figureNameSwitch, mapModeStrategy);
	}

	private static TemplateRegistry fillTopLevel() {
		StaticTemplateRegistry tr = new StaticTemplateRegistry(FigureGenerator.class.getClassLoader());
		tr.put(ENTRY_POINT, "/top/Top.javajet", TopGenerator.class);
		tr.put(PolylineConnection.class, "/top/PolylineConnection.javajet", TopConnectionGenerator.class);
		tr.put(Figure.class, "/top/Figure.javajet", TopFigureGenerator.class);
		return tr;
	}
	
	// XXX NOTE, the fact we use "instantiate" and "Children" strings
	// helps us to postpone resolution of the next problem (one we make these twwo overridable):
	// it's not possible to tell from single dispatcher.dispatch(Figure, args) what's the intention - 
	// whether to instantiate, look for children or initialize attributes
	// Perhaps, we should have distinct methods in the Dispatcher, or add "hint" as another argument
	private static TemplateRegistry fillAttrs() {
		StaticTemplateRegistry tr = new StaticTemplateRegistry(FigureGenerator.class.getClassLoader());
		tr.put(Figure.class, "/attr/Figure.javajet", FigureAttrGenerator.class);
		tr.put(Shape.class, "/attr/Shape.javajet", ShapeAttrGenerator.class);
		tr.put(Label.class, "/attr/Label.javajet", LabelAttrGenerator.class);
		tr.put(Polyline.class, "/attr/Polyline.javajet", PolylineAttrGenerator.class);
		tr.put(RoundedRectangle.class, "/attr/RoundedRectangle.javajet", RoundedRectAttrGenerator.class);
		tr.put(PolygonDecoration.class, "/attr/PolygonDecoration.javajet", PolygonDecorationAttrGenerator.class);
		tr.put(PolylineDecoration.class, "/attr/PolylineDecoration.javajet", PolylineDecorationAttrGenerator.class);
		tr.put(CustomFigure.class, "/attr/CustomFigure.javajet", CustomFigureAttrGenerator.class);
		// instantiation templates - only single one now. FIXME - make it overridable
		tr.put("instantiate", "/new/Figure.javajet", NewFigureGenerator.class);
		// children templates - only single one now. FIXME - make it overridable
		tr.put("Children", "/children/Figure.javajet", FigureChildrenGenerator.class);
		// FIXME same template is registered twice
		tr.put("Shape", "/attr/Shape.javajet", ShapeAttrGenerator.class);
		tr.put("Figure", "/attr/Figure.javajet", FigureAttrGenerator.class);
		tr.put("PolylineDecoration", "/attr/PolylineDecoration.javajet", PolylineDecorationAttrGenerator.class);

		// Custom attributes support
		tr.put("customAttributes", "/attr/CustomConfigurableClass.javajet", CustomClassAttributesGenerator.class);
		// Layout related dispatching chain.  
		tr.put("createLayout", "/new/Layout.javajet", NewLayoutGenerator.class);
		tr.put(GridLayout.class, "/layout/GridLayout.javajet", InitGridLayoutGenerator.class);
		tr.put(BorderLayout.class, "/layout/BorderLayout.javajet", InitBorderLayoutGenerator.class);
		tr.put(CustomLayout.class, "/layout/CustomLayout.javajet", InitCustomLayoutGenerator.class);
		tr.put(FlowLayout.class, "/layout/FlowLayout.javajet", InitFlowLayoutGenerator.class);
		
		tr.put("createLayoutData", "/new/LayoutData.javajet", NewLayoutDataGenerator.class);
		tr.put(GridLayoutData.class, "/layoutData/GridLayoutData.javajet", InitGridLayoutDataGenerator.class);
		tr.put(BorderLayoutData.class, "/layoutData/BorderLayoutData.javajet", InitBorderLayoutDataGenerator.class);
		tr.put(CustomLayoutData.class, "/layoutData/CustomLayoutData.javajet", InitCustomLayoutDataGenerator.class);
		tr.put(XYLayoutData.class, "/layoutData/XYLayoutData.javajet", InitXYLayoutDataGenerator.class);
		
		//Borders 
		tr.put(LineBorder.class, "/new/LineBorder.javajet", NewLineBorderExpressionGenerator.class);
		tr.put(MarginBorder.class, "/new/MarginBorder.javajet", NewMarginBorderExpressionGenerator.class);
		tr.put(CompoundBorder.class, "/new/CompoundBorder.javajet", NewCompoundBorderExpressionGenerator.class);
		tr.put(CustomBorder.class, "/new/CustomBorder.javajet", NewCustomBorderExpressionGenerator.class);

		return tr;
	}

	public String generate(IProgressMonitor monitor, Object[] arguments) throws InterruptedException, InvocationTargetException, UnexpectedBehaviourException {
		if (arguments == null || arguments.length != 2 || false == arguments[0] instanceof Figure || false == arguments[1] instanceof ImportAssistant) {
			throw new UnexpectedBehaviourException("(Figure, ImportAssistant) expected as arguments, not " + arguments);
		}
		return go((Figure) arguments[0], (ImportAssistant) arguments[1]);
	}

	public String go(Figure fig, ImportAssistant importManager/*, Feedback feedback*/) {
		String res = null;
		myTopDispatcher.resetForNewClass(importManager);
		myInnerDispatcher.resetForNewClass(importManager);
		Object args = new Object[] {fig, myInnerDispatcher, myTopDispatcher, Boolean.valueOf(myIsInnerClassCode)};
		res = myTopDispatcher.dispatch(ENTRY_POINT, args);
		if (res == null) {
			throw new IllegalStateException();
		}
		return res;
	}
	
	private static class ClassesOrStringsKeyMap extends HierarchyKeyMap {
		/*
		 * Capture knowledge that we use classes and strings as keys
		 */
		public KeyChain map(Object key) {
			if (key instanceof String) {
				return super.map(key);
			} else {
				return super.map(key.getClass());
			}
		}
	}
/*
	public static class Feedback {
		void registerChildAccessor(Figure parent, Figure child, String getterName, String setterName) {
			// do nothing
		}
	}
*/
}
