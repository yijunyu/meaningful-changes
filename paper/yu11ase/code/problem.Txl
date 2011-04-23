define problem_description
  [indent]  [repeat E +]  [dedent] 
end define
define E
  [name]  [opt type]  [opt details]  [opt  ':]  [opt stringlit] 
end define
define details
  '{ [indent]  [list phenomena]  [NL]
  [dedent]  '} 
end define
rule Small B [E]
   match  [E] A [E] 
   construct SA  [stringlit] _  [quote  A] 
   construct SB  [stringlit] _  [quote  B] 
   where SA  [<  SB]
end rule
rule normalise_repeat_problem_description_E
   replace  [repeat E] N1  [E]  N2  [E]  Rest  [repeat E] 
   where N1  [Small  N2]
   by N2  N1  Rest 
end rule
rule normalise_list_details_phenomena
   replace  [list phenomena] N1 [phenomena],  N2 [phenomena],  Rest [list phenomena] 
   construct T1  [stringlit] _  [ quote  N1 ] 
   construct T2  [stringlit] _  [ quote  N2 ] 
   where T1  [>  T2]
   by N2,  N1,  Rest 
end rule
function main
   replace  [program] Prg  [ program ] 
   by Prg  [ normalise_repeat_problem_description_E ]  
           [ normalise_list_details_phenomena ] 
end function
