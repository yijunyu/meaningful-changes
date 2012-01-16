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
 * Interface for "initiable" (configurable from resource) Finite State Machines
 */
public interface IFiniteStateMachineInitiable extends IFiniteStateMachine {
    /**
     * Method which define possibility of processing input URI
     * @param params URI contains location  of resource(model)
     * @return true - if possible, otherwise false
     */
    public abstract boolean mayProcessed(URI params);
    
    /**
     * Method which define possibility of processing input type (or name) stream
     * @param streamName Type (or name) stream
     * @return true - if possible, otherwise false
     */    
    public abstract boolean mayProcessed(String streamName);
    
    /**
     * Initialize machine by URI
     * @param params URI contains location  of resource(model)
     */
    public abstract void init(URI params) throws Exception;
    
    /**
     * Initialize machin by input stream
     * @param stream  A stream contains resource(model)
     */    
    public abstract void init(InputStream stream) throws Exception;
}
