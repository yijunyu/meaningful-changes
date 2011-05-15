include "json.grm"

define program
    [object] | [array]
end redefine

function main
    replace [program] P [program] by P
end function
