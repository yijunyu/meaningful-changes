/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.codegen.gmfgen.GenMetricRule} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class GenMetricRuleItemProvider extends GenRuleBaseItemProvider implements IEditingDomainItemProvider,
  IItemLabelProvider, IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
       * describing all of the children that can be created under this object.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void collectNewChildDescriptors (Collection < Object > newChildDescriptors, Object object) {
        super.collectNewChildDescriptors (newChildDescriptors, object);
        newChildDescriptors.add (createChildParameter (GMFGenPackage.eINSTANCE.getGenMetricRule_Rule (), GMFGenFactory.
          eINSTANCE.createValueExpression ()));
        /* avoid using other ValueExpression sub-types as children
           newChildDescriptors.add
           (createChildParameter
           (GMFGenPackage.eINSTANCE.getGenMetricRule_Rule(),
           GMFGenFactory.eINSTANCE.createGenConstraint()));
           
           newChildDescriptors.add
           (createChildParameter
           (GMFGenPackage.eINSTANCE.getGenMetricRule_Rule(),
           GMFGenFactory.eINSTANCE.createGenFeatureValueSpec()));
           */ newChildDescriptors.add (createChildParameter (GMFGenPackage.eINSTANCE.getGenMetricRule_Target (), GMFGenFactory.
          eINSTANCE.createGenDomainElementTarget ()));
        newChildDescriptors.add (createChildParameter (GMFGenPackage.eINSTANCE.getGenMetricRule_Target (), GMFGenFactory.
          eINSTANCE.createGenDiagramElementTarget ()));
        newChildDescriptors.add (createChildParameter (GMFGenPackage.eINSTANCE.getGenMetricRule_Target (), GMFGenFactory.
          eINSTANCE.createGenNotationElementTarget ()));
    }

}

