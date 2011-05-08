include "v.grm"
redefine module
        [module_declaration]  ';  [NL]
        [repeat statement]  [NL]
        'endmodule  [NL] 
    |    [macro_statement] 
end define

redefine module_declaration
        'module  [id]  '( [list part_module_declaration]  ') 
end define

define source
        [module *] 
    |    [empty] 
end define

redefine program
        [source]  [opt source] 
end define

keys
    ... <<<  >>> 
end keys

compounds
    ... <<<  >>> 
end compounds

define Change
        <<<  [NL]
        |  >>>  [NL]
 
end define

redefine module
        ...
    |    [attr Change] 
end define

function find_replace_module
    replace  [program]
        P  [ program ] 
    import Program_Diff [program]

    construct S  [module *]
        _  [ find_clones_module  P  Program_Diff ] 
    construct P3  [program]
        P  [mark_clones_module  each  S]
 
    by
        P3 
end function

function find_clones_module P  [program] P2  [program]
    replace  [module *]
        _  [ module  * ] 
    construct S  [module *]
        _  [ ^  P ] 
    by
        _  [add_if_clones_module1  P2  each  S]
 
end function

function add_if_clones_module1 P2  [program] Stmt  [module]
    construct S2  [module *]
        _  [ ^  P2 ] 
    deconstruct * S2
        Stmt  Rest  [ module  * ] 
    replace  [module *]
        StructuredClones  [ module  * ] 
    deconstruct not * StructuredClones
        C  [attr Change] 
    by
        StructuredClones  [ . Stmt ] 
end function

function mark_clones_module S  [module]
    import CloneNumber [number]

    import Program_Diff [program]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    construct S1  [module]
        <<< 
    construct S2  [module]
        >>> 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    by
        P  [ $  S  S1 ] 
end function

function normalise_ignore_by3_module_statement1 E1  [module]
    replace  [module *]
        Seq  [module *] 
    deconstruct E1
        X1  [module_declaration]  ';  X2  [repeat statement]  'endmodule 
    construct E2  [module]
        X1  ';  'endmodule 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_module_statement1
    replace  [program]
        P1  [ program ] 
    construct List1  [module *]
        _  [ ^  P1 ] 
    construct List2  [module *]
        _  [normalise_ignore_by3_module_statement1  each  List1]
 
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
        Prg  [ normalise_ignore_by4_module_statement1 ]  [ normalise_list_module_declaration_part_module_declaration ] 
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
        Prg  [ find_replace_module ] 
end function

redefine program
        ...
    |    [empty]  |  [attr number] 
end define

function print_diff_1
    replace  [program]
        Prg  [ program ] 
    construct P2  [program]
        Prg  [ write  "t.t" ]  [ read  "t.t" ] 
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
    construct P2  [program]
        Prg  [ write  "t.t" ]  [ read  "t.t" ] 
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

    where
        CloneNumber  [>  0]
    import Program_Diff [program]

    construct P_Clone  [program]
        CloneNumber 
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
    by
        Prg  [ program_normalise ]  [ program_remove_clone ]  [ print_diff ] 
end function

