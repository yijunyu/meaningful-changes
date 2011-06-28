%
% Use annotation 'preferred 'with L where L is a list of user-defined literals. 
%
function typeSpec_preferred_withLiterals DS 
#ifdef DEFINE
[defineStatement] 
#else
[redefineStatement] 
#endif
T [typeSpec]
 import Rules [statement*]
 import PreferRuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 
#ifdef DEFINE
'define 
#else
'redefine 
#endif
TID [typeid] Type [literalOrType*] RestDS [barLiteralsAndTypes*] 'end 'define
 deconstruct T TM [opt typeModifier] I [typeid] R [opt typeRepeater] K [opt kept] O [opt orderedBy] Ig [opt ignoredWhen] P [preferredWith]
 construct d_T [typeSpec] T [print]
 deconstruct P 'preferred 'with L [literal+]
 construct StrID [id] _ [quote TID] % [print]
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

%% replace all the terms
function typeSpec_preferred_withRuleApplications DS 
#ifdef DEFINE
[defineStatement] 
#else
[redefineStatement] 
#endif
T [typeSpec]
 import Rules [statement*]
 import PreferRuleIDs [id*]
 replace [statement*] S [statement*] 
 deconstruct DS 
#ifdef DEFINE
'define 
#else
'redefine 
#endif
      TID [typeid] 
#ifndef DEFINE
        PrevRule [opt dotDotDotBar]
#endif
	LoT [literalOrType*] BLoT [barLiteralsAndTypes*] 
#ifndef DEFINE
	PostRule [opt barDotDotDot] 
#endif
	'end 'define
 by S [typeSpec_prefer_LoT TID T LoT] [typeSpec_prefer_BLoT TID T each BLoT] 
end function

function typeSpec_prefer_LoT TID [typeid] T [typeSpec] LoT [literalOrType*] 
 replace [statement*] S [statement*] 
 deconstruct T TM [typeModifier] I [typeid] R [opt typeRepeater] K [opt kept] O [opt orderedBy] Ig [opt ignoredWhen] P [preferredWith]
 deconstruct P 'preferred 'with L [ruleApplication+]
 where LoT [contains T]
 construct StrID [id] _ [quote TID]
 export Constructors [constructDeconstructImportExportOrCondition*] _
 export Expression [literalOrExpression*] _
 construct TT [type] '[ T ']
 construct Pat [literalOrVariable*] _ [pattern_replacement0 TT L each LoT]
 construct Pattern [pattern] Pat
 construct Replacement [replacement] Expression
 deconstruct I TypeID [id] 
 construct ID2 [id] 'normalise_prefer_by2
 construct ruleID2 [id] ID2 [_ StrID] [_ TypeID] [!]
 construct ID3 [id] 'normalise_prefer_by3
 construct ruleID3 [id] ID3 [_ StrID] [_ TypeID] [!]
 construct ID4 [id] 'normalise_prefer_by4
 construct ruleID4 [id] ID4 [_ StrID] [_ TypeID] [!]
 construct pID [id] TypeID [_ StrID]
 construct n_Replacement [number] _ [length Pat]
 where not n_Replacement [= 1]
 import Constructors 
 construct D1 [constructDeconstructImportExportOrCondition] 
        'deconstruct 'E1 Pattern
 construct D2 [constructDeconstructImportExportOrCondition] 
	'construct 'E2 '[ TID '] Replacement
 construct CCC [constructDeconstructImportExportOrCondition*] 
	_ [. D1] [. Constructors] [. D2]
 construct S1 [statement*]
    'function ruleID2 'E1 '[ TID ']
    	'replace '[ TID '* '] 'Seq '[ TID '* ']
        'deconstruct 'not 'E1 Pattern
     	'by 'Seq '[ '. 'E1 '] 
    'end 'function
    'function ruleID3 'E1 '[ TID ']
    	'replace '[ TID '* '] 'Seq '[ TID '* ']
	CCC
     	'by 'Seq '[ '. 'E2 '] 
    'end 'function
    'function ruleID4
        'replace '[ 'program '] 'P1 '[ 'program '] 
        'construct 'List1 '[ TID '* '] '_ '[ '^ 'P1 '] 
        'construct 'List2 '[ TID '* ']
            '_ '[ ruleID3 'each 'List1 '] '[ ruleID2 'each 'List1 ']
        'construct 'P2 '[ 'program '] 'P1 '[ '$ 'each 'List1 'List2 ']
       'by 'P2
    'end 'function
 import Rules [statement*]
 export Rules Rules [. S1] 
 import PreferRuleIDs [id*]
 export PreferRuleIDs PreferRuleIDs [. ruleID4]
 by S [. S1]
end function
% BLoT
function typeSpec_prefer_BLoT TID [typeid] T [typeSpec] BLoT [barLiteralsAndTypes] 
 replace [statement*] S [statement*] 
 deconstruct BLoT '| LoT [literalOrType*]
 by S [typeSpec_prefer_LoT TID T LoT]
end function
