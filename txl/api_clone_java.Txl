tokens
    space              "[ \t]+"
    newline            "\n"
               |       ""
               |       "\n"
    id                 "[$\u][$\i]*"
    number             "\d+[lL]?"
               |       "\d+.\d*([eE][+-]?\d+)?[fFdD]?"
               |       ".\d+([eE][+-]?\d+)?[fFdD]?"
               |       "\d+[eE][+-]?\d+[fFdD]?"
               |       "\d+([eE][+-]?\d+)?[fFdD]"
               |       "0[xX][\dabcdefABCDEF]+.[pP][+-]?\d+[fFdD]?"
               |       "0[xX][\dabcdefABCDEF]*.[\dabcdefABCDEF]+[pP][+-]?\d+[fFdD]?"
               |       "0[xX][\dabcdefABCDEF]+([pP][+-]?\d+)?[lLfFdD]?"
end tokens

comments
    //  
    /* */
end comments

compounds
    !=  '%=  &&  &=  *=  ++  +=  --  -=  /=  ^=  |=  ||  <<  <<=  <=  ==  >= ... 
end compounds

keys
    'abstract  'assert  'boolean  'break  'byte  'case  'catch  'char  'class  'const  'continue  'default  'do  'double  'else 
      'extends  'false  'final  'finally  'float  'for  'goto  'if  'implements  'import  'instanceof  'int  'interface  'long 
      'native  'new  'null  'package  'private  'protected  'public  'return  'short  'static  'strictfp  'switch  'synchronized
      'throw  'throws  'transient  'true  'try  'void  'volatile  'while 
end keys

define package_name
    [qualified_name] 
end define
define imported_name
    [package_or_type_name]  [opt dot_star] 
end define
define package_or_type_name
    [qualified_name] 
end define
define dot_star
    '. '* 
end define
define declared_name
    [id]  [opt generic_parameter] 
end define
define class_declaration
    [class_header]  [class_body] 
end define
define class_body
    [class_or_interface_body] 
end define
define interface_declaration
    [interface_header]  [interface_body] 
end define
define annot_marker
    '@ 
end define
define interface_body
    [class_or_interface_body] 
end define
define enum_declaration
    [enum_header]  [enum_body] 
end define
define enum_element
            [NL]
    [id]  [opt method_argument] 
end define
define class_name
    [declared_name] 
end define
define interface_name
    [declared_name] 
end define
define empty_declaration
    ';  [NL] 
end define
define member_declaration
    [method_or_constructor_declaration] 
    |    [type_declaration] 
end define
define method_or_constructor_declaration
    [method_declaration] 
    |    [constructor_declaration] 
end define
define instance_initializer
            [NL]
    [block]  [NL] [NL] 
end define
define static_initializer
            [NL]
    'static  [block]  [NL] [NL] 
end define
define constructor_declarator
    [class_name]  '( [list formal_parameter]  ') 
end define
define field_declaration
    [variable_declaration] 
end define
define variable_declarator
    [variable_name]  [opt equals_variable_initializer] 
end define
define variable_name
    [declared_name]  [repeat dimension] 
end define
define equals_variable_initializer
    '=  [variable_initializer] 
end define
define variable_initializer
    [expression] 
    |    [array_initializer] 
end define
define array_initializer
    '{ [list variable_initializer]  [opt  ',]  '} 
end define
define method_declarator
    [method_name]  '( [list formal_parameter]  ')  [repeat dimension] 
end define
define method_name
    [declared_name] 
end define
define formal_parameter
    [opt  'final]  [type_specifier]  [opt var_arg_specifier]  [formal_parameter_name] 
end define
define var_arg_specifier
    '... 
end define
define formal_parameter_name
    [variable_name] 
end define
define annotation_default
    'default  [expression] 
    |    'default  [array_initializer] 
end define
define type_specifier
    [type_name] 
    |    [array_type_specifier] 
end define
define array_type_specifier
    [type_name]  [repeat dimension +] 
end define
define type_name
    [primitive_type] 
    |    [qualified_name] 
end define
define primitive_type
    'boolean 
    |    'char 
    |    'byte 
    |    'short 
    |    'int 
    |    'long 
    |    'float 
    |    'double 
    |    'void 
end define
define annotation
    [SPOFF]  '@  [reference]  [SPON]  [opt annotation_value_spec]  [NL] 
end define
define annotation_value_spec
    '( [annotation_value_list]  ') 
end define
define nested_annotation
    [annotation] 
end define
define expression_or_nested_annotation
    [expression] 
    |    [nested_annotation] 
end define
define keyed_annotation_value
    [id]  '=  [single_annotation_value] 
end define
define block
    '{ [NL] [IN]
        [repeat declaration_or_statement]  [EX]
    '} 
end define
define declaration_or_statement
    [local_variable_declaration] 
    |    [class_declaration] 
    |    [statement] 
end define
define local_variable_declaration
    [variable_declaration] 
end define
define statement
    [label_statement] 
    |    [empty_statement] 
    |    [expression_statement] 
    |    [if_statement] 
    |    [switch_statement] 
    |    [while_statement] 
    |    [do_statement] 
    |    [for_statement] 
    |    [for_in_statement] 
    |    [break_statement] 
    |    [continue_statement] 
    |    [return_statement] 
    |    [throw_statement] 
    |    [synchronized_statement] 
    |    [try_statement] 
    |    [assert_statement] 
    |    [block] 
end define
define empty_statement
    ';  [NL] 
end define
define label_statement
    [label_name]  ':  [statement] 
end define
define label_name
    [reference] 
end define
define expression_statement
    [expression]  ';  [NL] 
end define
define if_statement
    'if  '( [expression]  ')  [statement]  [opt else_clause]  [NL] 
end define
define else_clause
    'else  [statement] 
end define
define switch_statement
    'switch  '( [expression]  ')  [switch_block]  [NL] 
end define
define switch_block
    '{ [IN] [NL]
        [repeat switch_alternative]  [EX]
    '} 
end define
define switch_alternative
    [switch_label]  [IN] [NL]
        [repeat declaration_or_statement]  [EX] 
end define
define switch_label
    'case  [constant_expression]  ': 
    |    'default  ': 
end define
define while_statement
    'while  '( [expression]  ')  [statement]  [NL] 
end define
define do_statement
    'do  [statement]  'while  '( [expression]  ')  ';  [NL] 
end define
define for_statement
    'for  '( [for_init]  [for_expression]  [for_update]  ')  [statement]  [NL] 
end define
define for_init
    [list expression]  '; 
    |    [local_variable_declaration] 
end define
define for_expression
    [opt expression]  '; 
end define
define for_update
    [list expression] 
end define
define for_in_statement
    'for  '( [for_in_init]  :  [expression]  ')  [statement]  [NL] 
end define
define for_in_init
    [repeat modifier]  [type_specifier]  [variable_name] 
end define
define break_statement
    'break  [opt label_name]  ';  [NL] 
end define
define continue_statement
    'continue  [opt label_name]  ';  [NL] 
end define
define return_statement
    'return  [opt expression]  ';  [NL] 
end define
define throw_statement
    'throw  [expression]  ';  [NL] 
end define
define synchronized_statement
    'synchronized  '( [expression]  ')  [statement]  [NL] 
end define
define try_statement
    'try  [block]  [repeat catch_clause]  [opt finally_clause]  [NL] 
end define
define catch_clause
    'catch  '( [repeat modifier]  [type_specifier]  [variable_name]  ')  [block] 
end define
define finally_clause
    'finally  [block] 
end define
define assert_statement
    'assert  [expression]  [opt assert_error_code]  ';  [NL] 
end define
define assert_error_code
    ':  [expression] 
end define
define constant_expression
    [expression] 
end define
define expression
    [assignment_expression] 
end define
define assignment_expression
    [conditional_expression] 
    |    [unary_expression]  [assignment_operator]  [assignment_expression] 
end define
define assignment_operator
    '= 
    |    '*= 
    |    '/= 
    |    '%= 
    |    '+= 
    |    '-= 
    |    '<<= 
    |    [SPOFF]  '>  '>=  [SPON] 
    |    [SPOFF]  '>  '>  '>=  [SPON] 
    |    '&= 
    |    '^= 
    |    '|= 
end define
define conditional_expression
    [conditional_or_expression]  [opt conditional_choice] 
end define
define conditional_choice
    '?  [expression]  ':  [conditional_expression] 
end define
define conditional_or_expression
    [conditional_and_expression]  [repeat or_conditional_and_expression] 
end define
define or_conditional_and_expression
    '||  [conditional_and_expression] 
end define
define conditional_and_expression
    [inclusive_or_expression]  [repeat and_inclusive_or_expression] 
end define
define and_inclusive_or_expression
    '&&  [inclusive_or_expression] 
end define
define inclusive_or_expression
    [exclusive_or_expression]  [repeat or_exclusive_or_expression] 
end define
define or_exclusive_or_expression
    '|  [exclusive_or_expression] 
end define
define exclusive_or_expression
    [and_expression]  [repeat or_and_expression] 
end define
define or_and_expression
    '^  [and_expression] 
end define
define and_expression
    [equality_expression]  [repeat and_equality_expression] 
end define
define and_equality_expression
    '&  [equality_expression] 
end define
define equality_expression
    [relational_expression]  [repeat equality_op_relational_expression] 
end define
define equality_op_relational_expression
    [equality_op]  [relational_expression] 
end define
define equality_op
    '== 
    |    '!= 
end define
define relational_expression
    [shift_expression]  [repeat relational_op_shift_expression] 
end define
define relational_op_shift_expression
    [relational_op]  [shift_expression] 
    |    'instanceof  [type_specifier] 
end define
define relational_op
    '< 
    |    '> 
    |    '<= 
    |    '>= 
end define
define shift_expression
    [additive_expression]  [repeat shift_additive_expression] 
end define
define shift_additive_expression
    [shift_op]  [additive_expression] 
end define
define shift_op
    '<< 
    |    [SPOFF]  '>  '>  [SPON] 
    |    [SPOFF]  '>  '>  '>  [SPON] 
end define
define additive_expression
    [multiplicative_expression]  [repeat add_op_multiplicative_expression] 
end define
define add_op_multiplicative_expression
    [add_op]  [multiplicative_expression] 
end define
define add_op
    '+ 
    |    '- 
end define
define multiplicative_expression
    [unary_expression]  [repeat mult_op_unary_expression] 
end define
define mult_op_unary_expression
    [mult_op]  [unary_expression] 
end define
define mult_op
    '* 
    |    '/ 
    |    '% 
end define
define unary_expression
    [pre_inc_dec]  [unary_expression] 
    |    [unary_op]  [unary_expression] 
    |    [postfix_expression] 
    |    [cast_expression] 
end define
define pre_inc_dec
    '++ 
    |    '-- 
end define
define unary_op
    '+ 
    |    '- 
    |    '~ 
    |    '! 
end define
define cast_expression
    '( [type_specifier]  ')  [unary_expression] 
end define
define postfix_expression
    [primary]  [repeat post_inc_dec] 
end define
define post_inc_dec
    '++ 
    |    '-- 
end define
define subscript
    '[ [expression]  '] 
end define
define primary
    [literal]  [repeat component] 
    |    [reference] 
    |    '( [expression]  ')  [repeat component] 
    |    [class_instance_creation_expression]  [repeat component] 
    |    [array_creation_expression]  [repeat component] 
end define
define literal
    [numeric_literal] 
    |    [character_literal] 
    |    [string_literal] 
    |    [boolean_literal] 
    |    [null_literal] 
end define
define numeric_literal
    [number] 
end define
define character_literal
    [charlit] 
end define
define string_literal
    [stringlit] 
end define
define boolean_literal
    'true 
    |    'false 
end define
define null_literal
    'null 
end define
define class_instance_creation_expression
    'new  [class_or_interface_name]  '( [list argument]  ')  [opt class_body] 
end define
define class_or_interface_name
    [id]  [repeat class_or_interface_component] 
end define
define class_or_interface_component
    [dot_id] 
    |    '. [generic_argument] 
    |    [generic_argument] 
end define
define array_creation_expression
    'new  [array_type_specifier]  [opt array_initializer] 
end define
define dimension
    '[ [opt expression]  '] 
end define
define argument
    [expression] 
    |    [type_specifier] 
end define
define qualified_name
    [reference] 
end define
define reference
    [id]  [repeat dimension]  [repeat component] 
    |    [primitive_type]  [repeat dimension]  [repeat component] 
end define
define component
    [dot_id] 
    |    [method_argument] 
    |    [subscript] 
    |    [generic_argument] 
    |    '. [class_instance_declaration] 
end define
define class_instance_declaration
    [class_instance_creation_expression] 
    |    'class 
end define
define method_argument
    '( [list argument]  ') 
end define
define dot_id
    '. [id] 
    |    '. 'class 
end define
define generic_argument
    '<  [list type_argument]  '> 
end define
define type_argument
    [type_specifier] 
    |    [wildcard_type] 
end define
define wildcard_type
    '?  [opt wildcard_type_bound] 
    |    [id]  [opt wildcard_type_bound] 
end define
define wildcard_type_bound
    'extends  [type_specifier] 
    |    'super  [type_specifier] 
end define
define generic_parameter
    <  [list type_parameter]  > 
end define
define type_parameter
    [declared_name]  [opt type_bound_clause] 
end define
define type_bound_clause
    'extends  [type_bound] 
end define
define type_bound
    [type_specifier]  [repeat and_type_spec] 
end define
define and_type_spec
    '&  [type_specifier] 
end define
define method_body
    [repeat block] 
    |    [opt annotation_default]  '; 
end define
define modifier
    'abstract 
    |    'final 
    |    'public 
    |    'protected 
    |    'private 
    |    'static 
    |    'transient 
    |    'volatile 
    |    'native 
    |    'synchronized 
    |    'strictfp 
    |    [repeat annotation] 
end define
define constructor_body
    [repeat block] 
end define
define program
    [package_declaration *] 
end define
define enum_body
    '{ [IN]
        [list enum_element]  [opt  ',]  [repeat class_body_declaration]  [EX]
    '}  [opt  ';]  [NL] [NL] 
end define
define import_declaration
    'import  [opt  'static]  [imported_name]  ';  [NL] 
    |    ';  [NL] 
end define
define class_header
    [repeat modifier]  'class  [class_name]  [opt extends_clause]  [opt implements_clause] 
end define
define interface_header
    [repeat modifier]  [opt annot_marker]  'interface  [interface_name]  [opt extends_clause]  [opt implements_clause] 
end define
define enum_header
    [repeat modifier]  [opt id]  'enum  [opt declared_name] 
end define
define extends_clause
    'extends  [list type_name +] 
end define
define implements_clause
    'implements  [list qualified_name +] 
end define
define class_or_interface_body
    '{ [NL] [IN]
        [repeat class_body_declaration]  [EX] [NL]
    '}  [opt  ';]  [NL] [NL] 
end define
define package_declaration
    [opt package_header]  [repeat import_declaration]  [repeat type_declaration] 
end define
define constructor_declaration
            [NL]
    [repeat modifier]  [opt generic_parameter]  [constructor_declarator]  [opt throws]  [constructor_body]  [NL] [NL] 
end define
define variable_declaration
    [repeat modifier]  [type_specifier]  [variable_declarators]  ';  [NL] 
end define
define variable_declarators
    [list variable_declarator +] 
end define
define method_declaration
            [NL]
    [repeat modifier]  [opt generic_parameter]  [type_specifier]  [method_declarator]  [opt throws]  [method_body] 
end define
define throws
    'throws  [list qualified_name +] 
end define
define annotation_value_list
    [single_annotation_value] 
    |    [list keyed_annotation_value] 
end define
define single_annotation_value
    [expression] 
    |    [nested_annotation] 
    |    { [list expression_or_nested_annotation] } 
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
    ... <<<<<<  >>>>>>   ' 
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
define class_body_declaration
    [opt srcfilename]  [opt srclinenumber]  [NL]
    [empty_declaration] 
    |    [opt srcfilename]  [opt srclinenumber]  [NL]
    [member_declaration] 
    |    [opt srcfilename]  [opt srclinenumber]  [NL]
    [instance_initializer] 
    |    [opt srcfilename]  [opt srclinenumber]  [NL]
    [static_initializer] 
    |    [opt srcfilename]  [opt srclinenumber]  [NL]
    [field_declaration] 
end define
redefine class_body_declaration
    ...
|       
    [attr Change] 

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
    construct C  [stringlit]
        _  [ quote  S ] 
    where not
        C  [=  ""]
    construct S2  [class_body_declaration]
        >>>>>>  C 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    construct S1  [class_body_declaration]
        <<<<<<  C 
    by
        P  [ $  S  S1 ] 
end function

define package_header
    [opt srcfilename]  [opt srclinenumber]  [NL]
    [repeat annotation]  'package  [package_name]  ';  [NL] [NL] 
end define
redefine package_header
    ...
|       
    [attr Change] 

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
    construct C  [stringlit]
        _  [ quote  S ] 
    where not
        C  [=  ""]
    construct S2  [package_header]
        >>>>>>  C 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    construct S1  [package_header]
        <<<<<<  C 
    by
        P  [ $  S  S1 ] 
end function

define type_declaration
    [opt srcfilename]  [opt srclinenumber]  [NL]
    [class_declaration]  [NL] [NL] 
    |    [opt srcfilename]  [opt srclinenumber]  [NL]
    [interface_declaration]  [NL] [NL] 
    |    [opt srcfilename]  [opt srclinenumber]  [NL]
    [enum_declaration]  [NL] 
end define
redefine type_declaration
    ...
|       
    [attr Change] 

end define
function find_replace_type_declaration
    replace  [program]
        P  [ program ] 
    import Program_Diff [program]

    construct S  [type_declaration *]
        _  [ find_clones_type_declaration  P  Program_Diff ] 
    construct P3  [program]
        P  [mark_clones_type_declaration  each  S]
 
    by
        P3 
end function

function find_clones_type_declaration P  [program] P2  [program]
    replace  [type_declaration *]
        _  [ type_declaration  * ] 
    construct S  [type_declaration *]
        _  [ ^  P ] 
    by
        _  [add_if_clones_type_declaration1  P2  each  S]
 
end function

function add_if_clones_type_declaration1 P2  [program] Stmt  [type_declaration]
    construct S2  [type_declaration *]
        _  [ ^  P2 ] 
    deconstruct * S2
        Stmt  Rest  [ type_declaration  * ] 
    replace  [type_declaration *]
        StructuredClones  [ type_declaration  * ] 
    deconstruct not * StructuredClones
        C  [attr Change] 
    by
        StructuredClones  [ . Stmt ] 
end function

function mark_clones_type_declaration S  [type_declaration]
    import CloneNumber [number]

    import Program_Diff [program]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    construct C  [stringlit]
        _  [ quote  S ] 
    where not
        C  [=  ""]
    construct S2  [type_declaration]
        >>>>>>  C 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    construct S1  [type_declaration]
        <<<<<<  C 
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

function normalise_ignore_by2_modifier_annotation1 E1  [modifier]
    replace  [modifier *]
        Seq  [modifier *] 
    deconstruct not E1
        X1  [repeat annotation] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_modifier_annotation1 E1  [modifier]
    replace  [modifier *]
        Seq  [modifier *] 
    deconstruct E1
        X1  [repeat annotation] 
    construct E2  [modifier]

    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_modifier_annotation1
    replace  [program]
        P1  [ program ] 
    construct List1  [modifier *]
        _  [ ^  P1 ] 
    construct List2  [modifier *]
        _  [normalise_ignore_by3_modifier_annotation1  each  List1]  [normalise_ignore_by2_modifier_annotation1  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
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
        '{ N1  [repeat class_body_declaration]  '}  X2  [opt  ';] 
    construct N2  [class_body_declaration *]
        _  [normalise_ignore_by1_Private_class_or_interface_body_class_body_declaration1  E1  each  N1]  [
                  normalise_ignore_by2_Private_class_or_interface_body_class_body_declaration1  E1  each  N1]
 
    construct E2  [class_or_interface_body]
        '{ N2  '}  X2 
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

function normalise_ignore_by2_package_declaration_import_declaration1 E1  [package_declaration]
    replace  [package_declaration *]
        Seq  [package_declaration *] 
    deconstruct not E1
        X3  [opt package_header]  X4  [repeat import_declaration]  X5  [repeat type_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_package_declaration_import_declaration1 E1  [package_declaration]
    replace  [package_declaration *]
        Seq  [package_declaration *] 
    deconstruct E1
        X3  [opt package_header]  X4  [repeat import_declaration]  X5  [repeat type_declaration] 
    construct E2  [package_declaration]
        X3  X5 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_package_declaration_import_declaration1
    replace  [program]
        P1  [ program ] 
    construct List1  [package_declaration *]
        _  [ ^  P1 ] 
    construct List2  [package_declaration *]
        _  [normalise_ignore_by3_package_declaration_import_declaration1  each  List1]  [
                  normalise_ignore_by2_package_declaration_import_declaration1  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
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

function normalise_ignore_by2_class_body_declaration_srcfilename1 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X6  [opt srcfilename]  X7  [opt srclinenumber]  X8  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename1 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X6  [opt srcfilename]  X7  [opt srclinenumber]  X8  [empty_declaration] 
    construct E2  [class_body_declaration]
        X7  X8 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename1
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename1  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename1  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename2 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X9  [opt srcfilename]  X10  [opt srclinenumber]  X11  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename2 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X9  [opt srcfilename]  X10  [opt srclinenumber]  X11  [member_declaration] 
    construct E2  [class_body_declaration]
        X10  X11 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename2
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename2  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename2  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename3 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X12  [opt srcfilename]  X13  [opt srclinenumber]  X14  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename3 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X12  [opt srcfilename]  X13  [opt srclinenumber]  X14  [instance_initializer] 
    construct E2  [class_body_declaration]
        X13  X14 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename3
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename3  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename3  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename4 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X15  [opt srcfilename]  X16  [opt srclinenumber]  X17  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename4 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X15  [opt srcfilename]  X16  [opt srclinenumber]  X17  [static_initializer] 
    construct E2  [class_body_declaration]
        X16  X17 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename4
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename4  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename4  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename5 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X18  [opt srcfilename]  X19  [opt srclinenumber]  X20  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename5 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X18  [opt srcfilename]  X19  [opt srclinenumber]  X20  [field_declaration] 
    construct E2  [class_body_declaration]
        X19  X20 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename5
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename5  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename5  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber1 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X21  [opt srcfilename]  X22  [opt srclinenumber]  X23  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber1 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X21  [opt srcfilename]  X22  [opt srclinenumber]  X23  [empty_declaration] 
    construct E2  [class_body_declaration]
        X21  X23 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber1
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber1  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber1  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber2 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X24  [opt srcfilename]  X25  [opt srclinenumber]  X26  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber2 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X24  [opt srcfilename]  X25  [opt srclinenumber]  X26  [member_declaration] 
    construct E2  [class_body_declaration]
        X24  X26 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber2
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber2  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber2  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber3 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X27  [opt srcfilename]  X28  [opt srclinenumber]  X29  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber3 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X27  [opt srcfilename]  X28  [opt srclinenumber]  X29  [instance_initializer] 
    construct E2  [class_body_declaration]
        X27  X29 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber3
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber3  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber3  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber4 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X30  [opt srcfilename]  X31  [opt srclinenumber]  X32  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber4 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X30  [opt srcfilename]  X31  [opt srclinenumber]  X32  [static_initializer] 
    construct E2  [class_body_declaration]
        X30  X32 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber4
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber4  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber4  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber5 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X33  [opt srcfilename]  X34  [opt srclinenumber]  X35  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber5 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X33  [opt srcfilename]  X34  [opt srclinenumber]  X35  [field_declaration] 
    construct E2  [class_body_declaration]
        X33  X35 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber5
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber5  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber5  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename6 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X36  [opt srcfilename]  X37  [opt srclinenumber]  X38  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename6 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X36  [opt srcfilename]  X37  [opt srclinenumber]  X38  [empty_declaration] 
    construct E2  [class_body_declaration]
        X37  X38 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename6
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename6  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename6  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename7 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X39  [opt srcfilename]  X40  [opt srclinenumber]  X41  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename7 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X39  [opt srcfilename]  X40  [opt srclinenumber]  X41  [member_declaration] 
    construct E2  [class_body_declaration]
        X40  X41 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename7
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename7  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename7  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename8 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X42  [opt srcfilename]  X43  [opt srclinenumber]  X44  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename8 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X42  [opt srcfilename]  X43  [opt srclinenumber]  X44  [instance_initializer] 
    construct E2  [class_body_declaration]
        X43  X44 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename8
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename8  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename8  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename9 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X45  [opt srcfilename]  X46  [opt srclinenumber]  X47  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename9 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X45  [opt srcfilename]  X46  [opt srclinenumber]  X47  [static_initializer] 
    construct E2  [class_body_declaration]
        X46  X47 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename9
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename9  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename9  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename10 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X48  [opt srcfilename]  X49  [opt srclinenumber]  X50  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename10 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X48  [opt srcfilename]  X49  [opt srclinenumber]  X50  [field_declaration] 
    construct E2  [class_body_declaration]
        X49  X50 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename10
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename10  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename10  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber6 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X51  [opt srcfilename]  X52  [opt srclinenumber]  X53  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber6 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X51  [opt srcfilename]  X52  [opt srclinenumber]  X53  [empty_declaration] 
    construct E2  [class_body_declaration]
        X51  X53 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber6
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber6  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber6  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber7 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X54  [opt srcfilename]  X55  [opt srclinenumber]  X56  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber7 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X54  [opt srcfilename]  X55  [opt srclinenumber]  X56  [member_declaration] 
    construct E2  [class_body_declaration]
        X54  X56 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber7
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber7  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber7  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber8 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X57  [opt srcfilename]  X58  [opt srclinenumber]  X59  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber8 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X57  [opt srcfilename]  X58  [opt srclinenumber]  X59  [instance_initializer] 
    construct E2  [class_body_declaration]
        X57  X59 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber8
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber8  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber8  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber9 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X60  [opt srcfilename]  X61  [opt srclinenumber]  X62  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber9 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X60  [opt srcfilename]  X61  [opt srclinenumber]  X62  [static_initializer] 
    construct E2  [class_body_declaration]
        X60  X62 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber9
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber9  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber9  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber10 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X63  [opt srcfilename]  X64  [opt srclinenumber]  X65  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber10 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X63  [opt srcfilename]  X64  [opt srclinenumber]  X65  [field_declaration] 
    construct E2  [class_body_declaration]
        X63  X65 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber10
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber10  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber10  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename11 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X66  [opt srcfilename]  X67  [opt srclinenumber]  X68  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename11 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X66  [opt srcfilename]  X67  [opt srclinenumber]  X68  [empty_declaration] 
    construct E2  [class_body_declaration]
        X67  X68 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename11
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename11  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename11  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename12 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X69  [opt srcfilename]  X70  [opt srclinenumber]  X71  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename12 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X69  [opt srcfilename]  X70  [opt srclinenumber]  X71  [member_declaration] 
    construct E2  [class_body_declaration]
        X70  X71 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename12
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename12  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename12  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename13 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X72  [opt srcfilename]  X73  [opt srclinenumber]  X74  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename13 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X72  [opt srcfilename]  X73  [opt srclinenumber]  X74  [instance_initializer] 
    construct E2  [class_body_declaration]
        X73  X74 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename13
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename13  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename13  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename14 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X75  [opt srcfilename]  X76  [opt srclinenumber]  X77  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename14 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X75  [opt srcfilename]  X76  [opt srclinenumber]  X77  [static_initializer] 
    construct E2  [class_body_declaration]
        X76  X77 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename14
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename14  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename14  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename15 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X78  [opt srcfilename]  X79  [opt srclinenumber]  X80  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename15 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X78  [opt srcfilename]  X79  [opt srclinenumber]  X80  [field_declaration] 
    construct E2  [class_body_declaration]
        X79  X80 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename15
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename15  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename15  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber11 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X81  [opt srcfilename]  X82  [opt srclinenumber]  X83  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber11 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X81  [opt srcfilename]  X82  [opt srclinenumber]  X83  [empty_declaration] 
    construct E2  [class_body_declaration]
        X81  X83 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber11
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber11  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber11  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber12 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X84  [opt srcfilename]  X85  [opt srclinenumber]  X86  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber12 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X84  [opt srcfilename]  X85  [opt srclinenumber]  X86  [member_declaration] 
    construct E2  [class_body_declaration]
        X84  X86 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber12
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber12  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber12  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber13 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X87  [opt srcfilename]  X88  [opt srclinenumber]  X89  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber13 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X87  [opt srcfilename]  X88  [opt srclinenumber]  X89  [instance_initializer] 
    construct E2  [class_body_declaration]
        X87  X89 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber13
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber13  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber13  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber14 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X90  [opt srcfilename]  X91  [opt srclinenumber]  X92  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber14 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X90  [opt srcfilename]  X91  [opt srclinenumber]  X92  [static_initializer] 
    construct E2  [class_body_declaration]
        X90  X92 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber14
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber14  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber14  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber15 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X93  [opt srcfilename]  X94  [opt srclinenumber]  X95  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber15 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X93  [opt srcfilename]  X94  [opt srclinenumber]  X95  [field_declaration] 
    construct E2  [class_body_declaration]
        X93  X95 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber15
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber15  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber15  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename16 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X96  [opt srcfilename]  X97  [opt srclinenumber]  X98  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename16 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X96  [opt srcfilename]  X97  [opt srclinenumber]  X98  [empty_declaration] 
    construct E2  [class_body_declaration]
        X97  X98 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename16
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename16  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename16  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename17 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X99  [opt srcfilename]  X100  [opt srclinenumber]  X101  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename17 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X99  [opt srcfilename]  X100  [opt srclinenumber]  X101  [member_declaration] 
    construct E2  [class_body_declaration]
        X100  X101 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename17
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename17  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename17  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename18 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X102  [opt srcfilename]  X103  [opt srclinenumber]  X104  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename18 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X102  [opt srcfilename]  X103  [opt srclinenumber]  X104  [instance_initializer] 
    construct E2  [class_body_declaration]
        X103  X104 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename18
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename18  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename18  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename19 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X105  [opt srcfilename]  X106  [opt srclinenumber]  X107  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename19 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X105  [opt srcfilename]  X106  [opt srclinenumber]  X107  [static_initializer] 
    construct E2  [class_body_declaration]
        X106  X107 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename19
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename19  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename19  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename20 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X108  [opt srcfilename]  X109  [opt srclinenumber]  X110  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename20 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X108  [opt srcfilename]  X109  [opt srclinenumber]  X110  [field_declaration] 
    construct E2  [class_body_declaration]
        X109  X110 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename20
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename20  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename20  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber16 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X111  [opt srcfilename]  X112  [opt srclinenumber]  X113  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber16 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X111  [opt srcfilename]  X112  [opt srclinenumber]  X113  [empty_declaration] 
    construct E2  [class_body_declaration]
        X111  X113 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber16
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber16  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber16  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber17 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X114  [opt srcfilename]  X115  [opt srclinenumber]  X116  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber17 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X114  [opt srcfilename]  X115  [opt srclinenumber]  X116  [member_declaration] 
    construct E2  [class_body_declaration]
        X114  X116 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber17
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber17  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber17  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber18 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X117  [opt srcfilename]  X118  [opt srclinenumber]  X119  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber18 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X117  [opt srcfilename]  X118  [opt srclinenumber]  X119  [instance_initializer] 
    construct E2  [class_body_declaration]
        X117  X119 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber18
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber18  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber18  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber19 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X120  [opt srcfilename]  X121  [opt srclinenumber]  X122  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber19 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X120  [opt srcfilename]  X121  [opt srclinenumber]  X122  [static_initializer] 
    construct E2  [class_body_declaration]
        X120  X122 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber19
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber19  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber19  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber20 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X123  [opt srcfilename]  X124  [opt srclinenumber]  X125  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber20 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X123  [opt srcfilename]  X124  [opt srclinenumber]  X125  [field_declaration] 
    construct E2  [class_body_declaration]
        X123  X125 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber20
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber20  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber20  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename21 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X126  [opt srcfilename]  X127  [opt srclinenumber]  X128  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename21 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X126  [opt srcfilename]  X127  [opt srclinenumber]  X128  [empty_declaration] 
    construct E2  [class_body_declaration]
        X127  X128 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename21
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename21  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename21  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename22 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X129  [opt srcfilename]  X130  [opt srclinenumber]  X131  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename22 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X129  [opt srcfilename]  X130  [opt srclinenumber]  X131  [member_declaration] 
    construct E2  [class_body_declaration]
        X130  X131 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename22
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename22  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename22  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename23 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X132  [opt srcfilename]  X133  [opt srclinenumber]  X134  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename23 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X132  [opt srcfilename]  X133  [opt srclinenumber]  X134  [instance_initializer] 
    construct E2  [class_body_declaration]
        X133  X134 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename23
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename23  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename23  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename24 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X135  [opt srcfilename]  X136  [opt srclinenumber]  X137  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename24 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X135  [opt srcfilename]  X136  [opt srclinenumber]  X137  [static_initializer] 
    construct E2  [class_body_declaration]
        X136  X137 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename24
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename24  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename24  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srcfilename25 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X138  [opt srcfilename]  X139  [opt srclinenumber]  X140  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename25 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X138  [opt srcfilename]  X139  [opt srclinenumber]  X140  [field_declaration] 
    construct E2  [class_body_declaration]
        X139  X140 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srcfilename25
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srcfilename25  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srcfilename25  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber21 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X141  [opt srcfilename]  X142  [opt srclinenumber]  X143  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber21 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X141  [opt srcfilename]  X142  [opt srclinenumber]  X143  [empty_declaration] 
    construct E2  [class_body_declaration]
        X141  X143 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber21
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber21  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber21  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber22 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X144  [opt srcfilename]  X145  [opt srclinenumber]  X146  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber22 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X144  [opt srcfilename]  X145  [opt srclinenumber]  X146  [member_declaration] 
    construct E2  [class_body_declaration]
        X144  X146 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber22
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber22  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber22  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber23 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X147  [opt srcfilename]  X148  [opt srclinenumber]  X149  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber23 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X147  [opt srcfilename]  X148  [opt srclinenumber]  X149  [instance_initializer] 
    construct E2  [class_body_declaration]
        X147  X149 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber23
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber23  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber23  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber24 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X150  [opt srcfilename]  X151  [opt srclinenumber]  X152  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber24 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X150  [opt srcfilename]  X151  [opt srclinenumber]  X152  [static_initializer] 
    construct E2  [class_body_declaration]
        X150  X152 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber24
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber24  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber24  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_body_declaration_srclinenumber25 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X153  [opt srcfilename]  X154  [opt srclinenumber]  X155  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber25 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X153  [opt srcfilename]  X154  [opt srclinenumber]  X155  [field_declaration] 
    construct E2  [class_body_declaration]
        X153  X155 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_body_declaration_srclinenumber25
    replace  [program]
        P1  [ program ] 
    construct List1  [class_body_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_body_declaration *]
        _  [normalise_ignore_by3_class_body_declaration_srclinenumber25  each  List1]  [
                  normalise_ignore_by2_class_body_declaration_srclinenumber25  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_package_header_srcfilename1 E1  [package_header]
    replace  [package_header *]
        Seq  [package_header *] 
    deconstruct not E1
        X156  [opt srcfilename]  X157  [opt srclinenumber]  X158  [repeat annotation]  'package  X159  [package_name]  '; 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_package_header_srcfilename1 E1  [package_header]
    replace  [package_header *]
        Seq  [package_header *] 
    deconstruct E1
        X156  [opt srcfilename]  X157  [opt srclinenumber]  X158  [repeat annotation]  'package  X159  [package_name]  '; 
    construct E2  [package_header]
        X157  X158  'package  X159  '; 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_package_header_srcfilename1
    replace  [program]
        P1  [ program ] 
    construct List1  [package_header *]
        _  [ ^  P1 ] 
    construct List2  [package_header *]
        _  [normalise_ignore_by3_package_header_srcfilename1  each  List1]  [normalise_ignore_by2_package_header_srcfilename1 
                  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_package_header_srclinenumber1 E1  [package_header]
    replace  [package_header *]
        Seq  [package_header *] 
    deconstruct not E1
        X160  [opt srcfilename]  X161  [opt srclinenumber]  X162  [repeat annotation]  'package  X163  [package_name]  '; 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_package_header_srclinenumber1 E1  [package_header]
    replace  [package_header *]
        Seq  [package_header *] 
    deconstruct E1
        X160  [opt srcfilename]  X161  [opt srclinenumber]  X162  [repeat annotation]  'package  X163  [package_name]  '; 
    construct E2  [package_header]
        X160  X162  'package  X163  '; 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_package_header_srclinenumber1
    replace  [program]
        P1  [ program ] 
    construct List1  [package_header *]
        _  [ ^  P1 ] 
    construct List2  [package_header *]
        _  [normalise_ignore_by3_package_header_srclinenumber1  each  List1]  [
                  normalise_ignore_by2_package_header_srclinenumber1  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_type_declaration_srcfilename1 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct not E1
        X164  [opt srcfilename]  X165  [opt srclinenumber]  X166  [class_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_type_declaration_srcfilename1 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct E1
        X164  [opt srcfilename]  X165  [opt srclinenumber]  X166  [class_declaration] 
    construct E2  [type_declaration]
        X165  X166 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_type_declaration_srcfilename1
    replace  [program]
        P1  [ program ] 
    construct List1  [type_declaration *]
        _  [ ^  P1 ] 
    construct List2  [type_declaration *]
        _  [normalise_ignore_by3_type_declaration_srcfilename1  each  List1]  [
                  normalise_ignore_by2_type_declaration_srcfilename1  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_type_declaration_srcfilename2 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct not E1
        X167  [opt srcfilename]  X168  [opt srclinenumber]  X169  [interface_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_type_declaration_srcfilename2 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct E1
        X167  [opt srcfilename]  X168  [opt srclinenumber]  X169  [interface_declaration] 
    construct E2  [type_declaration]
        X168  X169 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_type_declaration_srcfilename2
    replace  [program]
        P1  [ program ] 
    construct List1  [type_declaration *]
        _  [ ^  P1 ] 
    construct List2  [type_declaration *]
        _  [normalise_ignore_by3_type_declaration_srcfilename2  each  List1]  [
                  normalise_ignore_by2_type_declaration_srcfilename2  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_type_declaration_srcfilename3 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct not E1
        X170  [opt srcfilename]  X171  [opt srclinenumber]  X172  [enum_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_type_declaration_srcfilename3 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct E1
        X170  [opt srcfilename]  X171  [opt srclinenumber]  X172  [enum_declaration] 
    construct E2  [type_declaration]
        X171  X172 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_type_declaration_srcfilename3
    replace  [program]
        P1  [ program ] 
    construct List1  [type_declaration *]
        _  [ ^  P1 ] 
    construct List2  [type_declaration *]
        _  [normalise_ignore_by3_type_declaration_srcfilename3  each  List1]  [
                  normalise_ignore_by2_type_declaration_srcfilename3  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_type_declaration_srclinenumber1 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct not E1
        X173  [opt srcfilename]  X174  [opt srclinenumber]  X175  [class_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_type_declaration_srclinenumber1 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct E1
        X173  [opt srcfilename]  X174  [opt srclinenumber]  X175  [class_declaration] 
    construct E2  [type_declaration]
        X173  X175 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_type_declaration_srclinenumber1
    replace  [program]
        P1  [ program ] 
    construct List1  [type_declaration *]
        _  [ ^  P1 ] 
    construct List2  [type_declaration *]
        _  [normalise_ignore_by3_type_declaration_srclinenumber1  each  List1]  [
                  normalise_ignore_by2_type_declaration_srclinenumber1  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_type_declaration_srclinenumber2 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct not E1
        X176  [opt srcfilename]  X177  [opt srclinenumber]  X178  [interface_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_type_declaration_srclinenumber2 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct E1
        X176  [opt srcfilename]  X177  [opt srclinenumber]  X178  [interface_declaration] 
    construct E2  [type_declaration]
        X176  X178 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_type_declaration_srclinenumber2
    replace  [program]
        P1  [ program ] 
    construct List1  [type_declaration *]
        _  [ ^  P1 ] 
    construct List2  [type_declaration *]
        _  [normalise_ignore_by3_type_declaration_srclinenumber2  each  List1]  [
                  normalise_ignore_by2_type_declaration_srclinenumber2  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_type_declaration_srclinenumber3 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct not E1
        X179  [opt srcfilename]  X180  [opt srclinenumber]  X181  [enum_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_type_declaration_srclinenumber3 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct E1
        X179  [opt srcfilename]  X180  [opt srclinenumber]  X181  [enum_declaration] 
    construct E2  [type_declaration]
        X179  X181 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_type_declaration_srclinenumber3
    replace  [program]
        P1  [ program ] 
    construct List1  [type_declaration *]
        _  [ ^  P1 ] 
    construct List2  [type_declaration *]
        _  [normalise_ignore_by3_type_declaration_srclinenumber3  each  List1]  [
                  normalise_ignore_by2_type_declaration_srclinenumber3  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_type_declaration_srcfilename4 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct not E1
        X182  [opt srcfilename]  X183  [opt srclinenumber]  X184  [class_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_type_declaration_srcfilename4 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct E1
        X182  [opt srcfilename]  X183  [opt srclinenumber]  X184  [class_declaration] 
    construct E2  [type_declaration]
        X183  X184 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_type_declaration_srcfilename4
    replace  [program]
        P1  [ program ] 
    construct List1  [type_declaration *]
        _  [ ^  P1 ] 
    construct List2  [type_declaration *]
        _  [normalise_ignore_by3_type_declaration_srcfilename4  each  List1]  [
                  normalise_ignore_by2_type_declaration_srcfilename4  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_type_declaration_srcfilename5 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct not E1
        X185  [opt srcfilename]  X186  [opt srclinenumber]  X187  [interface_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_type_declaration_srcfilename5 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct E1
        X185  [opt srcfilename]  X186  [opt srclinenumber]  X187  [interface_declaration] 
    construct E2  [type_declaration]
        X186  X187 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_type_declaration_srcfilename5
    replace  [program]
        P1  [ program ] 
    construct List1  [type_declaration *]
        _  [ ^  P1 ] 
    construct List2  [type_declaration *]
        _  [normalise_ignore_by3_type_declaration_srcfilename5  each  List1]  [
                  normalise_ignore_by2_type_declaration_srcfilename5  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_type_declaration_srcfilename6 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct not E1
        X188  [opt srcfilename]  X189  [opt srclinenumber]  X190  [enum_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_type_declaration_srcfilename6 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct E1
        X188  [opt srcfilename]  X189  [opt srclinenumber]  X190  [enum_declaration] 
    construct E2  [type_declaration]
        X189  X190 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_type_declaration_srcfilename6
    replace  [program]
        P1  [ program ] 
    construct List1  [type_declaration *]
        _  [ ^  P1 ] 
    construct List2  [type_declaration *]
        _  [normalise_ignore_by3_type_declaration_srcfilename6  each  List1]  [
                  normalise_ignore_by2_type_declaration_srcfilename6  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_type_declaration_srclinenumber4 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct not E1
        X191  [opt srcfilename]  X192  [opt srclinenumber]  X193  [class_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_type_declaration_srclinenumber4 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct E1
        X191  [opt srcfilename]  X192  [opt srclinenumber]  X193  [class_declaration] 
    construct E2  [type_declaration]
        X191  X193 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_type_declaration_srclinenumber4
    replace  [program]
        P1  [ program ] 
    construct List1  [type_declaration *]
        _  [ ^  P1 ] 
    construct List2  [type_declaration *]
        _  [normalise_ignore_by3_type_declaration_srclinenumber4  each  List1]  [
                  normalise_ignore_by2_type_declaration_srclinenumber4  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_type_declaration_srclinenumber5 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct not E1
        X194  [opt srcfilename]  X195  [opt srclinenumber]  X196  [interface_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_type_declaration_srclinenumber5 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct E1
        X194  [opt srcfilename]  X195  [opt srclinenumber]  X196  [interface_declaration] 
    construct E2  [type_declaration]
        X194  X196 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_type_declaration_srclinenumber5
    replace  [program]
        P1  [ program ] 
    construct List1  [type_declaration *]
        _  [ ^  P1 ] 
    construct List2  [type_declaration *]
        _  [normalise_ignore_by3_type_declaration_srclinenumber5  each  List1]  [
                  normalise_ignore_by2_type_declaration_srclinenumber5  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_type_declaration_srclinenumber6 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct not E1
        X197  [opt srcfilename]  X198  [opt srclinenumber]  X199  [enum_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_type_declaration_srclinenumber6 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct E1
        X197  [opt srcfilename]  X198  [opt srclinenumber]  X199  [enum_declaration] 
    construct E2  [type_declaration]
        X197  X199 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_type_declaration_srclinenumber6
    replace  [program]
        P1  [ program ] 
    construct List1  [type_declaration *]
        _  [ ^  P1 ] 
    construct List2  [type_declaration *]
        _  [normalise_ignore_by3_type_declaration_srclinenumber6  each  List1]  [
                  normalise_ignore_by2_type_declaration_srclinenumber6  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_type_declaration_srcfilename7 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct not E1
        X200  [opt srcfilename]  X201  [opt srclinenumber]  X202  [class_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_type_declaration_srcfilename7 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct E1
        X200  [opt srcfilename]  X201  [opt srclinenumber]  X202  [class_declaration] 
    construct E2  [type_declaration]
        X201  X202 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_type_declaration_srcfilename7
    replace  [program]
        P1  [ program ] 
    construct List1  [type_declaration *]
        _  [ ^  P1 ] 
    construct List2  [type_declaration *]
        _  [normalise_ignore_by3_type_declaration_srcfilename7  each  List1]  [
                  normalise_ignore_by2_type_declaration_srcfilename7  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_type_declaration_srcfilename8 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct not E1
        X203  [opt srcfilename]  X204  [opt srclinenumber]  X205  [interface_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_type_declaration_srcfilename8 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct E1
        X203  [opt srcfilename]  X204  [opt srclinenumber]  X205  [interface_declaration] 
    construct E2  [type_declaration]
        X204  X205 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_type_declaration_srcfilename8
    replace  [program]
        P1  [ program ] 
    construct List1  [type_declaration *]
        _  [ ^  P1 ] 
    construct List2  [type_declaration *]
        _  [normalise_ignore_by3_type_declaration_srcfilename8  each  List1]  [
                  normalise_ignore_by2_type_declaration_srcfilename8  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_type_declaration_srcfilename9 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct not E1
        X206  [opt srcfilename]  X207  [opt srclinenumber]  X208  [enum_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_type_declaration_srcfilename9 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct E1
        X206  [opt srcfilename]  X207  [opt srclinenumber]  X208  [enum_declaration] 
    construct E2  [type_declaration]
        X207  X208 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_type_declaration_srcfilename9
    replace  [program]
        P1  [ program ] 
    construct List1  [type_declaration *]
        _  [ ^  P1 ] 
    construct List2  [type_declaration *]
        _  [normalise_ignore_by3_type_declaration_srcfilename9  each  List1]  [
                  normalise_ignore_by2_type_declaration_srcfilename9  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_type_declaration_srclinenumber7 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct not E1
        X209  [opt srcfilename]  X210  [opt srclinenumber]  X211  [class_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_type_declaration_srclinenumber7 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct E1
        X209  [opt srcfilename]  X210  [opt srclinenumber]  X211  [class_declaration] 
    construct E2  [type_declaration]
        X209  X211 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_type_declaration_srclinenumber7
    replace  [program]
        P1  [ program ] 
    construct List1  [type_declaration *]
        _  [ ^  P1 ] 
    construct List2  [type_declaration *]
        _  [normalise_ignore_by3_type_declaration_srclinenumber7  each  List1]  [
                  normalise_ignore_by2_type_declaration_srclinenumber7  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_type_declaration_srclinenumber8 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct not E1
        X212  [opt srcfilename]  X213  [opt srclinenumber]  X214  [interface_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_type_declaration_srclinenumber8 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct E1
        X212  [opt srcfilename]  X213  [opt srclinenumber]  X214  [interface_declaration] 
    construct E2  [type_declaration]
        X212  X214 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_type_declaration_srclinenumber8
    replace  [program]
        P1  [ program ] 
    construct List1  [type_declaration *]
        _  [ ^  P1 ] 
    construct List2  [type_declaration *]
        _  [normalise_ignore_by3_type_declaration_srclinenumber8  each  List1]  [
                  normalise_ignore_by2_type_declaration_srclinenumber8  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_type_declaration_srclinenumber9 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct not E1
        X215  [opt srcfilename]  X216  [opt srclinenumber]  X217  [enum_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_type_declaration_srclinenumber9 E1  [type_declaration]
    replace  [type_declaration *]
        Seq  [type_declaration *] 
    deconstruct E1
        X215  [opt srcfilename]  X216  [opt srclinenumber]  X217  [enum_declaration] 
    construct E2  [type_declaration]
        X215  X217 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_type_declaration_srclinenumber9
    replace  [program]
        P1  [ program ] 
    construct List1  [type_declaration *]
        _  [ ^  P1 ] 
    construct List2  [type_declaration *]
        _  [normalise_ignore_by3_type_declaration_srclinenumber9  each  List1]  [
                  normalise_ignore_by2_type_declaration_srclinenumber9  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function program_normalise
    replace  [program]
        Prg  [ program ] 
    by
        Prg  [ normalise_ignore_by4_modifier_annotation1 ]  [ 
          normalise_ignore_by4_Private_class_or_interface_body_class_body_declaration1 ]  [ 
          normalise_ignore_by4_package_declaration_import_declaration1 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename1 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename2 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename3 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename4 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename5 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber1 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber2 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber3 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber4 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber5 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename6 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename7 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename8 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename9 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename10 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber6 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber7 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber8 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber9 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber10 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename11 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename12 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename13 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename14 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename15 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber11 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber12 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber13 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber14 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber15 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename16 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename17 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename18 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename19 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename20 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber16 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber17 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber18 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber19 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber20 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename21 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename22 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename23 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename24 ]  [ 
          normalise_ignore_by4_class_body_declaration_srcfilename25 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber21 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber22 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber23 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber24 ]  [ 
          normalise_ignore_by4_class_body_declaration_srclinenumber25 ]  [ normalise_ignore_by4_package_header_srcfilename1 ]  [
          normalise_ignore_by4_package_header_srclinenumber1 ]  [ normalise_ignore_by4_type_declaration_srcfilename1 ]  [ 
          normalise_ignore_by4_type_declaration_srcfilename2 ]  [ normalise_ignore_by4_type_declaration_srcfilename3 ]  [ 
          normalise_ignore_by4_type_declaration_srclinenumber1 ]  [ normalise_ignore_by4_type_declaration_srclinenumber2 ]  [ 
          normalise_ignore_by4_type_declaration_srclinenumber3 ]  [ normalise_ignore_by4_type_declaration_srcfilename4 ]  [ 
          normalise_ignore_by4_type_declaration_srcfilename5 ]  [ normalise_ignore_by4_type_declaration_srcfilename6 ]  [ 
          normalise_ignore_by4_type_declaration_srclinenumber4 ]  [ normalise_ignore_by4_type_declaration_srclinenumber5 ]  [ 
          normalise_ignore_by4_type_declaration_srclinenumber6 ]  [ normalise_ignore_by4_type_declaration_srcfilename7 ]  [ 
          normalise_ignore_by4_type_declaration_srcfilename8 ]  [ normalise_ignore_by4_type_declaration_srcfilename9 ]  [ 
          normalise_ignore_by4_type_declaration_srclinenumber7 ]  [ normalise_ignore_by4_type_declaration_srclinenumber8 ]  [ 
          normalise_ignore_by4_type_declaration_srclinenumber9 ]  [ normalise_preferred_replace_method_body_block1 ]  [ 
          normalise_preferred_replace_constructor_body_block1 ]  [ normalise_list_enum_body_class_body_declaration ]  [ 
          normalise_list_class_header_modifier ]  [ normalise_list_interface_header_modifier ]  [ 
          normalise_list_enum_header_modifier ]  [ normalise_list_extends_clause_type_name ]  [ 
          normalise_list_implements_clause_qualified_name ]  [ normalise_list_constructor_declaration_modifier ]  [ 
          normalise_list_variable_declaration_modifier ]  [ normalise_list_variable_declarators_variable_declarator ]  [ 
          normalise_list_method_declaration_modifier ]  [ normalise_list_throws_qualified_name ]  [ 
          normalise_list_annotation_value_list_keyed_annotation_value ]  [ 
          normalise_list_single_annotation_value_expression_or_nested_annotation ] 
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
        Prg  [ find_replace_class_body_declaration ]  [ find_replace_package_header ]  [ find_replace_type_declaration ] 
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
        Program_Diff  [ print_diff_1 ]  [ print_diff_2 ]  [ printattr ] 
    by
        P_Clone 
end function

function main
    replace  [program]
        Prg  [ program ] 
    export Program_Diff [program]
        _ 
    by
        Prg  [ program_normalise ]  [ program_remove_clone ]  [ print_diff ] 
end function

