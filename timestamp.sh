folder=cvs/modeling/org.eclipse.gmp
rm -f $folder/dates.txt
awk -f classify.awk result/output.txt > p.sh
chmod +x p.sh
p.sh
