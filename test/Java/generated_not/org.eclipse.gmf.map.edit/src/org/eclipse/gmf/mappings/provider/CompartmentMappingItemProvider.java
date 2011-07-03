/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.mappings.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.mappings.CompartmentMapping} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class CompartmentMappingItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
  IItemLabelProvider, IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This adds a property descriptor for the Compartment feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addCompartmentPropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_CompartmentMapping_compartment_feature"), getString (
          "_UI_PropertyDescriptor_description", "_UI_CompartmentMapping_compartment_feature", "_UI_CompartmentMapping_type"),
          GMFMapPackage.eINSTANCE.getCompartmentMapping_Compartment (), true, null, getString (
          "_UI_VisualrepresentationPropertyCategory"), null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                return FilterUtil.sort (super.getComboBoxObjects (object));

            }

        }

        );
    }

    /**
       * This adds a property descriptor for the Children feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addChildrenPropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_CompartmentMapping_children_feature"), getString (
          "_UI_PropertyDescriptor_description", "_UI_CompartmentMapping_children_feature", "_UI_CompartmentMapping_type"),
          GMFMapPackage.eINSTANCE.getCompartmentMapping_Children (), true, null, null, null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                @SuppressWarnings("unchecked")
                Collection < EObject > original = (Collection < EObject >) super.getComboBoxObjects (object);

                return FilterUtil.filterByNodeMapping (original, (CompartmentMapping) object);

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
    public String getText (Object object) {
        if (object instanceof CompartmentMapping) {
            CompartmentMapping mapping = (CompartmentMapping) object;

            String result = " <";

            if (mapping.getCompartment () != null) {
                result += mapping.getCompartment ().getName ();
            }

            result += ">";
            return getString ("_UI_CompartmentMapping_type") + result;

        }

        return getString ("_UI_CompartmentMapping_type");

    }

}

