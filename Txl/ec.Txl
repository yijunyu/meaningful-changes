include "ec.grm"

define program
    [EC_sentence*] 
end redefine

function main
    replace [program] P [program]
    by P
end function
