/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.mappings.presentation;

/**
   * This is an example of a GMFMap model editor.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class GMFMapEditor extends MultiPageEditorPart implements IEditingDomainProvider, IGotoMarker, IMenuListener,
  ISelectionProvider, IViewerProvider {
    /**
       * <!-- begin-user-doc -->
       * Ensures that the tree editor page is selected for the marker target navigation
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public void gotoMarker (IMarker marker) {
        updateProblemIndication = false;
        try {
            setActivePage (0);
            gotoMarkerGen (marker);
        }
        finally {
            updateProblemIndication = true;
        }

    }

}

