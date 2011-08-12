#!/bin/bash
folder=`pwd`/cvs/modeling/org.eclipse.gmp
if [ ! -f result/test-model-all.txt ]; then
	find $folder -name "*.java" > result/test-model-all.txt
fi
x=0
for f in `cat result/test-model-all.txt`; do
 x=$(( $x + 1 ))
 if [ $x -eq 10 ]; then
   echo -n .
   x=0
 fi
   file=$f.model.j
   g=${f/*-/}
   g1=${f/-*/}
   h=${g/\.java/}
   if [ "$h" != "1" -a "$h" != "" ]; then
   	 let h1="$h + 1"
   	 f1=$g1-$h1.java
	if [ -e $f1 ]; then
   	 x=$(grep "@model" $f1)
	 if [ "$x" != "" ]; then
		 file1=$g1-$h1.java.model.j
		 if [ ! -e $f.model ]; then
		    scripts/mct-model -comment $f > $f.model
		 fi
		 if [ ! -e $file ]; then
		    txl -i Txl $f.model Txl/Java/java5.Txl -o $file
		 fi
		 if [ -e $file1 ]; then
			echo "==" diff $file $file1
			scripts/ldiff.pl $file $file1 
		 fi
	 fi
	fi
   fi
done
