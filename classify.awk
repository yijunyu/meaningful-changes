BEGIN{
  to_add = 0
  to_remove = 0
  to_modify = 0
}
/^==/ {
  t++;
  if (to_modify) {
    m++;
    c++;
  } else {
    if (to_add) {
      a++;
      c++;
    } else if (to_remove) {
      r++;
      c++;
    }
  }
  to_add = 0
  to_remove = 0
  to_modify = 0
}
/^</ {
   to_remove = 1
}
/^>/ {
   to_add = 1
}
/^---/ {
   to_modify = 1
}
END {
   print "total: " t;
   print "changed: " c;
   print "modified: " m;
   print "added: " a;
   print "removed: " r;
}
