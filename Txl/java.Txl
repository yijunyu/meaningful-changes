include "java.grm"
redefine type_declaration
        [class_declaration]  [NL] [NL] 
    |    [interface_declaration]  [NL] [NL] 
    |    [enum_declaration]  [NL] 
end define

redefine enum_body
        '{ [IN]
            [list enum_element]  [opt  ',]  [repeat class_body_declaration]  [EX]
        '}  [opt  ';]  [NL] [NL] 
end define

redefine package_declaration
        [opt package_header]  [repeat import_declaration]  [repeat type_declaration] 
end define

redefine class_header
        [repeat modifier]  'class  [class_name]  [opt extends_clause]  [opt implements_clause] 
end define

redefine interface_header
        [repeat modifier]  [opt annot_marker]  'interface  [interface_name]  [opt extends_clause]  [opt implements_clause] 
end define

redefine enum_header
        [repeat modifier]  [opt id]  'enum  [opt declared_name] 
end define

redefine extends_clause
        'extends  [list type_name +] 
end define

redefine implements_clause
        'implements  [list qualified_name +] 
end define

redefine class_or_interface_body
        '{ [NL] [IN]
            [repeat class_body_declaration]  [EX]
        '}  [opt  ';]  [NL] [NL] 
end define

redefine constructor_declaration
                [NL]
        [repeat modifier]  [opt generic_parameter]  [constructor_declarator]  [opt throws]  [constructor_body]  [NL] [NL] 
end define

redefine variable_declaration
        [repeat modifier]  [type_specifier]  [variable_declarators]  ';  [NL] 
end define

redefine variable_declarators
        [list variable_declarator +] 
end define

redefine method_declaration
                [NL]
        [repeat modifier]  [opt generic_parameter]  [type_specifier]  [method_declarator]  [opt throws]  [method_body] 
end define

redefine throws
        'throws  [list qualified_name +] 
end define

redefine method_body
        [block]  [NL] [NL] 
    |    [opt annotation_default]  ';  [NL] [NL] 
end define

redefine annotation_value_list
        [single_annotation_value] 
    |    [list keyed_annotation_value] 
end define

redefine single_annotation_value
        [expression] 
    |    [nested_annotation] 
    |    { [list expression_or_nested_annotation] } 
end define

redefine block
        '{ [NL] [IN]
            [repeat declaration_or_statement]  [EX]
        '} 
end define

redefine catch_clause
        'catch  '( [repeat modifier]  [type_specifier]  [variable_name]  ')  [block] 
end define

function contains Object  [any]
    match  *  [any]
        Object 
end function

function Private A  [class_body_declaration]
    match  [class_or_interface_body]
        B  [class_or_interface_body] 
    construct M  [modifier *]
        _  [^  A] 
    construct PublicModifiers  [modifier *]
        'public  'protected 
    where not
        M  [contains  each  PublicModifiers] end function

redefine class_declaration
        ...
    |    [empty] 
end define

function find_replace_class_declaration
    replace  [program]
        P  [ program ] 
    construct S  [class_declaration *]
        _  [ find_clones_class_declaration  P ] 
    by
        P  [mark_clones_class_declaration  each  S]
 
end function

rule mark_clones_class_declaration S  [class_declaration]
    import CloneNumber [number]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    replace  [class_declaration]
        S 
    by

end rule

function find_clones_class_declaration P  [program]
    construct S  [class_declaration *]
        _  [ ^  P ] 
    replace  [class_declaration *]

    by
        _  [add_if_clones_class_declaration  S  each  S]
 
end function

function add_if_clones_class_declaration SS  [class_declaration *] Stmt  [class_declaration]
    deconstruct * SS
        Stmt  Rest  [ class_declaration  * ] 
    deconstruct * [class_declaration] Rest
        Stmt 
    replace  [class_declaration *]
        StructuredClones  [ class_declaration  * ] 
    deconstruct not * [class_declaration] StructuredClones
        Stmt 
    by
        StructuredClones  [ . Stmt ] 
end function

redefine interface_declaration
        ...
    |    [empty] 
end define

function find_replace_interface_declaration
    replace  [program]
        P  [ program ] 
    construct S  [interface_declaration *]
        _  [ find_clones_interface_declaration  P ] 
    by
        P  [mark_clones_interface_declaration  each  S]
 
end function

rule mark_clones_interface_declaration S  [interface_declaration]
    import CloneNumber [number]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    replace  [interface_declaration]
        S 
    by

end rule

function find_clones_interface_declaration P  [program]
    construct S  [interface_declaration *]
        _  [ ^  P ] 
    replace  [interface_declaration *]

    by
        _  [add_if_clones_interface_declaration  S  each  S]
 
end function

function add_if_clones_interface_declaration SS  [interface_declaration *] Stmt  [interface_declaration]
    deconstruct * SS
        Stmt  Rest  [ interface_declaration  * ] 
    deconstruct * [interface_declaration] Rest
        Stmt 
    replace  [interface_declaration *]
        StructuredClones  [ interface_declaration  * ] 
    deconstruct not * [interface_declaration] StructuredClones
        Stmt 
    by
        StructuredClones  [ . Stmt ] 
end function

redefine enum_declaration
        ...
    |    [empty] 
end define

function find_replace_enum_declaration
    replace  [program]
        P  [ program ] 
    construct S  [enum_declaration *]
        _  [ find_clones_enum_declaration  P ] 
    by
        P  [mark_clones_enum_declaration  each  S]
 
end function

rule mark_clones_enum_declaration S  [enum_declaration]
    import CloneNumber [number]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    replace  [enum_declaration]
        S 
    by

end rule

function find_clones_enum_declaration P  [program]
    construct S  [enum_declaration *]
        _  [ ^  P ] 
    replace  [enum_declaration *]

    by
        _  [add_if_clones_enum_declaration  S  each  S]
 
end function

function add_if_clones_enum_declaration SS  [enum_declaration *] Stmt  [enum_declaration]
    deconstruct * SS
        Stmt  Rest  [ enum_declaration  * ] 
    deconstruct * [enum_declaration] Rest
        Stmt 
    replace  [enum_declaration *]
        StructuredClones  [ enum_declaration  * ] 
    deconstruct not * [enum_declaration] StructuredClones
        Stmt 
    by
        StructuredClones  [ . Stmt ] 
end function

redefine class_body_declaration
        ...
    |    [empty] 
end define

function find_replace_class_body_declaration
    replace  [program]
        P  [ program ] 
    construct S  [class_body_declaration *]
        _  [ find_clones_class_body_declaration  P ] 
    by
        P  [mark_clones_class_body_declaration  each  S]
 
end function

rule mark_clones_class_body_declaration S  [class_body_declaration]
    import CloneNumber [number]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    replace  [class_body_declaration]
        S 
    by

end rule

function find_clones_class_body_declaration P  [program]
    construct S  [class_body_declaration *]
        _  [ ^  P ] 
    replace  [class_body_declaration *]

    by
        _  [add_if_clones_class_body_declaration  S  each  S]
 
end function

function add_if_clones_class_body_declaration SS  [class_body_declaration *] Stmt  [class_body_declaration]
    deconstruct * SS
        Stmt  Rest  [ class_body_declaration  * ] 
    deconstruct * [class_body_declaration] Rest
        Stmt 
    replace  [class_body_declaration *]
        StructuredClones  [ class_body_declaration  * ] 
    deconstruct not * [class_body_declaration] StructuredClones
        Stmt 
    by
        StructuredClones  [ . Stmt ] 
end function

rule normalise_list_package_declaration_import_declaration
    replace  [repeat import_declaration]
        N1  [import_declaration]  N2  [import_declaration]  Rest  [repeat import_declaration] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2  N1  Rest 
end rule

rule normalise_list_class_header_modifier
    replace  [repeat modifier]
        N1  [modifier]  N2  [modifier]  Rest  [repeat modifier] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2  N1  Rest 
end rule

rule normalise_list_interface_header_modifier
    replace  [repeat modifier]
        N1  [modifier]  N2  [modifier]  Rest  [repeat modifier] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2  N1  Rest 
end rule

rule normalise_list_enum_header_modifier
    replace  [repeat modifier]
        N1  [modifier]  N2  [modifier]  Rest  [repeat modifier] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2  N1  Rest 
end rule

rule normalise_list_extends_clause_type_name
    replace  [list type_name]
        N1  [type_name] ,  N2  [type_name] ,  Rest  [list type_name] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2 ,  N1 ,  Rest 
end rule

rule normalise_list_implements_clause_qualified_name
    replace  [list qualified_name]
        N1  [qualified_name] ,  N2  [qualified_name] ,  Rest  [list qualified_name] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2 ,  N1 ,  Rest 
end rule

function normalise_ignore_by1_Private_class_or_interface_body_class_body_declaration1 E1  [class_or_interface_body] N1  [
  class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    where not
        E1  [Private  N1]
    by
        Seq  [ . N1 ] 
end function

function normalise_ignore_by2_Private_class_or_interface_body_class_body_declaration1 E1  [class_or_interface_body] N1  [
  class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    where
        E1  [Private  N1]
    by
        Seq 
end function

function normalise_ignore_by3_Private_class_or_interface_body_class_body_declaration1 E1  [class_or_interface_body]
    replace  [class_or_interface_body *]
        Seq  [class_or_interface_body *] 
    construct N1  [class_body_declaration *]
        _  [ ^  E1 ] 
    construct N2  [class_body_declaration *]
        _  [normalise_ignore_by1_Private_class_or_interface_body_class_body_declaration1  E1  each  N1]  [
                  normalise_ignore_by2_Private_class_or_interface_body_class_body_declaration1  E1  each  N1]
 
    construct E2  [class_or_interface_body]
        E1  [ $  N1  N2 ] 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_Private_class_or_interface_body_class_body_declaration1
    replace  [program]
        P1  [ program ] 
    construct List1  [class_or_interface_body *]
        _  [ ^  P1 ] 
    construct List2  [class_or_interface_body *]
        _  [normalise_ignore_by3_Private_class_or_interface_body_class_body_declaration1  each  List1]
 
    construct P2  [program]
        P1  [$  each  List1  List2]
 
    by
        P2 
end function

rule normalise_list_constructor_declaration_modifier
    replace  [repeat modifier]
        N1  [modifier]  N2  [modifier]  Rest  [repeat modifier] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2  N1  Rest 
end rule

rule normalise_list_variable_declaration_modifier
    replace  [repeat modifier]
        N1  [modifier]  N2  [modifier]  Rest  [repeat modifier] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2  N1  Rest 
end rule

rule normalise_list_variable_declarators_variable_declarator
    replace  [list variable_declarator]
        N1  [variable_declarator] ,  N2  [variable_declarator] ,  Rest  [list variable_declarator] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2 ,  N1 ,  Rest 
end rule

rule normalise_list_method_declaration_modifier
    replace  [repeat modifier]
        N1  [modifier]  N2  [modifier]  Rest  [repeat modifier] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2  N1  Rest 
end rule

rule normalise_list_throws_qualified_name
    replace  [list qualified_name]
        N1  [qualified_name] ,  N2  [qualified_name] ,  Rest  [list qualified_name] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2 ,  N1 ,  Rest 
end rule

rule normalise_list_annotation_value_list_keyed_annotation_value
    replace  [list keyed_annotation_value]
        N1  [keyed_annotation_value] ,  N2  [keyed_annotation_value] ,  Rest  [list keyed_annotation_value] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2 ,  N1 ,  Rest 
end rule

rule normalise_list_single_annotation_value_expression_or_nested_annotation
    replace  [list expression_or_nested_annotation]
        N1  [expression_or_nested_annotation] ,  N2  [expression_or_nested_annotation] ,  Rest  [list
          expression_or_nested_annotation] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2 ,  N1 ,  Rest 
end rule

function normalise_ignore_by2_block_declaration_or_statement1 E1  [block] N1  [declaration_or_statement]
    replace  [declaration_or_statement *]
        Seq  [declaration_or_statement *] 
    by
        Seq 
end function

function normalise_ignore_by3_block_declaration_or_statement1 E1  [block]
    replace  [block *]
        Seq  [block *] 
    construct N1  [declaration_or_statement *]
        _  [ ^  E1 ] 
    construct N2  [declaration_or_statement *]
        _  [normalise_ignore_by2_block_declaration_or_statement1  E1  each  N1]
 
    construct E2  [block]
        E1  [ $  N1  N2 ] 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_block_declaration_or_statement1
    replace  [program]
        P1  [ program ] 
    construct List1  [block *]
        _  [ ^  P1 ] 
    construct List2  [block *]
        _  [normalise_ignore_by3_block_declaration_or_statement1  each  List1]
 
    construct P2  [program]
        P1  [$  each  List1  List2]
 
    by
        P2 
end function

rule normalise_list_catch_clause_modifier
    replace  [repeat modifier]
        N1  [modifier]  N2  [modifier]  Rest  [repeat modifier] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2  N1  Rest 
end rule

function main
    replace  [program]
        Prg  [ program ] 
    export CloneNumber [number]
        0 
    by
        Prg  [ normalise_list_package_declaration_import_declaration ]  [ normalise_list_class_header_modifier ]  [ 
          normalise_list_interface_header_modifier ]  [ normalise_list_enum_header_modifier ]  [ 
          normalise_list_extends_clause_type_name ]  [ normalise_list_implements_clause_qualified_name ]  [ 
          normalise_ignore_by4_Private_class_or_interface_body_class_body_declaration1 ]  [ 
          normalise_list_constructor_declaration_modifier ]  [ normalise_list_variable_declaration_modifier ]  [ 
          normalise_list_variable_declarators_variable_declarator ]  [ normalise_list_method_declaration_modifier ]  [ 
          normalise_list_throws_qualified_name ]  [ normalise_list_annotation_value_list_keyed_annotation_value ]  [ 
          normalise_list_single_annotation_value_expression_or_nested_annotation ]  [ 
          normalise_ignore_by4_block_declaration_or_statement1 ]  [ normalise_list_catch_clause_modifier ]  [ 
          find_replace_class_declaration ]  [ find_replace_interface_declaration ]  [ find_replace_enum_declaration ]  [ 
          find_replace_class_body_declaration ] 
end function

