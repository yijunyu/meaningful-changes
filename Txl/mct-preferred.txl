rule typeSpec_eliminatePreferredAnnotations
 replace * [typeSpec] T [typeSpec] 
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] K [opt kept] O [opt orderedBy] Ig [opt ignoredWhen] 
 	P [preferredWith]
 by M I R
end rule

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

