include "txl.grm"
include "include_all.txl"
function main
  replace [program] P [program] 
  by P [include_all]
end function
