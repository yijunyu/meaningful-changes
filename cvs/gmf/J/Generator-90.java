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

import java.io.ByteArrayInputStream;
import java.lang.ref.SoftReference;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.codegen.jet.JETEmitter;
import org.eclipse.emf.codegen.util.CodeGenUtil.EclipseUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.codegen.gmfgen.ElementType;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenEditorView;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer;
import org.eclipse.gmf.codegen.gmfgen.GenExternalNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkLabel;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.GenNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode;
import org.eclipse.gmf.codegen.gmfgen.MetamodelType;
import org.eclipse.gmf.codegen.gmfgen.SpecializationType;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.gmf.internal.common.codegen.GeneratorBase;
import org.eclipse.gmf.internal.common.codegen.ImportUtil;
import org.eclipse.gmf.internal.common.codegen.JETEmitterAdapter;

/**
 * Invokes JET templates to populate diagram editor project.
 * 
 * @author artem
 */
public class Generator extends GeneratorBase implements Runnable {

	private final GenEditorGenerator myEditorGen; 

	private final GenDiagram myDiagram;

	private CodegenEmitters myEmitters;

	private static Map/*<URI, SoftReference>*/ myCachedURI2EmitterMap = new HashMap();

	public Generator(GenEditorGenerator genModel) {
		myEditorGen = genModel;
		myDiagram = genModel.getDiagram();
		URI resourceURI = myEditorGen.eResource().getURI();
		if (myEditorGen.isDynamicTemplates()) {
			myCachedURI2EmitterMap.remove(resourceURI);
		}
		CodegenEmitters old = myCachedURI2EmitterMap.containsKey(resourceURI) ? (CodegenEmitters) ((SoftReference) myCachedURI2EmitterMap.get(resourceURI)).get() : null;
		if (old == null) {
			myEmitters = new CodegenEmitters(!myEditorGen.isDynamicTemplates(), myEditorGen.getTemplateDirectory());
			if (!myEditorGen.isDynamicTemplates()) {
				myCachedURI2EmitterMap.put(resourceURI, new SoftReference(myEmitters));
			}
		} else {
			myEmitters = old;
		}
	}
	
	protected URL getJMergeControlFile() {
		return myEmitters.getJMergeControlFile();
	}

	protected void customRun() throws InterruptedException, UnexpectedBehaviourException {
		final String pluginID = myEditorGen.getPlugin().getID();
		initializeEditorProject(pluginID, guessProjectLocation(pluginID));
		// commands
		generateReorientConnectionViewCommand();

		// edit helpers
		generateBaseEditHelper();
		
		// edit parts, edit policies and providers
		generateAbstractParser();
		generateStructuralFeatureParser();
		generateStructuralFeaturesParser();
		generateBaseItemSemanticEditPolicy();
		generateBaseGraphicalNodeEditPolicy();
		generateDiagramCanonicalEditPolicy();
		generateDiagramItemSemanticEditPolicy();
		generateTextSelectionEditPolicy();
		generateTextNonResizableEditPolicy();
		for (Iterator nodes = myDiagram.getTopLevelNodes().iterator(); nodes.hasNext();) {
			GenTopLevelNode node = (GenTopLevelNode) nodes.next();
			generateNode(node);
		}
		for (Iterator nodes = myDiagram.getChildNodes().iterator(); nodes.hasNext();) {
			GenChildNode node = (GenChildNode) nodes.next();
			if (node instanceof GenChildLabelNode) {
				generateChildLabelNode((GenChildLabelNode) node);
			} else {
				generateNode(node);
			}
		}
		for (Iterator compartments = myDiagram.getCompartments().iterator(); compartments.hasNext();) {
			GenCompartment compartment = (GenCompartment) compartments.next();
			generateCompartmentEditPart(compartment);
			generateCompartmentItemSemanticEditPolicy(compartment);
			generateViewFactory(compartment);
			generateChildContainerCanonicalEditPolicy(compartment);
		}
		for (Iterator it = myDiagram.getLinks().iterator(); it.hasNext();) {
			final GenLink next = (GenLink) it.next();
			generateViewFactory(next);
			generateEditSupport(next);
			generateLinkEditPart(next);
			if (next.getModelFacet() != null) {
				generateLinkItemSemanticEditPolicy(next);
			}
			for (Iterator labels = next.getLabels().iterator(); labels.hasNext();) {
				GenLinkLabel label = (GenLinkLabel) labels.next();
				generateLinkLabelEditPart(label);
				generateLinkLabelViewFactory(label);
			}
		}
		generateEditSupport(myDiagram);
		generateViewFactory(myDiagram);
		generateDiagramEditPart();
		generateDiagramExternalNodeLabelEditPart();
		generateEditPartFactory();
		generateElementTypes();
		generateViewProvider();
		generateEditPartProvider();
		generatePaletteProvider();
		generateModelingAssistantProvider();
		generatePropertyProvider();
		generateIconProvider();
		generateParserProvider();
		if(myDiagram.isValidationEnabled()) {
			generateValidationProvider();
			generateMarkerNavigationProvider();				
			if(myDiagram.isValidationDecorators()) {
				generateValidationDecoratorProvider();
			}
		}
		if(myDiagram.getEditorGen().getMetrics() != null) {
			generateMetricProvider();
		}
		if(myDiagram.getEditorGen().getExpressionProviders() != null) {
			generateExpressionProviders();
		}

		// editor
		generateInitDiagramFileAction();
		generateNewDiagramFileWizard();
		generatePalette();
		generateDiagramEditorUtil();
		generateDiagramFileCreator();
		generateVisualIDRegistry();
		generateCreationWizard();
		generateCreationWizardPage();
		generateEditor();
		generateCreateShortcutAction();
		generateLoadResourceAction();
		generateElementChooser();
		generateDocumentProvider();
		generateActionBarContributor();
		generateMatchingStrategy();
		generatePreferencesInitializer();
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
		}
	}

	private void generateNode(GenNode node) throws UnexpectedBehaviourException, InterruptedException {
		generateViewFactory(node);
		generateNodeItemSemanticEditPolicy(node);
		generateEditSupport(node);

		generateNodeEditPart(node);

		generateChildContainerCanonicalEditPolicy(node);
		generateNodeGraphicalNodeEditPolicy(node);
		for (Iterator labels = node.getLabels().iterator(); labels.hasNext();) {
			GenNodeLabel label = (GenNodeLabel) labels.next();
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
		generateEditSupport(child);

		generateChildLabelNodeEditPart(child);
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
		internalGenerateJavaClass(
			myEmitters.getDiagramEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			myDiagram.getEditPartClassName(),
			myDiagram
		);
	}

	private void generateDiagramExternalNodeLabelEditPart() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getDiagramExternalNodeLabelEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			myDiagram.getBaseExternalNodeLabelEditPartClassName(),
			myDiagram
		);
	}

	private void generateNodeEditPart(GenNode genNode) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getNodeEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			genNode.getEditPartClassName(),
			genNode
		);
	}

	private void generateNodeLabelEditPart(GenNodeLabel label) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getNodeLabelEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			label.getEditPartClassName(),
			label
		);
	}

	private void generateExternalNodeLabelEditPart(GenExternalNodeLabel label) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getExternalNodeLabelEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			label.getEditPartClassName(),
			label
		);
	}

	private void generateChildLabelNodeEditPart(GenChildLabelNode genChildNode) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getChildNodeEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			genChildNode.getEditPartClassName(),
			genChildNode
		);
	}
	
	private void generateCompartmentEditPart(GenCompartment genCompartment) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getCompartmentEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			genCompartment.getEditPartClassName(),
			genCompartment
		);
	}

	private void generateLinkEditPart(GenLink genLink) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getLinkEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			genLink.getEditPartClassName(),
			genLink
		);
	}

	private void generateLinkLabelEditPart(GenLinkLabel label) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getLinkLabelEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			label.getEditPartClassName(),
			label
		);
	}

	private void generateEditPartFactory() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getEditPartFactoryEmitter(),
			myDiagram.getEditPartsPackageName(),
			myDiagram.getEditPartFactoryClassName(),
			myDiagram
		);
	}

	// edit policies

	private void generateBaseItemSemanticEditPolicy() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getBaseItemSemanticEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			myDiagram.getBaseItemSemanticEditPolicyClassName(),
			myDiagram
		);
	}

	private void generateBaseGraphicalNodeEditPolicy() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getBaseGraphicalNodeEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			myDiagram.getBaseGraphicalNodeEditPolicyClassName(),
			myDiagram
		);
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
		internalGenerateJavaClass(
			myEmitters.getDiagramItemSemanticEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			myDiagram.getItemSemanticEditPolicyClassName(),
			myDiagram
		);
	}

	private void generateCompartmentItemSemanticEditPolicy(GenCompartment genCompartment) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getCompartmentItemSemanticEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			genCompartment.getItemSemanticEditPolicyClassName(),
			genCompartment
		);
	}

	private void generateNodeGraphicalNodeEditPolicy(GenNode genNode) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getNodeGraphicalNodeEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			genNode.getGraphicalNodeEditPolicyClassName(),
			genNode
		);
	}

	private void generateNodeItemSemanticEditPolicy(GenNode genNode) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getNodeItemSemanticEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			genNode.getItemSemanticEditPolicyClassName(),
			genNode
		);
	}

	private void generateLinkItemSemanticEditPolicy(GenLink genLink) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getLinkItemSemanticEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			genLink.getItemSemanticEditPolicyClassName(),
			genLink
		);
	}

	private void generateTextSelectionEditPolicy() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getTextSelectionEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			myDiagram.getTextSelectionEditPolicyClassName(),
			myDiagram
		);
	}

	private void generateTextNonResizableEditPolicy() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getTextNonResizableEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			myDiagram.getTextNonResizableEditPolicyClassName(),
			myDiagram
		);
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

	private void generateElementTypes() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getElementTypesEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getElementTypesClassName(),
			myDiagram
		);
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

	private void generatePaletteProvider() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getPaletteProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getPaletteProviderClassName(),
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

	private void generatePropertyProvider() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getPropertyProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getPropertyProviderClassName(),
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
		internalGenerateJavaClass(
			myEmitters.getInitDiagramFileActionEmitter(),
			myEditorGen.getEditor().getPackageName(),
			myDiagram.getInitDiagramFileActionClassName(),
			myDiagram);
	}
	
	private void generateNewDiagramFileWizard() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
				myEmitters.getNewDiagramFileWizardEmitter(),
				myEditorGen.getEditor().getPackageName(),
				myDiagram.getNewDiagramFileWizardClassName(),
				myDiagram);	
	}

	private void generatePalette() throws UnexpectedBehaviourException, InterruptedException {
		if (myDiagram.getPalette() == null) {
			return;
		}
		internalGenerateJavaClass(
			myEmitters.getPaletteEmitter(),
			myDiagram.getPalette().getPackageName(),
			myDiagram.getPalette().getFactoryClassName(),
			myDiagram
		);
	}

	private void generateDiagramEditorUtil() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getDiagramEditorUtilEmitter(),
			myEditorGen.getEditor().getPackageName(),
			myDiagram.getDiagramEditorUtilClassName(),
			myDiagram
		);
	}

	private void generateDiagramFileCreator() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getDiagramFileCreatorEmitter(),
			myEditorGen.getEditor().getPackageName(),
			myDiagram.getDiagramFileCreatorClassName(),
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
	
	private void generateDocumentProvider() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getDocumentProviderEmitter(),
			myEditorGen.getEditor().getPackageName(),
			myDiagram.getDocumentProviderClassName(),
			myDiagram
		);
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

	private void generatePreferencesInitializer() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getPreferencesInitializerEmitter(),
			myEditorGen.getEditor().getPackageName(),
			myDiagram.getPreferenceInitializerClassName(),
			myEditorGen
		);
	}

	private void generatePluginClass() throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(
			myEmitters.getPluginClassEmitter(),
			myEditorGen.getEditor().getPackageName(), 
			myEditorGen.getPlugin().getActivatorClassName(),
			myEditorGen.getPlugin()
		);
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

		for (Iterator it = providerContainer.getProviders().iterator(); it.hasNext();) {
			GenExpressionProviderBase nextProvider = (GenExpressionProviderBase) it.next();
			if(nextProvider instanceof GenExpressionInterpreter) {
				JETEmitter providerEmitter = null;
				if("ocl".equals(nextProvider.getLanguage())) { //$NON-NLS-1$
					providerEmitter = myEmitters.getOCLExpressionFactoryEmitter();
				} else if("regexp".equals(nextProvider.getLanguage())) { //$NON-NLS-1$
					providerEmitter = myEmitters.getRegexpExpressionFactoryEmitter();
				}
				GenExpressionInterpreter interpreter = (GenExpressionInterpreter)nextProvider;
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
		doGenerateFile(myEmitters.getPluginXmlEmitter(), new Path("plugin.xml"), new Object[] { myDiagram.getEditorGen().getPlugin() });
	}

	private void generatePluginProperties() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateFile(myEmitters.getPluginPropertiesEmitter(), new Path("plugin.properties"), new Object[] { myDiagram.getEditorGen().getPlugin() });
	}
	
	private void generateOptionsFile() throws InterruptedException, UnexpectedBehaviourException {
		doGenerateFile(myEmitters.getOptionsFileEmitter(), new Path(".options"), new Object[] { myDiagram.getEditorGen().getPlugin()  });
	}

	private void generateBundleManifest() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateFile(myEmitters.getBundleManifestEmitter(), new Path("META-INF/MANIFEST.MF"), new Object[] { myDiagram.getEditorGen().getPlugin() });
	}

	private void generateBuildProperties() throws UnexpectedBehaviourException, InterruptedException {
		doGenerateFile(myEmitters.getBuildPropertiesEmitter(), new Path("build.properties"), new Object[] { myDiagram });
	}
	
	private void generateShortcutIcon() throws UnexpectedBehaviourException, InterruptedException {
		Path iconPath = new Path("icons/shortcut.gif");
		IProgressMonitor pm = getNextStepMonitor();
		try {
			pm.beginTask(iconPath.lastSegment(), 4);
			IPath containerPath = getDestProject().getFullPath().append(iconPath.removeLastSegments(1));
			EclipseUtil.findOrCreateContainer(containerPath, false, (IPath) null, new SubProgressMonitor(pm, 1));
			IFile f = getDestProject().getFile(iconPath);
			byte[] contents = myEmitters.getShortcutImageEmitter().generate(new SubProgressMonitor(pm, 1), null);
			if (f.exists()) {
				if (!contains(f, new ByteArrayInputStream(contents))) {
					f.setContents(new ByteArrayInputStream(contents), true, true, new SubProgressMonitor(pm, 1));
				} else {
					pm.worked(1);
				}
			} else {
				f.create(new ByteArrayInputStream(contents), true, new SubProgressMonitor(pm, 1));
			}
			f.getParent().refreshLocal(IResource.DEPTH_ONE, new SubProgressMonitor(pm, 1));
		} catch (InvocationTargetException ex) {
			handleException(ex.getCause());
		} catch (CoreException ex) {
			handleException(ex);
		} finally {
			pm.done();
		}
	}

	/**
	 * Passes initialized ImportManager as second template argument
	 */
	private void internalGenerateJavaClass(JETEmitter emitter, String packageName, String className, Object argument) throws InterruptedException {
		ImportUtil importUtil = new ImportUtil(packageName, className);
		doGenerateJavaClass(new JETEmitterAdapter(emitter), packageName, className, new Object[] {new Object[] {argument, importUtil}});
	}

	private IPath guessProjectLocation(String projectName) {
		Path modelProjectPath = new Path(myEditorGen.getDomainGenModel().getModelDirectory());
		return guessNewProjectLocation(modelProjectPath, projectName);
	}

	protected void setupProgressMonitor() {
		Counter c = new Counter();
		c.registerValue(GMFGenPackage.eINSTANCE.getGenNode(), 8);
		c.registerValue(GMFGenPackage.eINSTANCE.getGenChildLabelNode(), 4);
		c.registerValue(GMFGenPackage.eINSTANCE.getGenLink(), 6);
		c.registerValue(GMFGenPackage.eINSTANCE.getGenCompartment(), 4);
		c.registerValue(GMFGenPackage.eINSTANCE.getGenDiagram(), 50);
		c.registerValue(GMFGenPackage.eINSTANCE.getGenPlugin(), 6);
		setupProgressMonitor(Messages.start, c.getTotal(myEditorGen));
	}
	
	
	private static final class Counter {
		private final HashMap/*<EClass, Integer>*/ myCounters = new HashMap();
		private final HashMap/*<EClass, Integer>*/ myCache = new HashMap();
		private final Integer CACHE_MISS = new Integer(0);

		public Counter() {
		}

		public void registerValue(EClass eClass, int count) {
			myCounters.put(eClass, new Integer(count));
		}

		public int getTotal(EObject from) {
			int total = process(from);
			for (Iterator it = from.eAllContents(); it.hasNext();) {
				total += process((EObject) it.next());
			}
			return total;
		}

		protected int process(EObject next) {
			final EClass nextKey = next.eClass();
			Integer cachedValue = checkCached(nextKey);
			if (cachedValue != null) {
				return cachedValue.intValue(); 
			}
			LinkedList/*<EClass>*/ checkQueue = new LinkedList();
			checkQueue.add(nextKey);
			do {
				Object key = checkQueue.removeFirst();
				if (myCounters.containsKey(key)) {
					final Integer value = (Integer) myCounters.get(key);
					cache(nextKey, value);
					return value.intValue();
				} else {
					// add immeditate superclasses to check first
					checkQueue.addAll(((EClass) key).getESuperTypes());
				}
			} while (!checkQueue.isEmpty());
			cache(nextKey, CACHE_MISS);
			return 0;
		}

		private Integer checkCached(EClass nextKey) {
			return (Integer) myCache.get(nextKey);
		}

		private void cache(EClass nextKey, Integer value) {
			myCache.put(nextKey, value);
		}
	}
}