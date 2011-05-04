function count_bytes(){
for fmt in java java.diff java.java5 java.java5_diff java.normal java.norm_diff; do
  count1=$(find . -name "*.$fmt" | xargs grep "^[0-9]" | wc) 
  count2=$(find . -name "*.$fmt" | xargs grep -v "^[0-9]" | wc) 
  count3=$(count_zero $fmt | wc) 
  echo $fmt LOC $count0 > $fmt.count
  echo $fmt blocks $count1 >> $fmt.count
  echo $fmt bytes $count2 >> $fmt.count
  echo $fmt changes $count3 >> $fmt.count
done
cat *.count
} 

function count_zero() {
fmt=$1
find . -name "*.$fmt" | xargs ../is_zero.sh
}
count_bytes
