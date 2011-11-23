% Simplify Mates logic formulas
include "Mates.Grm"

function main
    replace [program] 
        P [formula]
    by
        P [normalize]
          [simplify]
          [denormalize]
end function

include "Normalize.Rul"
include "Simplify.Rul"
include "Denormalize.Rul"
