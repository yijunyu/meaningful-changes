% Transform Pascal program to an auto-tracing version of itself.
% If this transform were to be completed, it would also indicate values 
% of assigned and passed variables and expressions in the trace.
% J.R. Cordy, 6.12.94

include "Pascal.Grm"

define original_statement
        [opt statement_label] [unlabeled_statement] 
end define

define processed_statement
	[original_statement]
    |   [empty]
end define

redefine statement
        [original_statement] 
    |   [processed_statement]
end redefine

function main
    replace [program]
        P [program]
    by
        P [addtracing1]
          [addtracing2]
end function

rule addtracing1
    % Handle statements in sequences
    replace [repeat statement_semicolon+]
        OS [original_statement] Semi [opt ';]
        Rest [repeat statement_semicolon]
    deconstruct OS
        L [opt statement_label] US [unlabeled_statement]
    construct QuoteUS [charlit]
        _ [quote US]
    construct TS [processed_statement]
        writeln (''>>> ', QuoteUS)     
    construct PS [processed_statement]
        OS
    by
        TS ;
        PS Semi
        Rest
end rule

rule addtracing2
    % Handle lone statements that need to be turned into blocks
    replace [statement]
        OS [original_statement]
    deconstruct OS
        L [opt statement_label] US [unlabeled_statement] 
    construct QuoteUS [charlit]
        _ [quote US]
    construct TS [processed_statement]
        writeln (''>>> ', QuoteUS)     
    construct PS [processed_statement]
        OS
    construct NS [processed_statement]
        begin
            TS ;         
            PS  
        'end 
    by 
        NS
end rule
