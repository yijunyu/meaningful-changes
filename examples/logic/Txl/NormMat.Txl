% Normalize Mates formulas
include "Mates.Grm"

function main
    replace [program]
        P [formula]
    by
        P [normalize]
end function

include "Normalize.Rul"
