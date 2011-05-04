{
  split($1, a, /\.r/)
  split(a[2], b, /\.v/)
  n[$1]=b[1]
  m[b[1]] = $1
}
END {
  k = asort(n)
  for (f in n) {
    if ( f < k) {
    	print "diff -w " m[n[f]] " " m[n[f+1]] " > " m[n[f+1]] ".diff"
    }
  }
}
