/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.mappings.presentation;

/**
   * This is the action bar contributor for the GMFMap model editor.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class GMFMapActionBarContributor extends EditingDomainActionBarContributor implements ISelectionChangedListener {
    /**
       * This inserts global actions before the "additions-end" separator.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    @Override
    protected void addGlobalActions (IMenuManager menuManager) {
        menuManager.insertAfter ("additions-end", new Separator ("ui-actions"));
        menuManager.insertAfter ("ui-actions", showPropertiesViewAction);
        refreshViewerAction.setEnabled (refreshViewerAction.isEnabled ());
        menuManager.insertAfter ("ui-actions", refreshViewerAction);
        super.addGlobalActions (menuManager);
        // handwritten code starts toggleLabelsAction.update ();
        menuManager.insertBefore ("ui-actions", toggleLabelsAction);
    // handwritten code ends}

}

