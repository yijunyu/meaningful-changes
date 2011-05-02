include "norm.grm"
rule typeSpec_eliminateOrderedBy 
 replace * [typeSpec] T [typeSpec] 
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] O [orderedBy]
 deconstruct O 'ordered B [opt byField]
 construct T1 [typeSpec] M I R
 by T1
end rule
function typeSpec_repeat_byField DS [redefineStatement] T [typeSpec]
 import Rules [statement*]
 import RuleIDs [id*]
 replace [statement*] _ [statement*] 
 deconstruct DS 'redefine TID [typeid] TYPE [literalOrType*] REST [barLiteralsAndTypes*] 'end 'define
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
   'by 'N2 'N1 'Rest 
  'end 'rule
 export Rules Rules [. S]
 export RuleIDs RuleIDs [. ruleID]
 by S
end function
function DS_replace DS [redefineStatement]
 replace [statement*] S0 [statement*]
 construct T [typeSpec*] _ [^ DS]
 construct S2 [statement*] _ [typeSpec_repeat_byField DS each T]
 construct S [statement*] S0 [. S1] [. S2] [. S3]
 by S
end function
function id_to_type ID [id]
 replace [literalOrExpression*] L [literalOrExpression*]
 construct T [literalOrExpression*] '[ ID ']
 by L [. T]
end function
function main 
 replace [program] P [program]
 export Rules [statement*] _
 export RuleIDs [id*] _
 construct DS [defineStatement*] _ [^ P]
 construct S [statement*] _ [DS_replace each DS]
 import Rules 
 import RuleIDs 
 deconstruct P S0 [statement*]
 construct ID [id*] RuleIDs [print]
 construct PL [literalOrExpression*] 'Prg
 construct PL2 [literalOrExpression*] _ [id_to_type each RuleIDs]
 construct L [literalOrExpression*] _ [. PL] [. PL2]
 construct REPLACE [replacement] L
 construct MAIN [statement]
   'function 'main 'replace '[ 'program '] 
       'Prg '[ 'program '] 'by REPLACE
   'end 'function
 construct P1 [program] S0 [. Rules] [. MAIN ]
 by P1 [typeSpec_eliminateOrderedBy]
end function
