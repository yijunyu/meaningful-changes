/*
 * Copyright (c) 2005,2006 Borland Software Corporation
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

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.gmf.codegen.gmfgen.FeatureLinkModelFacet;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenApplication;
import org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenCustomPropertyTab;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
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
import org.eclipse.gmf.codegen.gmfgen.OpenDiagramBehaviour;
import org.eclipse.gmf.codegen.gmfgen.TypeLinkModelFacet;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.gmf.common.codegen.ImportAssistant;
import org.eclipse.gmf.internal.common.codegen.GeneratorBase;
import org.eclipse.gmf.internal.common.codegen.TextEmitter;
import org.eclipse.gmf.internal.common.codegen.TextMerger;

/**
 * Invokes templates to populate diagram editor project.
 * TODO reuse fullRT.Generator as much as possible
 * @author artem
 */
public class Generator extends GeneratorBase implements Runnable {

	private final GenEditorGenerator myEditorGen; 

	private final GenDiagram myDiagram;

	private final CodegenEmitters myEmitters;

	public Generator(GenEditorGenerator genModel) {
		this(genModel, Activator.getInstance().getEmitters(genModel));
	}

	public Generator(GenEditorGenerator genModel, CodegenEmitters emitters) {
		assert genModel != null && emitters != null;
		myDiagram = genModel.getDiagram();
		myEditorGen = genModel;
		myEmitters = emitters;
	}

	@Override
	protected TextMerger createMergeService() {
		return myEmitters.createMergeService();
	}

	@SuppressWarnings("unchecked")
	protected void customRun() throws InterruptedException, UnexpectedBehaviourException {
		final String pluginID = myEditorGen.getPlugin().getID();
		final Path examplaryLocation = new Path(myEditorGen.getDomainGenModel().getModelDirectory());
		initializeEditorProject(pluginID, guessNewProjectLocation(examplaryLocation, pluginID));

		doGenerateFile(myEmitters.getManifestGenerator(), new Path("META-INF/MANIFEST.MF"), new Object[] { myEditorGen.getPlugin() });
		doGenerateFile(myEmitters.getBuildPropertiesGenerator(), new Path("build.properties"), new Object[] { myEditorGen.getPlugin() });
		doGenerateFile(myEmitters.getPluginXML(), new Path("plugin.xml"), new Object[] { myEditorGen.getPlugin() });
		doGenerateFile(myEmitters.getPluginPropertiesGenerator(), new Path("plugin.properties"), new Object[] { myEditorGen.getPlugin() });

		internalGenerateJavaClass(myEmitters.getCreationWizardGenerator(), myDiagram.getCreationWizardQualifiedClassName(), myDiagram);
		internalGenerateJavaClass(myEmitters.getCreationWizardPageGenerator(), myDiagram.getCreationWizardPageQualifiedClassName(), myDiagram);
		internalGenerateJavaClass(myEmitters.getPluginGenerator(), myEditorGen.getPlugin().getActivatorQualifiedClassName(), myEditorGen.getPlugin());
		internalGenerateJavaClass(myEmitters.getInitDiagramFileActionGenerator(), myDiagram.getInitDiagramFileActionQualifiedClassName(), myDiagram);
		internalGenerateJavaClass(myEmitters.getNewDiagramFileWizardGenerator(), myDiagram.getNewDiagramFileWizardQualifiedClassName(), myDiagram);

		internalGenerateJavaClass(myEmitters.getActionBarContributorGenerator(), myEditorGen.getEditor().getActionBarContributorQualifiedClassName(), myEditorGen.getEditor());
		internalGenerateJavaClass(myEmitters.getDiagramEditorUtilGenerator(), myDiagram.getDiagramEditorUtilQualifiedClassName(), myDiagram);
		internalGenerateJavaClass(myEmitters.getEditorGenerator(), myEditorGen.getEditor().getQualifiedClassName(), myEditorGen.getEditor());
		if (!myEditorGen.getDomainGenModel().isRichClientPlatform() && !myEditorGen.getEditor().isEclipseEditor()) {
			//See plugin.xmljet
			String className = "OpenDiagramIn" + myEditorGen.getDomainGenModel().getModelName() + "DiagramViewAction";
			className = CodeGenUtil.validJavaIdentifier(className);
			internalGenerateJavaClass(myEmitters.getOpenDiagramInViewActionGenerator(), myEditorGen.getEditor().getPackageName(), className, myEditorGen.getEditor());
		}
		if (myDiagram.getPalette() != null) {
			internalGenerateJavaClass(myEmitters.getPaletteFactoryGenerator(), myDiagram.getPalette().getFactoryQualifiedClassName(), myDiagram);
		}
		internalGenerateJavaClass(myEmitters.getEditPartFactoryGenerator(), myDiagram.getEditPartFactoryQualifiedClassName(), myDiagram);
		internalGenerateJavaClass(myEmitters.getDiagramEditPartGenerator(), myDiagram.getEditPartQualifiedClassName(), myDiagram);
		HashSet<OpenDiagramBehaviour> openDiagramBehaviors = new HashSet<OpenDiagramBehaviour>();
		generateBehaviors(myDiagram, openDiagramBehaviors);

		boolean hasExternalLabels = false;
		for (GenNode next : (List<? extends GenNode>) myDiagram.getAllNodes()) {
			if (!(next instanceof GenChildLabelNode)) {
				internalGenerateJavaClass(myEmitters.getNodeEditPartGenerator(), next.getEditPartQualifiedClassName(), next);
				for (Iterator it2 = next.getLabels().iterator(); it2.hasNext();) {
					final GenNodeLabel label = (GenNodeLabel) it2.next();
					hasExternalLabels |= label instanceof GenExternalNodeLabel;
					internalGenerateJavaClass(myEmitters.getNodeLabelEditPartGenerator(), label.getEditPartQualifiedClassName(), label);
					internalGenerateJavaClass(myEmitters.getLabelViewFactoryGenerator(), label.getNotationViewFactoryQualifiedClassName(), label);
				}
				internalGenerateJavaClass(myEmitters.getNodeViewFactoryGenerator(), next.getNotationViewFactoryQualifiedClassName(), next);
			} else {
				internalGenerateJavaClass(myEmitters.getChildNodeEditPartGenerator(), next.getEditPartQualifiedClassName(), next);
				internalGenerateJavaClass(myEmitters.getLabelViewFactoryGenerator(), next.getNotationViewFactoryQualifiedClassName(), next);
			}
			generateBehaviors(next, openDiagramBehaviors);
			generateCommands(next);
		}
		if (hasExternalLabels) {
			internalGenerateJavaClass(myEmitters.getDiagramExternalNodeLabelEditPartEmitter(), myDiagram.getEditPartsPackageName(), myDiagram.getBaseExternalNodeLabelEditPartClassName(), myDiagram);
		}
		for (GenLink next : (List<? extends GenLink>) myDiagram.getLinks()) {
			internalGenerateJavaClass(myEmitters.getLinkEditPartGenerator(), next.getEditPartQualifiedClassName(), next);
			for (GenLinkLabel label : (List<? extends GenLinkLabel>) next.getLabels()) {
				internalGenerateJavaClass(myEmitters.getLinkLabelEditPartGenerator(), label.getEditPartQualifiedClassName(), label);
				internalGenerateJavaClass(myEmitters.getLabelViewFactoryGenerator(), label.getNotationViewFactoryQualifiedClassName(), label);
			}
			internalGenerateJavaClass(myEmitters.getLinkViewFactoryGenerator(), next.getNotationViewFactoryQualifiedClassName(), next);
			generateBehaviors(next, openDiagramBehaviors);
			generateCommands(next);
		}
		for (Iterator it = myDiagram.getCompartments().iterator(); it.hasNext(); ) {
			final GenCompartment next = (GenCompartment) it.next();
			internalGenerateJavaClass(myEmitters.getCompartmentEditPartGenerator(), next.getEditPartQualifiedClassName(), next);
			internalGenerateJavaClass(myEmitters.getCompartmentViewFactoryGenerator(), next.getNotationViewFactoryQualifiedClassName(), next);
		}
		internalGenerateJavaClass(myEmitters.getDiagramViewFactoryGenerator(), myDiagram.getNotationViewFactoryQualifiedClassName(), myDiagram);
		internalGenerateJavaClass(myEmitters.getDomainElementInitializerGenerator(), myDiagram.getNotationViewFactoriesPackageName(), "DomainElementInitializer",myDiagram); // XXX: allow customization!
		internalGenerateJavaClass(myEmitters.getVisualIDRegistryGenerator(), myDiagram.getVisualIDRegistryQualifiedClassName(), myDiagram);
		if(myDiagram.getEditorGen().getExpressionProviders() != null) {
			generateExpressionProviders();
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
		if (!myEditorGen.getDomainGenModel().isRichClientPlatform() && myEditorGen.getNavigator() != null) {
			generateNavigatorContentProvider();
			generateNavigatorLabelProvider();
			generateNavigatorLinkHelper();
			generateNavigatorSorter();
			generateNavigatorActionProvider();
			generateAbstractNavigatorItem();
			generateNavigatorGroup();
			generateNavigatorItem();
			generateNavigatorGroupIcons();
		}
		if (myEditorGen.getPropertySheet() != null) {
			generatePropertySheetSections();
		}
		generateApplication();
	}

	private static boolean isPathInsideGenerationTarget(String path) {
		assert path != null;
		Path p = new Path(path);
		return !p.isAbsolute() && !p.segment(0).equals(".."); //$NON-NLS-1$
	}

	@SuppressWarnings("unchecked")
	private void generateExpressionProviders() throws UnexpectedBehaviourException, InterruptedException {
		GenExpressionProviderContainer providerContainer = myEditorGen.getExpressionProviders();
		internalGenerateJavaClass(
			myEmitters.getAbstractExpressionEmitter(),
			providerContainer.getExpressionsPackageName(), 
			providerContainer.getAbstractExpressionClassName(),
			myDiagram
		);

		for (GenExpressionProviderBase nextProvider : (List<? extends GenExpressionProviderBase>) providerContainer.getProviders()) {
			if(nextProvider instanceof GenExpressionInterpreter) {
				TextEmitter providerEmitter = null;
				if(GenLanguage.OCL_LITERAL.equals(nextProvider.getLanguage())) {
					providerEmitter = myEmitters.getOCLExpressionFactoryEmitter();
				} else if(GenLanguage.REGEXP_LITERAL.equals(nextProvider.getLanguage()) || GenLanguage.NREGEXP_LITERAL.equals(nextProvider.getLanguage())) {
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

	private void generateBehaviors(GenCommonBase element, HashSet<OpenDiagramBehaviour> generatedBehaviors) throws UnexpectedBehaviourException, InterruptedException {
		for (OpenDiagramBehaviour behaviour : element.getBehaviour(OpenDiagramBehaviour.class)) {
			if (!generatedBehaviors.contains(behaviour)) {
				generatedBehaviors.add(behaviour);
				generateOpenDiagramEditPolicy(behaviour);
			}
		}
	}

	private void generateOpenDiagramEditPolicy(OpenDiagramBehaviour behaviour) throws UnexpectedBehaviourException, InterruptedException {
		internalGenerateJavaClass(myEmitters.getOpenDiagramEditPolicyEmitter(), behaviour.getEditPolicyQualifiedClassName(), behaviour);
	}

	private void generateCommands(GenNode genNode) throws UnexpectedBehaviourException, InterruptedException {
		String commandNameInfix = genNode.getDomainMetaClass().getName() + genNode.getVisualID();
		internalGenerateJavaClass(myEmitters.getCreateNodeCommandEmitter(), 
				myDiagram.getEditCommandsPackageName(),
				"Create" + commandNameInfix + "Command",
				genNode
			);
	}

	private void generateCommands(GenLink genLink) throws UnexpectedBehaviourException, InterruptedException {
		if (!genLink.isViewDirectionAlignedWithModel()) {
			return;
		}
		String commandNameInfix;
		if (genLink.getModelFacet() instanceof TypeLinkModelFacet) {
			TypeLinkModelFacet modelFacet = (TypeLinkModelFacet) genLink.getModelFacet();
			commandNameInfix = modelFacet.getMetaClass().getName();
		} else if (genLink.getModelFacet() instanceof FeatureLinkModelFacet) {
			GenFeature metaFeature = ((FeatureLinkModelFacet) genLink.getModelFacet()).getMetaFeature();
			commandNameInfix = metaFeature.getFeatureAccessorName();
		} else {
			return;
		}
		commandNameInfix += genLink.getVisualID();
		internalGenerateJavaClass(
				myEmitters.getCreateLinkStartCommandEmitter(),
				myDiagram.getEditCommandsPackageName(),
				"Create" + commandNameInfix + "StartCommand",
				genLink
			);
		internalGenerateJavaClass(
				myEmitters.getCreateLinkCompleteCommandEmitter(),
				myDiagram.getEditCommandsPackageName(),
				"Create" + commandNameInfix + "Command",
				genLink
			);
		internalGenerateJavaClass(
				myEmitters.getReconnectLinkSourceCommandEmitter(),
				myDiagram.getEditCommandsPackageName(),
				"Reconnect" + commandNameInfix + "SourceCommand",
				genLink
			);
		internalGenerateJavaClass(
				myEmitters.getReconnectLinkTargetCommandEmitter(),
				myDiagram.getEditCommandsPackageName(),
				"Reconnect" + commandNameInfix + "TargetCommand",
				genLink
			);
	}

	private void generateNavigatorContentProvider() throws InterruptedException, UnexpectedBehaviourException {
		internalGenerateJavaClass(
				myEmitters.getNavigatorContentProviderEmitter(),
				myEditorGen.getNavigator().getPackageName(),
				myEditorGen.getNavigator().getContentProviderClassName(),
				myEditorGen.getNavigator()
			);
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
		if (!myEditorGen.getEditor().isEclipseEditor()) {
			return;
		}
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
		doGenerateJavaClass(
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
	
	@SuppressWarnings("unchecked")
	private void generateNavigatorGroupIcons() throws InterruptedException, UnexpectedBehaviourException {
		Set<String> groupIcons = new HashSet<String>();
		for (GenNavigatorChildReference nextReference : (List<? extends GenNavigatorChildReference>) myEditorGen.getNavigator().getChildReferences()) {
			if (nextReference.getGroupIcon() != null && nextReference.getGroupIcon().length() > 0) {
				groupIcons.add(nextReference.getGroupIcon());
			}
		}
		for (String iconPath : groupIcons) {
			generateGroupIcon(new Path(iconPath));
		}
	}
	
	private void generateGroupIcon(Path groupIconPath) throws InterruptedException, UnexpectedBehaviourException {
		doGenerateBinaryFile(myEmitters.getGroupIconEmitter(), groupIconPath, null);	
	}

	@SuppressWarnings("unchecked")
	protected void generatePropertySheetSections() throws UnexpectedBehaviourException, InterruptedException {
		if (myEditorGen.getPropertySheet().isNeedsCaption()) {
			doGenerateJavaClass(
				myEmitters.getPropertySheetLabelProviderEmitter(), 
				myEditorGen.getPropertySheet().getLabelProviderQualifiedClassName(), 
				myEditorGen.getPropertySheet());
		}
		for (GenPropertyTab tab : (List<? extends GenPropertyTab>) myEditorGen.getPropertySheet().getTabs()) {
			if (tab instanceof GenCustomPropertyTab) {
				doGenerateJavaClass(
					myEmitters.getPropertySectionEmitter(),
					((GenCustomPropertyTab) tab).getQualifiedClassName(),
					tab);
			}
		}
	}

	private void generateApplication() throws UnexpectedBehaviourException, InterruptedException {
		GenApplication application = myEditorGen.getApplication();
		if (application != null) {
			doGenerateJavaClass(myEmitters.getApplicationEmitter(), application.getQualifiedClassName(), application);
			doGenerateJavaClass(myEmitters.getActionBarAdvisorEmitter(), application.getActionBarAdvisorQualifiedClassName(), application);
			doGenerateJavaClass(myEmitters.getPerspectiveEmitter(), application.getPerspectiveQualifiedClassName(), application);
			doGenerateJavaClass(myEmitters.getWorkbenchAdvisorEmitter(), application.getWorkbenchAdvisorQualifiedClassName(), application);
			doGenerateJavaClass(myEmitters.getWorkbenchWindowAdvisorEmitter(), application.getWorkbenchWindowAdvisorQualifiedClassName(), application);
		}
	}

	private void internalGenerateJavaClass(TextEmitter emitter, String qualifiedClassName, Object argument) throws InterruptedException {
		internalGenerateJavaClass(emitter, CodeGenUtil.getPackageName(qualifiedClassName), CodeGenUtil.getSimpleClassName(qualifiedClassName), argument);
	}

	/**
	 * Passes initialized ImportManager as second template argument
	 */
	private void internalGenerateJavaClass(TextEmitter emitter, String packageName, String className, Object argument) throws InterruptedException {
		if (emitter instanceof IAutomaticImportManager) {
			doGenerateJavaClass(emitter, packageName, className, argument);
		} else {
			ImportAssistant importUtil = createImportAssistant(packageName, className);
			doGenerateJavaClass(emitter, packageName, className, argument, importUtil);
		}
	}

	protected void setupProgressMonitor() {
		Counter c = new Counter();
		c.registerFactor(GMFGenPackage.eINSTANCE.getGenNode(), 2);
		c.registerFactor(GMFGenPackage.eINSTANCE.getGenCompartment(), 2);
		c.registerFactor(GMFGenPackage.eINSTANCE.getGenLink(), 2);
		c.registerFactor(GMFGenPackage.eINSTANCE.getGenNodeLabel(), 2);
		c.registerFactor(GMFGenPackage.eINSTANCE.getGenLinkLabel(), 2);
		int total = c.getTotal(myDiagram);
		total++; // init
		total += 4; // text files
		total += 15; // out-of-cycle doGenerateJava... <- genDiagram + genEditor
		setupProgressMonitor(null, total);
	}
}
