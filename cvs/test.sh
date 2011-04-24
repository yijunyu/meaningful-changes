for f in *,v; do
	rlog -q $f | awk -f diff.awk
done
