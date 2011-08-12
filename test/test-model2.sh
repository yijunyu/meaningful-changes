#!/bin/bash
folder=`pwd`/cvs/modeling/org.eclipse.gmp
if [ ! -f $folder/test-model-all.txt ]; then
	find $folder -name "*.java" > $folder/test-model-all.txt
fi
if [ ! -f $folder/test-model.txt ]; then
	touch -f $folder/test-model.txt
	for f in `cat $folder/test-model-all.txt`; do
	 x=$(( $x + 1 ))
	 if [ $x -eq 10 ]; then
	   echo -n .
	   x=0
	 fi
	 file=$f.model.j
	 if [ -f $file ]; then
	   echo $f >> $folder/test-model.txt
	 fi
	done
fi
