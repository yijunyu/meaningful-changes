@echo off
rem FreeTXL 10.4 Application Compiler

rem Do we have a C compiler?
if not "%VCINSTALLDIR%" == "" goto cfound

echo txlc: MS Visual C++ compiler commands must be installed and enabled to use txlc
echo txlc: (Available free from Microsoft MSDN as Visual C++ 2005 Express Edition)
goto exit

rem Where's FreeTXL?
: cfound
if "%OS%"=="Windows_NT" set CommandDir=%windir%\System32
if "%OS%"==""  set CommandDir=%windir%\Command
set TXLLIB=%CommandDir%\..\txl

rem Find our source file and command arguments
set name=
for %%i in (%1 %2 %3 %4 %5 %6 %7 %8 %9) do if exist %%i set name=%%i
if "%name%" == "" goto noname
%TXLLIB%\txlbasen.exe %name% > $basenm$.bat
call $basenm$.bat
del $basenm$.bat
set prog=%result%
if exist %name% goto namefound

: noname
echo Usage:  txlc [txloptions] txlfile
goto exit

rem Compile to TXLVM byte code using TXL
: namefound
if exist %prog%.CTxl del %prog%.CTxl
txl -q -c %1 %2 %3 %4 %5 %6 %7 %8 %9

rem Check that we got a result
if exist %prog%.CTxl goto compiled

echo txlc: TXL compile failed!
goto exit

rem Convert TXLVM byte code to initialized C byte array
: compiled
if exist %prog%_TXL.c del %prog%_TXL.c
%TXLLIB%\txlcvt.exe %prog%.CTxl

rem Compile and link with TXLVM
rem if exist %prog%.exe del %prog%.exe
cl /O2 /w /J /nologo /F8388608 %TXLLIB%\txlmain.obj %TXLLIB%\txlvm.obj %prog%_TXL.c /link /entry:mainCRTStartup
ren txlmain.exe %prog%.exe

rem Clean up
if exist %prog%.CTxl  del %prog%.CTxl
if exist %prog%_Txl.c del %prog%_Txl.*

: exit
set CommandDir=
set TXLLIB=
set name=
set result=
set prog=

rem Rev 17.2.07

