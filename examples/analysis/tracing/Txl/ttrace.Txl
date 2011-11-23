% Transform Turing program to an auto-tracing version of itself.
% (Test of the new generalized [quote] in TXL.)
% If this transform were to be completed, it would also indicate values 
% of assigned and passed variables and expressions in the trace.
% J.R. Cordy, 6.12.94

include "Turing.Grm"

define original_declaration_or_statement
        [declaration]            [opt ';] [NL]         
    |   [variable_binding]       [opt ';] [NL]         
    |   [statement]              [opt ';] [NL] 
end define

define processed_declaration_or_statement
	[original_declaration_or_statement]
    |   [empty]
end define

redefine declaration_or_statement
        [original_declaration_or_statement] 
    |   [processed_declaration_or_statement]
end redefine

function main
    replace [program]
        P [program]
    by
        P [addTracing]
end function

rule addTracing
    replace [repeat declaration_or_statement]
        ODS [original_declaration_or_statement]
        Rest [repeat declaration_or_statement]
    deconstruct ODS
        S [statement]
    construct QuoteS [stringlit]
        _ [quote S]
    construct TS [processed_declaration_or_statement]
       put ">>> ", QuoteS  
    construct PS [processed_declaration_or_statement]
        ODS
    by
        TS
        PS
        Rest
end rule
