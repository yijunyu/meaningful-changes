TXL Example Specification
-------------------------

Name:        
        atr.Txl
        vat.Txl

Description:
        Two trivial demonstrations of the use of TXL 8's attribution 
        facility.  Optional attributes of arbitrary complexity can be 
        attached at any point in the grammar using the [attr X] form, 
        where [X] is any terminal or nonterminal.  Attributes can
        be arbitrarily used in the TXL program, but do not appear in
        the final output unless the -attr flag is explicitly given.

        'atr.Txl' is an example of using attributes to mark items.

        'vat.Txl' is an example of using attributes to associate
        computed values with items to assist in later transformation steps.

Author:
        J.R. Cordy

Affiliation:
        Queen's University / Legasys Corp.

Date:
        June 1995

Example:
        txl example.atr
        txl example.vat
        txl -attr example.vat 	(to see the attributions in output)
