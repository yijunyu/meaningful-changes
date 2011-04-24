#!/bin/bash
rm -f /tmp/1.java
rm -f /tmp/2.java
rm -f /tmp/1.error
rm -f /tmp/2.error
rm -f /tmp/java5.diff
rm -f /tmp/java5_error
if [ ! -f $2.java5 ]; then
	../bin.`uname`/java5c $1 -o /tmp/1.java >& /tmp/1.error
	../bin.`uname`/java5c $1 -o /tmp/2.java >& /tmp/2.error
	if [ ! -e /tmp/1.java -o ! -e /tmp/2.java ]; then
	  echo parse error > $2.java5_error
	  diff -w $1 $2 > /tmp/java5.diff
	else
	  diff -w /tmp/1.java /tmp/2.java > /tmp/java5.diff
	fi
	if [ -s /tmp/java5.diff ]; then
	    mv /tmp/java5.diff $2.java5
	fi
fi
