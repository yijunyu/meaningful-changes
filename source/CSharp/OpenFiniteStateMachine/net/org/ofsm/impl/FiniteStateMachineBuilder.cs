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
	
	
	public class FiniteStateMachineBuilder : IFiniteStateMachineBuilder
	{
        protected List<IFiniteStateMachineInitiable> initiableMachines = new List<IFiniteStateMachineInitiable>();
        protected internal IFiniteStateMachine defaultMachine = new FiniteStateMachine();

		virtual public IFiniteStateMachine getDefaultMachine()
		{
				return defaultMachine;
		}
		
		
		public FiniteStateMachineBuilder()
		{
			addMachine(new FileFiniteStateMachine());
		}
		
		public virtual IFiniteStateMachine getMachine(Uri uri)
		{
			IFiniteStateMachineInitiable result = null;
			lock (initiableMachines)
			{
				foreach(IFiniteStateMachineInitiable item in initiableMachines)
				{
					if (item.mayProcessed(uri))
					{
						result = item;
						break;
					}
				}
			}
			
			if (result != null)
			{
				result.init(uri);
			}
			return result;
		}
		
		public virtual IFiniteStateMachine getMachine(string streamType, System.IO.Stream stream)
		{
			IFiniteStateMachineInitiable result = null;
			lock (initiableMachines)
			{
				foreach(IFiniteStateMachineInitiable item in initiableMachines)
				{
					if (item.mayProcessed(streamType))
					{
						result = item;
						break;
					}
				}
			}
			if (result != null)
			{
				result.init(stream);
			}
			return result;
		}
		
		
		public virtual IFiniteStateMachine getMachine()
		{
			return getDefaultMachine();
		}
		
		public virtual void  addMachine(IFiniteStateMachineInitiable machine)
		{
			lock (initiableMachines)
			{
				initiableMachines.Add(machine);
			}
		}
		
		public virtual void  addMachine(int index, IFiniteStateMachineInitiable machine)
		{
			lock (initiableMachines)
			{
				initiableMachines.Insert(index, machine);
			}
		}
		
		
		public virtual void  delMachine(IFiniteStateMachineInitiable machine)
		{
			lock (initiableMachines)
			{
				initiableMachines.Remove(machine);
			}
		}
	}
}