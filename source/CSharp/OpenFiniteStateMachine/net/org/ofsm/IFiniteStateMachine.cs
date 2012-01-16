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

namespace org.ofsm
{
	
	/// <summary> Definition of finite state machine interface</summary>
	public interface IFiniteStateMachine:INamedObject
	{
		/// <summary> The current state of machine</summary>
		/// <returns> Current state
		/// </returns>
        IState getCurrentState();

        /// <summary> Change the current state</summary>
        /// <param name="state">New current state
        /// </param>
        void setCurrentState(IState state);
		
        /// <summary> The initial state</summary>
		/// <returns> Initial state
		/// </returns>
        IState getInitialState();

        /// <summary> Change the initial state</summary>
        /// <param name="state">New initial state
        /// </param>
        void setInitialState(IState state);
		
		/// <summary> Fire the event</summary>
		/// <param name="event">Event
		/// </param>
		/// <returns> Current state
		/// </returns>
        IState fireEvent(IEvent event_Renamed);
		
		/// <summary> Fire the event specified by name</summary>
		/// <param name="eventName">Event name
		/// </param>
		/// <returns> Current state
		/// </returns>
        IState fireEvent(string eventName);
		
		/// <summary> Add transition</summary>
		/// <param name="transition">State transition
		/// </param>
        void addTransition(IStateTransition transition);
		
		/// <summary> Delete transition</summary>
		/// <param name="transition">State transition
		/// </param>
        void delTranstition(IStateTransition transition);
		
		/// <summary> Add listener to the transition notification list</summary>
		/// <param name="listener">Own implements of listener
		/// </param>
        void addStateChangeListener(IStateChangeListener listener);
		
		/// <summary> Delete listener from the transition notification list</summary>
		/// <param name="listener">Own implements of listener
		/// </param>
        void delStateChangeListener(IStateChangeListener listener);
				
		/// <summary> Get the defined transitions for machine</summary>
		/// <returns> transitions
		/// </returns>
        ICollection < IStateTransition > getTransitions();

	    /// <summary> Get the defined transition by the specified filter</summary>
	    /// <param name="event">Event which cause run the transition
	    /// </param>
	    /// <param name="state">Initial(begin) transition state
	    /// </param>
	    /// <returns> Matched transition 
	    /// </returns>
	    IStateTransition getTransitionBy(IEvent ev, IState state);

	    /// <summary> Reset the machine state</summary>
	    void reset();
	}
}