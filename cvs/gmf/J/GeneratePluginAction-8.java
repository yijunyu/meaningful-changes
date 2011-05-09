package org.eclipse.gmf.internal.graphdef.codegen.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.gmfgraph.FigureGallery;
import org.eclipse.gmf.graphdef.codegen.StandaloneGenerator;
import org.eclipse.gmf.internal.graphdef.codegen.StandaloneGalleryConverter;
import org.eclipse.jdt.core.JavaConventions;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class GeneratePluginAction implements IObjectActionDelegate, IInputValidator {
	private List/*IFile*/ mySelectedFiles = Collections.EMPTY_LIST;
	private IWorkbenchPart myTargetPart;

	public GeneratePluginAction() {
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		myTargetPart = targetPart;
	}

	public void run(IAction action) {
		List/*FigureGallery*/ galleries = new ArrayList(5);
		final ResourceSet rs = new ResourceSetImpl();
		loadFromSelection(rs, galleries);
		if (galleries.isEmpty()) {
			MessageDialog.openInformation(getShell(), "Nothing to do", "No figure galleries found in the selected files, nothing to do");
			return;
		}
		StandaloneGeneratorOptionsDialog dialog = new StandaloneGeneratorOptionsDialog(getShell(), null, true, this);
		if (dialog.open() != IDialogConstants.OK_ID) {
			return;
		}
		String pluginId = dialog.getPluginId();
		FigureGallery[] input = (FigureGallery[]) galleries.toArray(new FigureGallery[galleries.size()]);
		StandaloneGenerator.Config config = new StandaloneGenerator.ConfigImpl(pluginId, pluginId, dialog.isUseMapMode());
		final StandaloneGenerator generator = new StandaloneGenerator(input, config, dialog.getFigureQualifiedNameSwitch());
		generator.setSkipPluginStructure(false);

		new Job(action.getText()) {
			private IContainer myResourcesContainer;
			{
				// setUser(true); FIXME fixed after M5, uncoment when switching to M6 
			}

			protected IStatus run(IProgressMonitor monitor) {
				try {
					generator.run(monitor);
					if (!generator.getRunStatus().isOK()) {
						return generator.getRunStatus();
					}
					StandaloneGalleryConverter converter = new StandaloneGalleryConverter(generator.getGenerationInfo());					

					IStatus result = saveToFile(decideOnDestinationFile("bundled"), converter.convertFigureGallery());
					if (result.isOK()){
						result = saveToFile(decideOnDestinationFile("mirrored"), converter.mirrorDiagramElements(rs.getResources()));
					}
					return result;
				} catch (InterruptedException e) {
					return Status.CANCEL_STATUS;
				} finally {
					for (Iterator it = rs.getResources().iterator(); it.hasNext();) {
						((Resource) it.next()).unload();
					}
				}
			}

			private IFile decideOnDestinationFile(String baseName) {
				final IPath basePath = new Path(baseName);
				final String ext = "gmfgraph";
				IFile resultFile = getResourcesContainer().getFile(basePath.addFileExtension(ext));
				for (int i = 1; resultFile.exists(); i++) {
					resultFile = getResourcesContainer().getFile(new Path(basePath.lastSegment() + String.valueOf(i)).addFileExtension(ext));
				}
				return resultFile;
			}
			
			private IContainer getResourcesContainer(){
				if (myResourcesContainer == null){
					IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(getConfig().getPluginID());
					assert p.exists(); // generator.runStatus.ok makes us believe
					myResourcesContainer = p;
					IFolder modelsFolder = p.getFolder("models");
					if (!modelsFolder.exists()) {
						try {
							modelsFolder.create(true, true, new NullProgressMonitor());
							myResourcesContainer = modelsFolder;
						} catch (CoreException ex) {
							// ignore or log?
						}
					}
				}
				return myResourcesContainer;
			}
			
			private StandaloneGenerator.Config getConfig(){
				return generator.getGenerationInfo().getConfig();
			}

			private IStatus saveToFile(IFile outputFile, EObject root) {
				if (root != null){
					Resource outputResource = rs.createResource(URI.createPlatformResourceURI(outputFile.getFullPath().toString()));
					outputResource.getContents().add(root);
					try {
						outputResource.save(null);
					} catch (IOException e) {
						return new Status(IStatus.ERROR, "org.eclipse.gmf.graphdef.codegen.ui", 0, e.getMessage(), e);
					}
				}
				return Status.OK_STATUS;
			}
		}.schedule();
	}

	private void loadFromSelection(ResourceSet rs, List/*FigureGallery*/ galleries) {
		final FigureFinder extractor = new FigureFinder();
		for (Iterator it = mySelectedFiles.iterator(); it.hasNext();) {
			try {
				IFile next = (IFile) it.next();
				Resource r = rs.getResource(URI.createPlatformResourceURI(next.getFullPath().toString()), true);
				FigureGallery[] fg = extractor.findFigures(r);
				galleries.addAll(Arrays.asList(fg));
			} catch (Exception ex) {
				ex.printStackTrace();
				// FIXME log
			}
		}
	}

	public String isValid(String newText) {
		IStatus s = JavaConventions.validatePackageName(newText);
		if (s.isOK()) {
			return null;
		}
		return s.getMessage();
	}

	private Shell getShell() {
		return myTargetPart.getSite().getShell();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		mySelectedFiles = new ArrayList(5);
		if (selection instanceof IStructuredSelection) {
			mySelectedFiles.addAll(((IStructuredSelection) selection).toList());
		}
	}

	private static class StandaloneGeneratorOptionsDialog extends FigureGeneratorOptionsDialog {
	    private IInputValidator pluginIdValidator;
	    private Text pluginIdText;
		private String pluginId;
		private final boolean shouldWarnLiteVerstionDoesNotSupportMapMode;

		public StandaloneGeneratorOptionsDialog(Shell parentShell, String initialPluginId, boolean initialUseRuntimeFigures, IInputValidator pluginIdValidator) {
			this(parentShell, initialPluginId, initialUseRuntimeFigures, false, pluginIdValidator);
		}

		public StandaloneGeneratorOptionsDialog(Shell parentShell, String initialPluginId, boolean initialUseRuntimeFigures, boolean initialUseMapMode, IInputValidator pluginIdValidator) {
			super(parentShell, "Figure Gallery Generator", initialUseRuntimeFigures, initialUseMapMode);
			pluginId = initialPluginId;
			if (pluginId == null) {
				pluginId = "";	//$NON-NLS-1$
			}
			this.pluginIdValidator = pluginIdValidator;
			shouldWarnLiteVerstionDoesNotSupportMapMode = Platform.getBundle("org.eclipse.gmf.codegen.lite") != null;
		}

		protected void createControls(Composite result) {
	        Label label = new Label(result, SWT.WRAP);
	        label.setText("Please specify the name of plug-in/main package");
	        GridData data = new GridData(GridData.GRAB_HORIZONTAL
	                | GridData.GRAB_VERTICAL | GridData.HORIZONTAL_ALIGN_FILL
	                | GridData.VERTICAL_ALIGN_CENTER);
	        data.widthHint = convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH);
	        label.setLayoutData(data);
	        pluginIdText = new Text(result, SWT.SINGLE | SWT.BORDER);
	        pluginIdText.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
	                | GridData.HORIZONTAL_ALIGN_FILL));
	        pluginIdText.addModifyListener(new ModifyListener() {
	            public void modifyText(ModifyEvent e) {
	                validateInput();
	            }
	        });
			super.createControls(result);
		}

	    protected void validateInput() {
	        String errorMessage = null;
	        if (pluginIdValidator != null) {
	            errorMessage = pluginIdValidator.isValid(pluginIdText.getText());
	        }
	        // Bug 16256: important not to treat "" (blank error) the same as null
	        // (no error)
	        setErrorMessage(errorMessage);
	    }

	    protected void warnLiteVerstionDoesNotSupportMapMode() {
	    	if (shouldWarnLiteVerstionDoesNotSupportMapMode) {
	    		super.warnLiteVerstionDoesNotSupportMapMode();
	    	}
	    }

	    protected void okPressed() {
	    	pluginId = pluginIdText.getText();
	    	super.okPressed();
	    }

	    public String getPluginId() {
	    	return pluginId;
	    }
	}
}
