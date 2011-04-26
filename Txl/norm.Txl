include "txl.grm"

%
% Yijun Yu: adapted from grm.txl by inserting the following pragma after 'list
% or 'repeat: 'ordered ['by '[ name '] ]
%
keys
  'ordered 'ignored 'by 'meaningful
end keys

redefine typeSpec
	... [opt meaningful] [opt orderedBy] [opt ignoredBy]
end define

define ignoredBy
	'ignored [opt byField]
end define

define orderedBy
	'ordered [opt byField]
end define

define byField
       'by [id]
     | 'by [typeModifier]
end define

define meaningful
   'meaningful
end define

%
% Eliminate all the annotations
%
rule typeSpec_eliminateOrderedBy
 replace * [typeSpec] T [typeSpec] 
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] O [opt orderedBy] 
 deconstruct O 'ordered B [opt byField]
 construct T1 [typeSpec] M I R
 by T1
end rule

rule typeSpec_eliminateIgnoredBy
 replace * [typeSpec] T [typeSpec] 
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] O [opt orderedBy] Ig [ignoredBy]
 deconstruct Ig 'ignored B [opt byField]
 construct T1 [typeSpec] M I R
 by T1
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
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] 'meaningful O [opt orderedBy] Ig [opt ignoredBy]
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
 import RuleIDs2 [id*]
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
 export RuleIDs2 RuleIDs2 [. find_replace_I] 
 export TypeIDs TypeIDs [. TypeID] 
end function

%
% Process [repeat Foo ordered by Bar]
%
% Global variables: 
%   Rules [statement*]  %% The rules for normalising the id's
%   RuleIDs [id*]	%% The name of the normalisation rules
%
function typeSpec_repeat DS [redefineStatement] T [typeSpec]
 import Rules [statement*]
 import RuleIDs [id*]
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
           'construct 'T1 '[ 'stringlit '] '_ '[ 'quote 'N1 ']
           'construct 'T2 '[ 'stringlit '] '_ '[ 'quote 'N2 ']
	'where 'T1 '[ '> 'T2 ']
	'by 
	   'N2 'N1 'Rest 
    'end 'rule
 export Rules Rules [. S]
 export RuleIDs RuleIDs [. ruleID]
 by S
end function
function typeSpec_repeat_byField DS [redefineStatement] T [typeSpec]
 import Rules [statement*]
 import RuleIDs [id*]
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
 export RuleIDs RuleIDs [. ruleID]
 by S
end function

%
% Process [list Foo ordered by Bar]
%
% Global variables: 
%   Rules [statement*]  %% The rules for normalising the id's
%   RuleIDs [id*]	%% The name of the normalisation rules
%
function typeSpec_list DS [redefineStatement] T [typeSpec]
 import Rules [statement*]
 import RuleIDs [id*]
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
           'construct 'T1 '[ 'stringlit '] '_ '[ 'quote 'N1 ']
           'construct 'T2 '[ 'stringlit '] '_ '[ 'quote 'N2 ']
	'where 'T1 '[ '> 'T2 ']
	'by 
	   'N2 ', 'N1 ', 'Rest 
    'end 'rule
 export Rules Rules [. S]
 export RuleIDs RuleIDs [. ruleID]
 by S
end function
function typeSpec_list_byField DS [redefineStatement] T [typeSpec]
 import Rules [statement*]
 import RuleIDs [id*]
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
 export RuleIDs RuleIDs [. ruleID]
 by S
end function

%
% Ignore the node
%
function typeSpec_ignore DS [redefineStatement] T [typeSpec]
 import Rules [statement*]
 import RuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 'redefine TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
 deconstruct T TM [typeModifier] I [typeid] R [opt typeRepeater] O [opt orderedBy] Ig [ignoredBy]
 deconstruct Ig 'ignored 
 construct StrID [id] _ [quote TID]
 deconstruct I TypeID [id] 
 construct ID1 [id] 'normalise_ignore_by1
 construct ruleID1 [id] ID1 [_ StrID] [_ TypeID] [!]
 construct ID2 [id] 'normalise_ignore_by2
 construct ruleID2 [id] ID2 [_ StrID] [_ TypeID] [!]
 construct ID3 [id] 'normalise_ignore_by3
 construct ruleID3 [id] ID3 [_ StrID] [_ TypeID] [!]
 construct ID4 [id] 'normalise_ignore_by4
 construct ruleID4 [id] ID4 [_ StrID] [_ TypeID] [!]
 construct pID [id] TypeID [_ StrID]
 construct S1 [statement*]
    'function ruleID2 'E1 '[ TID '] 'N1 '[ I ']
    	'replace '[ I '* '] 'Seq '[ I '* ']
     	'by 'Seq 
    'end 'function
    'function ruleID3 'E1 '[ TID ']
    	'replace '[ TID '* '] 'Seq '[ TID '* ']
        'construct 'N1 '[ I '* '] '_ '[ '^ 'E1 ']
	'construct 'N2 '[ I '*' ] 
		'_ '[ ruleID2 'E1 'each 'N1 ']
        'construct 'E2  '[ TID '] 'E1  '[ '$ 'N1 'N2 '] 
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
 export Rules Rules [. S1] 
 export RuleIDs RuleIDs [. ruleID4]
 by S1 
end function

%
% Use the byField 'ignored 'by F where F is a user-defined function. In the
% transformed rule, it will be used by the 'where E1 '[ F E2 '] clause to
% select the elements that matches to be ignored, where E1 is the scope of the
% ignored non-terminal and E2 is the ignored non-terminal
%
% typeRepeater R is *
%
function typeSpec_ignore_byField_R DS [redefineStatement] T [typeSpec]
 import Rules [statement*]
 import RuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 'redefine TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
 deconstruct T TM [typeModifier] I [typeid] R [opt typeRepeater] O [opt orderedBy] Ig [ignoredBy]
 deconstruct Ig 'ignored B [byField]
 deconstruct B 'by F [id]
 construct StrID [id] _ [quote TID]
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
        'construct 'N1 '[ I '* '] '_ '[ '^ 'E1 ']
	'construct 'N2 '[ I '*' ] 
		'_ '[ ruleID1 'E1 'each 'N1 ']
		   '[ ruleID2 'E1 'each 'N1 ']
        'construct 'E2  '[ TID '] 'E1  '[ '$ 'N1 'N2 '] 
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
 export Rules Rules [. S1] 
 export RuleIDs RuleIDs [. ruleID4]
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
 construct S5 [statement*] _ [typeSpec_ignore_byField_R DS each T]
 construct S6 [statement*] _ [typeSpec_ignore DS each T]
 construct S [statement*] S0 [. S1] [. S2] [. S3] [. S4] [. S5] [. S6] 
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
%   Rules [statement*]  %% The rules for normalising the id's
%   RuleIDs [id*]	%% The name of the normalisation rules
function main 
 replace [program] P [program]
 export Rules [statement*] _
 export RuleIDs [id*] _
 export RuleIDs2 [id*] _
 export TypeIDs [id*] _
 construct P0 [program] P [typeSpec_removeClones]
 import Rules
 import RuleIDs
 import RuleIDs2
 import TypeIDs
 construct DS [redefineStatement*] _ [^ P0]
 construct S [statement*] _ [DS_replace each DS]
 construct PL [literalOrExpression*] 'Prg
 import RuleIDs
 construct PL2 [literalOrExpression*] _ [id_to_type each RuleIDs] [id_to_type each RuleIDs2]
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
 by P1 [typeSpec_eliminateOrderedBy]
       [typeSpec_eliminateIgnoredBy]
end function
