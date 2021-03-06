#!/bin/bash
checker=$1
revision=$2
rcs_file=$3
file=$4
java_file=$5
next_file=$6
if [ ! -e "$next_file" ]; then
	co -q -f1.$revision  $rcs_file
	if [[ "$revision" -eq "1" ]]; then
	  touch -f $java_file
	fi 
	mv $file $next_file
fi
if [ ! "$revision" == "2" ]; then
	/usr/bin/time -f %E ../../../scripts/raw_cvs/$checker.sh $java_file $next_file 2>> $checker.time
fi
