function remove_include I [includeStatement]
  deconstruct I 'include Str [stringlit]
  construct Str_file [stringlit] _ [+ "Txl/"] [+ Str]
  construct P2 [program] _ [read Str_file] 
  deconstruct P2 S2 [statement*] 
  replace * [statement*] I S [statement*] 
  by _ [. S2] [. S] [expand_includes]
end function

function expand_includes
  replace [statement*] P [statement*] 
  construct Statement_include [includeStatement*] _ [^ P]
  by P [remove_include each Statement_include]
end function

function include_all
  replace [program] P [statement*] 
  by P [expand_includes]
end function
