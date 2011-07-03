/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.gmfgraph.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.gmfgraph.RGBColor} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class RGBColorItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IItemLabelProvider,
  IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This returns the label text for the adapted class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getText (Object object) {
        RGBColor rgbColor = (RGBColor) object;

        return getColourSemanticPrefix (rgbColor) + '{' + rgbColor.getRed () + ',' + rgbColor.getGreen () + ',' + rgbColor.
          getBlue () + '}';

    }

}

