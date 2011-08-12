/revision 1.[0-9]/ {
  begin=1
}
!/revision 1.[0-9]/{
  if (begin) {
    print 
    begin = 0
  }
}
