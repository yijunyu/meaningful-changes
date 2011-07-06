/**
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: dvorak - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.transform;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.ui.MarkerHelper;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.util.EditUIMarkerHelper;
import org.eclipse.gmf.internal.bridge.ui.Plugin;

/**
 * Provides various functinality useful for model validation, for instances
 * progress monitoring, resource markers creation.
 */
public class ValidationHelper {

	/**
	 * Enhanced diagnostician class supporting progress monitoring and object
	 * labels.
	 */
	private static class SmartDiagnostician extends Diagnostician {

		private static ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		private IProgressMonitor monitor;

		/**
		 * Constructs diagnostician with progress monitor.
		 * 
		 * @param progressMonitor
		 *            non-null progress monitor to track validation progress
		 */
		SmartDiagnostician(IProgressMonitor progressMonitor) {
			this.monitor = progressMonitor;
		}

		/*
		 * Utilizes the adapter factory registry to provide labels.
		 */
		@Override
		public String getObjectLabel(EObject eObject) {
			if (eObject != null) {
				IItemLabelProvider itemLabelProvider = (IItemLabelProvider) adapterFactory.adapt(eObject, IItemLabelProvider.class);
				if (itemLabelProvider != null) {
					return itemLabelProvider.getText(eObject);
				}
			} else {
				return ""; //$NON-NLS-1$
			}
			return super.getObjectLabel(eObject);
		}

		/*
		 * Notifies the monitor about the unit of work done.
		 */
		@Override
		public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
			if(monitor.isCanceled()) {
				return true;
			}

			monitor.worked(1);
			return super.validate(eClass, eObject, diagnostics, context);
		}
	}	
		
	/**
	 * Helper class for binding validation diagnostics to corresponding problem
	 * markers.
	 * <p>
	 * This class ensures that markers are managed for both {@link Diagnostic}}
	 * and {@link Resource.Diagnostic} diagnostic types.
	 */
	private static class GMFMarkerHelper extends EditUIMarkerHelper {
		
		private LinkedHashMap<Diagnostic, IMarker> diagnostic2Marker;
		private String markerID;
		
		/**
		 * Constructs marker helper with default markerID taken from its super-type.
		 */
		GMFMarkerHelper() {
			super();
		}
		
		/**
		 * Constructs marker helper with given marker ID.
		 * 
		 * @param markerID
		 *            string ID used as IMarker.TYPE.
		 *            <p>
		 *            If <code>null</code>, the default is
		 *            <code>resource-problem-marker</code> taken from
		 *            {@link MarkerHelper#getMarkerID()}
		 */
		GMFMarkerHelper(String markerID) {
			this.markerID = markerID;
		}
		
		public IFile getFileFromDiagnostic(Diagnostic diagnostic) {
			return getFile(diagnostic);
		}
		
		@Override
		protected void adjustMarker(IMarker marker, Diagnostic diagnostic, Diagnostic parentDiagnostic) throws CoreException {
			getDiagnostic2MarkerMap().put(diagnostic, marker);

			// adjust marker to support IGotoMarker for standard EMF generated editors 
			List<?> data = diagnostic.getData();
			if (data != null && !data.isEmpty()) {
				Object target = data.get(0);
				if (target instanceof EObject) {
					marker.setAttribute(EValidator.URI_ATTRIBUTE, EcoreUtil.getURI((EObject) target).toString());
				}
			}

			super.adjustMarker(marker, diagnostic, parentDiagnostic);
		}
				
		@Override
		protected IFile getFile(Object datum) {
			if (datum instanceof EObject) {
				EObject eObject = (EObject) datum;
				if(eObject.eResource() != null) {
					URI uri = eObject.eResource().getURI();
					IFile file = getFile(uri);
					if(file != null) {
						return file;
					}
				}
			}
			return super.getFile(datum);
		}
		
		
		
		@Override
		protected String getMarkerID() {
			return markerID != null ? markerID : super.getMarkerID();
		}

		LinkedHashMap<Diagnostic, IMarker> getDiagnostic2MarkerMap() {
			if(diagnostic2Marker == null) {
				diagnostic2Marker = new LinkedHashMap<Diagnostic, IMarker>();
			}
			return diagnostic2Marker;
		}		
	}	
		
	/**
	 * Diagnostic to marker map data holder class.
	 * <p>
	 * Note: The map iterators respect the order of marker creation.
	 */
	public static class DiagnosticMarkerMap {
		private Map<Diagnostic, IMarker> map;
		
		/**
		 * Constraint diagnostic marker from the given map data.
		 * @param markerMap map data to be encapsulated by the resulting object.
		 */
		DiagnosticMarkerMap(LinkedHashMap<Diagnostic, IMarker> markerMap) {
			this.map = Collections.unmodifiableMap(markerMap);
		}
						
		/**
		 * Gets the map data for this diagnostic marker map.
		 * @return read-only map object
		 */
		public Map<Diagnostic, IMarker> getMap() {
			return map;
		}
	}	
	
	/**
	 * No instances, just an utility class.
	 */
	private ValidationHelper() {
		super();
	}
	
	
	/**
	 * Indicates whether the severiti of the given diagnostic matches the given 
	 * bitmask.<p>
	 * Note that a diagnostic with severity <code>OK</code> will never match; 
	 * use <code>isOK</code> instead to detect a diagnostic with a severity of <code>OK</code>.
	 *  
	 * @param diagnostic a diagnostic to test for severity match
	 * @param severityBitMask a mask formed by bitwise or'ing severity mask constants
	 * 	(<code>ERROR</code>, <code>WARNING</code>, <code>INFO</code>, <code>CANCEL</code>)
	 * 
	 * @return <code>true</code> if there is at least one match, <code>false</code> otherwise
	 * 
	 * @see Diagnostic#ERROR
	 * @see Diagnostic#WARNING
	 * @see Diagnostic#INFO
	 * @see Diagnostic#CANCEL   
	 */
    public static boolean matches(Diagnostic diagnostic, int severityBitMask) {
    	return (diagnostic.getSeverity() & severityBitMask) != 0;
    }
    
	/**
	 * Returns whether this diagnostic indicates everything is OK. (neither
	 * info, warning, nor error).
	 * 
	 * @return <code>true</code> if this diagnostic has severity
	 *         <code>OK</code>, and <code>false</code> otherwise
	 */    
    public static boolean isOK(Diagnostic diagnostic) {
    	return diagnostic.getSeverity() == Diagnostic.OK;
    }

    /**
	 * Validates the given <code>EObject</code> and its all contents.
	 * <p>
	 * If the EMF basic validation results in <code>Diagnostic.CANCEL</code>
	 * severity, no problem markers are created at all.
	 * 
	 * The problem markers created by this operation are added as extra-data to
	 * the returned diagnostic and are accessible via
	 * {@link #getDiagnosticMarkerMap(Diagnostic)}.
	 * 
	 * @param createMarkers
	 *            if <code>true</code> this operation produces validation
	 *            problems markers provided that eObject.eResource() represents
	 *            a file existing in the workspace. If <code>true</code> no
	 *            attempt to create markers is performed.
	 * 
	 * @param progressMonitor
	 *            the progress monitor to track validation progress, or
	 *            <code>null</code> if no progress monitoring is required.
	 *            The implementation creates {@link SubProgressMonitor} as
	 *            a sub-task of the given parent <code>progressMonitor</code> 
	 *            allocating 1 tick from the parent. #beginTask and #done operation 
	 *            on the subprogress monitor is called.
	 * 
	 * @return the validation result diagnostic
	 */
	public static Diagnostic validate(EObject eObject, boolean createMarkers, IProgressMonitor progressMonitor) {		
		IProgressMonitor monitor = null;
		try {			
			int count = IProgressMonitor.UNKNOWN;
			if(progressMonitor != null) {
				for (Iterator<EObject> i = eObject.eAllContents(); i.hasNext(); i.next()) {
					++count;
				}
			}

			monitor = (progressMonitor != null) ? new SubProgressMonitor(progressMonitor, 1, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK) : new NullProgressMonitor(); 
		    monitor.beginTask("", count); //$NON-NLS-1$
		    monitor.subTask(Messages.ValidationHelper_task_validate);
			
		    Diagnostic validationStatus = new SmartDiagnostician(monitor).validate(eObject);
			if(validationStatus.getSeverity() == Diagnostic.CANCEL) {
				return validationStatus;
			}
				
			if(createMarkers) {
				return createMarkers(validationStatus, EValidator.MARKER);
			}
			
			return validationStatus;
			
		} finally {
			monitor.done();
		} 
	}
	
    /**
	 * Validates the given <code>EObject</code> and its all contents.
	 * <p>
	 * This method is progress monitoring ignorant shorthand of {@link #validate(EObject, boolean, IProgressMonitor)}
	 * 
	 * @param createMarkers
	 *            if <code>true</code> this operation produces validation
	 *            problems markers provided that eObject.eResource() represents
	 *            a file existing in the workspace. If <code>true</code> no
	 *            attempt to create markers is performed.
	 * 
	 * @return the validation result diagnostic
	 * 
	 * @see #validate(EObject, boolean, IProgressMonitor)
	 */	
	public static Diagnostic validate(EObject eObject, boolean createMarkers) {
		return validate(eObject, createMarkers, null);
	}
	
	/**
	 * Gets the diagnostic marker map associated with the given validation
	 * diagnostic.
	 * 
	 * @param diagnostic
	 *            a non-null validation diagnostic which resulted from calling
	 *            {@link #validate(EObject, boolean, IProgressMonitor)}}
	 * 
	 * @see #validate(EObject, boolean, IProgressMonitor)
	 */
	public static DiagnosticMarkerMap getDiagnosticMarkerMap(Diagnostic diagnostic) {
		List<?> data = (diagnostic.getData() != null) ? diagnostic.getData() : Collections.EMPTY_LIST;
		for (Object dataItem : data) {
			if (dataItem instanceof DiagnosticMarkerMap) {
				return (DiagnosticMarkerMap) dataItem;
			}			
		}
		return null;
	}

	/**
	 * Extracts the file of the validated model instance referenced by the given
	 * diagnostic.
	 * 
	 * @param diagnostic
	 *            a non-null validation diagnostic
	 * @return the file object or <code>null</code> in case the resource
	 *         associated with the validated object does not represents a file
	 *         existing in the workspace.
	 */
	public static IFile getFileFromDiagnostic(Diagnostic diagnostic) {
		return new GMFMarkerHelper(EValidator.MARKER).getFileFromDiagnostic(diagnostic);
	}
	
	/**
	 * Creates resource problem markers {@link Resource.Diagnostic} encapsualted
	 * in the given diagnostic object.
	 * 
	 * @param diagnostic
	 *            non-null diagnostic eventually containing a hiearchy of
	 *            diagnostics for which markers are to be created.
	 * 
	 * @see #getDiagnosticMarkerMap(Diagnostic)
	 * @see Resource.Diagnostic
	 */
	public static Diagnostic createResourceProblemMarkers(Diagnostic diagnostic) {
		return createMarkers(diagnostic, null /* resource problem markers*/);
	}	
	
	private static Diagnostic createMarkers(Diagnostic diagnostic, String markerID) {
		GMFMarkerHelper markerHelper = new GMFMarkerHelper(markerID);
		try {
			markerHelper.deleteMarkers(diagnostic, false, IResource.DEPTH_ZERO);
			if(!diagnostic.getChildren().isEmpty() && !isOK(diagnostic)) {
				markerHelper.createMarkers(diagnostic);
			}
		} catch (CoreException e) {
			IStatus status = Plugin.createError(Messages.ValidationHelper_e_marker_creation, e);
			Plugin.log(status);
		}
		DiagnosticMarkerMap markerMap = new DiagnosticMarkerMap(markerHelper.getDiagnostic2MarkerMap());
		
		List<Object> data = new ArrayList<Object>(diagnostic.getData() != null ? diagnostic.getData() : Collections.emptyList());
		data.add(markerMap);
		
		BasicDiagnostic result = new BasicDiagnostic(
				diagnostic.getSource(), diagnostic.getCode(),
				diagnostic.getMessage(), data.toArray());

		result.addAll(diagnostic);
		return result;
	}	
}