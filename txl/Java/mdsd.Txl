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
      'throw  'throws  'transient  'true  'try  'void  'volatile  'while  'enum 
end keys

define package_header
    [repeat annotation]  'package  [package_name]  ';  [NL] [NL] 
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
define enum_body
    '{ [IN]
        [list enum_element]  [opt  ',]  [repeat class_body_declaration]  [EX]
    '}  [opt  ';]  [NL] [NL] 
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
define constructor_body
    [block]  [NL] 
end define
define field_declaration
    [variable_declaration] 
end define
define variable_name
    [declared_name]  [repeat dimension] 
end define
define array_initializer
    '{ [list variable_initializer]  [opt  ',]  '} 
end define
define method_name
    [declared_name] 
end define
define var_arg_specifier
    '... 
end define
define formal_parameter_name
    [variable_name] 
end define
define method_body
    [block]  [NL] [NL] 
    |    [opt annotation_default]  ';  [NL] [NL] 
end define
define annotation_default
    'default  [expression] 
    |    'default  [array_initializer] 
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
define local_variable_declaration
    [variable_declaration] 
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
define enum_element
    [comment_nl]  [NL]
    [id]  [opt method_argument] 
end define
define type_specifier
    [type_name]  [comment_nl] 
    |    [array_type_specifier]  [comment_nl] 
end define
define add_op_multiplicative_expression
    [add_op]  [multiplicative_expression]  [comment_nl] 
end define
define expression_statement
    [expression]  ';  [comment_nl] 
end define
define statement
    [comment_nl]  [label_statement]  [comment_nl] 
    |    [comment_nl]  [empty_statement]  [comment_nl] 
    |    [comment_nl]  [expression_statement]  [comment_nl] 
    |    [comment_nl]  [if_statement]  [comment_nl] 
    |    [comment_nl]  [switch_statement]  [comment_nl] 
    |    [comment_nl]  [while_statement]  [comment_nl] 
    |    [comment_nl]  [do_statement]  [comment_nl] 
    |    [comment_nl]  [for_statement]  [comment_nl] 
    |    [comment_nl]  [for_in_statement]  [comment_nl] 
    |    [comment_nl]  [break_statement]  [comment_nl] 
    |    [comment_nl]  [continue_statement]  [comment_nl] 
    |    [comment_nl]  [return_statement]  [comment_nl] 
    |    [comment_nl]  [throw_statement]  [comment_nl] 
    |    [comment_nl]  [synchronized_statement]  [comment_nl] 
    |    [comment_nl]  [try_statement]  [comment_nl] 
    |    [comment_nl]  [assert_statement]  [comment_nl] 
    |    [comment_nl]  [block]  [comment_nl] 
end define
define class_body_declaration
    [comment_nl]  [empty_declaration] 
    |    [comment_nl]  [member_declaration] 
    |    [comment_nl]  [instance_initializer] 
    |    [comment_nl]  [static_initializer] 
    |    [comment_nl]  [field_declaration] 
end define
define variable_initializer
    [comment_nl]  [expression]  [comment_nl] 
    |    [comment_nl]  [array_initializer]  [comment_nl] 
    |    [comment_nl]  [id]  '( ')  [block]  [comment_nl] 
end define
define variable_declarator
    [variable_name]  [opt equals_variable_initializer]  [comment_nl] 
end define
define equals_variable_initializer
    [comment_nl]  '=  [variable_initializer]  [comment_nl] 
end define
define formal_parameter
    [comment_nl]  [opt  'final]  [type_specifier]  [opt var_arg_specifier]  [formal_parameter_name]  [comment_nl] 
end define
define constructor_declarator
    [class_name]  '( [list formal_parameter]  ')  [comment_nl] 
end define
define method_declarator
    [method_name]  '( [list formal_parameter]  ')  [repeat dimension]  [comment_nl] 
end define
define argument
    [comment_nl]  [expression]  [comment_nl] 
    |    [comment_nl]  [type_specifier]  [comment_nl] 
end define
define method_argument
    '( [list argument]  ')  [comment_nl] 
end define
define if_statement
    'if  '( [expression]  ')  [comment_nl]  [statement]  [opt else_clause]  [NL] 
end define
define block
    '{ [NL] [IN]
        [comment_nl]  [EX]
    '}  [NL] 
    |    '{ [NL] [IN]
        [comment_nl]  [repeat declaration_or_statement +]  [EX]
    [comment_nl]  '}  [NL] 
end define
define declaration_or_statement
    [comment_nl]  [local_variable_declaration]  [comment_nl]  [NL] 
    |    [comment_nl]  [class_declaration]  [comment_nl]  [NL] 
    |    [comment_nl]  [statement]  [comment_nl]  [NL] 
end define
define expression
    [comment_nl]  [assignment_expression] 
end define
define mycomment
    [comment] 
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
define program
    [package_declaration *] 
end define
define type_declaration
    [class_declaration]  [NL] [NL]
    [comment_nl] 
    |    [interface_declaration]  [NL] [NL]
    [comment_nl] 
    |    [enum_declaration]  [NL]
    [comment_nl] 
end define
define import_declaration
    [comment_nl]  'import  [opt  'static]  [imported_name]  ';  [NL]
    [comment_nl] 
    |    [comment_nl]  ';  [NL]
    [comment_nl] 
end define
define class_header
    [repeat modifier]  'class  [class_name]  [opt extends_clause]  [opt implements_clause] 
end define
define interface_header
    [repeat modifier]  [opt annot_marker]  'interface  [interface_name]  [opt extends_clause]  [opt implements_clause] 
end define
define enum_header
    [repeat modifier]  [opt id]  'enum  [opt declared_name]  [opt extends_clause]  [opt implements_clause] 
end define
define extends_clause
    'extends  [list type_name +] 
end define
define implements_clause
    'implements  [list qualified_name +] 
end define
define package_declaration
    [comment_nl]  [opt package_header]  [repeat import_declaration]  [repeat type_declaration] 
end define
define class_or_interface_body
    '{ [NL] [IN]
        [repeat class_body_declaration]  [EX] [NL]
    [comment_nl]  '}  [opt  ';]  [comment_nl]  [NL] [NL] 
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
define comment_nl
    [empty] 
    |    [repeat mycomment] 
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

function NotJavaDoc A  [mycomment]
    match  [comment_nl]
        B  [comment_nl] 
    construct S_Comment  [stringlit]
        _  [quote  A] 
    where not
        S_Comment  [grep  "\/\*\*"] end function

function NotGeneratedNot A  [class_body_declaration]
    match  [class_or_interface_body]
        B  [class_or_interface_body] 
    construct S_Cs  [stringlit]
        _  [quote  A] 
    where not
        S_Cs  [grep  "@generated NOT"] import Program [program]

    deconstruct * [class_or_interface_body] Program
        C  [class_or_interface_body] 
    where
        C  [=  B] end function

function remove_comment
    replace  *  [comment_nl]
        X  [comment_nl] 
    by
        _ 
end function

function put_string F  [stringlit] S  [stringlit]
    replace  [stringlit]
        Str  [stringlit] 
    construct d_S  [stringlit]
        S  [fput  F] 
    by
        Str 
end function

function self_comment
    replace  [class_body_declaration]
        X  [class_body_declaration] 
    construct nc_X  [class_body_declaration]
        X  [remove_comment] 
    construct s_X  [stringlit]
        _  [unparse  nc_X] 
    construct fName  [id]
        'tmp_comment 
    construct fNameNew  [id]
        fName  [!] 
    construct s_fNameNew  [stringlit]
        _  [quote  fNameNew] 
    construct s_Head  [stringlit]
        _  [+  "/"]  [+  "*"]  [+  "*"] 
    construct s_End  [stringlit]
        _  [+  " * <!-- e"]  [+  "nd-user-doc -->"] 
    construct s_Tail  [stringlit]
        _  [+  " *"]  [+  "/"] 
    construct d_put  [stringlit]
        _  [put_string  s_fNameNew  s_Head]  [put_string  s_fNameNew  " * <!-- begin-user-doc -->"]  [put_string  s_fNameNew 
                  s_X]  [put_string  s_fNameNew  s_End]  [put_string  s_fNameNew  " * @generated "]  [put_string  s_fNameNew 
                  s_Tail]  [put_string  s_fNameNew  s_X] 
    construct rm_fNameNew  [stringlit]
        _  [+  "rm -f "]  [+  s_fNameNew] 
    construct Y  [class_body_declaration]
        _  [read  fNameNew]  [system  rm_fNameNew] 
    by
        Y 
end function

function LiftToComment
    replace  [class_body_declaration *]
        A1  [class_body_declaration]  A2  [class_body_declaration *] 
    construct B1  [class_body_declaration]
        A1  [self_comment] 
    construct B2  [class_body_declaration *]
        A2  [LiftToComment] 
    by
        _  [. B1]  [. B2] 
end function

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

redefine mycomment
    ...
|       
    [attr Change] 

end define
function find_replace_mycomment
    replace  [program]
        P  [ program ] 
    import Program_Diff [program]

    construct S  [mycomment *]
        _  [ find_clones_mycomment  P  Program_Diff ] 
    construct P3  [program]
        P  [mark_clones_mycomment  each  S]
 
    by
        P3 
end function

function find_clones_mycomment P  [program] P2  [program]
    replace  [mycomment *]
        _  [ mycomment  * ] 
    construct S  [mycomment *]
        _  [ ^  P ] 
    by
        _  [add_if_clones_mycomment1  P2  each  S]
 
end function

function add_if_clones_mycomment1 P2  [program] Stmt  [mycomment]
    construct S2  [mycomment *]
        _  [ ^  P2 ] 
    deconstruct * S2
        Stmt  Rest  [ mycomment  * ] 
    replace  [mycomment *]
        StructuredClones  [ mycomment  * ] 
    deconstruct not * StructuredClones
        C  [attr Change] 
    by
        StructuredClones  [ . Stmt ] 
end function

function mark_clones_mycomment S  [mycomment]
    import CloneNumber [number]

    import Program_Diff [program]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    construct C  [stringlit]
        _  [ quote  S ] 
    where not
        C  [=  ""]
    construct S2  [mycomment]
        >>>>>>  C 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    construct S1  [mycomment]
        <<<<<<  C 
    by
        P  [ $  S  S1 ] 
end function

function normalise_ignore_by2_modifier_annotation1 E1  [modifier]
    replace  [modifier *]
        Seq  [modifier *] 
    deconstruct not E1
        X8  [repeat annotation] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_modifier_annotation1 E1  [modifier]
    replace  [modifier *]
        Seq  [modifier *] 
    deconstruct E1
        X8  [repeat annotation] 
    by
        Seq 
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

function normalise_ignore_by2_package_declaration_import_declaration2 E1  [package_declaration]
    replace  [package_declaration *]
        Seq  [package_declaration *] 
    deconstruct not E1
        X14  [comment_nl]  X15  [opt package_header]  X16  [repeat import_declaration]  X17  [repeat type_declaration] 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_package_declaration_import_declaration2 E1  [package_declaration]
    replace  [package_declaration *]
        Seq  [package_declaration *] 
    deconstruct E1
        X14  [comment_nl]  X15  [opt package_header]  X16  [repeat import_declaration]  X17  [repeat type_declaration] 
    construct E2  [package_declaration]
        X14  X15  X17 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_package_declaration_import_declaration2
    replace  [program]
        P1  [ program ] 
    construct List1  [package_declaration *]
        _  [ ^  P1 ] 
    construct List2  [package_declaration *]
        _  [normalise_ignore_by3_package_declaration_import_declaration2  each  List1]  [
                  normalise_ignore_by2_package_declaration_import_declaration2  each  List1]
 
    construct P2  [program]
        P1  [ $  List1  List2 ] 
    by
        P2 
end function

function normalise_ignore_by1_NotGeneratedNot_class_or_interface_body_class_body_declaration1 E1  [class_or_interface_body] N1 
  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    where not
        E1  [NotGeneratedNot  N1]
    by
        Seq  [ . N1 ] 
end function

function normalise_ignore_by2_NotGeneratedNot_class_or_interface_body_class_body_declaration1 E1  [class_or_interface_body] N1 
  [class_body_declaration]
    replace  [class_body_declaration *]
        Seq  [class_body_declaration *] 
    where
        E1  [NotGeneratedNot  N1]
    by
        Seq 
end function

function normalise_ignore_by3_NotGeneratedNot_class_or_interface_body_class_body_declaration1 E1  [class_or_interface_body]
    replace  [class_or_interface_body *]
        Seq  [class_or_interface_body *] 
    deconstruct E1
        '{ N1  [repeat class_body_declaration]  X18  [comment_nl]  '}  X19  [opt  ';]  X20  [comment_nl] 
    construct N2  [class_body_declaration *]
        _  [normalise_ignore_by1_NotGeneratedNot_class_or_interface_body_class_body_declaration1  E1  each  N1]  [
                  normalise_ignore_by2_NotGeneratedNot_class_or_interface_body_class_body_declaration1  E1  each  N1]
 
    construct E2  [class_or_interface_body]
        '{ N2  X18  '}  X19  X20 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_NotGeneratedNot_class_or_interface_body_class_body_declaration1
    replace  [program]
        P1  [ program ] 
    construct List1  [class_or_interface_body *]
        _  [ ^  P1 ] 
    construct List2  [class_or_interface_body *]
        _  [normalise_ignore_by3_NotGeneratedNot_class_or_interface_body_class_body_declaration1  each  List1]
 
    construct P2  [program]
        P1  [$  each  List1  List2]
 
    by
        P2 
end function

function normalise_prefer_by2_class_or_interface_body_class_body_declaration1 E1  [class_or_interface_body]
    replace  [class_or_interface_body *]
        Seq  [class_or_interface_body *] 
    deconstruct not E1
        '{ X21  [repeat class_body_declaration]  X23  [comment_nl]  '}  X24  [opt  ';]  X25  [comment_nl] 
    by
        Seq  [ . E1 ] 
end function

function normalise_prefer_by3_class_or_interface_body_class_body_declaration1 E1  [class_or_interface_body]
    replace  [class_or_interface_body *]
        Seq  [class_or_interface_body *] 
    deconstruct E1
        '{ X21  [repeat class_body_declaration]  X23  [comment_nl]  '}  X24  [opt  ';]  X25  [comment_nl] 
    construct X22  [repeat class_body_declaration]
        X21  [LiftToComment]
 
    construct E2  [class_or_interface_body]
        '{ X22  X23  '}  X24  X25 
    by
        Seq  [ . E2 ] 
end function

function normalise_prefer_by4_class_or_interface_body_class_body_declaration1
    replace  [program]
        P1  [ program ] 
    construct List1  [class_or_interface_body *]
        _  [ ^  P1 ] 
    construct List2  [class_or_interface_body *]
        _  [normalise_prefer_by3_class_or_interface_body_class_body_declaration1  each  List1]  [
                  normalise_prefer_by2_class_or_interface_body_class_body_declaration1  each  List1]
 
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

function program_normalise
    replace  [program]
        Prg  [ program ] 
    by
        Prg  [ normalise_ignore_by4_modifier_annotation1 ]  [ normalise_ignore_by4_package_declaration_import_declaration2 ]  [ 
          normalise_ignore_by4_NotGeneratedNot_class_or_interface_body_class_body_declaration1 ]  [ 
          normalise_prefer_by4_class_or_interface_body_class_body_declaration1 ]  [ normalise_list_class_header_modifier ]  [ 
          normalise_list_interface_header_modifier ]  [ normalise_list_enum_header_modifier ]  [ 
          normalise_list_extends_clause_type_name ]  [ normalise_list_implements_clause_qualified_name ]  [ 
          normalise_list_constructor_declaration_modifier ]  [ normalise_list_variable_declaration_modifier ]  [ 
          normalise_list_variable_declarators_variable_declarator ]  [ normalise_list_method_declaration_modifier ]  [ 
          normalise_list_throws_qualified_name ]  [ normalise_list_annotation_value_list_keyed_annotation_value ]  [ 
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
        Prg  [ find_replace_package_header ]  [ find_replace_type_declaration ]  [ find_replace_mycomment ] 
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

