#!/bin/bash
rm -f /tmp/diff.diff
if [ ! -f $2.diff ]; then
	diff -w $1 $2 > /tmp/diff.diff
	if [ -s /tmp/diff.diff ]; then
	    mv /tmp/diff.diff $2.diff
	fi
fi
