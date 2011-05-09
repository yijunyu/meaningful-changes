/*
 * Copyright (c) 2005 Borland Software Corporation
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

import java.util.Iterator;

import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.gmf.common.codegen.ImportAssistant;

/**
 * Copy of GenModelImpl functionality
 */
public class ImportUtil implements ImportAssistant {
	private final ImportManager myImportManager;
	private final String myPackageName;
	private final String myUnitName;

	private StringBuffer importStringBuffer;

	private int importInsertionPoint;

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
		for (Iterator iter = myImportManager.getImports().iterator(); iter.hasNext();) {
			String importName = (String) iter.next();
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
		int index = qualifiedName.indexOf("$");
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
