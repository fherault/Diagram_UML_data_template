#!/bin/bash

model=$1
modeltmp=$2
outdir=$3
EGX=$4
###example/pegase_v1/codegen.egx


JAVA=java
OPT="  -Dfile.encoding=UTF-8"
LIB=$(echo lib/*.jar | tr ' ' ':')
CLS="mda.uml.generator.UML2JPAGenerator"
JAR=generator.uml.jpa.jar

#hack to fix UML version issue
cat  $model | sed s=uml2/3.0.0/UML=uml2/5.0.0/UML=  > $modeltmp
mkdir -p $outdir/gen
PARAM=" -m $modeltmp  -x  $EGX "
rm -f "$outdir/gen/*java"

echo $JAVA $OPT -cp $LIB:$JAR $CLS $PARAM

$JAVA $OPT -cp $LIB:$JAR $CLS $PARAM

ls -l $outdir
rm -f $modeltmp

