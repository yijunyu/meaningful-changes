cat $1 $2 > /tmp/12.v
../../bin.`uname -s -m | sed 's/ /_/g'`/verilogc /tmp/12.v -o $2.clone >& $2.clone_error
