if [ ! -f test.txt ]; then
	grep -l "@generated NOT" cvs/gmf/J/[A-F]*.java > test.txt
	grep -l "@generated NOT" cvs/gmf/J/[G-M]*.java >> test.txt
	grep -l "@generated NOT" cvs/gmf/J/[N-Z]*.java >> test.txt
fi
for f in `cat test.txt`; do
 echo $f
 scripts/mct-mdsd -comment $f > $f.generated_not
done
