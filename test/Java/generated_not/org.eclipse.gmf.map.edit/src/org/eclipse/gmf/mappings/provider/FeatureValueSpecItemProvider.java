/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.mappings.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.mappings.FeatureValueSpec} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class FeatureValueSpecItemProvider extends FeatureInitializerItemProvider implements IEditingDomainItemProvider,
  IItemLabelProvider, IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
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
       * @generated NOT
       */
    public String getText (Object object) {
        StringBuilder buf = new StringBuilder ();

        buf.append (getTextGen (object));
        if (object instanceof FeatureValueSpec) {
            FeatureValueSpec featureValueSpec = (FeatureValueSpec) object;

            buf.append ('<');
            String feature = (featureValueSpec.getFeature () != null) ? featureValueSpec.getFeature ().getName () : null;

            if (feature != null && feature.length () > 0) {
                buf.append (feature).append (":=");
            }

            String body = crop (featureValueSpec.getValue () != null ? featureValueSpec.getValue ().getBody () : null);

            if (body != null && body.length () > 0) {
                buf.append (' ').append (body);
            }

            buf.append ('>');
        }

        return buf.toString ();

    }

}

