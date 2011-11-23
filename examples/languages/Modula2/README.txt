TXL Example Specification
-------------------------

Name:        
        rmi.Txl

Description:
        Implementation of Esprit Project REX extended Modula-2 (RMI)
        programs by translation to pure Modula-2.  RMI extends Modula-2
        with built-in synchronization and communication features such as
        asynchronous remote procedure calls, ACCEPT, REPLY, and the SELECT 
        statement to handle distributed networks of communicating 
        Modula-2 programs.

        The transform works by generating pure Modula-2 code to implement
        the semantics of the extended features, calling external REX 
        library routines to implement the actual communication.
        
Author:
        Georg Etzkorn

Affiliation:
        Esprit Project REX
        Gesellschaft fuer Mathematik und Datenverarbeitung,
        Forschungsstelle an der Universitaet Karlsruhe,
        Karlsruhe, Germany

Date:
        April 1991

Example:
        txl Fork.rmi
