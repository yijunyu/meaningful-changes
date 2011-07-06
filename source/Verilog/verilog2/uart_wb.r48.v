`include "timescale.v"
module uart_wb (clk, wb_rst_i, wb_we_i, wb_stb_i, wb_cyc_i, wb_ack_o, wb_dat_i, wb_dat_o, wb_dat8_i, wb_dat8_o, wb_dat32_o, wb_sel_i, we_o, re_o);
input clk;
input wb_rst_i;
input wb_we_i;
input wb_stb_i;
input wb_cyc_i;
input [3 : 0] wb_sel_i;
`ifdef DATA_BUS_WIDTH_8
input [7 : 0] wb_dat_i;
output [7 : 0] wb_dat_o;
reg [7 : 0] wb_dat_o;
wire [7 : 0] wb_dat_i;
`else
input [31 : 0] wb_dat_i;
output [31 : 0] wb_dat_o;
reg [31 : 0] wb_dat_o;
wire [31 : 0] wb_dat_i;
`endif
input [7 : 0] wb_dat8_o;
output [7 : 0] wb_dat8_i;
input [31 : 0] wb_dat32_o;
output wb_ack_o;
output we_o;
output re_o;
wire we_o;
reg wb_ack_o;
reg [7 : 0] wb_dat8_i;
wire [7 : 0] wb_dat8_o;
always @ (posedge clk or posedge wb_rst_i) if (wb_rst_i)
    wb_ack_o <= # 1 1?b0;
else
    wb_ack_o <= # 1 wb_stb_i & wb_cyc_i & ~ wb_ack_o;

assign we_o = wb_we_i & wb_cyc_i & wb_stb_i;
assign re_o = ~ wb_we_i & wb_cyc_i & wb_stb_i;
`ifdef DATA_BUS_WIDTH_8
always @ (posedge clk or posedge wb_rst_i) if (wb_rst_i)
    wb_dat_o <= # 1 0;
else
    wb_dat_o <= # 1 wb_dat8_o;

always @ (wb_dat_i) wb_dat8_i = wb_dat_i;
`else

always @ (posedge clk or posedge wb_rst_i) if (wb_rst_i)
    wb_dat_o <= # 1 0;
else
    if (re_o)
        case (wb_sel_i) 4?b0001 : wb_dat_o <= # 1 {24?b0, wb_dat8_o};
        4?b0010
        : wb_dat_o <= # 1 {16?b0, wb_dat8_o, 8?b0};
        4?b0100
        : wb_dat_o <= # 1 {8?b0, wb_dat8_o, 16?b0};
        4?b1000
        : wb_dat_o <= # 1 {wb_dat8_o, 24?b0};
        4?b1111
        : wb_dat_o <= # 1 wb_dat32_o;
        default : wb_dat_o <= # 1 0;
        endcase

always @ (wb_sel_i or wb_dat_i) case (wb_sel_i) 4?b0001 : wb_dat8_i = wb_dat_i [7 : 0];
4?b0010 : wb_dat8_i = wb_dat_i [15 : 8];
4?b0100 : wb_dat8_i = wb_dat_i [23 : 16];
4?b1000 : wb_dat8_i = wb_dat_i [31 : 24];
default : wb_dat8_i = wb_dat_i [7 : 0];
endcase `endif

endmodule
