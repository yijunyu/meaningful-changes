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
cd ..
make Txl/api_clone_java.Txl
make Txl/verilog2.Txl
echo >> result/grammar.txt
extend Txl/txl.grm >> result/grammar.txt
extend Txl/norm.Txl >> result/grammar.txt
extend Txl/java.grm >> result/grammar.txt
extend Txl/java5.Txl >> result/grammar.txt
extend source/norm/api_clone_java.norm >> result/grammar.txt
extend Txl/api_clone_java.Txl >> result/grammar.txt
extend Txl/v.grm >> result/grammar.txt
extend source/norm/verilog2.norm >> result/grammar.txt
extend Txl/verilog2.Txl >> result/grammar.txt
annotate source/norm/api_clone_java.norm >> result/grammar.txt
annotate source/norm/verilog2.norm >> result/grammar.txt
cd -
