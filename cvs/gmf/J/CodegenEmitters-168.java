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

	public TextEmitter getDiagramItemSemanticEditPolicyEmitter() {
		return getPrimaryEmitter("xpt::diagram::editpolicies::DiagramItemSemanticEditPolicy"); //$NON-NLS-1$
	}

	public TextEmitter getCompartmentItemSemanticEditPolicyEmitter() {
		return getPrimaryEmitter("xpt::diagram::editpolicies::CompartmentItemSemanticEditPolicy"); //$NON-NLS-1$
	}

	public TextEmitter getGraphicalNodeEditPolicyEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::diagram::editpolicies::GraphicalNodeEditPolicy"); //$NON-NLS-1$
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

	// updater

	public TextEmitter getDiagramUpdaterEmitter() {
		return getPrimaryEmitter("xpt::diagram::updater::DiagramUpdater"); //$NON-NLS-1$
	}

	public TextEmitter getUpdateCommandEmitter() {
		return getPrimaryEmitter("xpt::diagram::updater::UpdateCommand"); //$NON-NLS-1$
	}

	public TextEmitter getNodeDescriptorEmitter() {
		return getPrimaryEmitter("xpt::diagram::updater::NodeDescriptor"); //$NON-NLS-1$
	}

	public TextEmitter getLinkDescriptorEmitter() {
		return getPrimaryEmitter("xpt::diagram::updater::LinkDescriptor"); //$NON-NLS-1$
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

	// providers

	public TextEmitter getParserProviderEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::providers::ParserProvider"); //$NON-NLS-1$
	}

	public TextEmitter getElementInitializersEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::providers::ElementInitializers"); //$NON-NLS-1$
	}

	public TextEmitter getElementTypesEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::providers::ElementTypes"); //$NON-NLS-1$
	}

	public TextEmitter getViewProviderEmitter() {
		return getPrimaryEmitter("xpt::providers::ViewProvider"); //$NON-NLS-1$
	}

	public TextEmitter getEditPartProviderEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::providers::EditPartProvider"); //$NON-NLS-1$
	}

	public TextEmitter getContributionItemProviderEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::providers::ContributionItemProvider"); //$NON-NLS-1$
	}

	public TextEmitter getModelingAssistantProviderEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::providers::ModelingAssistantProvider"); //$NON-NLS-1$
	}

	public TextEmitter getIconProviderEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::providers::IconProvider"); //$NON-NLS-1$
	}

	public TextEmitter getMarkerNavigationProviderEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::providers::MarkerNavigationProvider"); //$NON-NLS-1$
	}	

	public TextEmitter getValidationProviderEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::providers::ValidationProvider"); //$NON-NLS-1$
	}

	public TextEmitter getValidationDecoratorProviderEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::providers::ValidationDecoratorProvider"); //$NON-NLS-1$
	}

	public TextEmitter getShortcutsDecoratorProviderEmitter() {
		return getPrimaryEmitter("xpt::providers::ShortcutsDecoratorProvider"); //$NON-NLS-1$
	}

	public TextEmitter getMetricProviderEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::providers::MetricProvider"); //$NON-NLS-1$
	}	

	public TextEmitter getAbstractExpressionEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::expressions::AbstractExpression"); //$NON-NLS-1$
	}

	public TextEmitter getOCLExpressionFactoryEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::expressions::OCLExpressionFactory"); //$NON-NLS-1$
	}	

	public TextEmitter getRegexpExpressionFactoryEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::expressions::RegexpExpressionFactory"); //$NON-NLS-1$
	}

	// property sheet

	public TextEmitter getPropertySheetLabelProviderEmitter() throws UnexpectedBehaviourException {
		return newXpandEmitter("xpt::propsheet::LabelProvider::Class"); //$NON-NLS-1$
	}

	public TextEmitter getPropertySectionEmitter() throws UnexpectedBehaviourException {
		return newXpandEmitter("xpt::propsheet::PropertySection::Class"); //$NON-NLS-1$
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

	public TextEmitter getShortcutPropertyTesterEmitter() {
		return getPrimaryEmitter("xpt::editor::ShortcutPropertyTester"); //$NON-NLS-1$
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
		return getPrimaryEmitter("xpt::editor::DiagramEditorUtil"); //$NON-NLS-1$
	}

	public TextEmitter getVisualIDRegistryEmitter() {
		return getPrimaryEmitter("xpt::editor::VisualIDRegistry"); //$NON-NLS-1$
	}

	public TextEmitter getCreationWizardEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::editor::CreationWizard"); //$NON-NLS-1$
	}

	public TextEmitter getCreationWizardPageEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::editor::CreationWizardPage"); //$NON-NLS-1$
	}

	public TextEmitter getEditorEmitter() {
		return getPrimaryEmitter("xpt::editor::Editor"); //$NON-NLS-1$
	}

	public TextEmitter getCreateShortcutActionEmitter() {
		return getPrimaryEmitter("xpt::editor::CreateShortcutAction"); //$NON-NLS-1$
	}

	public TextEmitter getLoadResourceActionEmitter() {
		return getPrimaryEmitter("xpt::editor::LoadResourceAction"); //$NON-NLS-1$
	}

	public TextEmitter getElementChooserEmitter() {
		return getPrimaryEmitter("xpt::editor::ElementChooser"); //$NON-NLS-1$
	}

	public TextEmitter getDocumentProviderEmitter() {
		return getPrimaryEmitter("xpt::editor::DocumentProvider"); //$NON-NLS-1$
	}

	public TextEmitter getActionBarContributorEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::editor::ActionBarContributor"); //$NON-NLS-1$
	}

	public TextEmitter getMatchingStrategyEmitter() {
		return getPrimaryEmitter("xpt::editor::MatchingStrategy"); //$NON-NLS-1$
	}

	public TextEmitter getDomainModelElementTesterEmitter() {
		return getPrimaryEmitter("xpt::editor::DomainModelElementTester"); //$NON-NLS-1$
	}

	public TextEmitter getURIEditorInputTesterEmitter() {
		return getPrimaryEmitter("xpt::editor::UriEditorInputTester"); //$NON-NLS-1$
	}

	public BinaryEmitter getShortcutImageEmitter() throws UnexpectedBehaviourException {
		return newGIFEmitter("/xpt/editor/shortcut.gif"); //$NON-NLS-1$
	}

	public BinaryEmitter getDiagramIconEmitter() throws UnexpectedBehaviourException {
		return newGIFEmitterAdapter("/xpt/editor/diagram.gif"); //$NON-NLS-1$
	}

	public BinaryEmitter getWizardBannerImageEmitter() throws UnexpectedBehaviourException {
		return newGIFEmitterAdapter("/xpt/editor/wizban.gif"); //$NON-NLS-1$
	}

	// navigator

	public TextEmitter getNavigatorContentProviderEmitter() {
		return getPrimaryEmitter("xpt::navigator::NavigatorContentProvider"); //$NON-NLS-1$
	}

	public TextEmitter getDomainNavigatorContentProviderEmitter() {
		return getPrimaryEmitter("xpt::navigator::DomainNavigatorContentProvider"); //$NON-NLS-1$
	}

	public TextEmitter getDomainNavigatorLabelProviderEmitter() {
		return getPrimaryEmitter("xpt::navigator::DomainNavigatorLabelProvider"); //$NON-NLS-1$
	}

	public TextEmitter getDomainNavigatorItemEmitter() {
		return getPrimaryEmitter("xpt::navigator::DomainNavigatorItem"); //$NON-NLS-1$
	}

	public TextEmitter getNavigatorLabelProviderEmitter() {
		return getPrimaryEmitter("xpt::navigator::NavigatorLabelProvider"); //$NON-NLS-1$
	}

	public TextEmitter getNavigatorLinkHelperEmitter() {
		return getPrimaryEmitter("xpt::navigator::NavigatorLinkHelper"); //$NON-NLS-1$
	}

	public TextEmitter getNavigatorSorterEmitter() {
		return getPrimaryEmitter("xpt::navigator::NavigatorSorter"); //$NON-NLS-1$
	}

	public TextEmitter getNavigatorActionProviderEmitter() {
		return getPrimaryEmitter("xpt::navigator::NavigatorActionProvider"); //$NON-NLS-1$
	}

	public TextEmitter getAbstractNavigatorItemEmitter() {
		return getPrimaryEmitter("xpt::navigator::AbstractNavigatorItem"); //$NON-NLS-1$
	}

	public TextEmitter getNavigatorGroupEmitter() {
		return getPrimaryEmitter("xpt::navigator::NavigatorGroup"); //$NON-NLS-1$
	}

	public TextEmitter getNavigatorItemEmitter() {
		return getPrimaryEmitter("xpt::navigator::NavigatorItem"); //$NON-NLS-1$
	}

	public BinaryEmitter getGroupIconEmitter() throws UnexpectedBehaviourException {
		return newGIFEmitter("/xpt/navigator/navigatorGroup.gif"); //$NON-NLS-1$
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

	// plugin

	public TextEmitter getActivatorEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::plugin::Activator"); //$NON-NLS-1$
	}

	public TextEmitter getBundleManifestEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::plugin::manifest"); //$NON-NLS-1$
	}

	public TextEmitter getPluginXmlEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::plugin::plugin"); //$NON-NLS-1$
	}

	public TextEmitter getPluginPropertiesEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::plugin::properties"); //$NON-NLS-1$
	}

	public TextEmitter getBuildPropertiesEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::plugin::build"); //$NON-NLS-1$
	}

	public TextEmitter getOptionsFileEmitter() throws UnexpectedBehaviourException {
		return getPrimaryEmitter("xpt::plugin::options"); //$NON-NLS-1$
	}

    public TextEmitter getExternalizeEmitter() {
        return newXpandEmitter("xpt::Externalizer::Access"); //$NON-NLS-1$
    }

    public TextEmitter getMessagesEmitter() {
        return newXpandEmitter("xpt::Externalizer::Values"); //$NON-NLS-1$
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