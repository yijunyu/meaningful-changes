/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.mappings.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.mappings.NodeReference} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ abstract public class NodeReferenceItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
  IItemLabelProvider, IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This adds a property descriptor for the Containment Feature feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addContainmentFeaturePropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_NeedsContainment_containmentFeature_feature"),
          getString ("_UI_PropertyDescriptor_description", "_UI_NeedsContainment_containmentFeature_feature",
          "_UI_NeedsContainment_type"), GMFMapPackage.eINSTANCE.getNeedsContainment_ContainmentFeature (), true, null, null,
          null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                @SuppressWarnings("unchecked")
                Collection < EReference > original = (Collection < EReference >) super.getComboBoxObjects (object);

                return FilterUtil.filterByContainerMetaclass (original, (NodeReference) object, true);

            }

        }

        );
    }

    /**
       * This adds a property descriptor for the Children Feature feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addChildrenFeaturePropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_NodeReference_childrenFeature_feature"), getString (
          "_UI_PropertyDescriptor_description", "_UI_NodeReference_childrenFeature_feature", "_UI_NodeReference_type"),
          GMFMapPackage.eINSTANCE.getNodeReference_ChildrenFeature (), true, null, null, null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                @SuppressWarnings("unchecked")
                Collection < EReference > original = (Collection < EReference >) super.getComboBoxObjects (object);

                return FilterUtil.filterByContainerMetaclass (original, (NodeReference) object, false);

            }

        }

        );
    }

    /**
       * This returns the label text for the adapted class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    abstract public String getText (Object object);

}

