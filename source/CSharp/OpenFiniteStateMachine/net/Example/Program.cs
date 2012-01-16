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
using System.Text;
using org.ofsm;

namespace org.ofsm.Examples
{
    class HelloWorld
    {
        private void doIt() {
            System.IO.Stream stream = null;

            try
            {
                stream = new System.IO.FileStream("example.ofsm.xml", System.IO.FileMode.Open);
                // Creating machine builder
                IFiniteStateMachineBuilder bldr = FiniteStateMachineFactory.getInstance().newBuilder();

                // Creating the finite state machine for resource stream
                IFiniteStateMachine machine = bldr.getMachine("example.ofsm.xml", stream);

                // Get and print inital state
                Console.WriteLine("Initial state:" + machine.getInitialState());

                // Fire the events and print current state
                Console.WriteLine("State: " + machine.fireEvent("ReceivedRequest").getName());
                Console.WriteLine("State: " + machine.fireEvent("ChargingRequest").getName());
                // Fire incorrect (unspecified by model) event and check the currentstate is null (invalid)
                Console.WriteLine("State: " + ((machine.fireEvent("CancelRequest") == null) ? "Ok (null)":"Logic error!!!"));

                // Reset the machine
                machine.reset();

            }
            catch (Exception ex)
            {
                Console.WriteLine(ex);
            }
            finally
            {
                if (stream != null)
                {
                    stream.Close();
                }
            }
        }

        static void Main(string[] args)
        {
            new HelloWorld().doIt();
        }
    }
}
