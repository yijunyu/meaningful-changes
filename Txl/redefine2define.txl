% file redefine2define
% convert all defineStatements to equivalent defineStatements

% auxiliary function: replace the Redefine statement to the new Define statement
function replace_redefine R [redefineStatement] NewD [defineStatement]
  replace * [statement*] R S1 [statement*] 
  construct S [statement*] NewD
  by S [. S1] 
end function

function remove_dotdotdot 
  replace * [literalOrType*] '... Rest [literalOrType*] 
  by Rest
end function

function replace_newD D [defineStatement] NewD [defineStatement]
  replace * [statement*] D 
  construct d_D [defineStatement] D [print]
  by NewD 
end function

function replace_R R [redefineStatement] 
  replace * [statement*] R 
  by _ 
end function

function redefine2define_replace R [redefineStatement] D [defineStatement]
  deconstruct R 
	'redefine 
	        T1 [typeid]	
		T3 [repeat literalOrType]
		T4 [repeat barLiteralsAndTypes]	 
	'end 'define
  deconstruct D 
	'define T1 T7 [repeat literalOrType] T8	[repeat barLiteralsAndTypes] 'end 'define
  construct NewD [defineStatement]
	'define T1 T3 T4
	'end 'define
  replace [program] S [statement*]
  by S [replace_newD D NewD] [replace_R R]
end function

function redefine2define_prefix  R [redefineStatement] D [defineStatement]
  deconstruct R 'redefine T1 [typeid]	'...  T3 [repeat literalOrType] T4 [repeat barLiteralsAndTypes]	 'end T6 [redefineOrDefine]
  deconstruct D 'define T1 T7 [repeat literalOrType] T8	[repeat barLiteralsAndTypes] 'end 'define
  construct TT3 [repeat literalOrType] T7 [. T3]
  construct TT4 [repeat barLiteralsAndTypes] T8 [append T3]
  construct NewD [defineStatement] 'define T1 TT3 TT4 'end 'define
  replace [program] S [statement*] 
  by S [replace_newD D NewD] [replace_R R]
end function

function append T3 [repeat literalOrType]
  replace [repeat barLiteralsAndTypes] T81 [barLiteralsAndTypes] T82 [repeat barLiteralsAndTypes] 
  deconstruct T81 '| LoT [literalOrType*]
  construct LoT2 [literalOrType*] LoT [. T3]
  construct TT41 [barLiteralsAndTypes] '| LoT2
  construct TT42 [repeat barLiteralsAndTypes] T82 [append T3]
  by _ [. TT41] [. TT42]
end function

function redefine2define_suffix R [redefineStatement] D [defineStatement]
  deconstruct R 'redefine T1 [typeid] T3 [repeat literalOrType] 'end 'define
  deconstruct * [literal] T3 '...
  deconstruct D 'define T1 T7 [repeat literalOrType] T8	[repeat barLiteralsAndTypes] 'end 'define
  construct TT31 [repeat literalOrType] T3 [remove_dotdotdot] 
  construct TT3 [repeat literalOrType] TT31 [. T7]
  construct TT4 [repeat barLiteralsAndTypes] T8 [prepend TT31]
  construct NewD [defineStatement] 'define T1 TT3 TT4 'end 'define
  replace [program] S [statement*] 
  by S [replace_newD D NewD] [replace_R R]
end function
function prepend T3 [repeat literalOrType]
  replace [repeat barLiteralsAndTypes] T81 [barLiteralsAndTypes] T82 [repeat barLiteralsAndTypes] 
  deconstruct T81 '| LoT [literalOrType*]
  construct LoT2 [literalOrType*] T3 [. LoT]
  construct TT41 [barLiteralsAndTypes] '| LoT2
  construct TT42 [repeat barLiteralsAndTypes] T82 [prepend T3]
  by _ [. TT41] [. TT42]
end function

function redefine2define_one R [redefineStatement]
  replace [program] P [program]
  construct D [defineStatement*] _ [^ P]
  by P 	  [redefine2define_prefix R each D] 
	  [redefine2define_suffix R each D] 
	  [redefine2define_replace R each D]
end function

function redefine2define 
  replace [program] P [program]
  construct R [redefineStatement*] _ [^ P]
  by P [redefine2define_one each R] 
end function
