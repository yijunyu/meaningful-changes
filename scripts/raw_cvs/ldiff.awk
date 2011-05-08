# Process the rlog files (with extension ,v) in the CVS repository
BEGIN{
}
/RCS file:/ {
  split($0, a, /RCS file: /);
  rcs_file = a[2];
  n = split(a[2], b, /\//);
}
/Working file:/ {
  split($0, a, /Working file: /);
  n = split(a[2], b, /\//);
  if (n>1) {
	  file=b[n]
  } else {
	  file=a[2]
  }
}
/symbolic names:/ {
  symbols=1
  details = 0
}
/keyword substitution:/ {
  symbols = 0
}
/^revision / {
  symbols = 0
  details = 1
  if (match(rev, /^1.1$/)) {
	details = 0;
  }
  if (details) {
	split($0, a);
	rev = a[2]
	split(a[2],b, /\./);
	r = b[2];
  }
}
/^----------/ || /^==========/ {
  if (details) {
	comment = 0
	revisions[r]=r
  }
}
!/-----------/ && !/===========/ && !/symbolic names:/ {
  if (symbols) {
   gsub(/[ \t]/, "");
    split($0, a, /:/);
    split(a[2],b, /\./);
    r = b[2];
  }
  if (details && comment) {
    comments = comments $0;
  }
}
END {
   n = asort(revisions)
   for (i=1; i<=n; i++) {
	r = revisions[i]
        next_file = file 
        gsub(/.java/, "-" (r+1) ".java", next_file)
        java_file = file 
	gsub(/.java/, "-" r ".java", java_file)
	system("../../../scripts/raw_cvs/co.sh ldiff " r " \"" rcs_file "\" \"" file "\" \"" java_file "\" \"" next_file "\"");
	system("../../../scripts/raw_cvs/co.sh java5_ldiff " r " \"" rcs_file "\" \"" file "\" \"" java_file "\" \"" next_file "\"");
	system("../../../scripts/raw_cvs/co.sh norm_ldiff " r " \"" rcs_file "\" \"" file "\" \"" java_file "\" \"" next_file "\"");
   }
   system("rm -f " next_file);
}
