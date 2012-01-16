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
namespace org.ofsm
{
	
	/// <summary> Interface for describe state transition information. 
    /// The transition contains information about states and event.
	/// </summary>
	public interface IStateTransition
	{
		/// <summary> Event which cause transition</summary>
		/// <returns> Event which cause transition
		/// </returns>
		IEvent getEvent();
		
		/// <summary> Source(initial) state for transition </summary>
		/// <returns> Begin(initial) state for transition 
		/// </returns>
		IState getFromState();
		
		/// <summary> Destination state for transition</summary>
		/// <returns> Destination state for transition
		/// </returns>
		IState getToState();
		
		/// <summary> Add listener to the transition notification list</summary>
		/// <param name="listener">Own implements of listener
		/// </param>
		void  addStateChangeListener(IStateChangeListener listener);
		
		/// <summary> Delete listener from the transition notification list</summary>
		/// <param name="listener">Own implements of listener
		/// </param>
		void  delStateChangeListener(IStateChangeListener listener);
		
		/// <summary> Fire the event when changing state to transition notification list</summary>
		/// <returns> true, if changes is accepted by listeners, else false
		/// </returns>
		bool fireStateChangingEvent();
		
		/// <summary> Fire the event when changed state to transition notification list</summary>
		void  fireStateChangedEvent();
	}
}