/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.mappings.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.mappings.LabelMapping} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class LabelMappingItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
  IItemLabelProvider, IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This adds a property descriptor for the Diagram Label feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addDiagramLabelPropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_LabelMapping_diagramLabel_feature"), getString (
          "_UI_PropertyDescriptor_description", "_UI_LabelMapping_diagramLabel_feature", "_UI_LabelMapping_type"), GMFMapPackage
          .eINSTANCE.getLabelMapping_DiagramLabel (), true, null, null, null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                return FilterUtil.sort (super.getComboBoxObjects (object));

            }

        }

        );
    }

}

