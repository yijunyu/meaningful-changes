/*
   * Copyright (c) 2006 Borland Software Corporation
   * 
   * All rights reserved. This program and the accompanying materials
   * are made available under the terms of the Eclipse Public License v1.0
   * which accompanies this distribution, and is available at
   * http://www.eclipse.org/legal/epl-v10.html
   *
   * Contributors:
   *    Dmitry Stadnik (Borland) - initial API and implementation
   */ package org.eclipse.gmf.map.editor.part;

/**
   * @generated
   */ public class GMFMapDiagramEditorUtil {
    /**
       * <p>
       * This method should be called within a workspace modify operation since it creates resources.
       * </p>
       * @generated NOT
       * @return the created file resource, or <code>null</code> if the file was not created
       */
    final public static IFile createNewDiagramFile (final GMFMapDiagramFileCreator diagramFileCreator, IPath containerFullPath,
      String fileName, InputStream initialContents, String kind, Shell shell, IProgressMonitor progressMonitor) {
        TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain ();

        ResourceSet resourceSet = editingDomain.getResourceSet ();

        progressMonitor.beginTask ("Creating diagram and model files", 3);
        //$NON-NLS-1$ final IFile diagramFile = diagramFileCreator.createNewFile (containerFullPath, fileName, initialContents,
          shell);

        final Resource diagramResource = resourceSet.createResource (URI.createPlatformResourceURI (diagramFile.getFullPath ().
          toString ()));

        List affectedFiles = new ArrayList ();

        affectedFiles.add (diagramFile);
        IPath modelFileRelativePath = diagramFile.getFullPath ().removeFileExtension ().addFileExtension ("gmfmap");

        //$NON-NLS-1$ IFile modelFile = diagramFile.getParent ().getFile (new Path (modelFileRelativePath.lastSegment ()));

        final Resource modelResource = resourceSet.createResource (URI.createPlatformResourceURI (modelFile.getFullPath ().
          toString ()));

        affectedFiles.add (modelFile);
        final String kindParam = kind;

        AbstractTransactionalCommand command = new AbstractTransactionalCommand (editingDomain, "Creating diagram and model",
          affectedFiles) {
            //$NON-NLS-1$
            protected CommandResult doExecuteWithResult (IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
                Mapping model = diagramFileCreator.getWizard ().createInitialModel ();

                modelResource.getContents ().add (createInitialRoot (model));
                Diagram diagram = ViewService.createDiagram (model, kindParam, GMFMapDiagramEditorPlugin.
                  DIAGRAM_PREFERENCES_HINT);

                if (diagram != null) {
                    diagramResource.getContents ().add (diagram);
                    diagram.setName (diagramFile.getName ());
                    diagram.setElement (model);
                }

                try {
                    Map options = new HashMap ();

                    options.put (XMIResource.OPTION_ENCODING, "UTF-8");
                    //$NON-NLS-1$ modelResource.save (options);
                    diagramResource.save (Collections.EMPTY_MAP);
                }
                catch (IOException e) {
                    GMFMapDiagramEditorPlugin.getInstance ().logError ("Unable to store model and diagram resources", e);
                //$NON-NLS-1$}

                return CommandResult.newOKCommandResult ();

            }

        }

        ;

        try {
            OperationHistoryFactory.getOperationHistory ().execute (command, new SubProgressMonitor (progressMonitor, 1), null)
              ;
        }
        catch (ExecutionException e) {
            GMFMapDiagramEditorPlugin.getInstance ().logError ("Unable to create model and diagram", e);
        //$NON-NLS-1$}

        try {
            modelFile.setCharset ("UTF-8", new SubProgressMonitor (progressMonitor, 1));
        //$NON-NLS-1$}
        catch (CoreException e) {
            GMFMapDiagramEditorPlugin.getInstance ().logError ("Unable to set charset for model file", e);
        //$NON-NLS-1$}

        try {
            diagramFile.setCharset ("UTF-8", new SubProgressMonitor (progressMonitor, 1));
        //$NON-NLS-1$}
        catch (CoreException e) {
            GMFMapDiagramEditorPlugin.getInstance ().logError ("Unable to set charset for diagram file", e);
        //$NON-NLS-1$}

        return diagramFile;

    }

}

