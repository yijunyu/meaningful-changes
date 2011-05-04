function count_bytes(){
rm -f *-2.java.*
for fmt in diff ldiff java5 normal java5_diff norm_diff clone; do
  count1=$(cat *.$fmt | grep "^[0-9]" | wc) 
  count2=$(cat *.$fmt | grep -v "^[0-9]" | wc) 
  count3=$(count_zero $fmt | wc) 
  echo $fmt blocks $count1 > $fmt.count
  echo $fmt bytes $count2 >> $fmt.count
  echo $fmt changes $count3 >> $fmt.count
done
cat *.count
} 
function count_zero() {
fmt=$1
for f in *.$fmt; do
  if [ -s $f ]; then
    echo $f
  fi
done
}
count_bytes
