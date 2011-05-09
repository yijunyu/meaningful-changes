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
package org.eclipse.gmf.codegen.util;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.jet.JETCompiler;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.codegen.templates.editor.ActionBarContributorGenerator;
import org.eclipse.gmf.codegen.templates.editor.CreationWizardGenerator;
import org.eclipse.gmf.codegen.templates.editor.CreationWizardPageGenerator;
import org.eclipse.gmf.codegen.templates.expressions.AbstractExpressionGenerator;
import org.eclipse.gmf.codegen.templates.expressions.OCLExpressionFactoryGenerator;
import org.eclipse.gmf.codegen.templates.expressions.RegexpExpressionFactoryGenerator;
import org.eclipse.gmf.codegen.templates.policies.CompartmentItemSemanticEditPolicyGenerator;
import org.eclipse.gmf.codegen.templates.policies.DiagramItemSemanticEditPolicyGenerator;
import org.eclipse.gmf.codegen.templates.policies.GraphicalNodeEditPolicyGenerator;
import org.eclipse.gmf.codegen.templates.providers.ContributionItemProviderGenerator;
import org.eclipse.gmf.codegen.templates.providers.EditPartProviderGenerator;
import org.eclipse.gmf.codegen.templates.providers.ElementInitializersGenerator;
import org.eclipse.gmf.codegen.templates.providers.MetricProviderGenerator;
import org.eclipse.gmf.codegen.templates.providers.ValidationProviderGenerator;
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
 * 
 * @author artem
 */
public class CodegenEmitters {

	private static final String PATH_SEPARATOR = "::"; //$NON-NLS-1$

	private static final String TEMPLATES_PLUGIN_ID = "org.eclipse.gmf.codegen"; //$NON-NLS-1$
	private final EmitterFactory myFactory;
	private final String[] myTemplatePath;
	private ResourceManager myResourceManager;

	public CodegenEmitters(boolean usePrecompiled, String templateDirectory) {
		this(usePrecompiled, templateDirectory, getDefaultVariables(), new StaticTemplateRegistry(CodegenEmitters.class.getClassLoader()));
	}
	
	public CodegenEmitters(boolean usePrecompiled, String templateDirectory, String[] variables, StaticTemplateRegistry registry) {
		initRegistry(registry);
		final URL baseURL = getTemplatesBundle().getEntry("/templates/"); //$NON-NLS-1$
		final URL dynamicURL = usePrecompiled ? null : getDynamicTemplatesURL(templateDirectory);
		
		myTemplatePath = new String[] { dynamicURL != null ? dynamicURL.toString() : null, baseURL.toString() };
		// actually, that's new JETEmitterFactory with JETTemplateRegistry
		myFactory = new CachingEmitterFactory(new EmitterFactoryImpl(getTemplatePath(), registry, usePrecompiled, variables));
		
		if (dynamicURL == null) {
			myResourceManager = new BundleResourceManager(baseURL);	
		} else {
			myResourceManager = new BundleResourceManager(dynamicURL, baseURL);
		}
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

	private static void initRegistry(StaticTemplateRegistry tr) {
		put(tr, "/policies/GraphicalNodeEditPolicy.javajet", GraphicalNodeEditPolicyGenerator.class);
		put(tr, "/policies/DiagramItemSemanticEditPolicy.javajet", DiagramItemSemanticEditPolicyGenerator.class);
		put(tr, "/policies/CompartmentItemSemanticEditPolicy.javajet", CompartmentItemSemanticEditPolicyGenerator.class);
		put(tr, "/providers/EditPartProvider.javajet", EditPartProviderGenerator.class);
		put(tr, "/providers/ContributionItemProvider.javajet", ContributionItemProviderGenerator.class);
		put(tr, "/providers/ElementInitializers.javajet", ElementInitializersGenerator.class);
		put(tr, "/providers/ValidationProvider.javajet", ValidationProviderGenerator.class); //$NON-NLS-1$
		put(tr, "/providers/MetricProvider.javajet", MetricProviderGenerator.class); //$NON-NLS-1$		
		put(tr, "/editor/CreationWizard.javajet", CreationWizardGenerator.class);
		put(tr, "/editor/CreationWizardPage.javajet", CreationWizardPageGenerator.class);
		put(tr, "/editor/ActionBarContributor.javajet", ActionBarContributorGenerator.class);
		put(tr, "/expressions/AbstractExpression.javajet", AbstractExpressionGenerator.class); //$NON-NLS-1$		
		put(tr, "/expressions/OCLExpressionFactory.javajet", OCLExpressionFactoryGenerator.class); //$NON-NLS-1$		
		put(tr, "/expressions/RegexpExpressionFactory.javajet", RegexpExpressionFactoryGenerator.class); //$NON-NLS-1$
	}

	/**
	 * @see #retrieve(Class)
	 */
	protected static void put(StaticTemplateRegistry tr, String path, Class<?> precompiledTemplate) {
		tr.put(precompiledTemplate, path, precompiledTemplate);
	}

	/**
	 * depends on {@link #put(StaticTemplateRegistry, String, Class) } impl - class object of
	 * precompiled template serves as a key
	 */
	public TextEmitter retrieve(Class<?> key) throws UnexpectedBehaviourException {
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
	
	private static URL getDynamicTemplatesURL(String templateDirectory) {
		if (templateDirectory != null) {
			URI templatesURI = templateDirectory.indexOf(":") == -1 ? URI.createPlatformResourceURI(templateDirectory, true) : URI.createURI(templateDirectory); //$NON-NLS-1$
			try {
				return new URL(CommonPlugin.resolve(templatesURI).toString());
			} catch (MalformedURLException e) {
				String pluginID = "org.eclipse.gmf.codegen"; //$NON-NLS-1$
				Platform.getLog(Platform.getBundle(pluginID)).log(new Status(IStatus.ERROR, pluginID, 0, "Incorrecct dynamic templates location", e)); //$NON-NLS-1$
			}
		}
		return null;
	}

	public URL getJMergeControlFile() {
		return getTemplatesBundle().getEntry("/templates/emf-merge.xml"); //$NON-NLS-1$
	}

	// commands

	public TextEmitter getCreateNodeCommandEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::commands::CreateNodeCommand"); //$NON-NLS-1$
	}

	public TextEmitter getCreateLinkCommandEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::commands::CreateLinkCommand"); //$NON-NLS-1$
	}

	public TextEmitter getCreateRefLinkCommandEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::commands::CreateRefLinkCommand"); //$NON-NLS-1$
	}

	public TextEmitter getReorientLinkCommandEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::commands::ReorientLinkCommand"); //$NON-NLS-1$
	}

	public TextEmitter getReorientRefLinkCommandEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::commands::ReorientRefLinkCommand"); //$NON-NLS-1$
	}

	public TextEmitter getReorientLinkViewCommandEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::commands::ReorientLinkViewCommand"); //$NON-NLS-1$
	}

	public TextEmitter getCreateShortcutDecorationsCommandEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::commands::CreateShortcutDecorationsCommand"); //$NON-NLS-1$
	}

	// helpers

	public TextEmitter getBaseEditHelperEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::edithelpers::BaseEditHelper"); //$NON-NLS-1$
	}

	public TextEmitter getEditHelperEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::edithelpers::EditHelper"); //$NON-NLS-1$
	}

	public TextEmitter getEditHelperAdviceEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::edithelpers::EditHelperAdvice"); //$NON-NLS-1$
	}

	// parts

	public TextEmitter getDiagramEditPartEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::editparts::DiagramEditPart"); //$NON-NLS-1$
	}

	public TextEmitter getNodeEditPartEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::editparts::NodeEditPart"); //$NON-NLS-1$
	}

	public TextEmitter getNodeLabelEditPartEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::editparts::NodeLabelEditPart"); //$NON-NLS-1$
	}

	public TextEmitter getExternalNodeLabelEditPartEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::editparts::ExternalNodeLabelEditPart"); //$NON-NLS-1$
	}

	public TextEmitter getChildNodeLabelEditPartEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::editparts::ChildNodeLabelEditPart"); //$NON-NLS-1$
	}

	public TextEmitter getCompartmentEditPartEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::editparts::CompartmentEditPart"); //$NON-NLS-1$
	}

	public TextEmitter getLinkEditPartEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::editparts::LinkEditPart"); //$NON-NLS-1$
	}

	public TextEmitter getLinkLabelEditPartEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::editparts::LinkLabelEditPart"); //$NON-NLS-1$
	}

	public TextEmitter getEditPartFactoryEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::editparts::EditPartFactory"); //$NON-NLS-1$
	}

	// policies

	public TextEmitter getBaseItemSemanticEditPolicyEmitter() {
		return getPrimaryEmitter("xpt::diagram::editpolicies::BaseItemSemanticEditPolicy"); //$NON-NLS-1$
	}

	public TextEmitter getOpenDiagramEditPolicyEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::editpolicies::OpenDiagram"); //$NON-NLS-1$
	}

	public TextEmitter getDiagramCanonicalEditPolicyEmitter() {
		return getPrimaryEmitter("xpt::diagram::editpolicies::DiagramCanonicalEditPolicy"); //$NON-NLS-1$
	}

	public TextEmitter getChildContainerCanonicalEditPolicyEmitter() {
		return getPrimaryEmitter("xpt::diagram::editpolicies::ChildContainerCanonicalEditPolicy"); //$NON-NLS-1$
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

	public TextEmitter getNodeItemSemanticEditPolicyEmitter() {
		return getPrimaryEmitter("xpt::diagram::editpolicies::NodeItemSemanticEditPolicy"); //$NON-NLS-1$
	}

	public TextEmitter getLinkItemSemanticEditPolicyEmitter() {
		return getPrimaryEmitter("xpt::diagram::editpolicies::LinkItemSemanticEditPolicy"); //$NON-NLS-1$
	}

	public TextEmitter getTextSelectionEditPolicyEmitter() throws UnexpectedBehaviourException {
		return newXpandEmitter("xpt::diagram::editpolicies::TextFeedback::TextSelectionEditPolicy"); //$NON-NLS-1$
	}

	public TextEmitter getTextNonResizableEditPolicyEmitter() throws UnexpectedBehaviourException {
		return newXpandEmitter("xpt::diagram::editpolicies::TextFeedback::TextNonResizableEditPolicy"); //$NON-NLS-1$
	}

	// parsers

	public TextEmitter getAbstractParserEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::parsers::AbstractParser"); //$NON-NLS-1$
	}

	public String getAbstractParserName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::parsers::AbstractParser", input); //$NON-NLS-1$
	}

	public TextEmitter getCompositeParserEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::parsers::CompositeParser"); //$NON-NLS-1$
	}

	public String getCompositeParserName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::parsers::CompositeParser", input); //$NON-NLS-1$
	}

	public TextEmitter getMessageFormatParserEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::parsers::MessageFormatParser"); //$NON-NLS-1$
	}

	public String getMessageFormatParserName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::parsers::MessageFormatParser", input); //$NON-NLS-1$
	}

	public TextEmitter getNativeParserEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::parsers::NativeParser"); //$NON-NLS-1$
	}

	public String getNativeParserName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::parsers::NativeParser", input); //$NON-NLS-1$
	}

	public TextEmitter getPrintfParserEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::parsers::PrintfParser"); //$NON-NLS-1$
	}

	public String getPrintfParserName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::parsers::PrintfParser", input); //$NON-NLS-1$
	}

	public TextEmitter getRegexpParserEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::parsers::RegexpParser"); //$NON-NLS-1$
	}

	public String getRegexpParserName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::parsers::RegexpParser", input); //$NON-NLS-1$
	}

	// view factories

	public TextEmitter getDiagramViewFactoryEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::views::DiagramViewFactory"); //$NON-NLS-1$
	}

	public TextEmitter getNodeViewFactoryEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::views::NodeViewFactory"); //$NON-NLS-1$
	}

	public TextEmitter getLabelNodeViewFactoryEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::views::LabelNodeViewFactory"); //$NON-NLS-1$
	}

	public TextEmitter getCompartmentViewFactoryEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::views::CompartmentViewFactory"); //$NON-NLS-1$
	}

	public TextEmitter getLinkViewFactoryEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::views::LinkViewFactory"); //$NON-NLS-1$
	}

	public TextEmitter getFloatingLabelViewFactoryEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::views::FloatingLabelViewFactory"); //$NON-NLS-1$
	}

	public TextEmitter getLabelViewFactoryEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::views::LabelViewFactory"); //$NON-NLS-1$
	}

	// providers

	public TextEmitter getParserProviderEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::providers::ParserProvider"); //$NON-NLS-1$
	}

	public TextEmitter getElementInitializersEmitter() throws UnexpectedBehaviourException {
		return retrieve(ElementInitializersGenerator.class);
	}

	public TextEmitter getElementTypesEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::providers::ElementTypes"); //$NON-NLS-1$
	}

	public TextEmitter getViewProviderEmitter() {
		return getPrimaryEmitter("xpt::providers::ViewProvider"); //$NON-NLS-1$
	}

	public TextEmitter getEditPartProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(EditPartProviderGenerator.class);
	}

	public TextEmitter getContributionItemProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(ContributionItemProviderGenerator.class);
	}

	public TextEmitter getModelingAssistantProviderEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::providers::ModelingAssistantProvider"); //$NON-NLS-1$
	}

	public TextEmitter getPropertySheetLabelProviderEmitter() throws UnexpectedBehaviourException {
		return newXpandEmitter("xpt::propsheet::LabelProvider::Class"); //$NON-NLS-1$
	}

	public TextEmitter getPropertySectionEmitter() throws UnexpectedBehaviourException {
		return newXpandEmitter("xpt::propsheet::PropertySection::Class"); //$NON-NLS-1$
	}

	public TextEmitter getIconProviderEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::providers::IconProvider"); //$NON-NLS-1$
	}

	public TextEmitter getMarkerNavigationProviderEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::providers::MarkerNavigationProvider"); //$NON-NLS-1$
	}	

	public TextEmitter getValidationProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(ValidationProviderGenerator.class);
	}

	public TextEmitter getValidationDecoratorProviderEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::providers::ValidationDecoratorProvider"); //$NON-NLS-1$
	}

	public TextEmitter getShortcutsDecoratorProviderEmitter() {
		return newXpandEmitter("xpt::providers::ShortcutsDecoratorProvider::ShortcutsDecoratorProvider"); //$NON-NLS-1$
	}
	
	public TextEmitter getShortcutPropertyTesterEmitter() {
		return newXpandEmitter("xpt::editor::ShortcutPropertyTester::ShortcutPropertyTester"); //$NON-NLS-1$
	}

	public TextEmitter getMetricProviderEmitter() throws UnexpectedBehaviourException {
		return retrieve(MetricProviderGenerator.class);
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

	public TextEmitter getValidateActionEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::editor::ValidateAction"); //$NON-NLS-1$
	}

	public String getValidateActionName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::editor::ValidateAction", input); //$NON-NLS-1$
	}

	public TextEmitter getValidationMarkerEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::editor::ValidationMarker"); //$NON-NLS-1$
	}

	public String getValidationMarkerName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::editor::ValidationMarker", input); //$NON-NLS-1$
	}
	
	public TextEmitter getDiagramContentInitializerEmitter() {
		return getPrimaryEmitter("xpt::editor::DiagramContentInitializer"); //$NON-NLS-1$
	}

	public String getShortcutCreationWizardName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::editor::ShortcutCreationWizard", input); //$NON-NLS-1$
	}

	public TextEmitter getShortcutCreationWizardEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::editor::ShortcutCreationWizard"); //$NON-NLS-1$
	}

	public String getModelElementSelectionPageName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::editor::ModelElementSelectionPage", input); //$NON-NLS-1$
	}

	public TextEmitter getModelElementSelectionPageEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::editor::ModelElementSelectionPage"); //$NON-NLS-1$
	}

	public String getInitDiagramFileActionName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::editor::InitDiagramFileAction", input); //$NON-NLS-1$
	}

	public TextEmitter getInitDiagramFileActionEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::editor::InitDiagramFileAction"); //$NON-NLS-1$
	}

	public String getNewDiagramFileWizardName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::editor::NewDiagramFileWizard", input); //$NON-NLS-1$
	}

	public TextEmitter getNewDiagramFileWizardEmitter() {
		return getPrimaryEmitter("xpt::editor::NewDiagramFileWizard"); //$NON-NLS-1$
	}

	public TextEmitter getPaletteEmitter() throws UnexpectedBehaviourException {
		return newXpandEmitter("xpt::editor::palette::PaletteFactory::Factory"); //$NON-NLS-1$
	}

	public TextEmitter getDiagramEditorUtilEmitter() throws UnexpectedBehaviourException {
		return newXpandEmitter("xpt::editor::DiagramEditorUtil::DiagramEditorUtil"); //$NON-NLS-1$
	}
	
	public TextEmitter getVisualIDRegistryEmitter() {
		return newXpandEmitter("xpt::editor::VisualIDRegistry::VisualIDRegistry"); //$NON-NLS-1$
	}

	public TextEmitter getCreationWizardEmitter() throws UnexpectedBehaviourException {
		return retrieve(CreationWizardGenerator.class);
	}

	public TextEmitter getCreationWizardPageEmitter() throws UnexpectedBehaviourException {
		return retrieve(CreationWizardPageGenerator.class);
	}

	public TextEmitter getEditorEmitter() {
		return newXpandEmitter("xpt::editor::Editor::Editor"); //$NON-NLS-1$
	}
	
	public TextEmitter getCreateShortcutActionEmitter() {
		return newXpandEmitter("xpt::editor::CreateShortcutAction::CreateShortcutAction"); //$NON-NLS-1$
	}

	public TextEmitter getLoadResourceActionEmitter() {
		return newXpandEmitter("xpt::editor::LoadResourceAction::LoadResourceAction"); //$NON-NLS-1$
	}
	
	public TextEmitter getElementChooserEmitter() {
		return newXpandEmitter("xpt::editor::ElementChooser::ElementChooser"); //$NON-NLS-1$
	}
	
	public TextEmitter getDocumentProviderEmitter() {
		return newXpandEmitter("xpt::editor::DocumentProvider::DocumentProvider"); //$NON-NLS-1$
	}
	
	public TextEmitter getDiagramUpdaterEmitter() {
		return newXpandEmitter("xpt::diagram::updater::DiagramUpdater::DiagramUpdater"); //$NON-NLS-1$
	}

	public TextEmitter getUpdateCommandEmitter() {
		return newXpandEmitter("xpt::diagram::updater::UpdateCommand::UpdateCommand"); //$NON-NLS-1$
	}
	
	public TextEmitter getNodeDescriptorEmitter() {
		return newXpandEmitter("xpt::diagram::updater::NodeDescriptor::NodeDescriptor"); //$NON-NLS-1$
	}
	
	public TextEmitter getLinkDescriptorEmitter() {
		return newXpandEmitter("xpt::diagram::updater::LinkDescriptor::LinkDescriptor"); //$NON-NLS-1$
	}
	
	public TextEmitter getActionBarContributorEmitter() throws UnexpectedBehaviourException {
		return retrieve(ActionBarContributorGenerator.class);
	}

	public TextEmitter getMatchingStrategyEmitter() {
		return newXpandEmitter("xpt::editor::MatchingStrategy::MatchingStrategy"); //$NON-NLS-1$
	}
	
	public TextEmitter getNavigatorContentProviderEmitter() {
		return newXpandEmitter("xpt::navigator::NavigatorContentProvider::NavigatorContentProvider"); //$NON-NLS-1$
	}
	
	public TextEmitter getDomainNavigatorContentProviderEmitter() {
		return newXpandEmitter("xpt::navigator::DomainNavigatorContentProvider::DomainNavigatorContentProvider"); //$NON-NLS-1$
	}
	
	public TextEmitter getDomainNavigatorLabelProviderEmitter() {
		return newXpandEmitter("xpt::navigator::DomainNavigatorLabelProvider::DomainNavigatorLabelProvider"); //$NON-NLS-1$
	}
	
	public TextEmitter getDomainNavigatorItemEmitter() {
		return newXpandEmitter("xpt::navigator::DomainNavigatorItem::DomainNavigatorItem"); //$NON-NLS-1$
	}
	
	public TextEmitter getDomainModelElementTesterEmitter() {
		return newXpandEmitter("xpt::editor::DomainModelElementTester::DomainModelElementTester"); //$NON-NLS-1$
	}
	
	public TextEmitter getURIEditorInputTesterEmitter() {
		return newXpandEmitter("xpt::editor::UriEditorInputTester::UriEditorInputTester"); //$NON-NLS-1$
	}

	public TextEmitter getNavigatorLabelProviderEmitter() {
		return newXpandEmitter("xpt::navigator::NavigatorLabelProvider::NavigatorLabelProvider"); //$NON-NLS-1$
	}
	
	public TextEmitter getNavigatorLinkHelperEmitter() {
		return newXpandEmitter("xpt::navigator::NavigatorLinkHelper::NavigatorLinkHelper"); //$NON-NLS-1$
	}
	
	public TextEmitter getNavigatorSorterEmitter() {
		return newXpandEmitter("xpt::navigator::NavigatorSorter::NavigatorSorter"); //$NON-NLS-1$
	}
	
	public TextEmitter getNavigatorActionProviderEmitter() {
		return newXpandEmitter("xpt::navigator::NavigatorActionProvider::NavigatorActionProvider"); //$NON-NLS-1$
	}
	
	public TextEmitter getAbstractNavigatorItemEmitter() {
		return newXpandEmitter("xpt::navigator::AbstractNavigatorItem::AbstractNavigatorItem"); //$NON-NLS-1$
	}
	
	public TextEmitter getNavigatorGroupEmitter() {
		return newXpandEmitter("xpt::navigator::NavigatorGroup::NavigatorGroup"); //$NON-NLS-1$
	}

	public TextEmitter getNavigatorItemEmitter() {
		return newXpandEmitter("xpt::navigator::NavigatorItem::NavigatorItem"); //$NON-NLS-1$
	}
	
	public TextEmitter getPluginClassEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::plugin::Activator"); //$NON-NLS-1$
	}

	public TextEmitter getPluginXmlEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::plugin"); //$NON-NLS-1$
	}

	public TextEmitter getPluginPropertiesEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::properties"); //$NON-NLS-1$
	}

	public TextEmitter getOptionsFileEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::plugin::options"); //$NON-NLS-1$
	}

	public TextEmitter getBundleManifestEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::manifest"); //$NON-NLS-1$
	}

	public TextEmitter getBuildPropertiesEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::plugin::build"); //$NON-NLS-1$
	}

	public BinaryEmitter getShortcutImageEmitter() throws UnexpectedBehaviourException {
		return newGIFEmitter("/editor/shortcut.gif"); //$NON-NLS-1$
	}
	
	public BinaryEmitter getGroupIconEmitter() throws UnexpectedBehaviourException {
		return newGIFEmitter("/xpt/navigator/navigatorGroup.gif"); //$NON-NLS-1$
	}

	public BinaryEmitter getDiagramIconEmitter() throws UnexpectedBehaviourException {
		return newGIFEmitterAdapter("/editor/diagram.gif"); //$NON-NLS-1$
	}

	public BinaryEmitter getWizardBannerImageEmitter() throws UnexpectedBehaviourException {
		return newGIFEmitterAdapter("/editor/wizban.gif"); //$NON-NLS-1$
	}

    public TextEmitter getExternalizeEmitter() {
        return newXpandEmitter("xpt::Externalizer::Access"); //$NON-NLS-1$
    }

    public TextEmitter getMessagesEmitter() {
        return newXpandEmitter("xpt::Externalizer::Values"); //$NON-NLS-1$
    }

	public String getURIDiagramDocumentProviderName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::editor::URIDiagramDocumentProvider", input); //$NON-NLS-1$
	}

	// preferences

	public TextEmitter getPreferenceInitializerEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::preferences::PreferenceInitializer"); //$NON-NLS-1$
	}

	public String getPreferenceInitializerName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::diagram::preferences::PreferenceInitializer", input); //$NON-NLS-1$
	}

	public TextEmitter getAppearancePreferencePageEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::preferences::AppearancePreferencePage"); //$NON-NLS-1$
	}

	public String getAppearancePreferencePageName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::diagram::preferences::AppearancePreferencePage", input); //$NON-NLS-1$
	}

	public TextEmitter getConnectionsPreferencePageEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::preferences::ConnectionsPreferencePage"); //$NON-NLS-1$
	}

	public String getConnectionsPreferencePageName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::diagram::preferences::ConnectionsPreferencePage", input); //$NON-NLS-1$
	}

	public TextEmitter getGeneralPreferencePageEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::preferences::GeneralPreferencePage"); //$NON-NLS-1$
	}

	public String getGeneralPreferencePageName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::diagram::preferences::GeneralPreferencePage", input); //$NON-NLS-1$
	}

	public TextEmitter getPrintingPreferencePageEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::preferences::PrintingPreferencePage"); //$NON-NLS-1$
	}

	public String getPrintingPreferencePageName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::diagram::preferences::PrintingPreferencePage", input); //$NON-NLS-1$
	}

	public TextEmitter getRulersAndGridPreferencePageEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::preferences::RulersAndGridPreferencePage"); //$NON-NLS-1$
	}

	public String getRulersAndGridPreferencePageName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::diagram::preferences::RulersAndGridPreferencePage", input); //$NON-NLS-1$
	}

	// application

	public TextEmitter getApplicationEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::application::Application"); //$NON-NLS-1$
	}

	public TextEmitter getActionBarAdvisorEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::application::ActionBarAdvisor"); //$NON-NLS-1$
	}

	public TextEmitter getPerspectiveEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::application::Perspective"); //$NON-NLS-1$
	}

	public TextEmitter getWorkbenchAdvisorEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::application::WorkbenchAdvisor"); //$NON-NLS-1$
	}

	public TextEmitter getWorkbenchWindowAdvisorEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::application::WorkbenchWindowAdvisor"); //$NON-NLS-1$
	}

	public TextEmitter getWizardNewFileCreationPageEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::application::WizardNewFileCreationPage"); //$NON-NLS-1$
	}

	// util

    /**
     * Returns emitter for the primary definition in the specified template.
     * Primary definition has the same name as template file.
     */
	private TextEmitter getPrimaryEmitter(String templateName) {
		String[] parts = templateName.split(PATH_SEPARATOR);
		String definition = templateName + PATH_SEPARATOR + parts[parts.length-1];
		return newXpandEmitter(definition);
	}

    /**
     * Returns emitter for qualified class name definition in the specified template.
     * Definition should be named 'qualifiedClassName'.
     */
	private TextEmitter getQualifiedClassNameEmitter(String templateName) throws UnexpectedBehaviourException {
		String definition = templateName + PATH_SEPARATOR + "qualifiedClassName"; //$NON-NLS-1$
		return newXpandEmitter(definition);
	}


	/**
	 * Returns text generated by emitter.
	 */
	private String getText(TextEmitter emitter, Object... input) throws UnexpectedBehaviourException {
		try {
			return emitter.generate(new NullProgressMonitor(), input).trim();
		} catch (InterruptedException ie) {
			return null;
		} catch (InvocationTargetException ite) {
			throw new UnexpectedBehaviourException(ite.getCause());
		}
	}

	/**
	 * Returns qualified class name defined in template.
	 */
	private String getQualifiedClassName(String templateName, Object... input) throws UnexpectedBehaviourException {
		TextEmitter emitter = getQualifiedClassNameEmitter(templateName);
		return getText(emitter, input);
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

	protected TextEmitter newXpandEmitter(String definition) {
		return new XpandTextEmitter(myResourceManager, definition, getClass().getClassLoader());
	}

	protected static String[] getDefaultVariables(){
		return new String[] {
		        "org.eclipse.emf.codegen", //$NON-NLS-1$
				"org.eclipse.emf.codegen.ecore", //$NON-NLS-1$
				"org.eclipse.emf.common", //$NON-NLS-1$
				"org.eclipse.emf.ecore", //$NON-NLS-1$
				"org.eclipse.gmf.common", //$NON-NLS-1$
				"org.eclipse.gmf.codegen", //$NON-NLS-1$
		};
	}

}