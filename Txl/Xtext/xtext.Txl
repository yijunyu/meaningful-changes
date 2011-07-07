include "txl.grm"
include "Xtext/xtext.grm"

redefine program
  [xtext] | ...
end define

function expression2statement E [expr]
  replace [statement*] _ [statement*]
  by _
end function

function expression2LoT E [expr]
  replace [literalOrType*] LoT0 [literalOrType*]
  deconstruct E T [term]
  deconstruct T I [xtext_literal]
%  deconstruct I S [stringlit] [print]
%  construct L [quotedLiteral] _ [parse S]
%  construct LoT [literalOrType] L
%  by _ [. LoT0] [. LoT][print]
  by _
end function

function expression2LoT1 E [expr]
  replace [literalOrType*] LoT0 [literalOrType*]
  deconstruct E T [term]
  deconstruct T Q [qname] O [assign_op] I [id] 
  construct d_T [term] T [print]
%  deconstruct I S [stringlit]
%  construct S_L [stringlit] _ [+ "'"] [+ S] [print]
%  construct LoT [literalOrType] _ [parse]
  by _ [. LoT0] %[. LoT]
end function

function rule2statement R [grammar_rule]
  replace [statement*] _ [statement*]
  deconstruct R
  	E [opt 'enum] I [id] Ret [opt returns] ': Ex [expr*] '; 
  construct T [typeid] I
  construct SS [statement*] _ [expression2statement each Ex]
  construct LoT [literalOrType*] _ [expression2LoT each Ex] [expression2LoT1 each Ex]
  construct S [statement]
	'define T 
		LoT
	'end 'define
  by
	_ [. S] [. SS]
end function

function main
 replace [program] P [program]
 deconstruct P X [xtext]
 deconstruct X
  G [grammar] I [opt import_stmt] Gen [generate] R [grammar_rule*] T [terminal_rule*]
 construct P1 [statement*] _ [rule2statement each R]
 by P1
end function
