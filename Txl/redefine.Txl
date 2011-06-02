include "txl.grm"
include "include_all.txl"
include "redefine2define.txl"
function main
  replace [program] P [program] 
  by P [include_all] 
       [redefine2define]
end function
