/*
 * Copyright (c) 2006, 2008 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.codegen.util;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenStandardPreferencePage;
import org.eclipse.gmf.internal.common.reconcile.Copier;
import org.eclipse.gmf.internal.common.reconcile.Decision;
import org.eclipse.gmf.internal.common.reconcile.DefaultDecision;
import org.eclipse.gmf.internal.common.reconcile.Matcher;
import org.eclipse.gmf.internal.common.reconcile.ReconcilerConfigBase;
import org.eclipse.gmf.internal.common.reconcile.ReflectiveMatcher;
import org.eclipse.gmf.internal.common.reconcile.StringPatternDecision;

public class GMFGenConfig extends ReconcilerConfigBase {

	public GMFGenConfig() {
		final GMFGenPackage GMFGEN = GMFGenPackage.eINSTANCE;
		
		setMatcher(GMFGEN.getGenEditorGenerator(), ALWAYS_MATCH);
		preserveIfSet(GMFGEN.getGenEditorGenerator_CopyrightText());
		preserveIfSet(GMFGEN.getGenEditorGenerator_PackageNamePrefix());
		preserveIfSet(GMFGEN.getGenEditorGenerator_DomainFileExtension());
		preserveIfSet(GMFGEN.getGenEditorGenerator_DiagramFileExtension());
		preserveIfSet(GMFGEN.getGenEditorGenerator_SameFileForDiagramAndModel());
		preserveIfSet(GMFGEN.getGenEditorGenerator_ModelID());
		preserveIfSet(GMFGEN.getGenEditorGenerator_DynamicTemplates());
		preserveIfSet(GMFGEN.getGenEditorGenerator_TemplateDirectory());

		setMatcher(GMFGEN.getGenPlugin(), ALWAYS_MATCH); // exactly one feature for ALWAYS_MATCH GenEditorGenerator
		preserveIfSet(GMFGEN.getGenPlugin_ID());
		preserveIfSet(GMFGEN.getGenPlugin_Name());
		preserveIfSet(GMFGEN.getGenPlugin_Provider());
		preserveIfSet(GMFGEN.getGenPlugin_Version());
		preserveIfSet(GMFGEN.getGenPlugin_ActivatorClassName());
		preserveIfSet(GMFGEN.getGenPlugin_PrintingEnabled());

		setMatcher(GMFGEN.getGenEditorView(), ALWAYS_MATCH); //exactly one 
		preserveIfSet(GMFGEN.getGenEditorView_IconPath());
		preserveIfSet(GMFGEN.getGenEditorView_ClassName());
		preserveIfSet(GMFGEN.getGenEditorView_ID());

		setMatcher(GMFGEN.getGenDiagram(), ALWAYS_MATCH);
		restore(GMFGEN.getGenDiagram(), GMFGEN.getGenCommonBase_NotationViewFactoryClassName());
		restore(GMFGEN.getGenDiagram(), GMFGEN.getGenCommonBase_EditPartClassName());
		restore(GMFGEN.getGenDiagram(), GMFGEN.getGenCommonBase_ItemSemanticEditPolicyClassName());
		restore(GMFGEN.getGenDiagram(), GMFGEN.getGenContainerBase_CanonicalEditPolicyClassName());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getGenDiagram_Synchronized());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getMeasurementUnit_Units());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getShortcuts_ContainsShortcutsTo());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getShortcuts_ShortcutsProvidedFor());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getEditorCandies_CreationWizardIconPath());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getEditorCandies_CreationWizardCategoryID());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getEditorCandies_EditingDomainID());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getBatchValidation_ValidationEnabled());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getBatchValidation_LiveValidationUIFeedback());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getBatchValidation_ValidationDecorators());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getBatchValidation_ValidationDecoratorProviderClassName());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getBatchValidation_ValidationDecoratorProviderPriority());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getBatchValidation_ValidationProviderClassName());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getBatchValidation_ValidationProviderPriority());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getBatchValidation_MetricProviderPriority());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getBatchValidation_MetricProviderClassName());

		for (EClass node : new EClass[] { GMFGEN.getGenTopLevelNode(), GMFGEN.getGenChildNode(), GMFGEN.getGenChildLabelNode(), GMFGEN.getGenChildSideAffixedNode() }) {
			setMatcher(node, new VisualIDMatcher());
			restore(node, GMFGEN.getGenCommonBase_NotationViewFactoryClassName());
			restore(node, GMFGEN.getGenCommonBase_EditPartClassName());
			restore(node, GMFGEN.getGenCommonBase_ItemSemanticEditPolicyClassName());
			restore(node, GMFGEN.getGenContainerBase_CanonicalEditPolicyClassName());
			restore(node, GMFGEN.getGenNode_PrimaryDragEditPolicyQualifiedClassName());
			restore(node, GMFGEN.getGenNode_GraphicalNodeEditPolicyClassName());
			restore(node, GMFGEN.getGenNode_CreateCommandClassName());
		}

		setMatcher(GMFGEN.getGenCompartment(), new VisualIDMatcher());
		restore(GMFGEN.getGenCompartment(), GMFGEN.getGenCommonBase_NotationViewFactoryClassName());
		restore(GMFGEN.getGenCompartment(), GMFGEN.getGenCommonBase_EditPartClassName());
		restore(GMFGEN.getGenCompartment(), GMFGEN.getGenCommonBase_ItemSemanticEditPolicyClassName());
		restore(GMFGEN.getGenCompartment(), GMFGEN.getGenContainerBase_CanonicalEditPolicyClassName());
		restore(GMFGEN.getGenCompartment(), GMFGEN.getGenCompartment_ListLayout());
		preserveIfSet(GMFGEN.getGenCompartment_CanCollapse());
		preserveIfSet(GMFGEN.getGenCompartment_HideIfEmpty());
		preserveIfSet(GMFGEN.getGenCompartment_NeedsTitle());

		setMatcher(GMFGEN.getGenLink(), new VisualIDMatcher());
		restore(GMFGEN.getGenLink(), GMFGEN.getGenCommonBase_NotationViewFactoryClassName());
		restore(GMFGEN.getGenLink(), GMFGEN.getGenCommonBase_EditPartClassName());
		restore(GMFGEN.getGenLink(), GMFGEN.getGenCommonBase_ItemSemanticEditPolicyClassName());
		restore(GMFGEN.getGenLink(), GMFGEN.getGenLink_CreateCommandClassName());
		restore(GMFGEN.getGenLink(), GMFGEN.getGenLink_ReorientCommandClassName());
		preserveIfSet(GMFGEN.getGenLink_IncomingCreationAllowed());
		preserveIfSet(GMFGEN.getGenLink_OutgoingCreationAllowed());
		preserveIfSet(GMFGEN.getGenLink_ViewDirectionAlignedWithModel());
		preserveIfSet(GMFGEN.getGenLink_TreeBranch());

		for (EClass label : new EClass[] { GMFGEN.getGenLinkLabel(), GMFGEN.getGenNodeLabel(), GMFGEN.getGenExternalNodeLabel() }) {
			setMatcher(label, new VisualIDMatcher());
			restore(label, GMFGEN.getGenCommonBase_NotationViewFactoryClassName());
			restore(label, GMFGEN.getGenCommonBase_EditPartClassName());
			restore(label, GMFGEN.getGenCommonBase_ItemSemanticEditPolicyClassName());
		}

		//if parent node is matched, then viemap is matched automatically because it is [1] feature.
		//there are nothing to reconcile for viewmaps, all their properties are derived
		//we need this only to dig into viewmap attributes
		setMatcherForAllSubclasses(GMFGEN.getViewmap(), ALWAYS_MATCH);

		setMatcher(GMFGEN.getDefaultSizeAttributes(), ALWAYS_MATCH);
		setCopier(GMFGEN.getDefaultSizeAttributes(), Copier.COMPLETE_COPY);
		preserveIfSet(GMFGEN.getDefaultSizeAttributes_Height());
		preserveIfSet(GMFGEN.getDefaultSizeAttributes_Width());
		
		setMatcherForAllSubclasses(GMFGEN.getAttributes(), ALWAYS_MATCH);
		setCopierForAllSubclasses(GMFGEN.getAttributes(), Copier.COMPLETE_COPY);

		// provided GenCommonBase matched, custom behaviour should be kept as is
		setMatcher(GMFGEN.getCustomBehaviour(), ALWAYS_MATCH);
		setCopier(GMFGEN.getCustomBehaviour(), Copier.COMPLETE_COPY);

		// We assume there's only one OpenDiagramBehaviour per GenCommonBase, hence do not attempt to match anything but metaclass
		setMatcher(GMFGEN.getOpenDiagramBehaviour(), ALWAYS_MATCH);
		class KeepOldIfNewIsByPatternOrNotSet extends StringPatternDecision {

			KeepOldIfNewIsByPatternOrNotSet(EAttribute feature, String pattern) {
				super(pattern, feature);
			}

			@Override
			public void apply(EObject current, EObject old) {
				String newValue = (String) current.eGet(getFeature());
				if (isValueSet(old) && (newValue == null || myPattern.matcher(newValue).matches())) {
					preserveOld(current, old);
				} else {
					acceptNew(current, old);
				}
			}
		}
		// XXX not sure whether to keep old value on newValue == null is right, as null value is perfectly
		// legal and sensible (meaning this very diagram). Keeping old for now because it seems easier to reset 
		// value to null rather than to type once again.
		addDecision(GMFGEN.getOpenDiagramBehaviour(), new KeepOldIfNewIsByPatternOrNotSet(GMFGEN.getOpenDiagramBehaviour_DiagramKind(), "^FIXME.*")); //$NON-NLS-1$
		addDecision(GMFGEN.getOpenDiagramBehaviour(), new KeepOldIfNewIsByPatternOrNotSet(GMFGEN.getOpenDiagramBehaviour_EditorID(), "^FIXME.*")); //$NON-NLS-1$
		preserveIfSet(GMFGEN.getOpenDiagramBehaviour_EditPolicyClassName());
		preserveIfSet(GMFGEN.getOpenDiagramBehaviour_OpenAsEclipseEditor());

		// if there's a need to keep manually written openDiagramBehavior, uncomment next line 
		// for Reconciler#handleNotMatchedOld to perform a copy
		// setCopier(GMFGEN.getOpenDiagramBehaviour(), Copier.COMPLETE_COPY);

		setMatcher(GMFGEN.getMetamodelType(), ALWAYS_MATCH);
		restore(GMFGEN.getMetamodelType(), GMFGEN.getMetamodelType_EditHelperClassName());
		preserveIfSet(GMFGEN.getMetamodelType(), GMFGEN.getElementType_DisplayName());
		preserveIfSet(GMFGEN.getMetamodelType(), GMFGEN.getElementType_DefinedExternally());

		setMatcher(GMFGEN.getSpecializationType(), ALWAYS_MATCH);
		restore(GMFGEN.getSpecializationType(), GMFGEN.getSpecializationType_EditHelperAdviceClassName());
		preserveIfSet(GMFGEN.getSpecializationType(), GMFGEN.getElementType_DisplayName());
		preserveIfSet(GMFGEN.getSpecializationType(), GMFGEN.getElementType_DefinedExternally());

		setMatcher(GMFGEN.getGenPropertySheet(), ALWAYS_MATCH);
		preserveIfSet(GMFGEN.getGenPropertySheet_ReadOnly());
		preserveIfSet(GMFGEN.getGenPropertySheet_NeedsCaption());
		preserveIfSet(GMFGEN.getGenPropertySheet_PackageName());
		preserveIfSet(GMFGEN.getGenPropertySheet_LabelProviderClassName());

		setMatcherForAllSubclasses(GMFGEN.getGenPropertyTab(), new ReflectiveMatcher(GMFGEN.getGenPropertyTab_ID()));
		preserveIfSet(GMFGEN.getGenStandardPropertyTab(), GMFGEN.getGenPropertyTab_Label());

		addDecision(GMFGEN.getGenCustomPropertyTab(), new KeepOldIfNewIsByPatternOrNotSet(GMFGEN.getGenPropertyTab_Label(), "^Core$")); //$NON-NLS-1$
		preserveIfSet(GMFGEN.getGenCustomPropertyTab_ClassName());
		setCopier(GMFGEN.getGenCustomPropertyTab(), Copier.COMPLETE_COPY);

		setMatcher(GMFGEN.getGenNavigator(), ALWAYS_MATCH);
		preserveIfRemoved(GMFGEN.getGenEditorGenerator(), GMFGEN.getGenEditorGenerator_Navigator());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenDomainModelNavigator_GenerateDomainModelNavigator());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenDomainModelNavigator_DomainContentExtensionID());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenDomainModelNavigator_DomainContentExtensionName());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenDomainModelNavigator_DomainContentExtensionPriority());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenDomainModelNavigator_DomainContentProviderClassName());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenDomainModelNavigator_DomainLabelProviderClassName());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenDomainModelNavigator_DomainModelElementTesterClassName());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenDomainModelNavigator_DomainNavigatorItemClassName());
		preserveIfSet(GMFGEN.getGenNavigator_ContentExtensionID());
		preserveIfSet(GMFGEN.getGenNavigator_ContentExtensionName());
		preserveIfSet(GMFGEN.getGenNavigator_ContentExtensionPriority());
		preserveIfSet(GMFGEN.getGenNavigator_LinkHelperExtensionID());
		preserveIfSet(GMFGEN.getGenNavigator_SorterExtensionID());
		preserveIfSet(GMFGEN.getGenNavigator_ActionProviderID());
		preserveIfSet(GMFGEN.getGenNavigator_ContentProviderClassName());
		preserveIfSet(GMFGEN.getGenNavigator_LabelProviderClassName());
		preserveIfSet(GMFGEN.getGenNavigator_LinkHelperClassName());
		preserveIfSet(GMFGEN.getGenNavigator_SorterClassName());
		preserveIfSet(GMFGEN.getGenNavigator_ActionProviderClassName());
		preserveIfSet(GMFGEN.getGenNavigator_AbstractNavigatorItemClassName());
		preserveIfSet(GMFGEN.getGenNavigator_NavigatorGroupClassName());
		preserveIfSet(GMFGEN.getGenNavigator_NavigatorItemClassName());
		preserveIfSet(GMFGEN.getGenNavigator_UriInputTesterClassName());
		preserveIfSet(GMFGEN.getGenNavigator_PackageName());

		setMatcher(GMFGEN.getGenDiagramPreferences(), ALWAYS_MATCH);
		setCopier(GMFGEN.getGenDiagramPreferences(), Copier.COMPLETE_COPY);

		setMatcher(GMFGEN.getGenApplication(), ALWAYS_MATCH);
		preserveIfSet(GMFGEN.getGenApplication_ID());
		preserveIfSet(GMFGEN.getGenApplication_Title());
		preserveIfSet(GMFGEN.getGenApplication_PackageName());
		preserveIfSet(GMFGEN.getGenApplication_ClassName());
		preserveIfSet(GMFGEN.getGenApplication_PerspectiveId());
		preserveIfSet(GMFGEN.getGenApplication_SupportFiles());

		// XXX ReflectiveMatcher(Kind) instead?
		setMatcher(GMFGEN.getGenStandardPreferencePage(), new Matcher() {

			public boolean match(EObject current, EObject old) {
				assert current instanceof GenStandardPreferencePage;
				assert old instanceof GenStandardPreferencePage;
				GenStandardPreferencePage curPage = (GenStandardPreferencePage) current;
				GenStandardPreferencePage oldPage = (GenStandardPreferencePage) old;
				if (curPage.getParent() == null) {
					//single root page, just match it with other root
					return oldPage.getParent() == null;
				}
				return curPage.getKind() == oldPage.getKind();
			}
		});
		addDecision(GMFGEN.getGenStandardPreferencePage(), new Decision.ALWAYS_OLD(GMFGEN.getGenPreferencePage_ID()));
		addDecision(GMFGEN.getGenStandardPreferencePage(), new Decision.ALWAYS_OLD(GMFGEN.getGenPreferencePage_Name()));
		setCopier(GMFGEN.getGenCustomPreferencePage(), Copier.COMPLETE_COPY);
		//
		// preserve model access attributes, or completely copy old if none in the new model found.
		setMatcher(GMFGEN.getDynamicModelAccess(), ALWAYS_MATCH);
		preserveIfSet(GMFGEN.getDynamicModelAccess_ClassName());
		preserveIfSet(GMFGEN.getDynamicModelAccess_PackageName());
		setCopier(GMFGEN.getDynamicModelAccess(), Copier.COMPLETE_COPY);
		
		setMatcher(GMFGEN.getGenExpressionProviderContainer(), ALWAYS_MATCH);
		setMatcher(GMFGEN.getGenJavaExpressionProvider(), ALWAYS_MATCH);
		preserveIfSet(GMFGEN.getGenJavaExpressionProvider_InjectExpressionBody());

		setMatcher(GMFGEN.getGenParsers(), ALWAYS_MATCH);
		preserveIfSet(GMFGEN.getGenParsers_ClassName());
		preserveIfSet(GMFGEN.getGenParsers_PackageName());
		preserveIfSet(GMFGEN.getGenParsers_ProviderPriority());
		preserveIfSet(GMFGEN.getGenParsers_ExtensibleViaService());

		// FIXME setMatcher(GMFGEN.getGenContextMenu(), based on contexts);
		setCopier(GMFGEN.getGenCustomAction(), Copier.COMPLETE_COPY);
		setMatcher(GMFGEN.getGenCommandAction(), new ReflectiveMatcher(GMFGEN.getGenCommandAction_CommandIdentifier()));
		preserveIfSet(GMFGEN.getGenCommandAction_Name());
		setCopier(GMFGEN.getGenCommandAction(), Copier.COMPLETE_COPY); // copy then, if none found
	}

	// XXX rename?: preserveOld
	private void restore(EClass eClass, EAttribute feature) {
		addDecision(eClass, new Decision.ALWAYS_OLD(feature));
	}

	private void preserveIfSet(EAttribute feature) {
		assert !feature.getEContainingClass().isAbstract();
		addDecision(feature.getEContainingClass(), new DefaultDecision(feature));
	}
	private void preserveIfSet(EClass eClass, EAttribute feature) {
		//FIXME: only attributes for now, allow references
		addDecision(eClass, new DefaultDecision(feature));
	}

	private void preserveIfRemoved(EClass eClass, EStructuralFeature feature) {
		addDecision(eClass, new DefaultDecision(feature, true));
	}
}
