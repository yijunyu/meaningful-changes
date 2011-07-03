`include "timescale.v"
`include "uart_defines.v"
module uart_tfifo (clk, wb_rst_i, data_in, data_out, push, pop, overrun, count, fifo_reset, reset_status);
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
wire [fifo_width - 1 : 0] data_out;
reg [fifo_pointer_w - 1 : 0] top;
reg [fifo_pointer_w - 1 : 0] bottom;
reg [fifo_counter_w - 1 : 0] count;
reg overrun;
wire [fifo_pointer_w - 1 : 0] top_plus_1 = top + 1?b1;
raminfr # (fifo_pointer_w, fifo_width, fifo_depth) tfifo (.clk (clk),.we (push),.a (top),.dpra (bottom),.di (data_in),.dpo (data_out));
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
                        count <= # 1 count + 1?b1;
                    end

                2?b01
                : if (count > 0)
                    begin
                        bottom <= # 1 bottom + 1?b1;
                        count <= # 1 count - 1?b1;
                    end

                2?b11
                : begin
                    bottom <= # 1 bottom + 1?b1;
                    top <= # 1 top_plus_1;
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

endmodule
