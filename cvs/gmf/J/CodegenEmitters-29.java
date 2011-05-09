/*
 * Copyright (c) 2005, 2007 Borland Software Corporation
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

import java.net.URL;
import java.util.HashMap;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.jet.JETCompiler;
import org.eclipse.emf.codegen.jet.JETException;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.codegen.templates.lite.editor.ActionBarContributorGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.BuildPropertiesGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.CreationWizardGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.CreationWizardPageGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.DiagramEditorUtilGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.InitDiagramFileActionGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.ManifestGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.NewDiagramFileWizardGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.OpenDiagramFileInViewGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.PaletteFactoryGenerator;
import org.eclipse.gmf.codegen.templates.lite.editor.VisualIDRegistryGenerator;
import org.eclipse.gmf.codegen.templates.lite.expressions.AbstractExpressionGenerator;
import org.eclipse.gmf.codegen.templates.lite.expressions.OCLExpressionFactoryGenerator;
import org.eclipse.gmf.codegen.templates.lite.expressions.RegexpExpressionFactoryGenerator;
import org.eclipse.gmf.codegen.templates.lite.navigator.NavigatorActionProviderGenerator;
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
import org.eclipse.gmf.codegen.templates.lite.providers.DomainElementInitializerGenerator;
import org.eclipse.gmf.codegen.templates.lite.providers.MetricProviderGenerator;
import org.eclipse.gmf.codegen.templates.lite.providers.ValidationProviderGenerator;
import org.eclipse.gmf.codegen.templates.navigator.NavigatorGroupGenerator;
import org.eclipse.gmf.codegen.templates.navigator.NavigatorItemGenerator;
import org.eclipse.gmf.codegen.templates.navigator.NavigatorSorterGenerator;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
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
import org.eclipse.gmf.internal.common.codegen.XpandTextEmitter;
import org.eclipse.gmf.internal.xpand.ResourceManager;
import org.eclipse.gmf.internal.xpand.util.BundleResourceManager;
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

		put(tr, "/providers/ValidationProvider.javajet", ValidationProviderGenerator.class);
		put(tr, "/providers/MetricProvider.javajet", MetricProviderGenerator.class); //$NON-NLS-1$		
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
		put(tr, "/editor/OpenDiagramInViewAction.javajet", OpenDiagramFileInViewGenerator.class);
		put(tr, "/parts/LinkEditPart.javajet", LinkEditPartGenerator.class);
		put(tr, "/parts/LinkLabelEditPart.javajet", LinkLabelEditPartGenerator.class);
		put(tr, "/parts/ChildNodeEditPart.javajet", ChildNodeEditPartGenerator.class);
		put(tr, "/parts/NodeEditPart.javajet", NodeEditPartGenerator.class);
		put(tr, "/parts/NodeLabelEditPart.javajet", NodeLabelEditPartGenerator.class);
		// put(tr, "/editor/ModelCreationFactory.javajet", ModelCreationFactoryGenerator.class);
		put(tr, "/editor/manifest.mfjet", ManifestGenerator.class);
		put(tr, "/editor/build.propertiesjet", BuildPropertiesGenerator.class);
		put(tr, "/editor/InitDiagramFileAction.javajet", InitDiagramFileActionGenerator.class);
		put(tr, "/editor/NewDiagramFileWizard.javajet", NewDiagramFileWizardGenerator.class);
		put(tr, "/expressions/AbstractExpression.javajet", AbstractExpressionGenerator.class);
		put(tr, "/expressions/OCLExpressionFactory.javajet", OCLExpressionFactoryGenerator.class);
		put(tr, "/expressions/RegexpExpressionFactory.javajet", RegexpExpressionFactoryGenerator.class);
		put(tr, "/policies/OpenDiagramEditPolicy.javajet", OpenDiagramPolicyGenerator.class);

		put(tr, "/navigator/NavigatorLabelProvider.javajet", NavigatorLabelProviderGenerator.class);
		put(tr, "/navigator/NavigatorLinkHelper.javajet", NavigatorLinkHelperGenerator.class);
		put(tr, "/navigator/NavigatorSorter.javajet", NavigatorSorterGenerator.class);
		put(tr, "/navigator/NavigatorActionProvider.javajet", NavigatorActionProviderGenerator.class);
		put(tr, "/navigator/NavigatorGroup.javajet", NavigatorGroupGenerator.class);
		put(tr, "/navigator/NavigatorItem.javajet", NavigatorItemGenerator.class);

		return tr;
	}

	public TextEmitter getCreateNodeCommandEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::commands::CreateNodeCommand::CreateNodeCommand");	//$NON-NLS-1$
	}

	public TextEmitter getCreateLinkStartCommandEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::commands::CreateLinkStartCommand::CreateLinkStartCommand");	//$NON-NLS-1$
	}

	public TextEmitter getCreateLinkCompleteCommandEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::commands::CreateLinkCompleteCommand::CreateLinkCompleteCommand");	//$NON-NLS-1$
	}

	public TextEmitter getReconnectLinkSourceCommandEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::commands::ReconnectLinkSourceCommand::ReconnectLinkSourceCommand");	//$NON-NLS-1$
	}

	public TextEmitter getReconnectLinkTargetCommandEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::commands::ReconnectLinkTargetCommand::ReconnectLinkTargetCommand");	//$NON-NLS-1$
	}

	public TextEmitter getViewFactoryGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::viewfactories::ViewFactory::ViewFactory");	//$NON-NLS-1$
	}

	public TextEmitter getValidationProviderGenerator() throws UnexpectedBehaviourException {
		return retrieve(ValidationProviderGenerator.class);
	}

	public TextEmitter getMetricProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(MetricProviderGenerator.class);
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
		return retrieveXpand("xpt::editor::Plugin::Plugin");	//$NON-NLS-1$
	}

	public TextEmitter getActionBarContributorGenerator() throws UnexpectedBehaviourException {
		return retrieve(ActionBarContributorGenerator.class);
	}

	public TextEmitter getOpenDiagramInViewActionGenerator() throws UnexpectedBehaviourException {
		return retrieve(OpenDiagramFileInViewGenerator.class);
	}

	public TextEmitter getEditorGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::editor::Editor::Editor");
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
		return retrieveXpand("xpt::plugin::plugin");	//$NON-NLS-1$
	}

	public TextEmitter getInitDiagramFileActionGenerator() throws UnexpectedBehaviourException {
		return retrieve(InitDiagramFileActionGenerator.class);
	}

	public TextEmitter getNewDiagramFileWizardGenerator() throws UnexpectedBehaviourException {
		return retrieve(NewDiagramFileWizardGenerator.class);
	}

	public TextEmitter getLoadResourceActionGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::editor::LoadResourceAction::LoadResourceAction");	//$NON-NLS-1$
	}

	public TextEmitter getPluginPropertiesGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::properties::properties");	//$NON-NLS-1$
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
		return retrieveXpand("xpt::navigator::NavigatorContentProvider::NavigatorContentProvider");	//$NON-NLS-1$
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
		return retrieveXpand("xpt::propsheet::SheetLabelProvider::SheetLabelProvider");	//$NON-NLS-1$
	}

	public TextEmitter getPropertySectionEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::propsheet::PropertySection::PropertySection");
	}

	public TextEmitter getApplicationEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::application::Application::Application"); //$NON-NLS-1$
	}

	public TextEmitter getActionBarAdvisorEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::application::ActionBarAdvisor::ActionBarAdvisor"); //$NON-NLS-1$
	}

	public TextEmitter getPerspectiveEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::application::Perspective::Perspective"); //$NON-NLS-1$
	}

	public TextEmitter getWorkbenchAdvisorEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::application::WorkbenchAdvisor::WorkbenchAdvisor"); //$NON-NLS-1$
	}

	public TextEmitter getWorkbenchWindowAdvisorEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::application::WorkbenchWindowAdvisor::WorkbenchWindowAdvisor"); //$NON-NLS-1$
	}

	public TextEmitter getMarkerNavigationProviderEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::providers::MarkerNavigationProvider::MarkerNavigationProvider");	//$NON-NLS-1$
	}

    public TextEmitter getExternalizeEmitter() {
        return retrieveXpand("xpt::Externalizer::Access"); //$NON-NLS-1$
    }

    public TextEmitter getMessagesEmitter() {
        return retrieveXpand("xpt::Externalizer::Values"); //$NON-NLS-1$
    }

	private TextEmitter retrieveXpand(String templateFQN) {
		TextEmitter result = myCachedXpandEmitters.get(templateFQN);
		if (result == null) {
			result = new XpandTextEmitter(myResourceManager, templateFQN, getClass().getClassLoader());
			myCachedXpandEmitters.put(templateFQN, result);
		}
		return result;
	}

	private HashMap<String, TextEmitter> myCachedXpandEmitters = new HashMap<String, TextEmitter>();
}
