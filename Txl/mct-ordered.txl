
%
% Process [repeat Foo ordered by Bar]
%
% Global variables: 
%   Rules [statement*]  %% The rules for normalising the id's
%   OrderRuleIDs [id*]	%% The name of the normalisation rules
%
function typeSpec_repeat DS 
#ifdef DEFINE
[defineStatement] 
#else
[redefineStatement] 
#endif
T [typeSpec]
 import Rules [statement*]
 import OrderRuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 
#ifdef DEFINE
'define 
#else
'redefine 
#endif
TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] O [opt orderedBy] 
 deconstruct O 'ordered 
 deconstruct not M 'list
 construct StrID [id] _ [quote TID]
 deconstruct I TypeID [id] 
 construct ID [id] 'normalise_list
 construct ruleID [id] ID [_ StrID] [_ TypeID]
 construct S [statement*]
    'rule ruleID
	'replace '[ M I R '] 
	   'N1 '[ I '] 'N2 '[ I '] 'Rest '[ M I R '] 
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
function typeSpec_repeat_byField DS 
#ifdef DEFINE
[defineStatement] 
#else
[redefineStatement] 
#endif
T [typeSpec]
 import Rules [statement*]
 import OrderRuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 
#ifdef DEFINE
'define 
#else
'redefine 
#endif
TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] O [opt orderedBy] 
 deconstruct not M 'list
 deconstruct O 'ordered B [opt byField]
 deconstruct B 'by F [id]
 construct StrID [id] _ [quote TID]
 deconstruct I TypeID [id] 
 construct ID [id] 'normalise_list
 construct ruleID [id] ID [_ StrID] [_ TypeID]
 construct S [statement*]
    'rule ruleID
	'replace '[ M I R '] 
	   'N1 '[ I '] 'N2 '[ I '] 'Rest '[ M I R '] 
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
function typeSpec_list DS 
#ifdef DEFINE
[defineStatement] 
#else
[redefineStatement] 
#endif
T [typeSpec]
 import Rules [statement*]
 import OrderRuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 
#ifdef DEFINE
'define 
#else
'redefine 
#endif
TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] O [opt orderedBy] 
 deconstruct M 'list
 deconstruct O 'ordered
 construct StrID [id] _ [quote TID]
 deconstruct I TypeID [id] 
 construct ID [id] 'normalise_list
 construct ruleID [id] ID [_ StrID] [_ TypeID]
 construct S [statement*]
    'rule ruleID
	'replace '[ M I R '] 
	   'N1 '[ I '] ', 'N2 '[ I '] ', 'Rest '[ M I R '] 
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
function typeSpec_list_byField DS 
#ifdef DEFINE
[defineStatement] 
#else
[redefineStatement] 
#endif
T [typeSpec]
 import Rules [statement*]
 import OrderRuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 
#ifdef DEFINE
'define 
#else
'redefine 
#endif
TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] O [opt orderedBy] 
 deconstruct M 'list
 deconstruct O 'ordered B [byField]
 deconstruct B 'by F [id]
 construct StrID [id] _ [quote TID]
 deconstruct I TypeID [id] 
 construct ID [id] 'normalise_list
 construct ruleID [id] ID [_ StrID] [_ TypeID]
 construct S [statement*]
    'rule ruleID
	'replace '[ M I R '] 
	   'N1 '[ I '] ', 'N2 '[ I '] ', 'Rest '[ M I R '] 
	'where 'N1 '[ F 'N2 ']
	'by 
	   'N2 ', 'N1 ', 'Rest 
    'end 'rule
 export Rules Rules [. S]
 export OrderRuleIDs OrderRuleIDs [. ruleID]
 by S
end function

