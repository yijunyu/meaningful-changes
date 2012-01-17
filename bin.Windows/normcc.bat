@echo off
txl -d DEFINE -q -c Txl/norm.Txl
set TXLLIB=C:\Windows\Txl
%TXLLIB%\txlcvt.exe Txl/norm.CTxl
call "C:\Program Files (x86)\Microsoft Visual Studio 10.0\VC\bin\vcvars32.bat" 
cl /O2 /w /J /nologo /F8388608 %TXLLIB%\txlmain.obj %TXLLIB%\txlvm.obj Txl/norm_TXL.c /link /entry:mainCRTStartup
move txlmain.exe bin.Windows\bin\normc.exe
