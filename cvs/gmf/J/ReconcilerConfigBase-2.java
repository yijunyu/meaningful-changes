/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland) - initial API and implementation
 */

package org.eclipse.gmf.internal.common.reconcile;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

public class ReconcilerConfigBase implements ReconcilerConfig {
	private static final EClassRecord EMPTY_RECORD = new EClassRecord();
	private final HashMap myEClass2Record;
	
	public ReconcilerConfigBase(){
		myEClass2Record = new HashMap();
	}
	
	public final Matcher getMatcher(EClass eClass) {
		return getRecord(eClass, false).getMatcher();
	}

	public final DecisionMaker[] getDecisionMakers(EClass eClass) {
		return getRecord(eClass, false).getDecisionMakers();
	}
	
	protected final void setMatcher(EClass eClass, Matcher matcher){
		getRecord(eClass, true).setMatcher(matcher);
	}
	
	protected final void addDecisionMaker(EClass eClass, DecisionMaker decisionMaker){
		getRecord(eClass, true).addDecisionMaker(decisionMaker);
	}
	
	protected final void setMatcher(EClass eClass, EAttribute attribute){  
		checkStructuralFeature(eClass, attribute);
		Matcher matcher = new AttributeMatcher(attribute);
		setMatcher(eClass, matcher);
	}
	
	protected final void setMatcher(EClass eClass, EReference reference){
		if (eClass.getEPackage().equals(reference.eClass().getEPackage())){
			//XXX: use lazyly resolved matcher??? 
			setMatcher(eClass, new AttributeMatcher(reference));
		} else {
			setMatcher(eClass, new AttributeMatcher(reference));
		}
	}

	private EClassRecord getRecord(EClass eClass, boolean force){
		EClassRecord result = (EClassRecord) myEClass2Record.get(eClass);
		if (result == null){
			if (force){
				result = new EClassRecord();
				myEClass2Record.put(eClass, result);
			} else {
				result = EMPTY_RECORD;
			}
		}
		return result;
	}
	
	private void checkStructuralFeature(EClass expectedClass, EAttribute feature) {
		if (expectedClass.getEStructuralFeature(feature.getFeatureID()) != feature){
			throw new IllegalArgumentException(MessageFormat.format("Alien feature {0} for EClass {1}", new Object[] {feature, expectedClass}));
		}
	}

	private static class EClassRecord {
		private Matcher myMatcher = Matcher.FALSE; 
		private final List myDecisionMakers = new LinkedList();
		private DecisionMaker[] myMakersArray;
		
		public void addDecisionMaker(DecisionMaker maker){
			myDecisionMakers.add(maker);
			makersSetChanged();
		}
		
		public DecisionMaker[] getDecisionMakers(){
			if (myMakersArray == null){
				myMakersArray = (DecisionMaker[]) myDecisionMakers.toArray(new DecisionMaker[myDecisionMakers.size()]);
			}
			return myMakersArray;
		}
		
		public void setMatcher(Matcher matcher) {
			myMatcher = matcher;
		}
		
		public Matcher getMatcher() {
			return myMatcher;
		}
		
		private void makersSetChanged(){
			myMakersArray = null;
		}
	}

}
