function extend() {
wc $1
echo define 
grep "^end define" $1 | wc
echo function 
grep "^end function" $1 | wc
echo rule 
grep "^end rule" $1 | wc
}

function annotate() {
echo kept
grep "kept" $1 | wc
echo ordered
grep "ordered" $1 | wc
echo ignored
grep "ignored" $1 | wc
echo preferred
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
