include "java.grm"
redefine method_body
        [repeat block] 
    |    [opt annotation_default]  '; 
end define

redefine constructor_body
        [repeat block] 
end define

redefine program
        [package_declaration *] 
end define

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

redefine import_declaration
        'import  [opt  'static]  [imported_name]  ';  [NL] 
    |    ';  [NL] 
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
            [repeat class_body_declaration]  [EX] [NL]
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

redefine annotation_value_list
        [single_annotation_value] 
    |    [list keyed_annotation_value] 
end define

redefine single_annotation_value
        [expression] 
    |    [nested_annotation] 
    |    { [list expression_or_nested_annotation] } 
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

redefine package_header
        ...
    |    [empty] 
end define

function find_replace_package_header
    replace  [program]
        P  [ program ] 
    construct S  [package_header *]
        _  [ find_clones_package_header  P ] 
    by
        P  [mark_clones_package_header  each  S]
 
end function

rule mark_clones_package_header S  [package_header]
    import CloneNumber [number]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    replace  [package_header]
        S 
    by

end rule

function find_clones_package_header P  [program]
    construct S  [package_header *]
        _  [ ^  P ] 
    replace  [package_header *]

    by
        _  [add_if_clones_package_header  S  each  S]
 
end function

function add_if_clones_package_header SS  [package_header *] Stmt  [package_header]
    deconstruct * SS
        Stmt  Rest  [ package_header  * ] 
    deconstruct * [package_header] Rest
        Stmt 
    replace  [package_header *]
        StructuredClones  [ package_header  * ] 
    deconstruct not * [package_header] StructuredClones
        Stmt 
    by
        StructuredClones  [ . Stmt ] 
end function

redefine import_declaration
        ...
    |    [empty] 
end define

function find_replace_import_declaration
    replace  [program]
        P  [ program ] 
    construct S  [import_declaration *]
        _  [ find_clones_import_declaration  P ] 
    by
        P  [mark_clones_import_declaration  each  S]
 
end function

rule mark_clones_import_declaration S  [import_declaration]
    import CloneNumber [number]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    replace  [import_declaration]
        S 
    by

end rule

function find_clones_import_declaration P  [program]
    construct S  [import_declaration *]
        _  [ ^  P ] 
    replace  [import_declaration *]

    by
        _  [add_if_clones_import_declaration  S  each  S]
 
end function

function add_if_clones_import_declaration SS  [import_declaration *] Stmt  [import_declaration]
    deconstruct * SS
        Stmt  Rest  [ import_declaration  * ] 
    deconstruct * [import_declaration] Rest
        Stmt 
    replace  [import_declaration *]
        StructuredClones  [ import_declaration  * ] 
    deconstruct not * [import_declaration] StructuredClones
        Stmt 
    by
        StructuredClones  [ . Stmt ] 
end function

function normalise_ignore_by2_method_body_block1 N1  [block]
    replace  [method_body]
        N1 
    by

end function

function normalise_ignore_by3_method_body_block1 E1  [method_body]
    replace  [method_body *]
        Seq  [method_body *] 
    construct N1  [block *]
        _  [ ^  E1 ] 
    construct E2  [method_body]
        E1  [normalise_ignore_by2_method_body_block1  each  N1]
 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_method_body_block1
    replace  [program]
        P1  [ program ] 
    construct List1  [method_body *]
        _  [ ^  P1 ] 
    construct List2  [method_body *]
        _  [normalise_ignore_by3_method_body_block1  each  List1]
 
    construct P2  [program]
        P1  [$  each  List1  List2]
 
    by
        P2 
end function

function normalise_ignore_by2_constructor_body_block1 N1  [block]
    replace  [constructor_body]
        N1 
    by

end function

function normalise_ignore_by3_constructor_body_block1 E1  [constructor_body]
    replace  [constructor_body *]
        Seq  [constructor_body *] 
    construct N1  [block *]
        _  [ ^  E1 ] 
    construct E2  [constructor_body]
        E1  [normalise_ignore_by2_constructor_body_block1  each  N1]
 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_constructor_body_block1
    replace  [program]
        P1  [ program ] 
    construct List1  [constructor_body *]
        _  [ ^  P1 ] 
    construct List2  [constructor_body *]
        _  [normalise_ignore_by3_constructor_body_block1  each  List1]
 
    construct P2  [program]
        P1  [$  each  List1  List2]
 
    by
        P2 
end function

rule normalise_list_enum_body_class_body_declaration
    replace  [repeat class_body_declaration]
        N1  [class_body_declaration]  N2  [class_body_declaration]  Rest  [repeat class_body_declaration] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2  N1  Rest 
end rule

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
        Prg  [ normalise_ignore_by4_method_body_block1 ]  [ normalise_ignore_by4_constructor_body_block1 ]  [ 
          normalise_list_enum_body_class_body_declaration ]  [ normalise_list_package_declaration_import_declaration ]  [ 
          normalise_list_class_header_modifier ]  [ normalise_list_interface_header_modifier ]  [ 
          normalise_list_enum_header_modifier ]  [ normalise_list_extends_clause_type_name ]  [ 
          normalise_list_implements_clause_qualified_name ]  [ 
          normalise_ignore_by4_Private_class_or_interface_body_class_body_declaration1 ]  [ 
          normalise_list_constructor_declaration_modifier ]  [ normalise_list_variable_declaration_modifier ]  [ 
          normalise_list_variable_declarators_variable_declarator ]  [ normalise_list_method_declaration_modifier ]  [ 
          normalise_list_throws_qualified_name ]  [ normalise_list_annotation_value_list_keyed_annotation_value ]  [ 
          normalise_list_single_annotation_value_expression_or_nested_annotation ]  [ normalise_list_catch_clause_modifier ]  [ 
          find_replace_class_declaration ]  [ find_replace_interface_declaration ]  [ find_replace_enum_declaration ]  [ 
          find_replace_class_body_declaration ]  [ find_replace_package_header ]  [ find_replace_import_declaration ] 
end function

