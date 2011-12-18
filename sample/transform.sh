#!/bin/sh

TXL=txl
#TXL=/usr/local/bin/txl
DOT=dot
#DOT=/usr/bin/dot

$TXL ./template/graph0.dot -o result.dot - -umlfile $1
$DOT -Tpng result.dot > result.png