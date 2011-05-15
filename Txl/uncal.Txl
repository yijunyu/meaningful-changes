include "uncal.grm"

comments
    (*  *)
end comments

define program
    [aexpr]
end define

function main
    replace [program]
	P [program]
    by
	P
end function
