% Author: Yijun Yu
% Purpose: parse LaTeX

include "LaTeX/tex.grm"

define program
    [tex]
end define

function main
    replace [program]
	P [program]
    by 
	P 
end function
