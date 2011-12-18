set TXL=txl.exe
rem set TXL="C:\Program Files\TXL\bin\txl.exe"
set DOT=dot.exe
rem set DOT="C:\Documents\graphviz\bin\dot.exe"


%TXL% .\template\graph0.dot -o result.dot - -umlfile %1
%DOT% -Tpng result.dot > result.png
