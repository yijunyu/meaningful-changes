@echo off
set SCRIPT="C:\CYGWIN\home\%USERNAME%\run.sh"
echo cd `cygpath "%CD%"`; python ./decreasoner.py `cygpath "%1"` > %SCRIPT%
C:\Cygwin\bin\bash -login -e /home/%username%/run.sh