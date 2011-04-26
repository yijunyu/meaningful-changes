%http://www.program-transformation.org/Sts/ExactClonesUsingTXL
include "java.grm"

redefine class_body_declaration
    ... | [empty]
end define

redefine class_declaration
    ... | [empty]
end define

redefine program
    ... | [empty]
end define

define structured_entity
    [class_body_declaration]
  | [class_declaration]
  | [program]
end define

redefine program
  ... | [structured_entity]
end define

function main
    replace [program] P [program]
    construct StructuredClones [repeat structured_entity] _ [findStructuredStatementClones P]
    export CloneNumber [number] 0
    by P  % bigger clone first
	[markCloneInstances_program each StructuredClones]
        [markCloneInstances_class_declaration each StructuredClones]
	[markCloneInstances_class_body_declaration each StructuredClones]
end function

function main1
    replace [program] P [program]
    construct StructuredClones [repeat structured_entity] _ [findStructuredStatementClones P]
    export CloneNumber [number] 0
    by P  % bigger clone first
	[markCloneInstances_program each StructuredClones]
        [markCloneInstances_class_declaration each StructuredClones]
	[markCloneInstances_class_body_declaration each StructuredClones]
end function

function append_class_body_declaration A [class_body_declaration]
    replace [structured_entity*] Seq [structured_entity*]
    construct A1 [structured_entity]  A
    by Seq [. A1] 
end function
rule markCloneInstances_class_body_declaration StructuredClone [structured_entity]
    import CloneNumber [number]
    export CloneNumber CloneNumber [+ 1]
    deconstruct StructuredClone Structured_class_body_declaration [class_body_declaration]
    % construct debug_SC [class_body_declaration] Structured_class_body_declaration [print]
    replace [class_body_declaration] Structured_class_body_declaration by
end rule

function append_program A [program]
    replace [structured_entity*] Seq [structured_entity*]
    construct A1 [structured_entity]  A
    by Seq [. A1] 
end function
rule markCloneInstances_program StructuredClone [structured_entity]
    import CloneNumber [number]
    export CloneNumber CloneNumber [+ 1]
    deconstruct StructuredClone Structured_program [program]
    replace [program] Structured_program by
end rule

function append_class_declaration A [class_declaration]
    replace [structured_entity*] Seq [structured_entity*]
    construct A1 [structured_entity]  A
    by Seq [. A1] 
end function
rule markCloneInstances_class_declaration StructuredClone [structured_entity]
    import CloneNumber [number]
    export CloneNumber CloneNumber [+ 1]
    deconstruct StructuredClone Structured_class_declaration [class_declaration]
    replace [class_declaration] Structured_class_declaration by %
end rule

function findStructuredStatementClones P [program] 
    construct Structured_class_body_declaration [repeat class_body_declaration] _ [^ P]
    construct StructuredEntities_class_body_declaration [structured_entity*] 
	_ [append_class_body_declaration each Structured_class_body_declaration] 

    construct Structured_program [repeat program] _ [^ P]
    construct StructuredEntities_program [structured_entity*] 
	_ [append_program each Structured_program] 

    construct Structured_class_declaration [repeat class_declaration] _ [^ P]
    construct StructuredEntities_class_declaration [structured_entity*] 
	_ [append_class_declaration each Structured_class_declaration]

    replace [repeat structured_entity] by _ 
	[addIfClone StructuredEntities_class_body_declaration each StructuredEntities_class_body_declaration] 
	[addIfClone StructuredEntities_program each StructuredEntities_program] 
	[addIfClone StructuredEntities_class_declaration each StructuredEntities_class_declaration] 
end function

function addIfClone StructuredEntities [repeat structured_entity] Stmt [structured_entity]
    deconstruct * StructuredEntities
        Stmt
        Rest [repeat structured_entity]
    deconstruct * [structured_entity] Rest
        Stmt
    replace [repeat structured_entity]
        StructuredClones [repeat structured_entity]
    deconstruct not * [structured_entity] StructuredClones
        Stmt
    by
        StructuredClones [. Stmt]
end function
