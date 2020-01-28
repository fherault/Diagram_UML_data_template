#!/bin/bash
 
model="../XMI/model.uml" 

modeltmp="/tmp/modtmp.uml"

outdir="../generated"

EGX=epsilon/codegen.egx 

bash generate_any.sh $model $modeltmp $outdir $EGX
