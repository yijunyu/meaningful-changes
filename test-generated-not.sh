if [ ! -f test-generated-not.txt ]; then
	grep -l "@generated NOT" cvs/gmf/J/[A-F]*.java > test-generated-not.txt
	grep -l "@generated NOT" cvs/gmf/J/[G-M]*.java >> test-generated-not.txt
	grep -l "@generated NOT" cvs/gmf/J/[N-Z]*.java >> test-generated-not.txt
fi
for f in `cat test-generated-not.txt`; do
 echo $f
 scripts/mct-mdsd -comment $f > $f.generated_not
done
