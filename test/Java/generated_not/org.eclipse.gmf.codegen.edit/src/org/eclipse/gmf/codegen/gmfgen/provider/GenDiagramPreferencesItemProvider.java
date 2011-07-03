/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.provider;

/**
   * This is the item provider adapter for a {@link org.eclipse.gmf.codegen.gmfgen.GenDiagramPreferences} object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class GenDiagramPreferencesItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
  IItemLabelProvider, IItemPropertySource, IStructuredItemContentProvider, ITreeItemContentProvider {
    /**
       * This returns the label text for the adapted class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    @Override
    public String getText (Object object) {
        return getString ("_UI_GenDiagramPreferences_type");

    }

}

