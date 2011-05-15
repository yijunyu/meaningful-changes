include "java.grm"
redefine method_body
        [repeat block] 
    |    [opt annotation_default]  '; 
end define

redefine constructor_body
        [repeat block] 
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

keys
    ... <<<<<<  >>>>>> 
end keys

compounds
    ... <<<<<<  >>>>>> 
end compounds

define Change
        <<<<<<  [NL]
        |  >>>>>>  [NL]
 
end define

redefine class_declaration
        ...
    |    [attr Change] 
end define

function find_replace_class_declaration
    replace  [program]
        P  [ program ] 
    import Program_Diff [program]

    construct S  [class_declaration *]
        _  [ find_clones_class_declaration  P  Program_Diff ] 
    construct P3  [program]
        P  [mark_clones_class_declaration  each  S]
 
    by
        P3 
end function

function find_clones_class_declaration P  [program] P2  [program]
    replace  [class_declaration *]
        _  [ class_declaration  * ] 
    construct S  [class_declaration *]
        _  [ ^  P ] 
    by
        _  [add_if_clones_class_declaration1  P2  each  S]
 
end function

function add_if_clones_class_declaration1 P2  [program] Stmt  [class_declaration]
    construct S2  [class_declaration *]
        _  [ ^  P2 ] 
    deconstruct * S2
        Stmt  Rest  [ class_declaration  * ] 
    replace  [class_declaration *]
        StructuredClones  [ class_declaration  * ] 
    deconstruct not * StructuredClones
        C  [attr Change] 
    by
        StructuredClones  [ . Stmt ] 
end function

function mark_clones_class_declaration S  [class_declaration]
    import CloneNumber [number]

    import Program_Diff [program]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    construct S1  [class_declaration]
        <<<<<< 
    construct S2  [class_declaration]
        >>>>>> 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    by
        P  [ $  S  S1 ] 
end function

redefine interface_declaration
        ...
    |    [attr Change] 
end define

function find_replace_interface_declaration
    replace  [program]
        P  [ program ] 
    import Program_Diff [program]

    construct S  [interface_declaration *]
        _  [ find_clones_interface_declaration  P  Program_Diff ] 
    construct P3  [program]
        P  [mark_clones_interface_declaration  each  S]
 
    by
        P3 
end function

function find_clones_interface_declaration P  [program] P2  [program]
    replace  [interface_declaration *]
        _  [ interface_declaration  * ] 
    construct S  [interface_declaration *]
        _  [ ^  P ] 
    by
        _  [add_if_clones_interface_declaration1  P2  each  S]
 
end function

function add_if_clones_interface_declaration1 P2  [program] Stmt  [interface_declaration]
    construct S2  [interface_declaration *]
        _  [ ^  P2 ] 
    deconstruct * S2
        Stmt  Rest  [ interface_declaration  * ] 
    replace  [interface_declaration *]
        StructuredClones  [ interface_declaration  * ] 
    deconstruct not * StructuredClones
        C  [attr Change] 
    by
        StructuredClones  [ . Stmt ] 
end function

function mark_clones_interface_declaration S  [interface_declaration]
    import CloneNumber [number]

    import Program_Diff [program]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    construct S1  [interface_declaration]
        <<<<<< 
    construct S2  [interface_declaration]
        >>>>>> 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    by
        P  [ $  S  S1 ] 
end function

redefine enum_declaration
        ...
    |    [attr Change] 
end define

function find_replace_enum_declaration
    replace  [program]
        P  [ program ] 
    import Program_Diff [program]

    construct S  [enum_declaration *]
        _  [ find_clones_enum_declaration  P  Program_Diff ] 
    construct P3  [program]
        P  [mark_clones_enum_declaration  each  S]
 
    by
        P3 
end function

function find_clones_enum_declaration P  [program] P2  [program]
    replace  [enum_declaration *]
        _  [ enum_declaration  * ] 
    construct S  [enum_declaration *]
        _  [ ^  P ] 
    by
        _  [add_if_clones_enum_declaration1  P2  each  S]
 
end function

function add_if_clones_enum_declaration1 P2  [program] Stmt  [enum_declaration]
    construct S2  [enum_declaration *]
        _  [ ^  P2 ] 
    deconstruct * S2
        Stmt  Rest  [ enum_declaration  * ] 
    replace  [enum_declaration *]
        StructuredClones  [ enum_declaration  * ] 
    deconstruct not * StructuredClones
        C  [attr Change] 
    by
        StructuredClones  [ . Stmt ] 
end function

function mark_clones_enum_declaration S  [enum_declaration]
    import CloneNumber [number]

    import Program_Diff [program]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    construct S1  [enum_declaration]
        <<<<<< 
    construct S2  [enum_declaration]
        >>>>>> 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    by
        P  [ $  S  S1 ] 
end function

redefine class_body_declaration
        ...
    |    [attr Change] 
end define

function find_replace_class_body_declaration
    replace  [program]
        P  [ program ] 
    import Program_Diff [program]

    construct S  [class_body_declaration *]
        _  [ find_clones_class_body_declaration  P  Program_Diff ] 
    construct P3  [program]
        P  [mark_clones_class_body_declaration  each  S]
 
    by
        P3 
end function

function find_clones_class_body_declaration P  [program] P2  [program]
    replace  [class_body_declaration *]
        _  [ class_body_declaration  * ] 
    construct S  [class_body_declaration *]
        _  [ ^  P ] 
    by
        _  [add_if_clones_class_body_declaration1  P2  each  S]
 
end function

function add_if_clones_class_body_declaration1 P2  [program] Stmt  [class_body_declaration]
    construct S2  [class_body_declaration *]
        _  [ ^  P2 ] 
    deconstruct * S2
        Stmt  Rest  [ class_body_declaration  * ] 
    replace  [class_body_declaration *]
        StructuredClones  [ class_body_declaration  * ] 
    deconstruct not * StructuredClones
        C  [attr Change] 
    by
        StructuredClones  [ . Stmt ] 
end function

function mark_clones_class_body_declaration S  [class_body_declaration]
    import CloneNumber [number]

    import Program_Diff [program]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    construct S1  [class_body_declaration]
        <<<<<< 
    construct S2  [class_body_declaration]
        >>>>>> 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    by
        P  [ $  S  S1 ] 
end function

redefine package_header
        ...
    |    [attr Change] 
end define

function find_replace_package_header
    replace  [program]
        P  [ program ] 
    import Program_Diff [program]

    construct S  [package_header *]
        _  [ find_clones_package_header  P  Program_Diff ] 
    construct P3  [program]
        P  [mark_clones_package_header  each  S]
 
    by
        P3 
end function

function find_clones_package_header P  [program] P2  [program]
    replace  [package_header *]
        _  [ package_header  * ] 
    construct S  [package_header *]
        _  [ ^  P ] 
    by
        _  [add_if_clones_package_header1  P2  each  S]
 
end function

function add_if_clones_package_header1 P2  [program] Stmt  [package_header]
    construct S2  [package_header *]
        _  [ ^  P2 ] 
    deconstruct * S2
        Stmt  Rest  [ package_header  * ] 
    replace  [package_header *]
        StructuredClones  [ package_header  * ] 
    deconstruct not * StructuredClones
        C  [attr Change] 
    by
        StructuredClones  [ . Stmt ] 
end function

function mark_clones_package_header S  [package_header]
    import CloneNumber [number]

    import Program_Diff [program]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    construct S1  [package_header]
        <<<<<< 
    construct S2  [package_header]
        >>>>>> 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    by
        P  [ $  S  S1 ] 
end function

redefine import_declaration
        ...
    |    [attr Change] 
end define

function find_replace_import_declaration
    replace  [program]
        P  [ program ] 
    import Program_Diff [program]

    construct S  [import_declaration *]
        _  [ find_clones_import_declaration  P  Program_Diff ] 
    construct P3  [program]
        P  [mark_clones_import_declaration  each  S]
 
    by
        P3 
end function

function find_clones_import_declaration P  [program] P2  [program]
    replace  [import_declaration *]
        _  [ import_declaration  * ] 
    construct S  [import_declaration *]
        _  [ ^  P ] 
    by
        _  [add_if_clones_import_declaration1  P2  each  S]
 
end function

function add_if_clones_import_declaration1 P2  [program] Stmt  [import_declaration]
    construct S2  [import_declaration *]
        _  [ ^  P2 ] 
    deconstruct * S2
        Stmt  Rest  [ import_declaration  * ] 
    replace  [import_declaration *]
        StructuredClones  [ import_declaration  * ] 
    deconstruct not * StructuredClones
        C  [attr Change] 
    by
        StructuredClones  [ . Stmt ] 
end function

function mark_clones_import_declaration S  [import_declaration]
    import CloneNumber [number]

    import Program_Diff [program]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    construct S1  [import_declaration]
        <<<<<< 
    construct S2  [import_declaration]
        >>>>>> 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    by
        P  [ $  S  S1 ] 
end function

function normalise_preferred_tokens_method_body_block1 B  [method_body]
    replace  [method_body *]
        A  [method_body *] 
    deconstruct not B
        '; 
    construct B1  [method_body]
        '; 
    by
        _  [ . A ]  [ . B1 ] 
end function

function normalise_preferred_replace_method_body_block1
    replace  [program]
        Prg  [ program ] 
    construct A  [method_body *]
        _  [ ^  Prg ] 
    construct A1  [method_body *]
        _  [normalise_preferred_tokens_method_body_block1  each  A]
 
    by
        Prg  [$  each  A  A1]
 
end function

function normalise_preferred_tokens_constructor_body_block1 B  [constructor_body]
    replace  [constructor_body *]
        A  [constructor_body *] 
    deconstruct not B
        '{ '} 
    construct B1  [constructor_body]
        '{ '} 
    by
        _  [ . A ]  [ . B1 ] 
end function

function normalise_preferred_replace_constructor_body_block1
    replace  [program]
        Prg  [ program ] 
    construct A  [constructor_body *]
        _  [ ^  Prg ] 
    construct A1  [constructor_body *]
        _  [normalise_preferred_tokens_constructor_body_block1  each  A]
 
    by
        Prg  [$  each  A  A1]
 
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
    deconstruct E1
        '{ N1  [repeat class_body_declaration]  '}  X1  [opt  ';] 
    construct N2  [class_body_declaration *]
        _  [normalise_ignore_by1_Private_class_or_interface_body_class_body_declaration1  E1  each  N1]  [
                  normalise_ignore_by2_Private_class_or_interface_body_class_body_declaration1  E1  each  N1]
 
    construct E2  [class_or_interface_body]
        '{ N2  '}  X1 
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

function program_normalise
    replace  [program]
        Prg  [ program ] 
    by
        Prg  [ normalise_ignore_by4_Private_class_or_interface_body_class_body_declaration1 ]  [ 
          normalise_preferred_replace_method_body_block1 ]  [ normalise_preferred_replace_constructor_body_block1 ]  [ 
          normalise_list_enum_body_class_body_declaration ]  [ normalise_list_package_declaration_import_declaration ]  [ 
          normalise_list_class_header_modifier ]  [ normalise_list_interface_header_modifier ]  [ 
          normalise_list_enum_header_modifier ]  [ normalise_list_extends_clause_type_name ]  [ 
          normalise_list_implements_clause_qualified_name ]  [ normalise_list_constructor_declaration_modifier ]  [ 
          normalise_list_variable_declaration_modifier ]  [ normalise_list_variable_declarators_variable_declarator ]  [ 
          normalise_list_method_declaration_modifier ]  [ normalise_list_throws_qualified_name ]  [ 
          normalise_list_annotation_value_list_keyed_annotation_value ]  [ 
          normalise_list_single_annotation_value_expression_or_nested_annotation ]  [ normalise_list_catch_clause_modifier ] 
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
        Prg  [ find_replace_class_declaration ]  [ find_replace_interface_declaration ]  [ find_replace_enum_declaration ]  [ 
          find_replace_class_body_declaration ]  [ find_replace_package_header ]  [ find_replace_import_declaration ] 
end function

redefine program
        ...
    |    [empty]  |  [attr number] 
end define

function print_diff_1
    replace  [program]
        Prg  [ program ] 
    construct P2  [program]
        Prg  [ write  "t.t" ]  [ read  "t.t" ]  [ system  "/bin/rm -f t.t" ] 
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
        Prg  [ write  "t.t" ]  [ read  "t.t" ]  [ system  "/bin/rm -f t.t" ] 
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

