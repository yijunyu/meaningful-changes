/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.codegen.gmfgen.DefaultSizeAttributes} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class DefaultSizeAttributesItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
  IItemLabelProvider, IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This returns the label text for the adapted class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    @Override
    public String getText (Object object) {
        DefaultSizeAttributes defaultSizeAttributes = (DefaultSizeAttributes) object;

        return getString ("_UI_DefaultSizeAttributes_type") + " " + defaultSizeAttributes.getWidth () + "," +
          defaultSizeAttributes.getHeight ();

    }

}

