//==============================================================================
//	File:		$URL: svn+ssh://repositorypub@repository.eecs.berkeley.edu/public/Projects/GateLib/branches/dev/Firmware/DRAM/Hardware/DRAM.v $
//	Version:	$Revision: 21693 $
//	Author:		Greg Gibeling (http://www.gdgib.com)
//	Copyright:	Copyright 2005-2009 UC Berkeley
//==============================================================================

//==============================================================================
//	Section:	License
//==============================================================================
//	Copyright (c) 2005-2009, Regents of the University of California
//	All rights reserved.
//
//	Redistribution and use in source and binary forms, with or without modification,
//	are permitted provided that the following conditions are met:
//
//		- Redistributions of source code must retain the above copyright notice,
//			this list of conditions and the following disclaimer.
//		- Redistributions in binary form must reproduce the above copyright
//			notice, this list of conditions and the following disclaimer
//			in the documentation and/or other materials provided with the
//			distribution.
//		- Neither the name of the University of California, Berkeley nor the
//			names of its contributors may be used to endorse or promote
//			products derived from this software without specific prior
//			written permission.
//
//	THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
//	ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
//	WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
//	DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
//	ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
//	(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
//	LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
//	ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
//	(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
//	SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
//==============================================================================

//==============================================================================
//	Includes
//==============================================================================
`include "Const.v"
//==============================================================================

//------------------------------------------------------------------------------
//	Module:		DRAM
//	Desc:		This module is the shell interface for a general DRAM interface.
//				The only interface difference between this module and any DRAM
//				interface should be the clock and reset signals, which are
//				often dependent on the physical board level interface.
//
//				Aside from the Initialized signal, this interface is design
//				as a series of three FIFOs, all synchronous to Clock.  Two of
//				them are the inputs for Command and DataIn (write) and the third
//				is the output for DataOut (read).  Note that DRAM controllers
//				should include some actual buffering space, obviating the need
//				for external FIFOs, though they may be used if required by the
//				application.
//
//				Notice that this interface also includes a number of parameters
//				some of which are global, and therefore may not be changed from
//				implementation to implementation.  However some of them,
//				particularly those related to the memory size will change from
//				DIMM to DIMM even.
//	Params:		UWidth:	The width of a single addressable unit of memory.
//						Generally a byte, but not always.
//				AWidth:	The width of the CommandAddress input, which determines
//						the amount of addressable memory.
//				DWidth:	The width of the data input and output.  Note that
//						this may be smaller than a single DRAM burst transfer.
//						This must be an integer multiple of the UWidth.
//				MWidth:	The number of DataInMask input; the number of individual
//						mask lines.  Will often be DWidth/UWidth for a unit
//						(byte) maskable memory.
//				BurstLen: The number of DWidth wide words per DRAM operation.
//						This parameter has no prescribed relationship to the
//						DRAM burst length, and exists merely to reduce DWidth.
//				CommandMask: A mask showing which commands (see below) which
//						this memory is prepared to accept.  Note that every
//						memory should be prepared to service read commands and
//						most will accept write commands.
//				ECheck:	How many bit-errors per DWidth bits does this memory
//						controller check for?
//				ECorrect: How many bit-errors per DWidth bits does this memory
//						controller correct for?
//				CWidth:	The width of the Command input.  Fixed across all
//						implementations.
//				COMMAND_Write: Write a burst of DWidth*BurstLen bits to
//						memory.
//				COMMAND_Read: Read a burst from memory.  The exact read
//						latency is unspecified, but 1-30 cycles should be
//						considered reasonable.
//				COMMAND_Flush: Flush all write commands and generate a
//						fake read response when complete.  This command comes
//						in particularly handy when the memory interface is
//						shared through an arbiter.
//				COMMAND_Refresh: Refresh a specific memory location.  Most
//						DRAM controllers should not support this command as
//						they should internally handle refresh.
//				COMMAND_AutoRefresh: Refresh the entire DRAM contents.  Most
//						DRAM controllers should not support this command as
//						they should internally handle refresh.
//				COMMAND_PowerDown: Enter a power-down state.  Should not lose
//						information however.  Commands should be queued or
//						simply not accepted (CommandReady de-asserted) until
//						power up.
//				COMMAND_PowerUp: Re-enter the full-power state.
//				EHWidth:The width of the DataOutErrorChecked output.  Cannot
//						be less than 1 to avoid synthesis errors.
//				ERWidth:The width of the DataOutErrorCorrected output.  Cannot
//						be less than 1 to avoid synthesis errors.
//	Inputs:		Clock:	Standard clock.  All interface signals should be
//						synchronous to this clock.  Note that the memory will
//						be run from this clock.
//				ClockD2: The divided-by-2 version of Clock.
//				ClockP90: The 90 degree phase shifted version of Clock.
//				Reset:	An active high reset synchronous to Clock.
//				Locked:	Clock lock/valid indicator for Clock, can come e.g.
//						from a Xilinx DLL or DCM.
//				ClockF200: A 200MHz clock.  Currently necessary for Xilinx DDR2
//						DRAM.  Not clear how this signal will survive the
//						generalization of this interface.
//				CommandAddress: The address to read, write or refresh.
//				Command: The command to perform, see the COMMAND_ constants.
//				CommandValid: Indicates that the Command and CommandAddress
//						inputs are valid.  See the FIFO interface docs.
//				DataIn:	Data input for writes.  Note that only write commands
//						will pay attention to this interface.
//				DataInMask: Mask values controlling which parts of DataIn are
//						actually written to the DRAM.  The granularity of these
//						signals may vary from controller to controller.
//				DataInValid: Indicates that the DataIn and DataInMask
//						inputs are valid.  See the FIFO interface docs.
//				DataOutReady: Indicates that the DataOut output is valid.
//						Note that this may indicate the result of a read is
//						ready or that a flush has completed. See the FIFO
//						interface docs.
//	Outputs:	Initialized: Indicates that the DRAM is initialized and ready
//						to accept commands after a Reset.
//				PoweredUp: Indicates that the DRAM is fully active and ready
//						to service read and write requests.  Note that the
//						memory may power down for reasons other than a
//						COMMAND_PowerDown.  In particular when another port to
//						a shared DRAM issues this command.  In that case any
//						outstanding commands will be queued.
//				CommandReady: Indicates that the Command and CommandAddress
//						values are being accepted.  See the FIFO interface docs.
//				DataInReady: Indicates that the DataIn and DataInMask values
//						are being accepted.  See the FIFO interface docs.
//				DataOut:	Data output for reads.  Note that this bus will be
//						set to garbage values (one burst long) as a result of
//						a COMMAND_Flush.
//				DataOutErrorChecked: How many errors were found in the current
//						DataOut value, which were not corrected?  A non-zero
//						value indicates that DataOut contains data other than
//						what was actually written to memory.
//				DataOutErrorCorrected: How many errors were found in the current
//						DataOut value which HAVE been corrected?  This value
//						may, of course, be ignored as the errors have been
//						corrected.
//				DataOutValid: Indicates that the DataOut output is valid.
//						See the FIFO interface docs.
//	Author:		<a href="http://www.gdgib.com/">Greg Gibeling</a>
//	Version:	$Revision: 21693 $
//------------------------------------------------------------------------------
module	DRAM(
			//------------------------------------------------------------------
			//	Clock & Reset Inputs
			//------------------------------------------------------------------
			Clock,
			ClockD2,
			ClockP90,
			Reset,
			Locked,
			ClockF200,
			//------------------------------------------------------------------
	
			//------------------------------------------------------------------
			//	Status Outputs
			//------------------------------------------------------------------
			Initialized,
			PoweredUp,
			//------------------------------------------------------------------
	
			//------------------------------------------------------------------
			//	Command Interface
			//------------------------------------------------------------------
			CommandAddress,
			Command,
			CommandValid,
			CommandReady,
			//------------------------------------------------------------------
	
			//------------------------------------------------------------------
			//	Data Input (Write) Interface
			//------------------------------------------------------------------
			DataIn,
			DataInMask,
			DataInValid,
			DataInReady,
			//------------------------------------------------------------------
	
			//------------------------------------------------------------------
			//	Data Output (Read) Interface
			//------------------------------------------------------------------
			DataOut,
			DataOutErrorChecked,
			DataOutErrorCorrected,
			DataOutValid,
			DataOutReady
			//------------------------------------------------------------------
	);
	//--------------------------------------------------------------------------
	//	Per-Instance Constants
	//--------------------------------------------------------------------------
	localparam				UWidth =				8, // The size of the addressable unit
							AWidth =				28,	// 256MUnits
							DWidth =				128, // 128b transfers
							MWidth =				DWidth / UWidth, // 128b/8 = 16b per mask, per unit masking
							BurstLen =				2,	// 256b total burst
							CommandMask =			7'b0000011, // Read & Write only
							ECheck =				0,	// No error checking
							ECorrect =				0;	// No error correction
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Fixed Constants
	//--------------------------------------------------------------------------
	`ifdef MACROSAFE
	localparam				CWidth =				3,
							COMMAND_Write =			3'b000,
							COMMAND_Read =			3'b001,
							COMMAND_Flush =			3'b010,
							COMMAND_Refresh =		3'b011,
							COMMAND_AutoRefresh =	3'b100,
							COMMAND_PowerDown =		3'b101,
							COMMAND_PowerUp =		3'b110,
							EHWidth =				`max(`log2(ECheck+1), 1),
							ERWidth =				`max(`log2(ECorrect+1), 1);
	`endif
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Clock & Reset Inputs
	//--------------------------------------------------------------------------
	input					Clock, ClockD2, ClockP90, Reset, Locked;
	input					ClockF200;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Status Outputs
	//--------------------------------------------------------------------------
	output					Initialized;
	output					PoweredUp;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Command Interface
	//--------------------------------------------------------------------------
	input	[AWidth-1:0]	CommandAddress;
	input	[CWidth-1:0]	Command; 
	input					CommandValid;
	output					CommandReady;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Data Input (Write) Interface
	//--------------------------------------------------------------------------
	input	[DWidth-1:0]	DataIn;
	input	[MWidth-1:0]	DataInMask;
	input					DataInValid;
	output					DataInReady;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Data Output (Read) Interface
	//--------------------------------------------------------------------------
	output	[DWidth-1:0]	DataOut;
	output	[EHWidth-1:0]	DataOutErrorChecked;
	output	[ERWidth-1:0]	DataOutErrorCorrected;
	output					DataOutValid;
	input					DataOutReady;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Checks
	//--------------------------------------------------------------------------
	`ifdef MODELSIM
		initial if ((DWidth % UWidth) != 0) $display("ERROR: Data transfer width must be a multiple of the unit width: ", DWidth, " is not a multiple of ", UWidth);
		always @ (posedge Clock) begin
			if (CommandReady & CommandValid & ~((CommandMask >> Command) & 1'b1)) $display("ERROR: Unsupported memory command: ", Command);
		end
	`endif
	//--------------------------------------------------------------------------
endmodule	
//------------------------------------------------------------------------------
