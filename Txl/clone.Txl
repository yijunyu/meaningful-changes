%http://www.program-transformation.org/Sts/ExactClonesUsingTXL
include "java.grm"

redefine class_body_declaration
    ... | [empty]
end define
function find_replace_class_body_declaration
    replace [program] P [program]
    construct StructuredClones [repeat class_body_declaration] _ [findStructuredStatementClones_class_body_declaration  P]
    by P  [markCloneInstances_class_body_declaration each StructuredClones]
end function
rule markCloneInstances_class_body_declaration StructuredClone [class_body_declaration]
    import CloneNumber [number]
    export CloneNumber CloneNumber [+ 1]
    replace [class_body_declaration] StructuredClone by
end rule
function findStructuredStatementClones_class_body_declaration P [program] 
    construct Structured_class_body_declaration [repeat class_body_declaration] _ [^ P]
    replace [repeat class_body_declaration] by _ 
	[addIfClone_class_body_declaration Structured_class_body_declaration each Structured_class_body_declaration] 
end function
function addIfClone_class_body_declaration Structured [repeat class_body_declaration] Stmt [class_body_declaration]
    deconstruct * Structured
        Stmt
        Rest [repeat class_body_declaration]
    deconstruct * [class_body_declaration] Rest
        Stmt
    replace [repeat class_body_declaration]
        StructuredClones [repeat class_body_declaration]
    deconstruct not * [class_body_declaration] StructuredClones
        Stmt
    by
        StructuredClones [. Stmt]
end function

redefine program
    ... | [empty]
end define
function find_replace_program
    replace [program] P [program]
    construct StructuredClones [repeat program] _ [findStructuredStatementClones_program  P]
    by P  [markCloneInstances_program each StructuredClones]
end function
rule markCloneInstances_program StructuredClone [program]
    import CloneNumber [number]
    export CloneNumber CloneNumber [+ 1]
    replace [program] StructuredClone by
end rule
function findStructuredStatementClones_program P [program] 
    construct Structured_program [repeat program] _ [^ P]
    replace [repeat program] by _ 
	[addIfClone_program Structured_program each Structured_program] 
end function
function addIfClone_program Structured [repeat program] Stmt [program]
    deconstruct * Structured
        Stmt
        Rest [repeat program]
    deconstruct * [program] Rest
        Stmt
    replace [repeat program]
        StructuredClones [repeat program]
    deconstruct not * [program] StructuredClones
        Stmt
    by
        StructuredClones [. Stmt]
end function

redefine class_declaration
    ... | [empty]
end define
function find_replace_class_declaration
    replace [program] P [program]
    construct StructuredClones [repeat class_declaration] _ [findStructuredStatementClones_class_declaration  P]
    by P  [markCloneInstances_class_declaration each StructuredClones]
end function
rule markCloneInstances_class_declaration StructuredClone [class_declaration]
    import CloneNumber [number]
    export CloneNumber CloneNumber [+ 1]
    replace [class_declaration] StructuredClone by
end rule
function findStructuredStatementClones_class_declaration P [program] 
    construct Structured_class_declaration [repeat class_declaration] _ [^ P]
    replace [repeat class_declaration] by _ 
	[addIfClone_class_declaration Structured_class_declaration each Structured_class_declaration] 
end function
function addIfClone_class_declaration Structured [repeat class_declaration] Stmt [class_declaration]
    deconstruct * Structured
        Stmt
        Rest [repeat class_declaration]
    deconstruct * [class_declaration] Rest
        Stmt
    replace [repeat class_declaration]
        StructuredClones [repeat class_declaration]
    deconstruct not * [class_declaration] StructuredClones
        Stmt
    by
        StructuredClones [. Stmt]
end function


function main
    replace [program] P [program]
    export CloneNumber [number] 0
    by P  [find_replace_program]
          [find_replace_class_declaration]
	  [find_replace_class_body_declaration]
end function
