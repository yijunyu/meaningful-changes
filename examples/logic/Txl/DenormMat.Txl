% Normalize Mates formulas
include "Mates.Grm"

function main
    replace [program]
        P [formula]
    by
        P [denormalize]
end function

include "Denormalize.Rul"
