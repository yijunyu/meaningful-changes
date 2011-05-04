#!/bin/bash
#javac=../../bin.`uname -s -m | sed 's/ /_/'`/javac
javac=../../bin.`uname -s -m | sed 's/ /_/'`/api_clone_javac
if [ ! -e $2.normal ]; then
	sed 's/Collections\.</Collections./g' $2 > $2.tmp
	$javac $2.tmp -o $2.normal >& $2.normal_error
	rm -f $2.tmp
	if [ ! -e $1.normal -o ! -e $2.normal ]; then
	  echo parse error > $2.norm_error
	else
	  diff -w $1.normal $2.normal > $2.norm_diff
	fi
fi
