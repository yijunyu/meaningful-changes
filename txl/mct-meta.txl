function gather_id A [MCT_annotate*]
  replace [typeid*] T [typeid*]
  deconstruct A A1[MCT_annotate] Rest [MCT_annotate*]
  deconstruct A1 
     'annotate I [id] '[ Type [typeSpec] '] 
  construct T1 [typeid] I
  construct T2 [typeid*] _ [gather_id Rest]
  by T [. T1] [. T2]
end function

function gather_types A [MCT_annotate*]
  replace [typeSpec*] T [typeSpec*]
  deconstruct A A1[MCT_annotate] Rest [MCT_annotate*]
  deconstruct A1 'annotate I [id] '[ Type [typeSpec] '] 
  construct T2 [typeSpec*] _ [gather_types Rest]
  by T [. Type] [. T2]
end function

function gather_relevant T [typeid]
  replace [MCT_annotate*] A1 [MCT_annotate] Rest [MCT_annotate*]
  deconstruct A1 
     'annotate I [id] '[ Type [typeSpec] '] 
  deconstruct T I 
  construct A2 [MCT_annotate*] Rest [gather_relevant T] [gather_irrelevant T]
  by _ [. A1] [. A2]
end function

function gather_irrelevant T [typeid]
  replace [MCT_annotate*] A1 [MCT_annotate] Rest [MCT_annotate*]
  deconstruct A1 
     'annotate I [id] '[ Type [typeSpec] '] 
  deconstruct not T I 
  by Rest [gather_relevant T] [gather_irrelevant T]
end function

function find_type T_A [typeSpec]
  replace [typeSpec*] T [typeSpec*]
  deconstruct T T1 [typeSpec]
  deconstruct T1 
	X1 [opt typeModifier] X2 [typeid] X3 [opt typeRepeater]
#ifdef DEBUG_FIND_TYPE
  construct d_T1 [typeSpec] T1 [print]
#endif
  deconstruct T_A 
	X1 X2 X3 X4 [opt kept] X5 [opt orderedBy] X6 [opt ignoredWhen] X7 [opt preferredWith]
#ifdef DEBUG_FIND_TYPE
  construct d_TA [typeSpec] T_A [print]
#endif
  by 
	_ [. T_A]
end function

function replace_annotate A [MCT_annotate*] Tid [typeid]
  replace [typeSpec*] T1 [typeSpec] Rest [typeSpec*]
  construct Rest2 [typeSpec*] Rest [replace_annotate A Tid]
  construct T_A [typeSpec*] _ [gather_types A] 
#ifdef DEBUG_REPL_ANNOT
	[print]
#endif
  construct M_A [typeSpec*] _ [. T1] [find_type each T_A] 
#ifdef DEBUG_REPL_ANNOT
	[print]
#endif
  by _ [. M_A] [. Rest2]
end function

% assume that D1 are a set of define statements
function define2redefine A [MCT_annotate*]
  replace [statement] D1 [statement]
  deconstruct D1 
	'define T [typeid] 
		LoT [repeat literalOrType] 
		BLoT [repeat barLiteralsAndTypes] 
	'end 'define 
  construct A_relevant [MCT_annotate*] A [gather_relevant T] [gather_irrelevant T] 
#ifdef DEBUG_DEF2RE
 		[print]
#endif
  construct n_A_relevant [number] _ [length A_relevant]
  where n_A_relevant [> 0]
  construct R1 [defineStatement]
	'define T
		LoT
		BLoT
	'end 'define
  construct Types [typeSpec*] _ [^ R1]
  construct Types2 [typeSpec*] Types [replace_annotate A_relevant T] 
#ifdef DEBUG_DEF2RE
 		[print]
#endif
  construct R2 [defineStatement] R1 [$ each Types Types2] % [print]
  by R2 
end function

function notdefine2statement A [MCT_annotate*]
  replace [statement*] S1 [statement] Rest [statement*]
  deconstruct not S1 
	'define T [typeid] 
		LoT [repeat literalOrType] 
		BLoT [repeat barLiteralsAndTypes] 
	'end 'define 
  construct Rest2 [statement*] Rest [define2statement A] [notdefine2statement A]
  by _ [. S1]  [. Rest2]
end function

function define2statement A [MCT_annotate*]
  replace [statement*] S1 [statement] Rest [statement*]
  deconstruct S1 
	'define T [typeid] 
		LoT [repeat literalOrType] 
		BLoT [repeat barLiteralsAndTypes] 
	'end 'define 
  construct S2 [statement] S1 [define2redefine A]
  construct Rest2 [statement*] Rest [define2statement A] [notdefine2statement A]
  by _ [. S2] [. Rest2] 
end function

function metaAnnotation
  replace [program] P [program]
  construct A [MCT_annotate*] _ [^ P]
  deconstruct P S [statement*]
  construct S2 [statement*] S [define2statement A] [notdefine2statement A]
  construct P1 [program] S2
  by P1
end function
