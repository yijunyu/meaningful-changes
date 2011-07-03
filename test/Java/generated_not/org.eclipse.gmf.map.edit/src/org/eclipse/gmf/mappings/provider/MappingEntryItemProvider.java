/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.mappings.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.mappings.MappingEntry} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class MappingEntryItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
  IItemLabelProvider, IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This adds a property descriptor for the Domain Meta Element feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addDomainMetaElementPropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_MappingEntry_domainMetaElement_feature"), getString (
          "_UI_PropertyDescriptor_description", "_UI_MappingEntry_domainMetaElement_feature", "_UI_MappingEntry_type"),
          GMFMapPackage.eINSTANCE.getMappingEntry_DomainMetaElement (), true, null, getString (
          "_UI_DomainmetainformationPropertyCategory"), null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                @SuppressWarnings("unchecked")
                Collection < EClass > original = (Collection < EClass >) super.getComboBoxObjects (object);

                return FilterUtil.filterByContainmentFeature (original, (MappingEntry) object);

            }

        }

        );
    }

    /**
       * This adds a property descriptor for the Containment Feature feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addContainmentFeaturePropertyDescriptor (Object object) {
        throw new UnsupportedOperationException ("Subclasses should override");

    }

}

