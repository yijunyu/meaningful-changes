include "XML.Grammar"
define tag_content
    [stag]  [IN]
        [content]  [EX]
    [etag] 
end define
redefine empty_elem_tag

    '<  [name]  [repeat attribute]  [spaces]  '/> 

end define
redefine stag

    '<  [name]  [repeat attribute]  [spaces]  '> 

end define
redefine attribute

    [spaces]  [name]  '=  [attvalue] 

end define
redefine sub2_content

    [element] 
    |    [reference] 
    |    [cdsect] 
    |    [pi] 
    |    [regexp] 

end define
redefine cdata

    [not cdend]  [token] 

end define
redefine misc

    [pi] 
    |    [space] 
    |    [newline] 

end define
keys
    ... <<<<<<  >>>>>> 
end keys

compounds
    ... <<<<<<  >>>>>> 
end compounds

define Change
            [NL]
    <<<<<<  [opt stringlit]  [NL]
    |  [NL]
    >>>>>>  [opt stringlit]  [NL]
 
end define
redefine stag
    ...
|       
    [attr Change] 

end define
function find_replace_stag
    replace  [program]
        P  [ program ] 
    import Program_Diff [program]

    construct S  [stag *]
        _  [ find_clones_stag  P  Program_Diff ] 
    construct P3  [program]
        P  [mark_clones_stag  each  S]
 
    by
        P3 
end function

function find_clones_stag P  [program] P2  [program]
    replace  [stag *]
        _  [ stag  * ] 
    construct S  [stag *]
        _  [ ^  P ] 
    by
        _  [add_if_clones_stag1  P2  each  S]
 
end function

function add_if_clones_stag1 P2  [program] Stmt  [stag]
    construct S2  [stag *]
        _  [ ^  P2 ] 
    deconstruct * S2
        Stmt  Rest  [ stag  * ] 
    replace  [stag *]
        StructuredClones  [ stag  * ] 
    deconstruct not * StructuredClones
        C  [attr Change] 
    by
        StructuredClones  [ . Stmt ] 
end function

function mark_clones_stag S  [stag]
    import CloneNumber [number]

    import Program_Diff [program]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    construct C  [stringlit]
        _  [ quote  S ] 
    where not
        C  [=  ""]
    construct S2  [stag]
        >>>>>>  C 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    construct S1  [stag]
        <<<<<<  C 
    by
        P  [ $  S  S1 ] 
end function

redefine content
    ...
|       
    [attr Change] 

end define
function find_replace_content
    replace  [program]
        P  [ program ] 
    import Program_Diff [program]

    construct S  [content *]
        _  [ find_clones_content  P  Program_Diff ] 
    construct P3  [program]
        P  [mark_clones_content  each  S]
 
    by
        P3 
end function

function find_clones_content P  [program] P2  [program]
    replace  [content *]
        _  [ content  * ] 
    construct S  [content *]
        _  [ ^  P ] 
    by
        _  [add_if_clones_content1  P2  each  S]
 
end function

function add_if_clones_content1 P2  [program] Stmt  [content]
    construct S2  [content *]
        _  [ ^  P2 ] 
    deconstruct * S2
        Stmt  Rest  [ content  * ] 
    replace  [content *]
        StructuredClones  [ content  * ] 
    deconstruct not * StructuredClones
        C  [attr Change] 
    by
        StructuredClones  [ . Stmt ] 
end function

function mark_clones_content S  [content]
    import CloneNumber [number]

    import Program_Diff [program]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    construct C  [stringlit]
        _  [ quote  S ] 
    where not
        C  [=  ""]
    construct S2  [content]
        >>>>>>  C 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    construct S1  [content]
        <<<<<<  C 
    by
        P  [ $  S  S1 ] 
end function

redefine etag
    ...
|       
    [attr Change] 

end define
function find_replace_etag
    replace  [program]
        P  [ program ] 
    import Program_Diff [program]

    construct S  [etag *]
        _  [ find_clones_etag  P  Program_Diff ] 
    construct P3  [program]
        P  [mark_clones_etag  each  S]
 
    by
        P3 
end function

function find_clones_etag P  [program] P2  [program]
    replace  [etag *]
        _  [ etag  * ] 
    construct S  [etag *]
        _  [ ^  P ] 
    by
        _  [add_if_clones_etag1  P2  each  S]
 
end function

function add_if_clones_etag1 P2  [program] Stmt  [etag]
    construct S2  [etag *]
        _  [ ^  P2 ] 
    deconstruct * S2
        Stmt  Rest  [ etag  * ] 
    replace  [etag *]
        StructuredClones  [ etag  * ] 
    deconstruct not * StructuredClones
        C  [attr Change] 
    by
        StructuredClones  [ . Stmt ] 
end function

function mark_clones_etag S  [etag]
    import CloneNumber [number]

    import Program_Diff [program]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    construct C  [stringlit]
        _  [ quote  S ] 
    where not
        C  [=  ""]
    construct S2  [etag]
        >>>>>>  C 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    construct S1  [etag]
        <<<<<<  C 
    by
        P  [ $  S  S1 ] 
end function

redefine attribute
    ...
|       
    [attr Change] 

end define
function find_replace_attribute
    replace  [program]
        P  [ program ] 
    import Program_Diff [program]

    construct S  [attribute *]
        _  [ find_clones_attribute  P  Program_Diff ] 
    construct P3  [program]
        P  [mark_clones_attribute  each  S]
 
    by
        P3 
end function

function find_clones_attribute P  [program] P2  [program]
    replace  [attribute *]
        _  [ attribute  * ] 
    construct S  [attribute *]
        _  [ ^  P ] 
    by
        _  [add_if_clones_attribute1  P2  each  S]
 
end function

function add_if_clones_attribute1 P2  [program] Stmt  [attribute]
    construct S2  [attribute *]
        _  [ ^  P2 ] 
    deconstruct * S2
        Stmt  Rest  [ attribute  * ] 
    replace  [attribute *]
        StructuredClones  [ attribute  * ] 
    deconstruct not * StructuredClones
        C  [attr Change] 
    by
        StructuredClones  [ . Stmt ] 
end function

function mark_clones_attribute S  [attribute]
    import CloneNumber [number]

    import Program_Diff [program]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    construct C  [stringlit]
        _  [ quote  S ] 
    where not
        C  [=  ""]
    construct S2  [attribute]
        >>>>>>  C 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    construct S1  [attribute]
        <<<<<<  C 
    by
        P  [ $  S  S1 ] 
end function

rule normalise_list_empty_elem_tag_attribute
    replace  [repeat attribute]
        N1  [attribute]  N2  [attribute]  Rest  [repeat attribute] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2  N1  Rest 
end rule

rule normalise_list_stag_attribute
    replace  [repeat attribute]
        N1  [attribute]  N2  [attribute]  Rest  [repeat attribute] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2  N1  Rest 
end rule

function program_normalise
    replace  [program]
        Prg  [ program ] 
    by
        Prg  [ normalise_list_empty_elem_tag_attribute ]  [ normalise_list_stag_attribute ] 
end function

function program_remove_clone
    replace  [program]
        Prg  [ program ] 
    export CloneNumber [number]
        0 
    import TXLargs [repeat stringlit]

    deconstruct * TXLargs
        "-diff"  Filename  [ stringlit ] 
    construct P2  [program]
        _  [ read  Filename ]  [ program_normalise ] 
    export Program_Diff [program]
        P2 
    by
        Prg  [ find_replace_stag ]  [ find_replace_content ]  [ find_replace_etag ]  [ find_replace_attribute ] 
end function

redefine program
    ...
|       
    [empty]  |  [attr number] 

end define
function print_diff_1
    replace  [program]
        Prg  [ program ] 
    import TXLinput [stringlit]

    construct Str_TmpFile  [stringlit]
        TXLinput  [ +  ".tmp" ] 
    construct Str_RmTmpFile  [stringlit]
        _  [ +  "/bin/rm -f " ]  [ +  Str_TmpFile ] 
    construct P2  [program]
        Prg  [ write  Str_TmpFile ]  [ read  Str_TmpFile ]  [ system  Str_RmTmpFile ] 
    construct S_Diff  [stringlit]
        _  [ quote  P2 ] 
    where not
        S_Diff  [=  ""]
    by
        Prg 
end function

function print_diff_2
    replace  [program]
        Prg  [ program ] 
    import TXLinput [stringlit]

    construct Str_TmpFile  [stringlit]
        TXLinput  [ +  ".tmp" ] 
    construct Str_RmTmpFile  [stringlit]
        _  [ +  "/bin/rm -f " ]  [ +  Str_TmpFile ] 
    construct P2  [program]
        Prg  [ program_normalise ]  [ write  Str_TmpFile ]  [ read  Str_TmpFile ]  [ system  Str_RmTmpFile ] 
    construct S_Diff  [stringlit]
        _  [ quote  P2 ] 
    where
        S_Diff  [=  ""]
    by
        _ 
end function

function print_diff
    replace  [program]
        P_diff  [ program ] 
    import CloneNumber [number]

    import Program_Diff [program]

    where
        CloneNumber  [>  0]
    construct P_Clone  [program]
        CloneNumber 
    construct P_Left  [program]
        P_diff  [ print_diff_1 ]  [ print_diff_2 ]  [ print ] 
    construct P_Right  [program]
        Program_Diff  [ print_diff_1 ]  [ print_diff_2 ]  [ print ] 
    by
        P_Clone 
end function

function main
    replace  [program]
        Prg  [ program ] 
    export Program_Diff [program]
        _ 
    export Program [program]
        Prg 
    by
        Prg  [ program_normalise ]  [ program_remove_clone ]  [ print_diff ] 
end function

