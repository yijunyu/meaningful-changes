#!/bin/bash
rm -f /tmp/1.normal
rm -f /tmp/1.error
rm -f /tmp/2.normal
rm -f /tmp/2.error
rm -f /tmp/norm.diff
rm -f /tmp/norm_error
if [ ! -e $2.norm ]; then
	../bin.`uname`/javac $1 -o /tmp/1.normal >& /tmp/1.error
	../bin.`uname`/javac $2 -o /tmp/2.normal >& /tmp/2.error
	if [ ! -e /tmp/1.normal -o ! -e /tmp/2.normal ]; then
	  echo parse error > $2.norm_error
	  diff -w $1 $2 > /tmp/norm.diff
	else
	  diff -w /tmp/1.normal /tmp/2.normal > /tmp/norm.diff
	fi
	if [ -s /tmp/norm.diff ]; then
	    mv /tmp/norm.diff $2.norm
	fi
fi
