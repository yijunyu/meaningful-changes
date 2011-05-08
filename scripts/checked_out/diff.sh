echo > c.sh
for f in `cat cu.txt`; do
   ls $f.*.v | awk -f ../../scripts/checked_out/ls2diff.awk >> c.sh
done
chmod +x c.sh
c.sh
../../scripts/checked_out/count.sh
