
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
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] K [kept] O [opt orderedBy] Ig [opt ignoredWhen]
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
 construct add_if_clones_1 [id] add_if_clones [_ TypeID] [!]
 construct add_if_clones_2 [id] add_if_clones [_ TypeID] [!]
 construct Stmt_1 [statement*]
     'redefine TypeID
	'['opt 'srclinenumber 'ignored '] '...
     'end 'define
     'redefine TypeID 
	'... '| '[ 'attr 'Change '] 
     'end 'define
     'function find_replace_I 
	    'replace '[ 'program '] 'P '[ 'program ']
	    'import 'Program_Diff '['program']
	    'construct 'S '[ TypeID '* '] '_ '[ find_clones_I 'P 'Program_Diff ']
	    'construct 'P3 '[ 'program '] 'P '[ mark_clones_I 'each 'S ']
	    'by 'P3
     'end 'function
     'function find_clones_I 'P '[ 'program '] 'P2 '[ 'program ']
	    'replace '[ TypeID '* '] _ '[ TypeID '* ']
	    'construct 'S '[ TypeID '* '] '_ '[ '^ 'P ']
	    'by '_ '[ add_if_clones_1 'P2 'each 'S ']
     'end 'function
     'function add_if_clones_1 'P2 '[ 'program '] 'Stmt '[ TypeID ']
	    'construct 'S2 '[ TypeID '* '] '_ '[ '^ 'P2 ']
	    'deconstruct '* 'S2 'Stmt 'Rest '[ TypeID '* ']
	    'replace '[ TypeID '* '] 'StructuredClones '[ TypeID '* ']
	    'deconstruct 'not '* 'StructuredClones 'C '['attr 'Change '] 
	    'by 'StructuredClones '[ '. 'Stmt '] 
     'end 'function
     'function mark_clones_I 'S '[ TypeID ']
	    'import 'CloneNumber '['number']
	    'import 'Program_Diff '['program']
	    'export 'CloneNumber 'CloneNumber '['+ '1']
	    'construct 'C '[ 'stringlit '] '_ '['quote 'S ']
	    'where 'not 'C '['= ""']
	    'construct 'Ln_S '['srclinenumber'*'] '_ '['^ S']
	    'deconstruct 'Ln_S 'Ln_1 '['srclinenumber'] 'Rest '['srclinenumber'*'] 
	    'construct 'S2 '[ TypeID '] '>>>>>> 'Ln_1 'C
	    'export 'Program_Diff 'Program_Diff  '[ '$ 'S 'S2 ']
	    'replace '[ 'program '] 'P '[ 'program '] 
	    'construct 'S1 '[ TypeID '] '<<<<<< 'Ln_1 'C
	    'by 'P '[ '$ 'S 'S1 ']
     'end 'function
 export Rules Rules [. Stmt_1] 
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
function typeSpec_repeat DS [defineStatement] T [typeSpec]
 import Rules [statement*]
 import OrderRuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 'define TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
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
function typeSpec_repeat_byField DS [defineStatement] T [typeSpec]
 import Rules [statement*]
 import OrderRuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 'define TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
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
function typeSpec_list DS [defineStatement] T [typeSpec]
 import Rules [statement*]
 import OrderRuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 'define TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
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
function typeSpec_list_byField DS [defineStatement] T [typeSpec]
 import Rules [statement*]
 import OrderRuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 'define TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
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
function typeSpec_ignore DS [defineStatement] T [typeSpec]
 replace [statement*] S [statement*] 
 deconstruct DS 
      'define TID [typeid] 
%        PrevRule [opt dotDotDotBar]
	LoT [literalOrType*] BLoT [barLiteralsAndTypes*] 
%	PostRule [opt barDotDotDot] 
	'end 'define
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

function typeSpec_ignore_when DS [defineStatement] T [typeSpec]
 import Rules [statement*]
 import IgnoreRuleIDs [id*]
 replace [statement*] S [statement*] 
 deconstruct DS 'define TID [typeid] LoT [literalOrType*] BLoT [barLiteralsAndTypes*] 'end 'define
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
function typeSpec_preferred_withField DS [defineStatement] T [typeSpec]
 import Rules [statement*]
 import PreferRuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 'define TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
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
function DS_replace DS [defineStatement]
 replace [statement*] S0 [statement*]
 % T0 is a default pattern to remove all the srclinenumber
 construct T0 [typeSpec] 'opt 'srclinenumber 'ignored
 construct T1 [typeSpec*] _ [. T0] [^ DS]
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

