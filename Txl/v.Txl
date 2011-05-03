#pragma -width 1024 -id "`?" 
tokens
    space  "[ \t]+"
    newline  "\n" | "" | "\n"
    id  "[$\u][$\i]*" | "[$\u][$\i]*\?[bdh][\dabcdefABCDEF]+" 
    number  "\d+[lL]?"   % DecimalIntegerLiteral | OctalIntegerLiteral 
          | "\d+\?[bdh][\dabcdefABCDEF]+"
          | "\d+[bdh][\dabcdefABCDEF]+"
%          | "\d+.\d*([eE][+-]?\d+)?[fFdD]?"  % DecimalFloatingPointLiteral
%          | ".\d+([eE][+-]?\d+)?[fFdD]?"  % DecimalFloatingPointLiteral (cont.'d)
%          | "\d+[eE][+-]?\d+[fFdD]?"  % DecimalFloatingPointLiteral (cont.'d)
%          | "\d+([eE][+-]?\d+)?[fFdD]"  % DecimalFloatingPointLiteral (cont.'d)
%          | "0[xX][\dabcdefABCDEF]+.[pP][+-]?\d+[fFdD]?"  % HexadecimalFloatingPointLiteral
%          | "0[xX][\dabcdefABCDEF]*.[\dabcdefABCDEF]+[pP][+-]?\d+[fFdD]?"  % HexadecimalFloatingPointLiteral (cont.'d)
%          | "0[xX][\dabcdefABCDEF]+([pP][+-]?\d+)?[lLfFdD]?"  % HexIntegerLiteral | HexadecimalFloatingPointLiteral (cont.'d)
end tokens

comments
    //
    /*  */
end comments

compounds
    !=  '%=  &&  &=  *=  ++  +=   --  -=  /=  ^=  |=  || <<  <<=  <=  ==  >=   ...
end compounds

keys
    'module 'endmodule 'begin 'end 'fork 'join 'specify 'endspecify 'if 'else 'while 'for 'forever 'repeat
    'wait 'case 'casex 'default 'endcase 'function 'endfunction 'task 'endtask 'generate 'endgenerate 'input
    'output 'inout 'integer 'wire 'reg 'event 'genvar 'real 'parameter 'signed '\\\\ '( ') '{ '} '[ '] '; '#
    '@ '$ ', ': '= 'ns 'ps '/ '^ '! '| '.
    'always 'or 
    '`include '`define '`ifdef '`else '`endif '`timescale '? 
end keys

define program
      [module*]
    | [empty]
end define

define macro
    '`include | '`define | '`ifdef | '`else | '`endif | '`timescale
end define

define time_unit
    'ns 'ps
end define

define macro_statement
    [macro] [number] 'ns '/ [number] 'ps [NL]
   |[macro] [opt id] [opt expr] [NL]
   |[macro] [opt id] [opt subrange] [NL]
end define

define module
      [module_declaration] '; [NL]
      [repeat statement] [NL]
      'endmodule 
    | [macro_statement]
end define

define module_declaration
    'module [id] '( [list part_module_declaration] ') 
end define

define part_module_declaration
    [macro_statement*] [id] [macro_statement*]
end define


define statement
  [declaration] [opt ';] [NL]
end define

define declaration
    [parameter_specification]
  | [variable_declaration] 
  | [variable_assignment_statement]
  | [if_statement]
  | [case_statement]
  | [block_statement]
  | [qualified_expression]
  | [component_configuration]
  | [function_decl]
end define

redefine declaration
  [macro_statement*] ...
end define

redefine declaration
  ...[macro_statement*] 
end define

define variable_declaration
    [variable_type] [opt range] [list var] 
end define

define var
   [id] [opt range] 
 | [id] '= [expr]
end define

define parameter_specification
    'parameter [id] '= [number] 
end define

define variable_type
    'input | 'output | 'reg | 'wire
end define

define variable_assignment_statement
    [expr] '= [expr]
  | 'assign [expr] [opt range] '= [expr]
end define

define block_statement
   'begin [NL] [IN]
	[statement*] [EX]
   'end
end define

define function_call
    [id] [list id] 
end define

define function_decl
    [id] '( [list id] ')
end define

define if_statement
    'if '( [expr] ')[NL][IN]
	[statement][EX]
    [opt else_statement]
end define

define else_statement
    'else [NL][IN]
	[statement][EX]
end define


define case_statement
   'case '( [expr] ')
     [case_statement_alternative*]
   'endcase
end define

define case_statement_alternative
   [list choice]  ': [statement*]
end define
%define choices
%end define

define choice
     [number]
   | [id]
   | 'default
end define

define subrange
    [expr] ': [expr] 
end define

define range
    '[ [expr] ': [expr] ']
end define

define expr
   [simple_expression]
  | '( [simple_expression] ')
end define

define shift_expression
  [expr] '<= '# [number] [expr]
end define

define simple_expression
     [id] 
   | [id] ' 'd [number]
   | [stringlit]
   | [shift_expression]
   | [number] [opt time_unit]
   | [id] '[ [expr] ']
   | [id] '[ [subrange] ']
   | [u_op] [simple_expression] 
   | [simple_expression] [op] [simple_expression] 
   | [simple_expression] '? [simple_expression] ': [simple_expression] 
   | '{ [list expr] '}
   | [function_call]
end define

define qualified_expression
   'always '@ '( [expr] ') [statement]
  | [expr]
end define

define u_op
 '~| '^| '!
end define

define op
    '+ | '- | '/ | '<= | 'or | '==  | '& | '| | '!= | '|| | '&&
end define

define component_configuration
 [id] '# '( [id] ') [id] '( [list component_declaration] ')
end define

define component_declaration
 [SPOFF] '. [id] [SPON] '( [id] ')
end define

%define void
%end define
%define actual_part
%end define
%define aggregate
%end define
%define alias_declaration
%end define
%define alias_designator
%end define
%define allocator
%end define
%define architecture_body
%end define
%define architecture_declarative_part
%end define
%define architecture_statement_part
%end define
%define unconstrained_nature_definition
%end define
%define constrained_nature_definition
%end define
%define assertion
%end define
%define assertion_statement
%end define
%define association_element
%end define
%define association_list
%end define
%define attribute_declaration
%end define
%define attribute_name
%end define
%define attribute_specification
%end define
%define binding_indication
%end define
%define block_configuration
%end define
%define block_declarative_part
%end define
%define block_header
%end define
%define block_specification
%end define
%define block_statement_part
%end define
%define break_statement
%end define
%define break_list
%end define
%define break_element
%end define
%define component_instantiation_statement
%end define
%define component_specification
%end define
%define composite_type_definition
%end define
%define concurrent_assertion_statement
%end define
%define concurrent_procedure_call_statement
%end define
%define concurrent_signal_assignment_statement
%end define
%define conditional_signal_assignment
%end define
%define conditional_waveforms
%end define
%define configuration_declaration
%end define
%define configuration_declarative_part
%end define
%define configuration_specification
%end define
%define constant_declaration
%end define
%define constrained_array_definition
%end define
%define context_clause
%end define
%define terminal_declaration
%end define
%define terminal_aspect
%end define
%define delay_mechanism
%end define
%define design_file
%end define
%define design_unit
%end define
%define direction
%end define
%define disconnection_specification
%end define
%define element_declaration
%end define
%define entity_aspect
%end define
%define entity_class_entry
%end define
%define entity_class_entry_list
%end define
%define entity_declaration
%end define
%define nature_declaration
%end define
%define subnature_declaration
%end define
%define subnature_indication
%end define
%define entity_declarative_part
%end define
%define entity_designator
%end define
%define entity_header
%end define
%define entity_name_list
%end define
%define entity_specification
%end define
%define entity_statement_part
%end define
%define entity_tag
%end define
%define enumeration_literal
%end define
%define enumeration_type_definition
%end define
%define exit_statement
%end define
%define relation
%end define
%define factor
%end define
%define file_declaration
%end define
%define file_open_information
%end define
%define formal_parameter_list
%end define
%define full_type_declaration
%end define
%define function_call
%end define
%define generate_statement
%end define
%define concurrent_break_statement
%end define
%define generation_scheme
%end define
%define generic_clause
%end define
%define group_constituent
%end define
%define group_constituent_list
%end define
%define group_template_declaration
%end define
%define group_declaration
%end define
%define guarded_signal_specification
%end define
%define identifier
%end define
%define identifier_list
%end define
%define incomplete_type_declaration
%end define
%define index_constraint
%end define
%define index_specification
%end define
%define index_subtype_definition
%end define
%define indexed_name
%end define
%define instantiated_unit
%end define
%define instantiation_list
%end define
%define interface_constant_declaration
%end define
%define interface_terminal_declaration
%end define
%define interface_quantity_declaration
%end define
%define interface_file_declaration
%end define
%define interface_list
%end define
%define interface_signal_declaration
%end define
%define interface_variable_declaration
%end define
%define iteration_scheme
%end define
%define literal
%end define
%define logical_name_list
%end define
%define loop_statement
%end define
%define mode
%end define
%define name
%end define
%define nature_element_declaration
%end define
%define next_statement
%end define
%define null_statement
%end define
%define operator_symbol
%end define
%define options_
%end define
%define package_body
%end define
%define package_body_declarative_part
%end define
%define package_declaration
%end define
%define package_declarative_part
%end define
%define physical_literal
%end define
%define physical_type_definition
%end define
%define port_clause
%end define
%define port_map_aspect
%end define
%define prefix
%end define
%define procedure_call
%end define
%define procedure_call_statement
%end define
%define process_declarative_part
%end define
%define process_statement
%end define
%define process_statement_part
%end define
%define record_nature_definition
%end define
%define record_type_definition
%end define
%define report_statement
%end define
%define return_statement
%end define
%define scalar_nature_definition
%end define
%define secondary_unit_declaration
%end define
%define selected_name
%end define
%define selected_signal_assignment
%end define
%define selected_waveforms
%end define
%define sensitivity_list
%end define
%define sequence_of_statements
%end define
%define simple_expression
%end define
%define sign
%end define
%define signal_assignment_statement
%end define
%define signal_declaration
%end define
%define signal_kind
%end define
%define signal_list
%end define
%define signature
%end define
%define term
%end define
%define slice_name
%end define
%define subprogram_body
%end define
%define subprogram_declarative_part
%end define
%define subprogram_specification
%end define
%define subprogram_statement_part
%end define
%define subtype_declaration
%end define
%define subtype_indication
%end define
%define free_quantity_declaration
%end define
%define branch_quantity_declaration
%end define
%define source_quantity_declaration
%end define
%define across_aspect
%end define
%define through_aspect
%end define
%define source_aspect
%end define
%define type_conversion
%end define
%define unconstrained_array_definition
%end define
%define use_clause
%end define
%define wait_statement
%end define
%define waveform
%end define
%define waveform_element
%end define
%define simultaneous_statement_part
%end define
%define simple_simultaneous_statement
%end define
%define simultaneous_if_statement
%end define
%define simultaneous_case_statement
%end define
%define simultaneous_alternative
%end define
%define simultaneous_procedural_statement
%end define
%define procedural_declarative_part
%end define
%define procedural_statement_part
%end define
%define simultaneous_null_statement
%end define
%define shared_variable_declaration
%end define
%define error_skipto
%end define

function main
  replace [program] P [program] 
  by P
end function
