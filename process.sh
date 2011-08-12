folder=cvs/modeling/org.eclipse.gmp 
f=`basename $1`
file=`find $folder -name "$f"`
date=`rlog -N -r$2 $file | awk -f date.awk | awk '{print $2}'` 
echo $file $2 $date >> $folder/dates.txt
