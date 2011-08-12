folder=cvs/modeling/org.eclipse.gmp
find $folder -name "*.ecore,v" | xargs move.sh
find $folder -name "*.genmodel,v" | xargs move.sh
