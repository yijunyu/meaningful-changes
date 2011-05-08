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

redefine module
        ...
    |    [empty] 
end define

function find_replace_module
    replace  [program]
        P  [ program ] 
    construct S  [module *]
        _  [ find_clones_module  P ] 
    by
        P  [mark_clones_module  each  S]
 
end function

rule mark_clones_module S  [module]
    import CloneNumber [number]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    replace  [module]
        S 
    by

end rule

function find_clones_module P  [program]
    construct S  [module *]
        _  [ ^  P ] 
    replace  [module *]

    by
        _  [add_if_clones_module  S  each  S]
 
end function

function add_if_clones_module SS  [module *] Stmt  [module]
    deconstruct * SS
        Stmt  Rest  [ module  * ] 
    deconstruct * [module] Rest
        Stmt 
    replace  [module *]
        StructuredClones  [ module  * ] 
    deconstruct not * [module] StructuredClones
        Stmt 
    by
        StructuredClones  [ . Stmt ] 
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

function main
    replace  [program]
        Prg  [ program ] 
    export CloneNumber [number]
        0 
    by
        Prg  [ normalise_ignore_by4_module_statement1 ]  [ normalise_list_module_declaration_part_module_declaration ]  [ 
          find_replace_module ] 
end function

