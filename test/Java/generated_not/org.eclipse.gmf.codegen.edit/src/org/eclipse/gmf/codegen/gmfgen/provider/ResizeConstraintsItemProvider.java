/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.codegen.gmfgen.ResizeConstraints} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class ResizeConstraintsItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
  IItemLabelProvider, IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This returns the label text for the adapted class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    @Override
    public String getText (Object object) {
        ResizeConstraints resizeConstraints = (ResizeConstraints) object;

        return getString ("_UI_ResizeConstraints_type") + " " + resizeConstraints.getResizeHandleNames () + ", " +
          resizeConstraints.getNonResizeHandleNames ();

    }

}

