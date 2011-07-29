//==============================================================================
//	File:		$URL: svn+ssh://repositorypub@repository.eecs.berkeley.edu/public/Projects/GateLib/branches/dev/Firmware/DRAM/Hardware/DRAMArbiter.v $
//	Version:	$Revision: 11174 $
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
//	Module:		DRAMArbiter
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
//	Version:	$Revision: 11174 $
//------------------------------------------------------------------------------
module	DRAMArbiter(
			//------------------------------------------------------------------
			//	Clock & Reset Inputs
			//------------------------------------------------------------------
			Clock,
			Reset,
			//------------------------------------------------------------------
	
			//------------------------------------------------------------------
			//	Command Interface
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
			//	Data Input (Write) Interface
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
			//	Data Output (Read) Interface
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
	localparam				AWidth =				28,	// 256MB
							DWidth =				128, // 128b transfers
							MWidth =				16,	// 128b/8 = 16b per mask
							BurstLen =				2,	// 128b total burst
							CommandMask =			7'b0000011, // Read & Write only
							ECheck =				0,	// No error checking
							ECorrect =				0,	// No error correction
							NPorts =				1,	// Number of DRAM ports
							ArbiterPolicy =			0,	// Policy:	0 - Round Robin, 1 - Priority Logic, 2 - Select Any (Don't Care, fast implementation)
							FWLatency =				1,	// FIFO parameters for tag FIFO
							Buffering =				16,
							BWLatency =				1;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Fixed Constants
	//--------------------------------------------------------------------------
	`ifdef MACROSAFE
	localparam				CWidth =				3,
							EHWidth =				`min(`log2(ECheck), 1),
							ERWidth =				`min(`log2(ECheck), 1),
							TWidth =				`log2(NPorts),
							BCWidth =				`log2(BurstLen);
	`endif
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Clock & Reset Inputs
	//--------------------------------------------------------------------------
	input					Clock, Reset;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Command Interface
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
	//	Data Input (Write) Interface
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
	//	Data Output (Read) Interface
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
	wire	[NPorts-1:0]	ManyReady, ManyValid, MaySelect;
	wire					OneReady, OneValid;
	
	wire	[BCWidth-1:0]	BurstCount;
	wire					BurstEnd;
	
	wire	[TWidth-1:0]	TagIn, TagOut;
	wire					TagInValid, TagInReady, TagOutValid, TagOutReady;
	
	genvar					i;
	wire	[NPorts-1:0]	OutSelect;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Input Mux
	//--------------------------------------------------------------------------
	assign	ManyValid =								MultiDataInValid & (MultiCommandValid | {NPorts{|BurstCount}});
	assign	MultiDataInReady =						ManyReady;
	assign	MultiCommandReady =						{NPorts{~|BurstCount}} & ManyReady;
	
	assign	DataInValid =							OneValid;
	assign	CommandValid =							(~|BurstCount) & OneValid;
	assign	TagInValid =							OneValid;
	assign	OneReady =								DataInReady & (CommandReady | (|BurstCount)) & TagInReady;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Arbiter
	//--------------------------------------------------------------------------
	Arbiter			Arbiter(	.Clock(				Clock),
								.Reset(				Reset),
								.ManyReady(			ManyReady),
								.ManyValid(			ManyValid),
								.ManySelect(		ManySelect),
								.Locked(			),
								.OneReady(			OneReady),
								.OneValid(			OneValid));
	defparam		Arbiter.NPorts = 				NPorts;
	defparam		Arbiter.Policy =				ArbiterPolicy;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Burst Counter
	//--------------------------------------------------------------------------
	Counter			BurstCnt(	.Clock(				Clock),
								.Reset(				Reset | (OneReady & OneValid & BurstEnd)),
								.Set(				1'b0),
								.Load(				1'b0),
								.Enable(			OneReady & OneValid),
								.In(				{BCWidth{1'bx}}),
								.Count(				BurstCount));
	defparam		BurstCnt.Width =				BCWidth;
	CountCompare	BurstCmp(	.Count(				BurstCount),
								.TerminalCount(		BurstEnd));
	defparam		BurstCmp.Width = 				BCWidth;
	defparam		BurstCmp.Compare =				BurstLen - 1;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Convert Select to Tag
	//--------------------------------------------------------------------------
	OneHot2Bin		O2B(		.OneHot(			ManySelect),
								.Bin(				TagIn));
	defparam		O2B.Width =						NPorts;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Tag FIFO
	//--------------------------------------------------------------------------
	FIFORAM			TagFIFO(	.Clock(				Clock),
								.Reset(				Reset),
								.InData(			TagIn),
								.InValid(			TagInValid),
								.InAccept(			TagInReady),
								.InEmptyCount(		),
								.OutData(			TagOut),
								.OutSend(			TagOutValid),
								.OutReady(			TagOutReady),
								.OutFullCount(		));
	defparam		TagFIFO.Width =					TWidth;
	defparam		TagFIFO.FWLatency =				FWLatency;
	defparam		TagFIFO.Buffering =				Buffering;
	defparam		TagFIFO.BWLatency =				BWLatency;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Convert Tag to Select
	//--------------------------------------------------------------------------
	Bin2OneHot		B2O(		.Bin(				TagOut),
								.OneHot(			OutSelect));
	defparam		B2O.Width =						NPorts;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Output Demux
	//--------------------------------------------------------------------------
	generate for (i = 0; i < NPorts; i = i + 1) begin:OUTPUTS
		assign	MultiDataOut[(DWidth*i)+DWidth-1:DWidth*i] = DataOut;
		assign	MultiDataOutErrorChecked[(EHWidth*i)+EHWidth-1:EHWidth*i] = DataOutErrorChecked;
		assign	MultiDataOutErrorCorrected[(ERWidth*i)+ERWidth-1:ERWidth*i] = DataOutErrorCorrected;
	end endgenerate
	
	assign	MultiDataOutValid =						OutSelect & {NPorts{DataOutValid}};
	assign	DataOutReady =							|(MultiDataOutReady & OutSelect);
	//--------------------------------------------------------------------------
endmodule	
//------------------------------------------------------------------------------
