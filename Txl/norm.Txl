include "txl.grm"
% Yijun Yu: adapted from grm.txl by inserting the following pragma after 'list
% or 'repeat: 'ordered ['by '[ name '] ]
%
keys
  'ordered 'by 'ignored 'when 'kept 'preferred 'with
end keys
redefine typeSpec
	... [opt kept] [opt orderedBy] [opt ignoredWhen] [opt preferredWith]
end define
define ignoredWhen 'ignored [opt whenField] 
end define
define preferredWith 'preferred 'with [literal+] 
end define
define orderedBy 'ordered [opt byField] 
end define
define kept 'kept 
end define
define whenField 'when [id] 
end define
define byField 'by [id] | 'by [typeModifier] 
end define

rule typeSpec_eliminateKeptAnnotations
 replace * [typeSpec] T [typeSpec] 
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] 
	K [kept] 
 by M I R
end rule

rule typeSpec_eliminateOrderedAnnotations
 replace * [typeSpec] T [typeSpec] 
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] K [opt kept]
	O [orderedBy] 
 by M I R
end rule

rule typeSpec_eliminateIgnoredAnnotations
 replace * [typeSpec] T [typeSpec] 
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] K [opt kept] O [opt orderedBy] 
	Ig [ignoredWhen] 
 by M I R
end rule

rule typeSpec_eliminatePreferredAnnotations
 replace * [typeSpec] T [typeSpec] 
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] K [opt kept] O [opt orderedBy] Ig [opt ignoredWhen] 
 	P [preferredWith]
 by M I R
end rule

%
% Auxiliary function
%
function contains Object  [any]
    match  *  [any]
        Object 
end function
%
% Construct rules to eliminate all clones in type T 
%
rule typeSpec_removeClones
 replace * [typeSpec] T [typeSpec] 
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] 'kept O [opt orderedBy] Ig [opt ignoredWhen]
 construct T1 [typeSpec] M I R O Ig
 construct update_id_T1 [typeSpec] T1 [update_id I]
 by T1 
end rule
%
% Update ID is a subroutine with no effect on the typeSpec transformation itself, but will introduce new 
% rules into the program
%
% Check the TypeIDs to avoid creating duplicate type rules
%
function update_id I [typeid]
 import Rules [statement*]
 import KeepRuleIDs [id*]
 import IgnoreRuleIDs [id*]
 import TypeIDs [id*]
 match [typeSpec] T [typeSpec]
 deconstruct I TypeID [id] 
 where not TypeIDs [contains TypeID]
 construct find_replace [id] 'find_replace
 construct mark_clones [id] 'mark_clones
 construct find_clones [id] 'find_clones
 construct add_if_clones [id] 'add_if_clones
 construct find_replace_I [id] find_replace [_ TypeID]
 construct mark_clones_I [id] mark_clones [_ TypeID]
 construct find_clones_I [id] find_clones [_ TypeID]
 construct add_if_clones_I [id] add_if_clones [_ TypeID]
 construct S1 [statement*]
     'redefine TypeID 
         '... 
      '| '[ 'empty '] 
     'end 'define
     'function find_replace_I 
	    'replace '[ 'program '] 'P '[ 'program ']
	    'construct 'S '[ TypeID '* '] '_ '[ find_clones_I 'P ']
	    'by 'P '[ mark_clones_I 'each 'S ']
     'end 'function
     'rule mark_clones_I 'S '[ TypeID ']
	    'import 'CloneNumber '['number']
	    'export 'CloneNumber 'CloneNumber '['+ '1']
	    'replace '[ TypeID '] 'S 'by
     'end 'rule
     'function find_clones_I 'P '[ 'program '] 
	    'construct 'S '[ TypeID '* '] '_ '[ '^ 'P ']
	    'replace '[ TypeID '* '] 'by '_ 
	    '[ add_if_clones_I 'S 'each 'S '] 
     'end 'function
     'function add_if_clones_I 'SS '[ TypeID '* '] 'Stmt '[ TypeID ']
	    'deconstruct '* 'SS 'Stmt 'Rest '[ TypeID '* ']
	    'deconstruct '* '[ TypeID '] 'Rest 'Stmt
	    'replace '[ TypeID '* '] 'StructuredClones '[ TypeID '* ']
	    'deconstruct 'not '* '[ TypeID '] 'StructuredClones 'Stmt
	    'by 'StructuredClones '[ '. 'Stmt ']
     'end 'function
 export Rules Rules [. S1] 
 export KeepRuleIDs KeepRuleIDs [. find_replace_I] 
 export TypeIDs TypeIDs [. TypeID] 
end function

%
% Process [repeat Foo ordered by Bar]
%
% Global variables: 
%   Rules [statement*]  %% The rules for normalising the id's
%   OrderRuleIDs [id*]	%% The name of the normalisation rules
%
function typeSpec_repeat DS [redefineStatement] T [typeSpec]
 import Rules [statement*]
 import OrderRuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 'redefine TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
 deconstruct T 'repeat I [typeid] R [opt typeRepeater] O [opt orderedBy] 
 deconstruct O 'ordered 
 construct StrID [id] _ [quote TID]
 deconstruct I TypeID [id] 
 construct ID [id] 'normalise_list
 construct ruleID [id] ID [_ StrID] [_ TypeID]
 construct S [statement*]
    'rule ruleID
	'replace '[ 'repeat I '] 
	   'N1 '[ I '] 'N2 '[ I '] 'Rest '[ 'repeat I '] 
%	   'construct 't1 '[ I '] 'N1 '[ 'write "t.1" '] 
%           'construct 'T1 '[ 'stringlit '] '_ '[ 'fgets "t.1" ']
%	   'construct 't2 '[ I '] 'N2 '[ 'write "t.2" '] 
%           'construct 'T2 '[ 'stringlit '] '_ '[ 'fgets "t.2" ']
           'construct 'T1 '[ 'stringlit '] '_ '[ 'quote 'N1 ']
           'construct 'T2 '[ 'stringlit '] '_ '[ 'quote 'N2 ']
	'where 'T1 '[ '> 'T2 ']
	'by 
	   'N2 'N1 'Rest 
    'end 'rule
 export Rules Rules [. S]
 export OrderRuleIDs OrderRuleIDs [. ruleID]
 by S
end function
function typeSpec_repeat_byField DS [redefineStatement] T [typeSpec]
 import Rules [statement*]
 import OrderRuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 'redefine TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
 deconstruct T 'repeat I [typeid] R [opt typeRepeater] O [opt orderedBy] 
 deconstruct O 'ordered B [opt byField]
 deconstruct B 'by F [id]
 construct StrID [id] _ [quote TID]
 deconstruct I TypeID [id] 
 construct ID [id] 'normalise_list
 construct ruleID [id] ID [_ StrID] [_ TypeID]
 construct S [statement*]
    'rule ruleID
	'replace '[ 'repeat I '] 
	   'N1 '[ I '] 'N2 '[ I '] 'Rest '[ 'repeat I '] 
	'where 'N1 '[ F 'N2 ']
	'by 
	   'N2 'N1 'Rest 
    'end 'rule
 export Rules Rules [. S]
 export OrderRuleIDs OrderRuleIDs [. ruleID]
 by S
end function

%
% Process [list Foo ordered by Bar]
%
% Global variables: 
%   Rules [statement*]  %% The rules for normalising the id's
%   OrderRuleIDs [id*]	%% The name of the normalisation rules
%
function typeSpec_list DS [redefineStatement] T [typeSpec]
 import Rules [statement*]
 import OrderRuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 'redefine TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
 deconstruct T 'list I [typeid] R [opt typeRepeater] O [opt orderedBy] 
 deconstruct O 'ordered
 construct StrID [id] _ [quote TID]
 deconstruct I TypeID [id] 
 construct ID [id] 'normalise_list
 construct ruleID [id] ID [_ StrID] [_ TypeID]
 construct S [statement*]
    'rule ruleID
	'replace '[ 'list I '] 
	   'N1 '[ I '] ', 'N2 '[ I '] ', 'Rest '[ 'list I '] 
%	   'construct 't1 '[ I '] 'N1 '[ 'write "t.1" '] 
%           'construct 'T1 '[ 'stringlit '] '_ '[ 'fgets "t.1" ']
%	   'construct 't2 '[ I '] 'N2 '[ 'write "t.2" '] 
%           'construct 'T2 '[ 'stringlit '] '_ '[ 'fgets "t.2" ']
           'construct 'T1 '[ 'stringlit '] '_ '[ 'quote 'N1 ']
           'construct 'T2 '[ 'stringlit '] '_ '[ 'quote 'N2 ']
	'where 'T1 '[ '> 'T2 ']
	'by 
	   'N2 ', 'N1 ', 'Rest 
    'end 'rule
 export Rules Rules [. S]
 export OrderRuleIDs OrderRuleIDs [. ruleID]
 by S
end function
function typeSpec_list_byField DS [redefineStatement] T [typeSpec]
 import Rules [statement*]
 import OrderRuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 'redefine TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
 deconstruct T 'list I [typeid] R [opt typeRepeater] O [opt orderedBy] 
 deconstruct O 'ordered B [byField]
 deconstruct B 'by F [id]
 construct StrID [id] _ [quote TID]
 deconstruct I TypeID [id] 
 construct ID [id] 'normalise_list
 construct ruleID [id] ID [_ StrID] [_ TypeID]
 construct S [statement*]
    'rule ruleID
	'replace '[ 'list I '] 
	   'N1 '[ I '] ', 'N2 '[ I '] ', 'Rest '[ 'list I '] 
	'where 'N1 '[ F 'N2 ']
	'by 
	   'N2 ', 'N1 ', 'Rest 
    'end 'rule
 export Rules Rules [. S]
 export OrderRuleIDs OrderRuleIDs [. ruleID]
 by S
end function

%
% Ignore the node unconditionally
%
function typeSpec_ignore DS [redefineStatement] T [typeSpec]
 replace [statement*] S [statement*] 
 deconstruct DS 'redefine TID [typeid] 
	LoT [literalOrType*] BLoT [barLiteralsAndTypes*] 'end 'define
 by S [typeSpec_ignore_LoT TID T LoT] 
      [typeSpec_ignore_BLoT TID T each BLoT]
end function
% LoT 
function typeSpec_ignore_LoT TID [typeid] T [typeSpec] LoT [literalOrType*] 
 replace [statement*] S [statement*] 
 deconstruct T TM [typeModifier] I [typeid] R [opt typeRepeater] O [opt orderedBy] Ig [ignoredWhen]
 where LoT [contains T]
 deconstruct Ig 'ignored 
 construct StrID [id] _ [quote TID]
 export Expression [literalOrExpression*] _
 construct TT [type] '[ T ']
 construct Pat [literalOrVariable*] _ [pattern_replacement TT each LoT]
 % import Expression
 construct Pattern [pattern] Pat
 construct Replacement [replacement] Expression
 deconstruct I TypeID [id] 
 construct ID3 [id] 'normalise_ignore_by3
 construct ruleID3 [id] ID3 [_ StrID] [_ TypeID] [!]
 construct ID4 [id] 'normalise_ignore_by4
 construct ruleID4 [id] ID4 [_ StrID] [_ TypeID] [!]
 construct pID [id] TypeID [_ StrID]
 construct S1 [statement*]
    'function ruleID3 'E1 '[ TID ']
    	'replace '[ TID '* '] 'Seq '[ TID '* ']
        'deconstruct 'E1 Pattern
	'construct 'E2 '[ TID '] Replacement
     	'by 'Seq '[ '. 'E2 '] 
    'end 'function
    'function ruleID4
        'replace '[ 'program '] 'P1 '[ 'program '] 
        'construct 'List1 '[ TID '* '] '_ '[ '^ 'P1 '] 
        'construct 'List2 '[ TID '* ']
            '_ '[ ruleID3 'each 'List1 ']
        'construct 'P2 '[ 'program '] 'P1 '[ '$ 'List1 'List2 ']
       'by 'P2
    'end 'function
 import Rules [statement*]
 export Rules Rules [. S1] 
 import IgnoreRuleIDs [id*]
 export IgnoreRuleIDs IgnoreRuleIDs [. ruleID4]
 by S [. S1]
end function
% BLoT
function typeSpec_ignore_BLoT TID [typeid] T [typeSpec] BLoT [barLiteralsAndTypes] 
 replace [statement*] S [statement*] 
 deconstruct BLoT '| LoT [literalOrType*]
 by S [typeSpec_ignore_LoT TID T LoT]
end function

%
% Use the whenField ['ignored 'when F] where F is a user-defined function. In
% the transformed rule, it will be used by the 'where E1 '[ F E2 '] clause to
% select the elements that matches to be ignored, where E1 is the scope of the
% ignored non-terminal and E2 is the ignored non-terminal
%

function typeSpec_ignore_when DS [redefineStatement] T [typeSpec]
 import Rules [statement*]
 import IgnoreRuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 'redefine TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
 deconstruct T TM [typeModifier] I [typeid] R [opt typeRepeater] O [opt orderedBy] Ig [ignoredWhen]
 deconstruct Ig 'ignored W [whenField]
 deconstruct W 'when F [id]
 by S [typeSpec_ignore_when_LoT F TID T LoT] 
      [typeSpec_ignore_when_BLoT F TID T each BLoT]
end function
% LoT 
function typeSpec_ignore_when_LoT F [id] TID [typeid] T [typeSpec] LoT [literalOrType*] 
 replace [statement*] S [statement*] 
 where LoT [contains T]
 construct StrID [id] _ [quote TID]
 export Expression [literalOrExpression*] _
 construct TT [type] '[ T ']
 construct Pat [literalOrVariable*] _ [pattern_replacement_N12 TT each LoT]
 construct Pattern [pattern] Pat
 construct Replacement [replacement] Expression
 deconstruct T TM [typeModifier] I [typeid] R [opt typeRepeater] O [opt orderedBy] Ig [ignoredWhen]
 deconstruct I TypeID [id] 
 construct ID1 [id] 'normalise_ignore_by1
 construct ruleID1 [id] ID1 [_ F] [_ StrID] [_ TypeID] [!]
 construct ID2 [id] 'normalise_ignore_by2
 construct ruleID2 [id] ID2 [_ F] [_ StrID] [_ TypeID] [!]
 construct ID3 [id] 'normalise_ignore_by3
 construct ruleID3 [id] ID3 [_ F] [_ StrID] [_ TypeID] [!]
 construct ID4 [id] 'normalise_ignore_by4
 construct ruleID4 [id] ID4 [_ F] [_ StrID] [_ TypeID] [!]
 construct pID [id] TypeID [_ StrID]
 construct S1 [statement*]
    'function ruleID1 'E1 '[ TID '] 'N1 '[ I ']
    	'replace '[ I '* '] 'Seq '[ I '* ']
        'where 'not 'E1 '[ F 'N1 ']
     	'by 'Seq '[ '. 'N1 '] 
    'end 'function
    'function ruleID2 'E1 '[ TID '] 'N1 '[ I ']
    	'replace '[ I '* '] 'Seq '[ I '* ']
        'where 'E1 '[ F 'N1 ']
     	'by 'Seq 
    'end 'function
    'function ruleID3 'E1 '[ TID ']
    	'replace '[ TID '* '] 'Seq '[ TID '* ']
        'deconstruct 'E1 Pattern
	'construct 'N2 '[ I '*' ] 
		'_ '[ ruleID1 'E1 'each 'N1 ']
		   '[ ruleID2 'E1 'each 'N1 ']
        'construct 'E2  '[ TID '] Expression
     	'by 'Seq '[ '. 'E2 '] 
    'end 'function
    'function ruleID4
        'replace '[ 'program '] 'P1 '[ 'program '] 
        'construct 'List1 '[ TID '* '] '_ '[ '^ 'P1 '] 
        'construct 'List2 '[ TID '* ']
            '_ '[ ruleID3 'each 'List1 ']
        'construct 'P2 '[ 'program '] 'P1 '[ '$ 'each 'List1 'List2 ']
       'by 'P2
    'end 'function
 import Rules [statement*]
 export Rules Rules [. S1] 
 import IgnoreRuleIDs [id*]
 export IgnoreRuleIDs IgnoreRuleIDs [. ruleID4]
 by S [. S1]
end function
%
% BLoT
%
function typeSpec_ignore_when_BLoT F [id] TID [typeid] T [typeSpec] BLoT [barLiteralsAndTypes] 
 replace [statement*] S [statement*] 
 deconstruct BLoT '| LoT [literalOrType*]
 by S [typeSpec_ignore_when_LoT F TID T LoT]
end function

%
% Use annotation 'preferred 'with L where L is a list of user-defined literals. 
%
function typeSpec_preferred_withField DS [redefineStatement] T [typeSpec]
 import Rules [statement*]
 import PreferRuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 'redefine TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
 deconstruct T TM [typeModifier] I [typeid] R [opt typeRepeater] 
	K [opt kept] O [opt orderedBy] Ig [opt ignoredWhen] P [preferredWith]
 deconstruct P 'preferred 'with L [literal+]
 construct StrID [id] _ [quote TID]
 deconstruct I TypeID [id] 
 construct ID1 [id] 'normalise_preferred_tokens
 construct ruleID1 [id] ID1 [_ StrID] [_ TypeID] [!]
 construct ID2 [id] 'normalise_preferred_replace
 construct ruleID2 [id] ID2 [_ StrID] [_ TypeID] [!]
 construct LL1 [literalOrVariable*] _ [literal_to_type each L] 
 construct Pattern [pattern] LL1
 construct LL2 [literalOrExpression*] _ [literal_to_expr each L] 
 construct Replacement [replacement] LL2
 construct S1 [statement*] 
    'function ruleID1 'B '[ TID ']
    	'replace '[ TID '* '] 'A '[ TID '* '] 
        'deconstruct 'not 'B Pattern
	'construct 'B1 '[ TID '] Replacement
     	'by _ '[ '. 'A '] '[ '. 'B1 '] 
    'end 'function
    'function ruleID2 
    	'replace '[ 'program '] 'Prg '[ 'program ']
        'construct 'A '[ TID '* '] '_ '[ '^ 'Prg ']
        'construct 'A1 '[ TID '* '] _ '[ ruleID1 each A ']
        'by 'Prg '[ '$ 'each 'A 'A1 ']
    'end 'function
 export Rules Rules [. S1] 
 export PreferRuleIDs PreferRuleIDs [. ruleID2]
 by S1 
end function

%
% Process all the [list Foo] or [repeat Foo] in the redefine statements
%
function DS_replace DS [redefineStatement]
 replace [statement*] S0 [statement*]
 construct T [typeSpec*] _ [^ DS]
 construct S1 [statement*] _ [typeSpec_repeat DS each T]
 construct S2 [statement*] _ [typeSpec_repeat_byField DS each T]
 construct S3 [statement*] _ [typeSpec_list_byField DS each T]
 construct S4 [statement*] _ [typeSpec_list DS each T]
 construct S5 [statement*] _ [typeSpec_ignore_when DS each T]
 construct S6 [statement*] _ [typeSpec_ignore DS each T]
 construct S7 [statement*] _ [typeSpec_preferred_withField DS each T]
 construct S [statement*] S0 [. S1] [. S2] [. S3] [. S4] [. S5] [. S6] [. S7]
 by S
end function

%
% Convert an ID into a singleton array of literalOrExpression
%
function id_to_type ID [id]
 replace [literalOrExpression*] L [literalOrExpression*]
 construct T [literalOrExpression*] '[ ID ']
 by L [. T]
end function

%
% Convert a literal into a singleton array of literalOrType
%
function literal_to_type L [literal]
 replace [literalOrVariable*] LL [literalOrVariable*]
 construct T [literalOrVariable*] L 
 by LL [. T]
end function

%
% keep the literalOrType in Pattern if it is a literal, or the same as the typeid I
% keep the literalOrType in Expression if it is a literal, or not the same as the typeid I
%
function pattern_replacement T [type] LoT [literalOrType]
 replace [literalOrVariable*] Pattern [literalOrVariable*]
 by Pattern [pattern_replacement_ignore_per_literal T LoT] 
	    [pattern_replacement_ignore_per_literal1 T LoT] 
	    [pattern_replacement_ignore_per_literal2 T LoT] 
end function
% case: literal
% 	no need to use T
function pattern_replacement_ignore_per_literal T [type] LoT [literalOrType]
 replace [literalOrVariable*] Pattern [literalOrVariable*]
 deconstruct * LoT L [literal]
 construct Var [literalOrVariable*] L 
 import Expression [literalOrExpression*]
 construct E [literalOrExpression] L
 export Expression Expression [. E]
 by Pattern [. Var]
end function
% case: type = T
function pattern_replacement_ignore_per_literal1 T [type] LoT [literalOrType]
 replace [literalOrVariable*] Pattern [literalOrVariable*]
 deconstruct LoT T
 construct X [id] 'X 
 construct V [varid] X [!]
 construct Var [literalOrVariable] V T 
 by Pattern [. Var]
 % ignore the variable in the Expression
end function
% case: type != T
function pattern_replacement_ignore_per_literal2 T [type] LoT [literalOrType]
 replace [literalOrVariable*] Pattern [literalOrVariable*]
 deconstruct not LoT T
 deconstruct LoT T1 [type]
 construct S [stringlit] _ [quote T1]
 where not S [grep 'NL]
 construct X [id] 'X 
 construct V [varid] X [!]
 construct Var [literalOrVariable] V T1 
 import Expression [literalOrExpression*]
 construct E [literalOrExpression] V
 export Expression Expression [. E]
 by Pattern [. Var]
end function

%
% Pattern use N1, Expression use N2 for the variable name
%
function pattern_replacement_N12 T [type] LoT [literalOrType]
 replace [literalOrVariable*] Pattern [literalOrVariable*]
 by Pattern [pattern_replacement_ignore_per_literal T LoT] 
	    [pattern_replacement_ignore_per_literal1_N12 T LoT] 
	    [pattern_replacement_ignore_per_literal2 T LoT] 
end function
% case: type = T
function pattern_replacement_ignore_per_literal1_N12 T [type] LoT [literalOrType]
 replace [literalOrVariable*] Pattern [literalOrVariable*]
 deconstruct LoT T
 construct N1 [id] 'N1 
 construct N2 [id] 'N2 
 construct V1 [varid] N1 
 construct V2 [varid] N2 
 construct Var1 [literalOrVariable] V1 T 
 import Expression [literalOrExpression*]
 construct E [literalOrExpression] V2
 export Expression Expression [. E]
 by Pattern [. Var1]
end function

function literal_to_expr ID [literal]
 replace [literalOrExpression*] L [literalOrExpression*]
 construct T [literalOrExpression*] ID 
 by L [. T]
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
 construct P0 [program] P [typeSpec_removeClones]
 import Rules
 import KeepRuleIDs
 import TypeIDs
 construct DS [redefineStatement*] _ [^ P0]
 construct S [statement*] _ [DS_replace each DS]
 construct PL [literalOrExpression*] 'Prg
 import OrderRuleIDs
 import IgnoreRuleIDs
 import PreferRuleIDs
 construct PL2 [literalOrExpression*] _ [id_to_type each IgnoreRuleIDs] [id_to_type each PreferRuleIDs] [id_to_type each OrderRuleIDs] [id_to_type each KeepRuleIDs]
 construct L [literalOrExpression*] _ [. PL] [. PL2]
 construct R [replacement] L
 construct RULE [statement]
 	'function 'main 'replace '[ 'program '] 'Prg '[ 'program '] 
    	'export 'CloneNumber '['number'] '0
	'by R
	'end 'function
 deconstruct P0 S0 [statement*]
 import Rules
 construct P1 [program] S0 [. Rules] [. RULE ]
 by  P1 [typeSpec_eliminateKeptAnnotations] 
	[typeSpec_eliminateOrderedAnnotations]
	[typeSpec_eliminateIgnoredAnnotations]
	[typeSpec_eliminatePreferredAnnotations]
end function
