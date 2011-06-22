/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Anna Karjakina (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.common.codegen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.gmf.internal.common.Activator;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.compiler.IProblem;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.rewrite.ImportRewrite;
import org.eclipse.jdt.ui.PreferenceConstants;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEdit;

public class OrganizeImportsPostprocessor {
	private final boolean myRestoreExistingImports;

	public OrganizeImportsPostprocessor() {
		this(true);
	}

	/**
	 * @param restoreExistingImports
	 *            specifies if the existing imports should be kept or removed,
	 *            see {@link ImportRewrite#create(CompilationUnit, boolean)} for
	 *            details.
	 */
	public OrganizeImportsPostprocessor(boolean restoreExistingImports) {
		myRestoreExistingImports = restoreExistingImports;
	}

	/**
	 * Organizes qualified names in document.
	 * <p>
	 * Traverses the ast tree and extracts any full qualified names to be import
	 * statements, with respect to the name conflicts possible.
	 * </p>
	 * <p>
	 * Afterwards these imports are organized with the help of
	 * {@link ImportRewrite} manager.
	 * </p>
	 * <p>
	 * Changes are applied directly to the given ICompilationUnit's buffer,
	 * using code formatting settings as specified in the JDT UI preferences.
	 * Saving of the unit is left for the user consideration.
	 * </p>
	 * 
	 * @param icu
	 *            the compilation unit containing <b>valid</b> code
	 * @param declaredImportsAsStrings
	 *            imports added in previous file revision (default is null)
	 * @param monitor
	 *            the progress monitor used to report progress and request
	 *            cancelation, or <code>null</code> if none
	 * 
	 * @throws CoreException
	 *             the exception is thrown if the rewrite fails.
	 * 
	 * @see ImportRewrite
	 */
	public void organizeImports(ICompilationUnit icu, IProgressMonitor progress) throws CoreException {
		organizeImports(icu, null, progress);
	}

	public void organizeImports(ICompilationUnit icu, String[] declaredImportsAsStrings, IProgressMonitor progress) throws CoreException {
		IDocument document = new Document(icu.getBuffer().getContents());

		ASTParser parser = ASTParser.newParser(AST.JLS3);
		parser.setSource(icu);
		CompilationUnit cu = (CompilationUnit) parser.createAST(progress);

		TextEdit importsEdit = organizeImports(cu, declaredImportsAsStrings, progress);

		try {
			importsEdit.apply(document);
		} catch (BadLocationException e) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.getID(), 0, "Unable to apply imports text changes", e));
		} catch (MalformedTreeException ex) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.getID(), 0, "Unable to apply imports text changes", ex));
		}
		icu.getBuffer().setContents(document.get());
	}

	/**
	 * Organizes qualified names in document.
	 * <p>
	 * Traverses the ast tree and extracts any full qualified names to be import
	 * statements, with respect to the name conflicts possible.
	 * </p>
	 * <p>
	 * Afterwards these imports are organized with the help of
	 * {@link ImportRewrite} manager.
	 * </p>
	 * 
	 * @param astRoot
	 *            the parsed traversable ast tree, should contain no errors
	 * @param declaredImports
	 *            imports added in previous file revision (default is null)
	 * @param monitor
	 *            the progress monitor used to report progress and request
	 *            cancelation, or <code>null</code> if none
	 * 
	 * @return text edit object describing the changes to the document
	 *         corresponding to the changes recorded by rewriter
	 * 
	 * @throws CoreException
	 *             the exception is thrown if the rewrite fails.
	 * 
	 * @see ImportRewrite
	 */
	public TextEdit organizeImports(CompilationUnit astRoot, IProgressMonitor progress) throws CoreException {
		return organizeImports(astRoot, null, progress);
	}

	public TextEdit organizeImports(CompilationUnit astRoot, String[] declaredImports, IProgressMonitor progress) throws CoreException {
		MultiTextEdit result = new MultiTextEdit();

		HashSet<String> oldSingleImports = new HashSet<String>();
		HashSet<String> oldDemandImports = new HashSet<String>();

		@SuppressWarnings("unchecked")
		final List<ImportDeclaration> importDeclarations = astRoot.imports();
		String[] customImports = substract(declaredImports, importDeclarations);
		if (isDebug()) {
			collectExistingImports(astRoot, oldSingleImports, oldDemandImports, customImports);
		}

		if (!checkForNoSyntaxErrors(astRoot)) {
			String location = astRoot.getJavaElement() == null ? "<undefined>" : astRoot.getJavaElement().getElementName();
			throw new CoreException(new Status(IStatus.ERROR, Activator.getID(), 0, Messages.bind(Messages.organizeImportsFail, location), null));
		}

		ArrayList<Name> qualifiedTypeReferences = new ArrayList<Name>();
		ArrayList<SimpleName> simpleTypeReferences = new ArrayList<SimpleName>();
		ArrayList<String> importsAdded = new ArrayList<String>();

		PackageReferencesCollector.collect(astRoot, qualifiedTypeReferences, simpleTypeReferences, importsAdded);

		ImportRewrite importRewrite = createImportRewrite(astRoot);
		copyImports(importRewrite, customImports);
		ImportRewrite.ImportRewriteContext context = new ReferencedTypesAwareImportRewriteContext(simpleTypeReferences, importRewrite);

		Iterator<Name> refIterator = qualifiedTypeReferences.iterator();
		while (refIterator.hasNext()) {
			Name typeRef = refIterator.next();
			if (typeRef.isQualifiedName()) {
				QualifiedName qualifiedName = (QualifiedName) typeRef;
				SimpleName simpleName = qualifiedName.getName();
				boolean added = addImport(simpleName.getIdentifier(), qualifiedName.getFullyQualifiedName(), importRewrite, context, importsAdded);
				if (added) {
					Name qualifier = qualifiedName.getQualifier();
					int qualifierStart = qualifier.getStartPosition();
					int simpleNameStart = simpleName.getStartPosition();
					try {
						result.addChild(new ReplaceEdit(qualifierStart, simpleNameStart - qualifierStart, ""));
					} catch (MalformedTreeException e) {
						throw new CoreException(new Status(IStatus.ERROR, Activator.getID(), 0, "Unable to produce correct text changes for replacing full name: " + qualifiedName, e));
					}
				}
			} else {
				SimpleName simpleName = (SimpleName) typeRef;
				addImport(simpleName.getIdentifier(), simpleName.getFullyQualifiedName(), importRewrite, context, importsAdded);
			}
		}

		TextEdit edit = importRewrite.rewriteImports(progress);
		try {
			result.addChild(edit);
		} catch (MalformedTreeException e) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.getID(), 0, "Text changes conflict while organizing imports", e));
		}

		if (isDebug()) {
			determineImportDifferences(importRewrite, oldSingleImports, oldDemandImports);
		}

		return result;
	}

	/*
	 * Since we do organizeImports prior to merge, we must ensure imports added
	 * manually are known to OrganizeImportsProcessor
	 */
	private static void copyImports(ImportRewrite importRewrite, String[] importsToCopy) {
		if (importsToCopy == null || importsToCopy.length == 0) {
			return;
		}
		for (int i = 0; i < importsToCopy.length; i++) {
			importRewrite.addImport(importsToCopy[i]);
		}
	}

	private String[] substract(String[] declaredImports, List<ImportDeclaration> list) {
		if (declaredImports == null || declaredImports.length == 0) {
			return declaredImports;
		}
		ArrayList<String> result = new ArrayList<String>(Arrays.asList(declaredImports));
		for (int i = 0; i < list.size(); i++) {
			result.remove(list.get(i).getName().getFullyQualifiedName());
		}
		return result.toArray(new String[result.size()]);
	}

	private boolean addImport(String typeName, String fullName, ImportRewrite importRewrite, ImportRewrite.ImportRewriteContext context, Collection<String> importsAdded) {
		boolean resultIsOk = importRewrite.addImport(fullName, context).equals(typeName);
		if (resultIsOk && !importsAdded.contains(fullName)) {
			importsAdded.add(fullName);
		}
		return resultIsOk;
	}

	private void collectExistingImports(CompilationUnit astRoot, Set<String> oldSingleImports, Set<String> oldDemandImports, String[] declaredImports) {
		if (declaredImports != null && declaredImports.length > 0) {
			for (int i = 0; i < declaredImports.length; i++) {
				String curr = declaredImports[i];
				if (curr.endsWith("*")) {
					oldDemandImports.add(curr);
				} else {
					oldSingleImports.add(curr);
				}
			}
		}
		@SuppressWarnings("unchecked")
		final List<ImportDeclaration> imports = astRoot.imports();
		for (int i = 0; i < imports.size(); i++) {
			ImportDeclaration curr = imports.get(i);
			String id = curr.getName().getFullyQualifiedName();
			if (curr.isOnDemand()) {
				oldDemandImports.add(id);
			} else {
				oldSingleImports.add(id);
			}
		}
	}

	private boolean checkForNoSyntaxErrors(CompilationUnit astRoot) {
		IProblem[] problems = astRoot.getProblems();
		for (int i = 0; i < problems.length; i++) {
			IProblem curr = problems[i];
			if (curr.isError() && (curr.getID() & IProblem.Syntax) != 0) {
				return false;
			}
		}
		return true;
	}

	private class ReferencedTypesAwareImportRewriteContext extends ImportRewrite.ImportRewriteContext {
		private Collection<SimpleName> mySimpleTypesReferenced;

		private ImportRewrite myImportRewrite;

		public ReferencedTypesAwareImportRewriteContext(Collection<SimpleName> simpleTypesReferenced, ImportRewrite importRewrite) {
			mySimpleTypesReferenced = simpleTypesReferenced;
			myImportRewrite = importRewrite;
		}

		public int findInContext(String qualifier, String name, int kind) {
			int result = myImportRewrite.getDefaultImportRewriteContext().findInContext(qualifier, name, kind);
			if (result == RES_NAME_UNKNOWN) {
				for (Iterator<SimpleName> it = mySimpleTypesReferenced.iterator(); it.hasNext();) {
					SimpleName next = it.next();
					if (name.equals(next.getIdentifier())) {
						return RES_NAME_CONFLICT;
					}
				}
			}
			return result;
		}
	};

	/**
	 * Returns a {@link ImportRewrite} using
	 * {@link ImportRewrite#create(CompilationUnit, boolean)} and configures the
	 * rewriter with the settings as specified in the JDT UI preferences.
	 * 
	 * @param astRoot
	 *            the AST root to create the rewriter on
	 * @return the new rewriter configured with the settings as specified in the
	 *         JDT UI preferences.
	 * 
	 * @see ImportRewrite#create(CompilationUnit, boolean)
	 */
	public ImportRewrite createImportRewrite(CompilationUnit astRoot) {
		return configureImportRewrite(ImportRewrite.create(astRoot, myRestoreExistingImports));
	}

	private static ImportRewrite configureImportRewrite(ImportRewrite rewrite) {
		IJavaProject project = rewrite.getCompilationUnit().getJavaProject();
		String order = PreferenceConstants.getPreference(PreferenceConstants.ORGIMPORTS_IMPORTORDER, project);
		rewrite.setImportOrder(order.split(";", 0)); //$NON-NLS-1$

		String thres = PreferenceConstants.getPreference(PreferenceConstants.ORGIMPORTS_ONDEMANDTHRESHOLD, project);
		try {
			int num = Integer.parseInt(thres);
			if (num == 0) {
				num = 1;
			}
			rewrite.setOnDemandImportThreshold(num);
		} catch (NumberFormatException e) {
			// ignore
		}
		String thresStatic = PreferenceConstants.getPreference(PreferenceConstants.ORGIMPORTS_STATIC_ONDEMANDTHRESHOLD, project);
		try {
			int num = Integer.parseInt(thresStatic);
			if (num == 0) {
				num = 1;
			}
			rewrite.setStaticOnDemandImportThreshold(num);
		} catch (NumberFormatException e) {
			// ignore
		}
		return rewrite;
	}

	private void determineImportDifferences(ImportRewrite importsStructure, Set<String> oldSingleImports, Set<String> oldDemandImports) {
		ArrayList<String> importsAdded = new ArrayList<String>();
		importsAdded.addAll(Arrays.asList(importsStructure.getCreatedImports()));
		importsAdded.addAll(Arrays.asList(importsStructure.getCreatedStaticImports()));
		Object[] content = oldSingleImports.toArray();
		for (int i = 0; i < content.length; i++) {
			String importName = (String) content[i];
			if (importsAdded.remove(importName)) {
				oldSingleImports.remove(importName);
			}
		}
		content = oldDemandImports.toArray();
		for (int i = 0; i < content.length; i++) {
			String importName = (String) content[i];
			if (importsAdded.remove(importName + ".*")) { //$NON-NLS-1$
				oldDemandImports.remove(importName);
			}
		}
		int fNumberOfImportsAdded = importsAdded.size();
		int fNumberOfImportsRemoved = oldSingleImports.size() + oldDemandImports.size();
		Activator.log(new Status(IStatus.INFO, Activator.getID(), 0, "[imports added]: " + fNumberOfImportsAdded, null));
		Activator.log(new Status(IStatus.INFO, Activator.getID(), 0, "[imports removed]: " + fNumberOfImportsRemoved, null));
	}

	private static boolean isDebug() {
		return Boolean.parseBoolean(Platform.getDebugOption(Activator.getID() + "/debug/organizeImports"));//$NON-NLS-1$
	}
}
