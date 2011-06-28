include "txl.grm"
include "Xtext/xtext.grm"

redefine program
  [xtext] | ...
end define

function main
 replace [program] P [program]
 by P
end function
