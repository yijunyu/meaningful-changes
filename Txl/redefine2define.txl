% redefine2define
% convert all defineStatements to equivalent defineStatements

% auxiliary function: replace the Redefine statement to the new Define statement
function replace_redefine R [redefineStatement] NewD [defineStatement]
  replace * [statement*] R S1 [statement*] 
  construct S [statement*] NewD
  by S [. S1] 
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
	        T1 [typeid]	
		T3 [repeat literalOrType] 
		T4 [repeat barLiteralsAndTypes]	 
	'end 'define
  deconstruct * [literalOrType] T3 '...
  deconstruct D
	'define T1 T7 [repeat literalOrType] T8	[repeat barLiteralsAndTypes] 'end 'define
  construct TT3 [repeat literalOrType] T3 [. T7]
  construct TT4 [repeat barLiteralsAndTypes] T4 [. T8]
  construct NewD [defineStatement]
	'define T1 TT3 TT4
	'end 'define
  replace * [statement*] D S1 [statement*] 
  by S1 [replace_redefine R NewD] 
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
