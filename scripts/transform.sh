#!/bin/sh

TXL=txl
DOT=dot

$TXL -i Txl ./template/graph0.dot Txl/UML/dot.Txl -o result.dot - -umlfile $1
$DOT -Tpng result.dot > result.png
