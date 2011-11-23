compounds
    -^  ^- 
end compounds

define uml_program
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
rule normalise_list_uml_program_class_relation
    replace  [repeat class_relation]
        N1  [class_relation]  N2  [class_relation]  Rest  [repeat class_relation] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2  N1  Rest 
end rule

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
        Prg  [ normalise_list_uml_program_class_relation ]  [ normalise_list_class_attributes_class_attribute ]  [ 
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
        Prg 
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

