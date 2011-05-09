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

import java.lang.ref.SoftReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenChildLabelNode;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase;
import org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderContainer;
import org.eclipse.gmf.codegen.gmfgen.GenLanguage;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkLabel;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.GenNodeLabel;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.gmf.internal.common.codegen.GeneratorBase;
import org.eclipse.gmf.internal.common.codegen.ImportUtil;
import org.eclipse.gmf.internal.common.codegen.TextEmitter;

/**
 * Invokes JET templates to populate diagram editor project.
 * TODO reuse fullRT.Generator as much as possible
 * @author artem
 */
public class Generator extends GeneratorBase implements Runnable {

	private final GenEditorGenerator myEditorGen; 

	private final GenDiagram myDiagram;

	private final CodegenEmitters myEmitters;

	private static Map/*<URI, SoftReference>*/ myCachedURI2EmitterMap = new HashMap();

	public Generator(GenEditorGenerator genModel) {
		myDiagram = genModel.getDiagram();
		myEditorGen = genModel;
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
		final Path examplaryLocation = new Path(myEditorGen.getDomainGenModel().getModelDirectory());
		initializeEditorProject(pluginID, guessNewProjectLocation(examplaryLocation, pluginID));

		doGenerateFile(myEmitters.getManifestGenerator(), new Path("META-INF/MANIFEST.MF"), new Object[] { myEditorGen.getPlugin() });
		doGenerateFile(myEmitters.getBuildPropertiesGenerator(), new Path("build.properties"), new Object[] { myEditorGen.getPlugin() });
		doGenerateFile(myEmitters.getPluginXML(), new Path("plugin.xml"), new Object[] { myEditorGen.getPlugin() });
		doGenerateFile(myEmitters.getPluginPropertiesGenerator(), new Path("plugin.properties"), new Object[] { myEditorGen.getPlugin() });

		internalGenerateJavaClass(myEmitters.getCreationWizardGenerator(), myDiagram.getCreationWizardQualifiedClassName(), myDiagram);
		internalGenerateJavaClass(myEmitters.getCreationWizardPageGenerator(), myDiagram.getCreationWizardPageQualifiedClassName(), myDiagram);
		internalGenerateJavaClass(myEmitters.getPluginGenerator(), myEditorGen.getPlugin().getActivatorQualifiedClassName(), myEditorGen.getPlugin());

		internalGenerateJavaClass(myEmitters.getActionBarContributorGenerator(), myEditorGen.getEditor().getActionBarContributorQualifiedClassName(), myEditorGen.getEditor());
		internalGenerateJavaClass(myEmitters.getDiagramEditorUtilGenerator(), myDiagram.getDiagramEditorUtilQualifiedClassName(), myDiagram);
		internalGenerateJavaClass(myEmitters.getEditorGenerator(), myEditorGen.getEditor().getQualifiedClassName(), myEditorGen.getEditor());
		internalGenerateJavaClass(myEmitters.getPropertySourceProviderGenerator(), myDiagram.getPropertyProviderQualifiedClassName(), myDiagram);
		if (myDiagram.getPalette() != null) {
			internalGenerateJavaClass(myEmitters.getPaletteFactoryGenerator(), myDiagram.getPalette().getFactoryQualifiedClassName(), myDiagram);
		}
		internalGenerateJavaClass(myEmitters.getUpdatableEditPartGenerator(), myDiagram.getEditPartsPackageName(), "IUpdatableEditPart", myDiagram); // XXX: should be customizable
		internalGenerateJavaClass(myEmitters.getWrappingCommandGenerator(), myDiagram.getEditPartsPackageName(), "WrappingCommand", myDiagram); // XXX: should be customizable or moved to a lite-runtime plugin
		internalGenerateJavaClass(myEmitters.getEditPartFactoryGenerator(), myDiagram.getEditPartFactoryQualifiedClassName(), myDiagram);
		internalGenerateJavaClass(myEmitters.getDiagramEditPartGenerator(), myDiagram.getEditPartQualifiedClassName(), myDiagram);
		internalGenerateJavaClass(myEmitters.getBendpointEditPolicyGenerator(), myDiagram.getEditPoliciesPackageName(), "BendpointEditPolicy", myDiagram);	//XXX: should be moved to a lite-runtime plugin

		for (Iterator it = myDiagram.getAllNodes().iterator(); it.hasNext(); ) {
			final GenNode next = (GenNode) it.next();
			if (!(next instanceof GenChildLabelNode)) {
				internalGenerateJavaClass(myEmitters.getNodeEditPartGenerator(), next.getEditPartQualifiedClassName(), next);
				for (Iterator it2 = next.getLabels().iterator(); it2.hasNext();) {
					final GenNodeLabel label = (GenNodeLabel) it2.next();
					internalGenerateJavaClass(myEmitters.getNodeLabelEditPartGenerator(), label.getEditPartQualifiedClassName(), label);
					internalGenerateJavaClass(myEmitters.getLabelViewFactoryGenerator(), label.getNotationViewFactoryQualifiedClassName(), label);
				}
				internalGenerateJavaClass(myEmitters.getNodeViewFactoryGenerator(), next.getNotationViewFactoryQualifiedClassName(), next);
			} else {
				internalGenerateJavaClass(myEmitters.getChildNodeEditPartGenerator(), next.getEditPartQualifiedClassName(), next);
				internalGenerateJavaClass(myEmitters.getLabelViewFactoryGenerator(), next.getNotationViewFactoryQualifiedClassName(), next);
			}
		}
		internalGenerateJavaClass(myEmitters.getAbstractParserGenerator(),myDiagram.getAbstractParserQualifiedClassName(), myDiagram);
		for (Iterator it = myDiagram.getLinks().iterator(); it.hasNext();) {
			final GenLink next = (GenLink) it.next();
			internalGenerateJavaClass(myEmitters.getLinkEditPartGenerator(), next.getEditPartQualifiedClassName(), next);
			for (Iterator it2 = next.getLabels().iterator(); it2.hasNext();) {
				final GenLinkLabel label = (GenLinkLabel) it2.next();
				internalGenerateJavaClass(myEmitters.getLinkLabelEditPartGenerator(), label.getEditPartQualifiedClassName(), label);
				internalGenerateJavaClass(myEmitters.getLabelViewFactoryGenerator(), label.getNotationViewFactoryQualifiedClassName(), label);
			}
			internalGenerateJavaClass(myEmitters.getLinkViewFactoryGenerator(), next.getNotationViewFactoryQualifiedClassName(), next);
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
		internalGenerateJavaClass(myEmitters.getCreateNotationalElementCommandGenerator(), myDiagram.getEditCommandsPackageName(), "CreateNotationalElementCommand", myDiagram);
		internalGenerateJavaClass(myEmitters.getCreateNotationalEdgeCommandGenerator(), myDiagram.getEditCommandsPackageName(), "CreateNotationalEdgeCommand", myDiagram);
		internalGenerateJavaClass(myEmitters.getRemoveNotationalElementCommandGenerator(), myDiagram.getEditCommandsPackageName(), "RemoveNotationalElementCommand", myDiagram);
		internalGenerateJavaClass(myEmitters.getRemoveNotationalEdgeCommandGenerator(), myDiagram.getEditCommandsPackageName(), "RemoveNotationalEdgeCommand", myDiagram);
		internalGenerateJavaClass(myEmitters.getReplaceNotationalElementCommandGenerator(), myDiagram.getEditCommandsPackageName(), "ReplaceNotationalElementCommand", myDiagram);
		internalGenerateJavaClass(myEmitters.getReconnectNotationalEdgeSourceCommandGenerator(), myDiagram.getEditCommandsPackageName(), "ReconnectNotationalEdgeSourceCommand", myDiagram);
		internalGenerateJavaClass(myEmitters.getReconnectNotationalEdgeTargetCommandGenerator(), myDiagram.getEditCommandsPackageName(), "ReconnectNotationalEdgeTargetCommand", myDiagram);
	}

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
	
	private void internalGenerateJavaClass(TextEmitter emitter, String qualifiedClassName, Object argument) throws InterruptedException {
		internalGenerateJavaClass(emitter, CodeGenUtil.getPackageName(qualifiedClassName), CodeGenUtil.getSimpleClassName(qualifiedClassName), argument);
	}

	/**
	 * Passes initialized ImportManager as second template argument
	 */
	private void internalGenerateJavaClass(TextEmitter emitter, String packageName, String className, Object argument) throws InterruptedException {
		ImportUtil importUtil = new ImportUtil(packageName, className);
		doGenerateJavaClass(emitter, packageName, className, new Object[] { new Object[] {argument, importUtil } });
	}

	protected void setupProgressMonitor() {
		Counter c = new Counter();
		c.curiousAbout(GMFGenPackage.eINSTANCE.getGenNode());
		c.curiousAbout(GMFGenPackage.eINSTANCE.getGenCompartment());
		c.curiousAbout(GMFGenPackage.eINSTANCE.getGenLink());
		c.curiousAbout(GMFGenPackage.eINSTANCE.getGenNodeLabel());
		c.curiousAbout(GMFGenPackage.eINSTANCE.getGenLinkLabel());
		c.count(myDiagram);
		int total = 2 * c.getCount(GMFGenPackage.eINSTANCE.getGenNode());
		total += 2 * c.getCount(GMFGenPackage.eINSTANCE.getGenCompartment());
		total += 2 * c.getCount(GMFGenPackage.eINSTANCE.getGenLink());
		total += 2 * c.getCount(GMFGenPackage.eINSTANCE.getGenNodeLabel());
		total += 2 * c.getCount(GMFGenPackage.eINSTANCE.getGenLinkLabel());
		total++; // init
		total += 4; // text files
		total += 15; // out-of-cycle doGenerateJava... <- genDiagram + genEditor
		setupProgressMonitor("Generation in progress...", total);
	}

	private static final class Counter {
		private final List/*<EClass>*/ myAttractions = new ArrayList();
		private int[] myHits;
		
		public void curiousAbout(EClass eClass) {
			myAttractions.add(eClass);
		}

		public void count(EObject start) {
			myHits = new int[myAttractions.size()];
			final EClass[] attractions = (EClass[]) myAttractions.toArray(new EClass[myAttractions.size()]);
			doCount(start.eClass(), attractions);
			for (Iterator it = start.eAllContents(); it.hasNext(); ) {
				EObject next = (EObject) it.next();
				doCount(next.eClass(), attractions);
			}
		}

		private void doCount(EClass eClass, EClass[] attractions) {
			for (int i = 0; i < attractions.length; i++) {
				if (attractions[i].isSuperTypeOf(eClass)) {
					myHits[i]++;
				}
			}
		}

		public int getCount(EClass eClass) {
			int index = myAttractions.indexOf(eClass);
			if (index == -1) {
				throw new IllegalArgumentException("No class " + eClass + " was previously registered with curiousAbout(EClass)");
			}
			return myHits[index];
		}
	}
}
