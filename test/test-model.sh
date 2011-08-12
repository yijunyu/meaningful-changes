#!/bin/bash
folder=`pwd`/cvs/modeling/org.eclipse.gmp
progress=100
if [ ! -f $folder/test-model-all.txt ]; then
	find $folder -name "*.java" > $folder/test-model-all.txt
fi
i=0
for f in `cat $folder/test-model-all.txt`; do
 i=$(( $i + 1 ))
 if [ $i -eq $progress ]; then
   echo -n . 1>&2
   i=0
 fi
 file=$f.model.j
 g=${f/*-/}
 h=${g/\.java/}
 if [ "$h" != "1" -a "$h" != "" ]; then
   	 x=$(grep "@model" $f)
	 if [ "$x" != "" ]; then
		 if [ ! -e $f.model ]; then
		    scripts/mct-model -comment $f > $f.model
		 fi
		 if [ ! -e $file ]; then
		    txl -i Txl $f.model Txl/Java/java5.Txl -o $file
		 fi
	 fi
   fi
done
echo "~~diff~~" 1>&2 
i=0
for f in `cat $folder/test-model-all.txt`; do
 i=$(( $i + 1 ))
 if [ $i -eq $progress ]; then
   echo -n . 1>&2 
   i=0
 fi
 file=$f.model.j
 g=${f/*-/}
 g1=${f/-*/}
 h=${g/\.java/}
 if [ "$h" != "1" -a "$h" != "" ]; then
   let h1="$h + 1"
   f1=$g1-$h1.java
   if [ -e $f1 ]; then
	 file1=$g1-$h1.java.model.j
	 if [ -e $file -a -e $file1 ]; then
		echo "==" diff $file $file1
		scripts/ldiff.pl $file $file1 
	fi
   fi
 fi
done
