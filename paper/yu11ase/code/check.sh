cat -n HelloWorld-1.java
cat -n HelloWorld-2.java
/usr/bin/time diff -w HelloWorld-1.java HelloWorld-2.java > HelloWorld-2.diff
cat -n HelloWorld-2.diff
/usr/bin/time ../../../cvs/ldiff.pl -w -o diff HelloWorld-1.java HelloWorld-2.java > HelloWorld-2.ldiff
cat -n HelloWorld-2.ldiff
/usr/bin/time ../../../bin.`uname -s -m | sed 's/ /_/'`/javac  HelloWorld-2.java > HelloWorld-2.norm
cat HelloWorld-1.java HelloWorld-2.java > HelloWorld-2.clone
/usr/bin/time ../../../bin.`uname -s -m | sed 's/ /_/'`/javac  HelloWorld-2.clone > HelloWorld-2.mct
