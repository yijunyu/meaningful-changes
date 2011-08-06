include "UserStory/story.grm"

define program
    [advice*]
  | [story*]
end define

function why2goal A1 [advice]
  replace [opt goal] _ [opt goal]
  deconstruct * [whyQ] A1 WHY [whyQ]
  deconstruct * [name] WHY N [name]
  by 'so 'that N
end function

function why2goal2 A1 [advice]
  deconstruct not * [whyQ] A1 WHY [whyQ]
  replace [opt goal] G0 [opt goal]
  by _
end function

function who2role A1 [advice]
  deconstruct * [opt whoQ] A1 WHO [opt whoQ]
  replace [opt role] _ [opt role]
  deconstruct * [name] WHO N [name]
  by 'As N ',
end function

function who2role2 A1 [advice]
  deconstruct not * [opt whoQ] A1 WHO [opt whoQ]
  replace [opt role] R0 [opt role]
  by _
end function

function advice2action Ad [advice]
  replace [action*] Act [action*]
  deconstruct * [whyQ] Ad W [whyQ]
  deconstruct * [name] W N [name]
  construct Action [action] 'we 'want 'to N
  by Act [. Action]
end function

function how2action A [advice]
  replace [action*] A0 [action*]
  deconstruct * [opt howQ] A HOW [opt howQ]
  deconstruct HOW 
    Op [howOp] IND [opt indent] NewL [opt newline] A1 [advice+] DED [opt dedent] 
  construct A2 [action*] _ [advice2action each A1]
  by A0 [. A2]
end function

function how2action2 A [advice]
  replace [action*] A0 [action*]
  deconstruct * [opt howQ] A HOW [opt howQ]
  deconstruct HOW 
   '{ Op [howOp] NewL [opt newline] IND [opt indent] A1 [advice+] DED [opt dedent] '} 
  construct A2 [action*] _ [advice2action each A1]
  by A0 [. A2]
end function

function constructStory Role [opt role] Goal [opt goal] Action [action] 
   replace [story*] S [story*]
   construct Story [story] Role Action Goal '.
   by S [. Story]
end function

function constructStories Role [opt role] Ad [advice]
   deconstruct not Role 
   construct Goal [opt goal] _ [why2goal Ad] [why2goal2 Ad]
   construct Action [action*] _ [how2action Ad] [how2action2 Ad]
   replace [story*] S [story*]
   by S [constructStory Role Goal each Action]
end function

function advice2story A [advice*]
   replace [story*] S [story*]
   deconstruct A A1 [advice] A2 [advice*]
   construct Role [opt role] _ [who2role A1] [who2role2 A1] 
   deconstruct not Role 
   construct Sub [advice*] _ [^ A1] % [. A1] 
   construct S_A1 [story*] _ [constructStories Role each Sub] 
   construct S_A2 [story*] _ [advice2story A2]
   by S [. S_A1] [. S_A2] % [print]
end function

function roles
  replace [program] P [program]
  construct A [advice*] _ [^ P] % [print]
  construct S [story*] _ [advice2story A]
  by S
end function

function main
  replace [program] P [program]
  by P [roles]
end function
