include "v.grm"
redefine module
        [module_declaration]  ';  [NL]
        [repeat statement]  [NL]
        'endmodule  [NL] 
    |    [macro_statement] 
end define

redefine declaration
        [parameter_specification] 
    |    [variable_declaration] 
    |    [variable_assignment_statement] 
    |    [if_statement] 
    |    [case_statement] 
    |    [block_statement] 
    |    [qualified_expression] 
    |    [component_configuration] 
    |    [function_decl] 
end define

redefine case_statement
        [case]  '( [expr]  ')  [case_statement_alternative *]  'endcase 
end define

redefine case_statement_alternative
        [list choice]  ':  [statement *] 
end define

redefine case_statement_alternative
        [macro_statement *] ... 
end define

redefine case_statement_alternative
        ... [macro_statement *] 
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

redefine statement
        ...
    |    [empty] 
end define

function find_replace_statement
    replace  [program]
        P  [ program ] 
    construct S  [statement *]
        _  [ find_clones_statement  P ] 
    by
        P  [mark_clones_statement  each  S]
 
end function

rule mark_clones_statement S  [statement]
    import CloneNumber [number]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    replace  [statement]
        S 
    by

end rule

function find_clones_statement P  [program]
    construct S  [statement *]
        _  [ ^  P ] 
    replace  [statement *]

    by
        _  [add_if_clones_statement  S  each  S]
 
end function

function add_if_clones_statement SS  [statement *] Stmt  [statement]
    deconstruct * SS
        Stmt  Rest  [ statement  * ] 
    deconstruct * [statement] Rest
        Stmt 
    replace  [statement *]
        StructuredClones  [ statement  * ] 
    deconstruct not * [statement] StructuredClones
        Stmt 
    by
        StructuredClones  [ . Stmt ] 
end function

redefine case_statement_alternative
        ...
    |    [empty] 
end define

function find_replace_case_statement_alternative
    replace  [program]
        P  [ program ] 
    construct S  [case_statement_alternative *]
        _  [ find_clones_case_statement_alternative  P ] 
    by
        P  [mark_clones_case_statement_alternative  each  S]
 
end function

rule mark_clones_case_statement_alternative S  [case_statement_alternative]
    import CloneNumber [number]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    replace  [case_statement_alternative]
        S 
    by

end rule

function find_clones_case_statement_alternative P  [program]
    construct S  [case_statement_alternative *]
        _  [ ^  P ] 
    replace  [case_statement_alternative *]

    by
        _  [add_if_clones_case_statement_alternative  S  each  S]
 
end function

function add_if_clones_case_statement_alternative SS  [case_statement_alternative *] Stmt  [case_statement_alternative]
    deconstruct * SS
        Stmt  Rest  [ case_statement_alternative  * ] 
    deconstruct * [case_statement_alternative] Rest
        Stmt 
    replace  [case_statement_alternative *]
        StructuredClones  [ case_statement_alternative  * ] 
    deconstruct not * [case_statement_alternative] StructuredClones
        Stmt 
    by
        StructuredClones  [ . Stmt ] 
end function

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

rule normalise_list_module_statement
    replace  [repeat statement]
        N1  [statement]  N2  [statement]  Rest  [repeat statement] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2  N1  Rest 
end rule

rule normalise_list_case_statement_alternative_choice
    replace  [list choice]
        N1  [choice] ,  N2  [choice] ,  Rest  [list choice] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2 ,  N1 ,  Rest 
end rule

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
        Prg  [ normalise_list_module_statement ]  [ normalise_list_case_statement_alternative_choice ]  [ 
          normalise_list_module_declaration_part_module_declaration ]  [ find_replace_statement ]  [ 
          find_replace_case_statement_alternative ]  [ find_replace_module ] 
end function

