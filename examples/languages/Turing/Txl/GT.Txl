% Generic Turing dialect
% Charlie Halpern, University of Toronto, January 1986
% revised by Jim Cordy, Queen's University, November 1988

include "Turing.Grm"

% Syntactic forms

redefine declaration
        ...
    |   [generic_declaration]
    |   [instance_declaration]
end redefine

define generic_declaration
        generic [id] ( [list id] )      [NL][IN]
                [declaration]           [EX]
end define

define instance_declaration
        instance [id] : [id] ( [list expn_or_type_spec] )
end define

define expn_or_type_spec
        [id]            % This is the ambiguous case - could be either.
    |   [type_spec]     % All types
    |   [expn]          % All expressions
end define


% Semantic transforms

rule main
    replace [repeat declaration_or_statement]
        generic Gname [id] ( Formals [list id] )
            Decl [declaration]
        RestOfScope [repeat declaration_or_statement]
    by
        RestOfScope [fixInstantiations Gname Formals Decl]
end rule

rule fixInstantiations Gname [id] Formals [list id] BaseDecl [declaration]
    replace [declaration]
        instance Iname [id] : Gname ( Actuals [list expn_or_type_spec] )
    by
        BaseDecl
            [substId Gname Iname]
            [substAmbiguousArgs each Formals Actuals]
            [substExpnArgs each Formals Actuals]
            [substTypeArgs each Formals Actuals]
end rule

rule substId Old [id] New [id]
    replace [id]
        Old 
    by
        New
end rule

rule substAmbiguousArgs OldName [id] New [expn_or_type_spec]
    deconstruct New
        NewName [id]
    replace [id]
        OldName
    by
        NewName
end rule

rule substExpnArgs OldName [id] New [expn_or_type_spec]
    deconstruct New
        NewExpn [expn]
    replace [primary]
        OldName
    by
        ( NewExpn )
end rule

rule substTypeArgs Old [id] New [expn_or_type_spec]
    deconstruct New
        NewTypeSpec [type_spec]
    replace [type_spec]
        Old
    by
        NewTypeSpec
end rule
