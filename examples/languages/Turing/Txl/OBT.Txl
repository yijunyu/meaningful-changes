% Objective Turing dialect from ICCL TXL Objective Turing paper
% J.R. Cordy, October 1988
% Using new 6.2 predefined externals

include "Turing.Grm"


% Syntactic forms to add object types

redefine type_spec 
        ...
    |   [objectType]            % added new syntactic form     
end redefine 

keys
        'object
end keys

define objectType 
                                                [IN][NL]
        'object                                 [NL][IN]
            [import_list]           % contents same as original Turing module form
            [export_list]     
            [repeat declaration_or_statement]   [EX]
        'end [id]                               [EX][NL]
end define 


% Type class polymorphism syntactic forms

redefine declaration
        ...
    |   [type_class_declaration] % new added syntactic form
end redefine

redefine type_spec
        ...
    |   [instanceType]           % new added
end redefine

define type_class_declaration 
        'type class [id]  ( [list id] ) : [type_spec] 
end define 

keys
        'instance
end keys

define instanceType 
        instance [id]  ( [list expn_or_type_spec] ) 
end define 

define expn_or_type_spec
        [id]                    % This is the ambiguous case - could be either.
    |   [type_spec]             % All types
    |   [expn]                  % All expressions
end define


% Inheritance syntactic forms

redefine objectType 
                                                [IN][NL]
        'object                                 [NL][IN]
            [optRefinementClause]       % added to objectType form
            [import_list] 
            [export_list]     
            [repeat declaration_or_statement]   [EX]
        'end [id]                               [EX][NL]
end redefine 

define optRefinementClause
        [refinementClause]
    |   [empty]
end define

keys
        'refines
end keys

define refinementClause
        'refines [id]   [NL]
end define


% Modified syntax of declarations to allow easy sorting

redefine declaration
        [constant_type_or_module_declaration]
    |   [variable_or_subprogram_declaration]
end redefine

define variable_or_subprogram_declaration
        [variable_declaration]
    |   [variable_binding]
    |   [subprogram_declaration]
end define

define constant_type_or_module_declaration
        [constant_declaration]
    |   [type_class_declaration]  
    |   [type_declaration]
    |   [module_declaration]
end define


% Modified syntax of import and export lists to allow splicing

redefine import_list 
        'import ( [importItems] )       [NL]
end redefine

define importItems
         [list imported_id] 
end define

redefine export_list 
        'export ( [exportItems] )       [NL]
end redefine

define exportItems
        [list exported_id] 
end define



% Rules for transformation of object types
 
function main
    replace [program]
        P [repeat declaration_or_statement]
    by
        P [fixTypeClasses]
          [fixInheritedObjectTypes]
          [fixObjects] 
end function


% Step 1.  Convert Object Types to Modules. 

rule fixObjects 
    replace [repeat declaration_or_statement] 
        type ObName [id] : 
            object 
                ObImport [import_list] 
                ObExport [export_list] 
                ObBody [repeat declaration_or_statement] 
            'end ObName 
        RestOfScope [repeat declaration_or_statement] 
    by
        module ObName 
            ObImport 
            ObExport  [addObjectAndInitializerExport] 
            ObBody 
                [sortDeclarationsAndStatements] 
                [makeObjectRecordTypeAndEnterFields] 
                [makeObjectInitializerProcedureAndEnterStatements] 
                [addObjectParameterToProcedures] 
        'end ObName 
        RestOfScope     
                [transformObjectReferences ObName]
                [transformCollectionObjects ObName]
end rule 


%Step 2. Add Exported Names for the Object Data Record Type and the      
%        Object Initializer Procedure.  

function addObjectAndInitializerExport 
    replace [export_list] 
        'export ( OldExports [list exported_id] ) 
    construct NewExports [list exported_id]
        'DataRecordType, 'InitializeDataRecord
    by
        'export ( NewExports [, OldExports] )
end function


%Step 3. Sort the Declarations and Statements in the Object Module. 

rule sortDeclarationsAndStatements 
    replace [repeat declaration_or_statement] 
        ObBody [repeat declaration_or_statement] 
    construct NewBody [repeat declaration_or_statement]
        ObBody 
            [sortDS]    % declarations before statements 
            [sortTV]    % constants, types and modules before 
                        %        variables and procedures 
            [sortVP]    % then variables, then procs 
    where not
        NewBody [= ObBody]
    by
        NewBody
end rule 

rule sortDS 
    replace [repeat declaration_or_statement] 
        S [statement] 
        D [declaration] 
        R [repeat declaration_or_statement] 
    by
        D 
        S 
        R 
end rule 

rule sortTV 
    replace [repeat declaration_or_statement] 
        V [variable_or_subprogram_declaration] 
        T [constant_type_or_module_declaration] 
        R [repeat declaration_or_statement] 
    by
        T 
        V 
        R 
end rule 

rule sortVP 
    replace [repeat declaration_or_statement] 
        P [subprogram_declaration] 
        V [variable_declaration] 
        R [repeat declaration_or_statement] 
    by
        V 
        P 
        R 
end rule 


% Step 4.  Gather the Object Module's Private Variables into the Object Data Record Type.  

function makeObjectRecordTypeAndEnterFields 
    replace [repeat declaration_or_statement] 
        ObBody [repeat declaration_or_statement] 
    by
        ObBody
            [makeObjectRecordType]  
            [enterObjectRecordTypeFields] 
end function 

rule makeObjectRecordType 
    replace [repeat declaration_or_statement] 
        V [variable_declaration] 
        P [subprogram_declaration]
        Rest  [repeat declaration_or_statement] 
    by
        V 
        type 'DataRecordType : 
            record 
            'end record 
        P
        Rest 
end rule 

rule enterObjectRecordTypeFields 
    replace [repeat declaration_or_statement] 
        var V [id] : T [type_spec] 
        type 'DataRecordType : 
            record 
                R [repeat record_field] 
            'end record 
        RestOfScope [repeat declaration_or_statement] 
    by
        type 'DataRecordType : 
            record 
                V : T 
                R 
            'end record 
        RestOfScope  [fixObjectVariableReferences V] 
end rule 


% Step 5.   Change References to the Object's Private Variables to 
%     Reference the Data Record Parameter of the Object Procedures.  

rule fixObjectVariableReferences Var [id] 
    replace [reference]
        Var Rest [repeat component_selector]
    by
        DataRecord . Var Rest
end rule

% Step 6.  Gather the Object Module's Initializing Statements into the 
%     Object Data Record Initializer Procedure.  

rule makeObjectInitializerProcedureAndEnterStatements 
    replace [repeat declaration_or_statement] 
        P [subprogram_declaration] 
        S [statement] 
        Rest [repeat declaration_or_statement] 
    by
        P 
        procedure InitializeDataRecord (var DataRecord : DataRecordType) 
            S 
            Rest 
        'end InitializeDataRecord 
end rule 


% Step 7.  Add an Object Data Record Parameter to Each Procedure of the Module.  

rule addObjectParameterToProcedures 
    replace [repeat declaration_or_statement] 
        procedure PName [id]  ( Arg1 [parameter_declaration]  
                  RestOfArgs [repeat comma_parameter_decl] ) 
            PBody [subprogram_body] 
        procedure InitializeDataRecord  
                InitPList [opt parameter_list] 
            IBody [subprogram_body] 
        RestOfScope [repeat declaration_or_statement] 
    by
        procedure InitializeDataRecord  InitPList 
            IBody 
        procedure PName ( var DataRecord : DataRecordType,  
                    Arg1  RestOfArgs ) 
            PBody 
        RestOfScope 
end rule 


% Step 8. Transform Declarations of Instances of the Object Type into Declarations of 
%       Object DataRecords.  

rule transformObjectReferences  ObName [id] 
    replace [repeat declaration_or_statement] 
        var ObVar [id] : ObName 
        RestOfScope [repeat declaration_or_statement] 
    by
        var ObVar : ObName . DataRecordType 
        ObName . InitializeDataRecord (ObVar) 
        RestOfScope [changeObjectProcedureCalls ObVar ObName] 
                    [changeObjectFunctionCalls ObVar ObName] 
                    [changeObjectNullaryFunctionCalls ObVar ObName]
end rule 


% Step 9.  Change Calls to the Object Instance's Procedures into Calls to the Object Module.  

rule changeObjectProcedureCalls  ObVar [id]  ObName [id] 
    replace [procedure_call] 
        ObVar . PName [id]  ( FirstArg [expn]  RestOfArgs [repeat comma_expn] ) 
    by
        ObName . PName (ObVar, FirstArg RestOfArgs) 
end rule 

rule changeObjectFunctionCalls  ObVar [id]  ObName [id] 
    replace [reference] 
        ObVar . PName [id]  ( FirstArg [expn]  RestOfArgs [repeat comma_expn] ) 
    by
        ObName . PName (ObVar, FirstArg RestOfArgs) 
end rule 

rule changeObjectNullaryFunctionCalls  ObVar [id]  ObName [id] 
    replace [reference] 
        ObVar . PName [id]  
    by
        ObName . PName (ObVar)
end rule 


% Rules for transforming type classes

rule fixTypeClasses 
    replace [repeat declaration_or_statement] 
        type class TCname [id] ( Formals [list id] ) : 
                TCbody  [type_spec] 
        RestOfScope [repeat declaration_or_statement] 
    by
        RestOfScope [fixInstantiations TCname Formals TCbody] 
end rule 

rule fixInstantiations TCname [id] Formals [list id] TCbody [type_spec] 
    replace [declaration] 
        type ITname [id] : 
            instance TCname ( Actuals [list expn_or_type_spec] ) 
    by
        type ITname : 
            TCbody  [substituteId TCname ITname]
                        [substituteAmbiguousArgs each Formals Actuals]
                        [substituteExpnArgs each Formals Actuals]
                        [substituteTypeArgs each Formals Actuals]
end rule 

rule substituteId Old [id] New [id] 
    replace [id] 
        Old 
    by
        New 
end rule 

rule substituteAmbiguousArgs Old [id] New [expn_or_type_spec]
    deconstruct New
        NewName [id]
    replace [id]
        Old
    by
        NewName
end rule

rule substituteExpnArgs Old [id] New [expn_or_type_spec]
    deconstruct New
        NewExpn [expn]
    replace [primary]
        Old
    by
        ( NewExpn )
end rule

rule substituteTypeArgs Old [id] New [expn_or_type_spec]
    deconstruct New
        NewTypeSpec [type_spec]
    replace [type_spec]
        Old
    by
        NewTypeSpec
end rule


% Rules for handling inheritance

rule fixInheritedObjectTypes
    replace [repeat declaration_or_statement]
        type Oname [id]  :
            object
                Oimp [import_list]
                Oexp [export_list]
                Obody [repeat declaration_or_statement]
            'end Oname
        RestOfScope [repeat declaration_or_statement]
    where
        RestOfScope [hasRefines Oname]
    by
        type Oname  :
            object
                Oimp
                Oexp 
                Obody
            'end Oname
        RestOfScope  [fixInheritedObjectTypeRefinements Oname Oimp Oexp Obody]
end rule

function hasRefines OName [id]
    match * [refinementClause]
        'refines OName
end function

rule fixInheritedObjectTypeRefinements  Oname [id] Oimp [import_list] Oexp [export_list] 
        Obody [repeat declaration_or_statement]
    replace [repeat declaration_or_statement]
        type ORname [id] :
            object 
                refines Oname 
                'import ( ORimports [list imported_id] )
                'export ( ORexports [list exported_id] ) 
                ORbody [repeat declaration_or_statement]
            'end ORname
        RestOfScope [repeat declaration_or_statement]
    by
        type ORname :
            object  
                Oimp [addNewImports ORimports]
                Oexp [addNewExports ORexports]
                Obody [. ORbody]
            'end ORname
        RestOfScope
end rule

function spliceBody ORbody [repeat declaration_or_statement]
    replace [repeat declaration_or_statement]
        OBfirst [declaration_or_statement] OBrest [repeat declaration_or_statement]
    by
        OBfirst OBrest [spliceBody ORbody] [catenateBody ORbody]
end function

function catenateBody ORbody [repeat declaration_or_statement]
    replace [repeat declaration_or_statement]
        OBtail [empty]
    by
        ORbody 
end function

function addNewImports ORimports [list imported_id] 
    replace [import_list]
        'import ( Oimports [list imported_id] ) 
    by
        'import ( Oimports [, ORimports] )
end function

function addNewExports ORexports [list exported_id] 
    replace [export_list]
        'export ( Oexports [list exported_id] )
    by
        'export ( Oexports [, ORexports] )
end function


% Rules to allow dynamic collections of objects

rule transformCollectionObjects ObName [id]
    replace [repeat declaration_or_statement]
        var ObVar [id] : collection of ObName
        RestOfScope [repeat declaration_or_statement]
    construct NewObVar [id]
        ObVar [!]
    by
        var ObVar : collection of ObName . DataRecordType
        RestOfScope 
            [changeCollectionAllocations ObVar NewObVar ObName]
            [changeCollectionProcs ObVar NewObVar ObName]
end rule

rule changeCollectionAllocations ObVar [id] NewObVar [id] ObName [id]
    replace [repeat declaration_or_statement]
        new ObVar , Ptr [reference]
        RestOfScope [repeat declaration_or_statement]
    by
        new NewObVar , Ptr 
        ObName . InitializeDataRecord ( NewObVar ( Ptr ) )
        RestOfScope
end rule

rule changeCollectionProcs ObVar [id] NewObVar [id] ObName [id]
    replace [procedure_call]
        ObVar Sub [subscript] . PName [id] ( Acts [expn] RestActs [repeat comma_expn] )
    by
        ObName . PName (NewObVar Sub, Acts RestActs)
end rule
