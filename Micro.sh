#!/bin/bash

# Path to ANTLR jar
ANTLR_JAR="./lib/antlr-4.9.3-complete.jar"

#  in maindeveloper
javac -cp ".:$ANTLR_JAR" src/testers/Driver.java src/maindeveloper/GCodeVisitor.java src/maindeveloper/MarlinVisitor.java src/maindeveloper/HardwareLimiter.java src/maindeveloper/Compute.java src/jupitore/gen/*.java


java -cp "src:.:$ANTLR_JAR" testers.Driver "$1"
