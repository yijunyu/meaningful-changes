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

define program
    [package_declaration] 
end define
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
define class_body
    [class_or_interface_body] 
end define
define annot_marker
    '@ 
end define
define interface_body
    [class_or_interface_body] 
end define
define enum_element
            [NL]
    [id]  [opt method_argument] 
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
    |    [annotation] 
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
define class_or_interface_body
    '{ [NL] [IN]
        [repeat class_body_declaration]  [EX] [NL]
    '}  [opt  ';]  [NL] [NL] 
end define
define method_body
    [repeat block] 
    |    [opt annotation_default]  '; 
end define
define constructor_body
    [repeat block] 
end define
define enum_body
    '{ [IN]
        [list enum_element]  [opt  ',]  [repeat class_body_declaration]  [EX]
    '}  [opt  ';]  [NL] [NL] 
end define
define type_declaration
    [class_declaration]  [NL] [NL] 
    |    [interface_declaration]  [NL] [NL] 
    |    [enum_declaration]  [NL] 
end define
define package_declaration
    [opt package_header]  [repeat import_declaration]  [repeat type_declaration] 
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
define catch_clause
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

define class_declaration
    [opt srcfilename]  [opt srclinenumber]  [NL]
    [class_header]  [class_body] 
end define
redefine class_declaration
    ...
|       
    [attr Change] 

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
    construct C  [stringlit]
        _  [ quote  S ] 
    where not
        C  [=  ""]
    construct S2  [class_declaration]
        >>>>>>  C 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    construct S1  [class_declaration]
        <<<<<<  C 
    by
        P  [ $  S  S1 ] 
end function

define interface_declaration
    [opt srcfilename]  [opt srclinenumber]  [NL]
    [interface_header]  [interface_body] 
end define
redefine interface_declaration
    ...
|       
    [attr Change] 

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
    construct C  [stringlit]
        _  [ quote  S ] 
    where not
        C  [=  ""]
    construct S2  [interface_declaration]
        >>>>>>  C 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    construct S1  [interface_declaration]
        <<<<<<  C 
    by
        P  [ $  S  S1 ] 
end function

define enum_declaration
    [opt srcfilename]  [opt srclinenumber]  [NL]
    [enum_header]  [enum_body] 
end define
redefine enum_declaration
    ...
|       
    [attr Change] 

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
    construct C  [stringlit]
        _  [ quote  S ] 
    where not
        C  [=  ""]
    construct S2  [enum_declaration]
        >>>>>>  C 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    construct S1  [enum_declaration]
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

define import_declaration
    [opt srcfilename]  [opt srclinenumber]  [NL]
    'import  [opt  'static]  [imported_name]  ';  [NL] 
    |    [opt srcfilename]  [opt srclinenumber]  [NL]
    ';  [NL] 
end define
redefine import_declaration
    ...
|       
    [attr Change] 

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
    construct C  [stringlit]
        _  [ quote  S ] 
    where not
        C  [=  ""]
    construct S2  [import_declaration]
        >>>>>>  C 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    construct S1  [import_declaration]
        <<<<<<  C 
    by
        P  [ $  S  S1 ] 
end function

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

function normalise_ignore_by2_class_body_declaration_srcfilename1 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct not E1
        X2  [opt srcfilename]  X3  [opt srclinenumber]  X4  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename1 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X2  [opt srcfilename]  X3  [opt srclinenumber]  X4  [empty_declaration] 
    construct E2  [class_body_declaration]
        X3  X4 
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
        X5  [opt srcfilename]  X6  [opt srclinenumber]  X7  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename2 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X5  [opt srcfilename]  X6  [opt srclinenumber]  X7  [member_declaration] 
    construct E2  [class_body_declaration]
        X6  X7 
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
        X8  [opt srcfilename]  X9  [opt srclinenumber]  X10  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename3 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X8  [opt srcfilename]  X9  [opt srclinenumber]  X10  [instance_initializer] 
    construct E2  [class_body_declaration]
        X9  X10 
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
        X11  [opt srcfilename]  X12  [opt srclinenumber]  X13  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename4 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X11  [opt srcfilename]  X12  [opt srclinenumber]  X13  [static_initializer] 
    construct E2  [class_body_declaration]
        X12  X13 
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
        X14  [opt srcfilename]  X15  [opt srclinenumber]  X16  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename5 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X14  [opt srcfilename]  X15  [opt srclinenumber]  X16  [field_declaration] 
    construct E2  [class_body_declaration]
        X15  X16 
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
        X17  [opt srcfilename]  X18  [opt srclinenumber]  X19  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber1 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X17  [opt srcfilename]  X18  [opt srclinenumber]  X19  [empty_declaration] 
    construct E2  [class_body_declaration]
        X17  X19 
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
        X20  [opt srcfilename]  X21  [opt srclinenumber]  X22  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber2 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X20  [opt srcfilename]  X21  [opt srclinenumber]  X22  [member_declaration] 
    construct E2  [class_body_declaration]
        X20  X22 
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
        X23  [opt srcfilename]  X24  [opt srclinenumber]  X25  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber3 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X23  [opt srcfilename]  X24  [opt srclinenumber]  X25  [instance_initializer] 
    construct E2  [class_body_declaration]
        X23  X25 
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
        X26  [opt srcfilename]  X27  [opt srclinenumber]  X28  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber4 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X26  [opt srcfilename]  X27  [opt srclinenumber]  X28  [static_initializer] 
    construct E2  [class_body_declaration]
        X26  X28 
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
        X29  [opt srcfilename]  X30  [opt srclinenumber]  X31  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber5 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X29  [opt srcfilename]  X30  [opt srclinenumber]  X31  [field_declaration] 
    construct E2  [class_body_declaration]
        X29  X31 
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
        X32  [opt srcfilename]  X33  [opt srclinenumber]  X34  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename6 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X32  [opt srcfilename]  X33  [opt srclinenumber]  X34  [empty_declaration] 
    construct E2  [class_body_declaration]
        X33  X34 
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
        X35  [opt srcfilename]  X36  [opt srclinenumber]  X37  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename7 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X35  [opt srcfilename]  X36  [opt srclinenumber]  X37  [member_declaration] 
    construct E2  [class_body_declaration]
        X36  X37 
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
        X38  [opt srcfilename]  X39  [opt srclinenumber]  X40  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename8 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X38  [opt srcfilename]  X39  [opt srclinenumber]  X40  [instance_initializer] 
    construct E2  [class_body_declaration]
        X39  X40 
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
        X41  [opt srcfilename]  X42  [opt srclinenumber]  X43  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename9 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X41  [opt srcfilename]  X42  [opt srclinenumber]  X43  [static_initializer] 
    construct E2  [class_body_declaration]
        X42  X43 
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
        X44  [opt srcfilename]  X45  [opt srclinenumber]  X46  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename10 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X44  [opt srcfilename]  X45  [opt srclinenumber]  X46  [field_declaration] 
    construct E2  [class_body_declaration]
        X45  X46 
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
        X47  [opt srcfilename]  X48  [opt srclinenumber]  X49  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber6 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X47  [opt srcfilename]  X48  [opt srclinenumber]  X49  [empty_declaration] 
    construct E2  [class_body_declaration]
        X47  X49 
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
        X50  [opt srcfilename]  X51  [opt srclinenumber]  X52  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber7 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X50  [opt srcfilename]  X51  [opt srclinenumber]  X52  [member_declaration] 
    construct E2  [class_body_declaration]
        X50  X52 
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
        X53  [opt srcfilename]  X54  [opt srclinenumber]  X55  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber8 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X53  [opt srcfilename]  X54  [opt srclinenumber]  X55  [instance_initializer] 
    construct E2  [class_body_declaration]
        X53  X55 
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
        X56  [opt srcfilename]  X57  [opt srclinenumber]  X58  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber9 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X56  [opt srcfilename]  X57  [opt srclinenumber]  X58  [static_initializer] 
    construct E2  [class_body_declaration]
        X56  X58 
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
        X59  [opt srcfilename]  X60  [opt srclinenumber]  X61  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber10 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X59  [opt srcfilename]  X60  [opt srclinenumber]  X61  [field_declaration] 
    construct E2  [class_body_declaration]
        X59  X61 
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
        X62  [opt srcfilename]  X63  [opt srclinenumber]  X64  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename11 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X62  [opt srcfilename]  X63  [opt srclinenumber]  X64  [empty_declaration] 
    construct E2  [class_body_declaration]
        X63  X64 
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
        X65  [opt srcfilename]  X66  [opt srclinenumber]  X67  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename12 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X65  [opt srcfilename]  X66  [opt srclinenumber]  X67  [member_declaration] 
    construct E2  [class_body_declaration]
        X66  X67 
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
        X68  [opt srcfilename]  X69  [opt srclinenumber]  X70  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename13 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X68  [opt srcfilename]  X69  [opt srclinenumber]  X70  [instance_initializer] 
    construct E2  [class_body_declaration]
        X69  X70 
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
        X71  [opt srcfilename]  X72  [opt srclinenumber]  X73  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename14 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X71  [opt srcfilename]  X72  [opt srclinenumber]  X73  [static_initializer] 
    construct E2  [class_body_declaration]
        X72  X73 
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
        X74  [opt srcfilename]  X75  [opt srclinenumber]  X76  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename15 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X74  [opt srcfilename]  X75  [opt srclinenumber]  X76  [field_declaration] 
    construct E2  [class_body_declaration]
        X75  X76 
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
        X77  [opt srcfilename]  X78  [opt srclinenumber]  X79  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber11 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X77  [opt srcfilename]  X78  [opt srclinenumber]  X79  [empty_declaration] 
    construct E2  [class_body_declaration]
        X77  X79 
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
        X80  [opt srcfilename]  X81  [opt srclinenumber]  X82  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber12 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X80  [opt srcfilename]  X81  [opt srclinenumber]  X82  [member_declaration] 
    construct E2  [class_body_declaration]
        X80  X82 
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
        X83  [opt srcfilename]  X84  [opt srclinenumber]  X85  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber13 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X83  [opt srcfilename]  X84  [opt srclinenumber]  X85  [instance_initializer] 
    construct E2  [class_body_declaration]
        X83  X85 
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
        X86  [opt srcfilename]  X87  [opt srclinenumber]  X88  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber14 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X86  [opt srcfilename]  X87  [opt srclinenumber]  X88  [static_initializer] 
    construct E2  [class_body_declaration]
        X86  X88 
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
        X89  [opt srcfilename]  X90  [opt srclinenumber]  X91  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber15 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X89  [opt srcfilename]  X90  [opt srclinenumber]  X91  [field_declaration] 
    construct E2  [class_body_declaration]
        X89  X91 
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
        X92  [opt srcfilename]  X93  [opt srclinenumber]  X94  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename16 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X92  [opt srcfilename]  X93  [opt srclinenumber]  X94  [empty_declaration] 
    construct E2  [class_body_declaration]
        X93  X94 
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
        X95  [opt srcfilename]  X96  [opt srclinenumber]  X97  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename17 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X95  [opt srcfilename]  X96  [opt srclinenumber]  X97  [member_declaration] 
    construct E2  [class_body_declaration]
        X96  X97 
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
        X98  [opt srcfilename]  X99  [opt srclinenumber]  X100  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename18 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X98  [opt srcfilename]  X99  [opt srclinenumber]  X100  [instance_initializer] 
    construct E2  [class_body_declaration]
        X99  X100 
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
        X101  [opt srcfilename]  X102  [opt srclinenumber]  X103  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename19 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X101  [opt srcfilename]  X102  [opt srclinenumber]  X103  [static_initializer] 
    construct E2  [class_body_declaration]
        X102  X103 
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
        X104  [opt srcfilename]  X105  [opt srclinenumber]  X106  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename20 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X104  [opt srcfilename]  X105  [opt srclinenumber]  X106  [field_declaration] 
    construct E2  [class_body_declaration]
        X105  X106 
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
        X107  [opt srcfilename]  X108  [opt srclinenumber]  X109  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber16 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X107  [opt srcfilename]  X108  [opt srclinenumber]  X109  [empty_declaration] 
    construct E2  [class_body_declaration]
        X107  X109 
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
        X110  [opt srcfilename]  X111  [opt srclinenumber]  X112  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber17 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X110  [opt srcfilename]  X111  [opt srclinenumber]  X112  [member_declaration] 
    construct E2  [class_body_declaration]
        X110  X112 
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
        X113  [opt srcfilename]  X114  [opt srclinenumber]  X115  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber18 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X113  [opt srcfilename]  X114  [opt srclinenumber]  X115  [instance_initializer] 
    construct E2  [class_body_declaration]
        X113  X115 
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
        X116  [opt srcfilename]  X117  [opt srclinenumber]  X118  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber19 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X116  [opt srcfilename]  X117  [opt srclinenumber]  X118  [static_initializer] 
    construct E2  [class_body_declaration]
        X116  X118 
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
        X119  [opt srcfilename]  X120  [opt srclinenumber]  X121  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber20 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X119  [opt srcfilename]  X120  [opt srclinenumber]  X121  [field_declaration] 
    construct E2  [class_body_declaration]
        X119  X121 
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
        X122  [opt srcfilename]  X123  [opt srclinenumber]  X124  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename21 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X122  [opt srcfilename]  X123  [opt srclinenumber]  X124  [empty_declaration] 
    construct E2  [class_body_declaration]
        X123  X124 
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
        X125  [opt srcfilename]  X126  [opt srclinenumber]  X127  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename22 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X125  [opt srcfilename]  X126  [opt srclinenumber]  X127  [member_declaration] 
    construct E2  [class_body_declaration]
        X126  X127 
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
        X128  [opt srcfilename]  X129  [opt srclinenumber]  X130  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename23 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X128  [opt srcfilename]  X129  [opt srclinenumber]  X130  [instance_initializer] 
    construct E2  [class_body_declaration]
        X129  X130 
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
        X131  [opt srcfilename]  X132  [opt srclinenumber]  X133  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename24 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X131  [opt srcfilename]  X132  [opt srclinenumber]  X133  [static_initializer] 
    construct E2  [class_body_declaration]
        X132  X133 
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
        X134  [opt srcfilename]  X135  [opt srclinenumber]  X136  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srcfilename25 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X134  [opt srcfilename]  X135  [opt srclinenumber]  X136  [field_declaration] 
    construct E2  [class_body_declaration]
        X135  X136 
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
        X137  [opt srcfilename]  X138  [opt srclinenumber]  X139  [empty_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber21 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X137  [opt srcfilename]  X138  [opt srclinenumber]  X139  [empty_declaration] 
    construct E2  [class_body_declaration]
        X137  X139 
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
        X140  [opt srcfilename]  X141  [opt srclinenumber]  X142  [member_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber22 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X140  [opt srcfilename]  X141  [opt srclinenumber]  X142  [member_declaration] 
    construct E2  [class_body_declaration]
        X140  X142 
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
        X143  [opt srcfilename]  X144  [opt srclinenumber]  X145  [instance_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber23 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X143  [opt srcfilename]  X144  [opt srclinenumber]  X145  [instance_initializer] 
    construct E2  [class_body_declaration]
        X143  X145 
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
        X146  [opt srcfilename]  X147  [opt srclinenumber]  X148  [static_initializer] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber24 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X146  [opt srcfilename]  X147  [opt srclinenumber]  X148  [static_initializer] 
    construct E2  [class_body_declaration]
        X146  X148 
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
        X149  [opt srcfilename]  X150  [opt srclinenumber]  X151  [field_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_body_declaration_srclinenumber25 E1  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    deconstruct E1
        X149  [opt srcfilename]  X150  [opt srclinenumber]  X151  [field_declaration] 
    construct E2  [class_body_declaration]
        X149  X151 
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

function normalise_ignore_by2_class_declaration_srcfilename1 E1  [class_declaration]
    replace  [class_declaration *]
        Seq  [class_declaration *] 
    deconstruct not E1
        X152  [opt srcfilename]  X153  [opt srclinenumber]  X154  [class_header]  X155  [class_body] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_declaration_srcfilename1 E1  [class_declaration]
    replace  [class_declaration *]
        Seq  [class_declaration *] 
    deconstruct E1
        X152  [opt srcfilename]  X153  [opt srclinenumber]  X154  [class_header]  X155  [class_body] 
    construct E2  [class_declaration]
        X153  X154  X155 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_declaration_srcfilename1
    replace  [program]
        P1  [ program ] 
    construct List1  [class_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_declaration *]
        _  [normalise_ignore_by3_class_declaration_srcfilename1  each  List1]  [
                  normalise_ignore_by2_class_declaration_srcfilename1  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_class_declaration_srclinenumber1 E1  [class_declaration]
    replace  [class_declaration *]
        Seq  [class_declaration *] 
    deconstruct not E1
        X156  [opt srcfilename]  X157  [opt srclinenumber]  X158  [class_header]  X159  [class_body] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_class_declaration_srclinenumber1 E1  [class_declaration]
    replace  [class_declaration *]
        Seq  [class_declaration *] 
    deconstruct E1
        X156  [opt srcfilename]  X157  [opt srclinenumber]  X158  [class_header]  X159  [class_body] 
    construct E2  [class_declaration]
        X156  X158  X159 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_class_declaration_srclinenumber1
    replace  [program]
        P1  [ program ] 
    construct List1  [class_declaration *]
        _  [ ^  P1 ] 
    construct List2  [class_declaration *]
        _  [normalise_ignore_by3_class_declaration_srclinenumber1  each  List1]  [
                  normalise_ignore_by2_class_declaration_srclinenumber1  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_interface_declaration_srcfilename1 E1  [interface_declaration]
    replace  [interface_declaration *]
        Seq  [interface_declaration *] 
    deconstruct not E1
        X160  [opt srcfilename]  X161  [opt srclinenumber]  X162  [interface_header]  X163  [interface_body] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_interface_declaration_srcfilename1 E1  [interface_declaration]
    replace  [interface_declaration *]
        Seq  [interface_declaration *] 
    deconstruct E1
        X160  [opt srcfilename]  X161  [opt srclinenumber]  X162  [interface_header]  X163  [interface_body] 
    construct E2  [interface_declaration]
        X161  X162  X163 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_interface_declaration_srcfilename1
    replace  [program]
        P1  [ program ] 
    construct List1  [interface_declaration *]
        _  [ ^  P1 ] 
    construct List2  [interface_declaration *]
        _  [normalise_ignore_by3_interface_declaration_srcfilename1  each  List1]  [
                  normalise_ignore_by2_interface_declaration_srcfilename1  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_interface_declaration_srclinenumber1 E1  [interface_declaration]
    replace  [interface_declaration *]
        Seq  [interface_declaration *] 
    deconstruct not E1
        X164  [opt srcfilename]  X165  [opt srclinenumber]  X166  [interface_header]  X167  [interface_body] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_interface_declaration_srclinenumber1 E1  [interface_declaration]
    replace  [interface_declaration *]
        Seq  [interface_declaration *] 
    deconstruct E1
        X164  [opt srcfilename]  X165  [opt srclinenumber]  X166  [interface_header]  X167  [interface_body] 
    construct E2  [interface_declaration]
        X164  X166  X167 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_interface_declaration_srclinenumber1
    replace  [program]
        P1  [ program ] 
    construct List1  [interface_declaration *]
        _  [ ^  P1 ] 
    construct List2  [interface_declaration *]
        _  [normalise_ignore_by3_interface_declaration_srclinenumber1  each  List1]  [
                  normalise_ignore_by2_interface_declaration_srclinenumber1  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_enum_declaration_srcfilename1 E1  [enum_declaration]
    replace  [enum_declaration *]
        Seq  [enum_declaration *] 
    deconstruct not E1
        X168  [opt srcfilename]  X169  [opt srclinenumber]  X170  [enum_header]  X171  [enum_body] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_enum_declaration_srcfilename1 E1  [enum_declaration]
    replace  [enum_declaration *]
        Seq  [enum_declaration *] 
    deconstruct E1
        X168  [opt srcfilename]  X169  [opt srclinenumber]  X170  [enum_header]  X171  [enum_body] 
    construct E2  [enum_declaration]
        X169  X170  X171 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_enum_declaration_srcfilename1
    replace  [program]
        P1  [ program ] 
    construct List1  [enum_declaration *]
        _  [ ^  P1 ] 
    construct List2  [enum_declaration *]
        _  [normalise_ignore_by3_enum_declaration_srcfilename1  each  List1]  [
                  normalise_ignore_by2_enum_declaration_srcfilename1  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_enum_declaration_srclinenumber1 E1  [enum_declaration]
    replace  [enum_declaration *]
        Seq  [enum_declaration *] 
    deconstruct not E1
        X172  [opt srcfilename]  X173  [opt srclinenumber]  X174  [enum_header]  X175  [enum_body] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_enum_declaration_srclinenumber1 E1  [enum_declaration]
    replace  [enum_declaration *]
        Seq  [enum_declaration *] 
    deconstruct E1
        X172  [opt srcfilename]  X173  [opt srclinenumber]  X174  [enum_header]  X175  [enum_body] 
    construct E2  [enum_declaration]
        X172  X174  X175 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_enum_declaration_srclinenumber1
    replace  [program]
        P1  [ program ] 
    construct List1  [enum_declaration *]
        _  [ ^  P1 ] 
    construct List2  [enum_declaration *]
        _  [normalise_ignore_by3_enum_declaration_srclinenumber1  each  List1]  [
                  normalise_ignore_by2_enum_declaration_srclinenumber1  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_package_header_srcfilename1 E1  [package_header]
    replace  [package_header *]
        Seq  [package_header *] 
    deconstruct not E1
        X176  [opt srcfilename]  X177  [opt srclinenumber]  X178  [repeat annotation]  'package  X179  [package_name]  '; 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_package_header_srcfilename1 E1  [package_header]
    replace  [package_header *]
        Seq  [package_header *] 
    deconstruct E1
        X176  [opt srcfilename]  X177  [opt srclinenumber]  X178  [repeat annotation]  'package  X179  [package_name]  '; 
    construct E2  [package_header]
        X177  X178  'package  X179  '; 
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
        X180  [opt srcfilename]  X181  [opt srclinenumber]  X182  [repeat annotation]  'package  X183  [package_name]  '; 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_package_header_srclinenumber1 E1  [package_header]
    replace  [package_header *]
        Seq  [package_header *] 
    deconstruct E1
        X180  [opt srcfilename]  X181  [opt srclinenumber]  X182  [repeat annotation]  'package  X183  [package_name]  '; 
    construct E2  [package_header]
        X180  X182  'package  X183  '; 
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

function normalise_ignore_by2_import_declaration_srcfilename1 E1  [import_declaration]
    replace  [import_declaration *]
        Seq  [import_declaration *] 
    deconstruct not E1
        X184  [opt srcfilename]  X185  [opt srclinenumber]  'import  X186  [opt  'static]  X187  [imported_name]  '; 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_import_declaration_srcfilename1 E1  [import_declaration]
    replace  [import_declaration *]
        Seq  [import_declaration *] 
    deconstruct E1
        X184  [opt srcfilename]  X185  [opt srclinenumber]  'import  X186  [opt  'static]  X187  [imported_name]  '; 
    construct E2  [import_declaration]
        X185  'import  X186  X187  '; 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_import_declaration_srcfilename1
    replace  [program]
        P1  [ program ] 
    construct List1  [import_declaration *]
        _  [ ^  P1 ] 
    construct List2  [import_declaration *]
        _  [normalise_ignore_by3_import_declaration_srcfilename1  each  List1]  [
                  normalise_ignore_by2_import_declaration_srcfilename1  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_import_declaration_srcfilename2 E1  [import_declaration]
    replace  [import_declaration *]
        Seq  [import_declaration *] 
    deconstruct not E1
        X188  [opt srcfilename]  X189  [opt srclinenumber]  '; 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_import_declaration_srcfilename2 E1  [import_declaration]
    replace  [import_declaration *]
        Seq  [import_declaration *] 
    deconstruct E1
        X188  [opt srcfilename]  X189  [opt srclinenumber]  '; 
    construct E2  [import_declaration]
        X189  '; 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_import_declaration_srcfilename2
    replace  [program]
        P1  [ program ] 
    construct List1  [import_declaration *]
        _  [ ^  P1 ] 
    construct List2  [import_declaration *]
        _  [normalise_ignore_by3_import_declaration_srcfilename2  each  List1]  [
                  normalise_ignore_by2_import_declaration_srcfilename2  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_import_declaration_srclinenumber1 E1  [import_declaration]
    replace  [import_declaration *]
        Seq  [import_declaration *] 
    deconstruct not E1
        X190  [opt srcfilename]  X191  [opt srclinenumber]  'import  X192  [opt  'static]  X193  [imported_name]  '; 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_import_declaration_srclinenumber1 E1  [import_declaration]
    replace  [import_declaration *]
        Seq  [import_declaration *] 
    deconstruct E1
        X190  [opt srcfilename]  X191  [opt srclinenumber]  'import  X192  [opt  'static]  X193  [imported_name]  '; 
    construct E2  [import_declaration]
        X190  'import  X192  X193  '; 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_import_declaration_srclinenumber1
    replace  [program]
        P1  [ program ] 
    construct List1  [import_declaration *]
        _  [ ^  P1 ] 
    construct List2  [import_declaration *]
        _  [normalise_ignore_by3_import_declaration_srclinenumber1  each  List1]  [
                  normalise_ignore_by2_import_declaration_srclinenumber1  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_import_declaration_srclinenumber2 E1  [import_declaration]
    replace  [import_declaration *]
        Seq  [import_declaration *] 
    deconstruct not E1
        X194  [opt srcfilename]  X195  [opt srclinenumber]  '; 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_import_declaration_srclinenumber2 E1  [import_declaration]
    replace  [import_declaration *]
        Seq  [import_declaration *] 
    deconstruct E1
        X194  [opt srcfilename]  X195  [opt srclinenumber]  '; 
    construct E2  [import_declaration]
        X194  '; 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_import_declaration_srclinenumber2
    replace  [program]
        P1  [ program ] 
    construct List1  [import_declaration *]
        _  [ ^  P1 ] 
    construct List2  [import_declaration *]
        _  [normalise_ignore_by3_import_declaration_srclinenumber2  each  List1]  [
                  normalise_ignore_by2_import_declaration_srclinenumber2  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_import_declaration_srcfilename3 E1  [import_declaration]
    replace  [import_declaration *]
        Seq  [import_declaration *] 
    deconstruct not E1
        X196  [opt srcfilename]  X197  [opt srclinenumber]  'import  X198  [opt  'static]  X199  [imported_name]  '; 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_import_declaration_srcfilename3 E1  [import_declaration]
    replace  [import_declaration *]
        Seq  [import_declaration *] 
    deconstruct E1
        X196  [opt srcfilename]  X197  [opt srclinenumber]  'import  X198  [opt  'static]  X199  [imported_name]  '; 
    construct E2  [import_declaration]
        X197  'import  X198  X199  '; 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_import_declaration_srcfilename3
    replace  [program]
        P1  [ program ] 
    construct List1  [import_declaration *]
        _  [ ^  P1 ] 
    construct List2  [import_declaration *]
        _  [normalise_ignore_by3_import_declaration_srcfilename3  each  List1]  [
                  normalise_ignore_by2_import_declaration_srcfilename3  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_import_declaration_srcfilename4 E1  [import_declaration]
    replace  [import_declaration *]
        Seq  [import_declaration *] 
    deconstruct not E1
        X200  [opt srcfilename]  X201  [opt srclinenumber]  '; 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_import_declaration_srcfilename4 E1  [import_declaration]
    replace  [import_declaration *]
        Seq  [import_declaration *] 
    deconstruct E1
        X200  [opt srcfilename]  X201  [opt srclinenumber]  '; 
    construct E2  [import_declaration]
        X201  '; 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_import_declaration_srcfilename4
    replace  [program]
        P1  [ program ] 
    construct List1  [import_declaration *]
        _  [ ^  P1 ] 
    construct List2  [import_declaration *]
        _  [normalise_ignore_by3_import_declaration_srcfilename4  each  List1]  [
                  normalise_ignore_by2_import_declaration_srcfilename4  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_import_declaration_srclinenumber3 E1  [import_declaration]
    replace  [import_declaration *]
        Seq  [import_declaration *] 
    deconstruct not E1
        X202  [opt srcfilename]  X203  [opt srclinenumber]  'import  X204  [opt  'static]  X205  [imported_name]  '; 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_import_declaration_srclinenumber3 E1  [import_declaration]
    replace  [import_declaration *]
        Seq  [import_declaration *] 
    deconstruct E1
        X202  [opt srcfilename]  X203  [opt srclinenumber]  'import  X204  [opt  'static]  X205  [imported_name]  '; 
    construct E2  [import_declaration]
        X202  'import  X204  X205  '; 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_import_declaration_srclinenumber3
    replace  [program]
        P1  [ program ] 
    construct List1  [import_declaration *]
        _  [ ^  P1 ] 
    construct List2  [import_declaration *]
        _  [normalise_ignore_by3_import_declaration_srclinenumber3  each  List1]  [
                  normalise_ignore_by2_import_declaration_srclinenumber3  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by2_import_declaration_srclinenumber4 E1  [import_declaration]
    replace  [import_declaration *]
        Seq  [import_declaration *] 
    deconstruct not E1
        X206  [opt srcfilename]  X207  [opt srclinenumber]  '; 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_import_declaration_srclinenumber4 E1  [import_declaration]
    replace  [import_declaration *]
        Seq  [import_declaration *] 
    deconstruct E1
        X206  [opt srcfilename]  X207  [opt srclinenumber]  '; 
    construct E2  [import_declaration]
        X206  '; 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_import_declaration_srclinenumber4
    replace  [program]
        P1  [ program ] 
    construct List1  [import_declaration *]
        _  [ ^  P1 ] 
    construct List2  [import_declaration *]
        _  [normalise_ignore_by3_import_declaration_srclinenumber4  each  List1]  [
                  normalise_ignore_by2_import_declaration_srclinenumber4  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function program_normalise
    replace  [program]
        Prg  [ program ] 
    by
        Prg  [ normalise_ignore_by4_Private_class_or_interface_body_class_body_declaration1 ]  [ 
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
          normalise_ignore_by4_class_body_declaration_srclinenumber25 ]  [ normalise_ignore_by4_class_declaration_srcfilename1 
          ]  [ normalise_ignore_by4_class_declaration_srclinenumber1 ]  [ 
          normalise_ignore_by4_interface_declaration_srcfilename1 ]  [ 
          normalise_ignore_by4_interface_declaration_srclinenumber1 ]  [ normalise_ignore_by4_enum_declaration_srcfilename1 ]  [
          normalise_ignore_by4_enum_declaration_srclinenumber1 ]  [ normalise_ignore_by4_package_header_srcfilename1 ]  [ 
          normalise_ignore_by4_package_header_srclinenumber1 ]  [ normalise_ignore_by4_import_declaration_srcfilename1 ]  [ 
          normalise_ignore_by4_import_declaration_srcfilename2 ]  [ normalise_ignore_by4_import_declaration_srclinenumber1 ]  [ 
          normalise_ignore_by4_import_declaration_srclinenumber2 ]  [ normalise_ignore_by4_import_declaration_srcfilename3 ]  [ 
          normalise_ignore_by4_import_declaration_srcfilename4 ]  [ normalise_ignore_by4_import_declaration_srclinenumber3 ]  [ 
          normalise_ignore_by4_import_declaration_srclinenumber4 ]  [ normalise_preferred_replace_method_body_block1 ]  [ 
          normalise_preferred_replace_constructor_body_block1 ]  [ normalise_list_enum_body_class_body_declaration ]  [ 
          normalise_list_package_declaration_import_declaration ]  [ normalise_list_class_header_modifier ]  [ 
          normalise_list_interface_header_modifier ]  [ normalise_list_enum_header_modifier ]  [ 
          normalise_list_extends_clause_type_name ]  [ normalise_list_implements_clause_qualified_name ]  [ 
          normalise_list_constructor_declaration_modifier ]  [ normalise_list_variable_declaration_modifier ]  [ 
          normalise_list_variable_declarators_variable_declarator ]  [ normalise_list_method_declaration_modifier ]  [ 
          normalise_list_throws_qualified_name ]  [ normalise_list_annotation_value_list_keyed_annotation_value ]  [ 
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
        Prg  [ find_replace_class_body_declaration ]  [ find_replace_class_declaration ]  [ find_replace_interface_declaration 
          ]  [ find_replace_enum_declaration ]  [ find_replace_package_header ]  [ find_replace_import_declaration ] 
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

