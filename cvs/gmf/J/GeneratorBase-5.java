package org.eclipse.gmf.internal.common.codegen;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.codegen.util.CodeGenUtil.EclipseUtil;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.TextEdit;

/**
 * XXX do I really need refreshLocal in doGenerate[Binary]File? Guess, not.
 * @author artem
 */
public abstract class GeneratorBase implements Runnable {
	private JControlModel myJControlModel;
	private CodeFormatter myCodeFormatter;
	private IProgressMonitor myProgress = new NullProgressMonitor();

	// myDestRoot.getJavaProject().getElementName() == myDestProject.getName()
	private IPackageFragmentRoot myDestRoot;
	private IProject myDestProject;
	private final List/*<IStatus>*/ myExceptions;
	private IStatus myRunStatus = Status.CANCEL_STATUS;

	protected abstract URL getJMergeControlFile();
	
	protected abstract void customRun() throws InterruptedException, UnexpectedBehaviourException;
	
	protected abstract void setupProgressMonitor();

	public GeneratorBase(){
		myExceptions = new LinkedList/*<IStatus>*/();
	}
	
	public void run(IProgressMonitor progress) throws InterruptedException {
		setProgressMonitor(progress);
		doRun();
	}
	
	public void run() {
		clearExceptionsList();
		try {
			doRun();
		} catch (InterruptedException ex) {
			myRunStatus = new Status(IStatus.CANCEL, "org.eclipse.gmf.common", 0, GeneratorBaseMessages.interrupted, ex);
		}
	}
	
	/**
	 * Provides information about success/failures during {@link #run()}
	 * @return state of the generator run, or CANCEL if generator was not yet run.
	 */
	public IStatus getRunStatus() {
		return myRunStatus;
	}

	/**
	 * Optionally, specify progressMonitor to use. Should be called prior to {@link #run()}
	 * @param progress
	 */
	public void setProgressMonitor(IProgressMonitor progress) {
		myProgress = progress;
	}

	protected final void handleException(CoreException ex) {
		handleException(ex.getStatus());
	}
	
	protected final void handleException(IStatus status) {
		myExceptions.add(status);
	}

	protected final void handleException(Throwable ex) {
		handleException(newStatus(ex));
	}

	/**
	 * by default, process as ordinary exception
	 */
	protected void handleUnexpected(UnexpectedBehaviourException ex) {
		handleException(ex);
	}

	protected static IStatus newStatus(Throwable ex) {
		return newStatus(IStatus.ERROR, ex);
	}

	protected static IStatus newStatus(int severity, Throwable ex) {
		return new Status(severity, "org.eclipse.gmf.common", 0, ex.getMessage() == null ? ex.getClass().getName() : ex.getMessage(), ex);
	}

	protected final IProject getDestProject() {
		return myDestProject;
	}
	
	protected final IProgressMonitor getProgress() {
		return myProgress;
	}
	
	protected final void setupProgressMonitor(String task, int total) {
		if (myProgress == null) {
			myProgress = new NullProgressMonitor();
			return;
			// no need to set it up
		}
		myProgress.beginTask(task, total);
	}
	
	protected final IProgressMonitor getNextStepMonitor() throws InterruptedException {
		if (myProgress.isCanceled()) {
			throw new InterruptedException();
		}
		return new SubProgressMonitor(myProgress, 1);
	}

	/**
	 * @see #initializeEditorProject(String, IPath, List)
	 */
	protected final void initializeEditorProject(String pluginId, IPath projectLocation) throws UnexpectedBehaviourException, InterruptedException {
		initializeEditorProject(pluginId, projectLocation, Collections.EMPTY_LIST);
	}

	/**
	 * @param pluginId both name of workspace project and plug-in id
	 * @param projectLocation {@link IPath} to folder where <code>.project</code> file would reside. Use <code>null</code> to use default workspace location.
	 * @param referencedProjects collection of {@link IProject}
	 * @throws UnexpectedBehaviourException something goes really wrong 
	 * @throws InterruptedException user canceled operation
	 */
	protected final void initializeEditorProject(String pluginId, IPath projectLocation, List/*<IProject>*/ referencedProjects) throws UnexpectedBehaviourException, InterruptedException {
		myDestProject = ResourcesPlugin.getWorkspace().getRoot().getProject(pluginId);
		final Path srcPath = new Path('/' + myDestProject.getName() + "/src"); //$NON-NLS-1$
		final int style = org.eclipse.emf.codegen.ecore.Generator.EMF_PLUGIN_PROJECT_STYLE;
		// pluginVariables is NOT used when style is EMF_PLUGIN_PROJECT_STYLE
		final List pluginVariables = null;
		final IProgressMonitor pm = getNextStepMonitor();

		org.eclipse.emf.codegen.ecore.Generator.createEMFProject(srcPath, projectLocation, referencedProjects, pm, style, pluginVariables);

		try {
			myDestRoot = JavaCore.create(myDestProject).findPackageFragmentRoot(srcPath);
		} catch (JavaModelException ex) {
			throw new UnexpectedBehaviourException(ex.getMessage());
		}
		if (myDestRoot == null) {
			throw new UnexpectedBehaviourException("no source root can be found");
		}
	}
	
	/**
	 * Generate ordinary file. No merge is performed at the moment.
	 * @param emitter template to use
	 * @param filePath - project-relative path to file, e.g. META-INF/MANIFEST.MF
	 * @param param TODO
	 * @throws InterruptedException
	 */
	protected final void doGenerateFile(TextEmitter emitter, IPath filePath, Object[] param) throws InterruptedException {
		assert !myDestProject.getName().equals(filePath.segment(0));
		IProgressMonitor pm = getNextStepMonitor();
		try {
			myProgress.subTask(filePath.lastSegment());
			pm.beginTask(null, 4);
			IPath containerPath = myDestProject.getFullPath().append(filePath.removeLastSegments(1));
			EclipseUtil.findOrCreateContainer(containerPath, false, (IPath) null, new SubProgressMonitor(pm, 1));
			String genText = emitter.generate(new SubProgressMonitor(pm, 1), param);
			IFile f = myDestProject.getFile(filePath);
			boolean propertyFile = "properties".equals(filePath.getFileExtension());
			String charset = propertyFile ? "ISO-8859-1" : "UTF-8";
			if (propertyFile) {
				genText = escapeUnicode(genText);
			}
			// FIXME merge!
			if (f.exists()) {
				if (!contains(f, new ByteArrayInputStream(genText.getBytes(charset)))) {
					f.setContents(new ByteArrayInputStream(genText.getBytes(charset)), true, true, new SubProgressMonitor(pm, 1));
				} else {
					pm.worked(1);
				}
			} else {
				f.create(new ByteArrayInputStream(genText.getBytes(charset)), true, new SubProgressMonitor(pm, 1));
			}
			f.getParent().refreshLocal(IResource.DEPTH_ONE, new SubProgressMonitor(pm, 1));
		} catch (InvocationTargetException ex) {
			handleException(ex.getCause());
		} catch (UnexpectedBehaviourException ex) {
			handleUnexpected(ex);
		} catch (CoreException ex) {
			handleException(ex);
		} catch (UnsupportedEncodingException ex) {
			handleException(ex);
		} finally {
			pm.done();
		}
	}

	private static String escapeUnicode(String text) {
	    StringBuffer result = new StringBuffer(text.length());
	    for (int i = 0, size = text.length(); i < size; ++i)
	    {
	      char character = text.charAt(i);
	      if (character > '\u00ff')
	      {
	        result.append("\\u");
	        String hex = Integer.toString(character, 16);
	        for (int j = hex.length(); j < 4; ++j)
	        {
	          result.append("0");
	        }
	        result.append(hex);
	      }
	      else
	      {
	        result.append(character);
	      }
	    }

	    return result.toString();
	}

	/**
	 * Inspired by GenBaseImpl.EclipseUtil.findOrCreateContainer
	 * Although later (with EMF API adopting Platform changes) we might need to return URI here
	 * @return path suitable for IProjectDescription, or <code>null</code> to indicate use of default
	 */
	protected final IPath guessNewProjectLocation(Path examplaryProjectPath, String newProjectName) {
		assert newProjectName != null;
		try {
			if (ResourcesPlugin.getWorkspace().getRoot().getProject(newProjectName).exists()) {
				// just use whatever already specified.
				// Returned value doesn't make sense in this case -
				// oee.codegen.ecore.Generator#EclipseHelper#createEMFProject doesn't use it then. 
				return null;
			}
			if (examplaryProjectPath == null || !examplaryProjectPath.isAbsolute()) {
				return null;
			}
			IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(examplaryProjectPath.segment(0));
			if (!p.exists()) {
				return null;
			}
			java.net.URI locationURI = p.getDescription().getLocationURI();
			// org.eclipse.core.internal.utils.FileUtil#toPath
			if (locationURI == null) {
				return null;
			}
			if (locationURI.getScheme() != null && !"file".equals(locationURI.getScheme())) {
				return null;
			}
			return new Path(locationURI.getSchemeSpecificPart()).removeLastSegments(1).append(newProjectName);
		} catch (CoreException ex) {
			handleException(newStatus(IStatus.WARNING, ex));
			return null;
		}
	}

	/**
	 * @return <code>true</code> if the file contains the input stream contents
	 */
	protected boolean contains(IFile f, InputStream is) {
		int fc = 0;
		int ic = 0;
		InputStream fs = null;
		try {
			fs = f.getContents(true);
			while ((fc = fs.read()) == (ic = is.read()) && fc >= 0);
		} catch (CoreException ce) {
		} catch (IOException ioe) {
		} finally {
			if (fs != null) {
				try {
					fs.close();
				} catch (IOException ioe) {
				}
			}
		}
		return fc <0 && ic < 0;
	}

	protected final void doGenerateJavaClass(TextEmitter emitter, String qualifiedClassName, Object[] input) throws InterruptedException {
		doGenerateJavaClass(emitter, CodeGenUtil.getPackageName(qualifiedClassName), CodeGenUtil.getSimpleClassName(qualifiedClassName), input);
	}

	/**
	 * NOTE: potential problem - packageName and className should match those specified in 
	 * the template. Besides, getQualifiedXXX helpers in diagram GenModel should also correctly
	 * return qualified class names.  
	 */
	protected final void doGenerateJavaClass(TextEmitter emitter, String packageName, String className, Object[] input) throws InterruptedException {
		IProgressMonitor pm = getNextStepMonitor();
		try {
			myProgress.subTask(className);
			pm.beginTask(null, 4);
			String genText = emitter.generate(new SubProgressMonitor(pm, 1), input);
			IPackageFragment pf = myDestRoot.createPackageFragment(packageName, true, new SubProgressMonitor(pm, 1));
			ICompilationUnit cu = pf.getCompilationUnit(className + ".java"); //$NON-NLS-1$
			genText = mergeJavaCode(genText, cu, new SubProgressMonitor(pm, 1));
			genText = formatCode(genText);
			if (!cu.exists() || !genText.equals(cu.getSource())) {
				pf.createCompilationUnit(cu.getElementName(), genText, true, new SubProgressMonitor(pm, 1));
			} else {
				pm.worked(1);
			}
		} catch (NullPointerException ex) {
			handleException(ex);
		} catch (InvocationTargetException ex) {
			handleException(ex.getCause());
		} catch (UnexpectedBehaviourException ex) {
			handleUnexpected(ex);
		} catch (CoreException ex) {
			handleException(ex);		
		} finally {
			pm.done();
		}
	}

	protected final void doGenerateBinaryFile(BinaryEmitter emitter, Path outputPath, Object[] params) throws InterruptedException, UnexpectedBehaviourException {
		IProgressMonitor pm = getNextStepMonitor();
		myProgress.subTask(outputPath.lastSegment());
		IFile f = getDestProject().getFile(outputPath);
		if (f.exists()) {
			// Follow EMF's policy and do not overwrite file if exists
			return;
		}
		try {
			pm.beginTask(null, 4);
			IPath containerPath = getDestProject().getFullPath().append(outputPath.removeLastSegments(1));
			EclipseUtil.findOrCreateContainer(containerPath, false, (IPath) null, new SubProgressMonitor(pm, 1));
			byte[] contents = emitter.generate(new SubProgressMonitor(pm, 1), params);
			f.create(new ByteArrayInputStream(contents), true, new SubProgressMonitor(pm, 1));
			f.getParent().refreshLocal(IResource.DEPTH_ONE, new SubProgressMonitor(pm, 1));
		} catch (InvocationTargetException ex) {
			handleException(ex.getCause());
		} catch (CoreException ex) {
			handleException(ex);
		} finally {
			pm.done();
		}
	}	

	protected final String mergeJavaCode(String generatedText, ICompilationUnit oldCU, IProgressMonitor pm) throws JavaModelException {
		pm.beginTask(GeneratorBaseMessages.merge, 1);
		try {
			if (oldCU != null && oldCU.exists() && getJControlModel() != null) {
				JMerger jMerge = new JMerger(getJControlModel());
				jMerge.setSourceCompilationUnit(jMerge.createCompilationUnitForContents(generatedText));
				jMerge.setTargetCompilationUnit(jMerge.createCompilationUnitForContents(oldCU.getSource()));
				jMerge.merge();
				return jMerge.getTargetCompilationUnitContents();
			} else {
				return generatedText;
			}
		} finally {
			pm.done();
		}
	}

	protected final String formatCode(String text) {
		IDocument doc = new Document(text);
		TextEdit edit = getCodeFormatter().format(CodeFormatter.K_COMPILATION_UNIT, doc.get(), 0, doc.get().length(), 0, null);

		try {
			// check if text formatted successfully 
			if(edit != null) {
				edit.apply(doc);
				text = doc.get();				
			}		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return text;
	}

	private void doRun() throws InterruptedException {
		try {
			setupProgressMonitor();
			customRun();
			myRunStatus = getExceptionsStatus();
			// XXX consider catching CCE and provide "programming error" to help users with their templates
		} catch (NullPointerException ex) {
			myRunStatus = new Status(IStatus.ERROR, "org.eclipse.gmf.common", 0, NullPointerException.class.getName(), ex);
		} catch (UnexpectedBehaviourException ex) {
			myRunStatus = new Status(Status.ERROR, "org.eclipse.gmf.common", 0, GeneratorBaseMessages.unexpected, ex);
		} finally {
			getProgress().done();
			clearExceptionsList();
		}
	}

	private JControlModel getJControlModel() {
		if (myJControlModel == null) {
			URL controlFile = getJMergeControlFile();
			if (controlFile != null){
				myJControlModel = new JControlModel();
				myJControlModel.initialize(CodeGenUtil.instantiateFacadeHelper(JMerger.DEFAULT_FACADE_HELPER_CLASS), controlFile.toString());
				if (!myJControlModel.canMerge()){
					throw new IllegalStateException("Can not initialize JControlModel");
				}
			}
		}
		return myJControlModel;
	}

	private CodeFormatter getCodeFormatter() {
		if (myCodeFormatter == null) {
			myCodeFormatter = ToolFactory.createCodeFormatter(null);
		}
		return myCodeFormatter;
	}
	
	private final void clearExceptionsList(){
		myExceptions.clear();
	}
	
	private final IStatus getExceptionsStatus(){
		if (myExceptions == null || myExceptions.isEmpty()){
			return Status.OK_STATUS;
		} else {
			IStatus[] s = (IStatus[]) myExceptions.toArray(new IStatus[myExceptions.size()]);
			return new MultiStatus("org.eclipse.gmf.common", 0, s, GeneratorBaseMessages.problems, null);
		}
	}
}
