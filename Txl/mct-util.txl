% Auxiliary function
%
function contains Object  [any]
    match  *  [any]
        Object 
end function
%
% Convert an ID into a singleton array of literalOrExpression
%
function id_to_type ID [id]
 replace [literalOrExpression*] L [literalOrExpression*]
 construct T [literalOrExpression*] '[ ID ']
 by L [. T]
end function

%
% Convert a literal into a singleton array of literalOrType
%
function literal_to_type L [literal]
 replace [literalOrVariable*] LL [literalOrVariable*]
 construct T [literalOrVariable*] L 
 by LL [. T]
end function

%
% apply rules to the specific term
%
function pattern_replacement0 T [type] L [ruleApplication+] LoT [literalOrType]
 replace [literalOrVariable*] Pattern [literalOrVariable*]
 by Pattern [pattern_replacement_prefer_per_literal T L LoT] 
	    [pattern_replacement_prefer_per_literal1 T L LoT] 
	    [pattern_replacement_prefer_per_literal2 T L LoT] 
end function
% case: literal
% 	no need to use T
function pattern_replacement_prefer_per_literal T [type] R [ruleApplication+] LoT [literalOrType]
 replace [literalOrVariable*] Pattern [literalOrVariable*]
 deconstruct * LoT L [literal]
 construct Var [literalOrVariable*] L 
 import Expression [literalOrExpression*]
 construct E [literalOrExpression] L
 export Expression Expression [. E]
 by Pattern [. Var]
end function
% case: type = T
function pattern_replacement_prefer_per_literal1 T [type] R [ruleApplication+] LoT [literalOrType]
 replace [literalOrVariable*] Pattern [literalOrVariable*]
 deconstruct LoT T
 construct X [id] 'X 
 construct V [varid] X [!]
 construct V1 [varid] X [!]
 construct Var [literalOrVariable] V T 
 import Expression [literalOrExpression*]
 import Constructors [constructDeconstructImportExportOrCondition*]
 construct C [constructDeconstructImportExportOrCondition] 'construct V1 T V R
 construct E [literalOrExpression] V1
 export Constructors Constructors [. C]
 export Expression Expression [. E]
 by Pattern [. Var]
 % ignore the variable in the Expression
end function
% case: type != T
function pattern_replacement_prefer_per_literal2 T [type] R [ruleApplication+] LoT [literalOrType]
 replace [literalOrVariable*] Pattern [literalOrVariable*]
 deconstruct not LoT T
 deconstruct LoT T1 [type]
 construct S [stringlit] _ [quote T1]
 where not S [grep "NL"]
 construct X [id] 'X 
 construct V [varid] X [!]
 construct Var [literalOrVariable] V T1 
 import Expression [literalOrExpression*]
 construct E [literalOrExpression] V
 export Expression Expression [. E]
 by Pattern [. Var]
end function

%
% keep the literalOrType in Pattern if it is a literal, or the same as the typeid I
% keep the literalOrType in Expression if it is a literal, or not the same as the typeid I
%
function pattern_replacement T [type] LoT [literalOrType]
 replace [literalOrVariable*] Pattern [literalOrVariable*]
 by Pattern [pattern_replacement_ignore_per_literal T LoT] 
	    [pattern_replacement_ignore_per_literal1 T LoT] 
	    [pattern_replacement_ignore_per_literal2 T LoT] 
end function
% case: literal
% 	no need to use T
function pattern_replacement_ignore_per_literal T [type] LoT [literalOrType]
 replace [literalOrVariable*] Pattern [literalOrVariable*]
 deconstruct * LoT L [literal]
 construct Var [literalOrVariable*] L 
 import Expression [literalOrExpression*]
 construct E [literalOrExpression] L
 export Expression Expression [. E]
 by Pattern [. Var]
end function
% case: type = T
function pattern_replacement_ignore_per_literal1 T [type] LoT [literalOrType]
 replace [literalOrVariable*] Pattern [literalOrVariable*]
 deconstruct LoT T
 construct X [id] 'X 
 construct V [varid] X [!]
 construct Var [literalOrVariable] V T 
 by Pattern [. Var]
 % ignore the variable in the Expression
end function
% case: type != T
function pattern_replacement_ignore_per_literal2 T [type] LoT [literalOrType]
 replace [literalOrVariable*] Pattern [literalOrVariable*]
 deconstruct not LoT T
 deconstruct LoT T1 [type]
 construct S [stringlit] _ [quote T1]
 where not S [grep "NL"]
 construct X [id] 'X 
 construct V [varid] X [!]
 construct Var [literalOrVariable] V T1 
 import Expression [literalOrExpression*]
 construct E [literalOrExpression] V
 export Expression Expression [. E]
 by Pattern [. Var]
end function

%
% Pattern use N1, Expression use N2 for the variable name
%
function pattern_replacement_N12 T [type] LoT [literalOrType]
 replace [literalOrVariable*] Pattern [literalOrVariable*]
 by Pattern [pattern_replacement_ignore_per_literal T LoT] 
	    [pattern_replacement_ignore_per_literal1_N12 T LoT] 
	    [pattern_replacement_ignore_per_literal2 T LoT] 
end function
% case: type = T
function pattern_replacement_ignore_per_literal1_N12 T [type] LoT [literalOrType]
 replace [literalOrVariable*] Pattern [literalOrVariable*]
 deconstruct LoT T
 construct N1 [id] 'N1 
 construct N2 [id] 'N2 
 construct V1 [varid] N1 
 construct V2 [varid] N2 
 construct Var1 [literalOrVariable] V1 T 
 import Expression [literalOrExpression*]
 construct E [literalOrExpression] V2
 export Expression Expression [. E]
 by Pattern [. Var1]
end function

function literal_to_expr ID [literal]
 replace [literalOrExpression*] L [literalOrExpression*]
 construct T [literalOrExpression*] ID 
 by L [. T]
end function

% Assume that "This" is the name of the current term
function rule_application_to_expr Var [varid] RuleApps [repeat ruleApplication+]
 replace [literalOrExpression*] L [literalOrExpression*]
 construct E [expression] Var RuleApps 
 construct T [literalOrExpression] E
 by L [. T]
end function
