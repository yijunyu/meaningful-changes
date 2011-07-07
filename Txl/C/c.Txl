% Null transform - format output according to grammar
include "C/C.Grm"

% Comment out this line to disallow Gnu gcc extensions
include "C/CGnuOverrides.Grm"

% Comment out this line to disallow parsing of comments
include "C/CCommentOverrides.Grm"

function main
    match [program]
        _ [program]
end function
