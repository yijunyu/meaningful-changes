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

package test.org.ofsm.impl;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

import java.util.List;

import junit.framework.TestCase;

import org.ofsm.impl.FileFiniteStateMachineModel;
import org.ofsm.impl.StateTransition;

public class FileFiniteStateMachineModelTest extends TestCase {
    public FileFiniteStateMachineModelTest(String sTestName) {
        super(sTestName);
    }

    /**
     * @see FileFiniteStateMachineModel#unmarshal(InputStream)
     */
    public void testUnmarshal() {
        try {
            FileFiniteStateMachineModel model = new FileFiniteStateMachineModel();
            model.unmarshal(getClass().getResourceAsStream("/test/org/ofsm/test.ofsm.xml"));
            assertNotNull(model.getEventInfo("TestEvent"));
            assertNotNull(model.getEventInfo("TestEvent").getEvent());
            assertEquals(model.getEventInfo("TestEvent").getEvent().getName(),"TestEvent");
            assertNotNull(model.getStateInfo("Success"));
            assertNotNull(model.getStateInfo("Success").getState());
            assertEquals(model.getStateInfo("Success").getState().getName(),"Success");
            assertNotNull(model.getInitialState());
            assertEquals(model.getInitialState().getName(),"Success");
            List<StateTransition> list = model.getTransitionInfo(model.getStateInfo("Success").getState());
            assertNotNull(list);
            assertNull(model.getStateInfo("UnknownState"));
        }
        catch(Exception ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * @see FileFiniteStateMachineModel#marshal(OutputStream)
     */
    public void testMarshal() {
        try {    
            FileFiniteStateMachineModel model = new FileFiniteStateMachineModel();
            model.unmarshal(getClass().getResourceAsStream("/test/org/ofsm/test.ofsm.xml"));
            model.marshal(System.out);
        }
        catch(Exception ex) {
            fail(ex.getMessage());
        }
    
    }
}
