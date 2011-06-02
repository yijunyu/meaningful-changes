
rule typeSpec_eliminateKeptAnnotations
 replace * [typeSpec] T [typeSpec] 
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] 
	K [kept] 
 by M I R
end rule

rule typeSpec_eliminateOrderedAnnotations
 replace * [typeSpec] T [typeSpec] 
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] K [opt kept]
	O [orderedBy] 
 by M I R
end rule

rule typeSpec_eliminateIgnoredAnnotations
 replace * [typeSpec] T [typeSpec] 
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] K [opt kept] O [opt orderedBy] 
	Ig [ignoredWhen] 
 by M I R
end rule

rule typeSpec_eliminatePreferredAnnotations
 replace * [typeSpec] T [typeSpec] 
 deconstruct T M [opt typeModifier] I [typeid] R [opt typeRepeater] K [opt kept] O [opt orderedBy] Ig [opt ignoredWhen] 
 	P [preferredWith]
 by M I R
end rule
