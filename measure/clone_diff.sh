echo > cc.sh
for f in `cat ../../measure/cu.txt`; do
   ls $f.*.v | awk -f ../../measure/ls2clone.awk >> cc.sh
done
chmod +x cc.sh
cc.sh
../../measure/count.sh
