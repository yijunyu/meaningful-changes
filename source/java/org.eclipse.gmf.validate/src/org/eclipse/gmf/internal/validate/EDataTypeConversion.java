/*
 * Copyright (c) 2005, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *    Radek Dvorak (Borland) - initial API and implementation
 *    Artem Tikhomirov (Borland) - static-less
 */
package org.eclipse.gmf.internal.validate;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EDataTypeConversion {
	
	private final Class<?>[][] integralsToFloatsArray = new Class[][] { 
			new Class[] { Byte.class,	Float.class },
			new Class[] { Short.class, Float.class },
			new Class[] { Integer.class, Float.class },
			new Class[] { Long.class, Double.class },
			new Class[] { BigInteger.class, BigDecimal.class }
	};
	
	private final List<Class<?>> integrals = new ArrayList<Class<?>>();	

	private final List<Class<?>> floats = Arrays.asList(new Class<?>[] { 	
			Float.class, Double.class, BigDecimal.class,
	});		

	public EDataTypeConversion() {
		for (int i = 0; i < integralsToFloatsArray.length; i++) {
			integrals.add(integralsToFloatsArray[i][0]);
		}
	}
	
		
	
	public boolean isConvertable(EDataType leftDataType, EDataType rightDataType) {
		if(leftDataType == null || rightDataType == null) {
			throw new IllegalArgumentException("null data type"); //$NON-NLS-1$
		}
		if(leftDataType.getInstanceClass() == null || rightDataType.getInstanceClass() == null) {
			return false;
		}
		Class<?> leftClass = EcoreUtil.wrapperClassFor(leftDataType.getInstanceClass());
		Class<?> rightClass = EcoreUtil.wrapperClassFor(rightDataType.getInstanceClass());
		if(Number.class.isAssignableFrom(leftClass) && Number.class.isAssignableFrom(leftClass)) {
			return isConvertable(leftClass, rightClass);
		}
		return leftClass.equals(rightClass);
	}
	
	private boolean isConvertable(Class<?> left, Class<?> right) {
		if(left == null || right == null) {
			throw new IllegalArgumentException("null Class argument"); //$NON-NLS-1$
		}
		
		int leftPos = integrals.indexOf(left);
		int rightPos = integrals.indexOf(right);		
		if(leftPos >= 0) {
			if(rightPos < 0) {
				return false;
			}
		} else {
			if((leftPos = floats.indexOf(left)) >= 0) {
				// left is float
				if(rightPos >= 0) {
					// convert right int to float
					rightPos = floats.indexOf(integralsToFloatsArray[rightPos][1]);
				} else {
					if((rightPos = floats.indexOf(right)) < 0) {
						return false;
					}
				}
				return leftPos >= rightPos;				
			}			
		}
		
		return left.isAssignableFrom(right);
	}
}