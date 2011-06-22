include "Q7/q7.grm"
include "YAML/yaml.grm"

redefine program
     [advice*] 
   | [yaml]
end define

redefine node
   ... | [howQ]
end define

function main
    replace [program] P [program]
    export N [number] 0
    export nodes [List] _
    by P [techne]
end function

function techne
    replace [program] P [program]
    construct G [advice*] _ [^ P]
    construct HL [ListNode*] _ [hardgoals_to_list each G]
    construct SL [ListNode*] _ [softgoals_to_list each G]
    construct n [List] HL [. SL]
    export nodes [List] n
    construct EL [ListNode*] _ [decompositions_to_list each G]
    construct e [List] EL
    construct P1 [program] n e
    by P1
end function

function create_node
    replace [id] _ [id]
    import N [number] 
    import nodes [List] 
    construct s_N [stringlit] _ [quote N]
    construct s_node_id [stringlit] _ [+ 'node_] [+ s_N]
    construct node_id [id] _ [unquote s_node_id]
    export N N [+ 1] 
    by node_id
end function

function hardgoals_to_list A [advice]
    replace [ListNode*] L [ListNode*]
    deconstruct * [whyQ] A G [whyQ] 
    construct S1 [stringlit] _ [quote G]
    construct Name [id*] _ [^ G]
    construct N [id] _ [create_node]
    construct L1 [ListNode] '- '{ 'node: N, 'type: 'goal, 'name: Name '}
    construct LL [ListNode*] _ [. L1] [. L]
    by LL
end function

function softgoals_to_list A [advice]
    replace [ListNode*] L [ListNode*]
    construct SGS [howMuch*] _ [^ A]
    construct LL [ListNode*] _ [create_soft_goal each SGS]
    by L [. LL]
end function

function create_soft_goal S [howMuch]
    replace [ListNode*] L [ListNode*]
    deconstruct S _ [opt newline] _ [howMuchOp] _ [opt whoQ] SG [whyQ]
    construct S1 [stringlit] _ [quote SG]
    construct Name [id*] _ [^ S]
    construct N [id] _ [create_node]
    construct L1 [ListNode] '- '{ 'node: N, 'type: 'softgoal, 'name: Name '}
    by L [. L1]
end function

function create_edge
    replace [id] _ [id]
    import N [number] 
    construct s_N [stringlit] _ [quote N]
    construct s_node_id [stringlit] _ [+ 'i] [+ s_N]
    construct node_id [id] _ [unquote s_node_id]
    export N N [+ 1] 
    by node_id
end function

function decompositions_to_list A [advice]
    replace [ListNode*] L [ListNode*]
    deconstruct A 
 	_ [opt whenQ] _ [opt whoQ] G [whyQ] _ [opt whatQ] _ [opt whereQ] S [howQ] _ [opt howMuchQ] _ [newline]
    construct Name [id*] _ [^ G]
    construct E [id] _ [create_edge]
    construct L1 [ListNode] 
	'- 'rel: E 'type: 'inference 'source: Name 'target: S [listing_source]
    construct LL [ListNode*] _ [. L1] [. L]
    by LL
end function

function listing_source
    replace [node] L [node]
    deconstruct L '{ O [howOp] _ [opt newline] _ [opt indent] A [advice+] _ [opt dedent] '} 
    by L
end function

