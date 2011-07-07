function append_id TID [id] TT [typeid] CIDs [varid*]
  deconstruct CIDs CID [varid] R_CIDs [varid*]
  replace [constructDeconstructImportExportOrCondition*] C [constructDeconstructImportExportOrCondition*]
  deconstruct CID Id_CID [id] 
  construct XID_CID [varid] Id_CID [_ 'x] [!]
  construct ID_CID [varid] Id_CID [_ 'd] [!]
  construct C_CID [constructDeconstructImportExportOrCondition*]
	'deconstruct '* '['id'] CID XID_CID '[ 'id '] 
	'construct ID_CID '[ 'id '*'] '_ '[ '. '' TID '] '[ '. XID_CID '] '['print']
  by C [. C_CID] [append_id TID TT R_CIDs]
end function
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
 construct TTT [typeid*] _ [read "config.id"] % [print]
 by S [typeSpec_id_LoT_per_type TID LoT each TTT]
end function
% BLoT
function typeSpec_id_BLoT TID [typeid] BLoT [barLiteralsAndTypes] 
 replace [statement*] S [statement*] 
 deconstruct BLoT '| LoT [literalOrType*]
 by S [typeSpec_id_LoT TID LoT]
end function

function typeSpec_id_LoT_per_type TID [typeid] LoT [literalOrType*] TTT [typeid]
 replace [statement*] S [statement*] 
 construct StrID [id] _ [quote TID] 
 export Expression [literalOrExpression*] _
 export IDs [varid*] _
 construct TT [type] '[ TTT ']
 deconstruct * [type] LoT TT
 construct Pat [literalOrVariable*] _ [pattern_replacement TT each LoT] % [print]
 import IDs
 construct Pattern [pattern] Pat 
 construct ID2 [id] 'normalise_id_by2
 construct ruleID2 [id] ID2 [_ StrID] [!]
 construct ID3 [id] 'normalise_id_by3
 construct ruleID3 [id] ID3 [_ StrID] [!]
 construct ID4 [id] 'normalise_id_by4
 construct ruleID4 [id] ID4 [_ StrID] [!]
 construct pID [id] StrID
 construct DEC [constructDeconstructImportExportOrCondition] 
	'deconstruct 'P1 Pattern
 construct Construct [constructDeconstructImportExportOrCondition*] _ [. DEC] [append_id StrID TTT IDs]
 construct S1 [statement*]
    'rule ruleID3
        'replace '[ TID '* '] 'P1 '[ TID '] 'P2 '[ TID '* ']
	Construct
        'by 'P2 
    'end 'rule
    'function ruleID4
        'replace '[ 'program '] 'P1 '[ 'program '] 
        'construct 'Element '[ TID '* '] '_ '[ '^ 'P1 ']
        'construct 'd_Element '[ TID '* '] 'Element '[ ruleID3 ']
        'by 'P1
    'end 'function
 import Rules [statement*]
 export Rules Rules [. S1] 
 import IdRuleIDs [id*]
 export IdRuleIDs IdRuleIDs [. ruleID4]
 by S [. S1]
end function
