/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.mappings.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.mappings.ChildReference} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class ChildReferenceItemProvider extends NodeReferenceItemProvider implements IEditingDomainItemProvider,
  IItemLabelProvider, IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This adds a property descriptor for the Compartment feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addCompartmentPropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_ChildReference_compartment_feature"), getString (
          "_UI_PropertyDescriptor_description", "_UI_ChildReference_compartment_feature", "_UI_ChildReference_type"),
          GMFMapPackage.eINSTANCE.getChildReference_Compartment (), true, null, null, null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                @SuppressWarnings("unchecked")
                Collection < EObject > original = (Collection < EObject >) super.getComboBoxObjects (object);

                return FilterUtil.filterByNodeMapping (original, (ChildReference) object);

            }

        }

        );
    }

    /**
       * This adds a property descriptor for the Referenced Child feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addReferencedChildPropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_ChildReference_referencedChild_feature"), getString (
          "_UI_PropertyDescriptor_description", "_UI_ChildReference_referencedChild_feature", "_UI_ChildReference_type"),
          GMFMapPackage.eINSTANCE.getChildReference_ReferencedChild (), true, null, null, null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                return FilterUtil.sort (super.getComboBoxObjects (object));

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
        if (object instanceof NodeReference) {
            NodeReference reference = (NodeReference) object;

            String result = " <";

            if (reference.getContainmentFeature () != null) {
                result += reference.getContainmentFeature ().getName ();
            }

            if (reference.getChildrenFeature () != null) {
                result += "|";
                result += reference.getChildrenFeature ().getName ();
            }

            if (reference.isSetChild ()) {
                NodeMapping mapping = reference.getChild ();

                if (mapping.getDomainMetaElement () != null) {
                    result += ":";
                    result += mapping.getDomainMetaElement ().getName ();
                }

                result += "/";
                if (mapping.getDiagramNode () != null) {
                    result += reference.getChild ().getDiagramNode ().getName ();
                }

            }

            result += ">";
            return getString ("_UI_ChildReference_type") + result;

        }

        return getString ("_UI_ChildReference_type");

    }

}

