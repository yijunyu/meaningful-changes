keys
    INDENT  DEDENT  'problem  ':  'for  '#  'see  'domain  'R  'M  'B  'X  'C  'D  'P  '?  '--  '~~  '<~  '->  '~>  '! 
      'phenomenon  'event  'state  ', 
end keys

comments
    //
end comments

define indent
            [IN]
        [attr  'INDENT] 
    end define
    define dedent
                [EX]
    [attr  'DEDENT] 
end define
define desc
    [opt  ':]  [stringlit] 
end define
define type
    'R 
    |    'M 
    |    'B 
    |    'X 
    |    'C 
    |    'D 
    |    'P 
    |    '? 
end define
define rel
    '-- 
    |    '~~ 
    |    '<~ 
    |    '-> 
    |    '~> 
end define
define name
    [number] 
    |    [id] 
    |    [SPOFF]  '#  [SPON]  [tok *]  [SPOFF]  '#  [SPON] 
end define
define tok
    [id] 
    |    'problem 
    |    ': 
    |    'for 
    |    '# 
    |    'see 
    |    'domain 
    |    'R 
    |    'M 
    |    'B 
    |    'X 
    |    'C 
    |    'D 
    |    'P 
    |    '? 
    |    '-- 
    |    '~~ 
    |    '<~ 
    |    '-> 
    |    '~> 
    |    '! 
    |    'phenomenon 
    |    'event 
    |    'state 
    |    ', 
    |    '- 
end define
define program
    [header]  [opt problem_description] 
end define
define details
    '{ [indent]  [list phenomena]  [NL]
    [dedent]  '} 
end define
rule Small B  [E]
    match  [E]
        A  [E] 
construct SA  [stringlit]
    _  [quote  A] 
construct SB  [stringlit]
    _  [quote  B] 
where
    SA  [<  SB] end rule

    keys
        ... <<<<<<  >>>>>>   ' 
    end keys

    compounds
        ... <<<<<<  >>>>>> 
    end compounds

    define Change
                [NL]
        <<<<<<  [opt stringlit]  [NL]
        |  [NL]
        >>>>>>  [opt stringlit]  [NL]
 
    end define
    define header
        [opt srcfilename]  [opt srclinenumber]  [NL]
        'problem  [SPOFF]  ':  [SPON]  [name] 
    end define
    redefine header
        ...
    |   
        [attr Change] 

    end define
    function find_replace_header
        replace  [program]
            P  [ program ] 
        import Program_Diff [program]

        construct S  [header *]
            _  [ find_clones_header  P  Program_Diff ] 
        construct P3  [program]
            P  [mark_clones_header  each  S]
 
        by
            P3 
    end function

    function find_clones_header P  [program] P2  [program]
        replace  [header *]
            _  [ header  * ] 
        construct S  [header *]
            _  [ ^  P ] 
        by
            _  [add_if_clones_header1  P2  each  S]
 
    end function

    function add_if_clones_header1 P2  [program] Stmt  [header]
        construct S2  [header *]
            _  [ ^  P2 ] 
        deconstruct * S2
            Stmt  Rest  [ header  * ] 
        replace  [header *]
            StructuredClones  [ header  * ] 
        deconstruct not * StructuredClones
            C  [attr Change] 
        by
            StructuredClones  [ . Stmt ] 
    end function

    function mark_clones_header S  [header]
        import CloneNumber [number]

        import Program_Diff [program]

        export CloneNumber
            CloneNumber  [ +  1 ] 
        construct C  [stringlit]
            _  [ quote  S ] 
        where not
            C  [=  ""]
        construct S2  [header]
            >>>>>>  C 
        export Program_Diff
            Program_Diff  [ $  S  S2 ] 
        replace  [program]
            P  [ program ] 
        construct S1  [header]
            <<<<<<  C 
        by
            P  [ $  S  S1 ] 
    end function

    define problem_description
        [opt srcfilename]  [opt srclinenumber]  [NL]
        [indent]  [repeat E +]  [dedent] 
    end define
    redefine problem_description
        ...
    |   
        [attr Change] 

    end define
    function find_replace_problem_description
        replace  [program]
            P  [ program ] 
        import Program_Diff [program]

        construct S  [problem_description *]
            _  [ find_clones_problem_description  P  Program_Diff ] 
        construct P3  [program]
            P  [mark_clones_problem_description  each  S]
 
        by
            P3 
    end function

    function find_clones_problem_description P  [program] P2  [program]
        replace  [problem_description *]
            _  [ problem_description  * ] 
        construct S  [problem_description *]
            _  [ ^  P ] 
        by
            _  [add_if_clones_problem_description1  P2  each  S]
 
    end function

    function add_if_clones_problem_description1 P2  [program] Stmt  [problem_description]
        construct S2  [problem_description *]
            _  [ ^  P2 ] 
        deconstruct * S2
            Stmt  Rest  [ problem_description  * ] 
        replace  [problem_description *]
            StructuredClones  [ problem_description  * ] 
        deconstruct not * StructuredClones
            C  [attr Change] 
        by
            StructuredClones  [ . Stmt ] 
    end function

    function mark_clones_problem_description S  [problem_description]
        import CloneNumber [number]

        import Program_Diff [program]

        export CloneNumber
            CloneNumber  [ +  1 ] 
        construct C  [stringlit]
            _  [ quote  S ] 
        where not
            C  [=  ""]
        construct S2  [problem_description]
            >>>>>>  C 
        export Program_Diff
            Program_Diff  [ $  S  S2 ] 
        replace  [program]
            P  [ program ] 
        construct S1  [problem_description]
            <<<<<<  C 
        by
            P  [ $  S  S1 ] 
    end function

    define E
        [opt srcfilename]  [opt srclinenumber]  [NL]
                [NL]
        [name]  [opt type]  [opt details]  [opt  ':]  [opt stringlit] 
        |        [opt srcfilename]  [opt srclinenumber]  [NL]
                [NL]
        [name]  [SP]  [SPOFF]  [rel]  [SPON]  [name]  [opt details]  [opt desc] 
    end define
    redefine E
        ...
    |   
        [attr Change] 

    end define
    function find_replace_E
        replace  [program]
            P  [ program ] 
        import Program_Diff [program]

        construct S  [E *]
            _  [ find_clones_E  P  Program_Diff ] 
        construct P3  [program]
            P  [mark_clones_E  each  S]
 
        by
            P3 
    end function

    function find_clones_E P  [program] P2  [program]
        replace  [E *]
            _  [ E  * ] 
        construct S  [E *]
            _  [ ^  P ] 
        by
            _  [add_if_clones_E1  P2  each  S]
 
    end function

    function add_if_clones_E1 P2  [program] Stmt  [E]
        construct S2  [E *]
            _  [ ^  P2 ] 
        deconstruct * S2
            Stmt  Rest  [ E  * ] 
        replace  [E *]
            StructuredClones  [ E  * ] 
        deconstruct not * StructuredClones
            C  [attr Change] 
        by
            StructuredClones  [ . Stmt ] 
    end function

    function mark_clones_E S  [E]
        import CloneNumber [number]

        import Program_Diff [program]

        export CloneNumber
            CloneNumber  [ +  1 ] 
        construct C  [stringlit]
            _  [ quote  S ] 
        where not
            C  [=  ""]
        construct S2  [E]
            >>>>>>  C 
        export Program_Diff
            Program_Diff  [ $  S  S2 ] 
        replace  [program]
            P  [ program ] 
        construct S1  [E]
            <<<<<<  C 
        by
            P  [ $  S  S1 ] 
    end function

    define phenomena
        [opt srcfilename]  [opt srclinenumber]  [NL]
                [NL]
        [name] 
        |        [opt srcfilename]  [opt srclinenumber]  [NL]
                [NL]
        'event  [name] 
        |        [opt srcfilename]  [opt srclinenumber]  [NL]
                [NL]
        'state  [name] 
    end define
    redefine phenomena
        ...
    |   
        [attr Change] 

    end define
    function find_replace_phenomena
        replace  [program]
            P  [ program ] 
        import Program_Diff [program]

        construct S  [phenomena *]
            _  [ find_clones_phenomena  P  Program_Diff ] 
        construct P3  [program]
            P  [mark_clones_phenomena  each  S]
 
        by
            P3 
    end function

    function find_clones_phenomena P  [program] P2  [program]
        replace  [phenomena *]
            _  [ phenomena  * ] 
        construct S  [phenomena *]
            _  [ ^  P ] 
        by
            _  [add_if_clones_phenomena1  P2  each  S]
 
    end function

    function add_if_clones_phenomena1 P2  [program] Stmt  [phenomena]
        construct S2  [phenomena *]
            _  [ ^  P2 ] 
        deconstruct * S2
            Stmt  Rest  [ phenomena  * ] 
        replace  [phenomena *]
            StructuredClones  [ phenomena  * ] 
        deconstruct not * StructuredClones
            C  [attr Change] 
        by
            StructuredClones  [ . Stmt ] 
    end function

    function mark_clones_phenomena S  [phenomena]
        import CloneNumber [number]

        import Program_Diff [program]

        export CloneNumber
            CloneNumber  [ +  1 ] 
        construct C  [stringlit]
            _  [ quote  S ] 
        where not
            C  [=  ""]
        construct S2  [phenomena]
            >>>>>>  C 
        export Program_Diff
            Program_Diff  [ $  S  S2 ] 
        replace  [program]
            P  [ program ] 
        construct S1  [phenomena]
            <<<<<<  C 
        by
            P  [ $  S  S1 ] 
    end function

    rule normalise_list_details_phenomena
        replace  [list phenomena]
            N1  [phenomena] ,  N2  [phenomena] ,  Rest  [list phenomena] 
        construct T1  [stringlit]
            _  [ quote  N1 ] 
        construct T2  [stringlit]
            _  [ quote  N2 ] 
        where
            T1  [>  T2]
        by
            N2 ,  N1 ,  Rest 
    end rule

    function normalise_ignore_by2_header_srcfilename1 E1  [header]
        replace  [header *]
            Seq  [header *] 
        deconstruct not E1
            X1  [opt srcfilename]  X2  [opt srclinenumber]  'problem  X3  [SPOFF]  ':  X4  [SPON]  X5  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_header_srcfilename1 E1  [header]
        replace  [header *]
            Seq  [header *] 
        deconstruct E1
            X1  [opt srcfilename]  X2  [opt srclinenumber]  'problem  X3  [SPOFF]  ':  X4  [SPON]  X5  [name] 
        construct E2  [header]
            X2  'problem  X3  ':  X4  X5 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_header_srcfilename1
        replace  [program]
            P1  [ program ] 
        construct List1  [header *]
            _  [ ^  P1 ] 
        construct List2  [header *]
            _  [normalise_ignore_by3_header_srcfilename1  each  List1]  [normalise_ignore_by2_header_srcfilename1  each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_header_srclinenumber1 E1  [header]
        replace  [header *]
            Seq  [header *] 
        deconstruct not E1
            X6  [opt srcfilename]  X7  [opt srclinenumber]  'problem  X8  [SPOFF]  ':  X9  [SPON]  X10  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_header_srclinenumber1 E1  [header]
        replace  [header *]
            Seq  [header *] 
        deconstruct E1
            X6  [opt srcfilename]  X7  [opt srclinenumber]  'problem  X8  [SPOFF]  ':  X9  [SPON]  X10  [name] 
        construct E2  [header]
            X6  'problem  X8  ':  X9  X10 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_header_srclinenumber1
        replace  [program]
            P1  [ program ] 
        construct List1  [header *]
            _  [ ^  P1 ] 
        construct List2  [header *]
            _  [normalise_ignore_by3_header_srclinenumber1  each  List1]  [normalise_ignore_by2_header_srclinenumber1  each 
                      List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    rule normalise_list_problem_description_E
        replace  [repeat E]
            N1  [E]  N2  [E]  Rest  [repeat E] 
        where
            N1  [Small  N2]
        by
            N2  N1  Rest 
    end rule

    function normalise_ignore_by2_problem_description_srcfilename1 E1  [problem_description]
        replace  [problem_description *]
            Seq  [problem_description *] 
        deconstruct not E1
            X11  [opt srcfilename]  X12  [opt srclinenumber]  X13  [indent]  X14  [repeat E +]  X15  [dedent] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_problem_description_srcfilename1 E1  [problem_description]
        replace  [problem_description *]
            Seq  [problem_description *] 
        deconstruct E1
            X11  [opt srcfilename]  X12  [opt srclinenumber]  X13  [indent]  X14  [repeat E +]  X15  [dedent] 
        construct E2  [problem_description]
            X12  X13  X14  X15 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_problem_description_srcfilename1
        replace  [program]
            P1  [ program ] 
        construct List1  [problem_description *]
            _  [ ^  P1 ] 
        construct List2  [problem_description *]
            _  [normalise_ignore_by3_problem_description_srcfilename1  each  List1]  [
                      normalise_ignore_by2_problem_description_srcfilename1  each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_problem_description_srclinenumber1 E1  [problem_description]
        replace  [problem_description *]
            Seq  [problem_description *] 
        deconstruct not E1
            X16  [opt srcfilename]  X17  [opt srclinenumber]  X18  [indent]  X19  [repeat E +]  X20  [dedent] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_problem_description_srclinenumber1 E1  [problem_description]
        replace  [problem_description *]
            Seq  [problem_description *] 
        deconstruct E1
            X16  [opt srcfilename]  X17  [opt srclinenumber]  X18  [indent]  X19  [repeat E +]  X20  [dedent] 
        construct E2  [problem_description]
            X16  X18  X19  X20 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_problem_description_srclinenumber1
        replace  [program]
            P1  [ program ] 
        construct List1  [problem_description *]
            _  [ ^  P1 ] 
        construct List2  [problem_description *]
            _  [normalise_ignore_by3_problem_description_srclinenumber1  each  List1]  [
                      normalise_ignore_by2_problem_description_srclinenumber1  each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_E_srcfilename1 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct not E1
            X21  [opt srcfilename]  X22  [opt srclinenumber]  X23  [name]  X24  [opt type]  X25  [opt details]  X26  [opt  ':] 
              X27  [opt stringlit] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_E_srcfilename1 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct E1
            X21  [opt srcfilename]  X22  [opt srclinenumber]  X23  [name]  X24  [opt type]  X25  [opt details]  X26  [opt  ':] 
              X27  [opt stringlit] 
        construct E2  [E]
            X22  X23  X24  X25  X26  X27 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_E_srcfilename1
        replace  [program]
            P1  [ program ] 
        construct List1  [E *]
            _  [ ^  P1 ] 
        construct List2  [E *]
            _  [normalise_ignore_by3_E_srcfilename1  each  List1]  [normalise_ignore_by2_E_srcfilename1  each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_E_srcfilename2 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct not E1
            X28  [opt srcfilename]  X29  [opt srclinenumber]  X30  [name]  X31  [SP]  X32  [SPOFF]  X33  [rel]  X34  [SPON]  X35
              [name]  X36  [opt details]  X37  [opt desc] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_E_srcfilename2 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct E1
            X28  [opt srcfilename]  X29  [opt srclinenumber]  X30  [name]  X31  [SP]  X32  [SPOFF]  X33  [rel]  X34  [SPON]  X35
              [name]  X36  [opt details]  X37  [opt desc] 
        construct E2  [E]
            X29  X30  X31  X32  X33  X34  X35  X36  X37 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_E_srcfilename2
        replace  [program]
            P1  [ program ] 
        construct List1  [E *]
            _  [ ^  P1 ] 
        construct List2  [E *]
            _  [normalise_ignore_by3_E_srcfilename2  each  List1]  [normalise_ignore_by2_E_srcfilename2  each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_E_srclinenumber1 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct not E1
            X38  [opt srcfilename]  X39  [opt srclinenumber]  X40  [name]  X41  [opt type]  X42  [opt details]  X43  [opt  ':] 
              X44  [opt stringlit] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_E_srclinenumber1 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct E1
            X38  [opt srcfilename]  X39  [opt srclinenumber]  X40  [name]  X41  [opt type]  X42  [opt details]  X43  [opt  ':] 
              X44  [opt stringlit] 
        construct E2  [E]
            X38  X40  X41  X42  X43  X44 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_E_srclinenumber1
        replace  [program]
            P1  [ program ] 
        construct List1  [E *]
            _  [ ^  P1 ] 
        construct List2  [E *]
            _  [normalise_ignore_by3_E_srclinenumber1  each  List1]  [normalise_ignore_by2_E_srclinenumber1  each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_E_srclinenumber2 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct not E1
            X45  [opt srcfilename]  X46  [opt srclinenumber]  X47  [name]  X48  [SP]  X49  [SPOFF]  X50  [rel]  X51  [SPON]  X52
              [name]  X53  [opt details]  X54  [opt desc] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_E_srclinenumber2 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct E1
            X45  [opt srcfilename]  X46  [opt srclinenumber]  X47  [name]  X48  [SP]  X49  [SPOFF]  X50  [rel]  X51  [SPON]  X52
              [name]  X53  [opt details]  X54  [opt desc] 
        construct E2  [E]
            X45  X47  X48  X49  X50  X51  X52  X53  X54 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_E_srclinenumber2
        replace  [program]
            P1  [ program ] 
        construct List1  [E *]
            _  [ ^  P1 ] 
        construct List2  [E *]
            _  [normalise_ignore_by3_E_srclinenumber2  each  List1]  [normalise_ignore_by2_E_srclinenumber2  each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_E_details1 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct not E1
            X55  [opt srcfilename]  X56  [opt srclinenumber]  X57  [name]  X58  [opt type]  X59  [opt details]  X60  [opt  ':] 
              X61  [opt stringlit] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_E_details1 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct E1
            X55  [opt srcfilename]  X56  [opt srclinenumber]  X57  [name]  X58  [opt type]  X59  [opt details]  X60  [opt  ':] 
              X61  [opt stringlit] 
        construct E2  [E]
            X55  X56  X57  X58  X60  X61 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_E_details1
        replace  [program]
            P1  [ program ] 
        construct List1  [E *]
            _  [ ^  P1 ] 
        construct List2  [E *]
            _  [normalise_ignore_by3_E_details1  each  List1]  [normalise_ignore_by2_E_details1  each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_E_srcfilename3 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct not E1
            X69  [opt srcfilename]  X70  [opt srclinenumber]  X71  [name]  X72  [opt type]  X73  [opt details]  X74  [opt  ':] 
              X75  [opt stringlit] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_E_srcfilename3 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct E1
            X69  [opt srcfilename]  X70  [opt srclinenumber]  X71  [name]  X72  [opt type]  X73  [opt details]  X74  [opt  ':] 
              X75  [opt stringlit] 
        construct E2  [E]
            X70  X71  X72  X73  X74  X75 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_E_srcfilename3
        replace  [program]
            P1  [ program ] 
        construct List1  [E *]
            _  [ ^  P1 ] 
        construct List2  [E *]
            _  [normalise_ignore_by3_E_srcfilename3  each  List1]  [normalise_ignore_by2_E_srcfilename3  each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_E_srcfilename4 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct not E1
            X76  [opt srcfilename]  X77  [opt srclinenumber]  X78  [name]  X79  [SP]  X80  [SPOFF]  X81  [rel]  X82  [SPON]  X83
              [name]  X84  [opt details]  X85  [opt desc] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_E_srcfilename4 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct E1
            X76  [opt srcfilename]  X77  [opt srclinenumber]  X78  [name]  X79  [SP]  X80  [SPOFF]  X81  [rel]  X82  [SPON]  X83
              [name]  X84  [opt details]  X85  [opt desc] 
        construct E2  [E]
            X77  X78  X79  X80  X81  X82  X83  X84  X85 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_E_srcfilename4
        replace  [program]
            P1  [ program ] 
        construct List1  [E *]
            _  [ ^  P1 ] 
        construct List2  [E *]
            _  [normalise_ignore_by3_E_srcfilename4  each  List1]  [normalise_ignore_by2_E_srcfilename4  each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_E_srclinenumber3 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct not E1
            X86  [opt srcfilename]  X87  [opt srclinenumber]  X88  [name]  X89  [opt type]  X90  [opt details]  X91  [opt  ':] 
              X92  [opt stringlit] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_E_srclinenumber3 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct E1
            X86  [opt srcfilename]  X87  [opt srclinenumber]  X88  [name]  X89  [opt type]  X90  [opt details]  X91  [opt  ':] 
              X92  [opt stringlit] 
        construct E2  [E]
            X86  X88  X89  X90  X91  X92 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_E_srclinenumber3
        replace  [program]
            P1  [ program ] 
        construct List1  [E *]
            _  [ ^  P1 ] 
        construct List2  [E *]
            _  [normalise_ignore_by3_E_srclinenumber3  each  List1]  [normalise_ignore_by2_E_srclinenumber3  each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_E_srclinenumber4 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct not E1
            X93  [opt srcfilename]  X94  [opt srclinenumber]  X95  [name]  X96  [SP]  X97  [SPOFF]  X98  [rel]  X99  [SPON] 
              X100  [name]  X101  [opt details]  X102  [opt desc] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_E_srclinenumber4 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct E1
            X93  [opt srcfilename]  X94  [opt srclinenumber]  X95  [name]  X96  [SP]  X97  [SPOFF]  X98  [rel]  X99  [SPON] 
              X100  [name]  X101  [opt details]  X102  [opt desc] 
        construct E2  [E]
            X93  X95  X96  X97  X98  X99  X100  X101  X102 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_E_srclinenumber4
        replace  [program]
            P1  [ program ] 
        construct List1  [E *]
            _  [ ^  P1 ] 
        construct List2  [E *]
            _  [normalise_ignore_by3_E_srclinenumber4  each  List1]  [normalise_ignore_by2_E_srclinenumber4  each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_phenomena_srcfilename1 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct not E1
            X103  [opt srcfilename]  X104  [opt srclinenumber]  X105  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_phenomena_srcfilename1 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct E1
            X103  [opt srcfilename]  X104  [opt srclinenumber]  X105  [name] 
        construct E2  [phenomena]
            X104  X105 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_phenomena_srcfilename1
        replace  [program]
            P1  [ program ] 
        construct List1  [phenomena *]
            _  [ ^  P1 ] 
        construct List2  [phenomena *]
            _  [normalise_ignore_by3_phenomena_srcfilename1  each  List1]  [normalise_ignore_by2_phenomena_srcfilename1  each 
                      List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_phenomena_srcfilename2 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct not E1
            X106  [opt srcfilename]  X107  [opt srclinenumber]  'event  X108  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_phenomena_srcfilename2 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct E1
            X106  [opt srcfilename]  X107  [opt srclinenumber]  'event  X108  [name] 
        construct E2  [phenomena]
            X107  'event  X108 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_phenomena_srcfilename2
        replace  [program]
            P1  [ program ] 
        construct List1  [phenomena *]
            _  [ ^  P1 ] 
        construct List2  [phenomena *]
            _  [normalise_ignore_by3_phenomena_srcfilename2  each  List1]  [normalise_ignore_by2_phenomena_srcfilename2  each 
                      List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_phenomena_srcfilename3 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct not E1
            X109  [opt srcfilename]  X110  [opt srclinenumber]  'state  X111  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_phenomena_srcfilename3 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct E1
            X109  [opt srcfilename]  X110  [opt srclinenumber]  'state  X111  [name] 
        construct E2  [phenomena]
            X110  'state  X111 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_phenomena_srcfilename3
        replace  [program]
            P1  [ program ] 
        construct List1  [phenomena *]
            _  [ ^  P1 ] 
        construct List2  [phenomena *]
            _  [normalise_ignore_by3_phenomena_srcfilename3  each  List1]  [normalise_ignore_by2_phenomena_srcfilename3  each 
                      List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_phenomena_srclinenumber1 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct not E1
            X112  [opt srcfilename]  X113  [opt srclinenumber]  X114  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_phenomena_srclinenumber1 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct E1
            X112  [opt srcfilename]  X113  [opt srclinenumber]  X114  [name] 
        construct E2  [phenomena]
            X112  X114 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_phenomena_srclinenumber1
        replace  [program]
            P1  [ program ] 
        construct List1  [phenomena *]
            _  [ ^  P1 ] 
        construct List2  [phenomena *]
            _  [normalise_ignore_by3_phenomena_srclinenumber1  each  List1]  [normalise_ignore_by2_phenomena_srclinenumber1 
                      each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_phenomena_srclinenumber2 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct not E1
            X115  [opt srcfilename]  X116  [opt srclinenumber]  'event  X117  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_phenomena_srclinenumber2 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct E1
            X115  [opt srcfilename]  X116  [opt srclinenumber]  'event  X117  [name] 
        construct E2  [phenomena]
            X115  'event  X117 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_phenomena_srclinenumber2
        replace  [program]
            P1  [ program ] 
        construct List1  [phenomena *]
            _  [ ^  P1 ] 
        construct List2  [phenomena *]
            _  [normalise_ignore_by3_phenomena_srclinenumber2  each  List1]  [normalise_ignore_by2_phenomena_srclinenumber2 
                      each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_phenomena_srclinenumber3 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct not E1
            X118  [opt srcfilename]  X119  [opt srclinenumber]  'state  X120  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_phenomena_srclinenumber3 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct E1
            X118  [opt srcfilename]  X119  [opt srclinenumber]  'state  X120  [name] 
        construct E2  [phenomena]
            X118  'state  X120 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_phenomena_srclinenumber3
        replace  [program]
            P1  [ program ] 
        construct List1  [phenomena *]
            _  [ ^  P1 ] 
        construct List2  [phenomena *]
            _  [normalise_ignore_by3_phenomena_srclinenumber3  each  List1]  [normalise_ignore_by2_phenomena_srclinenumber3 
                      each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_phenomena_srcfilename4 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct not E1
            X121  [opt srcfilename]  X122  [opt srclinenumber]  X123  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_phenomena_srcfilename4 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct E1
            X121  [opt srcfilename]  X122  [opt srclinenumber]  X123  [name] 
        construct E2  [phenomena]
            X122  X123 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_phenomena_srcfilename4
        replace  [program]
            P1  [ program ] 
        construct List1  [phenomena *]
            _  [ ^  P1 ] 
        construct List2  [phenomena *]
            _  [normalise_ignore_by3_phenomena_srcfilename4  each  List1]  [normalise_ignore_by2_phenomena_srcfilename4  each 
                      List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_phenomena_srcfilename5 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct not E1
            X124  [opt srcfilename]  X125  [opt srclinenumber]  'event  X126  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_phenomena_srcfilename5 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct E1
            X124  [opt srcfilename]  X125  [opt srclinenumber]  'event  X126  [name] 
        construct E2  [phenomena]
            X125  'event  X126 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_phenomena_srcfilename5
        replace  [program]
            P1  [ program ] 
        construct List1  [phenomena *]
            _  [ ^  P1 ] 
        construct List2  [phenomena *]
            _  [normalise_ignore_by3_phenomena_srcfilename5  each  List1]  [normalise_ignore_by2_phenomena_srcfilename5  each 
                      List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_phenomena_srcfilename6 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct not E1
            X127  [opt srcfilename]  X128  [opt srclinenumber]  'state  X129  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_phenomena_srcfilename6 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct E1
            X127  [opt srcfilename]  X128  [opt srclinenumber]  'state  X129  [name] 
        construct E2  [phenomena]
            X128  'state  X129 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_phenomena_srcfilename6
        replace  [program]
            P1  [ program ] 
        construct List1  [phenomena *]
            _  [ ^  P1 ] 
        construct List2  [phenomena *]
            _  [normalise_ignore_by3_phenomena_srcfilename6  each  List1]  [normalise_ignore_by2_phenomena_srcfilename6  each 
                      List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_phenomena_srclinenumber4 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct not E1
            X130  [opt srcfilename]  X131  [opt srclinenumber]  X132  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_phenomena_srclinenumber4 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct E1
            X130  [opt srcfilename]  X131  [opt srclinenumber]  X132  [name] 
        construct E2  [phenomena]
            X130  X132 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_phenomena_srclinenumber4
        replace  [program]
            P1  [ program ] 
        construct List1  [phenomena *]
            _  [ ^  P1 ] 
        construct List2  [phenomena *]
            _  [normalise_ignore_by3_phenomena_srclinenumber4  each  List1]  [normalise_ignore_by2_phenomena_srclinenumber4 
                      each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_phenomena_srclinenumber5 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct not E1
            X133  [opt srcfilename]  X134  [opt srclinenumber]  'event  X135  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_phenomena_srclinenumber5 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct E1
            X133  [opt srcfilename]  X134  [opt srclinenumber]  'event  X135  [name] 
        construct E2  [phenomena]
            X133  'event  X135 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_phenomena_srclinenumber5
        replace  [program]
            P1  [ program ] 
        construct List1  [phenomena *]
            _  [ ^  P1 ] 
        construct List2  [phenomena *]
            _  [normalise_ignore_by3_phenomena_srclinenumber5  each  List1]  [normalise_ignore_by2_phenomena_srclinenumber5 
                      each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_phenomena_srclinenumber6 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct not E1
            X136  [opt srcfilename]  X137  [opt srclinenumber]  'state  X138  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_phenomena_srclinenumber6 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct E1
            X136  [opt srcfilename]  X137  [opt srclinenumber]  'state  X138  [name] 
        construct E2  [phenomena]
            X136  'state  X138 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_phenomena_srclinenumber6
        replace  [program]
            P1  [ program ] 
        construct List1  [phenomena *]
            _  [ ^  P1 ] 
        construct List2  [phenomena *]
            _  [normalise_ignore_by3_phenomena_srclinenumber6  each  List1]  [normalise_ignore_by2_phenomena_srclinenumber6 
                      each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_phenomena_srcfilename7 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct not E1
            X139  [opt srcfilename]  X140  [opt srclinenumber]  X141  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_phenomena_srcfilename7 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct E1
            X139  [opt srcfilename]  X140  [opt srclinenumber]  X141  [name] 
        construct E2  [phenomena]
            X140  X141 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_phenomena_srcfilename7
        replace  [program]
            P1  [ program ] 
        construct List1  [phenomena *]
            _  [ ^  P1 ] 
        construct List2  [phenomena *]
            _  [normalise_ignore_by3_phenomena_srcfilename7  each  List1]  [normalise_ignore_by2_phenomena_srcfilename7  each 
                      List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_phenomena_srcfilename8 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct not E1
            X142  [opt srcfilename]  X143  [opt srclinenumber]  'event  X144  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_phenomena_srcfilename8 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct E1
            X142  [opt srcfilename]  X143  [opt srclinenumber]  'event  X144  [name] 
        construct E2  [phenomena]
            X143  'event  X144 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_phenomena_srcfilename8
        replace  [program]
            P1  [ program ] 
        construct List1  [phenomena *]
            _  [ ^  P1 ] 
        construct List2  [phenomena *]
            _  [normalise_ignore_by3_phenomena_srcfilename8  each  List1]  [normalise_ignore_by2_phenomena_srcfilename8  each 
                      List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_phenomena_srcfilename9 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct not E1
            X145  [opt srcfilename]  X146  [opt srclinenumber]  'state  X147  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_phenomena_srcfilename9 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct E1
            X145  [opt srcfilename]  X146  [opt srclinenumber]  'state  X147  [name] 
        construct E2  [phenomena]
            X146  'state  X147 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_phenomena_srcfilename9
        replace  [program]
            P1  [ program ] 
        construct List1  [phenomena *]
            _  [ ^  P1 ] 
        construct List2  [phenomena *]
            _  [normalise_ignore_by3_phenomena_srcfilename9  each  List1]  [normalise_ignore_by2_phenomena_srcfilename9  each 
                      List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_phenomena_srclinenumber7 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct not E1
            X148  [opt srcfilename]  X149  [opt srclinenumber]  X150  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_phenomena_srclinenumber7 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct E1
            X148  [opt srcfilename]  X149  [opt srclinenumber]  X150  [name] 
        construct E2  [phenomena]
            X148  X150 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_phenomena_srclinenumber7
        replace  [program]
            P1  [ program ] 
        construct List1  [phenomena *]
            _  [ ^  P1 ] 
        construct List2  [phenomena *]
            _  [normalise_ignore_by3_phenomena_srclinenumber7  each  List1]  [normalise_ignore_by2_phenomena_srclinenumber7 
                      each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_phenomena_srclinenumber8 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct not E1
            X151  [opt srcfilename]  X152  [opt srclinenumber]  'event  X153  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_phenomena_srclinenumber8 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct E1
            X151  [opt srcfilename]  X152  [opt srclinenumber]  'event  X153  [name] 
        construct E2  [phenomena]
            X151  'event  X153 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_phenomena_srclinenumber8
        replace  [program]
            P1  [ program ] 
        construct List1  [phenomena *]
            _  [ ^  P1 ] 
        construct List2  [phenomena *]
            _  [normalise_ignore_by3_phenomena_srclinenumber8  each  List1]  [normalise_ignore_by2_phenomena_srclinenumber8 
                      each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_phenomena_srclinenumber9 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct not E1
            X154  [opt srcfilename]  X155  [opt srclinenumber]  'state  X156  [name] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_phenomena_srclinenumber9 E1  [phenomena]
        replace  [phenomena *]
            Seq  [phenomena *] 
        deconstruct E1
            X154  [opt srcfilename]  X155  [opt srclinenumber]  'state  X156  [name] 
        construct E2  [phenomena]
            X154  'state  X156 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_phenomena_srclinenumber9
        replace  [program]
            P1  [ program ] 
        construct List1  [phenomena *]
            _  [ ^  P1 ] 
        construct List2  [phenomena *]
            _  [normalise_ignore_by3_phenomena_srclinenumber9  each  List1]  [normalise_ignore_by2_phenomena_srclinenumber9 
                      each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function program_normalise
        replace  [program]
            Prg  [ program ] 
        by
            Prg  [ normalise_ignore_by4_header_srcfilename1 ]  [ normalise_ignore_by4_header_srclinenumber1 ]  [ 
              normalise_ignore_by4_problem_description_srcfilename1 ]  [ 
              normalise_ignore_by4_problem_description_srclinenumber1 ]  [ normalise_ignore_by4_E_srcfilename1 ]  [ 
              normalise_ignore_by4_E_srcfilename2 ]  [ normalise_ignore_by4_E_srclinenumber1 ]  [ 
              normalise_ignore_by4_E_srclinenumber2 ]  [ normalise_ignore_by4_E_details1 ]  [ 
              normalise_ignore_by4_E_srcfilename3 ]  [ normalise_ignore_by4_E_srcfilename4 ]  [ 
              normalise_ignore_by4_E_srclinenumber3 ]  [ normalise_ignore_by4_E_srclinenumber4 ]  [ 
              normalise_ignore_by4_phenomena_srcfilename1 ]  [ normalise_ignore_by4_phenomena_srcfilename2 ]  [ 
              normalise_ignore_by4_phenomena_srcfilename3 ]  [ normalise_ignore_by4_phenomena_srclinenumber1 ]  [ 
              normalise_ignore_by4_phenomena_srclinenumber2 ]  [ normalise_ignore_by4_phenomena_srclinenumber3 ]  [ 
              normalise_ignore_by4_phenomena_srcfilename4 ]  [ normalise_ignore_by4_phenomena_srcfilename5 ]  [ 
              normalise_ignore_by4_phenomena_srcfilename6 ]  [ normalise_ignore_by4_phenomena_srclinenumber4 ]  [ 
              normalise_ignore_by4_phenomena_srclinenumber5 ]  [ normalise_ignore_by4_phenomena_srclinenumber6 ]  [ 
              normalise_ignore_by4_phenomena_srcfilename7 ]  [ normalise_ignore_by4_phenomena_srcfilename8 ]  [ 
              normalise_ignore_by4_phenomena_srcfilename9 ]  [ normalise_ignore_by4_phenomena_srclinenumber7 ]  [ 
              normalise_ignore_by4_phenomena_srclinenumber8 ]  [ normalise_ignore_by4_phenomena_srclinenumber9 ]  [ 
              normalise_list_details_phenomena ]  [ normalise_list_problem_description_E ] 
    end function

    function program_remove_clone
        replace  [program]
            Prg  [ program ] 
        export CloneNumber [number]
            0 
        import TXLargs [repeat stringlit]

        deconstruct * TXLargs
            "-diff"  Filename  [ stringlit ] 
        construct P2  [program]
            _  [ read  Filename ]  [ program_normalise ] 
        export Program_Diff [program]
            P2 
        by
            Prg  [ find_replace_header ]  [ find_replace_problem_description ]  [ find_replace_E ]  [ find_replace_phenomena ] 
    end function

    redefine program
        ...
    |   
        [empty]  |  [attr number] 

    end define
    function print_diff_1
        replace  [program]
            Prg  [ program ] 
        import TXLinput [stringlit]

        construct Str_TmpFile  [stringlit]
            TXLinput  [ +  ".tmp" ] 
        construct Str_RmTmpFile  [stringlit]
            _  [ +  "/bin/rm -f " ]  [ +  Str_TmpFile ] 
        construct P2  [program]
            Prg  [ write  Str_TmpFile ]  [ read  Str_TmpFile ]  [ system  Str_RmTmpFile ] 
        construct S_Diff  [stringlit]
            _  [ quote  P2 ] 
        where not
            S_Diff  [=  ""]
        by
            Prg 
    end function

    function print_diff_2
        replace  [program]
            Prg  [ program ] 
        import TXLinput [stringlit]

        construct Str_TmpFile  [stringlit]
            TXLinput  [ +  ".tmp" ] 
        construct Str_RmTmpFile  [stringlit]
            _  [ +  "/bin/rm -f " ]  [ +  Str_TmpFile ] 
        construct P2  [program]
            Prg  [ program_normalise ]  [ write  Str_TmpFile ]  [ read  Str_TmpFile ]  [ system  Str_RmTmpFile ] 
        construct S_Diff  [stringlit]
            _  [ quote  P2 ] 
        where
            S_Diff  [=  ""]
        by
            _ 
    end function

    function print_diff
        replace  [program]
            P_diff  [ program ] 
        import CloneNumber [number]

        import Program_Diff [program]

        where
            CloneNumber  [>  0]
        construct P_Clone  [program]
            CloneNumber 
        construct P_Left  [program]
            P_diff  [ print_diff_1 ]  [ print_diff_2 ]  [ printattr ] 
        construct P_Right  [program]
            Program_Diff  [ print_diff_1 ]  [ print_diff_2 ]  [ printattr ] 
        by
            P_Clone 
    end function

    function main
        replace  [program]
            Prg  [ program ] 
        export Program_Diff [program]
            _ 
        by
            Prg  [ program_normalise ]  [ program_remove_clone ]  [ print_diff ] 
    end function

