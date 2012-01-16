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

    /// <summary> The interface describe builder of finite state machines </summary>
	public interface IFiniteStateMachineBuilder
	{
		/// <summary> Get machine implementation by URI (e.g. file:// or http://).
		/// Library contain an implementation that supports network URI (http,ftp, 
		/// and all others that support standard URL). Also a local URI supports too.
		/// <p>Example:</p>
		/// <pre>
		/// // Creating machine builder
		/// IFiniteStateMachineBuilder bldr = FiniteStateMachineFactory.getInstance().newBuilder();
		/// 
		/// // Creating the finite state machine for resource stream
		/// IFiniteStateMachine machine = bldr.getMachine(new java.net.URI("file://usr/local/mymachine.ofsm.xml"));
		/// </pre>
		/// The library supports implementation for a model specified by XML format. This implementation registered a machine by 
		/// type (pattern) *.ofsm.xml. This pattern must be specified in path of URI.
		/// </summary>
		/// <param name="uri">The URI which contain location of machine model
		/// </param>
		/// <returns> Configured finite state machine
		/// </returns>
		IFiniteStateMachine getMachine(Uri uri);
		
		/// <summary> Get machine implementation by stream type and input stream.
		/// The library supports implementation for a model specified by XML format. This implementation registered a machine by 
		/// type (pattern) *.ofsm.xml. This pattern must be specified in streamType param.
		/// <p>Example:</p>
		/// <pre>
		/// // Creating machine builder
		/// IFiniteStateMachineBuilder bldr = FiniteStateMachineFactory.getInstance().newBuilder();
		/// // Creating the finite state machine for resource stream
		/// IFiniteStateMachine machine = bldr.getMachine("example.ofsm.xml",getClass().getResourceAsStream("/org/ofsm/examples/example.ofsm.xml"));
		/// </pre>
		/// </summary>
		/// <param name="streamType">Type of stream identifier
		/// </param>
		/// <param name="stream">Input model as stream
		/// </param>
		/// <returns> Configured finite state machine
		/// </returns>
		IFiniteStateMachine getMachine(string streamType, System.IO.Stream stream);
		
		/// <summary> Get default implementation of finite-state-machine.
		/// This machine does not contain any already configured model.
		/// </summary>
		/// <returns> Finite state machine
		/// </returns>
		IFiniteStateMachine getMachine();
		
		/// <summary> Register FSM implementation</summary>
		/// <param name="machine">Initiable implementation
		/// </param>
		void  addMachine(IFiniteStateMachineInitiable machine);
		
		/// <summary> Register FSM implementation with specified priority (for resolving a conflicts).</summary>
		/// <param name="index">Index of machine at registry (0 - begin)
		/// </param>
		/// <param name="machine">Initiable implementation
		/// </param>
		void  addMachine(int index, IFiniteStateMachineInitiable machine);
		
		/// <summary> Unregister FSM implementation</summary>
		/// <param name="machine">Machine that need unregister
		/// </param>
		void  delMachine(IFiniteStateMachineInitiable machine);
	}
}