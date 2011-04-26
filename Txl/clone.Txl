%http://www.program-transformation.org/Sts/ExactClonesUsingTXL
include "java.grm"

redefine class_body_declaration
        ...
    |   [empty]
    |   [marked_statement]
end redefine

define marked_statement
        [xmltag]         [NL][IN] 
            [class_body_declaration]  [EX] 
        [xmlend]         [NL]
end define

define xmltag
        < [SPOFF] [id] [SP] [id] = [number] > [SPON]
end define

define xmlend
        < [SPOFF] / [id] > [SPON]
end define

% Main program

function main
    replace [program]
        P [program]
    construct StructuredClones [repeat class_body_declaration]
        _ [findStructuredStatementClones P]
    % construct debug_SS [class_body_declaration*] StructuredClones [print]
    export CloneNumber [number] 0
    by
        P [markCloneInstances each StructuredClones]
end function

function findStructuredStatementClones P [program] 
    % construct debug_P [program] P [print]
    construct StructuredStatements [repeat class_body_declaration]
            _ [^ P]
    % construct debug_SS [class_body_declaration*] StructuredStatements [print]
    replace [repeat class_body_declaration]
        % empty to begin with
    by
        _ [addIfClone StructuredStatements each StructuredStatements]
end function

function addIfClone StructuredStatements [repeat class_body_declaration] Stmt
[class_body_declaration]
    deconstruct * StructuredStatements
        Stmt
        Rest [repeat class_body_declaration]
    deconstruct * [class_body_declaration] Rest
        Stmt
    replace [repeat class_body_declaration]
        StructuredClones [repeat class_body_declaration]
    deconstruct not * [class_body_declaration] StructuredClones
        Stmt
    % construct debug_SS [class_body_declaration] Stmt [print]
    by
        StructuredClones [. Stmt]
end function

rule markCloneInstances StructuredClone [class_body_declaration]
    import CloneNumber [number]
    export CloneNumber 
        CloneNumber [+ 1]
    skipping [marked_statement]
    replace [class_body_declaration]
        StructuredClone
    by
        % '< 'clone 'name '= CloneNumber '> StructuredClone '< '/ 'clone '>
end rule
