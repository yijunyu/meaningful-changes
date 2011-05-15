include "q7.grm"

define program
    [advice*] 
end redefine

function main
    replace [program] P [program]
    by P [quotation]
end function

function quotation
    replace [program] P [program]
    by P [to_quotation]
end function

function to_quotation 
    replace [program] P [program]
    construct N [name*] _ [^ P]
    construct P1 [program] P [convert each N]
    by P1 
end function

function convert N [name]
    replace [program] P [program]
    by P [convert1 N] [convert2 N]
end function

function convert1 N [name]
    replace [program] P [program]
    deconstruct N N1 [stringlit]
    construct SN [stringlit] N1
    construct NN [name] SN
    by P [$ N NN]
end function

function convert2 N [name]
    replace [program] P [program]
    deconstruct not N _ [stringlit]
    construct SN [stringlit] _ [quote N]
    construct NN [name] SN
    by P [$ N NN]
end function

