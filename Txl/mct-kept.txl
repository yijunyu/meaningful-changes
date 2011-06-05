
rule typeSpec_eliminateKeptAnnotations
 replace * [typeSpec] T [typeSpec] 
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] 
	K [kept] 
 by M I R
end rule

% Construct rules to eliminate all clones in type T 
%
rule typeSpec_removeClones
 replace * [typeSpec] T [typeSpec] 
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] K [kept] O [opt orderedBy] Ig [opt ignoredWhen]
 construct T1 [typeSpec] M I R O Ig
 construct update_id_T1 [typeSpec] T1 [update_id I]
 by T1 
end rule
%
% Update ID is a subroutine with no effect on the typeSpec transformation itself, but will introduce new 
% rules into the program
%
% Check the TypeIDs to avoid creating duplicate type rules
%
function update_id I [typeid]
 import Rules [statement*]
 import KeepRuleIDs [id*]
 import IgnoreRuleIDs [id*]
 import TypeIDs [id*]
 match [typeSpec] T [typeSpec]
 deconstruct I TypeID [id] 
 where not TypeIDs [contains TypeID]
 construct find_replace [id] 'find_replace
 construct mark_clones [id] 'mark_clones
 construct find_clones [id] 'find_clones
 construct add_if_clones [id] 'add_if_clones
 construct find_replace_I [id] find_replace [_ TypeID]
 construct mark_clones_I [id] mark_clones [_ TypeID]
 construct find_clones_I [id] find_clones [_ TypeID]
 construct add_if_clones_1 [id] add_if_clones [_ TypeID] [!]
 construct add_if_clones_2 [id] add_if_clones [_ TypeID] [!]
 construct Stmt_1 [statement*]
     % Make sure the line number is output when -attr is on
#ifdef LINENO
     'redefine TypeID 
#ifdef LINENO_XYZ
	'['opt 'coordinates 'ignored'] 
#else
	'['opt 'srcfilename 'ignored'] '['opt 'srclinenumber 'ignored'] 
#enddif
	'['NL'] '... 
     'end 'define
#endif
     'redefine TypeID 
	'... '| '[ 'attr 'Change '] 
     'end 'define
     'function find_replace_I 
	    'replace '[ 'program '] 'P '[ 'program ']
	    'import 'Program_Diff '['program']
	    'construct 'S '[ TypeID '* '] '_ '[ find_clones_I 'P 'Program_Diff ']
	    'construct 'P3 '[ 'program '] 'P '[ mark_clones_I 'each 'S ']
	    'by 'P3
     'end 'function
     'function find_clones_I 'P '[ 'program '] 'P2 '[ 'program ']
	    'replace '[ TypeID '* '] _ '[ TypeID '* ']
	    'construct 'S '[ TypeID '* '] '_ '[ '^ 'P ']
	    'by '_ '[ add_if_clones_1 'P2 'each 'S ']
     'end 'function
     'function add_if_clones_1 'P2 '[ 'program '] 'Stmt '[ TypeID ']
	    'construct 'S2 '[ TypeID '* '] '_ '[ '^ 'P2 '] 
	    'deconstruct '* 'S2 'Stmt 'Rest '[ TypeID '* ']
	    'replace '[ TypeID '* '] 'StructuredClones '[ TypeID '* ']
	    'deconstruct 'not '* 'StructuredClones 'C '['attr 'Change '] 
	    'by 'StructuredClones '[ '. 'Stmt '] 
     'end 'function
     'function mark_clones_I 'S '[ TypeID ']
	    'import 'CloneNumber '['number']
	    'import 'Program_Diff '['program']
	    'export 'CloneNumber 'CloneNumber '['+ '1']
	    'construct 'C '[ 'stringlit '] '_ '['quote 'S ']
	    'where 'not 'C '['= ""']
	    'construct 'S2 '[ TypeID '] '>>>>>> 'C
	    'export 'Program_Diff 'Program_Diff  '[ '$ 'S 'S2 ']
	    'replace '[ 'program '] 'P '[ 'program '] 
	    'construct 'S1 '[ TypeID '] '<<<<<< 'C
	    'by 'P '[ '$ 'S 'S1 ']
     'end 'function
 export Rules Rules [. Stmt_1] 
 export KeepRuleIDs KeepRuleIDs [. find_replace_I] 
 export TypeIDs TypeIDs [. TypeID] 
end function


