#!/bin/bash
if [ "$1" == "" ]; then
	$0 `pwd`/cvs/modeling/org.eclipse.gmp
	exit 0
fi
folder=$1
if [ ! -f $folder/test-model-all.txt ]; then
	find $folder -name "*.java" > $folder/test-model-all.txt
fi
i=0
for f in `cat $folder/test-model-all.txt`; do
 i=$(( $i + 1 ))
 if [ $i -eq 100 ]; then
   echo -n .
   i=0
 fi
 if [ -f $f.old ]; then
	 mv -f $f.old $f
 fi
 x=$(grep "@generated NOT" $f)
 if [ "$x" != "" ]; then
 	scripts/mct-mdsd $f > $f.tmp
	mv $f $f.old
	mv $f.tmp $f
 fi
done
