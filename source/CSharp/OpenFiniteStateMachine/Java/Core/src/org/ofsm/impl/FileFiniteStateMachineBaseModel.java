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

import java.io.Serializable;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.ofsm.IEvent;
import org.ofsm.IState;

public class FileFiniteStateMachineBaseModel implements Serializable{
    public Collection<EventInfo> getEventInfos() {
        return loadedEvents;
    }
    
    public EventInfo getEventInfo(String name) {
        for(EventInfo item: loadedEvents) {
            if(item.getEvent().getName().equalsIgnoreCase(name))
                return item;
        }
        return null;
    }

    public void addEventInfo(EventInfo eventInfo) throws Exception {
        if(getEventInfo(eventInfo.getEvent().getName())!=null)
            throw new IllegalArgumentException("Invalid event name. Event with name "+eventInfo.getEvent().getName()+" is already created!");
        loadedEvents.add(eventInfo);
    }

    private void deleteEventFromTransitionList(EventInfo eventInfo, List<StateTransition> lstItem) {
        for(StateTransition item: lstItem) {
            if(item.getEvent().equals(eventInfo.getEvent())) {
                lstItem.remove(item);
                deleteEventFromTransitionList(eventInfo,lstItem);
                break;
            }
        }    
    }
    
    public void deleteEventInfo(EventInfo eventInfo) {
        for(Map.Entry <IState, List < StateTransition > > lstItem: transitions.entrySet()) {
            deleteEventFromTransitionList(eventInfo, lstItem.getValue());
        }
        loadedEvents.remove(eventInfo);
    }

    public Collection<StateInfo> getStateInfos() {
        return loadedStates;
    }

    public void addStateInfo(StateInfo stateInfo) {
        loadedStates.add(stateInfo);
    }       

    public StateInfo getStateInfo(String name) {
        for(StateInfo item: loadedStates) {
            if(item.getState().getName().equalsIgnoreCase(name))
                return item;
        }
        return null;
    }
    
    private void deleteStateFromTransitionList(StateInfo stateInfo, List<StateTransition> lstItem) {
        for(StateTransition item: lstItem) {
            if(item.getFromState().equals(stateInfo.getState())) {
                lstItem.remove(item );
                deleteStateFromTransitionList(stateInfo, lstItem);
                break;
            }
            else
            if(item.getToState().equals(stateInfo.getState())) {
                lstItem.remove(item);
                deleteStateFromTransitionList(stateInfo, lstItem);
                break;
            }                
        }        
    }

    public void deleteStateInfo(StateInfo stateInfo) {
        for(Map.Entry<IState, List < StateTransition > > lstItem: transitions.entrySet()) {
            deleteStateFromTransitionList(stateInfo,lstItem.getValue());
        }
        transitions.remove(stateInfo.getState());        
        loadedStates.remove(stateInfo);
    }

    public void deleteTransitionInfo(IState state, IEvent event) {
        List<StateTransition> lst = getTransitionInfo(state);
        if (lst != null) {
            for (StateTransition item: lst) {
                if (item.getEvent().equals(event)) {
                    lst.remove(item);
                    break;
                }
            }
        }
    }

    public void addTransitionInfo(StateTransition transition) {
        List<StateTransition> trs = 
            transitions.get(transition.getFromState());
        if (trs == null) {
            List<StateTransition> trsLst = new LinkedList<StateTransition>();
            trsLst.add(transition);
            transitions.put(transition.getFromState(), trsLst);
        } else
            trs.add(transition);
    }

    public IState getInitialState() {
        return initialState;
    }
    
    public void setInitialState(IState state) {
        initialState = state;
    }

    public void deleteTransitionInfo(IState state) {
        transitions.remove(state);
    }

    public List<StateTransition> getTransitionInfo(IState state) {
        return transitions.get(state);
    }

    public StateTransition getTransitionInfo(IState state, IEvent event) {
        List<StateTransition> trans = transitions.get(state);
        if(trans!=null) {
            for(StateTransition item: trans) {
                if(item.getEvent().equals(event))
                    return item;
            };
        }
        return null;
    }

    public Map<IState, List<StateTransition>> getTransitionInfos() {
        return transitions;
    }
    
    private abstract class ObjectWithClassInfo {
        private String className;
        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }
        
    }
    public class StateInfo extends ObjectWithClassInfo implements Serializable{
        private State state;        

        public State getState() {
            return state;
        }

        public void setState(State state) {
            this.state = state;
        }
        
        public String toString() {
            if(state!=null)
                return state.getName();
            else
                return super.toString();
        }
    }
    
    public class EventInfo extends ObjectWithClassInfo {
        private Event event;

        public Event getEvent() {
            return event;
        }

        public void setEvent(Event event) {
            this.event = event;
        }
        
        public String toString() {
            if(event!=null)
                return event.getName();
            else
                return super.toString();
        }
    }
    private List<StateInfo> loadedStates = new LinkedList<StateInfo>();
    private List<EventInfo> loadedEvents = new LinkedList<EventInfo>();
    private Map<IState, List<StateTransition>> transitions = 
        new HashMap<IState, List<StateTransition>>();
    private IState initialState;
}
