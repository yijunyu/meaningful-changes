include "java.grm"
redefine class_or_interface_body
        '{ [NL] [IN]
            [repeat class_body_declaration]  [EX] [NL]
        '}  [opt  ';]  [NL] [NL] 
end define
redefine method_declaration
   [NL] [repeat modifier]  [opt generic_parameter]  [type_specifier]  [method_declarator]  [opt throws]  [method_body] 
end define
rule normalise_list_method_declaration_modifier
    replace  [repeat modifier]
        N1  [modifier]  N2  [modifier]  Rest  [repeat modifier] 
    where
        N1  [Descending  N2]
    by
        N2  N1  Rest 
end rule
function main
    replace  [program]
        Prg  [ program ] 
    by
        Prg  [ normalise_list_method_declaration_modifier ] 
end function
