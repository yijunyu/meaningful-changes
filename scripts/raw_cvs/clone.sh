#!/bin/bash
javac=../../../bin.`uname -s -m | sed 's/ /_/'`/api_clone_javac
if [ ! -e $2.clone ]; then
   if [ -e $1 -a -e $2 ]; then
	$javac $1 -diff $2 2> $2.clone
   fi
fi
