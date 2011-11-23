% OOT unit interface extractor
% J.R. Cordy, 1.5.92
% This TXL spec extracts the interface from an OOT unit file
% commented in the David Penny style.

include "OOT.Grm"

% allow marking of declarations
redefine declaration_or_statement
        [NL] [opt 'MARKED] [declaration] [opt ';] [NL] 
    |   [variable_binding] [opt ';] [NL] 
    |   [statement] [opt ';] [NL] 
    |   [commentlines]          
end redefine


% build the stub
function main
    replace [program]
        C [compilation]
    by
        C [normalizeExportLists] 
          [removeExportComments] 
          [extractModuleUnitStub]
          [extractMonitorUnitStub]
          [extractClassUnitStub]
end function

rule normalizeExportLists
    replace [export_list]
        'export ExportItems [list export_item+]
    by
        'export ( ExportItems )
end rule

rule removeExportComments
    replace [export_list]
        ExpList [export_list]
    where
        ExpList [?removeComments]
    by
        ExpList [removeComments]
end rule

rule removeComments
    replace [opt commentlines]
        C [commentlines]
    by
        % doodly
end rule

function extractMonitorUnitStub
    replace [compilation]
        Comments [opt commentlines]
        unit monitor M [id] ColonExpn [opt colon_expn] 
            Implement [opt implement_clause]
            ImplementBy [opt implement_by_clause]
            Imports [opt import_list]
            'export ( Exports [list export_item+] )
            Pre [opt pre_clause]
            Body [repeat declaration_or_statement]
            Post [opt post_clause] 
        'end M

    by
        Comments
        unit monitor M ColonExpn
            'export ( Exports )
            Body [removeStatements] 
                 [markDeclaration each Exports]
                 [deleteUnmarkedDeclarations]
                 [removeMarks]
                 [sortBy each Exports]
        'end M
end function

function extractModuleUnitStub
    replace [compilation]
        Comments [opt commentlines]
        unit module M [id] 
            Implement [opt implement_clause]
            ImplementBy [opt implement_by_clause]
            Imports [opt import_list]
            'export ( Exports [list export_item+] )
            Pre [opt pre_clause]
            Body [repeat declaration_or_statement]
            Post [opt post_clause] 
        'end M

    by
        Comments
        unit module M 
            'export ( Exports )
            Body [removeStatements] 
                 [markDeclaration each Exports]
                 [deleteUnmarkedDeclarations]
                 [removeMarks]
                 [sortBy each Exports]
        'end M
end function

function extractClassUnitStub
    replace [compilation]
        Comments [opt commentlines]
        unit Monitor [opt 'monitor] class M [id] 
            Expand [opt expand_clause]
            Implement [opt implement_clause]
            ImplementBy [opt implement_by_clause]
            Imports [opt import_list]
            'export ( Exports [list export_item+] )
            Pre [opt pre_clause]
            Body [repeat declaration_or_statement]
            Post [opt post_clause] 
        'end M

    by
        Comments
        unit Monitor class M 
            'export ( Exports )
            Body [removeStatements] 
                 [markDeclaration each Exports]
                 [deleteUnmarkedDeclarations]
                 [removeMarks]
                 [sortBy each Exports]
        'end M
end function

rule removeStatements
    replace [repeat declaration_or_statement]
        DeclarationOrStatement [declaration_or_statement]
        Rest [repeat declaration_or_statement]
    where not
        DeclarationOrStatement [isDeclaration] 
    by
        Rest
end rule

function isDeclaration
    match [declaration_or_statement]
        Marked [opt 'MARKED] Declaration [declaration] Semi [opt ';] 
end function

rule markDeclaration Export [export_item]
    deconstruct Export
        Comment [opt commentlines]  
        ExportMethods [repeat export_method] 
        ExportId [id]
    replace [declaration_or_statement]
        Declaration [declaration]
    where 
        Declaration [declares ExportId]
    where not
        Declaration [isModule] [isMonitor] [isClass] 
    by
        'MARKED Declaration [trimProcDeclaration] 
                            [trimFunctionDeclaration]
                            [trimOtherDeclarations]
end rule

function isModule
    match [declaration]
        Module [module_declaration]
end function

function isMonitor
    match [declaration]
        Monitor [monitor_declaration]
end function

function isClass
    match [declaration]
        Class [class_declaration]
end function

rule deleteUnmarkedDeclarations 
    replace [repeat declaration_or_statement]
        Declaration [declaration] Semi [opt ';]
        Rest [repeat declaration_or_statement]
    by
        Rest
end rule

rule removeMarks
    replace [opt 'MARKED]
        'MARKED
    by
        % nada
end rule

rule declares Id [id]
    match [declared_id]
        Id
end rule

function trimProcDeclaration 
    replace [declaration]
        Comments [opt commentlines]
        Proc [proc_spec] Id [id] Parms [opt parameter_list_declaration]
        Imports [opt import_list]
        Body [subprogram_body]
    by
        Comments 
        'deferred Proc Id Parms 
end function

function trimFunctionDeclaration 
    replace [declaration]
        Comments [opt commentlines]
        Fcn [fcn_spec] Id [id] Parms [opt parameter_list_declaration]
            ResultId [opt id] : ResultType [type_spec] 
        Imports [opt import_list]
        Body [subprogram_body]
    by
        Comments 
        'deferred Fcn Id Parms ResultId : ResultType
end function

function trimOtherDeclarations
    replace [declaration]
        Declaration [declaration]
    where not
        Declaration [isSubprogram] 
    by
        Declaration [removeComments]
end function

function isSubprogram
    match [declaration]
        Declaration [subprogram_declaration]
end function

rule sortBy Export [export_item]
    deconstruct Export
        Comment [opt commentlines]  
        ExportMethods [repeat export_method] 
        ExportId [id]
    replace [repeat declaration_or_statement]
        Declaration [declaration_or_statement]
        OtherDeclaration [declaration_or_statement]
        Rest [repeat declaration_or_statement]
    where
        Declaration [declares ExportId]
    construct OtherAndRest [repeat declaration_or_statement]
        OtherDeclaration
        Rest
    by
        OtherAndRest [removeDuplicates ExportId] 
                     [. Declaration]
end rule

rule removeDuplicates DeclaredId [id]
    replace [repeat declaration_or_statement]
        DuplicateDeclaration [declaration_or_statement]
        Rest [repeat declaration_or_statement]
    where
        DuplicateDeclaration [declares DeclaredId]
    by
        Rest
end rule
