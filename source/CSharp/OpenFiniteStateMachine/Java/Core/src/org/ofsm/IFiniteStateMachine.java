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

/**
 * Contain of API definition of Open Finite State Machine (OFSM) library
 */
package org.ofsm;

/**
* @mainpage Open Finite State Machine Library.
* @version 1.0.0b
* @author Abdulla G. Abdurakhmanov (abdulla.abdurakhmanov\@gmail.com).
* @date (c) 2006
*
* @section Introduction Intro
* The OFSM library contain a simple finite state machine implementation.
* @section Features
*  - Simple and ease-to-use
*  - Customizable and flexible
*  - Machine may be configured from network or local XML resource.
*  - Contain a tool for creating model.
*  @section GlobalNotes Notes
*   <i>This documentation describe only API of library, without any
*   internal implementation notes.</i>
*/


import java.util.Collection;

/**
 * Definition of finite state machine interface
 */
public abstract interface IFiniteStateMachine extends INamedObject {

    /**
     * Fire the event
     * @param event Event
     * @return Current state
     */
    public abstract IState fireEvent(IEvent event);

    /**
     * Fire the event specified by name
     * @param eventName Event name
     * @return Current state
     */    
    public abstract IState fireEvent(String eventName);
    
    /**
     * Get the current state of machine
     * @return Current state
     */
    public abstract IState getCurrentState();

    /**
     * Change the current state
     * @param state New current state
     */
    public abstract void setCurrentState(IState state);

    /**
     * Change the initial state
     * @param state New initial state
     */    
    public abstract void setInitialState(IState state);

    /**
     * Get the initial state
     * @return Initial state
     */        
    public abstract IState getInitialState();

    /**
     * Add transition
     * @param transition State transition
     */
    public abstract void addTransition(IStateTransition transition);

    /**
     * Delete transition
     * @param transition State transition
     */
    public abstract void delTranstition(IStateTransition transition);

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
     * Get the name of machine
     * @return Machine name
     */
    public abstract String getName();

    /**
     * Get the defined transitions for machine
     * @return transitions
     */
    public abstract Collection<IStateTransition> getTransitions();

    /**
     * Get the defined transition by the specified filter
     * @param event Event which cause run the transition
     * @param state Initial(begin) transition state
     * @return Matched transition 
     */
    public abstract IStateTransition getTransitionBy(IEvent event, IState state);
    
    /**
     * Reset the machine state
     */
    public abstract void reset() throws Exception;
}
