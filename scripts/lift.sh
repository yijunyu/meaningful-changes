#!/bin/bash
g=$1
echo $g
#echo "scripts/mct-mdsd $g > $g.tmp"
scripts/mct-mdsd $g > $g.tmp
mv $g $g.old
mv $g.tmp $g
