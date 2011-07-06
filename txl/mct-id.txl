%
% Ignore the node unconditionally
%
function typeSpec_id DS
#ifdef DEFINE
[defineStatement] 
#else
[redefineStatement] 
#endif
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
 by S [typeSpec_id_LoT TID LoT] 
      [typeSpec_id_BLoT TID each BLoT] 
end function
% LoT 
function typeSpec_id_LoT TID [typeid] LoT [literalOrType*] 
 replace [statement*] S [statement*] 
 construct StrID [id] _ [quote TID] 
 export Expression [literalOrExpression*] _
 export IDs [varid*] _
 construct TT [type] '[ 'id ']
 construct Pat [literalOrVariable*] _ [pattern_replacement TT each LoT]
 import IDs
 construct Pattern [pattern] Pat 
 construct Replacement [replacement] Expression % [print]
 construct ID2 [id] 'normalise_id_by2
 construct ruleID2 [id] ID2 [_ StrID] [!]
 construct ID3 [id] 'normalise_id_by3
 construct ruleID3 [id] ID3 [_ StrID] [!]
 construct ID4 [id] 'normalise_id_by4
 construct ruleID4 [id] ID4 [_ StrID] [!]
 construct pID [id] StrID
 construct n_Replacement [number] _ [length Pat]
 where n_Replacement [= 1]
 construct DEC [constructDeconstructImportExportOrCondition] 
	'deconstruct 'P1 Pattern
 construct Construct [constructDeconstructImportExportOrCondition*] _ [. DEC]
 construct S1 [statement*]
    'function ruleID4
        'replace '[ 'program '] 'P1 '[ 'program '] 
	Construct
        'by 'P1
    'end 'function
 import Rules [statement*]
 export Rules Rules [. S1] 
 import IdRuleIDs [id*]
 export IdRuleIDs IdRuleIDs [. ruleID4]
 by S [. S1]
end function
% BLoT
function typeSpec_id_BLoT TID [typeid] BLoT [barLiteralsAndTypes] 
 replace [statement*] S [statement*] 
 deconstruct BLoT '| LoT [literalOrType*]
 by S [typeSpec_id_LoT TID LoT]
end function
