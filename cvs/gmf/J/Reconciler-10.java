/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
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

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class Reconciler {
	private final ReconcilerConfig myConfig;

	private final MatchingSession myMatchingSession;

	public Reconciler(ReconcilerConfig config){
		myConfig = config;
		myMatchingSession = new MatchingSession();
	}
	
	protected void handleNotMatchedCurrent(EObject current){
		//FIXME ??? Is it user escape -- check history ???
		//FIXME How to handle not macthed old ???
		/*
		 * [AS]: inversed constructor parameter was added to DefaultDecision, so
		 * it looks like a way to remove genmodel nodes removed by user.
		 */
	}
	
	protected EObject handleNotMatchedOld(EObject currentParent, EObject notMatchedOld) {
		Copier copier = myConfig.getCopier(notMatchedOld.eClass());
		return copier.copyToCurrent(currentParent, notMatchedOld);
	}

	public void reconcileResource(Resource current, Resource old){
		reconcileContents(null, current.getContents(), old.getContents());
	}
	
	public void reconcileTree(EObject currentRoot, EObject oldRoot){
		reconcileVertex(currentRoot, oldRoot);
		reconcileContents(currentRoot, currentRoot.eContents(), oldRoot.eContents());
	}
	
	private void reconcileVertex(EObject current, EObject old){
		assert current.eClass().equals(old.eClass());
		for (Decision decision : myConfig.getDecisions(current.eClass())){
			decision.apply(current, old);
		}
	}
	
	private void reconcileContents(EObject currentParent, Collection<EObject> allCurrents, Collection<EObject> allOlds){
		if (allCurrents.isEmpty() && allOlds.isEmpty()){
			return;
		}
		final List<Pair> storage = new LinkedList<Pair>();
		myMatchingSession.match(allCurrents, allOlds, storage);
		
		for (Pair next : storage){
			EObject nextCurrent = next.current;
			EObject nextOld = next.old;
			assert (nextCurrent != null || nextOld != null);
			
			if (nextCurrent == null){
				if (currentParent != null){ //never copy top-level resource contents
					nextCurrent = handleNotMatchedOld(currentParent, nextOld);
				} 
			}

			if (nextCurrent != null && nextOld != null){
				reconcileTree(nextCurrent, nextOld);
			} else if (nextOld == null){
				handleNotMatchedCurrent(nextCurrent);
			}
		}
	}
	
	private static class Pair {
		public EObject current;
		public EObject old;
	}
	
	private class MatchingSession {
		private boolean myIsMatching;
		
		public MatchingSession(){
		}
		
		public void match(Collection<EObject> currents, Collection<EObject> olds, Collection<Pair> output){
			assert !myIsMatching;
			
			final Collection<EObject> myOlds;
			final Collection<EObject> myCurrents;
			try {
				myIsMatching = true;

				myOlds = new LinkedHashSet<EObject>(olds);
				myCurrents = new LinkedList<EObject>(currents);

				for (Iterator<EObject> currentContents = myCurrents.iterator(); !myOlds.isEmpty() && currentContents.hasNext();){
					EObject nextCurrent = currentContents.next();
					Pair nextPair = acquirePair();
					nextPair.current = nextCurrent;
					nextPair.old = removeMatched(nextCurrent, myOlds);
					output.add(nextPair);
					currentContents.remove();
				}
				
				for (Iterator<EObject> notMatchedOlds = myOlds.iterator(); notMatchedOlds.hasNext();){
					Pair nextPair = acquirePair();
					nextPair.current = null;
					nextPair.old = notMatchedOlds.next();
					output.add(nextPair);
				}
			} finally {
				myIsMatching = false;
			}
		}
		
		private EObject removeMatched(EObject current, Collection<EObject> allOld){
			EClass eClass = current.eClass();
			Matcher matcher = myConfig.getMatcher(eClass);
			EObject result = null;
			if (matcher != Matcher.FALSE){
				for (Iterator<EObject> all = allOld.iterator(); all.hasNext();){
					EObject next = all.next();
					if (eClass.equals(next.eClass()) && matcher.match(current, next)){
						result = next;
						all.remove();
						break;
					}
				}
			}
			return result;
		}

		private Pair acquirePair(){
			return new Pair();
		}
	}
}
