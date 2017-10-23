#!/bin/sh

mkdir -p outputs
java -jar ../CLI.jar -i Galileo source.at -o ATCalc outputs/atcalc.at
java -jar ../CLI.jar -i Galileo source.at -o ADTool outputs/adtool.xml
java -jar ../CLI.jar -i Galileo source.at -i UppaalTextQuery UppaalQuery.txt -o UppaalTextResult outputs/prob.txt
java -jar ../CLI.jar -i Galileo nolambdas.at -i UppaalTextQuery UppaalNoLambdaQuery.txt -i UppaalOptions UppaalNoLambdaOptions.txt -o UppaalTextResult outputs/trace.txt
