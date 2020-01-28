#!/bin/bash

JAVA=$(which java) 
 
OPT=" -Dfile.encoding=UTF-8 -Djava.util.logging.config.file=commons-logging.properties "
 
LIB=$(echo libtpl/*.jar | tr ' ' ':')
CPL=templategen.jar:$LIB
ENTRYPOINT=tabtemplatecreator.CreateTemplateFromJPA

 
PARAM=" -o  template_gen -t oo -g model.gen.pegase_v1.jar"

echo $JAVA $OPT -classpath $CPL $ENTRYPOINT $PARAM
$JAVA $OPT -classpath $CPL $ENTRYPOINT $PARAM

