include "pyindent.grm"

function main
    replace [program]
        Lines [program]
    by
	Lines [pyindent]
end function
