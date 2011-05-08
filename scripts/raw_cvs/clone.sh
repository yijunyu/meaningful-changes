#!/bin/bash
rm -f /tmp/12.java
javac=../../../bin.`uname -s -m | sed 's/ /_/'`/api_clone_javac
if [ ! -e $2.clone ]; then
   if [ -e $1.normal -a -e $2.normal ]; then
	cat $1.normal $2.normal > /tmp/12.java
	$javac /tmp/12.java -o $2.clone >& $2.clone_error
   fi
fi
