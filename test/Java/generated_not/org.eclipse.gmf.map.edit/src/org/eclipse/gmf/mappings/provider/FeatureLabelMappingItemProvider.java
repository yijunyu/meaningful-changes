/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.mappings.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.mappings.FeatureLabelMapping} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class FeatureLabelMappingItemProvider extends LabelMappingItemProvider implements IEditingDomainItemProvider,
  IItemLabelProvider, IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This adds a property descriptor for the Features feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addFeaturesPropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_FeatureLabelMapping_features_feature"), getString (
          "_UI_PropertyDescriptor_description", "_UI_FeatureLabelMapping_features_feature", "_UI_FeatureLabelMapping_type"),
          GMFMapPackage.eINSTANCE.getFeatureLabelMapping_Features (), true, false, true, null, null, null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                @SuppressWarnings("unchecked")
                Collection < EStructuralFeature > original = (Collection < EStructuralFeature >) super.getComboBoxObjects (
                  object);

                return FilterUtil.filterByContainerMetaclass (original, ((FeatureLabelMapping) object).getMapEntry ());

            }

        }

        );
    }

}

