% Author: Yijun Yu
% Purpose: convert Trac Wiki into LaTeX
#pragma -comment -w 1024
include "Trac/trac.grm"

% We introduce nested sections before the transformation
%define nest_level
%   [number]
%end define
%
%redefine section_title
%   ... |
%   '= [title] '= [attr nest_level]
%end define

define program
      [trac]
end define

include "LaTeX/latex.grm"

redefine program
    ... | [latex]
end define

function main
    replace [program]
	P [program]
    by 
	P [latex_sentence] [latex] 
end function

redefine bullet
    ... | [latex_item]
end define

redefine indent
    ... | [latex_begin_itemize] | [latex_begin_enumerate]
end define

redefine dedent
    ...| [latex_end_itemize] | [latex_end_enumerate]
end define

function latex_sentence
    replace [program] P [program]
    construct W1 [bullet] 'ENUM
    construct X1 [bullet] 'BULLET
    construct Y1 [bullet] '\ 'item 
    construct W2 [indent] 'ENUMINDENT 
    construct X2 [indent] 'INDENT 
    construct Y2 [indent] '\ 'begin '{ 'itemize '}
    construct Z2 [indent] '\ 'begin '{ 'enumerate '}
    construct W3 [dedent] 'ENUMDEDENT
    construct X3 [dedent] 'DEDENT
    construct Y3 [dedent] '\ 'end '{ 'itemize '}
    construct Z3 [dedent] '\ 'end '{ 'enumerate '}
    by P [replace_enumerate]
         [$ W1 Y1][$ X1 Y1]
	 [$ X2 Y2][$ X3 Y3]
         [$ W2 Z2][$ W3 Z3]
end function

function replace_enumerate
    replace * [itemize] I [itemize]
    deconstruct I _ [attr 'INDENT] Items [item*] _ [attr 'DEDENT] 
    where Items [is_enum]
    by '\ 'begin '{ 'enumerate '} Items '\ 'end '{ 'enumerate '}
end function

function is_enum
    match [item*] Items [item*]
    deconstruct Items I1 [item] Rest [item*]
    where not Rest [is_enum]
    deconstruct I1 _ [attr 'ENUM] _ [id_or_macro*] 
end function
    
function latex
    replace [program] P [program]
%                    construct d_P [program] P [print]
	     construct DC1 [opt latex_docclass] '\ 'documentclass '[ '10pt, 'twocolumn '] {'article}
     construct DC [opt latex_docclass] DC1 [already_contains_docclass P]
     construct DU [sentence*] _ [preamble P]
     construct DT [opt latex_title] _ [latex_title P]
	     construct DB1 [opt latex_begindoc] '\ 'begin {'document}
     construct DB [opt latex_begindoc] DB1 [already_contains_begindoc P]
     	     construct LM1 [latex_maketitle*] '\ 'maketitle
     construct LM [latex_maketitle*] LM1 [already_contains_maketitle P]
     construct DM [latex_maketitle*] LM [has_title P]
     construct DA [opt latex_abstract] _ [abstract P]
     construct DS [latex_section*] _ [sections P]
     	     construct DE1 [opt latex_enddoc] '\ 'end {'document}
     construct DR [sentence*] _ [reference P]
     construct DE [opt latex_enddoc] DE1 [already_contains_enddoc P]
    by 
      DC DU DT DB DM DA DS DR DE
end function

% remove all the comments in the trac wiki 
rule remove_comment
    replace * [id_or_macro] I [id_or_macro]
    deconstruct I _ [comment]
    by 
	_
end rule

% don't construct the documentclass macro if it has only one comment sentence
function already_contains_docclass P [program] 
     					% construct d_P [program] P[print]
    replace [opt latex_docclass] DC1 [opt latex_docclass]
    construct P_new [comment*] _ [^ P ] [write "t"]
	      [system "echo \" $(grep documentclass t) \"> t1"] 
    construct q_P [stringlit] _ [read "t1"] 
    construct S [stringlit] _ [+ '\] [+ 'documentclass]
    where q_P [grep S]
    by _
end function

% don't construct the \begin{document} macro if it is already part of the comments
function already_contains_begindoc P [program] 
    replace [opt latex_begindoc] DB1 [opt latex_begindoc]
    construct P_new [comment*] _ [^ P ] [write "t"]
	      [system "echo \" $(grep document t) \"> t1"] 
    construct q_P [stringlit] _ [read "t1"] 
    construct S [stringlit] _ [+ '\] [+ 'begin] [+ '{] [+ 'document] [+ '}]
    where q_P [grep S]
    by _
end function

function already_contains_maketitle P [program] 
    replace [latex_maketitle*] DB1 [latex_maketitle*]
    construct P_new [comment*] _ [^ P ] [write "t"]
	      [system "echo \" $(grep maketitle t) \"> t1"] 
    construct q_P [stringlit] _ [read "t1"] 
    construct S [stringlit] _ [+ '\] [+ 'maketitle]
    where q_P [grep S]
    by _
end function

% don't construct the \end{document} macro if it is already part of the comments
function already_contains_enddoc P [program] 
    replace [opt latex_enddoc] DB1 [opt latex_enddoc]
    construct P_new [comment*] _ [^ P ] [write "t"]
	      [system "echo \" $(grep document t) \"> t1"] 
    construct q_P [stringlit] _ [read "t1"] 
    construct S [stringlit] _ [+ '\] [+ 'end] [+ '{] [+ 'document] [+ '}]
    where q_P [grep S]
    by _
end function

% \begin{abstract} ... \end{abstract}
function abstract P [program]
    replace [opt latex_abstract] _ [opt latex_abstract]
    deconstruct * [section] P
	'== 'Abstract '== S2 [sentence*]
    by 
	  '\ 'begin {'abstract}
		S2
	  '\ 'end {'abstract} 
end function

function preamble P [program]
    replace [sentence*] _ [sentence*]
    deconstruct * [section] P
	'== 'Preamble '== S2 [sentence*]
    by 
		S2
end function

function reference P [program]
    replace [sentence*] _ [sentence*]
    deconstruct * [section] P
	'== 'References '== S2 [sentence*]
    by 
		S2
end function

% = TITLE = 
% {{{ AUTHOR }}}
function latex_title P [program]
    replace [opt latex_title] _ [opt latex_title]
    deconstruct * [section] P
	'= Title [title] '= Authors [sentence*]
    by 
	  '\ 'title { Title } 
	  '\ 'author '{ Authors '}
end function

function sections P [program]
    replace [latex_section*] S [latex_section*]
    construct SS [section*] _ [^ P]
    deconstruct SS S1 [section] S2 [section*]
% 				    construct d_S1 [section] S1 [print]
    deconstruct S1 ST [opt section_title] PP [sentence*]
%    				    construct d_ST [opt section_title] ST [print]
    construct TT [opt latex_section_title] _ [section_title ST S1]
    construct T1 [latex_section] TT PP
%    				    construct d_T1 [latex_section] T1 [print]
    construct TTA [latex_section*] _ [. T1] [is_not_preamble S1] [is_not_abstract S1] [is_not_title S1] [is_not_reference S1]
    construct P2 [program] S2
    construct T2 [latex_section*] _ [sections P2]
    construct T [latex_section*] _ [. TTA] [. T2]
    by T
end function

function section_title ST [opt section_title] S [section]
    replace [opt latex_section_title] _ [opt latex_section_title]
    construct ST_all [section_title*] _ [^ ST]
    deconstruct ST_all ST1 [section_title] ST2 [section_title*]
    construct T_all [title*] _ [^ ST]
    deconstruct T_all ST_t [title] _ [title*]
    construct M [latex_section_macro] 'section
    construct M1 [latex_section_macro] M [markup ST2]
    construct T1 [opt latex_section_title] '\ M1 { ST_t } 
    by T1
end function

function is_not_preamble S1 [section]
    deconstruct S1
	'== 'Preamble '== S2 [sentence*]
    replace [latex_section*] _ [latex_section*] by _
end function

function is_not_reference S1 [section]
    deconstruct S1
	'== 'References '== S2 [sentence*]
    replace [latex_section*] _ [latex_section*] by _
end function

function is_not_abstract S1 [section]
    deconstruct S1
	'== 'Abstract '== S2 [sentence*]
    replace [latex_section*] _ [latex_section*] by _
end function

function has_title P [program]
    construct SS [section*] _ [^ P]
    deconstruct not * [section] SS
	'= Title [title] '= Authors [sentence*]
    replace [latex_maketitle*] _ [latex_maketitle*] by _
end function

function is_not_title S1 [section]
    deconstruct S1
	'= Title [title] '= Authors [sentence*]
    replace [latex_section*] _ [latex_section*] by _
end function

% == SECTION ==
% === SUBSECTION ===
% ==== SUBSUBSECTION ====
% ...
function markup L [section_title*]
    replace [latex_section_macro] M [latex_section_macro]
    deconstruct L L1 [section_title] L2 [section_title*]
    construct E [section_title*] _
    where not L2 [= E]
    construct M2 [latex_section_macro] M [markup L2]
    deconstruct M2 M2_section [latex_section_macro]
    construct M1 [latex_section_macro] 'sub M2_section
    by M1
end function
