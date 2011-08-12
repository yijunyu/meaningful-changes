/----- Output Parse Tree -----/ {
 to_print = 1;
} 
/----- End Output Parse Tree -----/ {
 to_print = 0;
} 
! /----- Output Parse Tree -----/ &&
! /----- End Output Parse Tree -----/ {
 if (to_print) {
	print
 }
}
