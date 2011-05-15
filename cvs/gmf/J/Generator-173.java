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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.gmf.codegen.gmfgen.ElementType;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenApplication;
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenCustomPropertyTab;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenEditorView;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer;
import org.eclipse.gmf.codegen.gmfgen.GenExternalNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenLanguage;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkLabel;
import org.eclipse.gmf.codegen.gmfgen.GenNavigatorChildReference;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.GenNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenPropertyTab;
import org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode;
import org.eclipse.gmf.codegen.gmfgen.MetamodelType;
import org.eclipse.gmf.codegen.gmfgen.OpenDiagramBehaviour;
import org.eclipse.gmf.codegen.gmfgen.SpecializationType;
import org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.gmf.internal.common.codegen.GeneratorBase;
import org.eclipse.gmf.internal.common.codegen.ImportUtil;
import org.eclipse.gmf.internal.common.codegen.TextEmitter;
import org.eclipse.gmf.internal.common.codegen.TextMerger;

/**
 * Invokes templates to populate diagram editor project.
 * 
 * @author artem
 */
public class Generator extends GeneratorBase implements Runnable {

	private final GenEditorGenerator myEditorGen; 

	private final GenDiagram myDiagram;

	private final CodegenEmitters myEmitters;

	public Generator(GenEditorGenerator genModel, CodegenEmitters emitters) {
		assert genModel != null && emitters != null;
		myEditorGen = genModel;
		myDiagram = genModel.getDiagram();
		myEmitters = emitters;
	}
	
	@Override
	protected TextMerger createMergeService() {
		TextMerger service = myEmitters.createMergeService();
		if (service != null) {
			return service;
		}
		return super.createMergeService();
	}

	protected void customRun() throws InterruptedException, UnexpectedBehaviourException {
		final String pluginID = myEditorGen.getPlugin().getID();
		initializeEditorProject(pluginID, guessProjectLocation(pluginID));
        
        // draft for messages
        generateExternalizationSupport();
        
		// commands
		generateReorientConnectionViewCommand();

		// edit helpers
		generateBaseEditHelper();
		
		// edit parts, edit policies and providers
		generateAbstractParser();
		generateStructuralFeatureParser();
		generateStructuralFeaturesParser();
		generateBaseItemSemanticEditPolicy();
		generateBehaviours(myDiagram);
		if (myDiagram.needsCanonicalEditPolicy()) {
			generateDiagramCanonicalEditPolicy();	
		}
		generateDiagramItemSemanticEditPolicy();
		generateTextSelectionEditPolicy();
		generateTextNonResizableEditPolicy();
		for (GenTopLevelNode node : myDiagram.getTopLevelNodes()) {
			generateNode(node);
		}
		for (GenChildNode node : myDiagram.getChildNodes()) {
			if (node instanceof GenChildLabelNode) {
				generateChildLabelNode((GenChildLabelNode) node);
			} else {
				generateNode(node);
			}
		}
		for (GenCompartment compartment : myDiagram.getCompartments()) {
			generateCompartmentEditPart(compartment);
			generateCompartmentItemSemanticEditPolicy(compartment);
			generateViewFactory(compartment);
			if (compartment.needsCanonicalEditPolicy()) {
				generateChildContainerCanonicalEditPolicy(compartment);
			}
		}
		for (GenLink next: myDiagram.getLinks()) {
			generateViewFactory(next);
			generateEditSupport(next);
			generateLinkEditPart(next);
			generateBehaviours(next);
			generateLinkItemSemanticEditPolicy(next);
			generateLinkCreateCommand(next);
			if (next.getModelFacet() instanceof TypeLinkModelFacet) {
				generateReorientLinkCommand(next);
			}
			for (GenLinkLabel label : next.getLabels()) {
				generateLinkLabelEditPart(label);
				generateLinkLabelViewFactory(label);
			}
		}
		generateEditSupport(myDiagram);
		generateViewFactory(myDiagram);
		generateDiagramEditPart();
		generateEditPartFactory();
		generateElementInitializers();
		generateElementTypes();
		generateViewProvider();
		generateEditPartProvider();
		if (myEditorGen.getPlugin().isPrintingEnabled()) {
			generateContributionItemProvider();
		}
		generateModelingAssistantProvider();
		generateIconProvider();
		generateParserProvider();
		if (myDiagram.isValidationEnabled() || myEditorGen.hasAudits()) {
			generateValidationProvider();
			if (myDiagram.getEditorGen().getApplication() == null) {
				generateMarkerNavigationProvider();
				if (myDiagram.isValidationDecorators()) {
					generateValidationDecoratorProvider();
				}
			}
		}
		if (myEditorGen.getMetrics() != null) {
			generateMetricProvider();
		}
		if (myEditorGen.getExpressionProviders() != null) {
			generateExpressionProviders();
		}

		// preferences
		generatePreferenceInitializer();
		generateAppearancePreferencePage();
		generateConnectionsPreferencePage();
		generateGeneralPreferencePage();
		generatePrintingPreferencePage();
		generateRulersAndGridPreferencePage();

		// editor
		generatePalette();
		generateDiagramEditorUtil();
		generateVisualIDRegistry();
		generateCreationWizard();
		generateCreationWizardPage();
		generateEditor();
		generateDocumentProvider();
		generateLoadResourceAction();
		if (myDiagram.getEditorGen().getApplication() == null) {
			generateCreateShortcutAction();
			generateCreateShortcutDecorationCommand();
			generateElementChooser();
			if (myDiagram.generateInitDiagramAction()) {
				generateInitDiagramFileAction();
				generateNewDiagramFileWizard();
			}
		}
		generateActionBarContributor();
		generateMatchingStrategy();
		if (myEditorGen.getNavigator() != null) {
			generateNavigatorContentProvider();
			generateNavigatorLabelProvider();
			generateNavigatorLinkHelper();
			generateNavigatorSorter();
			generateNavigatorActionProvider();
			generateAbstractNavigatorItem();
			generateNavigatorGroup();
			generateNavigatorItem();
			generateNavigatorGroupIcons();
			if (myEditorGen.getDomainGenModel() != null && myEditorGen.getNavigator().isGenerateDomainModelNavigator()) {
				generateDomainNavigatorContentProvider();
				generateDomainNavigatorLabelProvider();
				generateDomainModelElementTester();
			}
		}
		if (myEditorGen.getPropertySheet() != null) {
			generatePropertySheetSections();
		}
		// plug-in
		generatePluginClass();
		generateBundleManifest();
		generatePluginProperties();
		generateOptionsFile();
		generatePluginXml();
		generateBuildProperties();
		if (myDiagram.generateShortcutIcon()) {
			generateShortcutIcon();
			generateShortcutsDecoratorProvider();
			generateShortcutPropertyTester();
		}
		if (isPathInsideGenerationTarget(myDiagram.getCreationWizardIconPathX())) {
			// at the moment this may produce path that reference generated icon file, thus
			// skip generation if the path is relative
			generateDiagramIcon(myDiagram.getCreationWizardIconPathX());
		}
		if (isPathInsideGenerationTarget(myEditorGen.getEditor().getIconPathX())) {
			// at the moment this may produce path that reference generated icon file, thus
			// skip generation if the path is relative
			generateDiagramIcon(myEditorGen.getEditor().getIconPathX());
		}
		generateWizardBanner();
		generateApplication();
	}

	private static boolean isPathInsideGenerationTarget(String path) {
		assert path != null;
		Path p = new Path(path);
		return !p.isAbsolute() && !p.segment(0).equals(".."); //$NON-NLS-1$
	}

	private void generateNode(GenNode node) throws UnexpectedBehaviourException, InterruptedException {
		generateViewFactory(node);
		generateNodeItemSemanticEditPolicy(node);
		generateNodeCreateCommand(node);
		generateEditSupport(node);

		generateNodeEditPart(node);
		generateBehaviours(node);

		if (node.needsCanonicalEditPolicy()) {
			generateChildContainerCanonicalEditPolicy(node);
		}
		if (node.getModelFacet() != null && !node.getReorientedIncomingLinks().isEmpty()) {
			generateNodeGraphicalNodeEditPolicy(node);
		}
		for (GenNodeLabel label : node.getLabels()) {
			if (label instanceof GenExternalNodeLabel) {
				GenExternalNodeLabel extLabel = (GenExternalNodeLabel) label;
				generateExternalNodeLabelEditPart(extLabel);
				generateExternalNodeLabelViewFactory(extLabel);
			} else {
				generateNodeLabelEditPart(label);
				generateNodeLabelViewFactory(label);
			}
		}
	}
 
	private void generateChildLabelNode(GenChildLabelNode child) throws UnexpectedBehaviourException, InterruptedException {
		generateViewFactory(child);
		generateNodeItemSemanticEditPolicy(child);
		generateNodeCreateCommand(child);
		generateEditSupport(child);

		generateChildNodeLabelEditPart(child);
	}

	// commands

	private void generateReorientConnectionViewCommand() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getReorientConnectionViewCommandEmitter(),
			myDiagram.getEditCommandsPackageName(),
			myDiagram.getReorientConnectionViewCommandClassName(),
			myDiagram
		);
	}

	// helpers

	private void generateBaseEditHelper() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getBaseEditHelperEmitter(),
			myDiagram.getEditHelpersPackageName(),
			myDiagram.getBaseEditHelperClassName(),
			myDiagram
		);
	}

	private void generateEditSupport(GenCommonBase diagramElement) throws UnexpectedBehaviourException, InterruptedException {
		ElementType genType = diagramElement.getElementType();
		if (genType.isDefinedExternally()) {
			return;
		}
		if (genType instanceof SpecializationType) {
			generateEditHelperAdvice((SpecializationType) genType);
		} else if (genType instanceof MetamodelType) {
			generateEditHelper((MetamodelType) genType);
		}
	}

	private void generateEditHelper(MetamodelType genType) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getEditHelperEmitter(),
			myDiagram.getEditHelpersPackageName(),
			genType.getEditHelperClassName(),
			genType
		);
	}

	private void generateEditHelperAdvice(SpecializationType genType) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getEditHelperAdviceEmitter(),
			myDiagram.getEditHelpersPackageName(),
			genType.getEditHelperAdviceClassName(),
			genType
		);
	}

	// parts

	private void generateDiagramEditPart() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getDiagramEditPartEmitter(), myDiagram.getEditPartQualifiedClassName(), myDiagram);
	}

	private void generateNodeEditPart(GenNode node) throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getNodeEditPartEmitter(), node.getEditPartQualifiedClassName(), node);
	}

	private void generateNodeLabelEditPart(GenNodeLabel label) throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getNodeLabelEditPartEmitter(), label.getEditPartQualifiedClassName(), label);
	}

	private void generateExternalNodeLabelEditPart(GenExternalNodeLabel label) throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getExternalNodeLabelEditPartEmitter(), label.getEditPartQualifiedClassName(), label);
	}

	private void generateChildNodeLabelEditPart(GenChildLabelNode node) throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getChildNodeLabelEditPartEmitter(), node.getEditPartQualifiedClassName(), node);
	}
	
	private void generateCompartmentEditPart(GenCompartment compartment) throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getCompartmentEditPartEmitter(), compartment.getEditPartQualifiedClassName(), compartment);
	}

	private void generateLinkEditPart(GenLink link) throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getLinkEditPartEmitter(), link.getEditPartQualifiedClassName(), link);
	}

	private void generateLinkLabelEditPart(GenLinkLabel label) throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getLinkLabelEditPartEmitter(), label.getEditPartQualifiedClassName(), label);
	}

	private void generateEditPartFactory() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getEditPartFactoryEmitter(), myDiagram.getEditPartFactoryQualifiedClassName(), myDiagram);
	}

	// edit policies

	private void generateBaseItemSemanticEditPolicy() throws InterruptedException {
		Collection<GenCommonBase> allSemanticElements = new ArrayList<GenCommonBase>(myDiagram.getAllContainers());
		allSemanticElements.addAll(myDiagram.getLinks());
		boolean isSansDomainModel = true;
		for (Iterator<GenCommonBase> it = allSemanticElements.iterator(); it.hasNext() && isSansDomainModel;) {
			GenCommonBase nextCommonBase = it.next();
			if (!nextCommonBase.isSansDomain()) {
				isSansDomainModel = false;
			}
		}
		if (isSansDomainModel) {
			return;
		}
		doGenerateJavaClass(myEmitters.getBaseItemSemanticEditPolicyEmitter(), myDiagram.getBaseItemSemanticEditPolicyQualifiedClassName(), myDiagram);
	}

	/**
	 * Generate classes for behaviours specified for the diagram element. 
	 * As part of its job, this method tries not to generate shared policies more than once.
	 */
	private void generateBehaviours(GenCommonBase commonBase) throws UnexpectedBehaviourException, InterruptedException {
		for (OpenDiagramBehaviour behaviour : commonBase.getBehaviour(OpenDiagramBehaviour.class)) {
			if (behaviour.getSubject() == commonBase) { // extravagant way to check whether this behaviour is shared or not
				generateOpenDiagramEditPolicy(behaviour);
			}
		}
	}

	private void generateOpenDiagramEditPolicy(OpenDiagramBehaviour behaviour) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(myEmitters.getOpenDiagramEditPolicyEmitter(), behaviour.getEditPolicyQualifiedClassName(), behaviour);
	}

	private void generateDiagramCanonicalEditPolicy() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getDiagramCanonicalEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			myDiagram.getCanonicalEditPolicyClassName(),
			myDiagram
		);
	}

	private void generateChildContainerCanonicalEditPolicy(GenChildContainer genContainer) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getChildContainerCanonicalEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			genContainer.getCanonicalEditPolicyClassName(),
			genContainer
		);
	}

	private void generateDiagramItemSemanticEditPolicy() throws UnexpectedBehaviourException, InterruptedException {
		if (myDiagram.isSansDomain()) {
			return;
		}
		internalGenerateJavaClass(
			myEmitters.getDiagramItemSemanticEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			myDiagram.getItemSemanticEditPolicyClassName(),
			myDiagram
		);
	}

	private void generateCompartmentItemSemanticEditPolicy(GenCompartment genCompartment) throws UnexpectedBehaviourException, InterruptedException {
		if (genCompartment.isSansDomain()) {
			return;
		}
		internalGenerateJavaClass(
			myEmitters.getCompartmentItemSemanticEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			genCompartment.getItemSemanticEditPolicyClassName(),
			genCompartment
		);
	}

	private void generateNodeGraphicalNodeEditPolicy(GenNode genNode) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getGraphicalNodeEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			genNode.getGraphicalNodeEditPolicyClassName(),
			genNode
		);
	}

	private void generateNodeItemSemanticEditPolicy(GenNode genNode) throws InterruptedException {
		if (genNode.isSansDomain()) {
			return;
		}
		doGenerateJavaClass(myEmitters.getNodeItemSemanticEditPolicyEmitter(), genNode.getItemSemanticEditPolicyQualifiedClassName(), genNode);
	}
	
	private void generateNodeCreateCommand(GenNode genNode) throws InterruptedException, UnexpectedBehaviourException {
		if (genNode.getModelFacet() == null) {
			return;
		}
		internalGenerateJavaClass(
				myEmitters.getNodeCreateCommandEmitter(),
				myDiagram.getEditCommandsPackageName(),
				genNode.getCreateCommandClassName(),
				genNode
			);
	}

	private void generateLinkItemSemanticEditPolicy(GenLink genLink) throws UnexpectedBehaviourException, InterruptedException {
		if (genLink.isSansDomain()) {
			return;
		}
		internalGenerateJavaClass(
			myEmitters.getLinkItemSemanticEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			genLink.getItemSemanticEditPolicyClassName(),
			genLink
		);
	}
	
	private void generateLinkCreateCommand(GenLink genLink) throws InterruptedException, UnexpectedBehaviourException {
		if (false == genLink.getModelFacet() instanceof TypeLinkModelFacet) {
			return;
		}
		TypeLinkModelFacet modelFacet = (TypeLinkModelFacet) genLink.getModelFacet();
		internalGenerateJavaClass(
				myEmitters.getCreateTypeLinkCommandEmitter(),
				myDiagram.getEditCommandsPackageName(),
				modelFacet.getCreateCommandClassName(),
				genLink
			);
	}

	private void generateReorientLinkCommand(GenLink link) throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getReorientLinkCommandEmitter(), link.getReorientCommandQualifiedClassName(), link);
	}

	private void generateTextSelectionEditPolicy() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getTextSelectionEditPolicyEmitter(), myDiagram.getTextSelectionEditPolicyQualifiedClassName(), myDiagram);
	}

	private void generateTextNonResizableEditPolicy() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getTextNonResizableEditPolicyEmitter(), myDiagram.getTextNonResizableEditPolicyQualifiedClassName(), myDiagram);
	}

	// preferences

	private void generatePreferenceInitializer() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getPreferenceInitializerEmitter(), myEmitters.getPreferenceInitializerName(myDiagram), myDiagram);
	}

	private void generateAppearancePreferencePage() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getAppearancePreferencePageEmitter(), myEmitters.getAppearancePreferencePageName(myDiagram), myDiagram);
	}

	private void generateConnectionsPreferencePage() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getConnectionsPreferencePageEmitter(), myEmitters.getConnectionsPreferencePageName(myDiagram), myDiagram);
	}

	private void generateGeneralPreferencePage() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getGeneralPreferencePageEmitter(), myEmitters.getGeneralPreferencePageName(myDiagram), myDiagram);
	}

	private void generatePrintingPreferencePage() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getPrintingPreferencePageEmitter(), myEmitters.getPrintingPreferencePageName(myDiagram), myDiagram);
	}

	private void generateRulersAndGridPreferencePage() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getRulersAndGridPreferencePageEmitter(), myEmitters.getRulersAndGridPreferencePageName(myDiagram), myDiagram);
	}

	// providers

	private void generateAbstractParser() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getAbstractParserEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getAbstractParserClassName(),
			myDiagram
		);
	}

	private void generateStructuralFeatureParser() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getStructuralFeatureParserEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getStructuralFeatureParserClassName(),
			myDiagram
		);
	}

	private void generateStructuralFeaturesParser() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getStructuralFeaturesParserEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getStructuralFeaturesParserClassName(),
			myDiagram
		);
	}

	private void generateElementInitializers() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getElementInitializersEmitter(),
			myDiagram.getProvidersPackageName(),
			"ElementInitializers",
			myDiagram
		);
	}

	private void generateElementTypes() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getElementTypesEmitter(), myDiagram.getElementTypesQualifiedClassName(), myDiagram);
	}

	private void generateViewProvider() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getViewProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getNotationViewProviderClassName(),
			myDiagram
		);
	}

	private void generateEditPartProvider() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getEditPartProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getEditPartProviderClassName(),
			myDiagram
		);
	}

	private void generateContributionItemProvider() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
				myEmitters.getContributionItemProviderEmitter(),
				myDiagram.getProvidersPackageName(),
				myDiagram.getContributionItemProviderClassName(),
				myDiagram
			);
	}
	
	private void generateModelingAssistantProvider() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getModelingAssistantProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getModelingAssistantProviderClassName(),
			myDiagram);
	}

	private void generateIconProvider() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getIconProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getIconProviderClassName(),
			myDiagram);
	}

	private void generateParserProvider() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getParserProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getParserProviderClassName(),
			myDiagram);
	}

	private void generateValidationProvider() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getValidationProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getValidationProviderClassName(),
			myDiagram);
	}

	private void generateValidationDecoratorProvider() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getValidationDecoratorProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getValidationDecoratorProviderClassName(),
			myDiagram);
	}	

	private void generateShortcutsDecoratorProvider() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getShortcutsDecoratorProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getShortcutsDecoratorProviderClassName(),
			myDiagram);
	}
	
	private void generateShortcutPropertyTester() throws InterruptedException, UnexpectedBehaviourException {
		internalGenerateJavaClass(
				myEmitters.getShortcutPropertyTesterEmitter(),
				myEditorGen.getEditor().getPackageName(),
				myDiagram.getShortcutPropertyTesterClassName(),
				myDiagram);
	}

	private void generateMetricProvider() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getMetricProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getMetricProviderClassName(),
			myDiagram);
	}	
	
	private void generateMarkerNavigationProvider() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getMarkerNavigationProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getMarkerNavigationProviderClassName(),
			myDiagram);
	}	

	// notation view factories

	private void generateViewFactory(GenCommonBase genElement) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getViewFactoryEmitter(),
			myDiagram.getNotationViewFactoriesPackageName(),
			genElement.getNotationViewFactoryClassName(),
			genElement
		);
	}

	private void generateLinkLabelViewFactory(GenLinkLabel label) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getLabelViewFactoryEmitter(),
			myDiagram.getNotationViewFactoriesPackageName(),
			label.getNotationViewFactoryClassName(),
			label
		);
	}

	private void generateExternalNodeLabelViewFactory(GenExternalNodeLabel label) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getLabelViewFactoryEmitter(),
			myDiagram.getNotationViewFactoriesPackageName(),
			label.getNotationViewFactoryClassName(),
			label
		);
	}

	private void generateNodeLabelViewFactory(GenNodeLabel label) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getLabelTextViewFactoryEmitter(),
			myDiagram.getNotationViewFactoriesPackageName(),
			label.getNotationViewFactoryClassName(),
			label
		);
	}

	// editor

	private void generateInitDiagramFileAction() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getInitDiagramFileActionEmitter(), myEmitters.getInitDiagramFileActionName(myDiagram), myDiagram);
	}

	private void generateNewDiagramFileWizard() throws UnexpectedBehaviourException, InterruptedException {
		if (!myDiagram.isSynchronized()) {
			internalGenerateJavaClass(
					myEmitters.getDiagramContentsInitializerEmitter(),
					myEditorGen.getEditor().getPackageName(),
					"DiagramContentsInitializer",
					myDiagram);
		}
		doGenerateJavaClass(myEmitters.getNewDiagramFileWizardEmitter(), myEmitters.getNewDiagramFileWizardName(myDiagram), myDiagram);
	}

	private void generatePalette() throws UnexpectedBehaviourException, InterruptedException {
		if (myDiagram.getPalette() == null) {
			return;
		}
		doGenerateJavaClass(myEmitters.getPaletteEmitter(), myDiagram.getPalette().getFactoryQualifiedClassName(), myDiagram.getPalette());
	}

	private void generateDiagramEditorUtil() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getDiagramEditorUtilEmitter(),
			myEditorGen.getEditor().getPackageName(),
			myDiagram.getDiagramEditorUtilClassName(),
			myDiagram
		);
	}
	
	private void generateVisualIDRegistry() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getVisualIDRegistryEmitter(),
			myEditorGen.getEditor().getPackageName(),
			myDiagram.getVisualIDRegistryClassName(),
			myDiagram
		);
	}

	private void generateCreationWizard() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getCreationWizardEmitter(),
			myEditorGen.getEditor().getPackageName(),
			myDiagram.getCreationWizardClassName(),
			myDiagram
		);
	}

	private void generateCreationWizardPage() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getCreationWizardPageEmitter(),
			myEditorGen.getEditor().getPackageName(),
			myDiagram.getCreationWizardPageClassName(),
			myDiagram
		);
	}

	private void generateEditor() throws UnexpectedBehaviourException, InterruptedException {
		final GenEditorView editor = myEditorGen.getEditor();
		internalGenerateJavaClass(
			myEmitters.getEditorEmitter(),
			editor.getPackageName(),
			editor.getClassName(),
			editor
		);
	}
	
	private void generateCreateShortcutAction() throws UnexpectedBehaviourException, InterruptedException {
		if (!myDiagram.generateCreateShortcutAction()) {
			return;
		}
		internalGenerateJavaClass(
				myEmitters.getCreateShortcutActionEmitter(),
				myEditorGen.getEditor().getPackageName(), 
				myDiagram.getCreateShortcutActionClassName(),
				myDiagram
			);
	}
	
	private void generateCreateShortcutDecorationCommand() throws InterruptedException, UnexpectedBehaviourException {
		if (!myDiagram.generateCreateShortcutAction()) {
			return;
		}
		internalGenerateJavaClass(
				myEmitters.getCreateShortcutDecorationCommandEmitter(),
				myDiagram.getEditCommandsPackageName(), 
				myDiagram.getCreateShortcutDecorationsCommandClassName(),
				myDiagram
			);
	}
	
	private void generateLoadResourceAction() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
				myEmitters.getLoadResourceActionEmitter(),
				myEditorGen.getEditor().getPackageName(), 
				myDiagram.getLoadResourceActionClassName(),
				myDiagram
			);
	}
	
	private void generateElementChooser() throws UnexpectedBehaviourException, InterruptedException {
		if (!myDiagram.generateCreateShortcutAction()) {
			return;
		}
		internalGenerateJavaClass(
				myEmitters.getElementChooserEmitter(),
				myEditorGen.getEditor().getPackageName(), 
				myDiagram.getElementChooserClassName(),
				myDiagram
			);
	}
	
	private void generateDocumentProvider() throws InterruptedException {
		doGenerateJavaClass(myEmitters.getDocumentProviderEmitter(), myDiagram.getDocumentProviderQualifiedClassName(), myDiagram);
	}

	private void generateActionBarContributor() throws UnexpectedBehaviourException, InterruptedException {
		final GenEditorView editor = myEditorGen.getEditor();
		internalGenerateJavaClass(
			myEmitters.getActionBarContributorEmitter(),
			editor.getPackageName(),
			editor.getActionBarContributorClassName(),
			editor
		);
	}

	private void generateMatchingStrategy() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getMatchingStrategyEmitter(),
			myEditorGen.getEditor().getPackageName(),
			myDiagram.getMatchingStrategyClassName(),
			myDiagram
		);
	}
	
	private void generateNavigatorContentProvider() throws InterruptedException {
		doGenerateJavaClass(myEmitters.getNavigatorContentProviderEmitter(), myEditorGen.getNavigator().getContentProviderQualifiedClassName(), myEditorGen.getNavigator());
	}
	
	private void generateDomainNavigatorContentProvider() throws InterruptedException {
		doGenerateJavaClass(myEmitters.getDomainNavigatorContentProviderEmitter(), myEditorGen.getNavigator().getDomainContentProviderQualifiedClassName(), myEditorGen.getNavigator());
	}
	
	private void generateDomainNavigatorLabelProvider() throws InterruptedException {
		doGenerateJavaClass(myEmitters.getDomainNavigatorLabelProviderEmitter(), myEditorGen.getNavigator().getDomainLabelProviderQualifiedClassName(), myEditorGen.getNavigator());
	}
	
	private void generateDomainModelElementTester() throws InterruptedException {
		doGenerateJavaClass(myEmitters.getDomainModelElementTesterEmitter(), myEditorGen.getNavigator().getDomainModelElementTesterQualifiedClassName(), myEditorGen.getNavigator());
	}

	private void generateNavigatorLabelProvider() throws InterruptedException, UnexpectedBehaviourException {
		internalGenerateJavaClass(
				myEmitters.getNavigatorLabelProviderEmitter(),
				myEditorGen.getNavigator().getPackageName(),
				myEditorGen.getNavigator().getLabelProviderClassName(),
				myEditorGen.getNavigator()
			);
	}
	
	private void generateNavigatorLinkHelper() throws InterruptedException, UnexpectedBehaviourException {
		internalGenerateJavaClass(
				myEmitters.getNavigatorLinkHelperEmitter(),
				myEditorGen.getNavigator().getPackageName(),
				myEditorGen.getNavigator().getLinkHelperClassName(), 
				myEditorGen.getNavigator()
			);
	}
	
	private void generateNavigatorSorter() throws InterruptedException, UnexpectedBehaviourException {
		internalGenerateJavaClass(
				myEmitters.getNavigatorSorterEmitter(),
				myEditorGen.getNavigator().getPackageName(),
				myEditorGen.getNavigator().getSorterClassName(), 
				myEditorGen.getNavigator()
			);
	}
	
	private void generateNavigatorActionProvider() throws InterruptedException, UnexpectedBehaviourException {
		internalGenerateJavaClass(
				myEmitters.getNavigatorActionProviderEmitter(),
				myEditorGen.getNavigator().getPackageName(),
				myEditorGen.getNavigator().getActionProviderClassName(), 
				myEditorGen.getNavigator()
			);
	}
	
	private void generateAbstractNavigatorItem() throws InterruptedException, UnexpectedBehaviourException {
		internalGenerateJavaClass(
				myEmitters.getAbstractNavigatorItemEmitter(),
				myEditorGen.getNavigator().getPackageName(),
				myEditorGen.getNavigator().getAbstractNavigatorItemClassName(),
				myEditorGen.getNavigator()
			);
	}
	
	private void generateNavigatorGroup() throws InterruptedException, UnexpectedBehaviourException {
		internalGenerateJavaClass(
				myEmitters.getNavigatorGroupEmitter(),
				myEditorGen.getNavigator().getPackageName(),
				myEditorGen.getNavigator().getNavigatorGroupClassName(),
				myEditorGen.getNavigator()
			);
	}
	
	private void generateNavigatorItem() throws InterruptedException, UnexpectedBehaviourException {
		internalGenerateJavaClass(
				myEmitters.getNavigatorItemEmitter(),
				myEditorGen.getNavigator().getPackageName(),
				myEditorGen.getNavigator().getNavigatorItemClassName(),
				myEditorGen.getNavigator()
			);
	}
	
	private void generateNavigatorGroupIcons() throws InterruptedException, UnexpectedBehaviourException {
		Set<String> groupIcons = new HashSet<String>(); 
		for (GenNavigatorChildReference nextReference : myEditorGen.getNavigator().getChildReferences()) {
			if (nextReference.getGroupIcon() != null && nextReference.getGroupIcon().length() > 0) {
				groupIcons.add(nextReference.getGroupIcon());
			}
		}
		for (String iconPath : groupIcons) {
			generateGroupIcon(new Path(iconPath));
		}
	}
	
	private void generatePluginClass() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getPluginClassEmitter(),
			myEditorGen.getEditor().getPackageName(), 
			myEditorGen.getPlugin().getActivatorClassName(),
			myEditorGen.getPlugin()
		);
	}

	// property sheet 

	protected void generatePropertySheetSections() throws UnexpectedBehaviourException, InterruptedException {
		if (myEditorGen.getPropertySheet().isNeedsCaption()) {
			internalGenerateJavaClass(
				myEmitters.getPropertySheetLabelProviderEmitter(), 
				myEditorGen.getPropertySheet().getLabelProviderQualifiedClassName(), 
				myEditorGen.getPropertySheet());
		}
		for (GenPropertyTab tab : myEditorGen.getPropertySheet().getTabs()) {
			if (tab instanceof GenCustomPropertyTab) {
				internalGenerateJavaClass(
					myEmitters.getPropertySectionEmitter(),
					((GenCustomPropertyTab) tab).getQualifiedClassName(),
					tab);
			}
		}
	}

	// expressions
	
	private void generateExpressionProviders() throws UnexpectedBehaviourException, InterruptedException {
		GenExpressionProviderContainer providerContainer = myEditorGen.getExpressionProviders();
		internalGenerateJavaClass(
			myEmitters.getAbstractExpressionEmitter(),
			providerContainer.getExpressionsPackageName(), 
			providerContainer.getAbstractExpressionClassName(),
			myDiagram
		);

		for (GenExpressionProviderBase nextProvider : providerContainer.getProviders()) {
			if(nextProvider instanceof GenExpressionInterpreter) {
				TextEmitter providerEmitter = null;
				if(GenLanguage.OCL_LITERAL.equals(nextProvider.getLanguage())) {
					providerEmitter = myEmitters.getOCLExpressionFactoryEmitter();
				} else if(GenLanguage.REGEXP_LITERAL.equals(nextProvider.getLanguage()) || GenLanguage.NREGEXP_LITERAL.equals(nextProvider.getLanguage())) {
					providerEmitter = myEmitters.getRegexpExpressionFactoryEmitter();
				}
				GenExpressionInterpreter interpreter = (GenExpressionInterpreter) nextProvider;
				if(providerEmitter != null) {
					internalGenerateJavaClass(
							providerEmitter,
							providerContainer.getExpressionsPackageName(),
							interpreter.getClassName(),
							interpreter);
				}
			}
		}
	}
	

	private void generatePluginXml() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateFile(myEmitters.getPluginXmlEmitter(), new Path("plugin.xml"), new Object[] { myDiagram.getEditorGen().getPlugin() }); //$NON-NLS-1$
	}

	private void generatePluginProperties() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateFile(myEmitters.getPluginPropertiesEmitter(), new Path("plugin.properties"), new Object[] { myDiagram.getEditorGen().getPlugin() }); //$NON-NLS-1$
	}
	
	private void generateOptionsFile() throws InterruptedException, UnexpectedBehaviourException {
		doGenerateFile(myEmitters.getOptionsFileEmitter(), new Path(".options"), new Object[] { myDiagram.getEditorGen().getPlugin()  }); //$NON-NLS-1$
	}

	private void generateBundleManifest() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateFile(myEmitters.getBundleManifestEmitter(), new Path("META-INF/MANIFEST.MF"), new Object[] { myDiagram.getEditorGen().getPlugin() }); //$NON-NLS-1$
	}

	private void generateBuildProperties() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateFile(myEmitters.getBuildPropertiesEmitter(), new Path("build.properties"), new Object[] { myDiagram }); //$NON-NLS-1$
	}
	
	private void generateShortcutIcon() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateBinaryFile(myEmitters.getShortcutImageEmitter(), new Path("icons/shortcut.gif"), null); //$NON-NLS-1$
	}
	
	private void generateGroupIcon(Path groupIconPath) throws InterruptedException, UnexpectedBehaviourException {
		doGenerateBinaryFile(myEmitters.getGroupIconEmitter(), groupIconPath, null);	
	}

	private void generateDiagramIcon(String path) throws UnexpectedBehaviourException, InterruptedException {
		// use genModel.prefix if available to match colors of model icons and diagram icons
		// @see GenPackageImpl#generateEditor - it passes prefix to ModelGIFEmitter 
		Object[] args = new Object[] {myDiagram.getDomainDiagramElement() == null ? myEditorGen.getDiagramFileExtension() : myDiagram.getDomainDiagramElement().getGenPackage().getPrefix() };
		doGenerateBinaryFile(myEmitters.getDiagramIconEmitter(), new Path(path), args);
	}

	private void generateWizardBanner() throws UnexpectedBehaviourException, InterruptedException {
		String stem = myDiagram.getDomainDiagramElement() == null ? "" : myDiagram.getDomainDiagramElement().getGenPackage().getPrefix(); //$NON-NLS-1$
		// @see GenPackageImpl#generateEditor - it passes prefix to ModelWizardGIFEmitter
		Object[] args = new Object[] {stem.length() == 0 ? myEditorGen.getDiagramFileExtension() : stem };
		doGenerateBinaryFile(myEmitters.getWizardBannerImageEmitter(), new Path("icons/wizban/New" + stem + "Wizard.gif"), args); //$NON-NLS-1$ //$NON-NLS-2$
	}

	// application

	private void generateApplication() throws UnexpectedBehaviourException, InterruptedException {
		GenApplication application = myEditorGen.getApplication();
		if (application != null) {
			generateApplication(application);
			generateActionBarAdvisor(application);
			generatePerspective(application);
			generateWorkbenchAdvisor(application);
			generateWorkbenchWindowAdvisor(application);
			generateWizardNewFileCreationPage(application);
		}
	}

	private void generateApplication(GenApplication application) throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getApplicationEmitter(), application.getQualifiedClassName(), application);
	}

	private void generateActionBarAdvisor(GenApplication application) throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getActionBarAdvisorEmitter(), application.getActionBarAdvisorQualifiedClassName(), application);
	}

	private void generatePerspective(GenApplication application) throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getPerspectiveEmitter(), application.getPerspectiveQualifiedClassName(), application);
	}

	private void generateWorkbenchAdvisor(GenApplication application) throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getWorkbenchAdvisorEmitter(), application.getWorkbenchAdvisorQualifiedClassName(), application);
	}

	private void generateWorkbenchWindowAdvisor(GenApplication application) throws UnexpectedBehaviourException, InterruptedException {
		doGenerateJavaClass(myEmitters.getWorkbenchWindowAdvisorEmitter(), application.getWorkbenchWindowAdvisorQualifiedClassName(), application);
	}

	private void generateWizardNewFileCreationPage(GenApplication application) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getWizardNewFileCreationPageEmitter(),
			application.getPackageName(),
			"WizardNewFileCreationPage", //$NON-NLS-1$
			application
		);
	}

    private void generateExternalizationSupport() throws UnexpectedBehaviourException, InterruptedException {
        String packageName = myEditorGen.getEditor().getPackageName();
        String messagesClassName = "Messages";
        doGenerateJavaClass(myEmitters.getExternalizeEmitter(), packageName, messagesClassName, new Object[] { myEditorGen });
        doGenerateFile(myEmitters.getMessagesEmitter(), new Path(messagesClassName.toLowerCase()+".properties"), new Object[] { myEditorGen });
    }
    
	// util

	/**
	 * Passes initialized ImportManager as second template argument
	 */
	private void internalGenerateJavaClass(TextEmitter emitter, String packageName, String className, Object argument) throws InterruptedException {
		ImportUtil importUtil = new ImportUtil(packageName, className);
		doGenerateJavaClass(emitter, packageName, className, argument, importUtil);
	}

	private void internalGenerateJavaClass(TextEmitter emitter, String qualifiedName, Object argument) throws InterruptedException {
		internalGenerateJavaClass(emitter, CodeGenUtil.getPackageName(qualifiedName), CodeGenUtil.getSimpleClassName(qualifiedName), argument);
	}

	private IPath guessProjectLocation(String projectName) {
		if (myEditorGen.getDomainGenModel() == null) {
			return null;
		}
		Path modelProjectPath = new Path(myEditorGen.getDomainGenModel().getModelDirectory());
		return guessNewProjectLocation(modelProjectPath, projectName);
	}

	protected void setupProgressMonitor() {
		Counter c = new Counter();
		c.registerFactor(GMFGenPackage.eINSTANCE.getGenNode(), 7);
		c.registerFactor(GMFGenPackage.eINSTANCE.getGenChildLabelNode(), 5);
		c.registerFactor(GMFGenPackage.eINSTANCE.getGenLink(), 6);
		c.registerFactor(GMFGenPackage.eINSTANCE.getGenLinkLabel(), 2);
		c.registerFactor(GMFGenPackage.eINSTANCE.getGenCompartment(), 4);
		c.registerFactor(GMFGenPackage.eINSTANCE.getGenDiagram(), 40);
		c.registerFactor(GMFGenPackage.eINSTANCE.getGenEditorGenerator(), 2); // i18n=2
		c.registerFactor(GMFGenPackage.eINSTANCE.getGenPlugin(), 6);
		c.registerFactor(GMFGenPackage.eINSTANCE.getGenNavigator(), 3);
		c.registerFactor(GMFGenPackage.eINSTANCE.getGenNavigatorChildReference(), 1);
		c.registerFactor(GMFGenPackage.eINSTANCE.getGenCustomPropertyTab(), 1);
		c.registerFactor(GMFGenPackage.eINSTANCE.getBehaviour(), 1);
		c.registerFactor(GMFGenPackage.eINSTANCE.getGenMetricContainer(), 1);
		c.registerFactor(GMFGenPackage.eINSTANCE.getGenExpressionProviderContainer(), 1);
		c.registerFactor(GMFGenPackage.eINSTANCE.getPalette(), 1);
		setupProgressMonitor(null, c.getTotal(myEditorGen));
	}
}