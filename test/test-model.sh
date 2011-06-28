if [ ! -f test-model.txt ]; then
	grep -l "@model" cvs/gmf/J/[A-F]*.java > test-model.txt
	grep -l "@model" cvs/gmf/J/[G-M]*.java >> test-model.txt
	grep -l "@model" cvs/gmf/J/[N-Z]*.java >> test-model.txt
fi
for f in `cat test-model.txt`; do
 echo $f
 scripts/mct-model -comment $f > $f.model
done
