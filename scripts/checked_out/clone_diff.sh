echo > cc.sh
for f in `cat cu.txt`; do
   ls $f.*.v | awk -f ../../scripts/checked_out/ls2clone.awk >> cc.sh
done
chmod +x cc.sh
cc.sh
../../scripts/checked_out/count.sh
