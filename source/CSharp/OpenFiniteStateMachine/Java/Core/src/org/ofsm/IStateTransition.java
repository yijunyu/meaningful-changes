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

package org.ofsm;
import java.util.Collection;

/**
 * Interface for describe a state transition information. 
 * The transition contains information about states and event.
 */
public abstract interface IStateTransition {
    /**
     * Event which cause transition
     * @return Event which cause transition
     */
    public abstract IEvent getEvent();
    
    /**
     * Source(initial) state for transition 
     * @return Begin(initial) state for transition 
     */
    public abstract IState getFromState();
    
    /**
     * Destination state for transition
     * @return Destination state for transition
     */
    public abstract IState getToState();
    
    /**
     * Add listener to the transition notification list
     * @param listener Own implements of listener
     */
    public abstract void addStateChangeListener(IStateChangeListener listener);
    
    /**
     * Delete listener from the transition notification list
     * @param listener Own implements of listener
     */
    public abstract void delStateChangeListener(IStateChangeListener listener);
    
    /**
     * Fire the event when changing state to transition notification list
     * @return true, if changes is accepted by listeners, else false
     */
    public abstract boolean fireStateChangingEvent();
    
    /**
     * Fire the event when changed state to transition notification list
     */    
    public abstract void fireStateChangedEvent();
}
