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

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.jet.JETCompiler;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.gmf.internal.common.codegen.BinaryEmitter;
import org.eclipse.gmf.internal.common.codegen.DefaultTextMerger;
import org.eclipse.gmf.internal.common.codegen.GIFEmitter;
import org.eclipse.gmf.internal.common.codegen.JETGIFEmitterAdapter;
import org.eclipse.gmf.internal.common.codegen.TextEmitter;
import org.eclipse.gmf.internal.common.codegen.TextMerger;
import org.eclipse.gmf.internal.common.codegen.XpandTextEmitter;
import org.eclipse.gmf.internal.xpand.ResourceManager;
import org.eclipse.gmf.internal.xpand.util.BundleResourceManager;
import org.osgi.framework.Bundle;

/**
 * Provides Xpand templates.
 * FIXME Merge with {@link org.eclipse.gmf.codegen.util.CodegenEmitters}
 * 
 * @author artem
 */
public class CodegenEmitters {
	private static final String CODEGEN_PLUGIN_ID = "org.eclipse.gmf.codegen";	//$NON-NLS-1$

	private final String[] myTemplatePath;

	private ResourceManager myResourceManager;
	public CodegenEmitters(boolean usePrecompiled, String templateDirectory) {
		ArrayList<URL> templatesURI = new ArrayList<URL>(3);
		templatesURI.add(getTemplatesBundle().getEntry("/templates/"));	//$NON-NLS-1$
		templatesURI.add(getCodegenTemplatesBundle().getEntry("/templates/"));	//$NON-NLS-1$
		URL dynamicTemplatesPath = getDynamicTemplatesURL(templateDirectory);
		if (dynamicTemplatesPath != null) {
			templatesURI.add(dynamicTemplatesPath);
		}
		myResourceManager = new BundleResourceManager(templatesURI.toArray(new URL[templatesURI.size()]));

		myTemplatePath = new String[templatesURI.size()];
		for (int i = 0; i < templatesURI.size(); i++) {
			myTemplatePath[i] = templatesURI.get(i).toString();
		}
	}

	private static URL getDynamicTemplatesURL(String templateDirectory) {
		if (templateDirectory != null) {
			URI templatesURI = templateDirectory.indexOf(":") == -1 ? URI.createPlatformResourceURI(templateDirectory, true) : URI.createURI(templateDirectory); //$NON-NLS-1$
			try {
				return new URL(CommonPlugin.resolve(templatesURI).toString());
			} catch (MalformedURLException e) {
				Activator.getInstance().getLog().log(new Status(IStatus.ERROR, Activator.getPluginID(), 0, "Incorrect dynamic templates location", e)); //$NON-NLS-1$
			}
		}
		return null;
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

	public TextEmitter getCreateNodeCommandEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::commands::CreateNodeCommand::CreateNodeCommand");	//$NON-NLS-1$
	}

	public TextEmitter getCreateNodeCommandQualifiedClassNameEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::commands::CreateNodeCommand::qualifiedClassName");	//$NON-NLS-1$
	}

	public TextEmitter getAddNodeCommandEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::commands::AddNodeCommand::AddNodeCommand");	//$NON-NLS-1$
	}

	public TextEmitter getAddNodeCommandQualifiedClassNameEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::commands::AddNodeCommand::qualifiedClassName");	//$NON-NLS-1$
	}

	public TextEmitter getCloneNodeCommandEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::commands::CloneNodeCommand::CloneNodeCommand");	//$NON-NLS-1$
	}

	public TextEmitter getCloneNodeCommandQualifiedClassNameEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::commands::CloneNodeCommand::qualifiedClassName");	//$NON-NLS-1$
	}

	public TextEmitter getCreateLinkStartCommandEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::commands::CreateLinkStartCommand::CreateLinkStartCommand");	//$NON-NLS-1$
	}

	public TextEmitter getCreateLinkStartCommandQualifiedClassNameEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::commands::CreateLinkStartCommand::qualifiedClassName");	//$NON-NLS-1$
	}

	public TextEmitter getCreateLinkCompleteCommandEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::commands::CreateLinkCompleteCommand::CreateLinkCompleteCommand");	//$NON-NLS-1$
	}

	public TextEmitter getCreateLinkCompleteCommandQualifiedClassNameEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::commands::CreateLinkCompleteCommand::qualifiedClassName");	//$NON-NLS-1$
	}

	public TextEmitter getReconnectLinkSourceCommandEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::commands::ReconnectLinkSourceCommand::ReconnectLinkSourceCommand");	//$NON-NLS-1$
	}

	public TextEmitter getReconnectLinkSourceCommandQualifiedClassNameEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::commands::ReconnectLinkSourceCommand::qualifiedClassName");	//$NON-NLS-1$
	}

	public TextEmitter getReconnectLinkTargetCommandEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::commands::ReconnectLinkTargetCommand::ReconnectLinkTargetCommand");	//$NON-NLS-1$
	}

	public TextEmitter getReconnectLinkTargetCommandQualifiedClassNameEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::commands::ReconnectLinkTargetCommand::qualifiedClassName");	//$NON-NLS-1$
	}

	public TextEmitter getViewFactoryGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::viewfactories::ViewFactory::ViewFactory");	//$NON-NLS-1$
	}

	public TextEmitter getComponentEditPolicyEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::diagram::policies::ComponentEditPolicy::ComponentEditPolicy");	//$NON-NLS-1$
	}

	public TextEmitter getComponentEditPolicyQualifiedClassNameEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::diagram::policies::ComponentEditPolicy::qualifiedClassName");	//$NON-NLS-1$
	}

	public TextEmitter getLayoutEditPolicyEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::diagram::policies::LayoutEditPolicy::LayoutEditPolicy");	//$NON-NLS-1$
	}

	public TextEmitter getLayoutEditPolicyQualifiedClassNameEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::diagram::policies::LayoutEditPolicy::qualifiedClassName");	//$NON-NLS-1$
	}

	public TextEmitter getGraphicalEditPolicyEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::diagram::policies::GraphicalNodeEditPolicy::GraphicalNodeEditPolicy");	//$NON-NLS-1$
	}

	public TextEmitter getGraphicalEditPolicyQualifiedClassNameEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::diagram::policies::GraphicalNodeEditPolicy::qualifiedClassName");	//$NON-NLS-1$
	}

	public TextEmitter getConnectionEndpointEditPolicyEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::diagram::policies::ConnectionEndpointEditPolicy::ConnectionEndpointEditPolicy");	//$NON-NLS-1$
	}

	public TextEmitter getConnectionEndpointEditPolicyQualifiedClassNameEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::diagram::policies::ConnectionEndpointEditPolicy::qualifiedClassName");	//$NON-NLS-1$
	}

	public TextEmitter getValidationProviderGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::providers::ValidationProvider::ValidationProvider");	//$NON-NLS-1$
	}

	public TextEmitter getValidateActionGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::providers::ValidateAction::ValidateAction");	//$NON-NLS-1$
	}

	public TextEmitter getValidateActionQualifiedNameGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::providers::ValidateAction::qualifiedClassName");	//$NON-NLS-1$
	}

	public TextEmitter getMetricProviderEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::providers::MetricProvider::MetricProvider");	//$NON-NLS-1$
	}	

	public TextEmitter getMetricsActionEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::providers::MetricsAction::MetricsAction");	//$NON-NLS-1$
	}	

	public TextEmitter getMetricsActionQualifiedNameEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::providers::MetricsAction::qualifiedClassName");	//$NON-NLS-1$
	}	

	public TextEmitter getDomainElementInitializerGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::providers::DomainElementInitializer::DomainElementInitializer");	//$NON-NLS-1$
	}

	public TextEmitter getDomainElementInitializerQualifiedNameGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::providers::DomainElementInitializer::qualifiedClassName");	//$NON-NLS-1$
	}

	public TextEmitter getCompartmentEditPartGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::diagram::parts::CompartmentEditPart::CompartmentEditPart");	//$NON-NLS-1$
	}

	public TextEmitter getDiagramEditPartGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::diagram::parts::DiagramEditPart::DiagramEditPart");	//$NON-NLS-1$
	}

	public TextEmitter getEditPartFactoryGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::diagram::parts::EditPartFactory::EditPartFactory");	//$NON-NLS-1$
	}

	public TextEmitter getLinkEditPartGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::diagram::parts::LinkEditPart::LinkEditPart");	//$NON-NLS-1$
	}

	public TextEmitter getLinkLabelEditPartGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::diagram::parts::LinkLabelEditPart::LinkLabelEditPart");	//$NON-NLS-1$
	}

	public TextEmitter getChildNodeEditPartGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::diagram::parts::ChildNodeEditPart::ChildNodeEditPart");	//$NON-NLS-1$
	}

	public TextEmitter getNodeEditPartGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::diagram::parts::NodeEditPart::NodeEditPart");	//$NON-NLS-1$
	}

	public TextEmitter getNodeLabelEditPartGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::diagram::parts::NodeLabelEditPart::NodeLabelEditPart");	//$NON-NLS-1$
	}

	public TextEmitter getPluginGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::editor::Plugin::Plugin");	//$NON-NLS-1$
	}

	public TextEmitter getActionBarContributorGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::editor::ActionBarContributor::ActionBarContributor");	//$NON-NLS-1$
	}

	public TextEmitter getOpenDiagramInViewActionGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::editor::OpenDiagramInViewAction::OpenDiagramInViewAction");	//$NON-NLS-1$
	}

	public TextEmitter getOpenDiagramInViewActionQualifiedClassNameGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::editor::OpenDiagramInViewAction::qualifiedClassName");	//$NON-NLS-1$
	}

	public TextEmitter getEditorGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::editor::Editor::Editor");	//$NON-NLS-1$
	}

	public TextEmitter getMatchingStrategyEmitter() {
		return retrieveXpand("xpt::editor::MatchingStrategy::MatchingStrategy"); //$NON-NLS-1$
	}
	
	public TextEmitter getCreationWizardGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::editor::CreationWizard::CreationWizard");	//$NON-NLS-1$
	}

	public TextEmitter getCreationWizardPageGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::editor::CreationWizardPage::CreationWizardPage");	//$NON-NLS-1$
	}

	public TextEmitter getDiagramEditorUtilGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::editor::DiagramEditorUtil::DiagramEditorUtil");	//$NON-NLS-1$
	}

	public TextEmitter getPaletteFactoryGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::editor::palette::PaletteFactory::Factory");	//$NON-NLS-1$
	}

	public TextEmitter getVisualIDRegistryGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::editor::VisualIDRegistry::VisualIDRegistry");	//$NON-NLS-1$
	}

	public TextEmitter getManifestGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::manifest::manifest");	//$NON-NLS-1$
	}

	public TextEmitter getBuildPropertiesGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::buildProperties::buildProperties");	//$NON-NLS-1$
	}

	public TextEmitter getPluginXML() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::plugin::plugin");	//$NON-NLS-1$
	}

	public TextEmitter getInitDiagramFileActionGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::editor::InitDiagramFileAction::InitDiagramFileAction");	//$NON-NLS-1$
	}

	public TextEmitter getNewDiagramFileWizardGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::editor::NewDiagramFileWizard::NewDiagramFileWizard");	//$NON-NLS-1$
	}

	public TextEmitter getLoadResourceActionGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::editor::LoadResourceAction::LoadResourceAction");	//$NON-NLS-1$
	}

	public TextEmitter getElementTypesGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::providers::ElementTypes::ElementTypes");	//$NON-NLS-1$
	}

	public TextEmitter getPluginPropertiesGenerator() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::properties::properties");	//$NON-NLS-1$
	}

	public TextEmitter getAbstractExpressionEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::expressions::AbstractExpression::AbstractExpression");
	}
	
	public TextEmitter getOCLExpressionFactoryEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::expressions::OCLExpressionFactory::OCLExpressionFactory");
	}	
	
	public TextEmitter getRegexpExpressionFactoryEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::expressions::RegexpExpressionFactory::RegexpExpressionFactory");
	}

	public TextEmitter getOpenDiagramEditPolicyEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::diagram::policies::OpenDiagramEditPolicy::OpenDiagramEditPolicy");	//$NON-NLS-1$
	}

	public BinaryEmitter getDiagramIconEmitter() throws UnexpectedBehaviourException {
		return newGIFEmitterAdapter("/xpt/editor/diagram.gif"); //$NON-NLS-1$
	}

	public BinaryEmitter getWizardBannerImageEmitter() throws UnexpectedBehaviourException {
		return newGIFEmitterAdapter("/xpt/editor/wizban.gif"); //$NON-NLS-1$
	}

	public TextEmitter getWizardBannerStemEmitter()  throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::editor::CreationWizard::wizardBannerStem");	//$NON-NLS-1$
	}

	public TextEmitter getWizardBannerLocationEmitter()  throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::editor::CreationWizard::wizardBannerLocation");	//$NON-NLS-1$
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

	private static Bundle getCodegenTemplatesBundle() {
		return Platform.getBundle(CODEGEN_PLUGIN_ID);
	}

	public URL getJMergeControlFile() {
		return getCodegenTemplatesBundle().getEntry("/templates/emf-merge.xml");
	}

	public BinaryEmitter getShortcutImageEmitter() throws UnexpectedBehaviourException {
		return newGIFEmitter("/xpt/editor/shortcut.gif"); //$NON-NLS-1$
	}

	public TextEmitter getNavigatorContentProviderEmitter() {
		return retrieveXpand("xpt::navigator::NavigatorContentProvider::NavigatorContentProvider");	//$NON-NLS-1$
	}

	public TextEmitter getDomainNavigatorContentProviderEmitter() {
		return retrieveXpand("xpt::navigator::DomainNavigatorContentProvider::DomainNavigatorContentProvider"); //$NON-NLS-1$
	}
	
	public TextEmitter getDomainNavigatorLabelProviderEmitter() {
		return retrieveXpand("xpt::navigator::DomainNavigatorLabelProvider::DomainNavigatorLabelProvider"); //$NON-NLS-1$
	}
	
	public TextEmitter getDomainNavigatorItemEmitter() {
		return retrieveXpand("xpt::navigator::DomainNavigatorItem::DomainNavigatorItem"); //$NON-NLS-1$
	}
	
	public TextEmitter getDomainModelElementTesterEmitter() {
		return retrieveXpand("xpt::editor::DomainModelElementTester::DomainModelElementTester"); //$NON-NLS-1$
	}
	
	public TextEmitter getURIEditorInputTesterEmitter() {
		return retrieveXpand("xpt::editor::UriEditorInputTester::UriEditorInputTester"); //$NON-NLS-1$
	}

	public TextEmitter getNavigatorLabelProviderEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::navigator::NavigatorLabelProvider::NavigatorLabelProvider"); //$NON-NLS-1$
	}
	
	public TextEmitter getNavigatorLinkHelperEmitter() {
		return retrieveXpand("xpt::navigator::NavigatorLinkHelper::NavigatorLinkHelper"); //$NON-NLS-1$
	}
	
	public TextEmitter getNavigatorSorterEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::navigator::NavigatorSorter::NavigatorSorter");
	}
	
	public TextEmitter getNavigatorActionProviderEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::navigator::NavigatorActionProvider::NavigatorActionProvider"); //$NON-NLS-1$
	}
	
	public TextEmitter getAbstractNavigatorItemEmitter() throws UnexpectedBehaviourException {
		return retrieveXpand("xpt::navigator::AbstractNavigatorItem::AbstractNavigatorItem");
	}
	
	public TextEmitter getNavigatorGroupEmitter() {
		return retrieveXpand("xpt::navigator::NavigatorGroup::NavigatorGroup"); //$NON-NLS-1$
	}

	public TextEmitter getNavigatorItemEmitter() {
		return retrieveXpand("xpt::navigator::NavigatorItem::NavigatorItem"); //$NON-NLS-1$
	}

	public BinaryEmitter getGroupIconEmitter() throws UnexpectedBehaviourException {
		return newGIFEmitter("/xpt/navigator/navigatorGroup.gif"); //$NON-NLS-1$
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
