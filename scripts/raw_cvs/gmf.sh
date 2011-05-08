cd gmf
rm -f *.time
if [ ! -e java.txt ]; then
	echo get all non-trival java.txt
	find . -name *.java,v -print | grep -v example | grep -v examples | grep -v test | grep -v Attic > java.txt
fi
x=0
for f in `cat java.txt`; do
 x=$(( $x + 1 ))
 if [ $x -eq 10 ]; then
   echo -n .
   x=0
 fi
 rlog -q $f | awk -f ../../../scripts/raw_cvs/diff.awk
done
../../../scripts/raw_cvs/count.sh > ../../../result/gmf.txt
cd -
