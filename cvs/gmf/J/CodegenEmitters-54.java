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
package org.eclipse.gmf.codegen.util;

import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.jet.JETCompiler;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.codegen.templates.application.ActionBarAdvisorGenerator;
import org.eclipse.gmf.codegen.templates.application.ApplicationGenerator;
import org.eclipse.gmf.codegen.templates.application.PerspectiveGenerator;
import org.eclipse.gmf.codegen.templates.application.URIDiagramDocumentProviderGenerator;
import org.eclipse.gmf.codegen.templates.application.URIEditorInputProxyGenerator;
import org.eclipse.gmf.codegen.templates.application.WizardNewFileCreationPageGenerator;
import org.eclipse.gmf.codegen.templates.application.WorkbenchAdvisorGenerator;
import org.eclipse.gmf.codegen.templates.application.WorkbenchWindowAdvisorGenerator;
import org.eclipse.gmf.codegen.templates.commands.CreateShortcutDecorationsCommand;
import org.eclipse.gmf.codegen.templates.commands.ReorientConnectionViewCommandGenerator;
import org.eclipse.gmf.codegen.templates.editor.ActionBarContributorGenerator;
import org.eclipse.gmf.codegen.templates.editor.BuildPropertiesGenerator;
import org.eclipse.gmf.codegen.templates.editor.CreateShortcutActionGenerator;
import org.eclipse.gmf.codegen.templates.editor.CreationWizardGenerator;
import org.eclipse.gmf.codegen.templates.editor.CreationWizardPageGenerator;
import org.eclipse.gmf.codegen.templates.editor.DiagramEditorUtilGenerator;
import org.eclipse.gmf.codegen.templates.editor.DocumentProviderGenerator;
import org.eclipse.gmf.codegen.templates.editor.EditorGenerator;
import org.eclipse.gmf.codegen.templates.editor.ElementChooserGenerator;
import org.eclipse.gmf.codegen.templates.editor.InitDiagramFileActionGenerator;
import org.eclipse.gmf.codegen.templates.editor.LoadResourceActionGenerator;
import org.eclipse.gmf.codegen.templates.editor.ManifestGenerator;
import org.eclipse.gmf.codegen.templates.editor.MatchingStrategyGenerator;
import org.eclipse.gmf.codegen.templates.editor.NewDiagramFileWizardGenerator;
import org.eclipse.gmf.codegen.templates.editor.OptionsFileGenerator;
import org.eclipse.gmf.codegen.templates.editor.PaletteFactoryGenerator;
import org.eclipse.gmf.codegen.templates.editor.PluginGenerator;
import org.eclipse.gmf.codegen.templates.editor.PluginPropertiesGenerator;
import org.eclipse.gmf.codegen.templates.editor.PluginXML;
import org.eclipse.gmf.codegen.templates.editor.PreferencesInitializerGenerator;
import org.eclipse.gmf.codegen.templates.editor.PropertySectionGenerator;
import org.eclipse.gmf.codegen.templates.editor.SheetLabelProviderGenerator;
import org.eclipse.gmf.codegen.templates.editor.VisualIDRegistryGenerator;
import org.eclipse.gmf.codegen.templates.expressions.AbstractExpressionGenerator;
import org.eclipse.gmf.codegen.templates.expressions.OCLExpressionFactoryGenerator;
import org.eclipse.gmf.codegen.templates.expressions.RegexpExpressionFactoryGenerator;
import org.eclipse.gmf.codegen.templates.helpers.BaseEditHelperGenerator;
import org.eclipse.gmf.codegen.templates.helpers.EditHelperAdviceGenerator;
import org.eclipse.gmf.codegen.templates.helpers.EditHelperGenerator;
import org.eclipse.gmf.codegen.templates.navigator.AbstractNavigatorItemGenerator;
import org.eclipse.gmf.codegen.templates.navigator.NavigatorActionProviderGenerator;
import org.eclipse.gmf.codegen.templates.navigator.NavigatorContentProviderGenerator;
import org.eclipse.gmf.codegen.templates.navigator.NavigatorGroupGenerator;
import org.eclipse.gmf.codegen.templates.navigator.NavigatorItemGenerator;
import org.eclipse.gmf.codegen.templates.navigator.NavigatorLabelProviderGenerator;
import org.eclipse.gmf.codegen.templates.navigator.NavigatorLinkHelperGenerator;
import org.eclipse.gmf.codegen.templates.navigator.NavigatorSorterGenerator;
import org.eclipse.gmf.codegen.templates.parts.ChildNodeEditPartGenerator;
import org.eclipse.gmf.codegen.templates.parts.CompartmentEditPartGenerator;
import org.eclipse.gmf.codegen.templates.parts.DiagramEditPartGenerator;
import org.eclipse.gmf.codegen.templates.parts.DiagramExternalNodeLabelEditPartGenerator;
import org.eclipse.gmf.codegen.templates.parts.EditPartFactoryGenerator;
import org.eclipse.gmf.codegen.templates.parts.ExternalNodeLabelEditPartGenerator;
import org.eclipse.gmf.codegen.templates.parts.LinkEditPartGenerator;
import org.eclipse.gmf.codegen.templates.parts.LinkLabelEditPartGenerator;
import org.eclipse.gmf.codegen.templates.parts.NodeEditPartGenerator;
import org.eclipse.gmf.codegen.templates.parts.NodeLabelEditPartGenerator;
import org.eclipse.gmf.codegen.templates.policies.ChildContainerCanonicalEditPolicyGenerator;
import org.eclipse.gmf.codegen.templates.policies.CompartmentItemSemanticEditPolicyGenerator;
import org.eclipse.gmf.codegen.templates.policies.DiagramCanonicalEditPolicyGenerator;
import org.eclipse.gmf.codegen.templates.policies.DiagramItemSemanticEditPolicyGenerator;
import org.eclipse.gmf.codegen.templates.policies.ExternalNodeLabelHostLayoutEditPolicyGenerator;
import org.eclipse.gmf.codegen.templates.policies.GraphicalNodeEditPolicyGenerator;
import org.eclipse.gmf.codegen.templates.policies.ItemSemanticEditPolicyGenerator;
import org.eclipse.gmf.codegen.templates.policies.LinkItemSemanticEditPolicyGenerator;
import org.eclipse.gmf.codegen.templates.policies.NodeItemSemanticEditPolicyGenerator;
import org.eclipse.gmf.codegen.templates.policies.OpenDiagramPolicyGenerator;
import org.eclipse.gmf.codegen.templates.policies.TextNonResizableEditPolicyGenerator;
import org.eclipse.gmf.codegen.templates.policies.TextSelectionEditPolicyGenerator;
import org.eclipse.gmf.codegen.templates.providers.AbstractParserGenerator;
import org.eclipse.gmf.codegen.templates.providers.ContributionItemProviderGenerator;
import org.eclipse.gmf.codegen.templates.providers.EditPartProviderGenerator;
import org.eclipse.gmf.codegen.templates.providers.ElementTypesGenerator;
import org.eclipse.gmf.codegen.templates.providers.IconProviderGenerator;
import org.eclipse.gmf.codegen.templates.providers.LabelTextViewFactoryGenerator;
import org.eclipse.gmf.codegen.templates.providers.LabelViewFactoryGenerator;
import org.eclipse.gmf.codegen.templates.providers.MarkerNavigationProviderGenerator;
import org.eclipse.gmf.codegen.templates.providers.MetricProviderGenerator;
import org.eclipse.gmf.codegen.templates.providers.ModelingAssistantProviderGenerator;
import org.eclipse.gmf.codegen.templates.providers.ParserProviderGenerator;
import org.eclipse.gmf.codegen.templates.providers.ShortcutsDecoratorProviderGenerator;
import org.eclipse.gmf.codegen.templates.providers.ShortcutsPropertyTester;
import org.eclipse.gmf.codegen.templates.providers.StructuralFeatureParserGenerator;
import org.eclipse.gmf.codegen.templates.providers.StructuralFeaturesParserGenerator;
import org.eclipse.gmf.codegen.templates.providers.ValidationDecoratorProviderGenerator;
import org.eclipse.gmf.codegen.templates.providers.ValidationProviderGenerator;
import org.eclipse.gmf.codegen.templates.providers.ViewFactoryGenerator;
import org.eclipse.gmf.codegen.templates.providers.ViewProviderGenerator;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.gmf.internal.codegen.dispatch.CachingEmitterFactory;
import org.eclipse.gmf.internal.codegen.dispatch.EmitterFactory;
import org.eclipse.gmf.internal.codegen.dispatch.EmitterFactoryImpl;
import org.eclipse.gmf.internal.codegen.dispatch.NoSuchTemplateException;
import org.eclipse.gmf.internal.codegen.dispatch.StaticTemplateRegistry;
import org.eclipse.gmf.internal.codegen.dispatch.TemplateRegistry;
import org.eclipse.gmf.internal.common.codegen.BinaryEmitter;
import org.eclipse.gmf.internal.common.codegen.DefaultTextMerger;
import org.eclipse.gmf.internal.common.codegen.GIFEmitter;
import org.eclipse.gmf.internal.common.codegen.JETEmitterAdapter;
import org.eclipse.gmf.internal.common.codegen.JETGIFEmitterAdapter;
import org.eclipse.gmf.internal.common.codegen.TextEmitter;
import org.eclipse.gmf.internal.common.codegen.TextMerger;
import org.osgi.framework.Bundle;

/**
 * Provides JET templates.
 * 
 * @author artem
 */
public class CodegenEmitters {

	private static final String TEMPLATES_PLUGIN_ID = "org.eclipse.gmf.codegen"; //$NON-NLS-1$
	private final EmitterFactory myFactory;
	private final String[] myTemplatePath;

	public CodegenEmitters(boolean usePrecompiled, String templateDirectory) {
		TemplateRegistry registry = initRegistry();
		String[] variables = new String[] {
		        "org.eclipse.emf.codegen", //$NON-NLS-1$
				"org.eclipse.emf.codegen.ecore", //$NON-NLS-1$
				"org.eclipse.emf.common", //$NON-NLS-1$
				"org.eclipse.emf.ecore", //$NON-NLS-1$
				"org.eclipse.gmf.common", //$NON-NLS-1$
				"org.eclipse.gmf.codegen" //$NON-NLS-1$
		};
		myTemplatePath = new String[] {
				usePrecompiled ? null : templateDirectory != null && templateDirectory.indexOf(":") == -1 ? //$NON-NLS-1$
						URI.createPlatformResourceURI(templateDirectory, true).toString() : templateDirectory,
				getTemplatesBundle().getEntry("/templates/").toString() //$NON-NLS-1$
		};
		// actually, that's new JETEmitterFactory with JETTemplateRegistry
		myFactory = new CachingEmitterFactory(new EmitterFactoryImpl(getTemplatePath(), registry, usePrecompiled, variables));
	}

	/**
	 * @return null if no merger is needed
	 */
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

	private static TemplateRegistry initRegistry() {
		final StaticTemplateRegistry tr = new StaticTemplateRegistry(CodegenEmitters.class.getClassLoader());
		put(tr, "/commands/ReorientConnectionViewCommand.javajet", ReorientConnectionViewCommandGenerator.class);
		put(tr, "/helpers/BaseEditHelper.javajet", BaseEditHelperGenerator.class);
		put(tr, "/helpers/EditHelper.javajet", EditHelperGenerator.class);
		put(tr, "/helpers/EditHelperAdvice.javajet", EditHelperAdviceGenerator.class);
		put(tr, "/parts/DiagramEditPart.javajet", DiagramEditPartGenerator.class);
		put(tr, "/parts/DiagramExternalNodeLabelEditPart.javajet", DiagramExternalNodeLabelEditPartGenerator.class);
		put(tr, "/parts/NodeEditPart.javajet", NodeEditPartGenerator.class);
		put(tr, "/parts/NodeLabelEditPart.javajet", NodeLabelEditPartGenerator.class);
		put(tr, "/parts/ExternalNodeLabelEditPart.javajet", ExternalNodeLabelEditPartGenerator.class);
		put(tr, "/parts/ChildNodeEditPart.javajet", ChildNodeEditPartGenerator.class);
		put(tr, "/parts/CompartmentEditPart.javajet", CompartmentEditPartGenerator.class);
		put(tr, "/parts/LinkEditPart.javajet", LinkEditPartGenerator.class);
		put(tr, "/parts/LinkLabelEditPart.javajet", LinkLabelEditPartGenerator.class);
		put(tr, "/parts/EditPartFactory.javajet", EditPartFactoryGenerator.class);
		put(tr, "/policies/ItemSemanticEditPolicy.javajet", ItemSemanticEditPolicyGenerator.class);
		put(tr, "/policies/GraphicalNodeEditPolicy.javajet", GraphicalNodeEditPolicyGenerator.class);
		put(tr, "/policies/OpenDiagram.javajet", OpenDiagramPolicyGenerator.class);
		put(tr, "/policies/DiagramCanonicalEditPolicy.javajet", DiagramCanonicalEditPolicyGenerator.class);
		put(tr, "/policies/ChildContainerCanonicalEditPolicy.javajet", ChildContainerCanonicalEditPolicyGenerator.class);
		put(tr, "/policies/DiagramItemSemanticEditPolicy.javajet", DiagramItemSemanticEditPolicyGenerator.class);
		put(tr, "/policies/CompartmentItemSemanticEditPolicy.javajet", CompartmentItemSemanticEditPolicyGenerator.class);
		put(tr, "/policies/NodeItemSemanticEditPolicy.javajet", NodeItemSemanticEditPolicyGenerator.class);
		put(tr, "/policies/LinkItemSemanticEditPolicy.javajet", LinkItemSemanticEditPolicyGenerator.class);
		put(tr, "/policies/TextSelectionEditPolicy.javajet", TextSelectionEditPolicyGenerator.class);
		put(tr, "/policies/TextNonResizableEditPolicy.javajet", TextNonResizableEditPolicyGenerator.class);
		put(tr, "/policies/ExternalNodeLabelHostLayoutEditPolicy.javajet", ExternalNodeLabelHostLayoutEditPolicyGenerator.class);
		put(tr, "/providers/AbstractParser.javajet", AbstractParserGenerator.class);
		put(tr, "/providers/StructuralFeatureParser.javajet", StructuralFeatureParserGenerator.class);
		put(tr, "/providers/StructuralFeaturesParser.javajet", StructuralFeaturesParserGenerator.class);
		put(tr, "/providers/ViewFactory.javajet", ViewFactoryGenerator.class);
		put(tr, "/providers/LabelViewFactory.javajet", LabelViewFactoryGenerator.class);
		put(tr, "/providers/LabelTextViewFactory.javajet", LabelTextViewFactoryGenerator.class);
		put(tr, "/providers/ElementTypes.javajet", ElementTypesGenerator.class);
		put(tr, "/providers/ViewProvider.javajet", ViewProviderGenerator.class);
		put(tr, "/providers/EditPartProvider.javajet", EditPartProviderGenerator.class);
		put(tr, "/providers/ContributionItemProvider.javajet", ContributionItemProviderGenerator.class);
		put(tr, "/providers/ModelingAssistantProvider.javajet", ModelingAssistantProviderGenerator.class);
		put(tr, "/providers/IconProvider.javajet", IconProviderGenerator.class);
		put(tr, "/providers/ParserProvider.javajet", ParserProviderGenerator.class);
		put(tr, "/providers/ValidationProvider.javajet", ValidationProviderGenerator.class); //$NON-NLS-1$
		put(tr, "/providers/ValidationDecoratorProvider.javajet", ValidationDecoratorProviderGenerator.class); //$NON-NLS-1$		
		put(tr, "/providers/ShortcutsDecoratorProvider.javajet", ShortcutsDecoratorProviderGenerator.class); //$NON-NLS-1$
		put(tr, "/editor/ShortcutPropertyTester.javajet", ShortcutsPropertyTester.class); //$NON-NLS-1$
		put(tr, "/providers/MetricProvider.javajet", MetricProviderGenerator.class); //$NON-NLS-1$		
		put(tr, "/providers/MarkerNavigationProvider.javajet", MarkerNavigationProviderGenerator.class); //$NON-NLS-1$
		put(tr, "/editor/InitDiagramFileAction.javajet", InitDiagramFileActionGenerator.class);
		put(tr, "/editor/NewDiagramFileWizard.javajet", NewDiagramFileWizardGenerator.class);
		put(tr, "/editor/PaletteFactory.javajet", PaletteFactoryGenerator.class);
		put(tr, "/editor/DiagramEditorUtil.javajet", DiagramEditorUtilGenerator.class);
		put(tr, "/editor/VisualIDRegistry.javajet", VisualIDRegistryGenerator.class);
		put(tr, "/editor/CreationWizard.javajet", CreationWizardGenerator.class);
		put(tr, "/editor/CreationWizardPage.javajet", CreationWizardPageGenerator.class);
		put(tr, "/editor/Editor.javajet", EditorGenerator.class);
		put(tr, "/editor/CreateShortcutAction.javajet", CreateShortcutActionGenerator.class);
		put(tr, "/commands/CreateShortcutDecorationsCommand.javajet", CreateShortcutDecorationsCommand.class);
		put(tr, "/editor/LoadResourceAction.javajet", LoadResourceActionGenerator.class);
		put(tr, "/editor/ElementChooser.javajet", ElementChooserGenerator.class);
		put(tr, "/editor/DocumentProvider.javajet", DocumentProviderGenerator.class);
		put(tr, "/editor/ActionBarContributor.javajet", ActionBarContributorGenerator.class);
		put(tr, "/editor/MatchingStrategy.javajet", MatchingStrategyGenerator.class);
		put(tr, "/editor/PreferenceInitializer.javajet", PreferencesInitializerGenerator.class);
		put(tr, "/navigator/NavigatorContentProvider.javajet", NavigatorContentProviderGenerator.class);
		put(tr, "/navigator/NavigatorLabelProvider.javajet", NavigatorLabelProviderGenerator.class);
		put(tr, "/navigator/NavigatorLinkHelper.javajet", NavigatorLinkHelperGenerator.class);
		put(tr, "/navigator/NavigatorSorter.javajet", NavigatorSorterGenerator.class);
		put(tr, "/navigator/NavigatorActionProvider.javajet", NavigatorActionProviderGenerator.class);
		put(tr, "/navigator/AbstractNavigatorItem.javajet", AbstractNavigatorItemGenerator.class);
		put(tr, "/navigator/NavigatorGroup.javajet", NavigatorGroupGenerator.class);
		put(tr, "/navigator/NavigatorItem.javajet", NavigatorItemGenerator.class);
		put(tr, "/editor/Plugin.javajet", PluginGenerator.class);
		put(tr, "/editor/plugin.xmljet", PluginXML.class);
		put(tr, "/editor/plugin.propertiesjet", PluginPropertiesGenerator.class);
		put(tr, "/editor/.optionsjet", OptionsFileGenerator.class);
		put(tr, "/editor/manifest.mfjet", ManifestGenerator.class);
		put(tr, "/editor/build.propertiesjet", BuildPropertiesGenerator.class);
		put(tr, "/propsheet/PropertySection.javajet", PropertySectionGenerator.class);
		put(tr, "/propsheet/SheetLabelProvider.javajet", SheetLabelProviderGenerator.class);
		put(tr, "/expressions/AbstractExpression.javajet", AbstractExpressionGenerator.class); //$NON-NLS-1$		
		put(tr, "/expressions/OCLExpressionFactory.javajet", OCLExpressionFactoryGenerator.class); //$NON-NLS-1$		
		put(tr, "/expressions/RegexpExpressionFactory.javajet", RegexpExpressionFactoryGenerator.class); //$NON-NLS-1$
		put(tr, "/application/ActionBarAdvisor.javajet", ActionBarAdvisorGenerator.class); //$NON-NLS-1$
		put(tr, "/application/Application.javajet", ApplicationGenerator.class); //$NON-NLS-1$
		put(tr, "/application/Perspective.javajet", PerspectiveGenerator.class); //$NON-NLS-1$
		put(tr, "/application/WorkbenchAdvisor.javajet", WorkbenchAdvisorGenerator.class); //$NON-NLS-1$
		put(tr, "/application/WorkbenchWindowAdvisor.javajet", WorkbenchWindowAdvisorGenerator.class); //$NON-NLS-1$
		put(tr, "/application/URIDiagramDocumentProvider.javajet", URIDiagramDocumentProviderGenerator.class); //$NON-NLS-1$
		put(tr, "/application/URIEditorInputProxy.javajet", URIEditorInputProxyGenerator.class); //$NON-NLS-1$
		put(tr, "/application/WizardNewFileCreationPage.javajet", WizardNewFileCreationPageGenerator.class); //$NON-NLS-1$
		return tr;
	}

	/**
	 * @see #retrieve(Class)
	 */
	private static void put(StaticTemplateRegistry tr, String path, Class precompiledTemplate) {
		tr.put(precompiledTemplate, path, precompiledTemplate);
	}

	/**
	 * depends on {@link #put(StaticTemplateRegistry, String, Class) } impl - class object of
	 * precompiled template serves as a key
	 */
	private TextEmitter retrieve(Class key) throws UnexpectedBehaviourException {
		try {
			return new JETEmitterAdapter(myFactory.acquireEmitter(key));
		} catch (NoSuchTemplateException ex) {
			throw new UnexpectedBehaviourException(ex.getMessage(), ex);
		}
	}

	private String[] getTemplatePath() {
		return myTemplatePath;
	}

	private static Bundle getTemplatesBundle() {
		return Platform.getBundle(TEMPLATES_PLUGIN_ID);
	}

	public URL getJMergeControlFile() {
		return getTemplatesBundle().getEntry("/templates/emf-merge.xml"); //$NON-NLS-1$
	}

	// commands

	public TextEmitter getReorientConnectionViewCommandEmitter() throws UnexpectedBehaviourException {
		return retrieve(ReorientConnectionViewCommandGenerator.class);
	}

	// helpers

	public TextEmitter getBaseEditHelperEmitter() throws UnexpectedBehaviourException {
		return retrieve(BaseEditHelperGenerator.class);
	}

	public TextEmitter getEditHelperEmitter() throws UnexpectedBehaviourException {
		return retrieve(EditHelperGenerator.class);
	}

	public TextEmitter getEditHelperAdviceEmitter() throws UnexpectedBehaviourException {
		return retrieve(EditHelperAdviceGenerator.class);
	}

	// parts

	public TextEmitter getDiagramEditPartEmitter() throws UnexpectedBehaviourException {
		return retrieve(DiagramEditPartGenerator.class);
	}

	public TextEmitter getDiagramExternalNodeLabelEditPartEmitter() throws UnexpectedBehaviourException {
		return retrieve(DiagramExternalNodeLabelEditPartGenerator.class);
	}

	public TextEmitter getNodeEditPartEmitter() throws UnexpectedBehaviourException {
		return retrieve(NodeEditPartGenerator.class);
	}

	public TextEmitter getNodeLabelEditPartEmitter() throws UnexpectedBehaviourException {
		return retrieve(NodeLabelEditPartGenerator.class);
	}

	public TextEmitter getExternalNodeLabelEditPartEmitter() throws UnexpectedBehaviourException {
		return retrieve(ExternalNodeLabelEditPartGenerator.class);
	}

	public TextEmitter getChildNodeEditPartEmitter() throws UnexpectedBehaviourException {
		return retrieve(ChildNodeEditPartGenerator.class);
	}

	public TextEmitter getCompartmentEditPartEmitter() throws UnexpectedBehaviourException {
		return retrieve(CompartmentEditPartGenerator.class);
	}
	
	public TextEmitter getLinkEditPartEmitter() throws UnexpectedBehaviourException {
		return retrieve(LinkEditPartGenerator.class);
	}

	public TextEmitter getLinkLabelEditPartEmitter() throws UnexpectedBehaviourException {
		return retrieve(LinkLabelEditPartGenerator.class);
	}

	public TextEmitter getEditPartFactoryEmitter() throws UnexpectedBehaviourException {
		return retrieve(EditPartFactoryGenerator.class);
	}
	
	// policies

	public TextEmitter getBaseItemSemanticEditPolicyEmitter() throws UnexpectedBehaviourException {
		return retrieve(ItemSemanticEditPolicyGenerator.class);
	}

	public TextEmitter getOpenDiagramEditPolicyEmitter() throws UnexpectedBehaviourException {
		return retrieve(OpenDiagramPolicyGenerator.class);
	}

	public TextEmitter getDiagramCanonicalEditPolicyEmitter() throws UnexpectedBehaviourException {
		return retrieve(DiagramCanonicalEditPolicyGenerator.class);
	}

	public TextEmitter getChildContainerCanonicalEditPolicyEmitter() throws UnexpectedBehaviourException {
		return retrieve(ChildContainerCanonicalEditPolicyGenerator.class);
	}

	public TextEmitter getDiagramItemSemanticEditPolicyEmitter() throws UnexpectedBehaviourException {
		return retrieve(DiagramItemSemanticEditPolicyGenerator.class);
	}

	public TextEmitter getCompartmentItemSemanticEditPolicyEmitter() throws UnexpectedBehaviourException {
		return retrieve(CompartmentItemSemanticEditPolicyGenerator.class);
	}

	public TextEmitter getGraphicalNodeEditPolicyEmitter() throws UnexpectedBehaviourException {
		return retrieve(GraphicalNodeEditPolicyGenerator.class);
	}

	public TextEmitter getNodeItemSemanticEditPolicyEmitter() throws UnexpectedBehaviourException {
		return retrieve(NodeItemSemanticEditPolicyGenerator.class);
	}

	public TextEmitter getLinkItemSemanticEditPolicyEmitter() throws UnexpectedBehaviourException {
		return retrieve(LinkItemSemanticEditPolicyGenerator.class);
	}

	public TextEmitter getTextSelectionEditPolicyEmitter() throws UnexpectedBehaviourException {
		return retrieve(TextSelectionEditPolicyGenerator.class);
	}

	public TextEmitter getTextNonResizableEditPolicyEmitter() throws UnexpectedBehaviourException {
		return retrieve(TextNonResizableEditPolicyGenerator.class);
	}

	public TextEmitter getExternalNodeLabelHostLayoutEditPolicyEmitter() throws UnexpectedBehaviourException {
		return retrieve(ExternalNodeLabelHostLayoutEditPolicyGenerator.class);
	}

	// providers

	public TextEmitter getAbstractParserEmitter() throws UnexpectedBehaviourException {
		return retrieve(AbstractParserGenerator.class);
	}

	public TextEmitter getStructuralFeatureParserEmitter() throws UnexpectedBehaviourException {
		return retrieve(StructuralFeatureParserGenerator.class);
	}

	public TextEmitter getStructuralFeaturesParserEmitter() throws UnexpectedBehaviourException {
		return retrieve(StructuralFeaturesParserGenerator.class);
	}

	public TextEmitter getViewFactoryEmitter() throws UnexpectedBehaviourException {
		return retrieve(ViewFactoryGenerator.class);
	}

	public TextEmitter getLabelViewFactoryEmitter() throws UnexpectedBehaviourException {
		return retrieve(LabelViewFactoryGenerator.class);
	}

	public TextEmitter getLabelTextViewFactoryEmitter() throws UnexpectedBehaviourException {
		return retrieve(LabelTextViewFactoryGenerator.class);
	}
	
	public TextEmitter getElementTypesEmitter() throws UnexpectedBehaviourException {
		return retrieve(ElementTypesGenerator.class);
	}

	public TextEmitter getViewProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(ViewProviderGenerator.class);
	}

	public TextEmitter getEditPartProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(EditPartProviderGenerator.class);
	}

	public TextEmitter getContributionItemProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(ContributionItemProviderGenerator.class);
	}

	public TextEmitter getModelingAssistantProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(ModelingAssistantProviderGenerator.class);
	}

	public TextEmitter getPropertySheetLabelProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(SheetLabelProviderGenerator.class);
	}

	public TextEmitter getPropertySectionEmitter() throws UnexpectedBehaviourException {
		return retrieve(PropertySectionGenerator.class);
	}

	public TextEmitter getIconProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(IconProviderGenerator.class);
	}

	public TextEmitter getParserProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(ParserProviderGenerator.class);
	}

	public TextEmitter getValidationProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(ValidationProviderGenerator.class);
	}

	public TextEmitter getValidationDecoratorProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(ValidationDecoratorProviderGenerator.class);
	}

	public TextEmitter getShortcutsDecoratorProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(ShortcutsDecoratorProviderGenerator.class);
	}
	
	public TextEmitter getShortcutPropertyTesterEmitter() throws UnexpectedBehaviourException {
		return retrieve(ShortcutsPropertyTester.class);
	}

	public TextEmitter getMetricProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(MetricProviderGenerator.class);
	}	
	
	public TextEmitter getMarkerNavigationProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(MarkerNavigationProviderGenerator.class);
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

	// editor

	public TextEmitter getInitDiagramFileActionEmitter() throws UnexpectedBehaviourException {
		return retrieve(InitDiagramFileActionGenerator.class);
	}
	
	public TextEmitter getNewDiagramFileWizardEmitter() throws UnexpectedBehaviourException {
		return retrieve(NewDiagramFileWizardGenerator.class);
	}

	public TextEmitter getPaletteEmitter() throws UnexpectedBehaviourException {
		return retrieve(PaletteFactoryGenerator.class);
	}

	public TextEmitter getDiagramEditorUtilEmitter() throws UnexpectedBehaviourException {
		return retrieve(DiagramEditorUtilGenerator.class);
	}
	
	public TextEmitter getVisualIDRegistryEmitter() throws UnexpectedBehaviourException {
		return retrieve(VisualIDRegistryGenerator.class);
	}

	public TextEmitter getCreationWizardEmitter() throws UnexpectedBehaviourException {
		return retrieve(CreationWizardGenerator.class);
	}

	public TextEmitter getCreationWizardPageEmitter() throws UnexpectedBehaviourException {
		return retrieve(CreationWizardPageGenerator.class);
	}

	public TextEmitter getEditorEmitter() throws UnexpectedBehaviourException {
		return retrieve(EditorGenerator.class);
	}
	
	public TextEmitter getCreateShortcutActionEmitter() throws UnexpectedBehaviourException {
		return retrieve(CreateShortcutActionGenerator.class);
	}
	
	public TextEmitter getCreateShortcutDecorationCommandEmitter() throws UnexpectedBehaviourException {
		return retrieve(CreateShortcutDecorationsCommand.class);
	}

	public TextEmitter getLoadResourceActionEmitter() throws UnexpectedBehaviourException {
		return retrieve(LoadResourceActionGenerator.class);
	}
	
	public TextEmitter getElementChooserEmitter() throws UnexpectedBehaviourException {
		return retrieve(ElementChooserGenerator.class);
	}
	
	public TextEmitter getDocumentProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(DocumentProviderGenerator.class);
	}
	
	public TextEmitter getActionBarContributorEmitter() throws UnexpectedBehaviourException {
		return retrieve(ActionBarContributorGenerator.class);
	}

	public TextEmitter getMatchingStrategyEmitter() throws UnexpectedBehaviourException {
		return retrieve(MatchingStrategyGenerator.class);
	}

	public TextEmitter getPreferencesInitializerEmitter() throws UnexpectedBehaviourException {
		return retrieve(PreferencesInitializerGenerator.class);
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
		return retrieve(AbstractNavigatorItemGenerator.class);
	}
	
	public TextEmitter getNavigatorGroupEmitter() throws UnexpectedBehaviourException {
		return retrieve(NavigatorGroupGenerator.class);
	}

	public TextEmitter getNavigatorItemEmitter() throws UnexpectedBehaviourException {
		return retrieve(NavigatorItemGenerator.class);
	}
	
	public TextEmitter getPluginClassEmitter() throws UnexpectedBehaviourException {
		return retrieve(PluginGenerator.class);
	}

	public TextEmitter getPluginXmlEmitter() throws UnexpectedBehaviourException {
		return retrieve(PluginXML.class);
	}

	public TextEmitter getPluginPropertiesEmitter() throws UnexpectedBehaviourException {
		return retrieve(PluginPropertiesGenerator.class);
	}
	
	public TextEmitter getOptionsFileEmitter() throws UnexpectedBehaviourException {
		return retrieve(OptionsFileGenerator.class);
	}

	public TextEmitter getBundleManifestEmitter() throws UnexpectedBehaviourException {
		return retrieve(ManifestGenerator.class);
	}

	public TextEmitter getBuildPropertiesEmitter() throws UnexpectedBehaviourException {
		return retrieve(BuildPropertiesGenerator.class);
	}
	
	public BinaryEmitter getShortcutImageEmitter() throws UnexpectedBehaviourException {
		return newGIFEmitter("/editor/shortcut.gif"); //$NON-NLS-1$
	}
	
	public BinaryEmitter getGroupIconEmitter() throws UnexpectedBehaviourException {
		return newGIFEmitter("/navigator/navigatorGroup.gif"); //$NON-NLS-1$
	}

	public BinaryEmitter getDiagramIconEmitter() throws UnexpectedBehaviourException {
		return newGIFEmitterAdapter("/editor/diagram.gif"); //$NON-NLS-1$
	}

	public BinaryEmitter getWizardBannerImageEmitter() throws UnexpectedBehaviourException {
		return newGIFEmitterAdapter("/editor/wizban.gif"); //$NON-NLS-1$
	}

	// application

	public TextEmitter getActionBarAdvisorEmitter() throws UnexpectedBehaviourException {
		return retrieve(ActionBarAdvisorGenerator.class);
	}

	public TextEmitter getApplicationEmitter() throws UnexpectedBehaviourException {
		return retrieve(ApplicationGenerator.class);
	}

	public TextEmitter getPerspectiveEmitter() throws UnexpectedBehaviourException {
		return retrieve(PerspectiveGenerator.class);
	}

	public TextEmitter getWorkbenchAdvisorEmitter() throws UnexpectedBehaviourException {
		return retrieve(WorkbenchAdvisorGenerator.class);
	}

	public TextEmitter getWorkbenchWindowAdvisorEmitter() throws UnexpectedBehaviourException {
		return retrieve(WorkbenchWindowAdvisorGenerator.class);
	}

	public TextEmitter getURIDiagramDocumentProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(URIDiagramDocumentProviderGenerator.class);
	}

	public TextEmitter getURIEditorInputProxyEmitter() throws UnexpectedBehaviourException {
		return retrieve(URIEditorInputProxyGenerator.class);
	}

	public TextEmitter getWizardNewFileCreationPageEmitter() throws UnexpectedBehaviourException {
		return retrieve(WizardNewFileCreationPageGenerator.class);
	}

	// util

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
}