/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
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
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.internal.common.reconcile.Copier;
import org.eclipse.gmf.internal.common.reconcile.DefaultDecision;
import org.eclipse.gmf.internal.common.reconcile.Matcher;
import org.eclipse.gmf.internal.common.reconcile.ReconcilerConfigBase;
import org.eclipse.gmf.internal.common.reconcile.ReflectiveMatcher;
import org.eclipse.gmf.internal.common.reconcile.StringPatternDecision;

/**
 * XXX Perhaps, org.eclipse.gmf.codegen/oeg.internal.util would be better place for this class. 
 */
public class GMFGenConfig extends ReconcilerConfigBase {

	private final GMFGenPackage GMFGEN = GMFGenPackage.eINSTANCE;

	public GMFGenConfig() {
		setMatcher(GMFGEN.getGenEditorGenerator(), ALWAYS_MATCH);
		preserveIfSet(GMFGEN.getGenEditorGenerator(), GMFGEN.getGenEditorGenerator_CopyrightText());
		preserveIfSet(GMFGEN.getGenEditorGenerator(), GMFGEN.getGenEditorGenerator_PackageNamePrefix());
		preserveIfSet(GMFGEN.getGenEditorGenerator(), GMFGEN.getGenEditorGenerator_DomainFileExtension());
		preserveIfSet(GMFGEN.getGenEditorGenerator(), GMFGEN.getGenEditorGenerator_DiagramFileExtension());
		preserveIfSet(GMFGEN.getGenEditorGenerator(), GMFGEN.getGenEditorGenerator_SameFileForDiagramAndModel());
		preserveIfSet(GMFGEN.getGenEditorGenerator(), GMFGEN.getGenEditorGenerator_ModelID());
		preserveIfSet(GMFGEN.getGenEditorGenerator(), GMFGEN.getGenEditorGenerator_DynamicTemplates());
		preserveIfSet(GMFGEN.getGenEditorGenerator(), GMFGEN.getGenEditorGenerator_TemplateDirectory());

		setMatcher(GMFGEN.getGenPlugin(), ALWAYS_MATCH); //exactly one feature for ALWAYS_MATCH GenEditorGenerator
		preserveIfSet(GMFGEN.getGenPlugin(), GMFGEN.getGenPlugin_ID());
		preserveIfSet(GMFGEN.getGenPlugin(), GMFGEN.getGenPlugin_Name());
		preserveIfSet(GMFGEN.getGenPlugin(), GMFGEN.getGenPlugin_Provider());
		preserveIfSet(GMFGEN.getGenPlugin(), GMFGEN.getGenPlugin_Version());
		preserveIfSet(GMFGEN.getGenPlugin(), GMFGEN.getGenPlugin_ActivatorClassName());
		preserveIfSet(GMFGEN.getGenPlugin(), GMFGEN.getGenPlugin_PrintingEnabled());

		setMatcher(GMFGEN.getGenEditorView(), ALWAYS_MATCH); //exactly one 
		preserveIfSet(GMFGEN.getGenEditorView(), GMFGEN.getGenEditorView_IconPath());
		preserveIfSet(GMFGEN.getGenEditorView(), GMFGEN.getGenEditorView_ClassName());
		preserveIfSet(GMFGEN.getGenEditorView(), GMFGEN.getGenEditorView_ID());

		setMatcher(GMFGEN.getGenDiagram(), ALWAYS_MATCH);
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getShortcuts_ContainsShortcutsTo());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getShortcuts_ShortcutsProvidedFor());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getEditorCandies_CreationWizardIconPath());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getEditorCandies_CreationWizardCategoryID());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getGenDiagram_Synchronized());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getBatchValidation_ValidationEnabled());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getBatchValidation_LiveValidationUIFeedback());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getBatchValidation_ValidationDecorators());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getBatchValidation_ValidationDecoratorProviderClassName());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getBatchValidation_ValidationDecoratorProviderPriority());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getBatchValidation_ValidationProviderClassName());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getBatchValidation_ValidationProviderPriority());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getBatchValidation_MetricProviderPriority());
		preserveIfSet(GMFGEN.getGenDiagram(), GMFGEN.getBatchValidation_MetricProviderClassName());

		setMatcher(GMFGEN.getGenTopLevelNode(), getGenNodeMatcher());
		preserveIfNotByPattern(GMFGEN.getGenTopLevelNode(), GMFGEN.getGenContainerBase_CanonicalEditPolicyClassName(), ".*" + GenChildContainer.CANONICAL_EDIT_POLICY_SUFFIX); //$NON-NLS-1$
		preserveIfNotByPattern(GMFGEN.getGenTopLevelNode(), GMFGEN.getGenNode_GraphicalNodeEditPolicyClassName(), ".*" + GenNode.GRAPHICAL_NODE_EDIT_POLICY_SUFFIX); //$NON-NLS-1$
		//[155332]preserveIfNotByPattern(GMFGEN.getGenTopLevelNode(), GMFGEN.getGenCommonBase_EditPartClassName(), ".*" + GenCommonBase.EDIT_PART_SUFFIX);
		preserveIfSet(GMFGEN.getGenTopLevelNode(), GMFGEN.getGenNode_PrimaryDragEditPolicyQualifiedClassName());

		setMatcher(GMFGEN.getGenChildNode(), getGenNodeMatcher());
		preserveIfNotByPattern(GMFGEN.getGenChildNode(), GMFGEN.getGenContainerBase_CanonicalEditPolicyClassName(), ".*" + GenChildContainer.CANONICAL_EDIT_POLICY_SUFFIX); //$NON-NLS-1$
		preserveIfNotByPattern(GMFGEN.getGenChildNode(), GMFGEN.getGenNode_GraphicalNodeEditPolicyClassName(), ".*" + GenNode.GRAPHICAL_NODE_EDIT_POLICY_SUFFIX); //$NON-NLS-1$
		//[155332]preserveIfNotByPattern(GMFGEN.getGenChildNode(), GMFGEN.getGenCommonBase_EditPartClassName(), ".*" + GenCommonBase.EDIT_PART_SUFFIX);
		preserveIfSet(GMFGEN.getGenChildNode(), GMFGEN.getGenNode_PrimaryDragEditPolicyQualifiedClassName());

		setMatcher(GMFGEN.getGenChildLabelNode(), getGenNodeMatcher());
		preserveIfSet(GMFGEN.getGenChildLabelNode(), GMFGEN.getGenNode_PrimaryDragEditPolicyQualifiedClassName());

		setMatcher(GMFGEN.getGenChildSideAffixedNode(), getGenNodeMatcher());
		preserveIfSet(GMFGEN.getGenChildSideAffixedNode(), GMFGEN.getGenNode_PrimaryDragEditPolicyQualifiedClassName());

		setMatcher(GMFGEN.getGenCompartment(), new ReflectiveMatcher(GMFGEN.getGenCompartment_Title()));
		preserveIfSet(GMFGEN.getGenCompartment(), GMFGEN.getGenCompartment_ListLayout());
		preserveIfSet(GMFGEN.getGenCompartment(), GMFGEN.getGenCompartment_CanCollapse());
		preserveIfSet(GMFGEN.getGenCompartment(), GMFGEN.getGenCompartment_HideIfEmpty());
		preserveIfSet(GMFGEN.getGenCompartment(), GMFGEN.getGenCompartment_NeedsTitle());
		//[155332]preserveIfNotByPattern(GMFGEN.getGenCompartment(), GMFGEN.getGenCommonBase_EditPartClassName(), ".*" + GenCommonBase.EDIT_PART_SUFFIX);

		//if parent node is matched, then viemap is matched automatically because it is [1] feature.
		//there are nothing to reconcile for viewmaps, all their properties are derived
		//we need this only to dig into viewmap attributes
		setMatcherForAllSubclasses(GMFGEN.getViewmap(), ALWAYS_MATCH);

		setMatcher(GMFGEN.getDefaultSizeAttributes(), ALWAYS_MATCH);
		setCopier(GMFGEN.getDefaultSizeAttributes(), Copier.COMPLETE_COPY);
		preserveIfSet(GMFGEN.getDefaultSizeAttributes(), GMFGEN.getDefaultSizeAttributes_Height());
		preserveIfSet(GMFGEN.getDefaultSizeAttributes(), GMFGEN.getDefaultSizeAttributes_Width());

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
		preserveIfSet(GMFGEN.getOpenDiagramBehaviour(), GMFGEN.getOpenDiagramBehaviour_EditPolicyClassName());
		preserveIfSet(GMFGEN.getOpenDiagramBehaviour(), GMFGEN.getOpenDiagramBehaviour_OpenAsEclipseEditor());

		// if there's a need to keep manually written openDiagramBehavior, uncomment next line 
		// for Reconciler#handleNotMatchedOld to perform a copy
		// setCopier(GMFGEN.getOpenDiagramBehaviour(), Copier.COMPLETE_COPY);

		setMatcher(GMFGEN.getMetamodelType(), ALWAYS_MATCH);
		preserveIfSet(GMFGEN.getMetamodelType(), GMFGEN.getElementType_DisplayName());
		preserveIfSet(GMFGEN.getMetamodelType(), GMFGEN.getElementType_DefinedExternally());

		setMatcher(GMFGEN.getSpecializationType(), ALWAYS_MATCH);
		preserveIfSet(GMFGEN.getSpecializationType(), GMFGEN.getElementType_DisplayName());
		preserveIfSet(GMFGEN.getSpecializationType(), GMFGEN.getElementType_DefinedExternally());

		setMatcher(GMFGEN.getGenPropertySheet(), ALWAYS_MATCH);
		preserveIfSet(GMFGEN.getGenPropertySheet(), GMFGEN.getGenPropertySheet_ReadOnly());
		preserveIfSet(GMFGEN.getGenPropertySheet(), GMFGEN.getGenPropertySheet_NeedsCaption());
		preserveIfSet(GMFGEN.getGenPropertySheet(), GMFGEN.getGenPropertySheet_PackageName());
		preserveIfSet(GMFGEN.getGenPropertySheet(), GMFGEN.getGenPropertySheet_LabelProviderClassName());

		setMatcherForAllSubclasses(GMFGEN.getGenPropertyTab(), new ReflectiveMatcher(GMFGEN.getGenPropertyTab_ID()));
		preserveIfSet(GMFGEN.getGenStandardPropertyTab(), GMFGEN.getGenPropertyTab_Label());

		preserveIfSet(GMFGEN.getGenCustomPropertyTab(), GMFGEN.getGenPropertyTab_Label());
		preserveIfSet(GMFGEN.getGenCustomPropertyTab(), GMFGEN.getGenCustomPropertyTab_ClassName());
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
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenNavigator_ContentExtensionID());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenNavigator_ContentExtensionName());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenNavigator_ContentExtensionPriority());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenNavigator_LinkHelperExtensionID());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenNavigator_SorterExtensionID());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenNavigator_ActionProviderID());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenNavigator_ContentProviderClassName());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenNavigator_LabelProviderClassName());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenNavigator_LinkHelperClassName());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenNavigator_SorterClassName());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenNavigator_ActionProviderClassName());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenNavigator_AbstractNavigatorItemClassName());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenNavigator_NavigatorGroupClassName());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenNavigator_NavigatorItemClassName());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenNavigator_UriInputTesterClassName());
		preserveIfSet(GMFGEN.getGenNavigator(), GMFGEN.getGenNavigator_PackageName());
	}

	private Matcher getGenNodeMatcher() {
		//FIXME: use new AttributeMatcher("domainMetaClass")
		return new ReflectiveMatcher(GMFGEN.getGenNode(), new ReflectiveMatcher.Reflector() {

			public Object reflect(EObject target) {
				GenNode genNode = (GenNode) target;
				return genNode.getDomainMetaClass();
			}
		});
	}

	private void preserveIfSet(EClass eClass, EAttribute feature) {
		//FIXME: only attributes for now, allow references
		addDecision(eClass, new DefaultDecision(feature));
	}

	private void preserveIfRemoved(EClass eClass, EStructuralFeature feature) {
		addDecision(eClass, new DefaultDecision(feature, true));
	}

	private void preserveIfNotByPattern(EClass eClass, EAttribute feature, String pattern) {
		addDecision(eClass, new StringPatternDecision(pattern, feature));
	}
}
