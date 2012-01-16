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
using org.ofsm;

namespace org.ofsm.impl
{
	
	[Serializable]
	public class FileFiniteStateMachineBaseModel
	{		
		private ICollection < StateInfo > loadedStates = new LinkedList < StateInfo >();
        private ICollection <EventInfo> loadedEvents = new LinkedList<EventInfo>();		
		private IDictionary < IState, LinkedList < StateTransition >> transitions = new Dictionary < IState, LinkedList < StateTransition > > ();
		private IState initialState;

		public FileFiniteStateMachineBaseModel()
		{			
		}

		/*private void  InitBlock()
		{
			return loadedEvents;
			//UPGRADE_ISSUE: The following fragment of code could not be parsed and was not converted. "ms-help://MS.VSCC.v80/dv_commoner/local/redirect.htm?index='!DefaultContextWindowIndex'&keyword='jlca1156'"
			for(StateTransition item: lstItem)
			{
				if (item.getEvent().equals(eventInfo.getEvent()))
				{
					lstItem.remove(item);
					deleteEventFromTransitionList(eventInfo, lstItem);
					break;
				}
			}
			return loadedStates;
			//UPGRADE_ISSUE: The following fragment of code could not be parsed and was not converted. "ms-help://MS.VSCC.v80/dv_commoner/local/redirect.htm?index='!DefaultContextWindowIndex'&keyword='jlca1156'"
			for(StateTransition item: lstItem)
			{
				if (item.getFromState().equals(stateInfo.getState()))
				{
					lstItem.remove(item);
					deleteStateFromTransitionList(stateInfo, lstItem);
					break;
				}
				else if (item.getToState().equals(stateInfo.getState()))
				{
					lstItem.remove(item);
					deleteStateFromTransitionList(stateInfo, lstItem);
					break;
				}
			}
			return transitions.get_Renamed(state);
			return transitions;
		}*/

		virtual public IState getInitialState()
		{
			return initialState;
		}
			
		virtual public void setInitialState(IState value) 
		{
				initialState = value;
		}
			
		public ICollection < EventInfo > getEventInfos() {
            return loadedEvents;
        }
		
		public virtual EventInfo getEventInfo(string name)
		{
			foreach(EventInfo item in loadedEvents)
			{                
				if (item.getEvent().getName().Equals(name,StringComparison.OrdinalIgnoreCase))
					return item;
			}
			return null;
		}
		
		public virtual void addEventInfo(EventInfo eventInfo)
		{
			if (getEventInfo(eventInfo.getEvent().getName()) != null)
				throw new ArgumentException("Invalid event name. Event with name " + eventInfo.getEvent().getName() + " is already created!");
			loadedEvents.Add(eventInfo);
		}
				
		private	void deleteEventFromTransitionList(EventInfo eventInfo, ICollection < StateTransition > lstItem) {
			foreach(StateTransition item in lstItem)
			{
				if (item.getEvent().Equals(eventInfo.getEvent()))
				{
					lstItem.Remove(item);
					deleteEventFromTransitionList(eventInfo, lstItem);
					break;
				}
			}
        }
		
		public virtual void  deleteEventInfo(EventInfo eventInfo)
		{			
            foreach(ICollection< StateTransition> lstItem in transitions.Values)
			{
				deleteEventFromTransitionList(eventInfo, lstItem);
			}
			loadedEvents.Remove(eventInfo);
		}
				
		public ICollection < StateInfo > getStateInfos() {
                return loadedStates;
        }
		
		public virtual void  addStateInfo(StateInfo stateInfo)
		{
			loadedStates.Add(stateInfo);
		}
		
		public virtual StateInfo getStateInfo(string name)
		{			
			foreach(StateInfo item in loadedStates)
			{
				if (item.getState().getName().Equals(name,StringComparison.OrdinalIgnoreCase))
					return item;
			}
			return null;
		}
				
		private	void deleteStateFromTransitionList(StateInfo stateInfo, ICollection < StateTransition > lstItem) {
			foreach(StateTransition item in lstItem)
			{
                if (item.getFromState().Equals(stateInfo.getState()))
                {
                    lstItem.Remove(item);
                    deleteStateFromTransitionList(stateInfo, lstItem);
                    break;
                }
                else
                if (item.getToState().Equals(stateInfo.getState()))
                {
                    lstItem.Remove(item);
                    deleteStateFromTransitionList(stateInfo, lstItem);
                    break;
                }
            }
        }

		
		public virtual void  deleteStateInfo(StateInfo stateInfo)
		{			
			foreach(ICollection< StateTransition> lstItem in transitions.Values)
			{
				deleteStateFromTransitionList(stateInfo, lstItem);
			}
			transitions.Remove(stateInfo.getState());
			loadedStates.Remove(stateInfo);
		}
		
		public virtual void  deleteTransitionInfo(IState state, IEvent ev)
		{			
            ICollection<StateTransition> lst = getTransitionInfo(state);
			if (lst != null)
			{				
				foreach(StateTransition item in lst)
				{
					if (item.getEvent().Equals(ev))
					{
						lst.Remove(item);
						break;
					}
				}
			}
		}
		
		public virtual void  addTransitionInfo(StateTransition transition)
		{
            if (!transitions.ContainsKey(transition.getFromState()))
            {
                LinkedList<StateTransition> trsLst = new LinkedList<StateTransition>();
                trsLst.AddLast(transition);
                transitions[transition.getFromState()] = trsLst;
            }
            else
            {
                ICollection<StateTransition> trs =
                    transitions[transition.getFromState()];
                trs.Add(transition);
            }
		}
		
		public virtual void  deleteTransitionInfo(IState state)
		{
			transitions.Remove(state);
		}
				
		public ICollection < StateTransition > getTransitionInfo(IState state) {
            return transitions[state];
        }
		
		public virtual StateTransition getTransitionInfo(IState state, IEvent ev)
		{
            ICollection<StateTransition> trans = transitions[state];
			if (trans != null)
			{
				foreach(StateTransition item in trans)
				{
					if (item.getEvent().Equals(ev))
						return item;
				};
			}
			return null;
		}

        public IDictionary<IState, LinkedList<StateTransition>> getTransitionInfos()
        {
            return transitions;
        }
		
		[Serializable]
		abstract public class ObjectWithClassInfo
		{
			virtual public string getClassName()
			{
				return className;
			}
			virtual public void setClassName(string value)
			{
				this.className = value;
			}
				
			private string className;
		}
        
		[Serializable]
		public class StateInfo:ObjectWithClassInfo
		{
            private State state;

			public StateInfo()
			{				
			}

			virtual public State getState()
			{
				return state;
			}
				
			virtual public void setState(State value)
			{
				this.state = value;
			}
							
			public override string ToString()
			{
				if (state != null)
					return state.getName();
				else
				{					
					return base.ToString();
				}
			}
		}

        [Serializable]
        public class EventInfo : ObjectWithClassInfo
        {
            private Event ev;

            public EventInfo()
            {
            }

            virtual public Event getEvent()
            {
                return ev;
            }

            virtual public void setEvent(Event value)
            {
                this.ev = value;
            }

            public override string ToString()
            {
                if (ev != null)
                    return ev.getName();
                else
                {
                    return base.ToString();
                }
            }
        }		
	}
}