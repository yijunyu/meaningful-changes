/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.gmfgraph.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.gmfgraph.ConstantColor} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class ConstantColorItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
  IItemLabelProvider, IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This returns the label text for the adapted class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public String getText (Object object) {
        ConstantColor cColor = (ConstantColor) object;

        return RGBColorItemProvider.getColourSemanticPrefix (cColor) + String.valueOf (cColor.getValue ());

    }

}

