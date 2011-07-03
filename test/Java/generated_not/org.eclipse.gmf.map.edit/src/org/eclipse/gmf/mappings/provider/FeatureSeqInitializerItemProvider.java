/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.mappings.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.mappings.FeatureSeqInitializer} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class FeatureSeqInitializerItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
  IItemLabelProvider, IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This adds a property descriptor for the Element Class feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected void addElementClassPropertyDescriptor (Object object) {
        itemPropertyDescriptors.add (new ItemPropertyDescriptor (((ComposeableAdapterFactory) adapterFactory).
          getRootAdapterFactory (), getResourceLocator (), getString ("_UI_FeatureSeqInitializer_elementClass_feature"),
          getString ("_UI_PropertyDescriptor_description", "_UI_FeatureSeqInitializer_elementClass_feature",
          "_UI_FeatureSeqInitializer_type"), GMFMapPackage.eINSTANCE.getFeatureSeqInitializer_ElementClass (), true, false, true
          , null, null, null) {

            protected Collection < ? > getComboBoxObjects (Object object) {
                if (object instanceof FeatureSeqInitializer) {
                    @SuppressWarnings("unchecked")
                    final Collection < EClass > original = (Collection < EClass >) super.getComboBoxObjects (object);

                    return FilterUtil.filterByFeatureSeqInitializer (original, (FeatureSeqInitializer) object);

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

        buf.append (getString ("_UI_FeatureSeqInitializer_type"));
        if (object instanceof FeatureSeqInitializer) {
            FeatureSeqInitializer fSeqInitializer = (FeatureSeqInitializer) object;

            buf.append ('<');
            if (fSeqInitializer.getElementClass () != null) {
                if (fSeqInitializer.getCreatingInitializer () != null) {
                    buf.append ("new ");
                //$NON-NLS-1$}

                buf.append (fSeqInitializer.getElementClass ().getName ());
            }

            buf.append ('(');
            for (Iterator < ? > it = fSeqInitializer.getInitializers ().iterator ();
            it.hasNext ();) {
                FeatureInitializer nextInitializer = (FeatureInitializer) it.next ();

                if (nextInitializer != null && nextInitializer.getFeature () != null) {
                    buf.append (nextInitializer.getFeature ().getName ());
                }

                if (it.hasNext ()) {
                    buf.append (',');
                }

            }

            buf.append (')');
            buf.append ('>');
        }

        return buf.toString ();

    }

}

