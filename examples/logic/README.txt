TXL Example Specification
-------------------------

Name:        
        Mat.Txl
        DenormMat.Txl
        NormMat.Txl

Description:
        Implementation of a normalizer and simplifier for
        logical propositions expressed in the Mates system of
        logic notation.  Does a fair job of proposition simplification
        using a small set of standard axioms and theorems to transform
        subterms.  Does some useful but not difficult theorem proving.

Author:
        I.H. Carmichael
        J.R. Cordy

Affiliation:
        Queen's University, Kingston, Canada

Date:
        July 1990

Example:
        txl Tautology1.Mat
        txl -Dapply Tautology1.Mat        (shows steps in the proof)
        txl Tautology2.Mat
        txl -Dapply Tautology2.Mat        (shows steps in the proof)
        txl Proposition1.Mat
        itxl Mates                        (lets you type in propositions)
        txl Predicate.Mat NormMat.Txl
