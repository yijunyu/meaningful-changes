/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.gmf.internal.xpand.util;

import org.eclipse.core.filebuffers.FileBuffers;
import org.eclipse.core.filebuffers.ITextFileBuffer;
import org.eclipse.core.filebuffers.ITextFileBufferManager;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gmf.internal.xpand.Activator;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;

public class OawMarkerManager {

    private static final String getMARKER_TYPE() {
        return Activator.getId() + ".problem";
    }

    public static void addMarker(final IFile file, final AnalysationIssue issue) {
        try {
            final IMarker marker = file.createMarker(getMARKER_TYPE());
            final int severity = IMarker.SEVERITY_ERROR;
            int start = -1, end = -1;
            if (issue.getElement() != null) {
                start = issue.getElement().getStart() - 1;
                end = issue.getElement().getEnd() - 1;
            }
            internalAddMarker(file, marker, issue.getMessage(), severity, start, end);
        } catch (final CoreException e) {
        }
    }

    public static void addErrorMarker(final IFile file, final String message, final int severity, final int start,
            final int end) {
        try {
            final IMarker marker = file.createMarker(getMARKER_TYPE());
            internalAddMarker(file, marker, message, severity, start, end);
        } catch (final CoreException e) {
            Activator.log(e.getStatus());
        }
    }

    public static void addWarningMarker(final IFile file, final String message, final int severity, final int start,
            final int end) {
        try {
            final IMarker marker = file.createMarker(getMARKER_TYPE());
            internalAddMarker(file, marker, message, severity, start, end);
        } catch (final CoreException e) {
        }
    }

    private final static void internalAddMarker(final IFile file, final IMarker marker, final String message,
            final int severity, final int start, final int end) {
        try {
            file.getWorkspace().run(new IWorkspaceRunnable() {

				public void run(IProgressMonitor monitor) throws CoreException {
                    marker.setAttribute(IMarker.MESSAGE, message);
                    marker.setAttribute(IMarker.SEVERITY, severity);
                    int s = start;
                    if (start == -1) {
                        s = 1;
                    }
                    int e = end;
                    if (end <= start) {
                        e = start + 1;
                    }
                    marker.setAttribute(IMarker.CHAR_START, s);
                    marker.setAttribute(IMarker.CHAR_END, e);
                    final ITextFileBufferManager mgr = FileBuffers.getTextFileBufferManager();
                    if (mgr != null) {
                        final IPath location = file.getFullPath();
                        try {
                            mgr.connect(location, new NullProgressMonitor());
                            final ITextFileBuffer buff = mgr.getTextFileBuffer(file.getFullPath());
                            if (buff != null) {
                                final IDocument doc = buff.getDocument();
                                final int line = doc.getLineOfOffset(start);
                                if (line > 0) {
                                    marker.setAttribute(IMarker.LINE_NUMBER, doc.getLineOfOffset(start));
                                    marker.setAttribute(IMarker.LOCATION, "line: " + line);
                                }
                            }
                        } catch (BadLocationException ex) {
                        	// IGNORE
						} finally {
                            mgr.disconnect(location, new NullProgressMonitor());
                        }
                    }
                }

            }, file, 0, new NullProgressMonitor());
        } catch (final CoreException e) {
            Activator.log(e.getStatus());
        }
    }

    public static void deleteMarkers(final IResource file) {
        try {
            if (file.exists()) {
                file.getWorkspace().run(new IWorkspaceRunnable() {

                    public void run(final IProgressMonitor monitor) throws CoreException {
                        file.deleteMarkers(getMARKER_TYPE(), true, IResource.DEPTH_INFINITE);
                    }

                }, file, 0, new NullProgressMonitor());
            }
        } catch (CoreException ce) {
            Activator.log(ce.getStatus());
        }
    }
}
