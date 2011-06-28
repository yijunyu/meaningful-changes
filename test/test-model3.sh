# extract the @model from the classes
if [ ! -f test-model3.txt ]; then
	find source/java/org* -name "*.java" > test-model3.txt
fi
for f in `cat test-model3.txt`; do
 for g in `grep -l "@generated NOT" $f`; do
   h=${g/source\/java\//}
   h1=$(dirname $h)
   h3=$(basename $h)
   mkdir -p result/java/generated_not/$h1
   hh=result/java/generated_not/$h1/$h3
   scripts/mct-mdsd -comment $g > $hh
 done
done
