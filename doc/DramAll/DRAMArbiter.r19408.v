//==============================================================================
//	DO NOT MODIFY THIS FILE!  IT HAS BEEN AUTOMATICALLY GENERATED
//	File:		$URL: svn+ssh://repositorypub@repository.eecs.berkeley.edu/public/Projects/GateLib/branches/dev/Firmware/DRAM/Hardware/DRAMArbiter.v $
//	Version:		$Revision: 19408 $
//	Author:		Greg Gibeling
//	Copyright:	Copyright 2007-2009 UC Berkeley
//==============================================================================

//==============================================================================
//	Copyright (c) 2007-2009, Regents of the University of California
//	All rights reserved.
//	
//	Redistribution and use in source and binary forms, with or without modification,
//	are permitted provided that the following conditions are met:
//	
//		 - Redistributions of source code must retain the above copyright notice,
//			 this list of conditions and the following disclaimer. 
//		 - Redistributions in binary form must reproduce the above copyright
//			 notice, this list of conditions and the following disclaimer
//			 in the documentation and/or other materials provided with the
//			 distribution. 
//		 - Neither the name of the University of California, Berkeley nor the
//			 names of its contributors may be used to endorse or promote
//			 products derived from this software without specific prior
//			 written permission. 
//	
//	THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
//	ANY EXPRESS OR IMPLIED WARRA	NTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
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
//	Module:		DRAMArbiter
//	Desc:		This is a class3 DRAM arbiter.  Arbitration cannot be won until
//				the command on a port is known, and if it is a write the first
//				word of data must be available.
//
//	Params:		AWidth:	The width of the CommandAddress input, which determines
//						the amount of addressable memory.
//				DWidth:	The width of the data input and output.  Note that
//						this may be smaller than a single DRAM burst transfer.
//				MWidth:	The number of DataInMask input; the number of individual
//						mask lines.  Will often be DWidth/8 for a byte maskable
//						memory.
//				BurstLen: The number of DWidth wide words per DRAM operation.
//						This parameter has no prescribed relationship to the
//						DRAM burst length, and exists merely to reduce DWidth.
//				ECheck:	How many bit-errors per DWidth bits does this memory
//						controller check for?
//				ECorrect: How many bit-errors per DWidth bits does this memory
//						controller correct for?
//				NPorts:
//				ArbiterPolicy:
//				FWLatency:
//				Buffering:
//				BWLatency:
//				Class1:	If 1, then this arbiter will be a class1 module.  This
//						has important consequences.  Normally the module is
//						class3, and arbitration can only be won for a certain
//						port when the command is valid, and if it's a write
//						the data is ready.  The command port makes the module
//						class3.  For a class1 implementation, the arbiter
//						is based on command readiness only, which may result
//						in deadlock if the write data never arrives.
//	Author:		<a href="http://www.gdgib.combeling</a>
//	Version:	$Revision: 19408 $
//------------------------------------------------------------------------------
module	DRAMArbiter(
			//------------------------------------------------------------------
			//	Clock & Reset Inputs
			//------------------------------------------------------------------
			Clock,
			Reset,
			//------------------------------------------------------------------
			
			//------------------------------------------------------------------
			//	Command Interface (@ Clock)
			//------------------------------------------------------------------
			MultiCommandAddress,
			MultiCommand,
			MultiCommandValid,
			MultiCommandReady,
			
			CommandAddress,
			Command,
			CommandValid,
			CommandReady,
			//------------------------------------------------------------------
	
			//------------------------------------------------------------------
			//	Data Input (Write) Interface (@ Clock)
			//------------------------------------------------------------------
			MultiDataIn,
			MultiDataInMask,
			MultiDataInValid,
			MultiDataInReady,
			
			DataIn,
			DataInMask,
			DataInValid,
			DataInReady,
			//------------------------------------------------------------------
	
			//------------------------------------------------------------------
			//	Data Output (Read) Interface (@ Clock)
			//------------------------------------------------------------------
			MultiDataOut,
			MultiDataOutErrorChecked,
			MultiDataOutErrorCorrected,
			MultiDataOutValid,
			MultiDataOutReady,
			
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
	parameter				AWidth =				28,	// 256MB
							DWidth =				128, // 128b transfers
							MWidth =				16,	// 128b/8 = 16b per mask
							BurstLen =				2,	// 128b total burst
							ECheck =				0,	// No error checking
							ECorrect =				0,	// No error correction
							// Policy:	0 - Round Robin, 1 - Priority Logic, 2 - Select Any (Don't Care, fast implementation)
							ArbiterPolicy =			0,
							FWLatency =				1,	// FIFO parameters for tag FIFO
							Buffering =				16,
							BWLatency =				1,
							Class1 =				0,
							NPorts =				0;	// Number of DRAM ports
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
							ERWidth =				`max(`log2(ECorrect+1), 1),
							CCWidth =				CWidth+AWidth,
							DICWidth =				MWidth+DWidth,
							DOCWidth =				EHWidth+ERWidth+DWidth;
	`endif
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Clock & Reset Inputs
	//--------------------------------------------------------------------------
	input					Clock, Reset;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Command Interface (@ Clock)
	//--------------------------------------------------------------------------
	input [(AWidth*NPorts)-1:0] MultiCommandAddress;
	input [(CWidth*NPorts)-1:0] MultiCommand; 
	input	[NPorts-1:0]	MultiCommandValid;
	output	[NPorts-1:0]	MultiCommandReady;
	
	output	[AWidth-1:0]	CommandAddress;
	output	[CWidth-1:0]	Command; 
	output					CommandValid;
	input					CommandReady;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Data Input (Write) Interface (@ Clock)
	//--------------------------------------------------------------------------
	input [(DWidth*NPorts)-1:0] MultiDataIn;
	input [(MWidth*NPorts)-1:0] MultiDataInMask;
	input	[NPorts-1:0]	MultiDataInValid;
	output	[NPorts-1:0]	MultiDataInReady;
	
	output	[DWidth-1:0]	DataIn;
	output	[MWidth-1:0]	DataInMask;
	output					DataInValid;
	input					DataInReady;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Data Output (Read) Interface (@ Clock)
	//--------------------------------------------------------------------------
	output [(DWidth*NPorts)-1:0] MultiDataOut;
	output [(EHWidth*NPorts)-1:0] MultiDataOutErrorChecked;
	output [(ERWidth*NPorts)-1:0] MultiDataOutErrorCorrected;
	output	[NPorts-1:0]	MultiDataOutValid;
	input	[NPorts-1:0]	MultiDataOutReady;
	
	input	[DWidth-1:0]	DataOut;
	input	[EHWidth-1:0]	DataOutErrorChecked;
	input	[ERWidth-1:0]	DataOutErrorCorrected;
	input					DataOutValid;
	output					DataOutReady;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Wires
	//--------------------------------------------------------------------------
	wire	[MWidth+DWidth-1:0] DataInComplete;
	wire	[EHWidth+ERWidth+DWidth-1:0] DataOutComplete;
	
	wire	[(CCWidth*NPorts)-1:0] MultiCommandComplete;
	wire	[NPorts-1:0]	MultiCommandRead, MultiCommandWrite;
	wire	[(DICWidth*NPorts)-1:0] MultiDataInComplete;
	wire	[(DOCWidth*NPorts)-1:0] MultiDataOutComplete;
	
	genvar					i;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Assigns
	//--------------------------------------------------------------------------
	generate if (MWidth > 0) begin:DIMASK
		assign	{DataInMask, DataIn} =				DataInComplete;
	end else begin:DINOMASK
		assign	DataIn =							DataInComplete;
	end endgenerate
	
	assign	DataOutComplete[DWidth-1:0] =			DataOut;
	generate if (ERWidth > 0) begin:ERGEN
		assign	DataOutComplete[ERWidth+DWidth-1:DWidth] = DataOutErrorCorrected;
	end endgenerate
	generate if (EHWidth > 0) begin:EHGEN
		assign	DataOutComplete[EHWidth+ERWidth+DWidth-1:ERWidth+DWidth] = DataOutErrorChecked;
	end endgenerate
	
	generate for (i = 0; i < NPorts; i = i + 1) begin:WIRING
		assign	MultiCommandComplete[(CCWidth*i)+CCWidth-1:(CCWidth*i)] =		{MultiCommand[(CWidth*i)+CWidth-1:(CWidth*i)], MultiCommandAddress[(AWidth*i)+AWidth-1:(AWidth*i)]};
		assign	MultiCommandRead[i] =											MultiCommand[(CWidth*i)+CWidth-1:(CWidth*i)] == COMMAND_Read;
		assign	MultiCommandWrite[i] =											MultiCommand[(CWidth*i)+CWidth-1:(CWidth*i)] == COMMAND_Write;
		assign	MultiDataInComplete[(DICWidth*i)+DICWidth-1:(DICWidth*i)] =		{MultiDataInMask[(MWidth*i)+MWidth-1:(MWidth*i)], MultiDataIn[(DWidth*i)+DWidth-1:(DWidth*i)]};
		
		assign	MultiDataOut[(DWidth*i)+DWidth-1:(DWidth*i)] =					MultiDataOutComplete[(DOCWidth*i)+DWidth-1:(DOCWidth*i)];
		assign	MultiDataOutErrorChecked[(EHWidth*i)+EHWidth-1:(EHWidth*i)] =	MultiDataOutComplete[(DOCWidth*i)+DWidth+ERWidth+EHWidth-1:(DOCWidth*i)+DWidth+ERWidth];
		assign	MultiDataOutErrorCorrected[(ERWidth*i)+ERWidth-1:(ERWidth*i)] =	MultiDataOutComplete[(DOCWidth*i)+DWidth+ERWidth-1:(DOCWidth*i)+DWidth];
	end endgenerate
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Arbiter
	//--------------------------------------------------------------------------
	DRAMArbiterInner Inner(		.Clock(				Clock),
								.Reset(				Reset),
								.MultiCommand(		MultiCommandComplete),
								.MultiCommandRead(	MultiCommandRead),
								.MultiCommandWrite(	MultiCommandWrite),
								.MultiCommandValid(	MultiCommandValid),
								.MultiCommandReady(	MultiCommandReady),
								.Command(			{Command, CommandAddress}),
								.CommandRead(		),
								.CommandWrite(		),
								.CommandValid(		CommandValid),
								.CommandReady(		CommandReady),
								.MultiDataIn(		MultiDataInComplete),
								.MultiDataInValid(	MultiDataInValid),
								.MultiDataInReady(	MultiDataInReady),
								.DataIn(			DataInComplete),
								.DataInValid(		DataInValid),
								.DataInReady(		DataInReady),
								.MultiDataOut(		MultiDataOutComplete),
								.MultiDataOutValid(	MultiDataOutValid),
								.MultiDataOutReady(	MultiDataOutReady),
								.DataOut(			DataOutComplete),
								.DataOutValid(		DataOutValid),
								.DataOutReady(		DataOutReady));
	defparam		Inner.CWidth =					CWidth + AWidth;
	defparam		Inner.DIWidth =					MWidth + DWidth;
	defparam		Inner.DOWidth =					EHWidth + ERWidth + DWidth;
	defparam		Inner.BurstLen =				BurstLen;
	defparam		Inner.ArbiterPolicy =			ArbiterPolicy;
	defparam		Inner.FWLatency =				FWLatency;
	defparam		Inner.Buffering =				Buffering;
	defparam		Inner.BWLatency =				BWLatency;
	defparam		Inner.Class1 =					Class1;
	defparam		Inner.NPorts =					NPorts;
	//--------------------------------------------------------------------------
endmodule	
//------------------------------------------------------------------------------
