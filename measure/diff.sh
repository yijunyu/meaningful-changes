echo > c.sh
for f in `cat ../../measure/cu.txt`; do
   ls $f.*.v | awk -f ../../measure/ls2diff.awk >> c.sh
done
chmod +x c.sh
c.sh
../../measure/count.sh
