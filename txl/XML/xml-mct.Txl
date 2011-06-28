tokens
    name               "[\a_:][\a\d.-_:]*"
    dname              "[\a\d.-_:]+"
    xml                "[x|X][m|M][l|L]"
end tokens

comments
    <!--  -->
    <?  xml
    ?>
end comments

define prolog
    [dtd_body] 
end define
define dtd_body
    [repeat misc]  [opt doctypedecl] 
end define
define doctypedecl
    '<!DOCTYPE  [spaces]  [name]  [spaces]  [opt sp_external_id]  [spaces]  [opt declbody]  [spaces]  '>  [spaces] 
end define
define declbody
    '[ [repeat decl]  '] 
end define
define literal
    [charlit] 
    |    [stringlit] 
end define
define pi
    '<?  [pitarget]  [opt sub1_pi]  '?>     
end define
define pitarget
    [not xml]  [name] 
end define
define sub1_pi
    [spaces]  [not sub2_pi]  [token] 
end define
define sub2_pi
    [token]  '?>  [token] 
end define
define sp_external_id
    [spaces]  [external_id] 
end define
define external_id
    [exid_sys] 
    |    [exid_pub] 
end define
define exid_sys
    'SYSTEM  [spaces]  [literal] 
end define
define exid_pub
    'PUBLIC  [spaces]  [literal]  [spaces]  [literal] 
end define
define decl
    [markupdecl] 
    |    '%  [name]  '; 
    |    [spaces] 
end define
define markupdecl
    [elementdecl] 
    |    [attlistdecl] 
    |    [entitydecl] 
    |    [notationdecl] 
    |    [pi] 
    |    [comment] 
end define
define elementdecl
    '<!ELEMENT  [spaces]  [name]  [spaces]  [contentspec]  [spaces]  '>  [spaces] 
end define
define contentspec
    'EMPTY     
    |    'ANY     
    |    [mixed] 
    |    [children] 
end define
define children
    [children_body]  [opt repetition] 
end define
define repetition
    '?     
    |    '*     
    |    '+     
end define
define children_body
    [choice] 
    |    [seq] 
end define
define choice
    '( [spaces]  [cp]  [choice_item]  [repeat choice_item]  [spaces]  ')     
end define
define choice_item
    [spaces]  '|  [spaces]  [cp] 
end define
define cp
    [cp_body]  [opt repetition] 
end define
define cp_body
    [name] 
    |    [choice] 
    |    [seq] 
end define
define seq
    '( [spaces]  [cp]  [repeat more_cps]  [spaces]  ')     
end define
define more_cps
    [spaces]  ',  [spaces]  [cp] 
end define
define mixed
    [pcdata_or_name] 
    |    [pcdata] 
end define
define pcdata_or_name
    '( [spaces]  '#PCDATA  [repeat more_names]  [spaces]  ')*     
end define
define more_names
    [spaces]  '|  [spaces]  [name] 
end define
define pcdata
    '( [spaces]  '#PCDATA  [spaces]  ')     
end define
define attlistdecl
    '<!ATTLIST  [spaces]  [name]  [repeat attdef]  [spaces]  '>  [spaces] 
end define
define attdef
    [spaces]  [name]  [spaces]  [atttype]  [spaces]  [defaultdecl] 
end define
define atttype
    [stringtype] 
    |    [tokenizedtype] 
    |    [enumeratedtype] 
end define
define stringtype
    'CDATA     
end define
define tokenizedtype
    'ID     
    |    'IDREF     
    |    'IDREFS     
    |    'ENTITY     
    |    'ENTITIES     
    |    'NMTOKEN     
    |    'NMTOKENS     
end define
define enumeratedtype
    [notationtype] 
    |    [enumeration] 
end define
define notationtype
    'NOTATION  [spaces]  '( [spaces]  [name]  [repeat more_names]  [spaces]  ')     
end define
define enumeration
    '( [spaces]  [nmtoken]  [repeat more_nmtokens]  [spaces]  ')     
end define
define nmtoken
    [name] 
    |    [dname] 
end define
define more_nmtokens
    [spaces]  '|  [spaces]  [nmtoken] 
end define
define defaultdecl
    '#REQUIRED     
    |    '#IMPLIED     
    |    [opt fixed]  [attvalue] 
end define
define fixed
    '#FIXED  [spaces] 
end define
define attvalue
    [stringlit] 
    |    [charlit] 
    |    [longstringlit] 
    |    [longcharlit] 
end define
define longstringlit
    '"     [repeat not_dquote]  '"     
end define
define not_dquote
    [not  '"]  [token] 
end define
define longcharlit
    ''     [repeat not_quote]  ''     
end define
define not_quote
    [not  '']  [token] 
end define
define entitydecl
    [gedecl] 
    |    [pedecl] 
end define
define gedecl
    '<!ENTITY  [spaces]  [name]  [spaces]  [entitydef]  [spaces]  '>  [spaces] 
end define
define pedecl
    '<!ENTITY  [spaces]  '%  [spaces]  [name]  [spaces]  [pedef]  [spaces]  '>  [spaces] 
end define
define entitydef
    [entityvalue] 
    |    [external_id]  [opt ndatadecl] 
end define
define pedef
    [entityvalue] 
    |    [external_id] 
end define
define ndatadecl
    [spaces]  'NDATA  [spaces]  [name] 
end define
define entityvalue
    [charlit] 
    |    [stringlit] 
    |    [longstringlit] 
    |    [longcharlit] 
end define
define notationdecl
    '<!NOTATION  [spaces]  [name]  [spaces]  [exid_or_pubid]  [spaces]  '>  [spaces] 
end define
define exid_or_pubid
    [external_id] 
    |    'PUBLIC  [spaces]  [literal] 
end define
define spaces
    [repeat space_or_newline] 
end define
define space_or_newline
    [space] 
    |    [newline] 
end define
tokens
    charref            "&#[\d]+;"
               |       "&#x[\d\abcdefABCDEF]+;"
    regexp             "\[^#\]*\]"
end tokens

define element
    [empty_elem_tag]  [spaces] 
    |    [tag_content]  [spaces] 
end define
define tag_content
    [stag]  [IN]
        [content]  [EX]
    [etag] 
end define
define content
    [spaces]  [repeat chardata]  [spaces]  [repeat sub1_content]  [spaces] 
end define
define sub1_content
    [spaces]  [sub2_content]  [spaces]  [repeat chardata]  [spaces] 
end define
define chardata
    [not cdend]  [not  '<]  [not  '&]  [token] 
end define
define etag
    '</  [name]  [spaces]  '>     
end define
define cdend
    ']  ']  '>     
end define
define reference
    '&  [name]  ';     
    |    [charref] 
end define
define cdsect
    '<!  '[ CDATA  '[ [repeat cdata]  [cdend] 
end define
define program
    [prolog]  [element] 
end define
define tag_content
    [stag]  [IN]
        [content]  [EX]
    [etag] 
end define
define empty_elem_tag
    '<  [name]  [repeat attribute]  [spaces]  '/> 
end define
define stag
    '<  [name]  [repeat attribute]  [spaces]  '> 
end define
define attribute
    [spaces]  [name]  '=  [attvalue] 
end define
define sub2_content
    [element] 
    |    [reference] 
    |    [cdsect] 
    |    [pi] 
    |    [regexp] 
end define
define cdata
    [not cdend]  [token] 
end define
define misc
    [pi] 
    |    [space] 
    |    [newline] 
end define
keys
    <<<<<<  >>>>>> 
end keys

compounds
    <<<<<<  >>>>>> 
end compounds

define Change
            [NL]
    <<<<<<  [opt stringlit]  [NL]
    |  [NL]
    >>>>>>  [opt stringlit]  [NL]
 
end define
redefine stag
    ...
|       
    [attr Change] 

end define
function find_replace_stag
    replace  [program]
        P  [ program ] 
    import Program_Diff [program]

    construct S  [stag *]
        _  [ find_clones_stag  P  Program_Diff ] 
    construct P3  [program]
        P  [mark_clones_stag  each  S]
 
    by
        P3 
end function

function find_clones_stag P  [program] P2  [program]
    replace  [stag *]
        _  [ stag  * ] 
    construct S  [stag *]
        _  [ ^  P ] 
    by
        _  [add_if_clones_stag1  P2  each  S]
 
end function

function add_if_clones_stag1 P2  [program] Stmt  [stag]
    construct S2  [stag *]
        _  [ ^  P2 ] 
    deconstruct * S2
        Stmt  Rest  [ stag  * ] 
    replace  [stag *]
        StructuredClones  [ stag  * ] 
    deconstruct not * StructuredClones
        C  [attr Change] 
    by
        StructuredClones  [ . Stmt ] 
end function

function mark_clones_stag S  [stag]
    import CloneNumber [number]

    import Program_Diff [program]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    construct C  [stringlit]
        _  [ quote  S ] 
    where not
        C  [=  ""]
    construct S2  [stag]
        >>>>>>  C 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    construct S1  [stag]
        <<<<<<  C 
    by
        P  [ $  S  S1 ] 
end function

redefine content
    ...
|       
    [attr Change] 

end define
function find_replace_content
    replace  [program]
        P  [ program ] 
    import Program_Diff [program]

    construct S  [content *]
        _  [ find_clones_content  P  Program_Diff ] 
    construct P3  [program]
        P  [mark_clones_content  each  S]
 
    by
        P3 
end function

function find_clones_content P  [program] P2  [program]
    replace  [content *]
        _  [ content  * ] 
    construct S  [content *]
        _  [ ^  P ] 
    by
        _  [add_if_clones_content1  P2  each  S]
 
end function

function add_if_clones_content1 P2  [program] Stmt  [content]
    construct S2  [content *]
        _  [ ^  P2 ] 
    deconstruct * S2
        Stmt  Rest  [ content  * ] 
    replace  [content *]
        StructuredClones  [ content  * ] 
    deconstruct not * StructuredClones
        C  [attr Change] 
    by
        StructuredClones  [ . Stmt ] 
end function

function mark_clones_content S  [content]
    import CloneNumber [number]

    import Program_Diff [program]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    construct C  [stringlit]
        _  [ quote  S ] 
    where not
        C  [=  ""]
    construct S2  [content]
        >>>>>>  C 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    construct S1  [content]
        <<<<<<  C 
    by
        P  [ $  S  S1 ] 
end function

redefine etag
    ...
|       
    [attr Change] 

end define
function find_replace_etag
    replace  [program]
        P  [ program ] 
    import Program_Diff [program]

    construct S  [etag *]
        _  [ find_clones_etag  P  Program_Diff ] 
    construct P3  [program]
        P  [mark_clones_etag  each  S]
 
    by
        P3 
end function

function find_clones_etag P  [program] P2  [program]
    replace  [etag *]
        _  [ etag  * ] 
    construct S  [etag *]
        _  [ ^  P ] 
    by
        _  [add_if_clones_etag1  P2  each  S]
 
end function

function add_if_clones_etag1 P2  [program] Stmt  [etag]
    construct S2  [etag *]
        _  [ ^  P2 ] 
    deconstruct * S2
        Stmt  Rest  [ etag  * ] 
    replace  [etag *]
        StructuredClones  [ etag  * ] 
    deconstruct not * StructuredClones
        C  [attr Change] 
    by
        StructuredClones  [ . Stmt ] 
end function

function mark_clones_etag S  [etag]
    import CloneNumber [number]

    import Program_Diff [program]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    construct C  [stringlit]
        _  [ quote  S ] 
    where not
        C  [=  ""]
    construct S2  [etag]
        >>>>>>  C 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    construct S1  [etag]
        <<<<<<  C 
    by
        P  [ $  S  S1 ] 
end function

redefine attribute
    ...
|       
    [attr Change] 

end define
function find_replace_attribute
    replace  [program]
        P  [ program ] 
    import Program_Diff [program]

    construct S  [attribute *]
        _  [ find_clones_attribute  P  Program_Diff ] 
    construct P3  [program]
        P  [mark_clones_attribute  each  S]
 
    by
        P3 
end function

function find_clones_attribute P  [program] P2  [program]
    replace  [attribute *]
        _  [ attribute  * ] 
    construct S  [attribute *]
        _  [ ^  P ] 
    by
        _  [add_if_clones_attribute1  P2  each  S]
 
end function

function add_if_clones_attribute1 P2  [program] Stmt  [attribute]
    construct S2  [attribute *]
        _  [ ^  P2 ] 
    deconstruct * S2
        Stmt  Rest  [ attribute  * ] 
    replace  [attribute *]
        StructuredClones  [ attribute  * ] 
    deconstruct not * StructuredClones
        C  [attr Change] 
    by
        StructuredClones  [ . Stmt ] 
end function

function mark_clones_attribute S  [attribute]
    import CloneNumber [number]

    import Program_Diff [program]

    export CloneNumber
        CloneNumber  [ +  1 ] 
    construct C  [stringlit]
        _  [ quote  S ] 
    where not
        C  [=  ""]
    construct S2  [attribute]
        >>>>>>  C 
    export Program_Diff
        Program_Diff  [ $  S  S2 ] 
    replace  [program]
        P  [ program ] 
    construct S1  [attribute]
        <<<<<<  C 
    by
        P  [ $  S  S1 ] 
end function

rule normalise_list_empty_elem_tag_attribute
    replace  [repeat attribute]
        N1  [attribute]  N2  [attribute]  Rest  [repeat attribute] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2  N1  Rest 
end rule

rule normalise_list_stag_attribute
    replace  [repeat attribute]
        N1  [attribute]  N2  [attribute]  Rest  [repeat attribute] 
    construct T1  [stringlit]
        _  [ quote  N1 ] 
    construct T2  [stringlit]
        _  [ quote  N2 ] 
    where
        T1  [>  T2]
    by
        N2  N1  Rest 
end rule

function program_normalise
    replace  [program]
        Prg  [ program ] 
    by
        Prg  [ normalise_list_empty_elem_tag_attribute ]  [ normalise_list_stag_attribute ] 
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
        Prg  [ find_replace_stag ]  [ find_replace_content ]  [ find_replace_etag ]  [ find_replace_attribute ] 
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

