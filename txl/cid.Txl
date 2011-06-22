comments
    //  
    /* */
end comments

tokens
    hex                "0[xX][\dAaBbCcDdEeFf]+[LUlu]*"
    dotfloat           ".\d+([eE][+-]?\d+)?[FLfl]?"
    float              "\d+.\d*([eE][+-]?\d+)?[FLfl]?"
               |       "\d+(.\d*)?[eE][+-]?\d+[FLfl]?"
               |       "\d+(.\d*)?([eE][+-]?\d+)?[FLfl]"
    long               "\d+[LUlu]+"
    id         |       "\#\i+"
end tokens

keys
    auto  double  int  struct  break  else  long  switch  case  enum  register  typedef  char  extern  return  union  const 
      float  short  unsigned  continue  for  signed  void  default  goto  sizeof  volatile  do  if  static  while  '#define 
      '#else  '#endif  '#if  '#ifdef  '#ifndef  '#include  '#line  '#undef  '#indent  '#LINK     
end keys

compounds
    ->  ++  --  <<  >>  <=  >=  ==  !=  &&  ||  *=  /=  '%=  +=  -=  <<=  >>=  &=  ^=  |= 
end compounds

define C_compilation_unit
    [repeat declaration_or_function_definition] 
end define
define constant
    [number] 
    |    [float] 
    |    [hex] 
    |    [long] 
    |    [SP]  [dotfloat] 
    |    [charlit] 
    |    [string] 
end define
define string
    [repeat stringlit +] 
end define
define expression
    [list assignment_expression +] 
end define
define constant_expression
    [conditional_expression] 
end define
define assignment_expression
    [conditional_expression]  [opt assignment_operation] 
end define
define assignment_operation
    [assignment_operator]  [assignment_expression] 
end define
define assignment_operator
    = 
    |    *= 
    |    /= 
    |    '%= 
    |    += 
    |    -= 
    |    >>= 
    |    <<= 
    |    &= 
    |    ^= 
    |    '|=     
end define
define conditional_expression
    [binary_expression]  [opt conditional_operation] 
end define
define conditional_operation
    ?  [expression]  :  [conditional_expression] 
end define
define binary_expression
    [unary_expression] 
    |    [binary_expression]  [binary_operator]  [unary_expression] 
end define
define binary_operator
    + 
    |    - 
    |    * 
    |    / 
    |    '% 
    |    == 
    |    != 
    |    < 
    |    > 
    |    <= 
    |    >= 
    |    '|| 
    |    && 
    |    '| 
    |    ^ 
    |    & 
    |    << 
    |    >> 
end define
define unary_expression
    [postfix_expression] 
    |    [unary_operator]  [SPOFF]  [unary_expression]  [SPON] 
    |    ( [type_name] )  [unary_expression] 
    |    [sizeof_expression] 
end define
define sizeof_expression
    'sizeof  ( [type_name] ) 
    |    'sizeof  [unary_expression] 
end define
define unary_operator
    * 
    |    & 
    |    + 
    |    - 
    |    ! 
    |    ~ 
    |    ++ 
    |    -- 
end define
define postfix_expression
    [reference] 
    |    [nonreference] 
end define
define reference
    [reference_id] 
    |    [reference_expression] 
end define
define reference_id
    [id] 
end define
define reference_expression
    [unannotated_reference_base]  [repeat postfix_extension] 
end define
define unannotated_reference_base
    [reference_id] 
    |    [nonreferential_primary] 
end define
define nonreference
    [nonreferential_primary]  [repeat postfix_extension] 
end define
define nonreferential_primary
    [constant] 
    |    [string] 
    |    '( [expression]  ')     
end define
define postfix_extension
    '[ [expression]  '] 
    |    '( [opt expression]  ')     
    |    '. [id] 
    |    '->  [id] 
    |    '++     
    |    '--     
end define
define declaration
    [declaration_body]  [semi] 
    |    [preprocessor] 
end define
define declaration_body
    [decl_specifiers]  [list init_declarator +] 
    |    [enum_specifier] 
    |    [struct_or_union_specifier] 
end define
define decl_specifiers
    [repeat decl_qualifier]  [opt type_specifier]  [repeat decl_qualifier] 
end define
define struct_or_union_specifier
    [struct_or_union]  [opt tagged_reference_id]  { [IN] [NL]
        [repeat member_declaration]  [EX]
    } 
    |    [struct_or_union]  [tagged_reference_id] 
end define
define tagged_reference_id
    [reference_id] 
end define
define member_declaration
    [decl_specifiers]  [list member_declarator +]  [semi] 
    |    [preprocessor] 
end define
define member_declarator
    [declarator]  [opt bitfieldsize] 
    |    [bitfieldsize] 
end define
define bitfieldsize
    ':  [constant_expression] 
end define
define decl_qualifier
    [sc_specifier] 
    |    [cv_qualifier] 
    |    [type_qualifier] 
end define
define sc_specifier
    'auto     
    |    'register     
    |    'static     
    |    'extern     
    |    'typedef     
end define
define type_specifier
    [simple_type_name] 
    |    [enum_specifier] 
    |    [struct_or_union_specifier] 
end define
define type_qualifier
    'long     
    |    'short     
    |    'signed     
    |    'unsigned     
end define
define simple_type_name
    'char     
    |    'int     
    |    'void     
    |    'float     
    |    'double     
    |    [type_id] 
end define
define type_id
    [reference_id] 
end define
define struct_or_union
    'struct 
    |    'union     
end define
define enum_specifier
    'enum  [opt tagged_reference_id]  { [list enumerator] } 
    |    'enum  [tagged_reference_id] 
end define
define enumerator
    [reference_id]  [opt enumerator_value] 
end define
define enumerator_value
    =  [constant_expression] 
end define
define init_declarator
    [declarator]  [opt initialization] 
end define
define declarator
    [repeat ptr_operator]  [base_declarator]  [SPON]  [repeat declarator_extension] 
end define
define base_declarator
    [reference_id] 
    |    ( [declarator] ) 
end define
define declarator_extension
    [function_declarator_extension] 
    |    [array_declarator_extension] 
end define
define function_declarator_extension
    ( [argument_declaration_list] )  [repeat cv_qualifier] 
end define
define array_declarator_extension
    '[ [opt constant_expression]  '] 
end define
define ptr_operator
    *  [repeat cv_qualifier]  [SPOFF] 
end define
define cv_qualifier
    'const     
    |    'volatile     
end define
define type_name
    [type_specifiers]  [opt abstract_declarator] 
end define
define type_specifiers
    [repeat type_qualifier +]  [opt type_specifier]  [repeat type_qualifier] 
    |    [type_specifier]  [repeat type_qualifier] 
end define
define abstract_declarator
    [repeat ptr_operator +]  [repeat declarator_extension] 
    |    ( [abstract_declarator] )  [repeat declarator_extension] 
end define
define argument_declaration_list
    [list argument_declaration] 
end define
define argument_declaration
    [decl_specifiers]  [opt argument_declarator] 
    |    '... 
end define
define argument_declarator
    [declarator] 
    |    [abstract_declarator] 
end define
define initialization
    =  [initializer] 
    |    ( [constant_expression] ) 
end define
define initializer
    [expression] 
    |    [NL]
    { [IN]
        [list initializer]  [opt  ',]  [EX]
    } 
end define
define statement
    [repeat label]  [unlabeled_statement] 
    |    [preprocessor] 
end define
define label
    [label_id]  ': 
    |    [EX]
[SP]  [SP]  'case  [constant_expression]  ':  [IN] [NL] 
    |    [EX]
[SP]  [SP]  'default  ':  [IN] [NL] 
end define
define label_id
    [id] 
end define
define unlabeled_statement
    [expression_statement] 
    |    [if_statement] 
    |    [for_statement] 
    |    [while_statement] 
    |    [switch_statement] 
    |    [do_statement] 
    |    [null_statement] 
    |    [jump_statement] 
    |    [compound_statement] 
end define
define null_statement
    [semi] 
end define
define compound_statement
    { [IN] [NL]
        [compound_statement_body] }  [opt  ';]  [NL] 
    end define
    define compound_statement_body
        [repeat statement]  [EX] 
    |    [declaration]  [compound_statement_body] 
end define
define expression_statement
    [expression]  [semi] 
end define
define if_statement
    'if  ( [expression] )  [statement]  [opt else_statement] 
end define
define switch_statement
    'switch  ( [expression] )  [statement] 
end define
define else_statement
    'else  [statement] 
end define
define while_statement
    'while  '( [expression]  ')  [statement] 
end define
define do_statement
    'do  [statement]  'while  ( [expression] )  [semi] 
end define
define for_statement
    'for  ( [opt expression]  ';  [opt expression]  ';  [opt expression] )  [statement] 
end define
define jump_statement
    'goto  [label_id]  [semi] 
    |    'continue  [semi] 
    |    'break  [semi] 
    |    'return  [opt expression]  [semi] 
end define
define declaration_or_function_definition
    [declaration] 
    |    [function_definition] 
end define
define function_definition
            [NL]
    [decl_specifiers]  [declarator]  [opt KR_parameter_decls]  [compound_statement]  [NL] 
end define
define KR_parameter_decls
            [NL] [IN]
        [repeat declaration +]  [EX] 
end define
define semi
    ';  [NL] 
end define
define program
    [C_compilation_unit] 
end define
define preprocessor
    '#define  [id]  '( [list id +]  ')  [expression]  [NL] 
    |    '#define  [id]  [expression]  [NL] 
    |    [EX]
'#else  [IN] [NL] 
    |    [EX]
'#endif  [NL] [NL] 
|        [NL]
'#if  [expression]  [IN] [NL] 
    |    [NL]
    '#ifdef  [id]  [IN] [NL] 
        |        [NL]
        '#ifndef  [id]  [IN] [NL] 
            |    '#ident  [stringlit]  [NL] 
            |    '#include  [stringlit]  [NL] 
            |    '#include  <  [SPOFF]  [filepath]  >  [SPON]  [NL] 
            |    '#line  [integernumber]  [opt stringlit]  [NL] 
            |    '#undef  [id]  [NL] 
            |    '#LINK  [stringlit]  [NL] 
        end define
        define filepath
            [file_id]  [repeat slash_fileid] 
        end define
        define file_id
            [id] 
            |    [key] 
        end define
        define slash_fileid
            [slash]  [file_id] 
        end define
        define slash
            '/ 
            |    '\ 
            |    '. 
            |    ':             
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
        function program_normalise
            replace  [program]
                Prg  [ program ] 
            by
                Prg 
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

