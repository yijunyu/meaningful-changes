/**
   * <copyright>
   * </copyright>
   *
   * $Id$
   */ package org.eclipse.gmf.tooldef.presentation;

/**
   * This is a simple wizard for creating a new model file.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */ public class GMFToolModelWizard extends Wizard implements INewWizard {
    /**
       * Create a new model.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    protected EObject createInitialModel () {
        return GMFToolPackage.eINSTANCE.getGMFToolFactory ().createToolRegistry ();

    }

    /**
       * Do the work after everything is specified.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated NOT
       */
    public boolean performFinish () {
        try {
            final IFile modelFile = getModelFile ();

            createModelFile (modelFile);
            return openEditor (modelFile);

        }
        catch (Exception exception) {
            GMFToolEditPlugin.INSTANCE.log (exception);
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
          GMFToolModelWizardNewFileCreationPage ("Whatever", selection);
        newFileCreationPage.setTitle (GMFToolEditPlugin.INSTANCE.getString ("_UI_GMFToolModelWizard_label"));
        newFileCreationPage.setDescription (GMFToolEditPlugin.INSTANCE.getString ("_UI_GMFToolModelWizard_description"));
        newFileCreationPage.setFileName (GMFToolEditPlugin.INSTANCE.getString ("_UI_GMFToolEditorFilenameDefaultBase") + "." +
          GMFToolEditPlugin.INSTANCE.getString ("_UI_GMFToolEditorFilenameExtension"));
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
                    // Make up a unique new name here.// String defaultModelBaseFilename = GMFToolEditPlugin.INSTANCE.getString
                      ("_UI_GMFToolEditorFilenameDefaultBase");

                    String defaultModelFilenameExtension = GMFToolEditPlugin.INSTANCE.getString (
                      "_UI_GMFToolEditorFilenameExtension");

                    String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;

                    for (int i = 1;
                    ((IContainer) selectedResource).findMember (modelFilename) != null; ++ i) {
                        modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
                    }

                    newFileCreationPage.setFileName (modelFilename);
                }

            }

        }

    }

}

