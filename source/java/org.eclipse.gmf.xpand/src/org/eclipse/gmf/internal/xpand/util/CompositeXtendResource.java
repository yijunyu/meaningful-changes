/**
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bblajer - initial API and implementation
 */
package org.eclipse.gmf.internal.xpand.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.internal.xpand.ResourceManager;
import org.eclipse.gmf.internal.xpand.expression.AnalysationIssue;
import org.eclipse.gmf.internal.xpand.expression.ExecutionContext;
import org.eclipse.gmf.internal.xpand.xtend.ast.Extension;
import org.eclipse.gmf.internal.xpand.xtend.ast.XtendResource;

/**
 * Composes several Xtend ast trees to produce a single resource. Extensions are merged:
 * if extensions with same signatures are found, the one that comes first (i.e., from a more recent source) wins.
 */
class CompositeXtendResource implements XtendResource {
	private final XtendResource[] myResources;
	private final List<Extension> myCachedExtensions;

	public CompositeXtendResource(ResourceManager manager, XtendResource[] resources) {
		myResources = resources;
		myCachedExtensions = new ArrayList<Extension>();
		HashSet<DefinitionSignature> signatures = new HashSet<DefinitionSignature>();
		ExecutionContext context = ContextFactory.createXtendContext(manager);
		for (XtendResource nextResource : myResources) {
			mergeExtensions(context, nextResource.getExtensions(), myCachedExtensions, signatures);
		}
	}

	private void mergeExtensions(ExecutionContext context, List<Extension> extensions, List<Extension> collector, Set<DefinitionSignature> usedSignatures) {
		for (Extension nextExtension : extensions) {
			if (context.currentResource() != nextExtension.getExtensionFile()) {
				context = context.cloneWithResource(nextExtension.getExtensionFile());
			}
			DefinitionSignature signature = DefinitionSignature.create(context, nextExtension);
			if (signature == null || usedSignatures.contains(signature)) {
				continue;
			}
			usedSignatures.add(signature);
			collector.add(nextExtension);
		}
	}

	public void analyze(ExecutionContext ctx, Set<AnalysationIssue> issues) {
		for (XtendResource nextResource : myResources) {
			nextResource.analyze(ctx, issues);
		}
	}

	public List<Extension> getExtensions() {
		return myCachedExtensions;
	}

	public String[] getImportedExtensions() {
		final List<String> result= new ArrayList<String>();
        for (XtendResource nextResource : myResources) {
        	result.addAll(Arrays.asList(nextResource.getImportedExtensions()));
        }
		return result.toArray(new String[result.size()]);
	}

	public String[] getImportedNamespaces() {
		final List<String> result= new ArrayList<String>();
        for (XtendResource nextResource : myResources) {
        	result.addAll(Arrays.asList(nextResource.getImportedNamespaces()));
        }
		return result.toArray(new String[result.size()]);
	}

	public List<Extension> getPublicExtensions(ResourceManager resourceManager) {
        List<Extension> publicExtensions = new ArrayList<Extension>();
		HashSet<DefinitionSignature> signatures = new HashSet<DefinitionSignature>();
		ExecutionContext context = ContextFactory.createXtendContext(resourceManager);
        for (XtendResource nextResource : myResources) {
        	mergeExtensions(context, nextResource.getPublicExtensions(resourceManager), publicExtensions, signatures);
        }
		return publicExtensions;
	}

}
