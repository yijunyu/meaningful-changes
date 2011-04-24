include "txl.grm"

%
% Yijun Yu: adapted from grm.txl by inserting the following pragma after 'list
% or 'repeat: 'ordered ['by '[ name '] ]
%
keys
  'ordered 'ignored 'by 
end keys

redefine typeSpec
	... [opt orderedBy] [opt ignoredBy]
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

function typeSpec_ignore DS [redefineStatement] T [typeSpec]
 import Rules [statement*]
 import RuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 'redefine TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
 deconstruct T TM [typeModifier] I [typeid] R [opt typeRepeater] O [opt orderedBy] Ig [ignoredBy]
 deconstruct Ig 'ignored
 construct StrID [id] _ [quote TID]
 deconstruct I TypeID [id] 
 construct ID [id] 'normalise_ignore
 construct ruleID [id] ID [_ StrID] [_ TypeID]
 construct S [statement*]
    'function ruleID
	'replace '[ TM I R '] 'N1 '[ TM I R '] 
	'by _
    'end 'function
 export Rules Rules [. S]
 export RuleIDs RuleIDs [. ruleID]
 by S
end function

%
% Use the byField to select elements
%
function typeSpec_ignore_byField DS [redefineStatement] T [typeSpec]
 import Rules [statement*]
 import RuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 'redefine TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
 deconstruct T TM [typeModifier] I [typeid] R [opt typeRepeater] O [opt orderedBy] Ig [ignoredBy]
 deconstruct Ig 'ignored B [byField]
 deconstruct B 'by F [id]
 construct StrID [id] _ [quote TID]
 deconstruct I TypeID [id] 
 construct ID1 [id] 'normalise_ignore_by
 construct ruleID1 [id] ID1 [_ F] [_ StrID] [_ TypeID] 
 construct pID [id] TypeID [_ StrID]
 construct S1 [statement*]
    'function ruleID1
        'replace '[ 'program '] 'P '[ 'program ']
	'construct 'List '[ TID '* '] '_ '[ '^ 'P ']
	'deconstruct 'List 'E1 '[ TID '] 'RestE '[ TID '* ']
	'where 'E1 '[ F ']
	'deconstruct '* '[ TM I R '] 'E1 'N1 '[ TM I R ']
	'construct 'N2 '[ TM I R ']
	'construct 'E2 '[ TID '] 'E1 '[ '$ 'N1 'N2 ']
        'by 'P '[ '$ 'E1 'E2 '] 
    'end 'function
 export Rules Rules [. S1] 
 export RuleIDs RuleIDs [. ruleID1] 
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
 construct S5 [statement*] _ [typeSpec_ignore_byField DS each T]
 construct S6 [statement*] _ [typeSpec_ignore DS each T]
 construct S [statement*] S0 [. S1] [. S2] [. S3] [.S4] [.S5] [. S6]
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
 construct DS [redefineStatement*] _ [^ P]
 construct S [statement*] _ [DS_replace each DS]
 import Rules 
 import RuleIDs 
 deconstruct P S0 [statement*]
  % construct ID [id*] RuleIDs [print]
 construct PL [literalOrExpression*] 'Prg
 construct PL2 [literalOrExpression*] _ [id_to_type each RuleIDs]
 construct L [literalOrExpression*] _ [. PL] [. PL2]
 construct R [replacement] L
 construct RULE [statement]
 	'function 'main 'replace '[ 'program '] 'Prg '[ 'program '] 'by R
	'end 'function
 construct P1 [program] S0 [. Rules] [. RULE ]
 by P1 [typeSpec_eliminateOrderedBy]
 	[typeSpec_eliminateIgnoredBy]
end function
