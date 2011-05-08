#!/bin/bash
javac=../../../bin.`uname -s -m | sed 's/ /_/'`/java5c
if [ ! -e $1.java5 ]; then
	$javac $1 -o $1.java5 >& $1.java5_error
fi
if [ ! -e $2.java5 ]; then
	$javac $2 -o $2.java5 >& $2.java5_error
fi
if [ ! -e $1.java5 -o ! -e $2.java5 ]; then
  echo parse error > $2.java5_error
else
  diff -w $1.java5 $2.java5 > $2.java5_diff
fi
