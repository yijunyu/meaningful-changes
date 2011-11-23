TXL Example Specification
-------------------------

Name:
        Lfe.Txl
        Lfa.Txl

Description:
        Two code motion optimizations for Turing Plus programs
        demonstrating how to get the effect of dataflow analysis
        in TXL.  Lfe.Txl moves the computation of all 
        loop-independent nontrivial expressions outside of loops 
        and for loops.  Lfa.Txl moves all loop-independent 
        assignment statements outside of loops.  

Author:
        J.R. Cordy

Affiliation:
        Software Technology Laboratory, Queen's University

Date:
        May 1993

Examples:
        txl Example1.Lfe
        txl Example3.lfa

    (Cascaded optimization - first lift expressions, then assignments)
        txl Example2.Lfe > Example2.Lfa
            - then -
        txl Example2.Lfa

