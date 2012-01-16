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
	
	public class StateTransition : IStateTransition
	{
		private IEvent whenEvent;
		private IState fromState, toState;
		
		protected ICollection < IStateChangeListener > listeners = new LinkedList < IStateChangeListener >();
		
		public virtual IEvent getEvent()
		{
			return whenEvent;
		}
		
		public virtual void  setEvent(IEvent ev)
		{
			whenEvent = ev;
		}
		
		public virtual IState getFromState()
		{
			return fromState;
		}
		
		public virtual void  setFromState(IState state)
		{
			fromState = state;
		}
		
		public virtual IState getToState()
		{
			return toState;
		}
		
		public virtual void  setToState(IState state)
		{
			toState = state;
		}
		
		public virtual void  addStateChangeListener(IStateChangeListener listener)
		{
			lock (listeners)
			{
				listeners.Add(listener);
			}
		}
		
		public virtual void  delStateChangeListener(IStateChangeListener listener)
		{
			lock (listeners)
			{
				listeners.Remove(listener);
			}
		}
		
		public virtual bool fireStateChangingEvent()
		{
			lock (listeners)
			{				
				foreach(IStateChangeListener listener in listeners)
				{
					if (!listener.onStateChanging(this))
						return false;
				}
			}
			return true;
		}
		
		public virtual void  fireStateChangedEvent()
		{
			lock (listeners)
			{				
				foreach(IStateChangeListener listener in listeners)
				{
					listener.onStateChanged(this);
				}
			}
		}
	}
}