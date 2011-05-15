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
package org.eclipse.gmf.internal.codegen.lite;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.jet.JETCompiler;
import org.eclipse.emf.codegen.jet.JETException;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.gmf.common.codegen.ImportAssistant;
import org.eclipse.gmf.internal.codegen.dispatch.CachingEmitterFactory;
import org.eclipse.gmf.internal.codegen.dispatch.EmitterFactory;
import org.eclipse.gmf.internal.codegen.dispatch.EmitterFactoryImpl;
import org.eclipse.gmf.internal.codegen.dispatch.NoSuchTemplateException;
import org.eclipse.gmf.internal.codegen.dispatch.StaticTemplateRegistry;
import org.eclipse.gmf.internal.common.codegen.BinaryEmitter;
import org.eclipse.gmf.internal.common.codegen.DefaultTextMerger;
import org.eclipse.gmf.internal.common.codegen.GIFEmitter;
import org.eclipse.gmf.internal.common.codegen.JETEmitterAdapter;
import org.eclipse.gmf.internal.common.codegen.JETGIFEmitterAdapter;
import org.eclipse.gmf.internal.common.codegen.TextEmitter;
import org.eclipse.gmf.internal.common.codegen.TextMerger;
import org.eclipse.gmf.internal.xpand.BufferOutput;
import org.eclipse.gmf.internal.xpand.ResourceManager;
import org.eclipse.gmf.internal.xpand.XpandFacade;
import org.eclipse.gmf.internal.xpand.expression.Variable;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContext;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContextImpl;
import org.eclipse.gmf.internal.xpand.util.BundleResourceManager;
import org.eclipse.gmf.internal.xpand.util.ContextFactory;

import org.eclipse.gmf.codegen.templates.editor.SheetLabelProviderGenerator;
import org.eclipse.gmf.codegen.templates.lite.commands.CreateLinkCompleteCommandGenerator;
import org.eclipse.gmf.codegen.templates.lite.commands.CreateLinkStartCommandGenerator;
import org.eclipse.gmf.codegen.templates.lite.commands.CreateNodeCommandGenerator;
import org.eclipse.gmf.codegen.templates.lite.commands.ReconnectLinkSourceCommandGenerator;
import org.eclipse.gmf.codegen.templates.lite.commands.ReconnectLinkTargetCommandGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.ActionBarContributorGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.BuildPropertiesGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.CreationWizardGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.CreationWizardPageGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.DiagramEditorUtilGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.EditorGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.InitDiagramFileActionGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.ManifestGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.NewDiagramFileWizardGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.OpenDiagramFileInViewGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.PaletteFactoryGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.PluginGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.PluginPropertiesGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.PluginXML;
import org.eclipse.gmf.codegen.templates.lite.editor.VisualIDRegistryGenerator;
import org.eclipse.gmf.codegen.templates.lite.expressions.AbstractExpressionGenerator;
import org.eclipse.gmf.codegen.templates.lite.expressions.OCLExpressionFactoryGenerator;
import org.eclipse.gmf.codegen.templates.lite.expressions.RegexpExpressionFactoryGenerator;
import org.eclipse.gmf.codegen.templates.lite.navigator.NavigatorActionProviderGenerator;
import org.eclipse.gmf.codegen.templates.lite.navigator.NavigatorContentProviderGenerator;
import org.eclipse.gmf.codegen.templates.lite.navigator.NavigatorLabelProviderGenerator;
import org.eclipse.gmf.codegen.templates.lite.navigator.NavigatorLinkHelperGenerator;
import org.eclipse.gmf.codegen.templates.lite.parts.ChildNodeEditPartGenerator;
import org.eclipse.gmf.codegen.templates.lite.parts.CompartmentEditPartGenerator;
import org.eclipse.gmf.codegen.templates.lite.parts.DiagramEditPartGenerator;
import org.eclipse.gmf.codegen.templates.lite.parts.DiagramExternalNodeLabelEditPartGenerator;
import org.eclipse.gmf.codegen.templates.lite.parts.EditPartFactoryGenerator;
import org.eclipse.gmf.codegen.templates.lite.parts.LinkEditPartGenerator;
import org.eclipse.gmf.codegen.templates.lite.parts.LinkLabelEditPartGenerator;
import org.eclipse.gmf.codegen.templates.lite.parts.NodeEditPartGenerator;
import org.eclipse.gmf.codegen.templates.lite.parts.NodeLabelEditPartGenerator;
import org.eclipse.gmf.codegen.templates.lite.policies.OpenDiagramPolicyGenerator;
import org.eclipse.gmf.codegen.templates.lite.providers.CompartmentViewFactoryGenerator;
import org.eclipse.gmf.codegen.templates.lite.providers.DiagramViewFactoryGenerator;
import org.eclipse.gmf.codegen.templates.lite.providers.DomainElementInitializerGenerator;
import org.eclipse.gmf.codegen.templates.lite.providers.LabelViewFactoryGenerator;
import org.eclipse.gmf.codegen.templates.lite.providers.LinkViewFactoryGenerator;
import org.eclipse.gmf.codegen.templates.lite.providers.NodeViewFactoryGenerator;
import org.eclipse.gmf.codegen.templates.navigator.NavigatorGroupGenerator;
import org.eclipse.gmf.codegen.templates.navigator.NavigatorItemGenerator;
import org.eclipse.gmf.codegen.templates.navigator.NavigatorSorterGenerator;
import org.osgi.framework.Bundle;

/**
 * Provides JET templates.
 * FIXME Merge with {@link org.eclipse.gmf.codegen.util.CodegenEmitters}
 * 
 * @author artem
 */
public class CodegenEmitters {
	private static final String CODEGEN_PLUGIN_ID = "org.eclipse.gmf.codegen";	//$NON-NLS-1$

	private final EmitterFactory myFactory;

	private final String[] myTemplatePath;

	private static StaticTemplateRegistry myRegistry;

	private ResourceManager myResourceManager;
	public CodegenEmitters(boolean usePrecompiled, String templateDirectory) {
		myRegistry = initRegistry();
		String[] variables = new String[] { "org.eclipse.emf.codegen", "org.eclipse.emf.codegen.ecore", "org.eclipse.emf.common", "org.eclipse.emf.ecore", "org.eclipse.gmf.common",
				"org.eclipse.gmf.codegen" };
		URL liteTemplatesPath = getTemplatesBundle().getEntry("/templates/");
		URL runtimeTemplatesPath = Platform.getBundle(CODEGEN_PLUGIN_ID).getEntry("/templates/");
		myTemplatePath = new String[] {
				usePrecompiled ? null : templateDirectory != null && templateDirectory.indexOf(":") == -1 ? URI.createPlatformResourceURI(templateDirectory, true).toString() : templateDirectory,
				liteTemplatesPath.toString(), runtimeTemplatesPath.toString() };
		myFactory = new CachingEmitterFactory(new EmitterFactoryImpl(getTemplatePath(), myRegistry, usePrecompiled, variables));

		myResourceManager = new BundleResourceManager(liteTemplatesPath, runtimeTemplatesPath);
	}

	public TextMerger createMergeService() {
		URL controlFile = getJMergeControlFile();
		if (controlFile != null){
			JControlModel controlModel = new JControlModel();
			controlModel.initialize(CodeGenUtil.instantiateFacadeHelper(JMerger.DEFAULT_FACADE_HELPER_CLASS), controlFile.toString());
			if (!controlModel.canMerge()){
				throw new IllegalStateException("Can not initialize JControlModel");
			}
			return new DefaultTextMerger(controlModel);
		}
		return null;
	}

	private static StaticTemplateRegistry initRegistry() {
		final StaticTemplateRegistry tr = new StaticTemplateRegistry(CodegenEmitters.class.getClassLoader());
		put(tr, "/commands/CreateNodeCommand.javajet", CreateNodeCommandGenerator.class);
		put(tr, "/commands/CreateLinkStartCommand.javajet", CreateLinkStartCommandGenerator.class);
		put(tr, "/commands/CreateLinkCompleteCommand.javajet", CreateLinkCompleteCommandGenerator.class);
		put(tr, "/commands/ReconnectLinkSourceCommand.javajet", ReconnectLinkSourceCommandGenerator.class);
		put(tr, "/commands/ReconnectLinkTargetCommand.javajet", ReconnectLinkTargetCommandGenerator.class);

		put(tr, "/providers/CompartmentViewFactory.javajet", CompartmentViewFactoryGenerator.class);
		put(tr, "/providers/DiagramViewFactory.javajet", DiagramViewFactoryGenerator.class);
		put(tr, "/providers/LabelViewFactory.javajet", LabelViewFactoryGenerator.class);
		put(tr, "/providers/LinkViewFactory.javajet", LinkViewFactoryGenerator.class);
		put(tr, "/providers/NodeViewFactory.javajet", NodeViewFactoryGenerator.class);
		put(tr, "/parts/DiagramExternalNodeLabelEditPart.javajet", DiagramExternalNodeLabelEditPartGenerator.class);
		put(tr, "/parts/CompartmentEditPart.javajet", CompartmentEditPartGenerator.class);
		put(tr, "/editor/CreationWizard.javajet", CreationWizardGenerator.class);
		put(tr, "/editor/CreationWizardPage.javajet", CreationWizardPageGenerator.class);
		put(tr, "/editor/DiagramEditorUtil.javajet", DiagramEditorUtilGenerator.class);
		// put(tr, "/editor/MatchingStrategy.javajet",
		// MatchingStrategyGenerator.class);
		put(tr, "/editor/PaletteFactory.javajet", PaletteFactoryGenerator.class);
		put(tr, "/editor/VisualIDRegistry.javajet", VisualIDRegistryGenerator.class);
		put(tr, "/parts/DiagramEditPart.javajet", DiagramEditPartGenerator.class);
		put(tr, "/parts/EditPartFactory.javajet", EditPartFactoryGenerator.class);
		put(tr, "/providers/DomainElementInitializer.javajet", DomainElementInitializerGenerator.class);
		put(tr, "/editor/ActionBarContributor.javajet", ActionBarContributorGenerator.class);
		put(tr, "/editor/Editor.javajet", EditorGenerator.class);
		put(tr, "/editor/OpenDiagramInViewAction.javajet", OpenDiagramFileInViewGenerator.class);
		put(tr, "/parts/LinkEditPart.javajet", LinkEditPartGenerator.class);
		put(tr, "/parts/LinkLabelEditPart.javajet", LinkLabelEditPartGenerator.class);
		put(tr, "/parts/ChildNodeEditPart.javajet", ChildNodeEditPartGenerator.class);
		put(tr, "/parts/NodeEditPart.javajet", NodeEditPartGenerator.class);
		put(tr, "/parts/NodeLabelEditPart.javajet", NodeLabelEditPartGenerator.class);
		put(tr, "/editor/Plugin.javajet", PluginGenerator.class);
		// put(tr, "/editor/ModelCreationFactory.javajet", ModelCreationFactoryGenerator.class);
		put(tr, "/editor/manifest.mfjet", ManifestGenerator.class);
		put(tr, "/editor/build.propertiesjet", BuildPropertiesGenerator.class);
		put(tr, "/editor/InitDiagramFileAction.javajet", InitDiagramFileActionGenerator.class);
		put(tr, "/editor/NewDiagramFileWizard.javajet", NewDiagramFileWizardGenerator.class);
		put(tr, "/editor/plugin.xmljet", PluginXML.class);
		put(tr, "/editor/plugin.propertiesjet", PluginPropertiesGenerator.class);
		put(tr, "/expressions/AbstractExpression.javajet", AbstractExpressionGenerator.class);
		put(tr, "/expressions/OCLExpressionFactory.javajet", OCLExpressionFactoryGenerator.class);
		put(tr, "/expressions/RegexpExpressionFactory.javajet", RegexpExpressionFactoryGenerator.class);
		put(tr, "/policies/OpenDiagramEditPolicy.javajet", OpenDiagramPolicyGenerator.class);

		put(tr, "/navigator/NavigatorContentProvider.javajet", NavigatorContentProviderGenerator.class);
		put(tr, "/navigator/NavigatorLabelProvider.javajet", NavigatorLabelProviderGenerator.class);
		put(tr, "/navigator/NavigatorLinkHelper.javajet", NavigatorLinkHelperGenerator.class);
		put(tr, "/navigator/NavigatorSorter.javajet", NavigatorSorterGenerator.class);
		put(tr, "/navigator/NavigatorActionProvider.javajet", NavigatorActionProviderGenerator.class);
		put(tr, "/navigator/NavigatorGroup.javajet", NavigatorGroupGenerator.class);
		put(tr, "/navigator/NavigatorItem.javajet", NavigatorItemGenerator.class);

		put(tr, "/propsheet/SheetLabelProvider.javajet", SheetLabelProviderGenerator.class);

		return tr;
	}

	public TextEmitter getCreateNodeCommandEmitter() throws UnexpectedBehaviourException {
		return retrieve(CreateNodeCommandGenerator.class);
	}

	public TextEmitter getCreateLinkStartCommandEmitter() throws UnexpectedBehaviourException {
		return retrieve(CreateLinkStartCommandGenerator.class);
	}

	public TextEmitter getCreateLinkCompleteCommandEmitter() throws UnexpectedBehaviourException {
		return retrieve(CreateLinkCompleteCommandGenerator.class);
	}

	public TextEmitter getReconnectLinkSourceCommandEmitter() throws UnexpectedBehaviourException {
		return retrieve(ReconnectLinkSourceCommandGenerator.class);
	}

	public TextEmitter getReconnectLinkTargetCommandEmitter() throws UnexpectedBehaviourException {
		return retrieve(ReconnectLinkTargetCommandGenerator.class);
	}

	public TextEmitter getCompartmentViewFactoryGenerator() throws UnexpectedBehaviourException {
		return retrieve(CompartmentViewFactoryGenerator.class);
	}

	public TextEmitter getDiagramViewFactoryGenerator() throws UnexpectedBehaviourException {
		return retrieve(DiagramViewFactoryGenerator.class);
	}

	public TextEmitter getLabelViewFactoryGenerator() throws UnexpectedBehaviourException {
		return retrieve(LabelViewFactoryGenerator.class);
	}

	public TextEmitter getLinkViewFactoryGenerator() throws UnexpectedBehaviourException {
		return retrieve(LinkViewFactoryGenerator.class);
	}

	public TextEmitter getNodeViewFactoryGenerator() throws UnexpectedBehaviourException {
		return retrieve(NodeViewFactoryGenerator.class);
	}

	public TextEmitter getDomainElementInitializerGenerator() throws UnexpectedBehaviourException {
		return retrieve(DomainElementInitializerGenerator.class);
	}

	public TextEmitter getCompartmentEditPartGenerator() throws UnexpectedBehaviourException {
		return retrieve(CompartmentEditPartGenerator.class);
	}

	public TextEmitter getDiagramEditPartGenerator() throws UnexpectedBehaviourException {
		return retrieve(DiagramEditPartGenerator.class);
	}

	public TextEmitter getDiagramExternalNodeLabelEditPartEmitter() throws UnexpectedBehaviourException {
		return retrieve(DiagramExternalNodeLabelEditPartGenerator.class);
	}

	public TextEmitter getEditPartFactoryGenerator() throws UnexpectedBehaviourException {
		return retrieve(EditPartFactoryGenerator.class);
	}

	public TextEmitter getLinkEditPartGenerator() throws UnexpectedBehaviourException {
		return retrieve(LinkEditPartGenerator.class);
	}

	public TextEmitter getLinkLabelEditPartGenerator() throws UnexpectedBehaviourException {
		return retrieve(LinkLabelEditPartGenerator.class);
	}

	public TextEmitter getChildNodeEditPartGenerator() throws UnexpectedBehaviourException {
		return retrieve(ChildNodeEditPartGenerator.class);
	}

	public TextEmitter getNodeEditPartGenerator() throws UnexpectedBehaviourException {
		return retrieve(NodeEditPartGenerator.class);
	}

	public TextEmitter getNodeLabelEditPartGenerator() throws UnexpectedBehaviourException {
		return retrieve(NodeLabelEditPartGenerator.class);
	}

	public TextEmitter getPluginGenerator() throws UnexpectedBehaviourException {
		return retrieve(PluginGenerator.class);
	}

	public TextEmitter getActionBarContributorGenerator() throws UnexpectedBehaviourException {
		return retrieve(ActionBarContributorGenerator.class);
	}

	public TextEmitter getOpenDiagramInViewActionGenerator() throws UnexpectedBehaviourException {
		return retrieve(OpenDiagramFileInViewGenerator.class);
	}

	public TextEmitter getEditorGenerator() throws UnexpectedBehaviourException {
		return retrieve(EditorGenerator.class);
	}

	public TextEmitter getCreationWizardGenerator() throws UnexpectedBehaviourException {
		return retrieve(CreationWizardGenerator.class);
	}

	public TextEmitter getCreationWizardPageGenerator() throws UnexpectedBehaviourException {
		return retrieve(CreationWizardPageGenerator.class);
	}

	public TextEmitter getDiagramEditorUtilGenerator() throws UnexpectedBehaviourException {
		return retrieve(DiagramEditorUtilGenerator.class);
	}

	public TextEmitter getPaletteFactoryGenerator() throws UnexpectedBehaviourException {
		return retrieve(PaletteFactoryGenerator.class);
	}

	public TextEmitter getVisualIDRegistryGenerator() throws UnexpectedBehaviourException {
		return retrieve(VisualIDRegistryGenerator.class);
	}

	public TextEmitter getManifestGenerator() throws UnexpectedBehaviourException {
		return retrieve(ManifestGenerator.class);
	}

	public TextEmitter getBuildPropertiesGenerator() throws UnexpectedBehaviourException {
		return retrieve(BuildPropertiesGenerator.class);
	}

	public TextEmitter getPluginXML() throws UnexpectedBehaviourException {
		return retrieve(PluginXML.class);
	}

	public TextEmitter getInitDiagramFileActionGenerator() throws UnexpectedBehaviourException {
		return retrieve(InitDiagramFileActionGenerator.class);
	}

	public TextEmitter getNewDiagramFileWizardGenerator() throws UnexpectedBehaviourException {
		return retrieve(NewDiagramFileWizardGenerator.class);
	}

	public TextEmitter getPluginPropertiesGenerator() throws UnexpectedBehaviourException {
		return retrieve(PluginPropertiesGenerator.class);
	}

	public TextEmitter getAbstractExpressionEmitter() throws UnexpectedBehaviourException {
		return retrieve(AbstractExpressionGenerator.class);
	}
	
	public TextEmitter getOCLExpressionFactoryEmitter() throws UnexpectedBehaviourException {
		return retrieve(OCLExpressionFactoryGenerator.class);
	}	
	
	public TextEmitter getRegexpExpressionFactoryEmitter() throws UnexpectedBehaviourException {
		return retrieve(RegexpExpressionFactoryGenerator.class);
	}

	public TextEmitter getOpenDiagramEditPolicyEmitter() throws UnexpectedBehaviourException {
		return retrieve(OpenDiagramPolicyGenerator.class);
	}

	public BinaryEmitter getDiagramIconEmitter() throws UnexpectedBehaviourException {
		return newGIFEmitterAdapter("/editor/diagram.gif"); //$NON-NLS-1$
	}

	public BinaryEmitter getWizardBannerImageEmitter() throws UnexpectedBehaviourException {
		return newGIFEmitterAdapter("/editor/wizban.gif"); //$NON-NLS-1$
	}

	/**
	 * @see #retrieve(Class)
	 */
	private static void put(StaticTemplateRegistry tr, String path, Class<?> precompiledTemplate) {
		tr.put(precompiledTemplate, path, precompiledTemplate);
	}

	/**
	 * depends on {@link #put(StaticTemplateRegistry, String, Class) } impl -
	 * class object of precompiled template serves as a key
	 */
	private TextEmitter retrieve(Class<?> key) throws UnexpectedBehaviourException {
		try {
			return new JETEmitterAdapter(myFactory.acquireEmitter(key));
		} catch (NoSuchTemplateException ex) {
			throw new UnexpectedBehaviourException(ex.getMessage(), ex);
		}
	}

	private BinaryEmitter newGIFEmitter(String relativePath) throws UnexpectedBehaviourException {
		return new GIFEmitter(checkTemplateLocation(relativePath));
	}

	private BinaryEmitter newGIFEmitterAdapter(String relativePath) throws UnexpectedBehaviourException {
		return new JETGIFEmitterAdapter(new org.eclipse.emf.codegen.util.GIFEmitter(checkTemplateLocation(relativePath)));
	}

	private String checkTemplateLocation(String relativePath) throws UnexpectedBehaviourException {
		String templateLocation = JETCompiler.find(getTemplatePath(), relativePath);
		if (templateLocation == null) {
			throw new UnexpectedBehaviourException("Template " + relativePath +" not found");
		}
		return templateLocation;
	}

	private String[] getTemplatePath() {
		return myTemplatePath;
	}

	private static Bundle getTemplatesBundle() {
		return Activator.getDefault();
	}

	public URL getJMergeControlFile() {
		return getTemplatesBundle().getEntry("/templates/emf-merge.xml");
	}

	public GIFEmitter getShortcutImageEmitter() throws JETException {
		String templateLocation = JETCompiler.find(getTemplatePath(), "/editor/shortcut.gif");
		if (templateLocation == null) {
			throw new JETException("shortcut image template not found");
		}
		return new GIFEmitter(templateLocation);
	}

	public TextEmitter getNavigatorContentProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(NavigatorContentProviderGenerator.class);
	}

	public TextEmitter getNavigatorLabelProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(NavigatorLabelProviderGenerator.class);
	}
	
	public TextEmitter getNavigatorLinkHelperEmitter() throws UnexpectedBehaviourException {
		return retrieve(NavigatorLinkHelperGenerator.class);
	}
	
	public TextEmitter getNavigatorSorterEmitter() throws UnexpectedBehaviourException {
		return retrieve(NavigatorSorterGenerator.class);
	}
	
	public TextEmitter getNavigatorActionProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(NavigatorActionProviderGenerator.class);
	}
	
	public TextEmitter getAbstractNavigatorItemEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::navigator::AbstractNavigatorItem::AbstractNavigatorItem");
	}
	
	public TextEmitter getNavigatorGroupEmitter() throws UnexpectedBehaviourException {
		return retrieve(NavigatorGroupGenerator.class);
	}

	public TextEmitter getNavigatorItemEmitter() throws UnexpectedBehaviourException {
		return retrieve(NavigatorItemGenerator.class);
	}

	public BinaryEmitter getGroupIconEmitter() throws UnexpectedBehaviourException {
		return newGIFEmitter("/navigator/navigatorGroup.gif"); //$NON-NLS-1$
	}

	public TextEmitter getPropertySheetLabelProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(SheetLabelProviderGenerator.class);
	}

	public TextEmitter getPropertySectionEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::propsheet::PropertySection::PropertySection");
	}

	private TextEmitter retrieveXpand(String templateFQN) {
		TextEmitter result = myCachedXpandEmitters.get(templateFQN);
		if (result == null) {
			result = new XpandTextEmitter(myResourceManager, templateFQN);
			myCachedXpandEmitters.put(templateFQN, result);
		}
		return result;
	}

	private HashMap<String, TextEmitter> myCachedXpandEmitters = new HashMap<String, TextEmitter>();
	/*
	 * TODO: use same emitter as one in oeg.codegen? Or at least make them both subclasses of the same abstract superclass
	 * (to have possibility to use independent ways to extract the target and the arguments from the passed arguments).
	 */
	private static class XpandTextEmitter implements TextEmitter {
		private final ResourceManager myResourceManager;
		private final String myTemplateFQN;

		public XpandTextEmitter(ResourceManager manager, String templateFQN) {
			myResourceManager = manager;
			myTemplateFQN = templateFQN;
		}

		public String generate(IProgressMonitor monitor, Object[] arguments) throws InterruptedException, InvocationTargetException, UnexpectedBehaviourException {
			StringBuilder result = new StringBuilder();
			new XpandFacade(createContext(result)).evaluate(myTemplateFQN, extractTarget(arguments), extractArguments(arguments));
			return result.toString();
		}

		protected Object extractTarget(Object[] arguments) {
			assert arguments != null && arguments.length > 0;
			return arguments[0];
		}

		protected Object[] extractArguments(Object[] arguments) {
			assert arguments != null && arguments.length > 0;
			ArrayList<Object> res = new ArrayList<Object>(arguments.length);
			// strip first one off, assume it's target
			for (int i = 1; i < arguments.length; i++) {
				if (false == arguments[i] instanceof ImportAssistant) {
					// strip assistant off
					res.add(arguments[i]);
				}
			}
			return res.toArray();
		}

		private XpandExecutionContext createContext(StringBuilder result) {
			final BufferOutput output = new BufferOutput(result);
			final List<Variable> globals = Collections.emptyList();
			final XpandExecutionContext xpandContext = ContextFactory.createXpandContext(myResourceManager, output, globals);
			((XpandExecutionContextImpl) xpandContext).setContextClassLoader(getClass().getClassLoader());
			return xpandContext;
		}
	}
}