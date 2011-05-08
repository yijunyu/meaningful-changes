#!/bin/bash
javac=../../../bin.`uname -s -m | sed 's/ /_/'`/api_clone_javac
if [ ! -e $1.normal ]; then
	$javac $1 -o $1.normal >& $1.normal_error
fi
if [ ! -e $2.normal ]; then
	$javac $2 -o $2.normal >& $2.normal_error
fi
if [ ! -e $1.normal -o ! -e $2.normal ]; then
	  echo parse error > $2.norm_error
else
	  diff -w $1.normal $2.normal > $2.norm_diff
fi
