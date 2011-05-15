% Author: Yijun Yu
% Purpose: normalise the YAML files based on the following assumptions:
%
% 1) The instances of List are ordered data
% 2) The instances of Dict are unordered data
%
% As a result of the normalisation, we first
% convert all Lists of length N into Dicts with keys ranging from 1, ..., N;
% then we sort the Dict instances by their keys.
%
% In addtion, we also put every scalar in one line
%
% In this way, two YAML files are same/different meaning if and only if their
% normalised files are different.
%

include "yaml.grm"

define program
    [yaml]
end define

function main
    replace [program]
	P [program]
    by 
	P [List_to_dict]
	  [sort_dict]
end function

rule List_to_dict
    replace $ [node] Node [node]
    deconstruct Node L [List]
    construct P_new [node]
	Node [List_to_dict_node] [List_to_dict_node1] 
    by 
	P_new % [print]
end rule

function List_to_dict_node
    replace [node] P [node]
    deconstruct P 	L [ListNode*]
    construct Number [number] _ [length L] % [print]
    construct D_P [NL_pair*] _ [ListNode_to_Pair Number L]
    construct D [Dict]
	'INDENT 
		D_P
	'DEDENT
    by D
end function

function List_to_dict_node1
    replace [node] P [node]
    deconstruct P  _ [indent] L [ListNode*] _ [dedent]
    construct Number [number] _ [length L] % [print]
    construct D_P [NL_pair*] _ [ListNode_to_Pair Number L]
    construct D [Dict]
	'INDENT 
		D_P
	'DEDENT
    by D
end function


function ListNode_to_Pair Number [number] N [ListNode*]
    deconstruct N  N1 [ListNode] N2 [ListNode*]
    construct L_no [number] _ [length N2] %[print]
    deconstruct N1 '- Nd [node]
    construct Nd_new [node] Nd [List_to_dict_node] 
    construct Item [number] Number [- L_no]
    construct P1 [NL_pair] Item ': Nd_new % [print]
    construct P2 [NL_pair*] _ [ListNode_to_Pair Number N2]
    construct P_new [NL_pair*]   _ [. P1] [. P2] % [print]
    replace [NL_pair*] _ [NL_pair*] 	by P_new % [print]
end function

rule sort_dict
    replace $ [node] Node [node]
    deconstruct Node D [Dict]
    construct P_new [node]
	Node [Sort_dict_node] [Sort_dict_node1]
    by 
	P_new % [print]
end rule

rule bubbleSortStringlit
    replace [NL_pair*] N1 [NL_pair] N2 [NL_pair] Rest [NL_pair*]
    deconstruct N1   K1 [stringlit] ': V1 [node]
    deconstruct N2   K2 [stringlit] ': V2 [node]
    where
         K1 [> K2]
    by
         N2 N1 Rest
end rule

rule bubbleSortId
    replace [NL_pair*] N1 [NL_pair] N2 [NL_pair] Rest [NL_pair*]
    deconstruct N1   K1 [id] ': V1 [node]
    deconstruct N2   K2 [id] ': V2 [node]
    construct k1 [stringlit] _ [quote K1]
    construct k2 [stringlit] _ [quote K2]
%    construct d_sort_K1 [stringlit] k1 % [print]
%    construct d_sort_K2 [stringlit] k2 % [print]
    where
         k1 [> k2]
    by
         N2 N1 Rest
end rule

rule bubbleSortNumber
    replace [NL_pair*] N1 [NL_pair] N2 [NL_pair] Rest [NL_pair*]
    deconstruct N1   K1 [number] ': V1 [node]
    deconstruct N2   K2 [number] ': V2 [node]
%    construct d_sort_K1 [number] K1 % [print]
%    construct d_sort_K2 [number] K2 % [print]
    where
         K1 [> K2]
    by
         N2 N1 Rest
end rule


function Sort_dict_node
    replace [node] P [node]
    deconstruct P 'INDENT L [NL_pair*] 'DEDENT
%		construct d_Sort1 [number] _ [length L] [putp "%"]
    construct D_P [NL_pair*] L 	[bubbleSortStringlit] 
				[bubbleSortNumber] 
				[bubbleSortId]
    construct D [Dict]
	'INDENT 
		D_P
	'DEDENT
    by D
end function

function Sort_dict_node1
    replace [node] P [node]
    deconstruct P P0 [pair] _ [indent] L [indent_pairs] _ [dedent]
    deconstruct L 	L0 [NL_pair*]
    construct P1 [NL_pair]
	P0
    construct L1 [NL_pair*]
	_ [. P1] [. L0]
%		construct d_Sort1 [number] _ [length L1] [putp "%"]
    construct D_P [NL_pair*] L1 [bubbleSortStringlit] 
				[bubbleSortNumber] 
				[bubbleSortId]
    construct D [Dict]
	'INDENT 
		D_P
	'DEDENT
    by D
end function

