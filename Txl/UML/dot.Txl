include "UML/uml.Grm"
include "UML/dot.Grm"
function main
    replace [dot_program]
        P [dot_program]
    by
        P [doTransform]
end function

function doTransform
    replace [dot_program]
        P [dot_program]
    % import command line args
    import TXLargs [repeat stringlit]
    deconstruct * TXLargs
        "-umlfile" FileName [stringlit] MoreOptions [repeat stringlit]
    % parse UML class diagram file
    construct UmlP [uml_dot_program]
        _ [read FileName]
    % get list of classes relations
    deconstruct UmlP
        CRO [repeat class_relation]
    % apply inheritance relation transforms
    construct CR [repeat class_relation]
        _ [removeSelfInheritance each CRO] [rlInheritanceToDefault] [lrInheritanceToDefault]
    % make the list of found classes to not include already defined classes
    construct DefinedClasses [repeat id]
        _
    export DefinedClasses
    by
        % add class definition as nodes
        P [addClasses each CR]
        % add inheritance associations as nodes
          [addEdges each CR]
end function

function addClasses CR [class_relation]
    replace * [repeat stmt_list]
        Stms [repeat stmt_list]
    % get classes
    deconstruct CR
        C1 [class_definition] '^ C2 [class_definition]
    by
        % try to add each class definition
        Stms [addClass C1] [addClass C2]
end function

% build and add class node to digraph
function addClass C [class_definition]
    replace * [repeat stmt_list]
        Stms [repeat stmt_list]
    % get class name ids
    deconstruct C
        '[ CName [id] AM [opt class_attributes_methods] ']
    % get attributes and methods
    construct AttrsMethods [stringlit]
        _ [addAttrsMethods AM]
    % assemble the class node label with name, attributes and methods
    construct L [stringlit]
        _ [+ "{"] [+ CName] [+ AttrsMethods] [+"}"]
    % build node_stmt
    construct E [stmt_list]
        CName '[ 'label '= L ']
    % ensure we have no class node defined before with this name
    import DefinedClasses [repeat id]
    deconstruct not * [id] DefinedClasses
        CName
    construct DefinedClassesAdded [repeat id]
        DefinedClasses [. CName]
    export DefinedClasses
        DefinedClassesAdded
    by
        % add new edge_stmt to digraph
        Stms [. E]
end function

% add attributes and methods if available
function addAttrsMethods AM [opt class_attributes_methods]
    % ensure we have at least one | delimeter
    deconstruct AM
        '| _ [repeat class_attribute] _ [class_methods]
    replace [stringlit]
        _ [stringlit]
    % get the sequence of attributes and methods
    construct Attrs [repeat class_attribute]
        _ [^ AM]
    construct Methods [repeat class_method]
        _ [^ AM]
    % add each of attributes and methods
    construct S [stringlit]
        _ [+ "|"] [addAttr each Attrs] [+ "|"] [addMethod each Methods]
    by
        S
end function

% add to string one attribute
function addAttr A [class_attribute]
    replace [stringlit]
        S [stringlit]
    construct NS [stringlit]
        _ [quote A] [+ "\l"]
    by
        S [+ NS]
end function

% add to string one methods
function addMethod M [class_method]
    replace [stringlit]
        S [stringlit]
    construct NS [stringlit]
        _ [quote M] [+ "\l"]
    by
        S [+ NS]
end function

% add edges between classes nodes
function addEdges CR [class_relation]
    replace * [repeat stmt_list]
        Stms [repeat stmt_list]
    % get class name ids
    deconstruct CR
        '[ C1 [id] _ [opt class_attributes_methods] '] '^ '[ C2 [id] _ [opt class_attributes_methods] ']
    % build edge_stmt
    construct E [stmt_list]
        C2 '-> C1
    by
        % add new edge_stmt to digraph
        Stms [. E]
end function


rule rlInheritanceToDefault
    replace [class_relation]
        C1 [class_definition] '^- C2 [class_definition]
    by
        C1 '^ C2
end rule

rule lrInheritanceToDefault
    replace [class_relation]
        C1 [class_definition] '-^ C2 [class_definition]
    by
        C2 '^ C1
end rule

function removeSelfInheritance CR [class_relation]
    replace [repeat class_relation]
        CRStart [repeat class_relation]
    deconstruct CR
        '[ C1 [id] _ [opt class_attributes_methods] '] _ [inheritance_association] 
        '[ C2 [id] _ [opt class_attributes_methods] ']
    where not
        C1 [= C2]
    by
        CRStart [. CR]
end function

