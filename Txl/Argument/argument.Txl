include "Argument/argument.grm"

define program
    [argument*] 
end redefine

function main
    replace [program] P [program]
    by P
end function
