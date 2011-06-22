tokens
    space              "[ \t]+"
    newline            "\n"
               |       ""
               |       "\n"
    id                 "[$\u][\.$\i]*"
               |       "[$\u][$\i]*\?[bdh][\dabcdefABCDEFx]+"
    number             "\d+[lL]?"
               |       "\d+\?[bdh][\dabcdefABCDEFx]+"
               |       "\d+[bdh][\dabcdefABCDEFx]+"
end tokens

comments
    //  
    /* */
end comments

compounds
    !=  '%=  &&  &=  *=  ++  +=  --  -=  /=  ^=  |=  ||  <<  <<=  <=  ==  >= ... 
end compounds

keys
    'module  'endmodule  'begin  'end  'fork  'join  'specify  'endspecify  'if  'else  'while  'for  'forever  'repeat  'wait 
      'case  'casex  'default  'endcase  'function  'endfunction  'task  'endtask  'generate  'endgenerate  'input  'output 
      'inout  'integer  'wire  'reg  'event  'genvar  'real  'parameter  'signed  '\\\\  '( ')  '{ '}  '[ ']  ';  '#  '@  '$  ',
      ':  '=  'ns  'ps  '/  '^  '!  '|  '. 'always  'or  '`include  '`define  '`ifdef  '`else  '`endif  '`timescale  '? 
end keys

define program
    [module *] 
    |    [empty] 
end define
define macro
    '`include 
    |    '`define 
    |    '`ifdef 
    |    '`else 
    |    '`endif 
    |    '`timescale 
end define
define time_unit
    'ns  'ps 
end define
define macro_statement
    [macro]  [number]  'ns  '/  [number]  'ps  [NL] 
    |    [macro]  [id]  [opt expr]  [NL] 
    |    [macro]  [expr]  [NL] 
    |    '`else  [NL] 
    |    '`endif  [NL] 
end define
define statement
    [macro_statement *]  [opt declaration]  [opt  ';]  [NL]  [macro_statement *] 
end define
define part_module_declaration
    [macro_statement *]  [id]  [macro_statement *] 
end define
define declaration
    [macro_statement *]  [parameter_specification]  [macro_statement *] 
    |    [macro_statement *]  [variable_declaration]  [macro_statement *] 
    |    [macro_statement *]  [variable_assignment_statement]  [macro_statement *] 
    |    [macro_statement *]  [if_statement]  [macro_statement *] 
    |    [macro_statement *]  [case_statement]  [macro_statement *] 
    |    [macro_statement *]  [block_statement]  [macro_statement *] 
    |    [macro_statement *]  [qualified_expression]  [macro_statement *] 
    |    [macro_statement *]  [component_configuration]  [macro_statement *] 
    |    [macro_statement *]  [function_decl]  [macro_statement *] 
end define
define variable_declaration
    [variable_type]  [opt range]  [list var] 
end define
define var
    [id]  [opt range] 
    |    [id]  '=  [expr] 
end define
define parameter_specification
    'parameter  [id]  '=  [expr] 
end define
define variable_type
    'input 
    |    'output 
    |    'reg 
    |    'wire 
end define
define variable_assignment_statement
    [expr]  '=  [expr] 
    |    'assign  [expr]  [opt range]  '=  [expr] 
end define
define block_statement
    [opt  'initial]  'begin  [NL] [IN]
        [statement *]  [EX]
    'end 
end define
define function_call
    [id]  [list id] 
end define
define function_decl
    [id]  '( [list id]  ') 
end define
define if_statement
    'if  '( [expr]  ')  [NL] [IN]
        [statement]  [EX]
    [opt else_statement] 
end define
define else_statement
    'else  [NL] [IN]
        [statement]  [EX] 
end define
define case
    'case 
    |    'casex 
end define
define case_statement
    [case]  '( [expr]  ')  [case_statement_alternative *]  'endcase 
end define
define case_statement_alternative
    [macro_statement *]  [list choice]  ':  [statement *]  [macro_statement *] 
end define
define choice
    [number] 
    |    [id] 
    |    'default 
end define
define subrange
    [expr]  ':  [expr] 
end define
define range
    '[ [expr]  ':  [expr]  '] 
end define
define shift_expression
    [expr]  '<=  '#  [expr]  [expr] 
end define
define expr
    [id] 
    |    [id]  ' 'd  [number] 
    |    [subrange] 
    |    '( [expr]  ') 
    |    [id]  '{ [expr]  '} 
    |    [stringlit] 
    |    [shift_expression] 
    |    [number]  [opt time_unit] 
    |    [id]  '[ [expr]  '] 
    |    [u_op]  [expr] 
    |    [expr]  [op]  [expr] 
    |    [expr]  '?  [expr]  ':  [expr] 
    |    '{ [list expr]  '} 
    |    [function_call] 
end define
define qualified_expression
    'always  '@  '( [expr]  ')  [statement] 
    |    [expr] 
end define
define u_op
    '~|  '^ 
    |    '! 
    |    '| 
end define
define op
    '+ 
    |    '- 
    |    '/ 
    |    '< 
    |    '> 
    |    '<= 
    |    'or 
    |    '== 
    |    '& 
    |    '| 
    |    '!= 
    |    '|| 
    |    '&& 
    |    '^ 
    |    '>= 
end define
define component_configuration
    [id]  [opt formal_parameter_list]  [id]  '( [list component_declaration]  ') 
end define
define component_declaration
    [macro_statement *]  [SPOFF]  '. [id]  [SPON]  '( [opt expr]  ')  [macro_statement *] 
end define
define formal_parameter_list
    '#  '( [list expr]  ') 
end define
define module
    [module_declaration]  ';  [NL]
    [repeat statement]  [NL]
    'endmodule  [NL] 
    |    [macro_statement] 
end define
define module_declaration
    'module  [id]  '( [list part_module_declaration]  ') 
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
function normalise_ignore_by2_module_statement2 E1  [module]
    replace  [module *]
        Seq  [module *] 
    deconstruct not E1
        X3  [module_declaration]  ';  X4  [repeat statement]  'endmodule 
    by
        Seq  [ . E1 ] 
end function

function normalise_ignore_by3_module_statement2 E1  [module]
    replace  [module *]
        Seq  [module *] 
    deconstruct E1
        X3  [module_declaration]  ';  X4  [repeat statement]  'endmodule 
    construct E2  [module]
        X3  ';  'endmodule 
    by
        Seq  [ . E2 ] 
end function

function normalise_ignore_by4_module_statement2
    replace  [program]
        P1  [ program ] 
    construct List1  [module *]
        _  [ ^  P1 ] 
    construct List2  [module *]
        _  [normalise_ignore_by3_module_statement2  each  List1]  [normalise_ignore_by2_module_statement2  each  List1]
 
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
        Prg  [ normalise_ignore_by4_module_statement2 ]  [ normalise_list_module_declaration_part_module_declaration ] 
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

