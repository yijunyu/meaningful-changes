BEGIN{
  system("mkdir -p checkout")
}
{ 
  file=$1 
  version=$2
  date=$3
  print "mkdir -p checkout/`dirname " file "`"
  print "cp -r " file " checkout/`dirname " file "`"
}
