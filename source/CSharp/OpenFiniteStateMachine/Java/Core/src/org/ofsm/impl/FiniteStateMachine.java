/*
 * Copyright 2006 Abdulla G. Abdurakhmanov (abdulla.abdurakhmanov@gmail.com).
 * 
 * Licensed under the LGPL, Version 2 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.gnu.org/copyleft/lgpl.html
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * With any your questions welcome to my e-mail 
 * or blog at http://abdulla-a.blogspot.com.
 */

package org.ofsm.impl;

import java.io.IOException;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;

import org.ofsm.*;
import java.util.concurrent.*;

public class FiniteStateMachine implements IFiniteStateMachine {
    private final String machineName = "Default";
    
    protected Map<String,IStateTransition> transitions = new ConcurrentHashMap<String,IStateTransition>();
    protected IState currentState , initialState;

    protected String generateKey(String eventName, IState state) {
        return eventName+"/"+state.getName();
    }

    protected String generateKey(IEvent event, IState state) {
        return generateKey(event.getName(),state);
    }

    
    protected String generateKey(IStateTransition transition) {
        return generateKey(transition.getEvent(),transition.getFromState());
    }

    public IState fireEvent(IEvent event) {
        return fireEvent(event.getName());
    }
    
    public IState fireEvent(String eventName) {
        if(currentState == null)
            return null;
        else {
            IStateTransition transition = transitions.get(generateKey(eventName,currentState));
            if(transition!=null) {
                if(transition.fireStateChangingEvent()) {
                    currentState = transition.getToState();
                    transition.fireStateChangedEvent();
                }
                return currentState;
            }
            else {
                currentState = null;
                return null;
            }
        }        
    }
    
    public IState getCurrentState() {
        return currentState;
    }
    
    public void setCurrentState(IState state) {
        currentState = state;
    }
    
    public void setInitialState(IState state) {
        initialState = state;
        if(getCurrentState()==null) {
            setCurrentState(initialState);
        }
    }
    
    public IState getInitialState() {
        return this.initialState;
    }
    

    public void addTransition(IStateTransition transition) {
        transitions.put(generateKey(transition),transition);
    }

    public void delTranstition(IStateTransition transition) {
        transitions.remove(generateKey(transition));
    }

    public void addStateChangeListener(IStateChangeListener listener) {
        for(Map.Entry<String,IStateTransition> item:transitions.entrySet()) {
            item.getValue().addStateChangeListener(listener);
        }
    }

    public void delStateChangeListener(IStateChangeListener listener) {
        for(Map.Entry<String,IStateTransition> item:transitions.entrySet()) {
            item.getValue().delStateChangeListener(listener);
        }    
    }

    public String getName() {
        return machineName;
    }

    public Collection<IStateTransition> getTransitions() {        
        Collection<IStateTransition> result = new LinkedList<IStateTransition>();
        for(Map.Entry<String,IStateTransition> item:transitions.entrySet()) {
            result.add(item.getValue());
        }
        return result;
    }

    public IStateTransition getTransitionBy(IEvent event, IState whenState) {
        return transitions.get(generateKey(event,whenState));
    }
    
    public void clearTransitions() {
        transitions.clear();
    }
    
    public void reset() throws Exception {
        setCurrentState(getInitialState());
    }

}
