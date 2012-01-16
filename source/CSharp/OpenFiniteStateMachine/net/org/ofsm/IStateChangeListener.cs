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
	
	/// <summary> This interface is used for creating own listener for changing state events.</summary>
	public interface IStateChangeListener
	{
		/// <summary> Event causes when state changing</summary>
		/// <param name="transition">transition for event
		/// </param>
		/// <returns> Implementation of interface will return false if need decline transition, or true if accept changes.
		/// </returns>
		bool onStateChanging(IStateTransition transition);
		
		/// <summary> Event causes when state has been changed</summary>
		/// <param name="transition">transition for event
		/// </param>
		void  onStateChanged(IStateTransition transition);
	}
}