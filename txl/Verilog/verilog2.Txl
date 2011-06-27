include "Verilog/v.grm"
redefine module

    [module_declaration]  ';  [NL]
    [repeat statement]  [NL]
    'endmodule  [NL] 
    |    [macro_statement] 

end define
redefine module_declaration

    'module  [id]  '( [list part_module_declaration]  ') 

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
function normalise_ignore_by2_module_statement2 E1  [module]
    replace  [module *]
        Seq  [module *] 
    deconstruct not E1
        X10  [module_declaration]  ';  X11  [repeat statement]  'endmodule 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_module_statement2 E1  [module]
    replace  [module *]
        Seq  [module *] 
    deconstruct E1
        X10  [module_declaration]  ';  X11  [repeat statement]  'endmodule 
    construct E2  [module]
        X10  ';  'endmodule 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_module_statement2
    replace  [program]
        P1  [ program ] 
    construct List1  [module *]
        _  [ ^  P1 ] 
    construct List2  [module *]
        _  [normalise_ignore_by3_module_statement2  each  List1]  [normalise_ignore_by2_module_statement2  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

rule normalise_list_module_declaration_part_module_declaration
    replace  [list part_module_declaration]
        N1  [part_module_declaration] ,  N2  [part_module_declaration] ,  Rest  [list part_module_declaration] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2 ,  N1 ,  Rest 
end rule

function program_normalise
    replace  [program]
        Prg  [ program ] 
    by
        Prg  [ normalise_ignore_by4_module_statement2 ]  [ normalise_list_module_declaration_part_module_declaration ] 
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
        CloneNumber 
    construct P_Left  [program]
        P_diff  [ print_diff_1 ]  [ print_diff_2 ]  [ printattr ] 
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

