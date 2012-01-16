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
using System;
using System.Collections.Generic;
using System.Xml.Serialization;
using org.ofsm;

namespace org.ofsm.impl
{		
	public class FileFiniteStateMachineModel:FileFiniteStateMachineBaseModel
	{
        private bool safeUnmarshallingMode = false;

		public FileFiniteStateMachineModel()
		{
		}
		
		public virtual void  unmarshal(System.IO.Stream stream)
		{
			getEventInfos().Clear();
			getStateInfos().Clear();
			getTransitionInfos().Clear();
			setInitialState(null);
			XmlSerializer unmarshaller = new XmlSerializer(new schema.finitestatemachine().GetType());
            Object obj = unmarshaller.Deserialize(stream);
            schema.finitestatemachine defMachine = (schema.finitestatemachine)obj;
            schema.definitions defs = defMachine.definitions;
			unmarshalEvents(defs.events);
			unmarshalStates(defs.states);
			unmarshalInitialState(defMachine.initialstate);
			unmarshalTransitions(defMachine.transitions);
		}
		
		public virtual void  marshal(System.IO.Stream stream)
		{
			XmlSerializer marshaller = new XmlSerializer(new schema.finitestatemachine().GetType());
            schema.finitestatemachine defMachine = new schema.finitestatemachine();
			marshalDefinitions(defMachine);
			marshalInitialState(defMachine);
			marshalTransitions(defMachine);
			marshaller.Serialize(stream,defMachine);
		}

        public virtual void setSafeUnmarshallingMode(bool mode)
        {
            safeUnmarshallingMode = mode;
        }
		
		protected internal virtual void  unmarshalEvents(schema.events events)
		{
			foreach(schema.EventType item in events.@event)
			{
				addEventInfo(unmarshalEvent(item));
			}
		}
		
		protected internal virtual EventInfo unmarshalEvent(schema.EventType eventDef)
		{
			string className = eventDef.className;
			if (className == null)
			{
				className = "org.ofsm.impl.Event";
			}
            Type evClass = Type.GetType(className);

            Event ev = null;
            if (!safeUnmarshallingMode)
                ev = (Event)Activator.CreateInstance(evClass);
            else
                ev = new Event();
			ev.setName(eventDef.name);
			EventInfo result = new EventInfo();
			result.setEvent(ev);
			result.setClassName(className);
			return result;
		}
		
		private void  unmarshalStates(schema.states states)
		{
			foreach(schema.StateType item in states.state)
			{
				addStateInfo(unmarshalState(item));
			}
		}
		
		
		protected internal virtual StateInfo unmarshalState(schema.StateType stateDef)
		{
			string className = stateDef.className;
			if (className == null)
			{
				className = "org.ofsm.impl.State";
			}
            Type stClass = Type.GetType(className);

            State state = null;
            if (!safeUnmarshallingMode)
                state = (State)Activator.CreateInstance(stClass);
            else
                state = new State();
            state.setName(stateDef.name);
			StateInfo result = new StateInfo();
			result.setState(state);
			result.setClassName(className);
			return result;
		}
						
		protected internal virtual void  unmarshalInitialState(string stateName)
		{
			StateInfo info = getStateInfo(stateName);
			if (info != null)
				setInitialState(info.getState());
		}
		
		protected internal virtual void  unmarshalTransitions(schema.transitions defTransitions)
		{			
			foreach(schema.transition item in defTransitions.transition)
			{
				unmarshalTransition(item);
			}
		}
		
		protected internal virtual void  unmarshalTransition(schema.transition defTransition)
		{
			EventInfo eventInfo = getEventInfo(defTransition.whenevent);
			if (eventInfo != null)
			{
				StateInfo fromStateInfo = getStateInfo(defTransition.fromstate);
				StateInfo toStateInfo = getStateInfo(defTransition.tostate);
				if (fromStateInfo != null && toStateInfo != null)
				{
					StateTransition transition = new StateTransition();
					transition.setEvent(eventInfo.getEvent());
					transition.setFromState(fromStateInfo.getState());
					transition.setToState(toStateInfo.getState());
					addTransitionInfo(transition);
				}
			}
		}
		
		private void  marshalDefinitions(schema.finitestatemachine fsmDef)
		{
			schema.definitions defs = new schema.definitions();
			defs.events = marshalEvents();
			defs.states = marshalStates();
			fsmDef.definitions = defs;
		}
		
		private schema.events marshalEvents() {
            schema.events result = new schema.events();            
            ICollection < EventInfo > events = getEventInfos();
            result.@event = new org.ofsm.impl.schema.EventType[events.Count];
            int idx = 0;
            foreach(EventInfo item in events) {
                result.@event[idx++] = marshalEvent(item);
            }
            return result;
        }
		
		private schema.EventType marshalEvent(EventInfo eventInfo)
		{
            schema.EventType eventDef = new schema.EventType();
            eventDef.name = eventInfo.getEvent().getName();
			if (eventInfo.getClassName() != null && eventInfo.getClassName().Length > 0)
                eventDef.className = eventInfo.getClassName();
            return eventDef;
		}
		
		private schema.states marshalStates() {
            schema.states result = new schema.states();            
            ICollection < StateInfo > states = getStateInfos();
            result.@state = new org.ofsm.impl.schema.StateType[states.Count];
            int idx = 0;
            foreach (StateInfo item in states)
            {
                result.@state[idx++] = marshalState(item);
            }
            return result;
        }
		
		private schema.StateType marshalState(StateInfo stateInfo)
		{
            schema.StateType result = new schema.StateType();
            result.name = stateInfo.getState().getName();
			if (stateInfo.getClassName() != null && stateInfo.getClassName().Length > 0)
                result.className = stateInfo.getClassName();
            return result;
		}

		
		private void  marshalInitialState(schema.finitestatemachine fsmDef)
		{
			IState state = getInitialState();
			if (state != null)
			{
				fsmDef.initialstate = state.getName();
			}
		}
		
		private void  marshalTransitions(schema.finitestatemachine fsmDef)
		{
            List<schema.transition> lst = new List<schema.transition>();
            foreach(ICollection < StateTransition > lstItem in getTransitionInfos().Values)
			{
				foreach(StateTransition item in lstItem)
				{
                    lst.Add(marshalTransition(item));
				}
			}
            schema.transitions transDefs = new schema.transitions();
            transDefs.transition = lst.ToArray();
			fsmDef.transitions = transDefs;
		}
		
		private schema.transition marshalTransition(StateTransition trans)
		{
            schema.transition result = new schema.transition();
			if (trans.getFromState() != null)
                result.fromstate = trans.getFromState().getName();
			if (trans.getToState() != null)
				result.tostate = trans.getToState().getName();
			if (trans.getEvent() != null)
                result.whenevent = trans.getEvent().getName();
            return result;
		}
	}
}