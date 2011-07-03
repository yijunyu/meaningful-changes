/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.mappings.presentation;

/**
   * This is a simple wizard for creating a new model file.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */ public class GMFMapModelWizard extends Wizard implements INewWizard {
    /**
       * Create a new model.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected EObject createInitialModel () {
        return refPages.createMapping ();

    }

    /**
       * Do the work after everything is specified.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public boolean performFinish () {
        try {
            // Remember the file.// final IFile modelFile = getModelFile ();

            // Do the work within an operation.// WorkspaceModifyOperation operation = new WorkspaceModifyOperation () {

                protected void execute (IProgressMonitor progressMonitor) {
                    try {
                        // Create a resource set // ResourceSet resourceSet = new ResourceSetImpl ();

                        // Get the URI of the model file.// URI fileURI = URI.createPlatformResourceURI (modelFile.getFullPath (
                          ).toString (), true);

                        // Create a resource for this file.// Resource resource = resourceSet.createResource (fileURI,
                          ContentHandler.UNSPECIFIED_CONTENT_TYPE);

                        // Add the initial model object to the contents.// EObject rootObject = createInitialModel ();

                        if (rootObject != null) {
                            resource.getContents ().add (rootObject);
                        }

                        // Save the contents of the resource to the file system.// Map < String, String > options = new HashMap
                          < String, String > ();

                        options.put (XMLResource.OPTION_ENCODING, "UTF-8");
                        resource.save (options);
                    }
                    catch (Exception exception) {
                        GMFMapEditPlugin.INSTANCE.log (exception);
                    }
                    finally {
                        progressMonitor.done ();
                    }

                }

            }

            ;

            getContainer ().run (false, false, operation);
            // Select the new file resource in the current view.// IWorkbenchWindow workbenchWindow = workbench.
              getActiveWorkbenchWindow ();

            IWorkbenchPage page = workbenchWindow.getActivePage ();

            final IWorkbenchPart activePart = page.getActivePart ();

            if (activePart instanceof ISetSelectionTarget) {
                final ISelection targetSelection = new StructuredSelection (modelFile);

                getShell ().getDisplay ().asyncExec (new Runnable () {

                    public void run () {
                        ((ISetSelectionTarget) activePart).selectReveal (targetSelection);
                    }

                }

                );
            }

            // Open an editor on the new file.// try {
                page.openEditor (new FileEditorInput (modelFile), workbench.getEditorRegistry ().getDefaultEditor (modelFile.
                  getFullPath ().toString ()).getId ());
            }
            catch (PartInitException exception) {
                MessageDialog.openError (workbenchWindow.getShell (), GMFMapEditPlugin.INSTANCE.getString (
                  "_UI_OpenEditorError_label"), exception.getMessage ());
                return false;

            }

            return true;

        }
        catch (Exception exception) {
            GMFMapEditPlugin.INSTANCE.log (exception);
            return false;

        }

    }

    /**
       * The framework calls this to create the contents of the wizard.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public void addPages () {
        // Create a page, set the title, and the initial model file name.// newFileCreationPage = new
          GMFMapModelWizardNewFileCreationPage ("Whatever", selection);
        newFileCreationPage.setTitle (GMFMapEditPlugin.INSTANCE.getString ("_UI_GMFMapModelWizard_label"));
        newFileCreationPage.setDescription (GMFMapEditPlugin.INSTANCE.getString ("_UI_GMFMapModelWizard_description"));
        newFileCreationPage.setFileName (GMFMapEditPlugin.INSTANCE.getString ("_UI_GMFMapEditorFilenameDefaultBase") + "." +
          GMFMapEditPlugin.INSTANCE.getString ("_UI_GMFMapEditorFilenameExtension"));
        addPage (newFileCreationPage);
        // Try and get the resource selection to determine a current directory for the file dialog.// if (selection != null && !
          selection.isEmpty ()) {
            // Get the resource...// Object selectedElement = selection.iterator ().next ();

            if (selectedElement instanceof IResource) {
                // Get the resource parent, if its a file.// IResource selectedResource = (IResource) selectedElement;

                if (selectedResource.getType () == IResource.FILE) {
                    selectedResource = selectedResource.getParent ();
                }

                // This gives us a directory...// if (selectedResource instanceof IFolder || selectedResource instanceof
                  IProject) {
                    // Set this for the container.// newFileCreationPage.setContainerFullPath (selectedResource.getFullPath ())
                      ;
                    // Make up a unique new name here.// String defaultModelBaseFilename = GMFMapEditPlugin.INSTANCE.getString (
                      "_UI_GMFMapEditorFilenameDefaultBase");

                    String defaultModelFilenameExtension = GMFMapEditPlugin.INSTANCE.getString (
                      "_UI_GMFMapEditorFilenameExtension");

                    String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;

                    for (int i = 1;
                    ((IContainer) selectedResource).findMember (modelFilename) != null; ++ i) {
                        modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
                    }

                    newFileCreationPage.setFileName (modelFilename);
                }

            }

        }

        refPages.addPages (this, selection);
    }

}

