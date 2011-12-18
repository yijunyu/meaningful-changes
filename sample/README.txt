Sources and samples for the "DSL interaction with program transformation in TXL"
article by Mykhaylo Sorochan published at InfoQ
================================================================================

Prerequisites
------------------------
1. Download and install TXL distribution for your operating system from:
http://txl.ca/ndownload.html
2. Install graphviz package. From the URL below or from your OS package manager:
http://graphviz.org/Download.php
3. Make sure txl (txl.exe) and dot (dot.exe) commands are available from shell:
- add a path to the folder where above application were installed.
Or change the variables in the shell script - transform.sh/transform.bat that 
TXL and DOT points to the commands with the full path

Launching samples
-------------------------
Open a shell (command prompt). E.g. you want to transform sample1:
Unix (make sure transform.sh has +x mode - launch "chmod +x transform.sh" if no):
./transform.sh sample1.uml
Windows:
transform.bat sample.uml

Resulting image will be in the file result.png. You can also have a look
at a .dot file result.dot to see how your .uml was transformated to .dot.

