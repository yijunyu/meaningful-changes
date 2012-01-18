@echo off
set PATH=bin.Windows\bin
set p=%~dp0
set n=%~n1
set e=%~x1
goto txl%e%
:txl.java 
set l=%p%result\norm\Java\simple.Txl
goto :end
:txl.v
set l=%p%result\norm\Verilog\verilog2.Txl
goto :end
:txl.problem
set l=%p%result\norm\ProblemFrames\problem.Txl
goto :end
:txl.xml
set l=%p%result\norm\XML\xml-mct.Txl
goto :end
:txl.q7
set l=%p%result\norm\Q7\q7.Txl
goto :end
:txl.argument
set l=%p%result\norm\Argument\argument.Txl
goto :end
:txl.c
set l=%p%result\norm\C\cid.Txl
goto :end
:txl.sp
set l=%p%result\norm\NLP\nlp.Txl
goto :end
:txl.uncal
set l=%p%Txl\Uncal\uncal2java.Txl
goto :end
:txl.cal
set l=%p%result\norm\Cal\Cal.Txl
goto :end
:txl.uml
set l=%p%result\norm\UML\uml.Txl
goto :end
:txl.argument
set l=%p%result\norm\Argument\argument.Txl
REM set l=%p%Txl\Argument\argument.Txl
goto :end
:txl.cs
set l=%p%result\norm\CSharp\csharp.Txl
goto :end
:txl.cs
set l=Txl\CSharp\cs.txl
goto :end
set l=Txl\%e%.Txl
:end
:txl
if "%1" == "" @echo usage: %0 program [ program_to_compare ]
if "%2" == "" txl -s 1000 -q -i %p%Txl %1 %l% 
if not "%2" == "" txl -s 1000 -q -i %p%Txl %1 %l% - -diff %2 
:fin
