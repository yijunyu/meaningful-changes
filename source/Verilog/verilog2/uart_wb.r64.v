`include "timescale.v"
`include "uart_defines.v"
module uart_wb (clk, wb_rst_i, wb_we_i, wb_stb_i, wb_cyc_i, wb_ack_o, wb_adr_i, wb_adr_int, wb_dat_i, wb_dat_o, wb_dat8_i, wb_dat8_o, wb_dat32_o, wb_sel_i, we_o, re_o);
input clk;
input wb_rst_i;
input wb_we_i;
input wb_stb_i;
input wb_cyc_i;
input [3 : 0] wb_sel_i;
input [`UART_ADDR_WIDTH - 1 : 0] wb_adr_i;
`ifdef DATA_BUS_WIDTH_8
input [7 : 0] wb_dat_i;
output [7 : 0] wb_dat_o;
reg [7 : 0] wb_dat_o;
wire [7 : 0] wb_dat_i;
reg [7 : 0] wb_dat_is;
`else
input [31 : 0] wb_dat_i;
output [31 : 0] wb_dat_o;
reg [31 : 0] wb_dat_o;
wire [31 : 0] wb_dat_i;
reg [31 : 0] wb_dat_is;
`endif
output [`UART_ADDR_WIDTH - 1 : 0] wb_adr_int;
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
wire [`UART_ADDR_WIDTH - 1 : 0] wb_adr_int;
reg [`UART_ADDR_WIDTH - 1 : 0] wb_adr_is;
reg wb_we_is;
reg wb_cyc_is;
reg wb_stb_is;
reg [3 : 0] wb_sel_is;
wire [3 : 0] wb_sel_i;
reg wre;
reg [1 : 0] wbstate;
always @ (posedge clk or posedge wb_rst_i) if (wb_rst_i)
    begin
        wb_ack_o <= # 1 1?b0;
        wbstate <= # 1 0;
        wre <= # 1 1?b1;
    end
else
    case (wbstate) 0 : begin
        if (wb_stb_is & wb_cyc_is)
            begin
                wre <= # 1 0;
                wbstate <= # 1 1;
                wb_ack_o <= # 1 1;
            end
        else
            begin
                wre <= # 1 1;
                wb_ack_o <= # 1 0;
            end

    end
    1
    : begin
        wb_ack_o <= # 1 0;
        wbstate <= # 1 2;
        wre <= # 1 0;
    end
    2, 3 : begin
        wb_ack_o <= # 1 0;
        wbstate <= # 1 0;
        wre <= # 1 0;
    end
    endcase

assign we_o = wb_we_is & wb_stb_is & wb_cyc_is & wre;
assign re_o = ~ wb_we_is & wb_stb_is & wb_cyc_is & wre;
always @ (posedge clk or posedge wb_rst_i) if (wb_rst_i)
    begin
        wb_adr_is <= # 1 0;
        wb_we_is <= # 1 0;
        wb_cyc_is <= # 1 0;
        wb_stb_is <= # 1 0;
        wb_dat_is <= # 1 0;
        wb_sel_is <= # 1 0;
    end
else
    begin
        wb_adr_is <= # 1 wb_adr_i;
        wb_we_is <= # 1 wb_we_i;
        wb_cyc_is <= # 1 wb_cyc_i;
        wb_stb_is <= # 1 wb_stb_i;
        wb_dat_is <= # 1 wb_dat_i;
        wb_sel_is <= # 1 wb_sel_i;
    end

assign wb_adr_int = wb_adr_is;
`ifdef DATA_BUS_WIDTH_8
always @ (posedge clk or posedge wb_rst_i) if (wb_rst_i)
    wb_dat_o <= # 1 0;
else
    wb_dat_o <= # 1 wb_dat8_o;

always @ (wb_dat_is) wb_dat8_i = wb_dat_is;
`else

always @ (posedge clk or posedge wb_rst_i) if (wb_rst_i)
    wb_dat_o <= # 1 0;
else
    if (re_o)
        case (wb_sel_is) 4?b0001 : wb_dat_o <= # 1 {24?b0, wb_dat8_o};
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

always @ (wb_sel_is or wb_dat_is) case (wb_sel_is) 4?b0001 : wb_dat8_i = wb_dat_is [7 : 0];
4?b0010 : wb_dat8_i = wb_dat_is [15 : 8];
4?b0100 : wb_dat8_i = wb_dat_is [23 : 16];
4?b1000 : wb_dat8_i = wb_dat_is [31 : 24];
default : wb_dat8_i = wb_dat_is [7 : 0];
endcase `endif

endmodule
