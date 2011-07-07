function selectYes S [stringlit]
 replace [typeSpec*] S1 [typeSpec] S2 [typeSpec*]
 construct Str [stringlit] _ [quote S1]
 where Str [grep S]
 construct T2 [typeSpec*] S2 [selectYes S] [selectNo S]
 construct T1 [typeSpec] S1
 by _ [. T1] [. T2]
end function

function selectNo S [stringlit]
 replace [typeSpec*] S1 [typeSpec] S2 [typeSpec*]
 construct Str [stringlit] _ [quote S1]
 where not Str [grep S]
 construct T2 [typeSpec*] S2 [selectYes S] [selectNo S]
 by _ [. T2]
end function

function choose S [stringlit]
 replace [typeSpec*] SS [typeSpec*]
 by SS [selectYes S] [selectNo S]
end function

rule sort
  replace [typeSpec*] N1 [typeSpec] N2 [typeSpec] Rest [typeSpec*] 
  construct S1 [stringlit] _ [quote N1]
  construct S2 [stringlit] _ [quote N2]
  where S1 [ > S2]
  by N2 N1 Rest 
end rule

rule uniq
  replace [typeSpec*] N1 [typeSpec] N2 [typeSpec] Rest [typeSpec*] 
  construct S1 [stringlit] _ [quote N1]
  construct S2 [stringlit] _ [quote N2]
  where S1 [= S2]
  by N1 Rest 
end rule

function typeSpec2typeid T [typeSpec*]
  replace [typeid*] V [typeid*] 
  deconstruct T T1 [typeSpec] T2 [typeSpec*]
  construct d_T1 [typeSpec] T1 
  deconstruct * [typeid] T1 V1 [typeid]
  construct d_V1 [typeid] V1 
  construct V2 [typeid*] _ [typeSpec2typeid T2]
  by _ [. V1] [. V2] 
end function


function construct_annotate DS [defineStatement] T [typeSpec]
  replace [statement*] _ [statement*]
  deconstruct DS 
	'define Tid [typeid] 
		LoT [repeat literalOrType] 
		BLoT [repeat barLiteralsAndTypes] 
	'end 'define 
  deconstruct Tid Id [id]
  construct A [statement]
	'annotate Id '[ T ']
  by 
	_ [. A]
end function

% A are MCT_annotate statements
function annotate_define_statement DS [defineStatement]
  replace [statement*] A [statement*]
  construct T [typeSpec*] _ [^ DS] [choose "repeat"] [sort] [uniq] 
#ifdef PROMPT_OPTION_ANNOTATION
  construct T2 [typeSpec*] _ [^ DS] [choose "opt"] [sort] [uniq] 
#endif
  construct A2 [statement*] _ [construct_annotate DS each T] 
#ifdef PROMPT_OPTION_ANNOTATION
	[construct_annotate DS each T2]
#endif
  construct A1 [statement*] A [. A2]
  by A1
end function

function promptTerms
 replace [program] P [program]
 construct PT [program] P
#ifdef DEFINE
    [include_all] 
    [redefine2define] 
#endif
 construct T [defineStatement*] _ [^ PT] 
 construct A_T [statement*] _ [annotate_define_statement each T] [print]
 deconstruct P S [statement*]
 construct S1 [statement*] S [. A_T]
 construct P1 [program] S1
 by P1 
end function

