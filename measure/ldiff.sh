echo > c.sh
for f in `cat ../../measure/cu.txt`; do
   ls $f.*.v | awk -f ../../measure/ls2ldiff.awk >> c.sh
done
chmod +x c.sh
/usr/bin/time -f %E c.sh
../../measure/count.sh
