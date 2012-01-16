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

import java.util.List;
import java.util.LinkedList;

import org.ofsm.*;

public class StateTransition implements IStateTransition {
    private IEvent whenEvent;
    private IState fromState, toState;
    protected List<IStateChangeListener> listeners = new LinkedList<IStateChangeListener>();
    
    public IEvent getEvent() {
        return whenEvent;
    }
    
    public void setEvent(IEvent event) {
        whenEvent = event;
    }

    public IState getFromState() {
        return fromState;
    }
    
    public void setFromState(IState state) {
        fromState = state;
    }

    public IState getToState() {
        return toState;
    }
    
    public void setToState(IState state) {
        toState = state;
    }

    public void addStateChangeListener(IStateChangeListener listener) {
        synchronized (listeners) {
            listeners.add(listener);
        }
    }

    public void delStateChangeListener(IStateChangeListener listener) {
        synchronized (listeners) {
            listeners.remove(listener);
        }
    }
    
    public boolean fireStateChangingEvent() {
        synchronized (listeners) {
            for(IStateChangeListener listener: listeners) {
                if(!listener.onStateChanging(this))
                    return false;
            }
        }
        return true;
    }
    
    public void fireStateChangedEvent() {
        synchronized (listeners) {
            for(IStateChangeListener listener: listeners) {
                listener.onStateChanged(this);
            }
        }
    }
    
}
