#!/bin/bash
rm -f /tmp/ldiff.ldiff
if [ ! -f $2.ldiff ]; then
	./ldiff.pl -w -o diff $* > /tmp/ldiff.ldiff
	if [ -s /tmp/ldiff.ldiff ]; then
	    mv /tmp/ldiff.ldiff $2.ldiff
	fi
fi
