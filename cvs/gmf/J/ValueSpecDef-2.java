/*
 * Copyright (c) 2005 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *    Radek Dvorak (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.validate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.internal.validate.IDefElementProvider.StringValProvider;
import org.eclipse.gmf.internal.validate.IDefElementProvider.TypeProvider;


public class ValueSpecDef {
	private StringValProvider body;
	private StringValProvider lang;
	private TypeProvider type;
	
	
	public ValueSpecDef(StringValProvider body, StringValProvider lang) {
		if(body == null) {
			throw new IllegalArgumentException();
		}
		this.body = body;
		this.lang = lang;
	}	
		
	public ValueSpecDef(StringValProvider body, StringValProvider lang, TypeProvider typeRestriction) {
		this(body, lang);
		this.type = typeRestriction;
	}
	
	public boolean isOK() {
		return body.getStatus().isOK() && 
			(lang == null || lang.getStatus().isOK()) &&
			(type == null || type.getStatus().isOK());
	}
	
	public TypeProvider getTypeRestriction() {
		return type;
	}
	
	public String createBody(EObject contextInstance) {
		return body.getValue(contextInstance);
	}
	
	public String createLanguage(EObject contextInstance) {
		if(lang == null) {
			return Annotations.OCL_KEY;
		}
		return lang.getValue(contextInstance);
	}
				
	public StringValProvider getBody() {
		return body;
	}
	
	public StringValProvider getLang() {
		return lang;
	}
	
	public String getLabel() {
		return Messages.def_ValueSpecDefLabel;
	}
	
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("body: ").append(body); //$NON-NLS-1$		
		buf.append(" lang: ").append(lang); //$NON-NLS-1$		
		return buf.toString();
	}
}