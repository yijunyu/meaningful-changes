% Parameterized Type Turing dialect
% Jim Cordy
% Queen's University, October 1988

include "Turing.Grm"


% Syntactic forms

redefine declaration
        ...
    |   [parameterized_type_declaration]
end redefine

define parameterized_type_declaration
        'type [opt pervasive_indicator] [id] ( [list id] ) : [type_spec]
end define

define type_spec
        ...
    |   [parameterized_type_instance]
end define

define parameterized_type_instance
        [id] ( [list expn_or_type_spec] )
end define

define expn_or_type_spec
        [id]            % We'll separate the ambiguous case here.
    |   [type_spec]
    |   [expn]  
end define



% Semantic transforms

rule main
    replace [repeat declaration_or_statement] 
        'type OP [opt pervasive_indicator] PTname [id] ( Formals [list id] ) : 
            PTBody [type_spec]
        RestOfScope [repeat declaration_or_statement]
    by
        RestOfScope [fixInstances PTname Formals PTBody]
end rule

rule fixInstances PTname [id] Formals [list id] PTBody [type_spec]
    replace [type_spec]
        PTname ( Actuals [list expn_or_type_spec] )
    by
        PTBody [subsId each Formals Actuals]
                [subsType each Formals Actuals] 
                [subsExpn each Formals Actuals]
end rule

rule subsId Old [id] New [expn_or_type_spec]
    deconstruct New 
        NewName [id]
    replace [id] 
        Old 
    by
        NewName
end rule

rule subsType Old [id] New [expn_or_type_spec]
    deconstruct New 
        NewType [type_spec]
    replace [type_spec] 
        Old 
    by
        NewType
end rule

rule subsExpn Old [id] New [expn_or_type_spec]
    deconstruct New 
        NewExpn [expn]
    replace [primary] 
        Old 
    by
        ( NewExpn )
end rule
