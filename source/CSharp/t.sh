echo > cs.API
for f in `find OpenFiniteStateMachine -name "*.cs"`; do
 ../../mct $f >> cs.API
done
wc `find OpenFiniteStateMachine -name "*.cs"` > cs.size
for f in `find OpenFiniteStateMachine -name "*.java"`; do
 ../../mct $f >> java.API
done
wc `find OpenFiniteStateMachine -name "*.java"` > java.size
