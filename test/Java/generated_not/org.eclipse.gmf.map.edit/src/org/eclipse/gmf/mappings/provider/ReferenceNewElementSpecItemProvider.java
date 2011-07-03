/**
   * <copyright>
   * </copyright>
   *
   * $Id: ReferenceNewElementSpecItemProvider.java,v 1.7 2008/04/17 11:58:45 atikhomirov Exp $
   */ package org.eclipse.gmf.mappings.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.mappings.ReferenceNewElementSpec} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class ReferenceNewElementSpecItemProvider extends FeatureInitializerItemProvider implements
  IEditingDomainItemProvider, IItemLabelProvider, IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider
  {
    /**
       * This adds a property descriptor for the Feature feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addFeaturePropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_FeatureInitializer_feature_feature"), getString (
          "_UI_PropertyDescriptor_description", "_UI_FeatureInitializer_feature_feature", "_UI_FeatureInitializer_type"),
          GMFMapPackage.eINSTANCE.getFeatureInitializer_Feature (), true, false, true, null, null, null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                if (object instanceof FeatureInitializer) {
                    @SuppressWarnings("unchecked")
                    final Collection < EStructuralFeature > original = (Collection < EStructuralFeature >) super.
                      getComboBoxObjects (object);

                    return FilterUtil.filterByFeatureInitializer (original, (FeatureInitializer) object);

                }

                return super.getComboBoxObjects (object);

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
        StringBuffer buf = new StringBuffer ();

        buf.append (getString ("_UI_ReferenceNewElementSpec_type"));
        if (object instanceof ReferenceNewElementSpec) {
            ReferenceNewElementSpec newElementSpec = (ReferenceNewElementSpec) object;

            buf.append ('<');
            String feature = (newElementSpec.getFeature () != null) ? newElementSpec.getFeature ().getName () : null;

            if (feature != null && feature.length () > 0) {
                buf.append (feature);
            }

            buf.append (":= new ");
            if (newElementSpec.getFeature () != null && newElementSpec.getFeature ().getEType () != null) {
                buf.append (newElementSpec.getFeature ().getEType ().getName ());
            }

            buf.append ('[').append (newElementSpec.getNewElementInitializers ().size ()).append (']');
            buf.append ('>');
        }

        return buf.toString ();

    }

}

