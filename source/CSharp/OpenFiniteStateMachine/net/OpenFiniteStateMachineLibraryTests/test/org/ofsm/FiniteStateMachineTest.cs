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
using org.ofsm;
using org.ofsm.impl;
using csUnit;
namespace test.org.ofsm
{

    [TestFixture]
	public class FiniteStateMachineTest
	{
        [Test]
		public virtual void  testMachine()
		{
            System.IO.Stream stream = null;
			try
			{
				IFiniteStateMachine machine = FiniteStateMachineFactory.getInstance().newBuilder().getMachine();
                Assert.NotNull(machine);
                stream  = new System.IO.FileStream("test.ofsm.xml", System.IO.FileMode.Open);
				machine = FiniteStateMachineFactory.getInstance().newBuilder().getMachine("test.ofsm.xml", stream);
                Assert.NotNull(machine);
                Assert.NotNull(machine.fireEvent("TestEvent"));
                Assert.NotNull(machine.getCurrentState());
                Assert.Equals(machine.getCurrentState().getName(), "Fail");
                Assert.NotNull(machine.fireEvent("TestEvent"));
                Assert.NotNull(machine.getCurrentState());
                Assert.Equals(machine.getCurrentState().getName(), "Fail");
                Assert.NotNull(machine.fireEvent("TestEvent2"));
                Assert.NotNull(machine.getCurrentState());
                Assert.Equals(machine.getCurrentState().getName(), "Success");
                Assert.NotNull(machine.fireEvent("TestEvent2"));
                Assert.NotNull(machine.getCurrentState());
                Assert.Equals(machine.getCurrentState().getName(), "Success");
                Assert.NotNull(machine.fireEvent("TestEvent"));
                Assert.NotNull(machine.getCurrentState());
                Assert.Equals(machine.getCurrentState().getName(), "Fail");
                Assert.Null(machine.fireEvent("UnknownTestEvent"));
                Assert.Null(machine.getCurrentState());
			}
			catch (System.Exception ex)
			{
				Assert.Fail(ex.Message);
			}
            finally
            {
                if (stream != null)
                    stream.Close();
            }

		}
	}
}