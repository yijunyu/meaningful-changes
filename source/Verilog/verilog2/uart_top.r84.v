`include "timescale.v"
`include "uart_defines.v"
module uart_top (wb_clk_i, wb_rst_i, wb_adr_i, wb_dat_i, wb_dat_o, wb_we_i, wb_stb_i, wb_cyc_i, wb_ack_o, wb_sel_i, int_o, stx_pad_o, srx_pad_i, rts_pad_o, cts_pad_i, dtr_pad_o, dsr_pad_i, ri_pad_i, dcd_pad_i `ifdef UART_HAS_BAUDRATE_OUTPUT
, baud_o `endif
);
parameter uart_data_width = `UART_DATA_WIDTH;
parameter uart_addr_width = `UART_ADDR_WIDTH;
input wb_clk_i;
input wb_rst_i;
input [uart_addr_width - 1 : 0] wb_adr_i;
input [uart_data_width - 1 : 0] wb_dat_i;
output [uart_data_width - 1 : 0] wb_dat_o;
input wb_we_i;
input wb_stb_i;
input wb_cyc_i;
input [3 : 0] wb_sel_i;
output wb_ack_o;
output int_o;
input srx_pad_i;
output stx_pad_o;
output rts_pad_o;
input cts_pad_i;
output dtr_pad_o;
input dsr_pad_i;
input ri_pad_i;
input dcd_pad_i;
`ifdef UART_HAS_BAUDRATE_OUTPUT
output baud_o;
`endif
wire stx_pad_o;
wire rts_pad_o;
wire dtr_pad_o;
wire [uart_addr_width - 1 : 0] wb_adr_i;
wire [uart_data_width - 1 : 0] wb_dat_i;
wire [uart_data_width - 1 : 0] wb_dat_o;
wire [7 : 0] wb_dat8_i;
wire [7 : 0] wb_dat8_o;
wire [31 : 0] wb_dat32_o;
wire [3 : 0] wb_sel_i;
wire [uart_addr_width - 1 : 0] wb_adr_int;
wire we_o;
wire re_o;
`ifdef DATA_BUS_WIDTH_8
`else
wire [3 : 0] ier;
wire [3 : 0] iir;
wire [1 : 0] fcr;
wire [4 : 0] mcr;
wire [7 : 0] lcr;
wire [7 : 0] msr;
wire [7 : 0] lsr;
wire [`UART_FIFO_COUNTER_W - 1 : 0] rf_count;
wire [`UART_FIFO_COUNTER_W - 1 : 0] tf_count;
wire [2 : 0] tstate;
wire [3 : 0] rstate;
`endif
`ifdef DATA_BUS_WIDTH_8
uart_wb wb_interface (.clk (wb_clk_i),.wb_rst_i (wb_rst_i),.wb_dat_i (wb_dat_i),.wb_dat_o (wb_dat_o),.wb_dat8_i (wb_dat8_i),.wb_dat8_o (wb_dat8_o),.wb_dat32_o (32?b0),.wb_sel_i (4?b0),.wb_we_i (wb_we_i),.wb_stb_i (wb_stb_i),.wb_cyc_i (wb_cyc_i),.wb_ack_o (wb_ack_o),.wb_adr_i (wb_adr_i),.wb_adr_int (wb_adr_int),.we_o (we_o),.re_o (re_o));
`else
uart_wb wb_interface (.clk (wb_clk_i),.wb_rst_i (wb_rst_i),.wb_dat_i (wb_dat_i),.wb_dat_o (wb_dat_o),.wb_dat8_i (wb_dat8_i),.wb_dat8_o (wb_dat8_o),.wb_sel_i (wb_sel_i),.wb_dat32_o (wb_dat32_o),.wb_we_i (wb_we_i),.wb_stb_i (wb_stb_i),.wb_cyc_i (wb_cyc_i),.wb_ack_o (wb_ack_o),.wb_adr_i (wb_adr_i),.wb_adr_int (wb_adr_int),.we_o (we_o),.re_o (re_o));
`endif
uart_regs regs (.clk (wb_clk_i),.wb_rst_i (wb_rst_i),.wb_addr_i (wb_adr_int),.wb_dat_i (wb_dat8_i),.wb_dat_o (wb_dat8_o),.wb_we_i (we_o),.wb_re_i (re_o),.modem_inputs ({cts_pad_i, dsr_pad_i, ri_pad_i, dcd_pad_i}),.stx_pad_o (stx_pad_o),.srx_pad_i (srx_pad_i), `ifdef DATA_BUS_WIDTH_8
`else
.ier (ier),.iir (iir),.fcr (fcr),.mcr (mcr),.lcr (lcr),.msr (msr),.lsr (lsr),.rf_count (rf_count),.tf_count (tf_count),.tstate (tstate),.rstate (rstate), `endif
.rts_pad_o (rts_pad_o),.dtr_pad_o (dtr_pad_o),.int_o (int_o) `ifdef UART_HAS_BAUDRATE_OUTPUT
,.baud_o (baud_o) `endif
);
`ifdef DATA_BUS_WIDTH_8
`else
uart_debug_if dbg (.wb_dat32_o (wb_dat32_o [31 : 0]),.wb_adr_i (wb_adr_int [`UART_ADDR_WIDTH - 1 : 0]),.ier (ier [3 : 0]),.iir (iir [3 : 0]),.fcr (fcr [1 : 0]),.mcr (mcr [4 : 0]),.lcr (lcr [7 : 0]),.msr (msr [7 : 0]),.lsr (lsr [7 : 0]),.rf_count (rf_count [`UART_FIFO_COUNTER_W - 1 : 0]),.tf_count (tf_count [`UART_FIFO_COUNTER_W - 1 : 0]),.tstate (tstate [2 : 0]),.rstate (rstate [3 : 0]));
`endif initial
begin
    `ifdef DATA_BUS_WIDTH_8 $display
    ("(%m) UART INFO: Data bus width is 8. No Debug interface.\n");
    `else $display ("(%m) UART INFO: Data bus width is 32. Debug Interface present.\n")
    ;
    `endif
    `ifdef UART_HAS_BAUDRATE_OUTPUT $display
    ("(%m) UART INFO: Has baudrate output\n");
    `else $display ("(%m) UART INFO: Doesn?t have baudrate output\n")
    ;
    `endif
end

endmodule
