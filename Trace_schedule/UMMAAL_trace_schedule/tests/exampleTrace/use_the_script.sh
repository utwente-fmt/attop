#!/bin/bash
chmod u+x parse_results.py
cat error-3p.txt | ./parse_results.py > error-3p_parsed.csv 
