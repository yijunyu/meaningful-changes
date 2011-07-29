//==============================================================================
//	File:		$URL: svn+ssh://repositorypub@repository.eecs.berkeley.edu/public/Projects/GateLib/branches/dev/Firmware/DRAM/Hardware/DRAMExaminer.v $
//	Version:	$Revision: 12135 $
//	Author:		Greg Gibeling (http://gdgib.gotdns.com/~gdgib/)
//	Copyright:	Copyright 2005-2008 UC Berkeley
//==============================================================================

//==============================================================================
//	Section:	License
//==============================================================================
//	Copyright (c) 2005-2008, Regents of the University of California
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
//	Module:		DRAMExaminer
//	Desc:		...
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
//	Author:		<a href="http://gdgib.gotdns.com/~gdgib/">Greg Gibeling</a>
//	Version:	$Revision: 12135 $
//------------------------------------------------------------------------------
module	DRAMExaminer(
			//------------------------------------------------------------------
			//	Clock & Reset Inputs
			//------------------------------------------------------------------
			Clock,
			Reset,
			//------------------------------------------------------------------
			
			//------------------------------------------------------------------
			//	Network Interfaces
			//------------------------------------------------------------------
			NetCommand,
			NetCommandValid,
			NetCommandReady,
			
			NetIn,
			NetInValid,
			NetInReady,
			
			NetOut,
			NetOutValid,
			NetOutReady,
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
	//	Constants
	//--------------------------------------------------------------------------
	parameter				UWidth =				8,
							AWidth =				28,	// 256MU
							MWidth =				16,	// 128b/8 = 16b per mask
							DWidth =				UWidth * MWidth, // 128b transfers
							BurstLen =				2,	// 256b total burst
							CommandMask =			7'b0000011, // Read & Write only
							ECheck =				0,	// No error checking
							ECorrect =				0,	// No error correction
							NWidth =				32,
							NLWidth =				4,
							NRWidth =				NWidth - NLWidth,
							NDepth =				4,
							NFWLatency =			1,
							NBWLatency =			1;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Fixed Constants
	//--------------------------------------------------------------------------
	`ifdef MACROSAFE
	localparam				XNRWidth =				`max(NRWidth,1),
							CWidth =				3,
							EHWidth =				`min(`log2(ECheck), 1),
							ERWidth =				`min(`log2(ECheck), 1),
							NBurstLen =				BurstLen * (((EHWidth + ERWidth + DWidth) / NWidth) + (((EHWidth + ERWidth + DWidth) % NWidth) != 0 ? 1 : 0)),
							NBCWidth =				`log2(NBurstLen);
	`endif
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Clock & Reset Inputs
	//--------------------------------------------------------------------------
	input					Clock, Reset;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Network Interface
	//--------------------------------------------------------------------------
	input	[NWidth-1:0]	NetCommand;
	input					NetCommandValid;
	output					NetCommandReady;
	
	input	[NWidth-1:0]	NetIn;
	input					NetInValid;
	output					NetInReady;
	
	output	[NWidth-1:0]	NetOut;
	output					NetOutValid;
	input					NetOutReady;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Command Interface
	//--------------------------------------------------------------------------
	output	[AWidth-1:0]	CommandAddress;
	output	[CWidth-1:0]	Command; 
	output					CommandValid;
	input					CommandReady;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Data Input (Write) Interface
	//--------------------------------------------------------------------------
	output	[DWidth-1:0]	DataIn;
	output	[MWidth-1:0]	DataInMask;
	output					DataInValid;
	input					DataInReady;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Data Output (Read) Interface
	//--------------------------------------------------------------------------
	input	[DWidth-1:0]	DataOut;
	input	[EHWidth-1:0]	DataOutErrorChecked;
	input	[ERWidth-1:0]	DataOutErrorCorrected;
	input					DataOutValid;
	output					DataOutReady;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Wires
	//--------------------------------------------------------------------------
	wire	[NRWidth+CWidth+AWidth-1:0]	CommandComplete;
	generate if (NRWidth > 0) begin
		wire [NRWidth-1:0]	ReturnRouteIn;
	end endgenerate
	wire					ReturnRouteInValid, ReturnRouteInReady;
	wire	[XNRWidth:0]	ReturnRouteOut;
	wire					ReturnRouteOutValid, ReturnRouteOutReady;
	
	generate if (NBCWidth > 0) begin
		wire [NBCWidth-1:0]	NetBurstCount;
	end endgenerate
	wire					NetBurstMax;
	
	wire	[NWidth-1:0]	ShiftOut;
	wire					ShiftOutValid, ShiftOutReady;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Command Shifter
	//--------------------------------------------------------------------------
	FIFOShifter		CmdShft(	.Clock(				Clock),
								.Reset(				Reset),
								.InData(			NetCommand[`min(NWidth, NRWidth + CWidth + AWidth)-1:0]),
								.InValid(			NetCommandValid),
								.InAccept(			NetCommandReady),
								.OutData(			CommandComplete),
								.OutValid(			CommandValid),
								.OutReady(			ReturnRouteInReady & CommandReady));
	defparam		CmdShft.IWidth =				`min(NWidth, NRWidth + CWidth + AWidth);
	defparam		CmdShft.OWidth =				NRWidth + CWidth + AWidth;
	defparam		CmdShft.Reverse =				1;
	defparam		CmdShft.Bottom =				1;
	defparam		CmdShft.Class1 =				0;
	assign	ReturnRouteInValid =					CommandValid;
	generate if (NRWidth > 0) begin
		assign	{ReturnRouteIn, Command, CommandAddress} = CommandComplete;
	end else begin
		assign	{Command, CommandAddress} =			CommandComplete;
	end endgenerate
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	DataIn Shifter
	//--------------------------------------------------------------------------
	FIFOShifter		DInShft(	.Clock(				Clock),
								.Reset(				Reset),
								.InData(			NetIn[`min(NWidth, MWidth+DWidth)-1:0]),
								.InValid(			NetInValid),
								.InAccept(			NetInReady),
								.OutData(			{DataInMask, DataIn}),
								.OutValid(			DataInValid),
								.OutReady(			DataInReady));
	defparam		DInShft.IWidth =				`min(NWidth, MWidth + DWidth);
	defparam		DInShft.OWidth =				MWidth + DWidth;
	defparam		DInShft.Reverse =				1;
	defparam		DInShft.Bottom =				1;
	defparam		DInShft.Class1 =				0;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	DataOut Shifter
	//--------------------------------------------------------------------------
	FIFOShifter		DOutShft(	.Clock(				Clock),
								.Reset(				Reset),
								.InData(			{DataOutErrorChecked, DataOutErrorCorrected, DataOut}),
								.InValid(			DataOutValid),
								.InAccept(			DataOutReady),
								.OutData(			ShiftOut[`min(NWidth, EHWidth+ERWidth+DWidth)-1:0]),
								.OutValid(			ShiftOutValid),
								.OutReady(			ShiftOutReady));
	defparam		DOutShft.IWidth =				EHWidth + ERWidth + DWidth;
	defparam		DOutShft.OWidth =				`min(NWidth, EHWidth + ERWidth + DWidth);
	defparam		DOutShft.Reverse =				1;
	defparam		DOutShft.Bottom =				1;
	defparam		DOutShft.Class1 =				0;
	generate if (NWidth > (EHWidth+ERWidth+DWidth)) begin
		assign	ShiftOut[NWidth-1:EHWidth+ERWidth+DWidth] = 0;
	end endgenerate
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Return Route FIFO
	//--------------------------------------------------------------------------
	generate if (NRWidth > 0) begin
		FIFORegister	RRFIFO(		.Clock(				Clock),
									.Reset(				Reset),
									.InData(			ReturnRouteIn),
									.InValid(			ReturnRouteInValid),
									.InAccept(			ReturnRouteInReady),
									.OutData(			ReturnRouteOut),
									.OutValid(			ReturnRouteOutValid),
									.OutReady(			ReturnRouteOutReady));
		defparam		RRFIFO.Width =					NRWidth;
	end else begin
		assign	ReturnRouteInReady =					1'b1;
		assign	ReturnRouteOutValid =					1'b1;
		assign	ReturnRouteOut =						1'b0;
	end endgenerate
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Burst Counter
	//--------------------------------------------------------------------------
	generate if (NBCWidth > 0) begin
		Counter		NetBurstCnt(.Clock(				Clock),
								.Reset(				Reset),
								.Set(				1'b0),
								.Load(				1'b0),
								.Enable(			ShiftOutValid & ReturnRouteOutValid & ShiftOutReady),
								.In(				{NBCWidth{1'bx}}),
								.Count(				NetBurstCount));
		defparam	NetBurstCnt.Width = 			NBCWidth;
		CountCompare NetBurstCmp(.Count(			NetBurstCount),
								.TerminalCount(		NetBurstMax));
		defparam	NetBurstCmp.Width = 			NBCWidth;
		defparam	NetBurstCmp.Compare =			NBurstLen-1;
	end else begin
		assign	NetBurstMax =						1'b1;
	end endgenerate
	assign	ReturnRouteOutReady =					ShiftOutReady & NetBurstMax;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Data Out Packet Assembler
	//--------------------------------------------------------------------------
	PacketAssembler	DOPA(		.Clock(				Clock),
								.Reset(				Reset),
								.InData(			ShiftOut),
								.InRoute(			ReturnRouteOut),
								.InUseful(			1'b1),
								.InValid(			ShiftOutValid & ReturnRouteOutValid),
								.InReady(			ShiftOutReady),
								.PacketValid(		NetBurstMax & ShiftOutValid & ReturnRouteOutValid),
								.PacketReady(		),
								.OutData(			NetOut),
								.OutValid(			NetOutValid),
								.OutReady(			NetOutReady));
	defparam		DOPA.Width =					NWidth;
	defparam		DOPA.RWidth =					NRWidth;
	defparam		DOPA.LWidth =					NLWidth;
	defparam		DOPA.Depth =					NDepth;
	defparam		DOPA.FWLatency =				NFWLatency;
	defparam		DOPA.BWLatency =				NBWLatency;
	//--------------------------------------------------------------------------
endmodule	
//------------------------------------------------------------------------------
