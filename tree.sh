txl -i Txl t.1 result/norm/Java/java.Txl - -diff t.2 2>&1 | grep -v TXL | grep -v "\.\.\. *$" | grep -v "@Override" > t.12
cat > t.uncal <<EOF
program @cycle 
EOF
txl -i Txl t.12 result/norm/Java/java.Txl -Dresult 2>&1 | \
  awk -f gmf/parsetree.awk | xsltproc scripts/uncal.xsl - | \
  sed -e 's/stringlit:""/stringlit:"/g' | sed -e 's/""$/"/g' | \
  sed -e 's/:"$/:""/g' \
>> t.uncal
