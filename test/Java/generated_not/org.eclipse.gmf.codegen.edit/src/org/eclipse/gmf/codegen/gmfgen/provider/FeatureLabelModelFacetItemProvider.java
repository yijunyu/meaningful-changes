/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.codegen.gmfgen.FeatureLabelModelFacet} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class FeatureLabelModelFacetItemProvider extends LabelModelFacetItemProvider implements IEditingDomainItemProvider
  , IItemLabelProvider, IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This returns the label text for the adapted class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    @Override
    public String getText (Object object) {
        StringBuffer sb = new StringBuffer ();

        for (GenFeature feature : ((FeatureLabelModelFacet) object).getMetaFeatures ()) {
            if (sb.length () > 0) {
                sb.append (", ");
            //$NON-NLS-1$}

            sb.append (feature.getName ());
        }

        return getString ("_UI_FeatureLabelModelFacet_type") + " " + sb.toString ();

    }

}

