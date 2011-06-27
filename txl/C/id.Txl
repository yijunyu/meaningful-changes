include "C/C.Grm"
include "C/CGnuOverrides.Grm"
include "C/CCommentOverrides.Grm"
redefine program
   ...
 | [id_nl*]
end define

define id_nl
   [id] [NL]
end define

function id2id_nl T [id]
  replace [id_nl*] V [id_nl*] 
  construct V2 [id_nl*] T 
  by _ [. V] [. V2] 
end function

rule sort
  replace [id*] N1 [id] N2 [id] Rest [id*] 
  construct S1 [stringlit] _ [quote N1]
  construct S2 [stringlit] _ [quote N2]
  where S1 [ > S2]
  by N2 N1 Rest 
end rule

rule uniq
  replace [id*] N1 [id] N2 [id] Rest [id*] 
  construct S1 [stringlit] _ [quote N1]
  construct S2 [stringlit] _ [quote N2]
  where S1 [= S2]
  construct Rest1 [id*] N1 Rest
  by Rest1 
end rule

function main
    replace [program] P [program]
    construct I [id*] _ [^ P] % [select 1 100] [sort] [uniq]
    construct I2 [id_nl*] _ [id2id_nl each I]
    by I2
end function
