% TXL ruleset for transforming from REX extended Modula-2
% to original unextended Modula-2
% Georg Etzkorn, GMD Karlsruhe, 25.02.91
% using new 6.2 predefined externals

% Grammar for REX extended Modula-2
include "rmi.Grm"


% The main rule - we search each program module
% for the extensions, and apply transforms to 
% implement them in unextended Modula-2

function main
  replace [program]
    P [program_module]
  by
    P [transformHandles]
      [transformCommunication] 
end function


function transformCommunication
  replace [program_module]
      MODULE ModuleName [id] OptPrio [opt priority] ;
          Imports [repeat import_]
          Body [block]
      ModuleName .

  construct PreId [id] 
      XdrM2_
  construct ModuleId [id]
      PreId [_ ModuleName]

  by
      MODULE ModuleName OptPrio;
          IMPORT ModuleId;
          Imports [addCommunicationProcedureImports]
          Body [addCommunicationInitAndClose]
               [transformCommunicationPrimitives ModuleId] 
               [transformSelectStatements ModuleId]
      ModuleName . 
end function


function addCommunicationProcedureImports
  replace [repeat import_]
      OldImports [repeat import_]
  by
      FROM 'RexComm IMPORT
          'InitComm, 'CloseComm, 
          'AllocHandle, 'ReleaseHandle, 'NoHandle, 'tPortList, 'tHandle,
          'AllocPortList, 'ReleasePortList, 'WaitOnPortList, 'InsertPort;
      OldImports 
end function


function addCommunicationInitAndClose
  replace [block]
      Declarations [repeat declaration]
      BEGIN
          Statements [repeat statement_semi] 
      END
  construct CloseStatement [statement_semi]
      'CloseComm();
  construct NewStatements [repeat statement_semi]
      'InitComm();
      Statements [. CloseStatement]
  by
      Declarations
      BEGIN
          NewStatements
      END
end function


% ------------------------------------------------------------------

rule transformCommunicationPrimitives ModuleId [id]

  construct CallId   [id]  'Call_
  construct WaitId   [id]  'Wait_
  construct AcceptId [id]  'Accept_
  construct ReplyId  [id]  'Reply_

  construct Call   [comm_name]  CALL 
  construct Wait   [comm_name]  WAIT
  construct Accept [comm_name]  ACCEPT
  construct Reply  [comm_name]  REPLY

  replace [statement]
      CommStatement [statement]
  deconstruct CommStatement
      CommCall [communication_call] 
  by
      CommStatement [transformCommunicationCall ModuleId CallId Call]
                    [transformCommunicationCall ModuleId WaitId Wait]
                    [transformCommunicationCall ModuleId AcceptId Accept]
                    [transformCommunicationCall ModuleId ReplyId Reply]
end rule


function transformCommunicationCall ModuleId [id] CommId [id] Command [comm_name]
  replace [statement]
      Command ( PortId [id] , ExpnList [list expression+] ) OptHandle [opt handle]

  construct NullHandle [id]  'NoHandle
  construct CommHandle [id]  NullHandle [extractHandle OptHandle]
  construct CommPortId [id]  CommId [_ PortId]

  by
      ModuleId.CommPortId ( ModuleId.PortId , CommHandle , ExpnList) 
end function


function extractHandle OptHandle [opt handle]
    deconstruct OptHandle
        WITH HandleId [id]
    replace [id]
        'NoHandle
    by
        HandleId
end function


%-------------------------------------------------------------------

rule transformHandles
  replace [block]
      Declarations [repeat declaration]
      BEGIN 
        Statements [repeat statement_semi]
      END

  where
      Declarations [containsHandleDeclarations]

  construct HandleDeclarations [repeat declaration]
      Declarations [deleteNonVariableDeclarations]
                   [deleteNonHandleDeclarations]
                   [mergeVariableDeclarations]

  deconstruct HandleDeclarations
      VAR HandleIL [list id+] : HANDLE ;

  construct HandleList [list id]
      HandleIL

  by
      Declarations [transformHandleDeclarations]
      BEGIN
          Statements [transformHandleStatements HandleList]
      END
end rule


rule containsHandleDeclarations
    match [simple_type]
        HANDLE
end rule


rule transformHandleDeclarations
  skipping [procedure_declaration]
  replace [variable_declaration]
     Idents [ident_list] : HANDLE
  by
     Idents : 'tHandle
end rule


rule deleteNonVariableDeclarations
  skipping [procedure_declaration]
  replace [repeat declaration]
     Declaration [declaration]
     RestOfDeclarations [repeat declaration]
  where not
     Declaration [isVarDeclaration] 
  by
     RestOfDeclarations
end rule


function isVarDeclaration
    match [declaration]
        VAR VD [repeat variable_declaration_semi]
end function


rule deleteNonHandleDeclarations
    replace [repeat variable_declaration_semi]
        VarDeclaration [variable_declaration_semi]
        RestOfVarDeclarations  [repeat variable_declaration_semi]
    where not
        VarDeclaration [isHandleDeclaration] 
    by
        RestOfVarDeclarations
end rule


function isHandleDeclaration
    match [variable_declaration_semi]
        Idents [ident_list] : HANDLE ;
end function


rule mergeVariableDeclarations
    replace [repeat declaration]
        VAR VarDeclaration1 [repeat variable_declaration_semi]
        VAR VarDeclaration2 [repeat variable_declaration_semi]

    construct NewVarDeclaration [repeat variable_declaration_semi]
        VarDeclaration1 [. VarDeclaration2] 
                        [mergeIdentLists]
    by
        VAR NewVarDeclaration
end rule


rule mergeIdentLists
    replace [repeat variable_declaration_semi]
        Idents1 [list id+] : HANDLE ;
        Idents2 [list id+] : HANDLE ;
        RestOfVarDeclarations [repeat variable_declaration_semi]
    construct NewIdents [list id+]
        Idents1 [, Idents2]
    by
        NewIdents : HANDLE ;
        RestOfVarDeclarations
end rule


function transformHandleStatements HandleIds [list id]
    deconstruct HandleIds
        HandleId [id] , OptMoreHandleIds [list id]
    construct ReleaseHandleStatement [statement_semi]
        'ReleaseHandle (HandleId);
    replace [repeat statement_semi]
        Statements [repeat statement_semi]
    by
        'AllocHandle (HandleId);
        Statements [. ReleaseHandleStatement] 
                   [transformHandleStatements OptMoreHandleIds]
end function


%-------------------------------------------------------------

rule transformSelectStatements ModuleId [id]
  replace [block]
      Declarations [repeat declaration]
      BEGIN 
        Statements [repeat statement_semi]
      END
  where
      Statements [containsSelectStatement]

  construct RawPortListId [id]  'XdrM2_PortList
  construct PortListId [id]     RawPortListId [!]

  by
      VAR PortListId : 'tPortList ;
      Declarations
      BEGIN
        Statements [transformSelectStatement ModuleId PortListId]
      END
end rule


rule containsSelectStatement
    match [statement]
        Statement [select_statement]
end rule


rule transformSelectStatement ModuleId [id] PortListId [id]
  replace [repeat statement_semi]
      SELECT
        FirstAlternative [alternative] 
        RestOfAlternatives [repeat or_alternative] 
        OptElse [opt else_statement_sequence]
      END ;
      RestOfStatements [repeat statement_semi]

  construct AllocPortListStatement [repeat statement_semi]
      'AllocPortList (PortListId);   

  construct PortListStatements [repeat statement_semi]
      AllocPortListStatement 
          [mapAlternativeToIf FirstAlternative PortListId ModuleId]
          [mapAlternativesToIfs RestOfAlternatives PortListId ModuleId]

  construct emptyOrCase [repeat or_case]
        %% nothing
  construct OrCases [repeat or_case]
        emptyOrCase [mapAlternativeToCase FirstAlternative ModuleId]
                    [mapAlternativesToCases RestOfAlternatives ModuleId] 

  deconstruct OrCases
        '| FirstCase [case]
           RestOfCases [repeat or_case]

  construct CaseWaitOnPortList [statement_semi]
        CASE 'WaitOnPortList (PortListId) OF
          FirstCase 
          RestOfCases
        END;

  construct ReleasePortListStatement [statement_semi]
        'ReleasePortList (PortListId);

  construct NewStatements [repeat statement_semi]
      PortListStatements [. CaseWaitOnPortList]
                         [. ReleasePortListStatement]
                         [. RestOfStatements]
  by
      NewStatements
end rule


function mapAlternativesToCases Alternatives [repeat or_alternative] ModuleId [id]
  deconstruct Alternatives
      '| FirstAlternative [alternative] 
      RestOfAlternatives [repeat or_alternative]
  replace [repeat or_case]
      OrCases [repeat or_case]
  by 
      OrCases [mapAlternativeToCase FirstAlternative ModuleId]
              [mapAlternativesToCases RestOfAlternatives ModuleId] 
end function


function mapAlternativeToCase Alternative [alternative] ModuleId [id]
  deconstruct Alternative
      OptExpnAnd [opt bool_and] CommCall [communication_call] : 
          AlternativeStatements [repeat statement_semi] 
  deconstruct CommCall
      CommOp [comm_name] ( PortId [id] , ExpnList [exp_list] ) OptHandle [opt handle]
  construct CommStatement [statement]
      CommCall
  replace [repeat or_case]
      RestOfCases [repeat or_case]
  by
      '| ModuleId.PortId : 
          CommStatement [transformCommunicationPrimitives ModuleId] ; 
          AlternativeStatements
      RestOfCases 
end function


function mapAlternativesToIfs Alternatives [repeat or_alternative] PortListId [id] ModuleId [id]
  deconstruct Alternatives
    '| FirstAlternative [alternative] 
    RestOfAlternatives [repeat or_alternative]
  replace [repeat statement_semi]
      Statements [repeat statement_semi]
  by 
      Statements [mapAlternativeToIf FirstAlternative PortListId ModuleId]
                 [mapAlternativesToIfs RestOfAlternatives PortListId ModuleId] 
end function


function mapAlternativeToIf Alternative [alternative] PortListId [id] ModuleId [id]
  deconstruct Alternative
      Guard [guard] : 
          AlternativeStatements [statement_sequence] 
  replace [repeat statement_semi]
      Statements [repeat statement_semi] 
  by 
      Statements [buildGuard1 Guard PortListId ModuleId]
                 [buildGuard2 Guard PortListId ModuleId]
end function


function buildGuard1 Guard [guard] PortListId [id] ModuleId [id]
  deconstruct Guard
      Expn [expression] &&
          CommOp [comm_name]  ( PortId [id] , ExpnList [exp_list] ) OptHandle [opt handle]

  construct NullHandle [id]  'NoHandle
  construct HandleId [id]    NullHandle [extractHandle OptHandle]

  construct IfStatement [statement_semi]
      IF Expn THEN 
          'InsertPort (PortListId, ModuleId.PortId, HandleId); 
      END;

  replace [repeat statement_semi]
      Statements [repeat statement_semi]

  construct NewStatements [repeat statement_semi]
      Statements [. IfStatement]
  by
      NewStatements
end function


function buildGuard2 Guard [guard] PortListId [id] ModuleId [id]
  deconstruct Guard
      CommOp [comm_name]  ( PortId [id] , ExpnList [exp_list] ) OptHandle [opt handle]

  construct NullHandle [id]  'NoHandle
  construct HandleId [id]    NullHandle [extractHandle OptHandle]

  construct InsertPortStatement [statement_semi]
      'InsertPort (PortListId, ModuleId.PortId, HandleId); 

  replace [repeat statement_semi]
      Statements [repeat statement_semi]

  construct NewStatements [repeat statement_semi]
      Statements [. InsertPortStatement]
  by
      NewStatements
end function
