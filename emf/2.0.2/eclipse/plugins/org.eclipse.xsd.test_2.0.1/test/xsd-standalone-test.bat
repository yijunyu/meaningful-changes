@echo off
setlocal
set ECLIPSE=..\..\..
set CLASSPATH=%ECLIPSE%/plugins/org.eclipse.emf.common_2.0.1/runtime/common.jar;%ECLIPSE%/plugins/org.eclipse.emf.ecore_2.0.2/runtime/ecore.jar;%ECLIPSE%/plugins/org.eclipse.xsd_2.0.2/runtime/xsd.resources.jar;%ECLIPSE%/plugins/org.eclipse.xsd_2.0.2/runtime/xsd.jar;%ECLIPSE%/plugins/org.eclipse.xsd.test_2.0.1/runtime/xsd.test.jar
%ECLIPSE%\jre\bin\java -DVABASE=%ECLIPSE% -verify org.eclipse.xsd.test.XSDMainTest  %*
