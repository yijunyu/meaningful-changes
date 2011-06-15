/*
 * Copyright (c) 2006 Borland Software Corp
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors: dvorak - initial API and implementation
 */
package org.eclipse.gmf.internal.codegen.popup.actions;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.gmf.internal.bridge.transform.ValidationHelper;
import org.eclipse.gmf.internal.bridge.transform.ValidationHelper.DiagnosticMarkerMap;
import org.eclipse.gmf.internal.codegen.CodeGenUIPlugin;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IconAndMessageDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.FileEditorInput;

/**
 * A dialog to display one or more errors to the user, as contained in an
 * <code>Diagnostic</code> object. If an error contains additional detailed
 * information then a Details button is automatically supplied, which shows or
 * hides an error details viewer when pressed by the user.<p>  
 * 
 * @see org.eclipse.emf.common.util.Diagnostic
 */
@SuppressWarnings("synthetic-access")
public class DiagnosticsDialog extends IconAndMessageDialog {

    private static class DiagnosticLabelProvider extends LabelProvider {
		@Override
		public Image getImage(Object element) {
			if (!(element instanceof Diagnostic)) {
				return null;
			}
			Diagnostic diagnostic = (Diagnostic) element;        		
			String imageName = ISharedImages.IMG_OBJS_ERROR_TSK;
			switch (diagnostic.getSeverity()) {
			case Diagnostic.INFO:
				imageName = ISharedImages.IMG_OBJS_INFO_TSK;
				break;
			case Diagnostic.WARNING:
				imageName = ISharedImages.IMG_OBJS_WARN_TSK;
				break;
			}
			return PlatformUI.getWorkbench().getSharedImages().getImage(imageName);
		}

		@Override
		public String getText(Object element) {
			if(element instanceof Diagnostic) {
				Diagnostic diagnostic = (Diagnostic)element;
				if(diagnostic.getMessage() != null) {
					return diagnostic.getMessage();
				}
			}
			return super.getText(element);        		
		}
	}

	private static class DiagnosticContentProvider implements ITreeContentProvider {
		
    	Object cachedInput;
    	boolean showTopLevel;
    	
    	DiagnosticContentProvider(boolean showTopLevelDiagnostic) {
    		showTopLevel = showTopLevelDiagnostic;
    	}

		public Object[] getChildren(Object parentElement) {
			if(parentElement instanceof Diagnostic) {
				Diagnostic diagnostic = (Diagnostic)parentElement;
				return diagnostic.getChildren().toArray();
			}
			return new Object[0];
		}

		public Object getParent(Object element) {
			return null;
		}

		public boolean hasChildren(Object element) {
			if(element instanceof Diagnostic) {
				Diagnostic diagnostic = (Diagnostic)element ;
				return !diagnostic.getChildren().isEmpty();
			}
			return false;				
		}

		public Object[] getElements(Object inputElement) {
			if (inputElement instanceof Diagnostic) {
				Diagnostic diagnostic = (Diagnostic) inputElement;
				if(diagnostic == cachedInput && showTopLevel) {
					cachedInput = null;
					return new Object[] { diagnostic };
				}
				return diagnostic.getChildren().toArray();
			}
			return new Object[0];
		}

		public void dispose() {
			// do nothing here
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			cachedInput = newInput;
		}
	}

	/**
     * Reserve room for this many diagnosticTree items.
     */
    private static final int ITEM_COUNT = 7;
    
    private static final int STACK_TRACE_TEXT_LINE_COUNT = 3;    

    /**
     * The nesting indent.
     */
    private static final String NESTING_INDENT = "  "; //$NON-NLS-1$

    /**
     * The Details button.
     */
    private Button detailsButton;

    /**
     * The title of the dialog.
     */
    private String title;

    /**
     * The SWT diagnosticTree control that displays the error details.
     */
    private TreeViewer diagnosticTree;
    
    /**
     * The SWT Text control that displays the error exception stack trace.
     */    
    private Text stackTraceText;

    /**
     * Indicates whether the error details viewer is currently created.
     */
    private boolean detailsCreated = false;
  
    /**
     * The main rootDiagnotic object.
     */
    private Diagnostic rootDiagnotic;

    /**
     * The current clipboard. To be disposed when closing the dialog.
     */
    private Clipboard clipboard;

	private boolean shouldIncludeTopLevelErrorInDetails;	
	
	private final String[] buttonLabels;

	private final int[] buttonIDs;
	
	private final int defaultButtonIndex;
	
    /**
     * Creates an diagnostic dialog. Note that the dialog will have no visual
     * representation (no widgets) until it is told to open.
     * <p>
     * 
     * @param parentShell
     *            the shell under which to create this dialog
     * @param dialogTitle
     *            the title to use for this dialog, or <code>null</code> to
     *            indicate that the default title should be used
     * @param dialogMessage
     *            the message to show in this dialog, or <code>null</code> to
     *            indicate that the error's message should be shown as the
     *            primary message
     * @param diagnostic
     *            the diagnostic grouping all errors to be shown to the user
     * @param dialogButtonLabels array of labels for buttons to create in the dialog button bar
     * @param dialogButtonIDs array of IDs for buttons to create in the dialog button bar
     * @param defaultDialogButtonIndex the index of the default button
     */
    public DiagnosticsDialog(Shell parentShell, String dialogTitle, String dialogMessage,
            Diagnostic diagnostic, String[] dialogButtonLabels, int[] dialogButtonIDs, int defaultDialogButtonIndex) {
        super(parentShell);
        
        if(diagnostic == null) {
        	throw new IllegalArgumentException("Null diagnostic"); //$NON-NLS-1$
        }
        
        this.title = (dialogTitle == null) ? JFaceResources.getString("Problem_Occurred") : dialogTitle; //$NON-NLS-1$
        this.message = (dialogMessage == null) ? diagnostic.getMessage() : 
        	JFaceResources.format("Reason", new Object[] { dialogMessage, diagnostic.getMessage() }); //$NON-NLS-1$;
        
        this.rootDiagnotic = diagnostic;
        this.shouldIncludeTopLevelErrorInDetails = true;
        
        assert dialogButtonIDs != null && dialogButtonLabels != null; 
        assert dialogButtonIDs.length == dialogButtonLabels.length;        
        assert defaultDialogButtonIndex >= 0 && defaultDialogButtonIndex < dialogButtonIDs.length;
        
        buttonIDs = dialogButtonIDs;
        buttonLabels = dialogButtonLabels;
        defaultButtonIndex = defaultDialogButtonIndex;
        
        setShellStyle(getShellStyle() | SWT.RESIZE);
    }
        
    @Override
    protected void buttonPressed(int id) {
        if (id == IDialogConstants.DETAILS_ID) {
            // was the details button pressed?
            toggleDetailsArea();
        } else if(id == IDialogConstants.OK_ID || id == IDialogConstants.CANCEL_ID) {
            super.buttonPressed(id);
        } else {
        	setReturnCode(id);
        	close();
        }
    }

    @Override
    protected void configureShell(Shell shell) {
        super.configureShell(shell);
        shell.setText(title);
    }

    @Override
    protected void createButtonsForButtonBar(Composite parent) {
		for (int i = 0; i < buttonLabels.length; i++) {
			createButton(parent, buttonIDs[i], buttonLabels[i], defaultButtonIndex == i);
		}
    	createDetailsButton(parent);
    }

	protected void createDetailsButton(Composite parent) {
		if (shouldShowDetailsButton()) {
            detailsButton = createButton(parent, IDialogConstants.DETAILS_ID,
                    IDialogConstants.SHOW_DETAILS_LABEL, false);
        }
	}

    /**
     * This implementation of the <code>Dialog</code> framework method creates
     * and lays out a composite and calls <code>createMessageArea</code> and
     * <code>createCustomArea</code> to populate it. Subclasses should
     * override <code>createCustomArea</code> to add contents below the
     * message.
     */
	@Override
    protected Control createDialogArea(Composite parent) {
        createMessageArea(parent);
        // create a composite with standard margins and spacing
        Composite composite = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
        layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
        layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
        layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
        layout.numColumns = 2;
        composite.setLayout(layout);
        GridData childData = new GridData(GridData.FILL_BOTH);
        childData.horizontalSpan = 2;
        composite.setLayoutData(childData);
        composite.setFont(parent.getFont());
        return composite;
    }

	@Override
    protected void createDialogAndButtonArea(Composite parent) {
        super.createDialogAndButtonArea(parent);
        if (this.dialogArea instanceof Composite) {
            //Create a label if there are no children to force a smaller layout
            Composite dialogComposite = (Composite) dialogArea;
            if (dialogComposite.getChildren().length == 0) {
				new Label(dialogComposite, SWT.NULL);
			}
        }
    }

    @Override    
    protected Image getImage() {    	
        if (rootDiagnotic != null) {
            if (rootDiagnotic.getSeverity() == Diagnostic.WARNING) {
				return getWarningImage();
			}
            if (rootDiagnotic.getSeverity() == Diagnostic.INFO) {
				return getInfoImage();
			}
        }
        return getErrorImage();
    }
    
    /**
     * Create this dialog's drop-down diagnosticTree component.
     * 
     * @param parent
     *            the parent composite
     * @return the drop-down diagnosticTree component
     */
	protected void createDropDownTree(Composite parent) {
        // create the diagnosticTree
        diagnosticTree = new TreeViewer(parent, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
        GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL | GridData.VERTICAL_ALIGN_FILL | GridData.GRAB_VERTICAL);
        data.heightHint = diagnosticTree.getTree().getItemHeight() * ITEM_COUNT;
        data.horizontalSpan = 2;
        
        diagnosticTree.getTree().setLayoutData(data);
        diagnosticTree.getTree().setFont(parent.getFont());
        Menu copyMenu = createDiagnosticTreeMenu();
        
        diagnosticTree.getTree().setMenu(copyMenu);
        
        diagnosticTree.setLabelProvider(new DiagnosticLabelProvider());                
        diagnosticTree.setContentProvider(new DiagnosticContentProvider(shouldIncludeTopLevelErrorInDetails));                
        diagnosticTree.setInput(rootDiagnotic);    

    	diagnosticTree.expandToLevel(2);
        diagnosticTree.setSelection(new StructuredSelection(rootDiagnotic), true);    	
    	diagnosticTree.getTree().setFocus();         
    }

    /**
     * Opens an dialog to display the given diagnostic and proceed, cancel buttons.
     * <p>
     * 
     * @param parentShell
     *            the parent shell of the dialog, or <code>null</code> if none
     * @param title
     *            the title to use for this dialog, or <code>null</code> to
     *            indicate that the default title should be used
     * @param message
     *            the message to show in this dialog, or <code>null</code> to
     *            indicate that the error's message should be shown as the
     *            primary message
     * @param rootDiagnotic
     *            the diagnostic to show to the user
     *            
     * @return the code of the button that was pressed that resulted in this
     *         dialog closing. This will be <code>Dialog.OK</code> if the OK
     *         or <code>Dialog.CANCEL</code> if this dialog's close window decoration 
     *         or the ESC key was used.         
     */
    public static int openProceedCancel(Shell parentShell, String title, String message, Diagnostic rootDiagnostic) {
    	return openProceedCancel(parentShell, title, message, rootDiagnostic, false);
    }
    
    /**
	 * Opens an dialog to display the given diagnostic and proceed, cancel
	 * buttons.
	 * <p>
	 * 
	 * @param parentShell
	 *            the parent shell of the dialog, or <code>null</code> if none
	 * @param title
	 *            the title to use for this dialog, or <code>null</code> to
	 *            indicate that the default title should be used
	 * @param message
	 *            the message to show in this dialog, or <code>null</code> to
	 *            indicate that the error's message should be shown as the
	 *            primary message
	 * @param rootDiagnotic
	 *            the diagnostic to show to the user
	 * 
	 * @param disableProceed
	 *            indicates whether the <code>PROCEED</code> button should be
	 *            disabled.
	 * @return the code of the button that was pressed that resulted in this
	 *         dialog closing. This will be <code>Dialog.OK</code> if the OK
	 *         or <code>Dialog.CANCEL</code> if this dialog's close window
	 *         decoration or the ESC key was used.
	 */
    public static int openProceedCancel(Shell parentShell, String title, String message, Diagnostic rootDiagnostic, final boolean disableProceed) {
        DiagnosticsDialog dialog = new DiagnosticsDialog(parentShell, title, message, rootDiagnostic, 
        		new String[] { IDialogConstants.PROCEED_LABEL, IDialogConstants.CANCEL_LABEL },
        		new int[] { IDialogConstants.PROCEED_ID, IDialogConstants.CANCEL_ID }, 0) {
        	@Override
        	protected Control createButtonBar(Composite parent) {        
        		Control buttonBar = super.createButtonBar(parent);
        		Button proceedButton = getButton(IDialogConstants.PROCEED_ID);
        		if(proceedButton != null) {
        			proceedButton.setEnabled(!disableProceed);
        		}
        		return buttonBar;
        	}
        };
        return dialog.open();
    }
    
    /**
	 * Opens an dialog to display the given diagnostic and <code>OK</code> button.
	 * <p>
	 * 
	 * @param parentShell
	 *            the parent shell of the dialog, or <code>null</code> if none
	 * @param title
	 *            the title to use for this dialog, or <code>null</code> to
	 *            indicate that the default title should be used
	 * @param message
	 *            the message to show in this dialog, or <code>null</code> to
	 *            indicate that the error's message should be shown as the
	 *            primary message
	 * @param rootDiagnotic
	 *            the diagnostic to show to the user
	 *
	 * @return the code of the button that was pressed that resulted in this
	 *         dialog closing. This will be <code>Dialog.OK</code> if the OK
	 *         or <code>Dialog.CANCEL</code> if this dialog's close window
	 *         decoration or the ESC key was used.
	 */
    public static int openOk(Shell parentShell, String title, String message, Diagnostic rootDiagnostic) {
        return new DiagnosticsDialog(parentShell, title, message, rootDiagnostic, 
        		new String[] { IDialogConstants.OK_LABEL },
        		new int[] { IDialogConstants.OK_ID }, 0).open();
    }    

    private Object getSelection() {
        if (diagnosticTree != null && !diagnosticTree.getTree().isDisposed()) {
	        ISelection selection = diagnosticTree.getSelection();
	        if(!selection.isEmpty() && selection instanceof IStructuredSelection) {
	        	IStructuredSelection structuredSelection = (IStructuredSelection)selection;
	        	return structuredSelection.getFirstElement();
	        }
        }
    	return null;
    }
    
    private Diagnostic getDiagnosticSelection() {
    	Object selection = getSelection();
    	return selection instanceof Diagnostic ? (Diagnostic)selection : null; 
    } 
    
    /**
     * Toggles the unfolding of the details area. This is triggered by the user
     * pressing the details button.
     */
    private void toggleDetailsArea() {
        Point windowSize = getShell().getSize();
        Point oldSize = getShell().computeSize(SWT.DEFAULT, SWT.DEFAULT);
        if (detailsCreated) {
            diagnosticTree.getTree().dispose();                       
            stackTraceText.dispose();
            
            detailsCreated = false;
            detailsButton.setText(IDialogConstants.SHOW_DETAILS_LABEL);
        } else {
            createDetailsArea((Composite) getContents());
            
            detailsButton.setText(IDialogConstants.HIDE_DETAILS_LABEL);
        }
        Point newSize = getShell().computeSize(SWT.DEFAULT, SWT.DEFAULT);
        getShell().setSize(new Point(windowSize.x, windowSize.y + (newSize.y - oldSize.y)));
    }

    /**
     * Put the details of the rootDiagnotic of the error onto the stream.
     * 
     * @param buildingDiagnostic
     * @param buffer
     * @param nesting
     */
    private void populateCopyBuffer(Diagnostic buildingDiagnostic,
            StringBuffer buffer, int nesting) {
 
        for (int i = 0; i < nesting; i++) {
            buffer.append(NESTING_INDENT);
        }
        buffer.append(buildingDiagnostic.getMessage());        
        buffer.append(System.getProperty("line.separator", "\n")); //$NON-NLS-1$ //$NON-NLS-2$
        
        // Look for a nested core exception
        Throwable t = buildingDiagnostic.getException();
        if (t instanceof CoreException) {
            CoreException ce = (CoreException)t;
            populateCopyBuffer(BasicDiagnostic.toDiagnostic(ce), buffer, nesting + 1);
        }
        
        List<Diagnostic> children = buildingDiagnostic.getChildren();
        for (Diagnostic next : children) {
            populateCopyBuffer(next, buffer, nesting + 1);
        }
    }

    public boolean close() {
        if (clipboard != null) {
			clipboard.dispose();
		}
        return super.close();
    }
    
    /**
     * Show the details portion of the dialog if it is not already visible.
     * This method will only work when it is invoked after the control of the dialog
     * has been set. In other words, after the <code>createContents</code> method
     * has been invoked and has returned the control for the content area of the dialog.
     * Invoking the method before the content area has been set or after the dialog has been
     * disposed will have no effect.
     * @since 3.1
     */
    protected final void showDetailsArea() {
        if (!detailsCreated) {
            Control control = getContents();
            if (control != null && ! control.isDisposed()) {
				toggleDetailsArea();
			}
        }
    }
    
    /**
     * Return whether the Details button should be included.
     * This method is invoked once when the dialog is built.
     * By default, the Details button is only included if
     * the rootDiagnotic used when creating the dialog was a multi-rootDiagnotic
     * or if the rootDiagnotic contains an exception.
     * Subclasses may override.
     * @return whether the Details button should be included
     */
    protected boolean shouldShowDetailsButton() {
        return !rootDiagnotic.getChildren().isEmpty() || rootDiagnotic.getException() != null;
    }
        
    private void createDetailsArea(Composite parent) {
    	createDropDownTree(parent);
    	createDropDownText(parent, diagnosticTree.getTree().getBackground());
    	
    	this.diagnosticTree.addPostSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				Throwable throwable = getExceptionSelection();
				String textValue = ""; //$NON-NLS-1$
				if(throwable != null) {
			        // print the stacktrace in the stackTraceText field
			        try {
			            ByteArrayOutputStream baos = new ByteArrayOutputStream();
			            PrintStream ps = new PrintStream(baos);
			            throwable.printStackTrace(ps);
			            ps.flush();
			            baos.flush();
			            textValue = baos.toString();
			        } catch (IOException e) {
			        	// no reason for IO error
			        }
				}

				stackTraceText.setText(textValue);				
			}
    	});
    	   	
    	this.detailsCreated = true;
    }
    
    private void createDropDownText(Composite parent, Color backgroundColor) {
        // create the list
    	stackTraceText = new Text(parent, SWT.BORDER | SWT.READ_ONLY | SWT.H_SCROLL | SWT.V_SCROLL);
    	stackTraceText.setBackground(backgroundColor);
        stackTraceText.setFont(parent.getFont());

        GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL | 
        		GridData.VERTICAL_ALIGN_FILL | GridData.GRAB_VERTICAL);        
        data.heightHint = stackTraceText.getLineHeight() * STACK_TRACE_TEXT_LINE_COUNT;
        data.horizontalSpan = 2;
        stackTraceText.setLayoutData(data);
       
        stackTraceText.setToolTipText(Messages.DiagnosticsDialog_exceptStackTrace_toolTip);
    }    
    
	private Menu createDiagnosticTreeMenu() {
		Menu diagnosticMenu = new Menu(diagnosticTree.getTree());
        MenuItem copyItem = new MenuItem(diagnosticMenu, SWT.NONE);
        copyItem.setText(Messages.DiagnosticsDialog_Copy_menuItem);        
        copyItem.addSelectionListener(new SelectionListener() {
            public void widgetSelected(SelectionEvent e) {
                copyToClipboard();
            }

            public void widgetDefaultSelected(SelectionEvent e) {
                copyToClipboard();
            }
        });

        if(ValidationHelper.getDiagnosticMarkerMap(rootDiagnotic) != null) {
	        MenuItem gotoItem = new MenuItem(diagnosticMenu, SWT.NONE);
	        gotoItem.setText(Messages.DiagnosticsDialog_gotoProblem_menuItem);
	        gotoItem.addSelectionListener(new SelectionListener() {
	            public void widgetSelected(SelectionEvent e) {
	            	gotoProblem();
	            }
	
	            public void widgetDefaultSelected(SelectionEvent e) {
	            	gotoProblem();
	            }
	        });
        }
        
		return diagnosticMenu;
	}
	
    /**
     * Copy the contents of the statuses to the clipboard.
     */
    private void copyToClipboard() {
        if (clipboard != null) {
			clipboard.dispose();
		}
        StringBuffer statusBuffer = new StringBuffer();
        Diagnostic source = getDiagnosticSelection();
        populateCopyBuffer((source != null) ? source : rootDiagnotic, statusBuffer, 0);
        clipboard = new Clipboard(getShell().getDisplay());
        
        clipboard.setContents(new Object[] { statusBuffer.toString() },
                new Transfer[] { TextTransfer.getInstance() });
    }
	
	
    private void gotoProblem() {
    	Diagnostic diagnostic = getDiagnosticSelection();
    	if(diagnostic == null) {
    		return;
    	}
    	
    	DiagnosticMarkerMap markerMap = ValidationHelper.getDiagnosticMarkerMap(rootDiagnotic);
    	IMarker marker = null;
    	if(markerMap != null) {
        	if(!markerMap.getMap().containsKey(diagnostic) && 
        			diagnostic == rootDiagnotic && !diagnostic.getChildren().isEmpty()) {
        		// the root is usually just a wrapper containing real diagnostics with markers 
        		// -> take the first one
        		diagnostic = diagnostic.getChildren().get(0);
        	}
        	marker = markerMap.getMap().get(diagnostic);        	
    	}    	
 			
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = (workbenchWindow != null) ? workbenchWindow.getActivePage() : null;			
		if(page == null) {
			return;
		}
		 				
		try {
			// activate the problem view to			
			page.showView("org.eclipse.ui.views.ProblemView"); //$NON-NLS-1$
		} catch (PartInitException e) {
			CodeGenUIPlugin.getDefault().getLog().log(e.getStatus());			
		} 
    	
		IFile file = ValidationHelper.getFileFromDiagnostic(diagnostic);		
		if(file != null) {
			try {
			    String editorId = "org.eclipse.ui.DefaultTextEditor"; //$NON-NLS-1$			   
			    IEditorPart editorPart = null;			    
			    if(marker == null || marker.getAttribute(EValidator.URI_ATTRIBUTE, null) != null) {
			    	IEditorDescriptor[] editorDescriptors = PlatformUI.getWorkbench()
						.getEditorRegistry().getEditors(file.getName());				    	
			    	if(editorDescriptors.length > 0) {
			    		editorId = editorDescriptors[0].getId();
			    	}
			    }
			    
			    editorPart = page.openEditor(new FileEditorInput(file), editorId, true, IWorkbenchPage.MATCH_INPUT | IWorkbenchPage.MATCH_ID);			    
				IGotoMarker gotoMarkerSupport = null;
				if(editorPart != null) {
					gotoMarkerSupport = (IGotoMarker)editorPart.getAdapter(IGotoMarker.class);
					cancelPressed();					
				}

				if(gotoMarkerSupport != null && marker != null) {
					// delegate to goto marker of the activated editor
					gotoMarkerSupport.gotoMarker(marker);
				}			
								
			} catch (PartInitException e) {
				CodeGenUIPlugin.getDefault().getLog().log(e.getStatus());
			}			
		}
    }    
    
	private Throwable getExceptionSelection() {
		Diagnostic selection = getDiagnosticSelection();
		return (selection != null) ? selection.getException() : null;
	}

	static Diagnostic toDiagnostic(IStatus status) {
		Object[] data = null;
		if(status.getException() != null) {
			data = new Object[] { status.getException() }; 			
		}
		
		if(status.isMultiStatus()) {
			IStatus[] nestedStatuses = status.getChildren();
			List<Diagnostic> children = new ArrayList<Diagnostic>(nestedStatuses.length);
			for (int i = 0; i < nestedStatuses.length; i++) {
				children.add(toDiagnostic(nestedStatuses[i]));
			}
			return new BasicDiagnostic(status.getPlugin(), status.getCode(), children, status.getMessage(), data);
		}		
		return new BasicDiagnostic(status.getSeverity(), status.getPlugin(), status.getCode(), status.getMessage(), data);
	}	
}
