/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.codegen.gmfgen.presentation;

/**
   * This is an example of a GMFGen model editor.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ public class GMFGenEditor extends MultiPageEditorPart implements IEditingDomainProvider, IGotoMarker, IMenuListener,
  ISelectionProvider, IViewerProvider {
    /**
       * This is the method called to load a resource into the editing domain's resource set based on the editor's input.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public void createModelGen () {
        // Assumes that the input is a file object.// IFileEditorInput modelFile = (IFileEditorInput) getEditorInput ();

        URI resourceURI = URI.createPlatformResourceURI (modelFile.getFile ().getFullPath ().toString (), true);

        Exception exception = null;

        Resource resource = null;

        try {
            // Load the resource through the editing domain.// resource = editingDomain.getResourceSet ().getResource (
              resourceURI, true);
            // [vano] reconcile genModel for domain --start Object o = resource.getContents ().get (0);

            GenModel toReload = null;

            if (o instanceof GenEditorGenerator) {
                toReload = ((GenEditorGenerator) o).getDomainGenModel ();
            }

            if (toReload != null) {
                toReload.reconcile ();
            }

        // reconcile -end}
        catch (Exception e) {
            exception = e;
            resource = editingDomain.getResourceSet ().getResource (resourceURI, false);
        }

        Diagnostic diagnostic = analyzeResourceProblems (resource, exception);

        if (diagnostic.getSeverity () != Diagnostic.OK) {
            resourceToDiagnosticMap.put (resource, analyzeResourceProblems (resource, exception));
        }

        editingDomain.getResourceSet ().eAdapters ().add (problemIndicationAdapter);
    }

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

