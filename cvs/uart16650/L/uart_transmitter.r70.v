`include "timescale.v"
`include "uart_defines.v"
module uart_transmitter (clk, wb_rst_i, lcr, tf_push, wb_dat_i, enable, stx_pad_o, tstate, tf_count, tx_reset, lsr_mask);
input clk;
input wb_rst_i;
input [7 : 0] lcr;
input tf_push;
input [7 : 0] wb_dat_i;
input enable;
input tx_reset;
input lsr_mask;
output stx_pad_o;
output [2 : 0] tstate;
output [`UART_FIFO_COUNTER_W - 1 : 0] tf_count;
reg [2 : 0] tstate;
reg [4 : 0] counter;
reg [2 : 0] bit_counter;
reg [6 : 0] shift_out;
reg stx_o_tmp;
reg parity_xor;
reg tf_pop;
reg bit_out;
wire [`UART_FIFO_WIDTH - 1 : 0] tf_data_in;
wire [`UART_FIFO_WIDTH - 1 : 0] tf_data_out;
wire tf_push;
wire tf_overrun;
wire [`UART_FIFO_COUNTER_W - 1 : 0] tf_count;
assign tf_data_in = wb_dat_i;
uart_fifo fifo_tx (.clk (clk),.wb_rst_i (wb_rst_i),.data_in (tf_data_in),.data_out (tf_data_out),.push (tf_push),.pop (tf_pop),.overrun (tf_overrun),.count (tf_count),.error_bit (),.fifo_reset (tx_reset),.reset_status (lsr_mask));
parameter s_idle = 3?d0;
parameter s_send_start = 3?d1;
parameter s_send_byte = 3?d2;
parameter s_send_parity = 3?d3;
parameter s_send_stop = 3?d4;
parameter s_pop_byte = 3?d5;
always @ (posedge clk or posedge wb_rst_i) begin
    if (wb_rst_i)
        begin
            tstate <= # 1 s_idle;
            stx_o_tmp <= # 1 1?b1;
            counter <= # 1 5?b0;
            shift_out <= # 1 7?b0;
            bit_out <= # 1 1?b0;
            parity_xor <= # 1 1?b0;
            tf_pop <= # 1 1?b0;
            bit_counter <= # 1 3?b0;
        end
    else
        if (enable)
            begin
                case (tstate) s_idle : if (~ | tf_count)
                    begin
                        tstate <= # 1 s_idle;
                        stx_o_tmp <= # 1 1?b1;
                    end
                else
                    begin
                        tf_pop <= # 1 1?b0;
                        stx_o_tmp <= # 1 1?b1;
                        tstate <= # 1 s_pop_byte;
                    end

                s_pop_byte
                : begin
                    tf_pop <= # 1 1?b1;
                    case (lcr [1 : 0]) 2?b00 : begin
                        bit_counter <= # 1 3?b100;
                        parity_xor <= # 1 ^ tf_data_out [4 : 0];
                    end
                    2?b01
                    : begin
                        bit_counter <= # 1 3?b101;
                        parity_xor <= # 1 ^ tf_data_out [5 : 0];
                    end
                    2?b10
                    : begin
                        bit_counter <= # 1 3?b110;
                        parity_xor <= # 1 ^ tf_data_out [6 : 0];
                    end
                    2?b11
                    : begin
                        bit_counter <= # 1 3?b111;
                        parity_xor <= # 1 ^ tf_data_out [7 : 0];
                    end
                    endcase
                    {shift_out [6 : 0], bit_out} <= # 1 tf_data_out;
                    tstate <= # 1 s_send_start;
                end
                s_send_start
                : begin
                    tf_pop <= # 1 1?b0;
                    if (~ | counter)
                        counter <= # 1 5?b01111;
                    else
                        if (counter == 5?b00001)
                            begin
                                counter <= # 1 0;
                                tstate <= # 1 s_send_byte;
                            end
                        else
                            counter <= # 1 counter - 1?b1;

                    stx_o_tmp <= # 1 1?b0;
                end
                s_send_byte
                : begin
                    if (~ | counter)
                        counter <= # 1 5?b01111;
                    else
                        if (counter == 5?b00001)
                            begin
                                if (bit_counter > 3?b0)
                                    begin
                                        bit_counter <= # 1 bit_counter - 1?b1;
                                        {shift_out [5 : 0], bit_out} <= # 1 {shift_out [6 : 1], shift_out [0]};
                                        tstate <= # 1 s_send_byte;
                                    end
                                else
                                    if (~ lcr [`UART_LC_PE])
                                        begin
                                            tstate <= # 1 s_send_stop;
                                        end
                                    else
                                        begin
                                            case ({lcr [`UART_LC_EP], lcr [`UART_LC_SP]}) 2?b00 : bit_out <= # 1 ~ parity_xor;
                                            2?b01
                                            : bit_out <= # 1 1?b1;
                                            2?b10
                                            : bit_out <= # 1 parity_xor;
                                            2?b11
                                            : bit_out <= # 1 1?b0;
                                            endcase
                                            tstate <= # 1 s_send_parity;
                                        end

                                counter <= # 1 0;
                            end
                        else
                            counter <= # 1 counter - 1?b1;

                    stx_o_tmp <= # 1 bit_out;
                end
                s_send_parity
                : begin
                    if (~ | counter)
                        counter <= # 1 5?b01111;
                    else
                        if (counter == 5?b00001)
                            begin
                                counter <= # 1 4?b0;
                                tstate <= # 1 s_send_stop;
                            end
                        else
                            counter <= # 1 counter - 1?b1;

                    stx_o_tmp <= # 1 bit_out;
                end
                s_send_stop
                : begin
                    if (~ | counter)
                        begin
                            casex ({lcr [`UART_LC_SB], lcr [`UART_LC_BITS]}) 3?b0xx : counter <= # 1 5?b01101;
                            3?b100
                            : counter <= # 1 5?b10101;
                            default : counter <= # 1 5?b11101;
                            endcase
                        end
                    else
                        if (counter == 5?b00001)
                            begin
                                counter <= # 1 0;
                                tstate <= # 1 s_idle;
                            end
                        else
                            counter <= # 1 counter - 1?b1;

                    stx_o_tmp <= # 1 1?b1;
                end
                default : tstate <= # 1 s_idle;
                endcase
            end
        else
            tf_pop <= # 1 1?b0;

end

assign stx_pad_o = lcr [`UART_LC_BC] ? 1?b0 : stx_o_tmp;

endmodule
