BEGIN{
  to_add = 0
  to_remove = 0
  to_modify = 0
}
/^==/ {
  t++;
  changed = 0
  if (to_modify) {
    m++;
    c++;
    changed = 1
  } else {
    if (to_add) {
      a++;
      c++;
      changed = 1
    } else if (to_remove) {
      r++;
      c++;
      changed = 1
    }
  }
  if (changed) {
	  split($3, x, /.model.j/)
	  split(x[1], y, /-/)
	  split(y[2], z, /.java/)
	  files[y[1] ".java,v 1." z[1]] = 1
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
  if (0) {
   print "total: " t;
   print "changed: " c;
   print "modified: " m;
   print "added: " a;
   print "removed: " r;
 }
}
END {
   for (i in files) {
	print "process.sh " i
   }
}
