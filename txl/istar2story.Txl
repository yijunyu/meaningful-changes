#pragma -newline
include "Q7/q7.grm"
include "UserStory/story.grm"

define program
    [advice*]
  | [story*]
end define

function why2goal WHY [whyQ]
  replace [goal*] _ [goal*]
  deconstruct * [name] WHY N [name]
  construct G [goal] N
  by _ [. G]
end function

function who2role WHO [opt whoQ]
  replace [role] _ [role]
  deconstruct * [name] WHO N [name]
  construct R [role] N
  by R
end function

function advice2action Ad [advice]
  replace [action*] _ [action*]
  deconstruct * [whyQ] Ad W [whyQ]
  deconstruct * [name] W N [name]
  construct A [action] N
  by _ [. A]
end function

function how2action HOW [opt howQ]
  replace [action*] A0 [action*]
  deconstruct * [advice+] HOW A1 [advice+]
  construct A2 [action*] _ [advice2action each A1]
  by A0 [. A2]
end function

function constructStory Role [role] Goal [goal] Action [action]
   replace [story*] _ [story*]
   construct S [story]
    'As 'a Role ', 
    'I 'want 'to Action 
    'so 'that Goal '. 
   by _ [. S]
end function

function advice2story A [advice*]
   replace [story*] S [story*]
   deconstruct A A1 [advice] A2 [advice*]
   construct S_A2 [story*] _ [advice2story A2]
   deconstruct A1
    WHEN [opt whenQ] WHO [opt whoQ] WHY [whyQ] WHAT [opt whatQ] WHERE [opt whereQ] HOW [opt howQ] HOWMUCH [opt howMuchQ] NewLine [newline]
   construct Role [role] _ [who2role WHO]
   construct Action [action*] _ [how2action HOW]
   construct Goal [goal*] _ [why2goal WHY]
   construct S_A1 [story*] _ [constructStory Role each Goal Action]
   by S [. S_A1] [. S_A2]
end function

function goals
  replace [program] P [program]
  deconstruct P A [advice*]
  construct Stories [story*]
	_ [advice2story A]
  construct P2 [program]
	Stories
  by P2
end function

function main
  replace [program] P [program]
  by P [goals]
end function
