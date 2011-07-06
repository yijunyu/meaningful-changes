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
package org.eclipse.gmf.internal.xpand.ast;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.TypeNameUtil;
import org.eclipse.gmf.internal.xpand.expression.ast.SyntaxElement;
import org.eclipse.gmf.internal.xpand.model.XpandAdvice;
import org.eclipse.gmf.internal.xpand.model.XpandDefinition;
import org.eclipse.gmf.internal.xpand.model.XpandExecutionContext;
import org.eclipse.gmf.internal.xpand.model.XpandResource;

/**
 * @author Sven Efftinge
 */
public class Template extends SyntaxElement implements XpandResource {
    private final NamespaceImport[] imports;

    private final Definition[] definitions;

    private final ImportDeclaration[] extensions;

    private final Advice[] advices;

	private String qualifiedName;

    public ImportDeclaration[] getExtensions() {
        return extensions;
    }

    public String getFullyQualifiedName() {
    	// XXX what's the reason to have both file name and qualified name?
        return qualifiedName == null ? getFileName() : qualifiedName;
    }

    public void setFullyQualifiedName(String name) {
    	qualifiedName = name;
    }

    public Template(final int start, final int end, final int line, final NamespaceImport[] imports,
            final ImportDeclaration[] extensions, final Definition[] definitions, final Advice[] advices) {
        super(start, end, line);
        this.imports = imports;
        this.extensions = extensions;
        for (Definition element : definitions) {
            element.setOwner(this);
        }
        this.definitions = definitions;
        for (Advice element : advices) {
            element.setOwner(this);
        }
        this.advices = advices;
    }

    public XpandDefinition[] getDefinitions() {
        return definitions;
    }

    public NamespaceImport[] getImports() {
        return imports;
    }

    public void analyze(XpandExecutionContext ctx, final Set<AnalysationIssue> issues) {
        ctx = (XpandExecutionContext) ctx.cloneWithResource(this);
        for (Definition element : definitions) {
            element.analyze(ctx, issues);
        }
        for (Advice element : advices) {
            element.analyze(ctx, issues);
        }
    }

    private String[] commonPrefixes = null;

    public String[] getImportedNamespaces() {
        if (commonPrefixes == null) {
            final List<String> l = new ArrayList<String>();
            // FIXME no fqn in imported ns!
            final String thisNs = TypeNameUtil.withoutLastSegment(getFullyQualifiedName());

            if (thisNs != null) {
				l.add(thisNs);
			}
            for (NamespaceImport anImport : getImports()) {
                l.add(anImport.getImportString());
            }
            commonPrefixes = l.toArray(new String[l.size()]);
        }
        return commonPrefixes;
    }

    String[] importedExtensions = null;

    public String[] getImportedExtensions() {
        if (importedExtensions == null) {
            final List<String> l = new ArrayList<String>();
            for (int i = 0; i < getExtensions().length; i++) {
                final ImportDeclaration anImport = getExtensions()[i];
                l.add(anImport.getImportString().getValue());
            }
            importedExtensions = l.toArray(new String[l.size()]);
        }
        return importedExtensions;
    }

    public XpandAdvice[] getAdvices() {
        return advices;
    }

}
