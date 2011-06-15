/*
 * Copyright (c) 2006 Borland Software Corporation
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

import org.eclipse.gmf.common.codegen.ImportAssistant;

/**
 * NO-OP implementation of import assistant. Just keeps all qualified names fully-qualified.
 * @author artem
 */
public class NullImportAssistant implements ImportAssistant {
	private final String myPackageName;
	private final String myUnitName;

	
	public NullImportAssistant(String packageName, String compilationUnitName) {
		assert compilationUnitName != null && compilationUnitName.trim().length() > 0;
		myPackageName = packageName;
		myUnitName = compilationUnitName;
	}

	public String getCompilationUnitName() {
		return myUnitName;
	}

	public void emitPackageStatement(StringBuffer stringBuffer) {
		if (myPackageName == null || myPackageName.trim().length() == 0) {
			return;
		}
		stringBuffer.append("\npackage ");
		stringBuffer.append(myPackageName);
		stringBuffer.append(';');
	}

	/*
	 * NO-OP
	 */
	public void markImportLocation(StringBuffer stringBuffer) {
	}

	/*
	 * NO-OP
	 */
	public void emitSortedImports() {
	}

	/**
	 * Simply returns argument
	 * @return unmodified argument
	 */
	public String getImportedName(String qualifiedName) {
		return qualifiedName;
	}

	/*
	 * NO-OP
	 */
	public void addImport(String qualifiedName) {
	}

	/*
	 * NO-OP
	 */
	public void registerInnerClass(String innerClassName) {
	}
}
