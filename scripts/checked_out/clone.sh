../../bin.`uname -s -m | sed 's/ /_/g'`/verilogc $1 -diff $2 > $2.clone >& $2.clone_error
