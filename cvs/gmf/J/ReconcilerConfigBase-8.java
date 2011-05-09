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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class ReconcilerConfigBase implements ReconcilerConfig {
	private static final EClassRecord EMPTY_RECORD = new EClassRecord();
	private final HashMap<EClass, EClassRecord> myEClass2Record;
	private final HashMap<EClass, EClassRecord> myAbstractEClass2SubclassesRecord;
	
	public ReconcilerConfigBase(){
		myEClass2Record = new HashMap<EClass, EClassRecord>();
		myAbstractEClass2SubclassesRecord = new HashMap<EClass, EClassRecord>();
	}
	
	public final Matcher getMatcher(EClass eClass) {
		return getRecord(eClass, false).getMatcher();
	}

	public Copier getCopier(EClass eClass) {
		return getRecord(eClass, false).getCopier();
	}
	
	public final DecisionMaker[] getDecisionMakers(EClass eClass) {
		return getRecord(eClass, false).getDecisionMakers();
	}
	
	protected final void setMatcher(EClass eClass, Matcher matcher){
		getRecord(eClass, true).setMatcher(matcher);
	}
	
	protected final void setCopier(EClass eClass, Copier copier){
		getRecord(eClass, true).setCopier(copier);
	}
	
	protected final void setMatcherForAllSubclasses(EClass eClass, Matcher matcher){
		if (!eClass.isAbstract()){
			throw new IllegalArgumentException(
					"This is not safe method that may lead to strange behaviour in case of multiple inheritance. " +
					"We tried to limit its usage as much as possible");
		}
		getTemplateRecord(eClass, true).setMatcher(matcher);
	}
	
	protected final void addDecisionMaker(EClass eClass, DecisionMaker decisionMaker){
		getRecord(eClass, true).addDecisionMaker(decisionMaker);
	}
	
	protected final void setMatcher(EClass eClass, EAttribute attribute){  
		checkStructuralFeature(eClass, attribute);
		Matcher matcher = new ReflectiveMatcher(attribute);
		setMatcher(eClass, matcher);
	}
	
	protected final void setMatcher(EClass eClass, EReference reference){
		if (eClass.getEPackage().equals(reference.eClass().getEPackage())){
			//XXX: use lazyly resolved matcher??? 
			setMatcher(eClass, new ReflectiveMatcher(reference));
		} else {
			setMatcher(eClass, new ReflectiveMatcher(reference));
		}
	}

	private EClassRecord getRecord(EClass eClass, boolean force){
		EClassRecord result = myEClass2Record.get(eClass);
		if (result == null){
			if (force){
				result = new EClassRecord();
				myEClass2Record.put(eClass, result);
			} else {
				result = EMPTY_RECORD;
				for (Iterator<EClass> superClasses = eClass.getEAllSuperTypes().iterator(); result == EMPTY_RECORD && superClasses.hasNext();){
					EClass nextSuper = superClasses.next();
					if (nextSuper.isAbstract()) {
						result = getTemplateRecord(nextSuper, false);
					}
				}
				if (result != EMPTY_RECORD){
					//cache it for the next time
					myEClass2Record.put(eClass, result);
				}
			}
		}
		return result;
	}
	
	private EClassRecord getTemplateRecord(EClass abstractSuperClass, boolean force){
		assert abstractSuperClass.isAbstract();
		EClassRecord result = myAbstractEClass2SubclassesRecord.get(abstractSuperClass);
		if (result == null && force){
			result = new EClassRecord();
			myAbstractEClass2SubclassesRecord.put(abstractSuperClass, result);
		}
		return result == null ? EMPTY_RECORD : result;
	}
	
	private void checkStructuralFeature(EClass expectedClass, EAttribute feature) {
		if (expectedClass.getEStructuralFeature(feature.getFeatureID()) != feature){
			throw new IllegalArgumentException(MessageFormat.format("Alien feature {0} for EClass {1}", new Object[] {feature, expectedClass}));
		}
	}
	
	protected static final Matcher ALWAYS_MATCH = new Matcher(){
		public boolean match(EObject current, EObject old) {
			return current.eClass().equals(old.eClass());
		}
	};

	private static class EClassRecord {
		private Matcher myMatcher = Matcher.FALSE; 
		private Copier myCopier = Copier.NEVER_COPY;
		private final List<DecisionMaker> myDecisionMakers = new LinkedList<DecisionMaker>();
		private DecisionMaker[] myMakersArray;
		
		public void addDecisionMaker(DecisionMaker maker){
			myDecisionMakers.add(maker);
			makersSetChanged();
		}
		
		public void setCopier(Copier copier) {
			myCopier = copier;
		}

		public DecisionMaker[] getDecisionMakers(){
			if (myMakersArray == null){
				myMakersArray = myDecisionMakers.toArray(new DecisionMaker[myDecisionMakers.size()]);
			}
			return myMakersArray;
		}
		
		public void setMatcher(Matcher matcher) {
			myMatcher = matcher;
		}
		
		public Matcher getMatcher() {
			return myMatcher;
		}
		
		public Copier getCopier() {
			return myCopier;
		}
		
		private void makersSetChanged(){
			myMakersArray = null;
		}
	}

}
