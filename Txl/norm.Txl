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
include "mct-meta.txl"
#ifdef PROMPT
include "mct-prompt.txl"
#endif
#ifdef ID
include "mct-id.txl"
#endif

rule typeSpec_eliminateAnnotations
 replace * [typeSpec] T [typeSpec] 
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] K [opt kept] O [opt orderedBy] Ig [opt ignoredWhen] P [opt preferredWith]
 deconstruct not T M I R
 by M I R
end rule

rule mct_eliminateAnnotations
 replace [statement*] T [MCT_annotate] Rest [statement*]
 by Rest
end rule

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
 construct S7 [statement*] _ [typeSpec_preferred_withLiterals DS each T1] [typeSpec_preferred_withRuleApplications DS each T1]
#ifdef ID
 construct S8 [statement*] _ [typeSpec_id DS]
#endif
 construct S [statement*] S0 [. S1] [. S2] [. S3] [. S4] [. S5] [. S6] [. S7]
#ifdef ID
	[. S8]
#endif
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
%   IdRuleIDs [id*]	%% The name of the Ignore normalisation rules
%
function main 
 replace [program] P [program]
 export Rules [statement*] _
 export OrderRuleIDs [id*] _
 export IgnoreRuleIDs [id*] _
 export PreferRuleIDs [id*] _
 export KeepRuleIDs [id*] _
#ifdef ID
 export IdRuleIDs [id*] _
#endif
 export TypeIDs [id*] _
 construct P0 [program] 
      P 
#ifdef DEFINE
	[include_all] 
	[redefine2define]
#endif
        [metaAnnotation] 
#ifdef DEBUG_META
	[print]
#endif
	[mct_eliminateAnnotations] % [print]
	[typeSpec_removeClones]
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
#ifdef ID
 import IdRuleIDs
#endif
 construct lOfE_NormaliseRuleIDs [literalOrExpression*]
	_ [id_to_type each IgnoreRuleIDs]
	  [id_to_type each PreferRuleIDs]
	  [id_to_type each OrderRuleIDs]
#ifdef ID
	  [id_to_type each IdRuleIDs]
#endif
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
		'['printattr']
		'construct 'P_Right '['program'] 'Program_Diff '[print_diff_1'] '[print_diff_2']
		'['printattr']
		'by 'P_Clone
	'end 'function
#ifdef ID
	'redefine 'program 
		'...  '| '[ 'id_nl '* ']
	'end 'define
	'define 'id_nl
   		'['id'] '['id'] '['NL']
	'end 'define
	'function 'id2id_nl 'T '['id']
  		'replace '['id_nl'*'] 'V '['id_nl'*'] 
		'construct 'V2 '['id_nl'*'] 'T 'T
		'by '_ '['. 'V'] '['. 'V2'] 
	'end 'function
	'function 'exportIds
    		'replace '['program'] 'Prg '['program']
		'construct 'I '['id'*'] '_ '['^ 'Prg '] 
    		'construct 'I2 '['id_nl'*'] '_ '['id2id_nl 'each 'I']
    		'by 'I2
	'end 'function
#endif
	'function 'main 'replace '[ 'program '] 'Prg '[ 'program '] 
	  'export 'Program_Diff '['program'] '_
	  'export 'Program '['program'] 'Prg
	  'by 'Prg '[ 'program_normalise ']
		   '[ 'program_remove_clone ']
		   '[ 'print_diff ']
#ifdef ID
		   '[ 'exportIds ']
#endif
	'end 'function
 deconstruct P0 S0 [statement*]
 import Rules
 construct P1 [program] S0 [. Rules] 
[. statements_Rule ] 
 by  P1 
#ifdef DEFINE
	[redefine2define]
#endif
#ifdef PROMPT
	[promptTerms]
#endif
	[typeSpec_eliminateAnnotations] 
end function
