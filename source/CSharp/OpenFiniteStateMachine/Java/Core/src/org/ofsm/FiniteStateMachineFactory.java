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

import org.ofsm.impl.FiniteStateMachineBuilder;

/**
 * Factory for create a finite state machine builder.
 * 
 * <p>Example of use:</p>
 * @code
 * ...
 * IFiniteStateMachineBuilder builder = FiniteStateMachineFactory.getInstance().getBuilder();
 * ...
 * @endcode
 */
public class FiniteStateMachineFactory {
    protected FiniteStateMachineFactory() {};
    private final String version = "1.0.0b";
    
    static private FiniteStateMachineFactory instance = new FiniteStateMachineFactory();
    
    /**
     * Access to single instance of factory (Singleton concepts)
     * @return factory
     */
    public static FiniteStateMachineFactory getInstance() {
        return instance;
    }
    
    /**     
     * Create new machine builder object
     * <i>You can redefine of creation class type. Specify your class name in environment 
     * attribute "org.ofsm.machinebuilder" and this method will return instance of your class.</i>
     * @note This is method pluggable and may redefined
     * @return Finite state machine builder
     * @throws Exception Throws when unable to find or create class for instance
     */
    public IFiniteStateMachineBuilder newBuilder() throws Exception {
        String builderClassStr = System.getProperty("org.ofsm.machinebuilder");
        if(builderClassStr == null) {
            return new FiniteStateMachineBuilder();
        }
        else {
            Class<IFiniteStateMachineBuilder> builderClass = (Class<IFiniteStateMachineBuilder>)Class.forName(builderClassStr);
            return builderClass.newInstance();
        }
    }

    /**
     * Get the version of OFSM library. 
     * @return version of library
     */
    public String getVersion() {
        return version;
    }
}
