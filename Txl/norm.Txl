include "mct.grm"
#ifdef DEFINE
include "include_all.txl"
include "redefine2define.txl"
#endif
include "mct-util.txl"
include "mct-ordered.txl"
include "mct-ignored.txl"
include "mct-preferred.txl"
include "mct-kept.txl"
%
% Process all the [list Foo] or [repeat Foo] in the redefine statements
%
#ifdef DEFINE
function DS_replace DS [defineStatement]
#else
function DS_replace DS [redefineStatement]
#endif
 replace [statement*] S0 [statement*]
 construct T1 [typeSpec*] _ [^ DS]
 construct S1 [statement*] _ [typeSpec_repeat DS each T1]
 construct S2 [statement*] _ [typeSpec_repeat_byField DS each T1]
 construct S3 [statement*] _ [typeSpec_list_byField DS each T1]
 construct S4 [statement*] _ [typeSpec_list DS each T1]
 construct S5 [statement*] _ [typeSpec_ignore_when DS each T1]
 construct S6 [statement*] _ [typeSpec_ignore DS each T1]
 construct S7 [statement*] _ [typeSpec_preferred_withField DS each T1]
 construct S [statement*] S0 [. S1] [. S2] [. S3] [. S4] [. S5] [. S6] [. S7]
 by S
end function

% Normalise all definitions where [list X] or [repeat X] have to be ordered by
% a function.
%
% When the following example definition is encountered,
%
%   redefine X
%   ... [list Foo ordered by Bar] ...
%   end define
%
% A normalisation rule is created to order the occurrence of Foo in the context
% of X.  Here Bar is an optional function to provide user-defined comparison
% function for any two instances of Foo. If Bar is not provided, the comparison
% based on the quote (unparsed) string will be used.
%
% After the generation of the normalisation rules, the TXL grammar is restored
% (by replacing the above rule with the following one).
%
%   redefine X
%   ... [list Foo] ...
%   end define
% 
% And the main function will include the following rules:
%   function main
%       replace [program] P [program]
%       by P [normalise_list_X_Foo]
%   end function
%
% Global variables: 
%
%   Rules [statement*]  %% The rules for normalising the id's
%
%   OrderRuleIDs [id*]	%% The name of the Order normalisation rules
%   KeepRuleIDs [id*]	%% The name of the Keep normalisation rules
%   PreferRuleIDs [id*]	%% The name of the Prefer normalisation rules
%   IgnoreRuleIDs [id*]	%% The name of the Ignore normalisation rules
%
function main 
 replace [program] P [program]
 export Rules [statement*] _
 export OrderRuleIDs [id*] _
 export IgnoreRuleIDs [id*] _
 export PreferRuleIDs [id*] _
 export KeepRuleIDs [id*] _
 export TypeIDs [id*] _
 construct P0 [program] 
      P 
#ifdef DEFINE
	[include_all] 
#endif
	[typeSpec_removeClones] 
#ifdef DEFINE
	[redefine2define]
#endif
 import Rules
 construct Statements_ChangeRule [statement*]
	'keys
	% '<<<<<< is removed from left, '>>>>>> is added to right
		'... '<<<<<< '>>>>>> 
#ifdef LINENO
		'# 'line
#endif
	'end 'keys
	'compounds
		'... '<<<<<< '>>>>>>
	'end 'compounds
	'define Change
		'[ 'NL '] '<<<<<< '['opt 'stringlit'] '[ 'NL '] 
	     '| '[ 'NL '] '>>>>>> '['opt 'stringlit'] '[ 'NL '] 
	'end 'define
#ifdef LINENO_XYZ
	'define 'coordinates
		'line '[ 'srcfilename '] '[ 'srclinenumber '] '[ 'NL ']
	'end 'define
#endif
 export Rules _ [. Statements_ChangeRule] [. Rules]
 import KeepRuleIDs
 import TypeIDs
 import Rules
 deconstruct P0 S_P0 [statement*] 
 construct P0_1 [statement*] _ [. S_P0] [. Rules] 
 construct P0_2 [program] P0_1 
#ifdef DEFINE
 construct P0_3 [program] P0_2 [redefine2define]
 construct DSS [defineStatement*] _ [^ P0_3]
#else
 construct DSS [redefineStatement*] _ [^ P0_2] 
#endif
 construct S [statement*] _ [DS_replace each DSS]
 construct PL [literalOrExpression*] 'Prg
 import OrderRuleIDs
 import IgnoreRuleIDs
 import PreferRuleIDs
 construct lOfE_NormaliseRuleIDs [literalOrExpression*]
	_ [id_to_type each IgnoreRuleIDs]
	  [id_to_type each PreferRuleIDs]
	  [id_to_type each OrderRuleIDs]
 construct lOfE_KeepRuleIDs [literalOrExpression*] _ [id_to_type each KeepRuleIDs]
 construct lOfE_Normalise [literalOrExpression*] _ [. PL] [. lOfE_NormaliseRuleIDs ]
 construct lOfE_RemoveClone [literalOrExpression*] _ [. PL] [. lOfE_KeepRuleIDs ]
 construct R_Normalise [replacement] lOfE_Normalise
 construct R_RemoveClone [replacement] lOfE_RemoveClone
 construct statements_Rule [statement*]
 	'function 'program_normalise 'replace '[ 'program '] 'Prg '[ 'program '] 
	  'by R_Normalise
	'end 'function
 	'function 'program_remove_clone 'replace '[ 'program '] 'Prg '[ 'program '] 
    	  'export 'CloneNumber '['number'] '0
	  'import 'TXLargs '[ 'repeat 'stringlit ']
	  'deconstruct '* 'TXLargs
		"-diff" 'Filename '[ 'stringlit ']
	  'construct 'P2 '[ 'program '] _ '[ 'read 'Filename '] '[ 'program_normalise ']
	  'export 'Program_Diff '['program'] 'P2
	  'by R_RemoveClone
	'end 'function
	'redefine 'program '... '| '[ 'empty '] '| '[ 'attr 'number '] 'end 'define
	'function 'print_diff_1
		'replace '[ 'program '] 'Prg '[ 'program ']
		'import 'TXLinput '[ 'stringlit ']
		'construct 'Str_TmpFile '[ 'stringlit '] 'TXLinput '['+ ".tmp" ']
		'construct 'Str_RmTmpFile '[ 'stringlit '] '_ '[ '+ "/bin/rm -f " '] '[ '+ 'Str_TmpFile ']
		'construct 'P2 '['program'] 'Prg '[ 'write 'Str_TmpFile '] '[ 'read 'Str_TmpFile '] '[ 'system 'Str_RmTmpFile '] 
		'construct 'S_Diff '['stringlit'] '_ '['quote 'P2 ']
		'where 'not 'S_Diff '['= "" ']
		'by 'Prg
	'end 'function
	'function 'print_diff_2
		'replace '[ 'program '] 'Prg '[ 'program ']
		'import 'TXLinput '[ 'stringlit ']
		'construct 'Str_TmpFile '[ 'stringlit '] 'TXLinput '['+ ".tmp" ']
		'construct 'Str_RmTmpFile '[ 'stringlit '] '_ '[ '+ "/bin/rm -f " '] '[ '+ 'Str_TmpFile ']
		'construct 'P2 '['program'] 'Prg '['program_normalise'] '[ 'write 'Str_TmpFile '] '[ 'read 'Str_TmpFile '] '[ 'system 'Str_RmTmpFile '] 
		'construct 'S_Diff '['stringlit'] '_ '['quote 'P2 ']
		'where 'S_Diff '['= "" ']
		'by '_
	'end 'function
	'function 'print_diff
		'replace '[ 'program '] 'P_diff '[ 'program ']
		'import 'CloneNumber '[ 'number ']
		'import 'Program_Diff '[ 'program ']
		'where 'CloneNumber '[ '> '0 ']
		'% output the differences
		'construct 'P_Clone '[ 'program '] 'CloneNumber
		'construct 'P_Left '['program'] 'P_diff '[print_diff_1'] '[print_diff_2'] 
#ifdef NO_CLONE
'['print']
#else
'['printattr']
#endif
		'construct 'P_Right '['program'] 'Program_Diff '[print_diff_1'] '[print_diff_2']
#ifdef ATTR
'['printattr']
#else
'['print']
#endif
		'by 'P_Clone
	'end 'function
	'function 'main 'replace '[ 'program '] 'Prg '[ 'program '] 
	  'export 'Program_Diff '['program'] '_
	  'export 'Program '['program'] 'Prg
	  'by 'Prg '[ 'program_normalise ']
		   '[ 'program_remove_clone ']
		   '[ 'print_diff ']
	'end 'function
 deconstruct P0 S0 [statement*]
 import Rules
 construct P1 [program] S0 [. Rules] 
[. statements_Rule ] 
 by  P1 
#ifdef DEFINE
	[redefine2define]
#endif
	[typeSpec_eliminateKeptAnnotations] 
	[typeSpec_eliminateOrderedAnnotations]
	[typeSpec_eliminateIgnoredAnnotations]
	[typeSpec_eliminatePreferredAnnotations]
end function

% Yijun Yu: TXL program is hard to read, some conventions I try to adopt: 
%%%% Variable names:
%   Type_VariableName, or more commonly 
%   T<number>? where T is the abbreviation of the Type name (often the
%	first letter) and the <number> is to differentiate the variables
%	function/rule names   type_FunctionName
%   d_VariableNameAbove -- for debug purposes:
%	construct d_VariableNameAbove [Type] VariableNameAbove [print]
%%%% Function names, except for `main' whose type is always [program]:
%   function type_FunctionName ...
%     replace [type] FunctionName [type]
%     by _
%   end function

