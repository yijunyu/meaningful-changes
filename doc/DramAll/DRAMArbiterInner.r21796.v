//==============================================================================
//	DO NOT MODIFY THIS FILE!  IT HAS BEEN AUTOMATICALLY GENERATED
//	File:		$URL: svn+ssh://repositorypub@repository.eecs.berkeley.edu/public/Projects/GateLib/branches/dev/Firmware/DRAM/Hardware/DRAMArbiterInner.v $
//	Version:		$Revision: 21796 $
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
//	Module:		DRAMArbiterInner
//	Desc:		This is a class3 or class1 arbiter.  In class3 mode arbitration
//				cannot be won until the command on a port is known, and if it
//				is a write the first word of data must be available.  In class1
//				mode access is arbitrated on the command only.
//
//	Params:		CWidth:	The width of the command payload.
//				DIWidth: The width of the input data payload.
//				DOWidth: The width of the output data payload.
//				BurstLen: The number of data words per burst.
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
//	Version:	$Revision: 21796 $
//------------------------------------------------------------------------------
module	DRAMArbiterInner(
			//------------------------------------------------------------------
			//	Clock & Reset Inputs
			//------------------------------------------------------------------
			Clock,
			Reset,
			//------------------------------------------------------------------
			
			//------------------------------------------------------------------
			//	Command Interface (@ Clock)
			//------------------------------------------------------------------
			MultiCommand,
			MultiCommandRead,
			MultiCommandWrite,
			MultiCommandValid,
			MultiCommandReady,
			
			Command,
			CommandRead,
			CommandWrite,
			CommandValid,
			CommandReady,
			//------------------------------------------------------------------
	
			//------------------------------------------------------------------
			//	Data Input (Write) Interface (@ Clock)
			//------------------------------------------------------------------
			MultiDataIn,
			MultiDataInValid,
			MultiDataInReady,
			
			DataIn,
			DataInValid,
			DataInReady,
			//------------------------------------------------------------------
	
			//------------------------------------------------------------------
			//	Data Output (Read) Interface (@ Clock)
			//------------------------------------------------------------------
			MultiDataOut,
			MultiDataOutValid,
			MultiDataOutReady,
			
			DataOut,
			DataOutValid,
			DataOutReady
			//------------------------------------------------------------------
	);
	//--------------------------------------------------------------------------
	//	Per-Instance Constants
	//--------------------------------------------------------------------------
	parameter				CWidth =				8,
							DIWidth =				8,
							DOWidth =				8,
							BurstLen =				2,	// 128b total burst
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
	localparam				TWidth =				`max(`log2(NPorts), 1),
							BCWidth =				`log2(BurstLen);
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
	input [(CWidth*NPorts)-1:0] MultiCommand;
	input	[NPorts-1:0]	MultiCommandRead, MultiCommandWrite;
	input	[NPorts-1:0]	MultiCommandValid;
	output	[NPorts-1:0]	MultiCommandReady;
	
	output	[CWidth-1:0]	Command;
	output					CommandRead, CommandWrite;
	output					CommandValid;
	input					CommandReady;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Data Input (Write) Interface (@ Clock)
	//--------------------------------------------------------------------------
	input [(DIWidth*NPorts)-1:0] MultiDataIn;
	input	[NPorts-1:0]	MultiDataInValid;
	output	[NPorts-1:0]	MultiDataInReady;
	
	output	[DIWidth-1:0]	DataIn;
	output					DataInValid;
	input					DataInReady;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Data Output (Read) Interface (@ Clock)
	//--------------------------------------------------------------------------
	output [(DOWidth*NPorts)-1:0] MultiDataOut;
	output	[NPorts-1:0]	MultiDataOutValid;
	input	[NPorts-1:0]	MultiDataOutReady;
	
	input	[DOWidth-1:0]	DataOut;
	input					DataOutValid;
	output					DataOutReady;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Wires
	//--------------------------------------------------------------------------
	wire	[NPorts-1:0]	ManyReady, ManyValid, ManySelect;
	wire					OneReady, OneValid;
	
	wire					DIBurstZero, DIBurstNonZero, DIBurstEnd;
	
	wire	[TWidth-1:0]	TagIn, DITagOut, DOTagOut;
	wire					DOTagInValid, DOTagInReady, DOTagOutValid, DOTagOutReady;
	wire					DITagInValid, DITagInReady, DITagOutValid, DITagOutReady;
	
	wire	[NPorts-1:0]	InSelect, OutSelect;
	
	genvar					i, j, k;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Input Mux
	//--------------------------------------------------------------------------
	generate for (j = 0; j < NPorts; j = j + 1) begin:CONTROLS
		assign	ManyValid[j] =						Class1 ? MultiCommandValid[j] : (DIBurstZero ? ((MultiDataInValid[j] | ~MultiCommandWrite[j]) & MultiCommandValid[j]) : MultiDataInValid[j]);
		assign	MultiCommandReady[j] =				ManySelect[j] & CommandReady & ((~MultiCommandRead[j] | DOTagInReady) & (~MultiCommandWrite[j] | (Class1 ? DITagInReady : (MultiDataInValid[j] & DataInReady))) & (Class1 ? 1'b1 : DIBurstZero));
		assign	MultiDataInReady[j] =				InSelect[j] & DataInReady & DITagOutValid & (((Class1 ? 1'b0 : 1'b1) & DIBurstZero) ? (MultiCommandWrite[j] & MultiCommandValid[j] & CommandReady) : 1'b1);
	end endgenerate
	
	generate if (Class1) begin:CLASS1CONTROL
		assign	OneReady =							(CommandWrite & CommandReady & DITagInReady) | (CommandRead & CommandReady & DOTagInReady);
		assign	CommandValid =						OneValid & (~CommandWrite | DITagInReady) & (~CommandRead | DOTagInReady);
		assign	DataInValid =						DITagOutValid & (|(MultiDataInValid & InSelect));
		assign	DOTagInValid =						OneValid & CommandRead & CommandReady;
		assign	DITagInValid =						OneValid & CommandWrite & CommandReady;
	end else begin:CLASS3CONTROL
		assign	OneReady =							(CommandRead & CommandReady & DOTagInReady & DIBurstZero) | (DataInReady & DIBurstEnd);
		assign	CommandValid =						OneValid & (~CommandWrite | DataInReady) & (~CommandRead | DOTagInReady) & DIBurstZero;
		assign	DataInValid =						OneValid & (DIBurstZero ? (CommandReady & CommandWrite) : 1'b1);
		assign	DOTagInValid =						OneValid & CommandRead & CommandReady & DIBurstZero;
		assign	DITagInValid =						1'b0;
	end endgenerate
	assign	DITagOutReady =							DataInReady & DataInValid & DIBurstEnd;
	
	generate for (k = 0; k < NPorts; k = k + 1) begin:INPUTS
		assign	Command =							ManySelect[k] ? MultiCommand[(CWidth*k)+CWidth-1:CWidth*k] : {CWidth{1'bz}};
		assign	CommandRead =						ManySelect[k] ? MultiCommandRead[k] : 1'bz;
		assign	CommandWrite =						ManySelect[k] ? MultiCommandWrite[k] : 1'bz;
		assign	DataIn =							InSelect[k] ? MultiDataIn[(DIWidth*k)+DIWidth-1:DIWidth*k] : {DIWidth{1'bz}};
	end endgenerate
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
	//	Convert Select to Tag
	//--------------------------------------------------------------------------
	generate if (NPorts > 1) begin:SELECTTOTAG
		OneHot2Bin	#(			.Width(				NPorts))
					O2B(		.OneHot(			ManySelect),
								.Bin(				TagIn));
	end else begin:CONSTANTTAGIN
		assign	TagIn =								1'b0;
	end endgenerate
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Data In Tag FIFO
	//--------------------------------------------------------------------------
	generate if (Class1) begin:DITAGFIFO
		FIFORAM		#(			.Width(				TWidth),
								.FWLatency(			FWLatency),
								.Buffering(			Buffering),
								.BWLatency(			BWLatency))
					DITagFIFO(	.Clock(				Clock),
								.Reset(				Reset),
								.InData(			TagIn),
								.InValid(			DITagInValid),
								.InAccept(			DITagInReady),
								.InEmptyCount(		),
								.OutData(			DITagOut),
								.OutSend(			DITagOutValid),
								.OutReady(			DITagOutReady),
								.OutFullCount(		));
								
		if (NPorts > 1) begin:DITAGTOSELECT
			Bin2OneHot #(		.Width(				NPorts))
					DIB2O(		.Bin(				DITagOut),
								.OneHot(			InSelect));
		end else begin:CONSTANTDISELECT
			assign	InSelect =						1'b1;
		end
	end else begin:NODITAGFIFO
		assign	DITagInReady =						1'b1;
		assign	DITagOut =							TagIn;
		assign	DITagOutValid =						1'b1;
		
		if (NPorts > 1) begin:ARBINSELECT
			assign	InSelect =						ManySelect;
		end else begin:CONSTANTINSELECT
			assign InSelect	=						1'b1;
		end
	end endgenerate
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Data In Burst Counter
	//--------------------------------------------------------------------------							
	generate if (BurstLen > 1) begin:DIBURST
		wire [BCWidth-1:0]	DIBurstCount;
		Counter		#(			.Width(				BCWidth))			
					DIBurstCnt(	.Clock(				Clock),
								.Reset(				Reset | DITagOutReady),
								.Set(				1'b0),
								.Load(				1'b0),
								.Enable(			DataInReady & DataInValid),
								.In(				{BCWidth{1'bx}}),
								.Count(				DIBurstCount));
		CountCompare #(			.Width(				BCWidth),
								.Compare(			BurstLen - 1))
					DIBurstCmp(	.Count(				DIBurstCount),
								.TerminalCount(		DIBurstEnd));
		
		assign	DIBurstZero =						~|DIBurstCount;
		assign	DIBurstNonZero =					|DIBurstCount;
	end else begin:NODIBURST
		assign	DIBurstZero =						1'b1;
		assign	DIBurstNonZero =					1'b0;
		assign	DIBurstEnd =						1'b1;
	end endgenerate
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Data Out Tag FIFO & Burst Counter
	//--------------------------------------------------------------------------
	generate if (NPorts > 1) begin:DOTAGFIFO
		wire	[TWidth-1:0] DOTagDup;
		wire				DOTagDupValid, DOTagDupReady;
		
		FIFORAM		#(			.Width(				TWidth),
								.FWLatency(			FWLatency),
								.Buffering(			Buffering),
								.BWLatency(			BWLatency))
					DOTagFIFO(	.Clock(				Clock),
								.Reset(				Reset),
								.InData(			TagIn),
								.InValid(			DOTagInValid),
								.InAccept(			DOTagInReady),
								.InEmptyCount(		),
								.OutData(			DOTagDup),
								.OutSend(			DOTagDupValid),
								.OutReady(			DOTagDupReady),
								.OutFullCount(		));
		
		FIFORepeat	#(			.Width(				TWidth),
								.Repeat(			BurstLen))
					DOTagRep(	.Clock(				Clock),
								.Reset(				Reset),
								.RepeatLimit(		),
								.RepeatMax(			),
								.InData(			DOTagDup),
								.InValid(			DOTagDupValid),
								.InAccept(			DOTagDupReady),
								.OutData(			DOTagOut),
								.OutSend(			DOTagOutValid),
								.OutReady(			DOTagOutReady));
	end else begin:NODOTAGFIFO
		assign	DOTagInReady =						1'b1;
		assign	DOTagOutValid =						1'b1;
		assign	DOTagOut =							1'b0;
	end endgenerate
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Convert Tag to Select
	//--------------------------------------------------------------------------
	generate if (NPorts > 1) begin:DOTAGTOSELECT
		Bin2OneHot		#(			.Width(				NPorts))
						DOB2O(		.Bin(				DOTagOut),
									.OneHot(			OutSelect));
	end else begin:CONSTANTDOSELECT
		assign	OutSelect =								1'b1;
	end endgenerate
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Output Demux
	//--------------------------------------------------------------------------
	generate for (i = 0; i < NPorts; i = i + 1) begin:OUTPUTS
		assign	MultiDataOut[(DOWidth*i)+DOWidth-1:DOWidth*i] = DataOut;
	end endgenerate
	
	assign	MultiDataOutValid =						OutSelect & {NPorts{DataOutValid & DOTagOutValid}};
	assign	DataOutReady =							DOTagOutValid & (|(MultiDataOutReady & OutSelect));
	assign	DOTagOutReady =							DataOutValid & (|(MultiDataOutReady & OutSelect));
	//--------------------------------------------------------------------------
endmodule	
//------------------------------------------------------------------------------
