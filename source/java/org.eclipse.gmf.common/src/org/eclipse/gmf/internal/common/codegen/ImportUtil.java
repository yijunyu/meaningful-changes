/*
 * Copyright (c) 2005, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.common.codegen;

import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.gmf.common.codegen.ImportAssistant;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;

/**
 * Copy of GenModelImpl functionality
 */
public class ImportUtil implements ImportAssistant {
	private final ImportManager myImportManager;
	private final String myPackageName;
	private final String myUnitName;

	private StringBuffer importStringBuffer;

	private int importInsertionPoint;

	public ImportUtil(String compilationUnitPackage, String compilationUnitName, IPackageFragmentRoot sourceRoot) {
		this(compilationUnitPackage, compilationUnitName);
		if (sourceRoot != null) {
			ICompilationUnit existingCU = sourceRoot.getPackageFragment(compilationUnitPackage).getCompilationUnit(compilationUnitName + ".java");	//$NON-NLS-1$
			if (existingCU.exists()) {
				try {
					myImportManager.addCompilationUnitImports(existingCU.getSource());
				} catch (JavaModelException e) {
					//Ignore. The compilation unit imports will not be added, but we may proceed.
				}
			}
		}
	}

	public ImportUtil(String compilationUnitPackage, String compilationUnitName) {
		assert compilationUnitName != null && compilationUnitName.trim().length() > 0;
		myImportManager = new ImportManager(compilationUnitPackage);
		// although addMasterImport implementation doesn't handle no package case correctly
		// it makes no difference to us as we just need to mark CU name as occupied
		myImportManager.addMasterImport(compilationUnitPackage == null ? "" : compilationUnitPackage, compilationUnitName);
		myPackageName = compilationUnitPackage;
		myUnitName = compilationUnitName;
	}

	public void emitPackageStatement(StringBuffer stringBuffer) {
		if (myPackageName == null || myPackageName.trim().length() == 0) {
			return;
		}
		stringBuffer.append("\npackage ");
		stringBuffer.append(myPackageName);
		stringBuffer.append(';');
	}

	public String getCompilationUnitName() {
		return myUnitName;
	}

	public void markImportLocation(StringBuffer stringBuffer, GenPackage genPackage) {
		markImportLocation(stringBuffer);
		myImportManager.addJavaLangImports(genPackage.getJavaLangConflicts());
	}

	public void markImportLocation(StringBuffer stringBuffer) {
		importStringBuffer = stringBuffer;
		importInsertionPoint = stringBuffer.length();
		myImportManager.addCompilationUnitImports(stringBuffer.toString());
	}

	public void emitSortedImports() {
		String NL = System.getProperties().getProperty("line.separator");
		StringBuffer importsBuf = new StringBuffer();

		String previousPackageName = null;
		for (String importName : myImportManager.getImports()) {
			int index = importName.lastIndexOf(".");
			if (index != -1) {
				String packageName = importName.substring(0, index);
				if (previousPackageName != null && !previousPackageName.equals(packageName)) {
					importsBuf.append(NL);
				}
				previousPackageName = packageName;
			}
			importsBuf.append(NL + "import " + importName + ";");
		}

		importStringBuffer.insert(importInsertionPoint, importsBuf.toString());
	}

	// one from GenModelImpl
	public String getImportedName(String qualifiedName) {
		if (qualifiedName.equals(CodeGenUtil.getSimpleClassName(qualifiedName))){
			// initially a HACK for inner ScalablePolygon, though makes sense regardless of that -
			// there's no sense to import classes from default package
			return qualifiedName;
		}
		
	    int index = qualifiedName.indexOf("<");
	    if (index >= 0) {
			String baseName = qualifiedName.substring(0, index);
			StringBuilder result = new StringBuilder(getImportedName(baseName));
			result.append("<");
			for (int start = ++index, end = qualifiedName.lastIndexOf(">") + 1; index < end; ++index) {
				char character = qualifiedName.charAt(index);
				switch (character) {
				case ' ':
				case ',':
				case '<':
				case '>':
				case '&': {
					if (start != index) {
						String segment = qualifiedName.substring(start, index);
						result.append(getImportedName(segment));
					}
					result.append(character);
					start = index + 1;
					break;
				}
				default: {
					break;
				}
				}
			}
			return result.toString();
		}
		
		index = qualifiedName.indexOf("$");
		myImportManager.addImport(index == -1 ? qualifiedName : qualifiedName.substring(0, index));
		return myImportManager.getImportedName(qualifiedName);
	}

	public void addImport(String qualifiedName) {
		myImportManager.addImport(qualifiedName);
	}

	public void registerInnerClass(String innerClassName) {
		myImportManager.addPseudoImport(innerClassName);
	}

	public void addImport(String packageName, String shortName) {
		myImportManager.addImport(packageName, shortName);
	}
}
