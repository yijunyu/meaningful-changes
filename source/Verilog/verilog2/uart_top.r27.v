`include "timescale.v"
`include "uart_defines.v"
module uart_top (clk, wb_rst_i, wb_addr_i, wb_dat_i, wb_dat_o, wb_we_i, wb_stb_i, wb_cyc_i, wb_ack_o, int_o, stx_pad_o, srx_pad_i, rts_pad_o, cts_pad_i, dtr_pad_o, dsr_pad_i, ri_pad_i, dcd_pad_i);
parameter uart_data_width = 8;
parameter uart_addr_width = `UART_ADDR_WIDTH;
input clk;
input wb_rst_i;
input [uart_addr_width - 1 : 0] wb_addr_i;
input [uart_data_width - 1 : 0] wb_dat_i;
output [uart_data_width - 1 : 0] wb_dat_o;
input wb_we_i;
input wb_stb_i;
input wb_cyc_i;
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
wire stx_pad_o;
wire rts_pad_o;
wire dtr_pad_o;
wire [uart_addr_width - 1 : 0] wb_addr_i;
wire [uart_data_width - 1 : 0] wb_dat_i;
wire [uart_data_width - 1 : 0] wb_dat_o;
wire we_o;
wire re_o;
uart_wb wb_interface (.clk (clk),.wb_rst_i (wb_rst_i),.wb_we_i (wb_we_i),.wb_stb_i (wb_stb_i),.wb_cyc_i (wb_cyc_i),.wb_ack_o (wb_ack_o),.we_o (we_o),.re_o (re_o));
uart_regs regs (.clk (clk),.wb_rst_i (wb_rst_i),.wb_addr_i (wb_addr_i),.wb_dat_i (wb_dat_i),.wb_dat_o (wb_dat_o),.wb_we_i (we_o),.wb_re_i (re_o),.modem_inputs ({cts_pad_i, dsr_pad_i, ri_pad_i, dcd_pad_i}),.stx_pad_o (stx_pad_o),.srx_pad_i (srx_pad_i),.enable (enable),.rts_pad_o (rts_pad_o),.dtr_pad_o (dtr_pad_o),.int_o (int_o));

endmodule
