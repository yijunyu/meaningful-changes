% Transform ANSI C program to an auto-tracing version of itself.
% If this transform were to be completed, it would also indicate values 
% of assigned and passed variables and expressions in the trace.
% J.R. Cordy, 6.12.94

#pragma -escchar '\'

include "ANSIC.Grm"

define original_statement
        [repeat label] [compound_statement]
    |   [repeat label] [expression_statement]
    |   [repeat label] [selection_statement]
    |   [repeat label] [iteration_statement]
    |   [repeat label] [jump_statement]
    |   [repeat label] [null_statement]
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
        P [addtracing]
end function

rule addtracing
    replace [statement]
        RS [original_statement]
    deconstruct not RS
        _ [repeat label] _ [compound_statement]
    construct QuoteRS [stringlit]
        _ [quoteStatement RS]
    construct TS [processed_statement]
        fprintf (stderr, ">>> %s\n",  QuoteRS); 
    construct PS [processed_statement]
        RS
    construct BS [processed_statement]
        {
            TS
            PS
        }
    by
        BS
end rule

function quoteStatement S [original_statement]
    construct ES [original_statement]
        S [elideEmbeddedStatements]
          [elideElseClauses]
    replace [stringlit]
        _ [stringlit]
    construct QuoteES [stringlit]
        _ [quote ES]
    by
        QuoteES
end function

rule elideEmbeddedStatements
    replace $ [statement]
        _ [statement]
    by
        % nada
end rule

rule elideElseClauses
    replace $ [opt else_statement]
        _ [else_statement]
    by
        % nada
end rule
