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
define phenomena
    [name] 
    |    'event  [name] 
    |    'state  [name] 
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
define header
    [comment_nl]  'problem  [SPOFF]  ':  [SPON]  [name]  [NL] 
end define
define my_comment
    [comment] 
end define
define comment_nl
    [repeat my_comment] 
end define
define program
    [header]  [opt problem_description] 
end define
define problem_description
    [indent]  [repeat E +]  [dedent] 
end define
define E
    [comment_nl]  [name]  [opt type]  [opt details]  [comment_nl]  [opt  ':]  [comment_nl]  [opt stringlit]  [NL] 
    |    [comment_nl]  [name]  [SP]  [SPOFF]  [rel]  [SPON]  [name]  [comment_nl]  [opt details]  [comment_nl]  [opt desc]  [NL
              ] 
end define
define details
    '{ [indent]  [list phenomena]  [dedent]  '} 
end define
rule Small B  [E]
    match  [E]
        A  [E] 
construct SA  [stringlit]
    _  [quote  A] 
construct SB  [stringlit]
    _  [quote  B] 
where
    SA  [>  SB] end rule

    keys
        ... <<<<<<  >>>>>> 
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
    redefine my_comment
        ...
    |   
        [attr Change] 

    end define
    function find_replace_my_comment
        replace  [program]
            P  [ program ] 
        import Program_Diff [program]

        construct S  [my_comment *]
            _  [ find_clones_my_comment  P  Program_Diff ] 
        construct P3  [program]
            P  [mark_clones_my_comment  each  S]
 
        by
            P3 
    end function

    function find_clones_my_comment P  [program] P2  [program]
        replace  [my_comment *]
            _  [ my_comment  * ] 
        construct S  [my_comment *]
            _  [ ^  P ] 
        by
            _  [add_if_clones_my_comment1  P2  each  S]
 
    end function

    function add_if_clones_my_comment1 P2  [program] Stmt  [my_comment]
        construct S2  [my_comment *]
            _  [ ^  P2 ] 
        deconstruct * S2
            Stmt  Rest  [ my_comment  * ] 
        replace  [my_comment *]
            StructuredClones  [ my_comment  * ] 
        deconstruct not * StructuredClones
            C  [attr Change] 
        by
            StructuredClones  [ . Stmt ] 
    end function

    function mark_clones_my_comment S  [my_comment]
        import CloneNumber [number]

        import Program_Diff [program]

        export CloneNumber
            CloneNumber  [ +  1 ] 
        construct C  [stringlit]
            _  [ quote  S ] 
        where not
            C  [=  ""]
        construct S2  [my_comment]
            >>>>>>  C 
        export Program_Diff
            Program_Diff  [ $  S  S2 ] 
        replace  [program]
            P  [ program ] 
        construct S1  [my_comment]
            <<<<<<  C 
        by
            P  [ $  S  S1 ] 
    end function

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

    rule normalise_list_problem_description_E
        replace  [repeat E]
            N1  [E]  N2  [E]  Rest  [repeat E] 
        where
            N1  [Small  N2]
        by
            N2  N1  Rest 
    end rule

    function normalise_ignore_by2_E_details2 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct not E1
            X16  [comment_nl]  X17  [name]  X18  [opt type]  X19  [opt details]  X20  [comment_nl]  X21  [opt  ':]  X22  [
              comment_nl]  X23  [opt stringlit] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_E_details2 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct E1
            X16  [comment_nl]  X17  [name]  X18  [opt type]  X19  [opt details]  X20  [comment_nl]  X21  [opt  ':]  X22  [
              comment_nl]  X23  [opt stringlit] 
        construct E2  [E]
            X16  X17  X18  X20  X21  X22  X23 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_E_details2
        replace  [program]
            P1  [ program ] 
        construct List1  [E *]
            _  [ ^  P1 ] 
        construct List2  [E *]
            _  [normalise_ignore_by3_E_details2  each  List1]  [normalise_ignore_by2_E_details2  each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_E_details4 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct not E1
            X35  [comment_nl]  X36  [name]  X37  [SP]  X38  [SPOFF]  X39  [rel]  X40  [SPON]  X41  [name]  X42  [comment_nl] 
              X43  [opt details]  X44  [comment_nl]  X45  [opt desc] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_E_details4 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct E1
            X35  [comment_nl]  X36  [name]  X37  [SP]  X38  [SPOFF]  X39  [rel]  X40  [SPON]  X41  [name]  X42  [comment_nl] 
              X43  [opt details]  X44  [comment_nl]  X45  [opt desc] 
        construct E2  [E]
            X35  X36  X37  X38  X39  X40  X41  X42  X44  X45 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_E_details4
        replace  [program]
            P1  [ program ] 
        construct List1  [E *]
            _  [ ^  P1 ] 
        construct List2  [E *]
            _  [normalise_ignore_by3_E_details4  each  List1]  [normalise_ignore_by2_E_details4  each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_E_details6 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct not E1
            X54  [comment_nl]  X55  [name]  X56  [opt type]  X57  [opt details]  X58  [comment_nl]  X59  [opt  ':]  X60  [
              comment_nl]  X61  [opt stringlit] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_E_details6 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct E1
            X54  [comment_nl]  X55  [name]  X56  [opt type]  X57  [opt details]  X58  [comment_nl]  X59  [opt  ':]  X60  [
              comment_nl]  X61  [opt stringlit] 
        construct E2  [E]
            X54  X55  X56  X58  X59  X60  X61 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_E_details6
        replace  [program]
            P1  [ program ] 
        construct List1  [E *]
            _  [ ^  P1 ] 
        construct List2  [E *]
            _  [normalise_ignore_by3_E_details6  each  List1]  [normalise_ignore_by2_E_details6  each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
    end function

    function normalise_ignore_by2_E_details8 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct not E1
            X73  [comment_nl]  X74  [name]  X75  [SP]  X76  [SPOFF]  X77  [rel]  X78  [SPON]  X79  [name]  X80  [comment_nl] 
              X81  [opt details]  X82  [comment_nl]  X83  [opt desc] 
        by
            Seq  [ . E1 ] 
    end function

    function normalise_ignore_by3_E_details8 E1  [E]
        replace  [E *]
            Seq  [E *] 
        deconstruct E1
            X73  [comment_nl]  X74  [name]  X75  [SP]  X76  [SPOFF]  X77  [rel]  X78  [SPON]  X79  [name]  X80  [comment_nl] 
              X81  [opt details]  X82  [comment_nl]  X83  [opt desc] 
        construct E2  [E]
            X73  X74  X75  X76  X77  X78  X79  X80  X82  X83 
        by
            Seq  [ . E2 ] 
    end function

    function normalise_ignore_by4_E_details8
        replace  [program]
            P1  [ program ] 
        construct List1  [E *]
            _  [ ^  P1 ] 
        construct List2  [E *]
            _  [normalise_ignore_by3_E_details8  each  List1]  [normalise_ignore_by2_E_details8  each  List1]
 
        construct P2  [program]
            P1  [ $  List1  List2 ] 
        by
            P2 
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

    function program_normalise
        replace  [program]
            Prg  [ program ] 
        by
            Prg  [ normalise_ignore_by4_E_details2 ]  [ normalise_ignore_by4_E_details4 ]  [ normalise_ignore_by4_E_details6 ] 
              [ normalise_ignore_by4_E_details8 ]  [ normalise_list_problem_description_E ]  [ normalise_list_details_phenomena 
              ] 
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
            Prg  [ find_replace_my_comment ]  [ find_replace_header ]  [ find_replace_problem_description ]  [ find_replace_E ] 
              [ find_replace_phenomena ] 
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
            Program_Diff  [ print_diff_1 ]  [ print_diff_2 ]  [ print ] 
        by
            P_Clone 
    end function

    function main
        replace  [program]
            Prg  [ program ] 
        export Program_Diff [program]
            _ 
        export Program [program]
            Prg 
        by
            Prg  [ program_normalise ]  [ program_remove_clone ]  [ print_diff ] 
    end function

