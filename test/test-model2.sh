# extract the @model from the classes
if [ ! -f test-model2.txt ]; then
	find source/java/org* -name "*.java" > test-model2.txt
fi
for f in `cat test-model2.txt`; do
 for g in `grep -l "@model" $f`; do
   h=${g/source\/java\//}
   h1=$(dirname $h)
   h2=$(basename $h)
   mkdir -p result/java/model/$h1
   hh=result/java/model/$h1/$h2
   scripts/mct-model -comment $g > $hh
 done
done
