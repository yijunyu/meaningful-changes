/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.mappings.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.mappings.MetricRule} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class MetricRuleItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IItemLabelProvider
  , IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
       * describing all of the children that can be created under this object.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void collectNewChildDescriptors (Collection < Object > newChildDescriptors, Object object) {
        super.collectNewChildDescriptors (newChildDescriptors, object);
        newChildDescriptors.add (createChildParameter (GMFMapPackage.eINSTANCE.getMetricRule_Rule (), GMFMapFactory.eINSTANCE.
          createValueExpression ()));
        /* avoid using other ValueExpression sub-types as children
           newChildDescriptors.add
           (createChildParameter
           (GMFMapPackage.eINSTANCE.getMetricRule_Rule(),
           GMFMapFactory.eINSTANCE.createConstraint()));
           
           newChildDescriptors.add
           (createChildParameter
           (GMFMapPackage.eINSTANCE.getMetricRule_Rule(),
           GMFMapFactory.eINSTANCE.createFeatureValueSpec()));
           */ newChildDescriptors.add (createChildParameter (GMFMapPackage.eINSTANCE.getMetricRule_Target (), GMFMapFactory.
          eINSTANCE.createDomainElementTarget ()));
        newChildDescriptors.add (createChildParameter (GMFMapPackage.eINSTANCE.getMetricRule_Target (), GMFMapFactory.eINSTANCE
          .createDiagramElementTarget ()));
        newChildDescriptors.add (createChildParameter (GMFMapPackage.eINSTANCE.getMetricRule_Target (), GMFMapFactory.eINSTANCE
          .createNotationElementTarget ()));
    }

}

