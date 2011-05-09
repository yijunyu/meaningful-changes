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
package org.eclipse.gmf.internal.xpand.xtend.ast;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.internal.xpand.ResourceManager;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.expression.ast.SyntaxElement;

public class ExtensionFile extends SyntaxElement implements XtendResource {

    private List<ImportStatement> nsImports;

    private List<ImportStatement> extImports;

    private List<Extension> extensions;

    @SuppressWarnings("unchecked")
	public ExtensionFile(final int start, final int end, final int line, final List<? extends SyntaxElement> nsImports, final List<? extends SyntaxElement> extImports,
            final List<? extends SyntaxElement> extensions) {
        super(start, end, line);
        this.nsImports = (List<ImportStatement>) nsImports;
        this.extImports = (List<ImportStatement>) extImports;
        this.extensions = (List<Extension>) extensions;
        for (Extension ext: this.extensions) {
            ext.setExtensionFile(this);
        }
    }

    public List<Extension> getExtensions() {
        return extensions;
    }

    public List<ImportStatement> getExtImports() {
        return extImports;
    }

    public List<ImportStatement> getNsImports() {
        return nsImports;
    }

    public String[] getImportedNamespaces() {
        final List<String> namespaces = new ArrayList<String>(getNsImports().size());
        for (ImportStatement nsImport : getNsImports()) {
            namespaces.add(nsImport.getValue());
        }
        return namespaces.toArray(new String[namespaces.size()]);
    }

    public String[] getImportedExtensions() {
        final List<String> result = new ArrayList<String>(getExtImports().size());
        for (ImportStatement nsImport : getExtImports()) {
            result.add(nsImport.getValue());
        }
        return result.toArray(new String[result.size()]);
    }

    public void analyze(ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        ctx = ctx.cloneWithResource(this);
        for (Extension ext : getExtensions()) {
            ext.analyze(ctx, issues);
        }
    }

    private String fullyQualifiedName;

    public void setFullyQualifiedName(final String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    /**
     * XXX who cares?
     */
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    public List<Extension> getPublicExtensions(ResourceManager rm) {
        final List<Extension> result = new ArrayList<Extension>();
        for (Extension element : getExtensions()) {
            if (!element.isPrivate()) {
                result.add(element);
            }
        }
        for (ImportStatement imp  : getExtImports()) {
            if (imp.isExported()) {
                final XtendResource xf = rm.loadXtendResource(imp.getImportedId().getValue());
                result.addAll(xf.getPublicExtensions(rm));
            }
        }
        return result;
    }
}
