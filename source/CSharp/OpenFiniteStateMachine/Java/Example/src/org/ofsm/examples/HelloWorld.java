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
 * A package contains some simple examples
 */
package org.ofsm.examples;

import java.io.InputStream;

import org.ofsm.FiniteStateMachineFactory;
import org.ofsm.IFiniteStateMachine;
import org.ofsm.IFiniteStateMachineBuilder;

/**
 * HelloWorld example
 */
public class HelloWorld {
    public HelloWorld() {
    }

    private void doIt() {
        try {
            // Creating machine builder
            IFiniteStateMachineBuilder bldr = FiniteStateMachineFactory.getInstance().newBuilder();
            
            // Creating the finite state machine for resource stream
            IFiniteStateMachine machine = bldr.getMachine("example.ofsm.xml",getClass().getResourceAsStream("/org/ofsm/examples/example.ofsm.xml"));
            
            // Get and print inital state
            System.out.println("Initial state:"+ machine.getInitialState());
            
            // Fire the events and print current state
            System.out.println("State: "+machine.fireEvent("ReceivedRequest").getName());
            System.out.println("State: "+machine.fireEvent("ChargingRequest").getName());
            // Fire incorrect (unspecified by model) event and check the currentstate is null (invalid)
            System.out.println("State: "+machine.fireEvent("CancelRequest"));
            
            // Reset the machine
            machine.reset();
            
        }
        catch(Exception ex) {
            System.err.println(ex);
        }
    }
    
    public static void main(String args[]) {
        new HelloWorld().doIt();
    }

}

 /** @example HelloWorld.java
  * This is an example of how to use the OFSM library.
  */