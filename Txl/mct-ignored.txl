%
% Ignore the node unconditionally
%
function typeSpec_ignore DS 
#ifdef DEFINE
[defineStatement] 
#else
[redefineStatement] 
#endif
T [typeSpec]
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
 by S [typeSpec_ignore_LoT0 TID T LoT] [typeSpec_ignore_LoT_repeat TID T LoT] [typeSpec_ignore_LoT_opt TID T LoT] 
      [typeSpec_ignore_BLoT TID T each BLoT] 
end function
% LoT 
function typeSpec_ignore_LoT0 TID [typeid] T [typeSpec] LoT [literalOrType*] 
 replace [statement*] S [statement*] 
 deconstruct T TM [typeModifier] I [typeid] R [opt typeRepeater] K [opt scoped] O [opt orderedBy] Ig [opt ignoredWhen] Pr [opt preferredWith]
#ifdef ID
	       Ident [opt identified]
#endif
 where LoT [contains T]
 deconstruct Ig 'ignored
 construct StrID [id] _ [quote TID]
 export Expression [literalOrExpression*] _
 construct TT [type] '[ T ']
 construct Pat [literalOrVariable*] _ [pattern_replacement TT each LoT]
 construct Pattern [pattern] Pat
 construct Replacement [replacement] Expression
 deconstruct I TypeID [id] 
 construct ID2 [id] 'normalise_ignore_by2
 construct ruleID2 [id] ID2 [_ StrID] [_ TypeID] [!]
 construct ID3 [id] 'normalise_ignore_by3
 construct ruleID3 [id] ID3 [_ StrID] [_ TypeID] [!]
 construct ID4 [id] 'normalise_ignore_by4
 construct ruleID4 [id] ID4 [_ StrID] [_ TypeID] [!]
 construct pID [id] TypeID [_ StrID]
 construct n_Replacement [number] _ [length Pat]
 where n_Replacement [= 1]
 construct S1 [statement*]
    'function ruleID2 'E1 '[ TID ']
    	'replace '[ TID '* '] 'Seq '[ TID '* ']
        'deconstruct 'not 'E1 Pattern
     	'by 'Seq '[ '. 'E1 '] 
    'end 'function
    'function ruleID3 'E1 '[ TID ']
    	'replace '[ TID '* '] 'Seq '[ TID '* ']
        'deconstruct 'E1 Pattern
% Ignore the singleton, that's different from the next function
     	'by 'Seq 
    'end 'function
    'function ruleID4
        'replace '[ 'program '] 'P1 '[ 'program '] 
        'construct 'List1 '[ TID '* '] '_ '[ '^ 'P1 '] 
        'construct 'List2 '[ TID '* ']
            '_ '[ ruleID3 'each 'List1 '] '[ ruleID2 'each 'List1 ']
        'construct 'P2 '[ 'program '] 'P1 '[ '$ 'List1 'List2 ']
       'by 'P2
    'end 'function
 import Rules [statement*]
 export Rules Rules [. S1] 
 import IgnoreRuleIDs [id*]
 export IgnoreRuleIDs IgnoreRuleIDs [. ruleID4]
 by S [. S1]
end function
function typeSpec_ignore_LoT_opt TID [typeid] T [typeSpec] LoT [literalOrType*] 
 replace [statement*] S [statement*] 
 deconstruct T TM [typeModifier] I [typeid] R [opt typeRepeater] K [opt scoped] O [opt orderedBy] Ig [opt ignoredWhen] Pr [opt preferredWith]
#ifdef ID
	       Ident [opt identified]
#endif
 where LoT [contains T]
 deconstruct Ig 'ignored 
 construct StrID [id] _ [quote TID]
 export Expression [literalOrExpression*] _
 construct TT [type] '[ T ']
 construct Pat [literalOrVariable*] _ [pattern_replacement TT each LoT]
 construct Pattern [pattern] Pat
 construct Replacement [replacement] Expression
 deconstruct I TypeID [id] 
 construct ID2 [id] 'normalise_ignore_by2
 construct ruleID2 [id] ID2 [_ StrID] [_ TypeID] [!]
 construct ID3 [id] 'normalise_ignore_by3
 construct ruleID3 [id] ID3 [_ StrID] [_ TypeID] [!]
 construct ID4 [id] 'normalise_ignore_by4
 construct ruleID4 [id] ID4 [_ StrID] [_ TypeID] [!]
 construct pID [id] TypeID [_ StrID]
 construct n_Replacement [number] _ [length Pat]
 where not n_Replacement [= 1]
 deconstruct TM 'opt
 construct S1 [statement*]
    'function ruleID2 'E1 '[ TID ']
    	'replace '[ TID '* '] 'Seq '[ TID '* ']
        'deconstruct 'not 'E1 Pattern
     	'by 'Seq '[ '. 'E1 '] 
    'end 'function
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
            '_ '[ ruleID3 'each 'List1 '] '[ ruleID2 'each 'List1 ']
        'construct 'P2 '[ 'program '] 'P1 '[ '$ 'each 'List1 'List2 ']
       'by 'P2
    'end 'function
 import Rules [statement*]
 export Rules Rules [. S1] 
 import IgnoreRuleIDs [id*]
 export IgnoreRuleIDs IgnoreRuleIDs [. ruleID4]
 by S [. S1]
end function
function typeSpec_ignore_LoT_repeat TID [typeid] T [typeSpec] LoT [literalOrType*] 
 replace [statement*] S [statement*] 
 deconstruct T TM [typeModifier] I [typeid] R [opt typeRepeater] K [opt scoped] O [opt orderedBy] Ig [opt ignoredWhen] Pr [opt preferredWith]
#ifdef ID
	       Ident [opt identified]
#endif
 where LoT [contains T]
 deconstruct Ig 'ignored 
 construct StrID [id] _ [quote TID]
 export Expression [literalOrExpression*] _
 construct TT [type] '[ T ']
 construct Pat [literalOrVariable*] _ [pattern_replacement TT each LoT]
 construct Pattern [pattern] Pat
 construct Replacement [replacement] Expression
 deconstruct I TypeID [id] 
 construct ID2 [id] 'normalise_ignore_by2
 construct ruleID2 [id] ID2 [_ StrID] [_ TypeID] [!]
 construct ID3 [id] 'normalise_ignore_by3
 construct ruleID3 [id] ID3 [_ StrID] [_ TypeID] [!]
 construct ID4 [id] 'normalise_ignore_by4
 construct ruleID4 [id] ID4 [_ StrID] [_ TypeID] [!]
 construct pID [id] TypeID [_ StrID]
 construct n_Replacement [number] _ [length Pat]
 where not n_Replacement [= 1]
 deconstruct not TM 'opt
 construct S1 [statement*]
    'function ruleID2 'E1 '[ TID ']
    	'replace '[ TID '* '] 'Seq '[ TID '* ']
        'deconstruct 'not 'E1 Pattern
     	'by 'Seq '[ '. 'E1 '] 
    'end 'function
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
            '_ '[ ruleID3 'each 'List1 '] '[ ruleID2 'each 'List1 ']
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
 by S [typeSpec_ignore_LoT0 TID T LoT] [typeSpec_ignore_LoT_repeat TID T LoT] [typeSpec_ignore_LoT_opt TID T LoT]
end function

%
% Use the whenField ['ignored 'when F] where F is a user-defined function. In
% the transformed rule, it will be used by the 'where E1 '[ F E2 '] clause to
% select the elements that matches to be ignored, where E1 is the scope of the
% ignored non-terminal and E2 is the ignored non-terminal
%

function typeSpec_ignore_when DS 
#ifdef DEFINE
[defineStatement] 
#else
[redefineStatement] 
#endif
T [typeSpec]
 import Rules [statement*]
 import IgnoreRuleIDs [id*]
 replace [statement*] S [statement*] 
 deconstruct DS 
#ifdef DEFINE
'define 
#else
'redefine 
#endif
TID [typeid] LoT [literalOrType*] BLoT [barLiteralsAndTypes*] 'end 'define
 deconstruct T TM [typeModifier] I [typeid] R [opt typeRepeater] K [opt scoped] O [opt orderedBy] Ig [opt ignoredWhen] Pr [opt preferredWith]
#ifdef ID
	       Ident [opt identified]
#endif
 deconstruct Ig 'ignored W [whenField]
 deconstruct W 'when F [id]
 construct empty_LoT [literalOrType] '[ 'empty '] 
 construct d_el [literalOrType] empty_LoT [print]
 deconstruct * [literalOrType] DS empty_LoT
 construct Choice [number] 1
 by S [typeSpec_ignore_when_LoT Choice F TID T LoT] 
      [typeSpec_ignore_when_BLoT Choice F TID T each BLoT] [print]
end function

function typeSpec_ignore_when_2 DS 
#ifdef DEFINE
[defineStatement] 
#else
[redefineStatement] 
#endif
T [typeSpec]
 import Rules [statement*]
 import IgnoreRuleIDs [id*]
 replace [statement*] S [statement*] 
 deconstruct DS 
#ifdef DEFINE
'define 
#else
'redefine 
#endif
TID [typeid] LoT [literalOrType*] BLoT [barLiteralsAndTypes*] 'end 'define
 deconstruct T TM [typeModifier] I [typeid] R [opt typeRepeater] K [opt scoped] O [opt orderedBy] Ig [opt ignoredWhen] Pr [opt preferredWith]
#ifdef ID
	       Ident [opt identified]
#endif
 deconstruct Ig 'ignored W [whenField]
 deconstruct W 'when F [id]
 construct empty_LoT [literalOrType] '[ 'empty '] 
 % construct d_el [literalOrType] empty_LoT [print]
 deconstruct not * [literalOrType] DS empty_LoT
 construct Choice [number] 2
 by S [typeSpec_ignore_when_LoT Choice F TID T LoT] 
      [typeSpec_ignore_when_BLoT Choice F TID T each BLoT] [print]
end function


function choose1 T [number] S1 [statements] S2 [statements]
 replace [statement*] _ [statement*]
 where T [= 1]
 deconstruct S1 S [statement*]
 by S
end function

function choose2 T [number] S1 [statements] S2 [statements]
 replace [statement*] _ [statement*]
 where T [= 2]
 deconstruct S2 S [statement*]
 by S 
end function

define statements
  [statement*]
end define

% LoT 
function typeSpec_ignore_when_LoT Choice [number] F [id] TID [typeid] T [typeSpec] LoT [literalOrType*] 
 replace [statement*] S [statement*] 
 where LoT [contains T]
 construct StrID [id] _ [quote TID]
 export Expression [literalOrExpression*] _
 construct TT [type] '[ T ']
 construct Pat [literalOrVariable*] _ [pattern_replacement_N12 TT each LoT]
 construct Pattern [pattern] Pat 
 construct Replacement [replacement] Expression
 deconstruct T TM [typeModifier] I [typeid] R [opt typeRepeater] K [opt scoped] O [opt orderedBy] Ig [opt ignoredWhen] Pr [opt preferredWith]
#ifdef ID
	       Ident [opt identified]
#endif
 deconstruct I TypeID [id] 
 construct ID1 [id] 'normalise_ignore_by1
 construct ruleID1 [id] ID1 [_ F] [_ StrID] [_ TypeID] [!]
 construct ID2 [id] 'normalise_ignore_by2
 construct ruleID2 [id] ID2 [_ F] [_ StrID] [_ TypeID] [!]
 construct ID3 [id] 'normalise_ignore_by3
 construct ruleID3 [id] ID3 [_ F] [_ StrID] [_ TypeID] [!]
 construct ID4 [id] 'normalise_ignore_by4
 construct ruleID4 [id] ID4 [_ F] [_ StrID] [_ TypeID] [!]
 construct NonEmpty [id] 'nonempty 
 construct ID5 [id] NonEmpty [!]
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
  construct S2 [statement*]
    'function ID5 'Term '[ TID ']
       'replace '[ TID '*'] 'List1 '[ TID '*']
       'deconstruct 'not 'Term
       'by '_ '[ '. 'List1 '] '['. 'Term ']
    'end 'function
    'function ruleID4
        'replace '[ 'program '] 'P1 '[ 'program '] 
        'construct 'List1 '[ TID '* '] '_ '[ '^ 'P1 '] 
	'construct 'List3 '[ TID '* '] '_ '[ ID5 'each 'List1 ']
        'construct 'List2 '[ TID '* '] '_ '[ ruleID3 'each 'List1 ']
        'construct 'P2 '[ 'program '] 'P1 '[ '$ 'each 'List3 'List2 ']
       'by 'P2
    'end 'function
  construct S3 [statement*]
    'function ruleID4
        'replace '[ 'program '] 'P1 '[ 'program '] 
        'construct 'List1 '[ TID '* '] '_ '[ '^ 'P1 '] 
        'construct 'List2 '[ TID '* '] '_ '[ ruleID3 'each 'List1 ']
        'construct 'P2 '[ 'program '] 'P1 '[ '$ 'each 'List1 'List2 ']
       'by 'P2
    'end 'function
 import Rules [statement*]
 construct SS1 [statements] S2 
 construct SS2 [statements] S3 
 construct d_Choice [number] Choice
 construct Choosen [statement*] 
	_ [choose1 Choice SS1 SS2] [choose2 Choice SS1 SS2]
 export Rules Rules [. S1] [. Choosen]
 import IgnoreRuleIDs [id*]
 export IgnoreRuleIDs IgnoreRuleIDs [. ruleID4]
 by S [. Choosen]
end function
%
% BLoT
%
function typeSpec_ignore_when_BLoT Choice [number] F [id] TID [typeid] T [typeSpec] BLoT [barLiteralsAndTypes] 
 replace [statement*] S [statement*] 
 deconstruct BLoT '| LoT [literalOrType*]
 by S [typeSpec_ignore_when_LoT Choice F TID T LoT]
end function
