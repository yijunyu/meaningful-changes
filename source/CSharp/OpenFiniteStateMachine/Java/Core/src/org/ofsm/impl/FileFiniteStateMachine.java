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

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;

import java.lang.reflect.Type;

import java.net.MalformedURLException;

import java.net.URI;
import java.net.URL;

import java.util.Collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ofsm.IFiniteStateMachineInitiable;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.ofsm.IEvent;
import org.ofsm.IState;


public class FileFiniteStateMachine extends FiniteStateMachine implements IFiniteStateMachineInitiable{
    private final String machineName = "FileFiniteStateMachine";
    private final String processCriteriaPattern = ".ofsm.xml";
    private URI initByResource;
    private InputStream initByStream;
    private FileFiniteStateMachineModel model = new FileFiniteStateMachineModel();
    
    public String getName() {
        return machineName;        
    }
    
    public boolean mayProcessed(URI params) {
        if(params.getPath().contains(processCriteriaPattern))
            return true;
        else
            return false;
    }

    public boolean mayProcessed(String streamName) {
        if(streamName.contains(processCriteriaPattern))
            return true;
        else
            return false;
    }

    public void init(InputStream stream) throws Exception {
        initByStream = stream;
        unmarshal(initByStream);
    }    

    public synchronized void init(URI params) throws Exception {        
        this.clearTransitions();
        initByResource = params;
        InputStream stream = null;
        if(params.getScheme().equalsIgnoreCase("file")) {
            //String fileName = params.getAuthority() + params.getPath();
            stream = new FileInputStream(new File(params));
        }
        else {
            URL url = initByResource.toURL();
            stream = url.openStream();            
        }
        try {
            unmarshal(stream);
        }
        finally {
            stream.close();
        }
    }
    
    public void reset() throws Exception {
        if(initByResource!=null)
            init(initByResource);
        else
            super.reset();
    }

    private void unmarshal(InputStream stream) throws Exception {
        model.unmarshal(stream);
        setInitialState(model.getInitialState());
        for(Map.Entry<IState, List< StateTransition > > lstItem: model.getTransitionInfos().entrySet()) {
           for(StateTransition item: lstItem.getValue()) {
               addTransition(item);
           }
        }
    
    }
}
