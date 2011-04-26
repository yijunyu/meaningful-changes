#!/bin/bash
cat $1 $2 | ../bin.`uname -s -m | sed 's/ /_'`/clonec
