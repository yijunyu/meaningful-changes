#!/bin/bash
rm -f /tmp/12.java
javac=../bin.`uname -s -m | sed 's/ /_/'`/javac
if [ ! -e $2.clone ]; then
	cat $1.norm $2.norm > /tmp/12.java
	$javac /tmp/12.java -o $2.clone >& $2.clone_error
fi
