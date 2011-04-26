#!/bin/bash
rm -f /tmp/1.normal
rm -f /tmp/1.error
rm -f /tmp/2.normal
rm -f /tmp/2.error
rm -f /tmp/norm.clone
rm -f /tmp/norm_error
javac=../bin.`uname -s -m | sed 's/ /_/'`/javac
#diff=diff -w
diff=./detect.sh
if [ ! -e $2.norm ]; then
	$javac $1 -o /tmp/1.normal >& /tmp/1.error
	$javac $2 -o /tmp/2.normal >& /tmp/2.error
	if [ ! -e /tmp/1.normal -o ! -e /tmp/2.normal ]; then
	  echo parse error > $2.norm_error
	  $diff $1 $2 > /tmp/norm.clone
	else
	  $diff /tmp/1.normal /tmp/2.normal > /tmp/norm.clone
	fi
	if [ -s /tmp/norm.clone ]; then
	    mv /tmp/norm.clone $2.clone
	fi
fi
