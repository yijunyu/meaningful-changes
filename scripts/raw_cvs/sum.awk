/\d*:/ {
  split($0, a, /:/)
  t1+=a[1]
  t2+=a[2]
  t3+=a[3]
}
END {
  print t1 * 60 + t2
}
