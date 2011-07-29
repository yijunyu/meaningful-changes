//==============================================================================
//	File:		$URL: svn+ssh://repositorypub@repository.eecs.berkeley.edu/public/Projects/GateLib/branches/dev/Firmware/DRAM/Hardware/DRAMRouter.v $
//	Version:	$Revision: 17079 $
//	Author:		Greg Gibeling
//	Copyright:	Copyright 2007-2008 UC Berkeley
//==============================================================================

//==============================================================================
//	Copyright (c) 2007-2008, Regents of the University of California
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
//	Module:		DRAMRouter
//	Desc:		...
//	Params:		...
//	Author:		<a href="http://gdgib.gotdns.com/~gdgib/">Greg Gibeling</a>
//	Version:	$Revision: 17079 $
//------------------------------------------------------------------------------
/*module	DRAMRouter(
			//------------------------------------------------------------------
			//	Clock & Reset Inputs
			//------------------------------------------------------------------
			Clock,
			Reset,
			//------------------------------------------------------------------
			
			//------------------------------------------------------------------
			//	Command Interface (@ Clock)
			//------------------------------------------------------------------
			CommandAddress,
			Command,
			CommandValid,
			CommandReady,
			
			MultiCommandAddress,
			MultiCommand,
			MultiCommandValid,
			MultiCommandReady,
			//------------------------------------------------------------------
	
			//------------------------------------------------------------------
			//	Data Input (Write) Interface (@ Clock)
			//------------------------------------------------------------------
			DataIn,
			DataInMask,
			DataInValid,
			DataInReady,
			
			MultiDataIn,
			MultiDataInMask,
			MultiDataInValid,
			MultiDataInReady,
			//------------------------------------------------------------------
	
			//------------------------------------------------------------------
			//	Data Output (Read) Interface (@ Clock)
			//------------------------------------------------------------------
			DataOut,
			DataOutErrorChecked,
			DataOutErrorCorrected,
			DataOutValid,
			DataOutReady,
			
			MultiDataOut,
			MultiDataOutErrorChecked,
			MultiDataOutErrorCorrected,
			MultiDataOutValid,
			MultiDataOutReady
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
							
							FWLatency =				1,	// FIFO parameters for tag FIFO
							Buffering =				16,
							BWLatency =				1,
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
							TWidth =				`max(`log2(NPorts), 1),
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
	input	[AWidth-1:0]	CommandAddress;
	input	[CWidth-1:0]	Command; 
	input					CommandValid;
	output					CommandReady;
	
	output [(AWidth*NPorts)-1:0] MultiCommandAddress;
	output [(CWidth*NPorts)-1:0] MultiCommand; 
	output	[NPorts-1:0]	MultiCommandValid;
	input	[NPorts-1:0]	MultiCommandReady;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Data Input (Write) Interface (@ Clock)
	//--------------------------------------------------------------------------	
	input	[DWidth-1:0]	DataIn;
	input	[MWidth-1:0]	DataInMask;
	input					DataInValid;
	output					DataInReady;
	
	output [(DWidth*NPorts)-1:0] MultiDataIn;
	output [(MWidth*NPorts)-1:0] MultiDataInMask;
	output	[NPorts-1:0]	MultiDataInValid;
	input	[NPorts-1:0]	MultiDataInReady;
	//--------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------
	//	Data Output (Read) Interface (@ Clock)
	//--------------------------------------------------------------------------
	output	[DWidth-1:0]	DataOut;
	output	[EHWidth-1:0]	DataOutErrorChecked;
	output	[ERWidth-1:0]	DataOutErrorCorrected;
	output					DataOutValid;
	input					DataOutReady;
	
	input [(DWidth*NPorts)-1:0] MultiDataOut;
	input [(EHWidth*NPorts)-1:0] MultiDataOutErrorChecked;
	input [(ERWidth*NPorts)-1:0] MultiDataOutErrorCorrected;
	input	[NPorts-1:0]	MultiDataOutValid;
	output	[NPorts-1:0]	MultiDataOutReady;
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
		assign	ManyValid[j] =						Class1 ? MultiCommandValid[j] : (DIBurstZero ? ((MultiDataInValid[j] | (MultiCommand[(CWidth*j)+CWidth-1:CWidth*j] != COMMAND_Write)) & MultiCommandValid[j]) : MultiDataInValid[j]);
		assign	MultiCommandReady[j] =				ManySelect[j] & CommandReady & (((MultiCommand[(CWidth*j)+CWidth-1:CWidth*j] != COMMAND_Read) | DOTagInReady) & ((MultiCommand[(CWidth*j)+CWidth-1:CWidth*j] != COMMAND_Write) | (Class1 ? DITagInReady : (MultiDataInValid[j] & DataInReady))) & (Class1 ? 1'b1 : DIBurstZero));
		assign	MultiDataInReady[j] =				InSelect[j] & DataInReady & DITagOutValid & (((Class1 ? 1'b0 : 1'b1) & DIBurstZero) ? ((MultiCommand[(CWidth*j)+CWidth-1:CWidth*j] == COMMAND_Write) & MultiCommandValid[j] & CommandReady) : 1'b1);
	end endgenerate
	
	generate if (Class1) begin:CLASS1CONTROL
		assign	OneReady =							((Command == COMMAND_Write) & CommandReady & DITagInReady) | ((Command == COMMAND_Read) & CommandReady & DOTagInReady);
		assign	CommandValid =						OneValid & ((Command != COMMAND_Write) | DITagInReady) & ((Command != COMMAND_Read) | DOTagInReady);
		assign	DataInValid =						DITagOutValid & (|(MultiDataInValid & InSelect));
		assign	DOTagInValid =						OneValid & (Command == COMMAND_Read) & CommandReady;
		assign	DITagInValid =						OneValid & (Command == COMMAND_Write) & CommandReady;
	end else begin:CLASS3CONTROL
		assign	OneReady =							((Command == COMMAND_Read) & CommandReady & DOTagInReady & DIBurstZero) | (DataInReady & DIBurstEnd);
		assign	CommandValid =						OneValid & ((Command != COMMAND_Write) | DataInReady) & ((Command != COMMAND_Read) | DOTagInReady) & DIBurstZero;
		assign	DataInValid =						OneValid & (DIBurstZero ? (CommandReady & (Command == COMMAND_Write)) : 1'b1);
		assign	DOTagInValid =						OneValid & (Command == COMMAND_Read) & CommandReady & DIBurstZero;
		assign	DITagInValid =						1'b0;
	end endgenerate
	assign	DITagOutReady =							DataInReady & DataInValid & DIBurstEnd;
	
	generate for (k = 0; k < NPorts; k = k + 1) begin:INPUTS
		assign	CommandAddress =					ManySelect[k] ? MultiCommandAddress[(AWidth*k)+AWidth-1:AWidth*k] : {AWidth{1'bz}};
		assign	Command =							ManySelect[k] ? MultiCommand[(CWidth*k)+CWidth-1:CWidth*k] : {CWidth{1'bz}};
		assign	DataIn =							InSelect[k] ? MultiDataIn[(DWidth*k)+DWidth-1:DWidth*k] : {DWidth{1'bz}};
		assign	DataInMask =						InSelect[k] ? MultiDataInMask[(MWidth*k)+MWidth-1:MWidth*k] : {MWidth{1'bz}};
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
		assign	DOTagIn =							1'b0;
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
		
		assign	InSelect =							ManySelect;
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
		if (BurstLen > 1) begin:DOBURST
			wire [BCWidth-1:0] DOBurstCount;
			wire			DOBurstEnd;
	
			Counter	#(			.Width(				BCWidth))			
					DOBurstCnt(	.Clock(				Clock),
								.Reset(				Reset | (DOTagOutValid & DOTagOutReady)),
								.Set(				1'b0),
								.Load(				1'b0),
								.Enable(			DataOutReady & DataOutValid),
								.In(				{BCWidth{1'bx}}),
								.Count(				DOBurstCount));
			CountCompare #(		.Width(				BCWidth),
								.Compare(			BurstLen - 1))
					DOBurstCmp(.Count(				DOBurstCount),
								.TerminalCount(		DOBurstEnd));
			assign	DOTagOutReady =					DOBurstEnd & DataOutReady & DataOutValid;
		end else begin:NODOBURST
			assign	DOTagOutReady =					DataOutReady & DataOutValid;
		end
		
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
								.OutData(			DOTagOut),
								.OutSend(			DOTagOutValid),
								.OutReady(			DOTagOutReady),
								.OutFullCount(		));
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
		assign	MultiDataOut[(DWidth*i)+DWidth-1:DWidth*i] = DataOut;
		assign	MultiDataOutErrorChecked[(EHWidth*i)+EHWidth-1:EHWidth*i] = DataOutErrorChecked;
		assign	MultiDataOutErrorCorrected[(ERWidth*i)+ERWidth-1:ERWidth*i] = DataOutErrorCorrected;
	end endgenerate
	
	assign	MultiDataOutValid =						OutSelect & {NPorts{DataOutValid & DOTagOutValid}};
	assign	DataOutReady =							|(MultiDataOutReady & OutSelect);
	//--------------------------------------------------------------------------
endmodule*/	
//------------------------------------------------------------------------------
