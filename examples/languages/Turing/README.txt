TXL Example Specification
-------------------------

Name:        
        PT.Txl
        GT.Txl
        OBT.Txl

Description:
        Various prototype extensions to the Turing programming language,
        produced to try out various ways of adding objective programming
        features to the original Turing programming language.  All features 
        are implemented by transformation to pure original Turing.

        PT  - Adds parameterized types.
        GT  - Generic Turing, adds generic declarations, types and modules.
        OBT - Objective Turing, full prototype of the final set of 
        	object-oriented features chosen for Turing. 

        The Objective Turing prototype in TXL was documented in the paper 
        "Specification and Automatic Prototype Implementation of Polymorphic 
        Objects in Turing Using TXL", by Cordy & Promislow,
        Proc. 1990 IEEE International Conference on Computer Languages,
        New Orleans, March 1990.

Author:
        J.R. Cordy
        C.D. Halpern
        E. Promislow

Affiliation:
        University of Toronto, Canada
        Queen's University, Kingston, Canada

Date:
        1986-1990

Example:
        txl Stringof.PT
        txl Stack.GT
        txl Collection.OBT	
        txl StackClass.OBT
        txl StackWithTop.OBT
