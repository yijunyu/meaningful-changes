compounds
    -^  ^- 
end compounds

define program
    [repeat class_relation] 
end define
define class_relation
    [class_definition]  [association]  [class_definition]  [NL] 
end define
define class_definition
    '[ [id]  [opt class_attributes_methods]  '] 
end define
define class_attributes_methods
    [class_attributes]  [class_methods] 
end define
define class_attributes
    '|  [repeat class_attribute] 
end define
define class_attribute
    [id]  [attr  ';] 
end define
define class_methods
    '|  [repeat class_method] 
end define
define class_method
    [SPOFF]  [id]  '( ')  [SPON]  [attr  ';] 
end define
define association
    [inheritance_association] 
end define
define inheritance_association
    '^ 
    |    '^- 
    |    '-^ 
end define
function swap
    replace  [class_relation]
        C1  [class_definition]  '-^  C2  [class_definition] 
    by
        C2  '^-  C1 
end function

function Swap
    replace  [class_relation *]
        A1  [class_relation]  A2  [class_relation *] 
    construct B1  [class_relation]
        A1  [swap] 
    construct B2  [class_relation *]
        A2  [Swap] 
    by
        _  [. B1]  [. B2] 
end function

keys
    <<<<<<  >>>>>> 
end keys

compounds
    <<<<<<  >>>>>> 
end compounds

define Change
            [NL]
    <<<<<<  [opt number]  [opt stringlit]  [NL]
    |  [NL]
    >>>>>>  [opt number]  [opt stringlit]  [NL]
 
end define
redefine class_attribute
    ...
|       
    [attr Change] 

end define
function find_replace_class_attribute
    replace  [program]
        P  [ program ] 
    import Program_Diff [program]

    construct S  [class_attribute *]
        _  [ find_clones_class_attribute  P  Program_Diff ] 
    construct P3  [program]
        P  [mark_clones_class_attribute  each  S]
 
    by
        P3 
end function

function find_clones_class_attribute P  [program] P2  [program]
    replace  [class_attribute *]
        _  [ class_attribute  * ] 
    construct S  [class_attribute *]
        _  [ ^  P ] 
    by
        _  [add_if_clones_class_attribute1  P2  each  S]
 
end function

function add_if_clones_class_attribute1 P2  [program] Stmt  [class_attribute]
    construct S2  [class_attribute *]
        _  [ ^  P2 ] 
    deconstruct * S2
        Stmt  Rest  [ class_attribute  * ] 
    replace  [class_attribute *]
        StructuredClones  [ class_attribute  * ] 
    deconstruct not * StructuredClones
        C  [attr Change] 
    by
        StructuredClones  [ . Stmt ] 
end function

function mark_clones_class_attribute S  [class_attribute]
    import CloneNumber [number]

    import Program_Diff [program]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    construct C  [stringlit]
        _  [ quote  S ] 
    where not
        C  [=  ""]
    construct S2  [class_attribute]
        >>>>>>  CloneNumber  C 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    construct S1  [class_attribute]
        <<<<<<  CloneNumber  C 
    by
        P  [ $  S  S1 ] 
end function

redefine class_method
    ...
|       
    [attr Change] 

end define
function find_replace_class_method
    replace  [program]
        P  [ program ] 
    import Program_Diff [program]

    construct S  [class_method *]
        _  [ find_clones_class_method  P  Program_Diff ] 
    construct P3  [program]
        P  [mark_clones_class_method  each  S]
 
    by
        P3 
end function

function find_clones_class_method P  [program] P2  [program]
    replace  [class_method *]
        _  [ class_method  * ] 
    construct S  [class_method *]
        _  [ ^  P ] 
    by
        _  [add_if_clones_class_method1  P2  each  S]
 
end function

function add_if_clones_class_method1 P2  [program] Stmt  [class_method]
    construct S2  [class_method *]
        _  [ ^  P2 ] 
    deconstruct * S2
        Stmt  Rest  [ class_method  * ] 
    replace  [class_method *]
        StructuredClones  [ class_method  * ] 
    deconstruct not * StructuredClones
        C  [attr Change] 
    by
        StructuredClones  [ . Stmt ] 
end function

function mark_clones_class_method S  [class_method]
    import CloneNumber [number]

    import Program_Diff [program]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    construct C  [stringlit]
        _  [ quote  S ] 
    where not
        C  [=  ""]
    construct S2  [class_method]
        >>>>>>  CloneNumber  C 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    construct S1  [class_method]
        <<<<<<  CloneNumber  C 
    by
        P  [ $  S  S1 ] 
end function

function normalise_prefer_by2_program_class_relation1 E1  [program]
    replace  [program *]
        Seq  [program *] 
    deconstruct not E1
        X8  [repeat class_relation] 
    by
        Seq  [ . E1 ] 
end function

function normalise_prefer_by3_program_class_relation1 E1  [program]
    replace  [program *]
        Seq  [program *] 
    deconstruct E1
        X8  [repeat class_relation] 
    construct X9  [repeat class_relation]
        X8  [Swap]
 
    construct E2  [program]
        X9 
    by
        Seq  [ . E2 ] 
end function

function normalise_prefer_by4_program_class_relation1
    replace  [program]
        P1  [ program ] 
    construct List1  [program *]
        _  [ ^  P1 ] 
    construct List2  [program *]
        _  [normalise_prefer_by3_program_class_relation1  each  List1]  [normalise_prefer_by2_program_class_relation1  each 
                  List1]
 
    construct P2  [program]
        P1  [$  each  List1  List2]
 
    by
        P2 
end function

rule normalise_list_class_attributes_class_attribute
    replace  [repeat class_attribute]
        N1  [class_attribute]  N2  [class_attribute]  Rest  [repeat class_attribute] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2  N1  Rest 
end rule

rule normalise_list_class_methods_class_method
    replace  [repeat class_method]
        N1  [class_method]  N2  [class_method]  Rest  [repeat class_method] 
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
        Prg  [ normalise_prefer_by4_program_class_relation1 ]  [ normalise_list_class_attributes_class_attribute ]  [ 
          normalise_list_class_methods_class_method ] 
end function

function program_remove_clone
    replace  [program]
        Prg  [ program ] 
    export CloneNumber [number]
        0 
    import TXLargs [repeat stringlit]

    deconstruct * TXLargs
        "-diff"  Filename  [ stringlit ] 
    export CloneNumber
        99 
    construct P2  [program]
        _  [ read  Filename ]  [ program_normalise ] 
    export Program_Diff [program]
        P2 
    by
        Prg  [ find_replace_class_attribute ]  [ find_replace_class_method ] 
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
        CloneNumber  [ -  99 ] 
    construct P_Left  [program]
        P_diff  [ print_diff_1 ]  [ print_diff_2 ]  [ printattr ] 
    construct P_Right  [program]
        Program_Diff  [ print_diff_1 ]  [ print_diff_2 ]  [ printattr ] 
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

