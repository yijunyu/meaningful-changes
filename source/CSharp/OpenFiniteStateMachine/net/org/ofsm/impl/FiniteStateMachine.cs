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
	public class FiniteStateMachine : IFiniteStateMachine
	{
        protected IDictionary < string, IStateTransition > transitions = new Dictionary < string, IStateTransition >();
		private const string machineName = "Default";			        
		protected internal IState currentState, initialState;

		public FiniteStateMachine()
		{
		}

		virtual public IState getCurrentState() 
        {
				return currentState;
		}
			
		virtual public void setCurrentState(IState value)
		{
				currentState = value;
		}
			
		virtual public IState getInitialState()
		{
    		return this.initialState;
		}
			
		virtual public void setInitialState(IState value)
		{
			initialState = value;
			if (currentState == null)
			{
				currentState = initialState;
			}
		}
		        
		protected internal virtual string generateKey(string eventName, IState state)
		{
			return eventName + "/" + state.getName();
		}
		
		protected internal virtual string generateKey(IEvent event_Renamed, IState state)
		{
			return generateKey(event_Renamed.getName(), state);
		}
		
		
		protected internal virtual string generateKey(IStateTransition transition)
		{
			return generateKey(transition.getEvent(), transition.getFromState());
		}
		
		public virtual IState fireEvent(IEvent ev)
		{
			return fireEvent(ev.getName());
		}
		
		public virtual IState fireEvent(string eventName)
		{
			if (currentState == null)
				return null;
			else
			{	
                string key = generateKey(eventName, currentState);
				if (transitions.ContainsKey(key))
				{
                    IStateTransition transition = transitions[key];
					if (transition.fireStateChangingEvent())
					{
						currentState = transition.getToState();
						transition.fireStateChangedEvent();
					}
					return currentState;
				}
				else
				{
					currentState = null;
					return null;
				}
			}
		}
		
		
		public virtual void  addTransition(IStateTransition transition)
		{
			transitions.Add(generateKey(transition), transition);
		}
		
		public virtual void  delTranstition(IStateTransition transition)
		{
			transitions.Remove(generateKey(transition));
		}
		
		public virtual string getName()
		{
			return machineName;
		}

        public virtual void addStateChangeListener(IStateChangeListener listener)
        {
            foreach (IStateTransition item in transitions.Values)
            {
                item.addStateChangeListener(listener);
            }
        }

		public virtual void  delStateChangeListener(IStateChangeListener listener)
		{
			foreach(IStateTransition item in transitions.Values)
			{
				item.delStateChangeListener(listener);
			}
		}
		
        public ICollection<IStateTransition> getTransitions()
        {
            ICollection<IStateTransition> result = new LinkedList<IStateTransition>();
            foreach (IStateTransition item in transitions.Values)
            {
                result.Add(item);
            }
            return result;
        }
		
		public virtual IStateTransition getTransitionBy(IEvent ev, IState whenState)
		{
			return transitions[(generateKey(ev, whenState))];
		}
		
		public virtual void  clearTransitions()
		{
			transitions.Clear();
		}
		
		public virtual void  reset()
		{
			currentState = initialState;
		}
	}
}