function extend() {
wc $1
echo -n define 
grep "^end define" $1 | wc
echo -n function 
grep "^end function" $1 | wc
echo -n rule 
grep "^end rule" $1 | wc
}

function annotate() {
echo -n kept
grep "kept" $1 | wc
echo -n ordered
grep "ordered" $1 | wc
echo -n ignored
grep "ignored" $1 | wc
echo -n preferred
grep "preferred" $1 | wc
}
make Txl/java.Txl
make Txl/verilog.Txl
extend Txl/txl.grm
extend Txl/norm.Txl
extend Txl/java.grm
extend Txl/java5.Txl
extend Txl/java.Txl
extend norm/java.norm
extend Txl/v.grm
extend norm/verilog.norm
extend Txl/verilog.Txl

annotate norm/java.norm
annotate norm/verilog.norm
