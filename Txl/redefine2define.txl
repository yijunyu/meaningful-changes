% redefine2define
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
  replace * [statement*] D S1 [statement*] 
  by S1 [replace_redefine R NewD]
end function

function redefine2define_prefix  R [redefineStatement] D [defineStatement]
  deconstruct R 
	'redefine 
	        T1 [typeid]	
		'...
		T3 [repeat literalOrType]
		T4 [repeat barLiteralsAndTypes]	 
	'end T6 [redefineOrDefine]
  deconstruct D
	'define T1 T7 [repeat literalOrType] T8	[repeat barLiteralsAndTypes] 'end 'define
  construct TT3 [repeat literalOrType] T7 [. T3]
  construct TT4 [repeat barLiteralsAndTypes] T8 [. T4]
  construct NewD [defineStatement]
	'define T1 TT3 TT4
	'end 'define
  replace * [statement*] D S1 [statement*] 
  by S1 [replace_redefine R NewD] 
end function

function redefine2define_suffix R [redefineStatement] D [defineStatement]
  deconstruct R 
	'redefine 
	        T1 [typeid] T3 [repeat literalOrType]
	'end 'define
  deconstruct * [literal] T3 '...
  % construct d_R [redefineStatement] R [print]
  deconstruct D
	'define T1 T7 [repeat literalOrType] T8	[repeat barLiteralsAndTypes] 'end 'define
  % construct d_D [defineStatement] D [print]
  construct TT31 [repeat literalOrType] T3 [remove_dotdotdot] 
  construct TT3 [repeat literalOrType] TT31 [. T7]
  construct TT4 [repeat barLiteralsAndTypes] T8 [prepend TT31]
  construct NewD [defineStatement]
	'define T1 TT3 TT4
	'end 'define
  % construct d_D [defineStatement] NewD [print]
  replace * [statement*] D S1 [statement*] 
  % construct d_D [defineStatement] NewD [print]
  by S1 [replace_redefine R NewD] 
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
  % construct d_P [program] P [print]
  construct R [redefineStatement*] _ [^ P]
  %  construct d_R [redefineStatement*] R [print]
  by P [redefine2define_one each R]
end function
