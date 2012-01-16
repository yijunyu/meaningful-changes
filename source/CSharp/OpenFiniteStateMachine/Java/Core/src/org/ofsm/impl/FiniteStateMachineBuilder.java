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

import java.io.InputStream;

import java.net.URI;

import java.util.LinkedList;
import java.util.List;

import org.ofsm.IFiniteStateMachine;
import org.ofsm.IFiniteStateMachineBuilder;
import org.ofsm.IFiniteStateMachineInitiable;


public class FiniteStateMachineBuilder implements IFiniteStateMachineBuilder {
    protected final String defaultMachineProperty   =   "org.ofsm.machine.default";
    protected final String machineByURIPrefixProperty   =   "org.ofsm.machine.uri.";

    protected List<IFiniteStateMachineInitiable> initiableMachines = new LinkedList<IFiniteStateMachineInitiable>();
    protected IFiniteStateMachine defaultMachine = new FiniteStateMachine();
    
    public FiniteStateMachineBuilder() {
        addMachine(new FileFiniteStateMachine());
    }
    
    public IFiniteStateMachine getMachine(URI uri) throws Exception {
         IFiniteStateMachineInitiable result = null;
         String builderClassStr = System.getProperty(machineByURIPrefixProperty+uri.getScheme());
         if(builderClassStr!=null) {
             Class<IFiniteStateMachineInitiable> builderClass = (Class<IFiniteStateMachineInitiable>)Class.forName(builderClassStr);
             result = builderClass.newInstance();
             if(result!=null && !result.mayProcessed(uri)) {
                 result = null;
             }
         };                 
         
         if(result == null) {
             synchronized(initiableMachines) {
                 for(IFiniteStateMachineInitiable item: initiableMachines) {
                     if(item.mayProcessed(uri)) {
                         result = item;
                         break;
                     }
                 }
             }
         }
        
        if(result!=null) {
            result.init(uri);
        }
        return result;
    }
    
    public IFiniteStateMachine getMachine(String streamType, 
                                          InputStream stream) throws Exception {
        IFiniteStateMachineInitiable result = null;
        synchronized(initiableMachines) {
            for(IFiniteStateMachineInitiable item: initiableMachines) {
                if(item.mayProcessed(streamType)) {
                    result = item;
                    break;
                }
            }
        }
        if(result!=null) {
            result.init(stream);
        }
        return result;
    }
    

    public IFiniteStateMachine getMachine() throws Exception {
        String builderClassStr = System.getProperty(defaultMachineProperty);
        if(builderClassStr == null) {
            return getDefaultMachine();
        }
        else {
            Class<IFiniteStateMachine> builderClass = (Class<IFiniteStateMachine>)Class.forName(builderClassStr);
            return builderClass.newInstance();
        }    
    }

    public void addMachine(IFiniteStateMachineInitiable machine) {
        synchronized(initiableMachines) {
            initiableMachines.add(machine);
        }
    }
    
    public void addMachine(int index,IFiniteStateMachineInitiable machine) {
        synchronized(initiableMachines) {        
            initiableMachines.add(index,machine);
        }
    }
    

    public void delMachine(IFiniteStateMachineInitiable machine) {
        synchronized(initiableMachines) {
            initiableMachines.remove(machine);
        }
    }
   
    public IFiniteStateMachine getDefaultMachine() {
        return defaultMachine;
    }
}
