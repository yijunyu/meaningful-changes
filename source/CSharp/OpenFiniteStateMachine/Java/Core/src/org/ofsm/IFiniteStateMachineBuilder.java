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

import java.io.IOException;

import java.io.InputStream;

import java.net.URI;

/**
 * The interface describe builder of finite state machines
 */
public abstract interface IFiniteStateMachineBuilder {
    /**
     * Get machine implementation by URI (e.g. file:// or http://).
     * Library contain an implementation that supports network URI (http,ftp, 
     * and all others that support standard java.net.URL). Also a local URI supports too.
     * <p>Example:</p>
     * @code
     *   // Creating machine builder
     *   IFiniteStateMachineBuilder bldr = FiniteStateMachineFactory.getInstance().newBuilder();
     *   
     *   // Creating the finite state machine for resource stream
     *   IFiniteStateMachine machine = bldr.getMachine(new java.net.URI("file://usr/local/mymachine.ofsm.xml"));
     * @endcode
     * The library supports implementation for a model specified by XML format. This implementation registered a machine by 
     * type (pattern) *.ofsm.xml. This pattern must be specified in path of URI.
     * @param uri The URI which contain location of machine model
     * @return Configured finite state machine
     */
    public abstract IFiniteStateMachine getMachine(URI uri) throws Exception;

    /**
     * Get machine implementation by stream type and input stream.
     * The library supports implementation for a model specified by XML format. This implementation registered a machine by 
     * type (pattern) *.ofsm.xml. This pattern must be specified in streamType param.
     * <p>Example:</p>
     * @code
     * // Creating machine builder
     *  IFiniteStateMachineBuilder bldr = FiniteStateMachineFactory.getInstance().newBuilder();
     *  // Creating the finite state machine for resource stream
     *  IFiniteStateMachine machine = bldr.getMachine("example.ofsm.xml",getClass().getResourceAsStream("/org/ofsm/examples/example.ofsm.xml"));
     * @endcode
     * @param streamType Type of stream identifier
     * @param stream Input model as stream
     * @return Configured finite state machine
     */    
    public abstract IFiniteStateMachine getMachine(String streamType, InputStream stream) throws Exception;

    /**
     * Get default implementation of finite-state-machine.
     * This machine does not contain any already configured model.
     * @return Finite state machine
     */
    public abstract IFiniteStateMachine getMachine() throws Exception;

    /**
     * Register FSM implementation
     * @param machine Initiable implementation
     */
    public abstract void addMachine(IFiniteStateMachineInitiable machine);

    /**
     * Register FSM implementation with specified priority (for resolving a conflicts).
     * @param index Index of machine at registry (0 - begin)
     * @param machine Initiable implementation
     */    
    public abstract void addMachine(int index,IFiniteStateMachineInitiable machine);

    /**
     * Unregister FSM implementation
     * @param machine Machine that need unregister
     */
    public abstract void delMachine(IFiniteStateMachineInitiable machine);        
}
