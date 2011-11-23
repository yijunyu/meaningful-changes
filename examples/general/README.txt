TXL Example Specification
-------------------------

Name:        
        Cal.Txl
        DP.Txl
        Srt.Txl

Description:
        Various simple general purpose transformational tasks implemented in TXL.

        Cal   - A simple numeric expression calculator,
                transforms a numeric expression into its result value.
                Can easily be adapted as a constant folding optimizer 
                for any programming language.

        DP    - Compute the dot product of two vectors.
        
        Srt   - Bubble sort of a sequence of numbers.

Author:
        I.H. Carmichael
        J.R. Cordy

Affiliation:
        Queen's University, Kingston, Canada

Date:
        June 1989

Example:
        txl Expression.Cal
        itxl Cal                      (lets you type in input)
        txl TwoVectors.DP
        txl Numbers.Srt
