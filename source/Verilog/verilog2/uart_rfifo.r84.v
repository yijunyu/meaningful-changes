`include "timescale.v"
`include "uart_defines.v"
module uart_rfifo (clk, wb_rst_i, data_in, data_out, push, pop, overrun, count, error_bit, fifo_reset, reset_status);
parameter fifo_width = `UART_FIFO_WIDTH;
parameter fifo_depth = `UART_FIFO_DEPTH;
parameter fifo_pointer_w = `UART_FIFO_POINTER_W;
parameter fifo_counter_w = `UART_FIFO_COUNTER_W;
input clk;
input wb_rst_i;
input push;
input pop;
input [fifo_width - 1 : 0] data_in;
input fifo_reset;
input reset_status;
output [fifo_width - 1 : 0] data_out;
output overrun;
output [fifo_counter_w - 1 : 0] count;
output error_bit;
wire [fifo_width - 1 : 0] data_out;
wire [7 : 0] data8_out;
reg [2 : 0] fifo [fifo_depth - 1 : 0];
reg [fifo_pointer_w - 1 : 0] top;
reg [fifo_pointer_w - 1 : 0] bottom;
reg [fifo_counter_w - 1 : 0] count;
reg overrun;
wire [fifo_pointer_w - 1 : 0] top_plus_1 = top + 1?b1;
raminfr # (fifo_pointer_w, 8, fifo_depth) rfifo (.clk (clk),.we (push),.a (top),.dpra (bottom),.di (data_in [fifo_width - 1 : fifo_width - 8]),.dpo (data8_out));
always @ (posedge clk or posedge wb_rst_i) begin
    if (wb_rst_i)
        begin
            top <= # 1 0;
            bottom <= # 1 1?b0;
            count <= # 1 0;
        end
    else
        if (fifo_reset)
            begin
                top <= # 1 0;
                bottom <= # 1 1?b0;
                count <= # 1 0;
            end
        else
            begin
                case ({push, pop}) 2?b10 : if (count < fifo_depth)
                    begin
                        top <= # 1 top_plus_1;
                        fifo [top] <= # 1 data_in [2 : 0];
                        count <= # 1 count + 1?b1;
                    end

                2?b01
                : if (count > 0)
                    begin
                        fifo [bottom] <= # 1 0;
                        bottom <= # 1 bottom + 1?b1;
                        count <= # 1 count - 1?b1;
                    end

                2?b11
                : begin
                    fifo [bottom] <= # 1 0;
                    bottom <= # 1 bottom + 1?b1;
                    top <= # 1 top_plus_1;
                    fifo [top] <= # 1 data_in [2 : 0];
                end
                default :;
                endcase
            end

end

always @ (posedge clk or posedge wb_rst_i) begin
    if (wb_rst_i)
        overrun <= # 1 1?b0;
    else
        if (fifo_reset | reset_status)
            overrun <= # 1 1?b0;
        else
            if (push & (count == fifo_depth))
                overrun <= # 1 1?b1;

end

assign data_out = {data8_out, fifo [bottom]};
wire [2 : 0] word0 = fifo [0];
wire [2 : 0] word1 = fifo [1];
wire [2 : 0] word2 = fifo [2];
wire [2 : 0] word3 = fifo [3];
wire [2 : 0] word4 = fifo [4];
wire [2 : 0] word5 = fifo [5];
wire [2 : 0] word6 = fifo [6];
wire [2 : 0] word7 = fifo [7];
wire [2 : 0] word8 = fifo [8];
wire [2 : 0] word9 = fifo [9];
wire [2 : 0] word10 = fifo [10];
wire [2 : 0] word11 = fifo [11];
wire [2 : 0] word12 = fifo [12];
wire [2 : 0] word13 = fifo [13];
wire [2 : 0] word14 = fifo [14];
wire [2 : 0] word15 = fifo [15];
assign error_bit = | (word0 [2 : 0] | word1 [2 : 0] | word2 [2 : 0] | word3 [2 : 0] | word4 [2 : 0] | word5 [2 : 0] | word6 [2 : 0] | word7 [2 : 0] | word8 [2 : 0] | word9 [2 : 0] | word10 [2 : 0] | word11 [2 : 0] | word12 [2 : 0] | word13 [2 : 0] | word14 [2 : 0] | word15 [2 : 0]);

endmodule
