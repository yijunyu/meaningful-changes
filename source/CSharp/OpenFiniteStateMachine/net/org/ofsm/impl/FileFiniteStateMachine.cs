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
	public class FileFiniteStateMachine:FiniteStateMachine, IFiniteStateMachineInitiable
	{		
		private const string machineName = "FileFiniteStateMachine";		
		private const string processCriteriaPattern = ".ofsm.xml";
		private Uri initByResource;
		private System.IO.Stream initByStream;
		private FileFiniteStateMachineModel model = new FileFiniteStateMachineModel();
		
		public override string getName()
		{
			return machineName;
		}
		
		public virtual bool mayProcessed(Uri location)
		{
            if (location.AbsolutePath.Contains(processCriteriaPattern))
				return true;
			else
				return false;
		}
		
		public virtual bool mayProcessed(string streamName)
		{
			if (streamName.Contains(processCriteriaPattern))
				return true;
			else
				return false;
		}
		
		public virtual void  init(System.IO.Stream stream)
		{
			initByStream = stream;
			unmarshal(initByStream);
		}
				
        public virtual void init(Uri location)
		{
			lock (this)
			{
				this.clearTransitions();
                initByResource = location;
				System.IO.Stream stream = null;                
				if (initByResource.Scheme.Equals("file", StringComparison.OrdinalIgnoreCase))
				{
					string fileName = location.AbsolutePath;
					stream = new System.IO.FileStream(new System.IO.FileInfo(fileName).FullName, System.IO.FileMode.Open, System.IO.FileAccess.Read);
				}
				else
				{
					stream = System.Net.WebRequest.Create(initByResource).GetResponse().GetResponseStream();
				}
				try
				{
					unmarshal(stream);
				}
				finally
				{
                    if(stream!=null)
					    stream.Close();
				}
			}
		}
		
		public override void  reset()
		{
			if (initByResource != null)
				init(initByResource);
			else
				base.reset();
		}
		
		private void  unmarshal(System.IO.Stream stream)
		{
			model.unmarshal(stream);
			setInitialState(model.getInitialState());
            foreach(ICollection<StateTransition> lstItem in model.getTransitionInfos().Values)
			{
				foreach(StateTransition item in lstItem)
				{
					addTransition(item);
				}
			}
		}
	}
}