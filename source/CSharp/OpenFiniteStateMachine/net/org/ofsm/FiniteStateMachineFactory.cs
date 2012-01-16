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
using FiniteStateMachineBuilder = org.ofsm.impl.FiniteStateMachineBuilder;

namespace org.ofsm
{
	
	/// <summary> Factory for create a finite state machine builder.
	/// 
	/// <p>Example of use:</p>
	/// <pre>
	/// ...
	/// IFiniteStateMachineBuilder builder = FiniteStateMachineFactory.getInstance().getBuilder();
	/// ...
	/// </pre>
	/// </summary>
	public class FiniteStateMachineFactory
	{
        private const string version = "1.0.0b";
        private static FiniteStateMachineFactory instance = new FiniteStateMachineFactory();

		/// <summary> Access to single instance of factory (Singleton concepts)</summary>
		/// <returns> factory
		/// </returns>
		public static FiniteStateMachineFactory getInstance()
		{
			return instance;
		}
		/// <summary> Get the version of OFSM library. </summary>
		/// <returns> version of library
		/// </returns>
		virtual public string getVersion()
		{
			return version;
		}

		protected internal FiniteStateMachineFactory()
		{
		}
				
		/// <summary> Create new machine builder object
		/// </summary>
		public virtual IFiniteStateMachineBuilder newBuilder()
		{
			return new FiniteStateMachineBuilder();
		}
	}
}