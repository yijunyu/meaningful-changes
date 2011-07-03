module uart_regs (`endif
rts_pad_o, `ifdef DATA_BUS_WIDTH_8
`else
ier, baud_o `endif
, clk, dtr_pad_o, fcr, iir, int_o `ifdef UART_HAS_BAUDRATE_OUTPUT
, lcr, lsr, mcr, modem_inputs, msr, rf_count, rstate, srx_pad_i, stx_pad_o, tf_count, tstate, wb_addr_i, wb_dat_i, wb_dat_o, wb_re_i, wb_rst_i, wb_we_i);

endmodule
