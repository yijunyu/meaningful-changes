#!/bin/bash
rm -f /tmp/12.java
javac=../bin.`uname -s -m | sed 's/ /_/'`/javac
if [ ! -e $2.norm ]; then
	cat $1 $2 > /tmp/12.java
	$javac /tmp/12.java -o $2.norm >& $2.norm_error
fi
