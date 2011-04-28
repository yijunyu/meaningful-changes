rm -f *-2.java.*
#for fmt in diff java5 norm; do
for fmt in diff ldiff java5 norm; do
  count1=$(cat *.$fmt | grep "^[0-9]" | wc) 
  count2=$(cat *.$fmt | grep -v "^[0-9]" | wc) 
  echo $fmt $count1 > $fmt.count
  echo $fmt $count2 >> $fmt.count
done
cat *.count
