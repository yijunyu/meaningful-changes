package org.eclipse.gmf.internal.common.ui;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * @author dstadnik
 */
public class ModelSelectionPage extends WizardPage {

	protected final ResourceLocationProvider rloc;

	protected Text uriFld;

	protected Button loadBtn;

	protected URI uri;

	protected Resource resource;

	public ModelSelectionPage(String pageId, ResourceLocationProvider rloc) {
		super(pageId);
		this.rloc = rloc;
	}

	protected String getModelFileExtension() {
		return null;
	}

	public final void createControl(Composite parent) {
		Composite plate = new Composite(parent, SWT.NONE);
		{
			GridLayout layout = new GridLayout();
			plate.setLayout(layout);

			GridData data = new GridData();
			data.verticalAlignment = GridData.FILL;
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			plate.setLayoutData(data);
		}
		createTitleAndButtonsRow(plate);
		createUriRow(plate);
		createAdditionalControls(plate);
		setControl(plate);
		initControls();
	}

	protected void createTitleAndButtonsRow(Composite parent) {
		Composite plate = new Composite(parent, SWT.NONE);
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 4;
			plate.setLayout(layout);

			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			plate.setLayoutData(data);
		}
		Label label = new Label(plate, SWT.NONE);
		label.setText("Model URI:");
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			label.setLayoutData(data);
		}
		Button browseFsBtn = new Button(plate, SWT.PUSH);
		browseFsBtn.setText("Browse File System...");
		{
			GridData data = new GridData();
			browseFsBtn.setLayoutData(data);
		}
		Button browseWsBtn = new Button(plate, SWT.PUSH);
		browseWsBtn.setText("Browse Workspace...");
		{
			GridData data = new GridData();
			browseWsBtn.setLayoutData(data);
		}
		Button findInWsBtn = new Button(plate, SWT.PUSH);
		findInWsBtn.setText("Find In Workspace...");
		{
			GridData data = new GridData();
			findInWsBtn.setLayoutData(data);
		}

		// logic

		browseFsBtn.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
			}

			public void widgetSelected(SelectionEvent e) {
				FileDialog fd = new FileDialog(getShell(), SWT.OPEN);
				fd.setText("Select Model");
				String fileName = fd.open();
				if (fileName == null) {
					return;
				}
				uri = URI.createFileURI(fileName);
				updateURI();
			};
		});
		browseWsBtn.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
			}

			public void widgetSelected(SelectionEvent e) {
				ViewerFilter extFilter = new ViewerFilter() {

					public boolean select(Viewer viewer, Object parentElement, Object element) {
						String ext = getModelFileExtension();
						if (ext != null && element instanceof IFile) {
							IFile file = (IFile) element;
							return ext.equals(file.getFileExtension());
						}
						return true;
					}
				};
				IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(), "Select Model", "Select file with ecore model:", false, null, Collections.singletonList(extFilter));
				if (files == null || files.length == 0) {
					return;
				}
				uri = URI.createPlatformResourceURI(files[0].getFullPath().toString(), true);
				updateURI();
			}
		});
		findInWsBtn.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
			}

			public void widgetSelected(SelectionEvent e) {
				IFile file = FileSelector.selectFile(getShell(), "Select Model", null, null, getModelFileExtension());
				if (file == null) {
					return;
				}
				uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				updateURI();
			};
		});
	}

	protected void createUriRow(Composite parent) {
		Composite plate = new Composite(parent, SWT.NONE);
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			plate.setLayout(layout);

			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			plate.setLayoutData(data);
		}
		uriFld = new Text(plate, SWT.SINGLE | SWT.BORDER);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			uriFld.setLayoutData(data);
		}
		loadBtn = new Button(plate, SWT.PUSH);
		loadBtn.setText("Load");
		{
			GridData data = new GridData();
			loadBtn.setLayoutData(data);
		}

		// logic

		loadBtn.setEnabled(false);
		uriFld.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				setURI(uriFld.getText());
				setResource(null);
			}
		});
		loadBtn.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
			}

			public void widgetSelected(SelectionEvent e) {
				setResource(loadResource());
			}
		});
	}

	protected void createAdditionalControls(Composite parent) {
	}

	protected void initControls() {
		if (rloc == null || getModelFileExtension() == null) {
			return;
		}
		List<IFile> files = rloc.getSelectedFiles(getModelFileExtension());
		if (!files.isEmpty()) {
			uri = URI.createPlatformResourceURI(files.get(0).getFullPath().toString(), true);
			updateURI();
		}
	}

	protected void updateURI() {
		if (uri != null) {
			uriFld.setText(uri.toString());
			setResource(loadResource());
		} else {
			uriFld.setText(""); //$NON-NLS-1$
			setResource(null);
		}
	}

	protected void setURI(String uriText) {
		if (uriText == null || uriText.trim().length() == 0) {
			uri = null;
			loadBtn.setEnabled(false);
			setErrorMessage(null);
			return;
		}
		try {
			uri = URI.createURI(uriText.trim());
		} catch (IllegalArgumentException iae) {
			uri = null;
			loadBtn.setEnabled(false);
			setErrorMessage("Invalid model URI: " + iae.getLocalizedMessage());
			return;
		}
		loadBtn.setEnabled(true);
		setErrorMessage(null);
	}

	protected Resource loadResource() {
		assert uri != null;
		Resource resource = new ResourceSetImpl().createResource(uri);
		if (resource == null) {
			setErrorMessage("Model is not accessible.");
			return null;
		}
		try {
			resource.load(Collections.EMPTY_MAP);
		} catch (IOException ioe) {
			setErrorMessage("Error loading model: " + ioe.getLocalizedMessage());
			return null;
		}
		setErrorMessage(null);
		return resource;
	}

	protected void setResource(Resource resource) {
		this.resource = resource;
	}

	public final Resource getResource() {
		return resource;
	}
}
