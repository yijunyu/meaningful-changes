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
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.codegen.jet.JETEmitter;
import org.eclipse.emf.codegen.jet.JETException;
import org.eclipse.emf.codegen.jmerge.JControlModel;
import org.eclipse.emf.codegen.jmerge.JMerger;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenExternalNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkLabel;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.GenNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.TextEdit;

/**
 * Invokes JET templates to populate diagram editor project.
 * 
 * @author artem
 */
public class Generator implements Runnable {

	private final GenDiagram myDiagram;

	// myDestRoot.getJavaProject().getElementName() == myDestProject.getName()
	private IPackageFragmentRoot myDestRoot;

	private IProject myDestProject;

	private JControlModel myJControlModel;

	private CodeFormatter myCodeFormatter;

	private IProgressMonitor myProgress;

	private IStatus myRunStatus = Status.CANCEL_STATUS;
	private List/*<IStatus>*/ myExceptions;

	private CodegenEmitters myEmitters;

	private static SoftReference/*<CodegenEmitters>*/ myCachedEmitters; 

	public Generator(GenEditorGenerator genModel) {
		this(genModel.getDiagram());
	}

	/**
	 * @deprecated use {@link #Generator(GenEditorGenerator) } instead
	 */
	public Generator(GenDiagram diagram) {
		myDiagram = diagram;
		CodegenEmitters old = myCachedEmitters == null ? null : (CodegenEmitters) myCachedEmitters.get();
		if (old == null) {
			myEmitters = new CodegenEmitters(true);
			myCachedEmitters = new SoftReference(myEmitters);
		} else {
			myEmitters = old;
		}
	}

	public void run(IProgressMonitor progress) throws InterruptedException {
		setProgressMonitor(progress);
		doRun();
	}

	public void run() {
		try {
			doRun();
		} catch (InterruptedException ex) {
			myRunStatus = new Status(IStatus.CANCEL, "org.eclipse.gmf.codegen", 0, Messages.interrupted, ex);
		}
	}

	private void doRun() throws InterruptedException {
		try {
			setupProgressMonitor();
			myExceptions = new LinkedList/*<IStatus>*/();
			initializeEditorProject();

			// commands
			generateReorientConnectionViewCommand();

			// edit parts, edit policies and providers
			generateSemanticHints();
			generateAbstractParser();
			generateStructuralFeatureParser();
			generateStructuralFeaturesParser();
			generateBaseItemSemanticEditPolicy();
			generateBaseGraphicalNodeEditPolicy();
			generateReferenceConnectionEditPolicy();
			generateDiagramCanonicalEditPolicy();
			generateDiagramItemSemanticEditPolicy();
			for (Iterator nodes = myDiagram.getTopLevelNodes().iterator(); nodes.hasNext();) {
				GenTopLevelNode node = (GenTopLevelNode) nodes.next();
				generateNode(node);
			}
			for (Iterator nodes = myDiagram.getChildNodes().iterator(); nodes.hasNext();) {
				GenChildNode node = (GenChildNode) nodes.next();
				if (node.isListContainerEntry()) {
					generateListContainerNode(node);
				} else {
					generateNode(node);
				}
			}
			for (Iterator compartments = myDiagram.getCompartments().iterator(); compartments.hasNext();) {
				GenCompartment compartment = (GenCompartment) compartments.next();
				generateCompartment(compartment);
			}
			for (Iterator it = myDiagram.getLinks().iterator(); it.hasNext();) {
				final GenLink next = (GenLink) it.next();
				generateViewFactory(next);
				generateLinkEditPart(next);
				generateLinkItemSemanticEditPolicy(next);
				for (Iterator labels = next.getLabels().iterator(); labels.hasNext();) {
					GenLinkLabel label = (GenLinkLabel) labels.next();
					generateLinkLabelEditPart(label);
					generateLinkLabelTextEditPart(label);
					generateLinkLabelViewFactory(label);
					generateLinkLabelTextViewFactory(label);
				}
			}
			generateViewFactory(myDiagram);
			generateDiagramEditPart();
			generateDiagramExternalNodeLabelEditPart();
			generateEditPartFactory();
			generateElementTypes();
			generateViewProvider();
			generateEditPartProvider();
			generateMetamodelSupportProvider();
			generateModelingAssistantProvider();
			generatePropertyProvider();
			generateIconProvider();
			generateParserProvider();
			if(myDiagram.isValidationEnabled()) {
				generateValidationProvider();
				generateMarkerNavigationProvider();				
			}

			// editor
			generateInitDiagramFileAction();
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
			generatePluginClass();
			generateBundleManifest();
			generatePluginProperties();
			generatePluginXml();
			generateBuildProperties();
			generateShortcutIcon();

			if (myExceptions.isEmpty()) {
				myRunStatus = Status.OK_STATUS;
			} else {
				IStatus[] s = (IStatus[]) myExceptions.toArray(new IStatus[myExceptions.size()]);
				myRunStatus = new MultiStatus("org.eclipse.gmf.codegen", 0, s, Messages.problems, null);
			}
		} catch (NullPointerException ex) {
			myRunStatus = new Status(IStatus.ERROR, "org.eclipse.gmf.codegen", 0, NullPointerException.class.getName(), ex);
		} catch (JETException ex) {
			myRunStatus = ex.getStatus();
		} catch (UnexpectedBehaviourException ex) {
			myRunStatus = new Status(Status.ERROR, "org.eclipse.gmf.codegen", 0, Messages.unexpected, ex);
		} finally {
			myProgress.done();
			myExceptions = null;
		}
	}

	/**
	 * Provides information about success/failures during {@link #run()}
	 * @return state of the generator run, or CANCEL if generator was not yet run.
	 */
	public IStatus getRunStatus() {
		return myRunStatus;
	}

	private void generateNode(GenNode node) throws JETException, InterruptedException {
		generateNodeEditPart(node);
		for (Iterator labels = node.getLabels().iterator(); labels.hasNext();) {
			GenNodeLabel label = (GenNodeLabel) labels.next();
			if (label instanceof GenExternalNodeLabel) {
				GenExternalNodeLabel extLabel = (GenExternalNodeLabel) label;
				generateExternalNodeLabelEditPart(extLabel);
				generateExternalNodeLabelViewFactory(extLabel);
				generateExternalNodeLabelTextEditPart(extLabel);
				generateExternalNodeLabelTextViewFactory(extLabel);
			} else {
				generateNodeLabelEditPart(label);
				generateNodeLabelTextViewFactory(label);
			}
		}
		generateChildContainer(node);
		generateNodeGraphicalNodeEditPolicy(node);
		generateNodeItemSemanticEditPolicy(node);
	}

	private void generateListContainerNode(GenNode child) throws JETException, InterruptedException {
		generateListContainerNodeEditPart(child);
		generateNodeItemSemanticEditPolicy(child);
		generateViewFactory(child);
	}
	
	private void generateCompartment(GenCompartment compartment) throws JETException, InterruptedException {
		generateCompartmentEditPart(compartment);
		generateCompartmentItemSemanticEditPolicy(compartment);
		generateChildContainer(compartment);
	}
	
	private void generateChildContainer(GenChildContainer childContainer) throws JETException, InterruptedException {
		generateViewFactory(childContainer);
		generateChildContainerCanonicalEditPolicy(childContainer);
	}

	// commands

	private void generateReorientConnectionViewCommand() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getReorientConnectionViewCommandEmitter(),
			myDiagram.getEditCommandsPackageName(),
			myDiagram.getReorientConnectionViewCommandClassName(),
			myDiagram
		);
	}

	// parts

	private void generateDiagramEditPart() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getDiagramEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			myDiagram.getEditPartClassName(),
			myDiagram
		);
	}

	private void generateDiagramExternalNodeLabelEditPart() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getDiagramExternalNodeLabelEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			myDiagram.getBaseExternalNodeLabelEditPartClassName(),
			myDiagram
		);
	}

	private void generateNodeEditPart(GenNode genNode) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getNodeEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			genNode.getEditPartClassName(),
			genNode
		);
	}

	private void generateNodeLabelEditPart(GenNodeLabel label) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getNodeLabelEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			label.getEditPartClassName(),
			label
		);
	}

	private void generateExternalNodeLabelEditPart(GenExternalNodeLabel label) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getExternalNodeLabelEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			label.getEditPartClassName(),
			label
		);
	}

	private void generateExternalNodeLabelTextEditPart(GenExternalNodeLabel label) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getExternalNodeLabelTextEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			label.getTextEditPartClassName(),
			label
		);
	}

	private void generateListContainerNodeEditPart(GenNode genChildNode) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getChildNodeEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			genChildNode.getEditPartClassName(),
			genChildNode
		);
	}
	
	private void generateCompartmentEditPart(GenCompartment genCompartment) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getCompartmentEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			genCompartment.getEditPartClassName(),
			genCompartment
		);
	}

	private void generateLinkEditPart(GenLink genLink) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getLinkEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			genLink.getEditPartClassName(),
			genLink
		);
	}

	private void generateLinkLabelEditPart(GenLinkLabel label) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getLinkLabelEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			label.getEditPartClassName(),
			label
		);
	}

	private void generateLinkLabelTextEditPart(GenLinkLabel label) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getLinkLabelTextEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			label.getTextEditPartClassName(),
			label
		);
	}

	private void generateEditPartFactory() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getEditPartFactoryEmitter(),
			myDiagram.getEditPartsPackageName(),
			myDiagram.getEditPartFactoryClassName(),
			myDiagram
		);
	}

	// edit policies

	private void generateBaseItemSemanticEditPolicy() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getBaseItemSemanticEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			myDiagram.getBaseItemSemanticEditPolicyClassName(),
			myDiagram
		);
	}

	private void generateBaseGraphicalNodeEditPolicy() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getBaseGraphicalNodeEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			myDiagram.getBaseGraphicalNodeEditPolicyClassName(),
			myDiagram
		);
	}

	private void generateReferenceConnectionEditPolicy() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getReferenceConnectionEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			myDiagram.getReferenceConnectionEditPolicyClassName(),
			myDiagram
		);
	}

	private void generateDiagramCanonicalEditPolicy() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getDiagramCanonicalEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			myDiagram.getCanonicalEditPolicyClassName(),
			myDiagram
		);
	}

	private void generateChildContainerCanonicalEditPolicy(GenChildContainer genContainer) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getChildContainerCanonicalEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			genContainer.getCanonicalEditPolicyClassName(),
			genContainer
		);
	}

	private void generateDiagramItemSemanticEditPolicy() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getDiagramItemSemanticEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			myDiagram.getItemSemanticEditPolicyClassName(),
			myDiagram
		);
	}

	private void generateCompartmentItemSemanticEditPolicy(GenCompartment genCompartment) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getCompartmentItemSemanticEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			genCompartment.getItemSemanticEditPolicyClassName(),
			genCompartment
		);
	}

	private void generateNodeGraphicalNodeEditPolicy(GenNode genNode) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getNodeGraphicalNodeEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			genNode.getGraphicalNodeEditPolicyClassName(),
			genNode
		);
	}

	private void generateNodeItemSemanticEditPolicy(GenNode genNode) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getNodeItemSemanticEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			genNode.getItemSemanticEditPolicyClassName(),
			genNode
		);
	}

	private void generateLinkItemSemanticEditPolicy(GenLink genLink) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getLinkItemSemanticEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			genLink.getItemSemanticEditPolicyClassName(),
			genLink
		);
	}

	// providers

	private void generateAbstractParser() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getAbstractParserEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getAbstractParserClassName(),
			myDiagram
		);
	}

	private void generateStructuralFeatureParser() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getStructuralFeatureParserEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getStructuralFeatureParserClassName(),
			myDiagram
		);
	}

	private void generateStructuralFeaturesParser() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getStructuralFeaturesParserEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getStructuralFeaturesParserClassName(),
			myDiagram
		);
	}

	private void generateSemanticHints() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getSemanticHintsEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getSemanticHintsClassName(),
			myDiagram
		);
	}

	private void generateElementTypes() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getElementTypesEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getElementTypesClassName(),
			myDiagram
		);
	}

	private void generateViewProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getViewProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getNotationViewProviderClassName(),
			myDiagram
		);
	}

	private void generateEditPartProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getEditPartProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getEditPartProviderClassName(),
			myDiagram
		);
	}
	
	private void generateMetamodelSupportProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getMetamodelSupportProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getMetamodelSupportProviderClassName(),
			myDiagram);
	}

	private void generateModelingAssistantProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getModelingAssistantProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getModelingAssistantProviderClassName(),
			myDiagram);
	}

	private void generatePropertyProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getPropertyProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getPropertyProviderClassName(),
			myDiagram);
	}

	private void generateIconProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getIconProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getIconProviderClassName(),
			myDiagram);
	}

	private void generateParserProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getParserProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getParserProviderClassName(),
			myDiagram);
	}
	
	private void generateValidationProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getValidationProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getValidationProviderClassName(),
			myDiagram);
	}
	
	private void generateMarkerNavigationProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getMarkerNavigationProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getMarkerNavigationProviderClassName(),
			myDiagram);
	}	

	// notation view factories

	private void generateViewFactory(GenCommonBase genElement) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getViewFactoryEmitter(),
			myDiagram.getNotationViewFactoriesPackageName(),
			genElement.getNotationViewFactoryClassName(),
			genElement
		);
	}

	private void generateLinkLabelViewFactory(GenLinkLabel label) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getLabelViewFactoryEmitter(),
			myDiagram.getNotationViewFactoriesPackageName(),
			label.getNotationViewFactoryClassName(),
			label
		);
	}

	private void generateLinkLabelTextViewFactory(GenLinkLabel label) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getLabelTextViewFactoryEmitter(),
			myDiagram.getNotationViewFactoriesPackageName(),
			label.getTextNotationViewFactoryClassName(),
			label
		);
	}

	private void generateExternalNodeLabelViewFactory(GenExternalNodeLabel label) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getLabelViewFactoryEmitter(),
			myDiagram.getNotationViewFactoriesPackageName(),
			label.getNotationViewFactoryClassName(),
			label
		);
	}

	private void generateExternalNodeLabelTextViewFactory(GenExternalNodeLabel label) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getLabelTextViewFactoryEmitter(),
			myDiagram.getNotationViewFactoriesPackageName(),
			label.getTextNotationViewFactoryClassName(),
			label
		);
	}

	private void generateNodeLabelTextViewFactory(GenNodeLabel label) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getLabelTextViewFactoryEmitter(),
			myDiagram.getNotationViewFactoriesPackageName(),
			label.getNotationViewFactoryClassName(),
			label
		);
	}

	// editor

	private void generateInitDiagramFileAction() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getInitDiagramFileActionEmitter(),
			myDiagram.getEditorPackageName(),
			myDiagram.getInitDiagramFileActionClassName(),
			myDiagram);
	}

	private void generatePalette() throws JETException, InterruptedException {
		if (myDiagram.getPalette() == null) {
			return;
		}
		doGenerateJavaClass(
			myEmitters.getPaletteEmitter(),
			myDiagram.getPalette().getPackageName(),
			myDiagram.getPalette().getFactoryClassName(),
			myDiagram
		);
	}

	private void generateDiagramEditorUtil() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getDiagramEditorUtilEmitter(),
			myDiagram.getEditorPackageName(),
			myDiagram.getDiagramEditorUtilClassName(),
			myDiagram
		);
	}

	private void generateDiagramFileCreator() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getDiagramFileCreatorEmitter(),
			myDiagram.getEditorPackageName(),
			myDiagram.getDiagramFileCreatorClassName(),
			myDiagram
		);
	}
	
	private void generateVisualIDRegistry() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getVisualIDRegistryEmitter(),
			myDiagram.getEditorPackageName(),
			myDiagram.getVisualIDRegistryClassName(),
			myDiagram
		);
	}

	private void generateCreationWizard() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getCreationWizardEmitter(),
			myDiagram.getEditorPackageName(),
			myDiagram.getCreationWizardClassName(),
			myDiagram
		);
	}

	private void generateCreationWizardPage() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getCreationWizardPageEmitter(),
			myDiagram.getEditorPackageName(),
			myDiagram.getCreationWizardPageClassName(),
			myDiagram
		);
	}

	private void generateEditor() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getEditorEmitter(),
			myDiagram.getEditorPackageName(),
			myDiagram.getEditorClassName(),
			myDiagram
		);
	}
	
	private void generateCreateShortcutAction() throws JETException, InterruptedException {
		if (!myDiagram.generateCreateShortcutAction()) {
			return;
		}
		doGenerateJavaClass(
				myEmitters.getCreateShortcutActionEmitter(),
				myDiagram.getEditorPackageName(), 
				myDiagram.getCreateShortcutActionClassName(),
				myDiagram
			);
	}
	
	private void generateLoadResourceAction() throws JETException, InterruptedException {
		doGenerateJavaClass(
				myEmitters.getLoadResourceActionEmitter(),
				myDiagram.getEditorPackageName(), 
				myDiagram.getLoadResourceActionClassName(),
				myDiagram
			);
	}
	
	private void generateElementChooser() throws JETException, InterruptedException {
		if (!myDiagram.generateCreateShortcutAction()) {
			return;
		}
		doGenerateJavaClass(
				myEmitters.getElementChooserEmitter(),
				myDiagram.getEditorPackageName(), 
				myDiagram.getElementChooserClassName(),
				myDiagram
			);
	}
	
	private void generateDocumentProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getDocumentProviderEmitter(),
			myDiagram.getEditorPackageName(),
			myDiagram.getDocumentProviderClassName(),
			myDiagram
		);
	}

	private void generateActionBarContributor() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getActionBarContributorEmitter(),
			myDiagram.getEditorPackageName(),
			myDiagram.getActionBarContributorClassName(),
			myDiagram
		);
	}

	private void generateMatchingStrategy() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getMatchingStrategyEmitter(),
			myDiagram.getEditorPackageName(),
			myDiagram.getMatchingStrategyClassName(),
			myDiagram
		);
	}

	private void generatePreferencesInitializer() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getPreferencesInitializerEmitter(),
			myDiagram.getEditorPackageName(),
			myDiagram.getPreferenceInitializerClassName(),
			myDiagram
		);
	}

	private void generatePluginClass() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getPluginClassEmitter(),
			myDiagram.getEditorPackageName(), 
			myDiagram.getEditorGen().getPlugin().getActivatorClassName(),
			myDiagram.getEditorGen().getPlugin()
		);
	}

	private void generatePluginXml() throws JETException, InterruptedException {
		doGenerateFile(myEmitters.getPluginXmlEmitter(), new Path("plugin.xml"), myDiagram.getEditorGen().getPlugin());
	}

	private void generatePluginProperties() throws JETException, InterruptedException {
		doGenerateFile(myEmitters.getPluginPropertiesEmitter(), new Path("plugin.properties"), myDiagram.getEditorGen().getPlugin());
	}

	private void generateBundleManifest() throws JETException, InterruptedException {
		doGenerateFile(myEmitters.getBundleManifestEmitter(), new Path("META-INF/MANIFEST.MF"), myDiagram.getEditorGen().getPlugin());
	}

	private void generateBuildProperties() throws JETException, InterruptedException {
		doGenerateFile(myEmitters.getBuildPropertiesEmitter(), new Path("build.properties"), myDiagram);
	}
	
	private void generateShortcutIcon() throws InterruptedException {
		if (!myDiagram.generateShortcutIcon()) {
			return;
		}
		Path iconPath = new Path("icons/shortcut.gif");
		IProgressMonitor pm = getNextStepMonitor();
		try {
			pm.beginTask(iconPath.lastSegment(), 3);
			IPath containerPath = myDestProject.getFullPath().append(iconPath.removeLastSegments(1));
			CodeGenUtil.findOrCreateContainer(containerPath, false, (IPath) null, new SubProgressMonitor(pm, 1));
			IFile f = myDestProject.getFile(iconPath);
			if (f.exists()) {
				f.setContents(new ByteArrayInputStream(myEmitters.getShortcutImageEmitter().generateGif()), true, true, new SubProgressMonitor(pm, 1));
			} else {
				f.create(new ByteArrayInputStream(myEmitters.getShortcutImageEmitter().generateGif()), true, new SubProgressMonitor(pm, 1));
			}
			f.getParent().refreshLocal(IResource.DEPTH_ONE, new SubProgressMonitor(pm, 1));
		} catch (CoreException ex) {
			myExceptions.add(ex.getStatus());
		} finally {
			pm.done();
		}

	}
	
	/**
	 * Generate ordinary file. No merge is performed at the moment.
	 * @param emitter template to use
	 * @param filePath - project-relative path to file, e.g. META-INF/MANIFEST.MF
	 * @param param TODO
	 * @throws JETException
	 * @throws InterruptedException
	 */
	private void doGenerateFile(JETEmitter emitter, IPath filePath, Object param) throws JETException, InterruptedException {
		assert !myDestProject.getName().equals(filePath.segment(0));
		IProgressMonitor pm = getNextStepMonitor();
		try {
			pm.beginTask(filePath.lastSegment(), 4);
			IPath containerPath = myDestProject.getFullPath().append(filePath.removeLastSegments(1));
			CodeGenUtil.findOrCreateContainer(containerPath, false, (IPath) null, new SubProgressMonitor(pm, 1));
			String genText = emitter.generate(new SubProgressMonitor(pm, 1), new Object[] { param });
			IFile f = myDestProject.getFile(filePath);
			// FIXME merge!
			if (f.exists()) {
				f.setContents(new ByteArrayInputStream(genText.getBytes()), true, true, new SubProgressMonitor(pm, 1));
			} else {
				f.create(new ByteArrayInputStream(genText.getBytes()), true, new SubProgressMonitor(pm, 1));
			}
			f.getParent().refreshLocal(IResource.DEPTH_ONE, new SubProgressMonitor(pm, 1));
		} catch (CoreException ex) {
			myExceptions.add(ex.getStatus());
		} finally {
			pm.done();
		}
	}

	/**
	 * Optionally, specify progressMonitor to use. Should be called prior to {@link #run()}
	 * @param progress
	 */
	public void setProgressMonitor(IProgressMonitor progress) {
		myProgress = progress;
	}

	private void setupProgressMonitor() {
		if (myProgress == null) {
			myProgress = new NullProgressMonitor();
			return;
			// no need to set it up
		}
		Counter c = new Counter(myDiagram);
		c.setAdditionalOperations(8); // init, palette, editor, plugin.xml, etc
		c.setOperationsPerNode(2);
		c.setOperationsPerListContainerNode(1);
		c.setOperationsPerLink(2);
		myProgress.beginTask(Messages.start, c.getTotal());
	}

	private IProgressMonitor getNextStepMonitor() throws InterruptedException {
		if (myProgress.isCanceled()) {
			throw new InterruptedException();
		}
		return new SubProgressMonitor(myProgress, 1);
	}

	private void initializeEditorProject() throws UnexpectedBehaviourException, InterruptedException {
		myDestProject = ResourcesPlugin.getWorkspace().getRoot().getProject(myDiagram.getEditorGen().getPlugin().getID());
		final Path srcPath = new Path('/' + myDestProject.getName() + "/src"); //$NON-NLS-1$
		final Path projectLocation = null; // use default
		final List referencedProjects = createReferencedProjectsList();
		final int style = org.eclipse.emf.codegen.ecore.Generator.EMF_PLUGIN_PROJECT_STYLE;
		// pluginVariables is NOT used when style is EMF_PLUGIN_PROJECT_STYLE
		final List pluginVariables = null;
		final IProgressMonitor pm = getNextStepMonitor();

		org.eclipse.emf.codegen.ecore.Generator.createEMFProject(srcPath, projectLocation, referencedProjects, pm, style, pluginVariables);

		try {
			myDestRoot = JavaCore.create(myDestProject).findPackageFragmentRoot(srcPath);
		} catch (JavaModelException ex) {
			throw new UnexpectedBehaviourException(ex.getMessage());
		}
		if (myDestRoot == null) {
			throw new UnexpectedBehaviourException("no source root can be found");
		}
	}

	private List createReferencedProjectsList() {
		return Collections.EMPTY_LIST;
	}

	/**
	 * NOTE: potential problem - packageName and className should match those specified in 
	 * the template. Besides, getQualifiedXXX helpers in diagram GenModel should also correctly
	 * return qualified class names.  
	 */
	private void doGenerateJavaClass(JETEmitter emitter, String packageName, String className, Object input) throws InterruptedException {
		IProgressMonitor pm = getNextStepMonitor();
		try {
			pm.beginTask(className, 4);
			String genText = emitter.generate(new SubProgressMonitor(pm, 1), new Object[] { input });
			IPackageFragment pf = myDestRoot.createPackageFragment(packageName, true, new SubProgressMonitor(pm, 1));
			ICompilationUnit cu = pf.getCompilationUnit(className + ".java"); //$NON-NLS-1$
			if (cu.exists()) {
				genText = merge(genText, cu.getSource(), new SubProgressMonitor(pm, 1));
			} else {
				pm.worked(1);
			}
			pf.createCompilationUnit(cu.getElementName(), formatCode(genText), true, new SubProgressMonitor(pm, 1));
		} catch (NullPointerException ex) {
			myExceptions.add(new Status(IStatus.ERROR, "org.eclipse.gmf.codegen", 0, ex.getMessage(), ex));
		} catch (JETException ex) {
			myExceptions.add(ex.getStatus());
		} catch (CoreException ex) {
			myExceptions.add(ex.getStatus());		
		} finally {
			pm.done();
		}
	}

	private String merge(String generatedText, String oldContents, IProgressMonitor pm) {
		pm.beginTask(Messages.merge, 1);
		JMerger jMerge = new JMerger();
		jMerge.setControlModel(getJControlModel());
		jMerge.setSourceCompilationUnit(jMerge.createCompilationUnitForContents(generatedText));
		jMerge.setTargetCompilationUnit(jMerge.createCompilationUnitForContents(oldContents));
		jMerge.merge();
		pm.done();
		return jMerge.getTargetCompilationUnitContents();
	}

	private String formatCode(String text) {
		IDocument doc = new Document(text);
		TextEdit edit = getCodeFormatter().format(CodeFormatter.K_COMPILATION_UNIT, doc.get(), 0, doc.get().length(), 0, null);

		try {
			// check if text formatted successfully 
			if(edit != null) {
				edit.apply(doc);
				text = doc.get();				
			}		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return text;
	}

	private CodeFormatter getCodeFormatter() {
		if (myCodeFormatter == null) {
			myCodeFormatter = ToolFactory.createCodeFormatter(null);
		}
		return myCodeFormatter;
	}

	private JControlModel getJControlModel() {
		if (myJControlModel == null) {
			myJControlModel = new JControlModel(myEmitters.getJMergeControlFile().toString());
		}
		return myJControlModel;
	}

	private static final class Counter {
		private final GenDiagram myDiagram;
		private int myOpsPerNode = 1;
		private int myOpsPerLink = 1;
		private int myOpsPerListContainerNode = 1;
		private int myAdditionalOps = 0;
		private int myOpsPerCompartment = 1;

		Counter(GenDiagram diagram) {
			myDiagram = diagram;
		}

		public void setOperationsPerNode(int opsPerNode) {
			 myOpsPerNode = opsPerNode;
		}
		public void setOperationsPerLink(int opsPerLink) {
			myOpsPerLink = opsPerLink;
		}
		public void setOperationsPerListContainerNode(int opsPerChild) {
			myOpsPerListContainerNode = opsPerChild;
		}
		public void setOperationsPerCompartment(int opsPerCompartment) {
			myOpsPerCompartment = opsPerCompartment;
		}
		public void setAdditionalOperations(int additionalOps) {
			myAdditionalOps = additionalOps;
		}
		public int getTotal() {
			int rv = myAdditionalOps;
			rv += myDiagram.getTopLevelNodes().size() * myOpsPerNode;
			rv += getChildNodesCount(myDiagram.getChildNodes());
			rv += myDiagram.getCompartments().size() * myOpsPerCompartment;
			rv += myDiagram.getLinks().size() * myOpsPerLink;
			return rv;  
		}

		private int getChildNodesCount(Collection nodes) {
			int counter = 0;
			for (Iterator it = nodes.iterator(); it.hasNext();) {
				GenChildNode nextNode = (GenChildNode) it.next();
				if (nextNode.isListContainerEntry()) {
					counter += myOpsPerNode;
				} else {
					counter += myOpsPerListContainerNode;
				}
			}
			return counter;
		}
	}
}
