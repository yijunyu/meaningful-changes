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
	
	/// <summary> Interface for "initiable" (configurable from resource) Finite State Machines</summary>
	public interface IFiniteStateMachineInitiable:IFiniteStateMachine
	{
		/// <summary> Method which define possibility of processing input URI</summary>
		/// <param name="location">URI contains location  of resource(model)
		/// </param>
		/// <returns> true - if possible, otherwise false
		/// </returns>
		bool mayProcessed(Uri location);
		
		/// <summary> Method which define possibility of processing input type (or name) stream</summary>
		/// <param name="streamName">Type (or name) stream
		/// </param>
		/// <returns> true - if possible, otherwise false
		/// </returns>
		bool mayProcessed(string streamName);
		
		/// <summary> Initialize machine by URI</summary>
		/// <param name="location">URI contains location  of resource(model)
		/// </param>
		void  init(Uri location);
		
		/// <summary> Initialize machin by input stream</summary>
		/// <param name="stream"> A stream contains resource(model)
		/// </param>
		void  init(System.IO.Stream stream);
	}
}