% Parallelize Pascal assignments
% J.R. Cordy    15.5.93

% This TXL program will collect all sequences of independent
% assignments into single parallel assignments.

include "Pascal.Grm"

compounds
        << >>
end compounds

redefine statement
	...
    |	[simultaneous_assignment]
end redefine

define simultaneous_assignment
        << [list variable+] >> := << [list expression+] >>
end define

function main
    replace [program]
        P [program]
    by
        P [createSimultaneousAssignmentPairs]
          [extendSimulataneousAssignments]
          [mergeSimulataneousAssignments]
end function

rule createSimultaneousAssignmentPairs
    replace [repeat statement_semicolon]
        Assignment1 [assignment_statement] ;
        Assignment2 [assignment_statement] ;
        RestOfStatements [repeat statement_semicolon]
    deconstruct Assignment1
        V1 [variable] := E1 [expression]
    deconstruct Assignment2
        V2 [variable] := E2 [expression]
    where not
        E2 [references V1]
    where not
        E1 [references V2]
    by
        << V1, V2 >> := << E1, E2 >> ;
        RestOfStatements
end rule

rule extendSimulataneousAssignments
    replace [repeat statement_semicolon]
        SimulAssign [simultaneous_assignment] ;
        Assignment [assignment_statement] ;
        RestOfStatements [repeat statement_semicolon]
    deconstruct SimulAssign
        << Vars [list variable+] >> := << Expns [list expression+] >> 
    deconstruct Assignment
        NewV [variable] := NewE [expression]
    where not
        NewE [references each Vars]
    where not
        Expns [references NewV]
    by
        << Vars [, NewV] >> := << Expns [, NewE] >> ;
        RestOfStatements
end rule

rule mergeSimulataneousAssignments
    replace [repeat statement_semicolon]
        SimulAssign1 [simultaneous_assignment] ;
        SimulAssign2 [simultaneous_assignment] ;
        RestOfStatements [repeat statement_semicolon]
    deconstruct SimulAssign1
        << Vars1 [list variable+] >> := << Expns1 [list expression+] >> 
    deconstruct SimulAssign2
        << Vars2 [list variable+] >> := << Expns2 [list expression+] >> 
    where not
        Expns1 [references each Vars2]
    where not
        Expns2 [references each Vars1]
    by
        << Vars1 [, Vars2] >> := << Expns1 [, Expns2] >> ;
        RestOfStatements
end rule

rule references V [variable]
    match * [variable]
        V
end rule

