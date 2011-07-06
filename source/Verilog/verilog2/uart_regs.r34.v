`include "timescale.v"
`include "uart_defines.v"
`define UART_DL1 7 : 0
`define UART_DL2 15 : 8
module uart_regs (clk, wb_rst_i, wb_addr_i, wb_dat_i, wb_dat_o, wb_we_i, wb_re_i, modem_inputs, stx_pad_o, srx_pad_i, rts_pad_o, dtr_pad_o, int_o);
input clk;
input wb_rst_i;
input [`UART_ADDR_WIDTH - 1 : 0] wb_addr_i;
input [7 : 0] wb_dat_i;
output [7 : 0] wb_dat_o;
input wb_we_i;
input wb_re_i;
output stx_pad_o;
input srx_pad_i;
input [3 : 0] modem_inputs;
output rts_pad_o;
output dtr_pad_o;
output int_o;
wire [3 : 0] modem_inputs;
reg enable;
wire stx_pad_o;
wire srx_pad_i;
reg [7 : 0] wb_dat_o;
wire [`UART_ADDR_WIDTH - 1 : 0] wb_addr_i;
wire [7 : 0] wb_dat_i;
reg [3 : 0] ier;
reg [3 : 0] iir;
reg [1 : 0] fcr;
reg [4 : 0] mcr;
reg [7 : 0] lcr;
reg [7 : 0] lsr;
reg [7 : 0] msr;
reg [15 : 0] dl;
reg start_dlc;
reg lsr_mask;
reg msi_reset;
reg threi_clear;
reg [15 : 0] dlc;
reg int_o;
reg [3 : 0] trigger_level;
reg rx_reset;
reg tx_reset;
wire dlab;
wire cts_pad_i, dsr_pad_i, ri_pad_i, dcd_pad_i;
wire loopback;
wire cts, dsr, ri, dcd;
wire rts_pad_o, dtr_pad_o;
assign {cts_pad_i, dsr_pad_i, ri_pad_i, dcd_pad_i} = modem_inputs;
assign {cts, dsr, ri, dcd} = loopback ? {mcr [`UART_MC_RTS], mcr [`UART_MC_DTR], mcr [`UART_MC_OUT1], mcr [`UART_MC_OUT2]} : ~ {cts_pad_i, dsr_pad_i, ri_pad_i, dcd_pad_i};
assign dlab = lcr [`UART_LC_DL];
assign loopback = mcr [4];
assign rts_pad_o = mcr [`UART_MC_RTS];
assign dtr_pad_o = mcr [`UART_MC_DTR];
reg rls_int;
reg rda_int;
reg ti_int;
reg thre_int;
reg ms_int;
reg tf_push;
reg rf_pop;
wire [`UART_FIFO_REC_WIDTH - 1 : 0] rf_data_out;
wire rf_error_bit;
wire [`UART_FIFO_COUNTER_W - 1 : 0] rf_count;
wire [`UART_FIFO_COUNTER_W - 1 : 0] tf_count;
wire [2 : 0] state;
wire [5 : 0] counter_t;
wire [3 : 0] counter_b;
wire rx_lsr_mask;
uart_transmitter
transmitter (clk, wb_rst_i, lcr, tf_push, wb_dat_i, enable, stx_pad_o, state, tf_count, tx_reset, rx_lsr_mask);
uart_receiver
receiver (clk, wb_rst_i, lcr, rf_pop, srx_pad_i, enable, rda_int, counter_t, counter_b, rf_count, rf_data_out, rf_error_bit, rf_overrun, rx_reset, rx_lsr_mask);
always @ (posedge clk or posedge wb_rst_i) begin
    if (wb_rst_i)
        begin
            wb_dat_o <= # 1 8?b0;
        end
    else
        if (wb_re_i)
            case (wb_addr_i) `UART_REG_RB : if (dlab)
                wb_dat_o <= # 1 dl [`UART_DL1];
            else
                wb_dat_o <= # 1 rf_data_out [9 : 2];

            `UART_REG_IE
            : wb_dat_o <= # 1 dlab ? dl [`UART_DL2] : ier;
            `UART_REG_II
            : wb_dat_o <= # 1 {4?b1100, iir};
            `UART_REG_LC
            : wb_dat_o <= # 1 lcr;
            `UART_REG_LS
            : wb_dat_o <= # 1 lsr;
            `UART_REG_MS
            : wb_dat_o <= # 1 msr;
            default : wb_dat_o <= # 1 8?b0;
            endcase
        else
            wb_dat_o <= # 1 8?b0;

end

always @ (posedge clk or posedge wb_rst_i) begin
    if (wb_rst_i)
        rf_pop <= # 1 0;
    else
        if (rf_pop)
            rf_pop <= # 1 0;
        else
            if (wb_re_i && wb_addr_i == `UART_REG_RB && ! dlab)
                rf_pop <= # 1 1;

end

always @ (posedge clk or posedge wb_rst_i) begin
    if (wb_rst_i)
        lsr_mask <= # 1 0;
    else
        if (lsr_mask)
            lsr_mask <= # 1 0;
        else
            if (wb_re_i && wb_addr_i == `UART_REG_LS && ! dlab)
                lsr_mask <= # 1 1;

end

assign rx_lsr_mask = lsr_mask;
always @ (posedge clk or posedge wb_rst_i) begin
    if (wb_rst_i)
        msi_reset <= # 1 0;
    else
        if (msi_reset)
            msi_reset <= # 1 0;
        else
            if (wb_re_i && wb_addr_i == `UART_REG_MS)
                msi_reset <= # 1 1;

end

always @ (posedge clk or posedge wb_rst_i) begin
    if (wb_rst_i)
        threi_clear <= # 1 0;
    else
        if (threi_clear && ! lsr [`UART_LS_TFE] && (tf_count == 0))
            threi_clear <= # 1 0;
        else
            if (wb_re_i && wb_addr_i == `UART_REG_II)
                threi_clear <= # 1 1;

end

always @ (posedge clk or posedge wb_rst_i) if (wb_rst_i)
    lcr <= # 1 8?b00000011;
else
    if (wb_we_i && wb_addr_i == `UART_REG_LC)
        lcr <= # 1 wb_dat_i;

always @ (posedge clk or posedge wb_rst_i) if (wb_rst_i)
    begin
        ier <= # 1 4?b0000;
        dl [`UART_DL2] <= # 1 8?b0;
    end
else
    if (wb_we_i && wb_addr_i == `UART_REG_IE)
        if (dlab)
            begin
                dl [`UART_DL2] <= # 1 wb_dat_i;
            end
        else
            ier <= # 1 wb_dat_i [3 : 0];

always @ (posedge clk or posedge wb_rst_i) if (wb_rst_i)
    begin
        fcr <= # 1 2?b11;
        rx_reset <= # 1 0;
        tx_reset <= # 1 0;
    end
else
    if (wb_we_i && wb_addr_i == `UART_REG_FC)
        begin
            fcr <= # 1 wb_dat_i [7 : 6];
            rx_reset <= # 1 wb_dat_i [1];
            tx_reset <= # 1 wb_dat_i [2];
        end
    else
        begin
            rx_reset <= # 1 0;
            tx_reset <= # 1 0;
        end

always @ (posedge clk or posedge wb_rst_i) if (wb_rst_i)
    mcr <= # 1 5?b0;
else
    if (wb_we_i && wb_addr_i == `UART_REG_MC)
        mcr <= # 1 wb_dat_i [4 : 0];

always @ (posedge clk or posedge wb_rst_i) if (wb_rst_i)
    begin
        dl [`UART_DL1] <= # 1 8?b0;
        tf_push <= # 1 1?b0;
        start_dlc <= # 1 1?b0;
    end
else
    if (wb_we_i && wb_addr_i == `UART_REG_TR)
        if (dlab)
            begin
                dl [`UART_DL1] <= # 1 wb_dat_i;
                start_dlc <= # 1 1?b1;
                tf_push <= # 1 1?b0;
            end
        else
            begin
                tf_push <= # 1 1?b1;
                start_dlc <= # 1 1?b0;
            end

    else
        begin
            start_dlc <= # 1 1?b0;
            tf_push <= # 1 1?b0;
        end

always @ (fcr) case (fcr [`UART_FC_TL]) 2?b00 : trigger_level = 1;
2?b01 : trigger_level = 4;
2?b10 : trigger_level = 8;
2?b11 : trigger_level = 14;
endcase

always @ (posedge clk or posedge wb_rst_i) begin
    if (wb_rst_i)
        msr <= # 1 0;
    else
        begin
            msr [`UART_MS_DDCD : `UART_MS_DCTS] <= # 1 msi_reset ? 4?b0 : msr [`UART_MS_DDCD : `UART_MS_DCTS]
            | ({dcd, ri, dsr, cts} ^ msr [`UART_MS_CDCD : `UART_MS_CCTS]);
            msr [`UART_MS_CDCD : `UART_MS_CCTS] <= # 1 {dcd, ri, dsr, cts};
        end

end

always @ (posedge clk or posedge wb_rst_i) begin
    if (wb_rst_i)
        lsr <= # 1 8?b01100000;
    else
        if (lsr_mask)
            lsr <= # 1 lsr & 8?b00000001;
        else
            begin
                lsr [0] <= # 1 (rf_count != 4?b0);
                lsr [1] <= # 1 rf_overrun;
                lsr [2] <= # 1 rf_data_out [1];
                lsr [3] <= # 1 rf_data_out [0];
                lsr [4] <= # 1 (counter_b == 4?b0);
                lsr [5] <= # 1 (tf_count == 5?b0);
                lsr [6] <= # 1 (tf_count == 5?b0 && (state == 0));
                lsr [7] <= # 1 rf_error_bit;
            end

end

always @ (posedge clk or posedge wb_rst_i) begin
    if (wb_rst_i)
        dlc <= # 1 0;
    else
        if (start_dlc | ~ (| dlc))
            dlc <= # 1 dl - 1;
        else
            dlc <= # 1 dlc - 1;

end

always @ (posedge clk or posedge wb_rst_i) begin
    if (wb_rst_i)
        enable <= # 1 1?b0;
    else
        if (| dl & ~ (| dlc))
            enable <= # 1 1?b1;
        else
            enable <= # 1 1?b0;

end

always @ (posedge clk or posedge wb_rst_i) begin
    if (wb_rst_i)
        begin
            rls_int <= # 1 1?b0;
            rda_int <= # 1 1?b0;
            ti_int <= # 1 1?b0;
            thre_int <= # 1 1?b0;
            ms_int <= # 1 1?b0;
        end
    else
        begin
            rls_int <= # 1 ier [`UART_IE_RLS] && (lsr [`UART_LS_OE] || lsr [`UART_LS_PE] || lsr [`UART_LS_FE] || lsr [`UART_LS_BI]);
            rda_int <= # 1 ier [`UART_IE_RDA] && (rf_count >= {1?b0, trigger_level});
            thre_int <= # 1 threi_clear ? 0 : ier [`UART_IE_THRE] && lsr [`UART_LS_TFE];
            ms_int <= # 1 ier [`UART_IE_MS] && (| msr [3 : 0]);
            ti_int <= # 1 ier [`UART_IE_RDA] && (counter_t == 6?b0);
        end

end

always @ (posedge clk or posedge wb_rst_i) begin
    if (wb_rst_i)
        int_o <= # 1 1?b0;
    else
        if (| {rls_int, rda_int, thre_int, ms_int, ti_int})
            int_o <= # 1 1?b1;
        else
            int_o <= # 1 1?b0;

end

always @ (posedge clk or posedge wb_rst_i) begin
    if (wb_rst_i)
        iir <= # 1 1;
    else
        if (rls_int)
            begin
                iir [`UART_II_II] <= # 1 `UART_II_RLS;
                iir [`UART_II_IP] <= # 1 1?b0;
            end
        else
            if (rda_int)
                begin
                    iir [`UART_II_II] <= # 1 `UART_II_RDA;
                    iir [`UART_II_IP] <= # 1 1?b0;
                end
            else
                if (ti_int)
                    begin
                        iir [`UART_II_II] <= # 1 `UART_II_TI;
                        iir [`UART_II_IP] <= # 1 1?b0;
                    end
                else
                    if (thre_int)
                        begin
                            iir [`UART_II_II] <= # 1 `UART_II_THRE;
                            iir [`UART_II_IP] <= # 1 1?b0;
                        end
                    else
                        if (ms_int)
                            begin
                                iir [`UART_II_II] <= # 1 `UART_II_MS;
                                iir [`UART_II_IP] <= # 1 1?b0;
                            end
                        else
                            begin
                                iir [`UART_II_IP] <= # 1 1?b1;
                            end

end

endmodule
