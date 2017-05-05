#!/bin/sh

java -jar java-cup-11b.jar parser.cup
javac JLex/Main.java  && java JLex.Main Lexer
cp data/Go"$1".in data/safe.in

echo '\n\n'
echo '========================================= Now Run AP.java on safe.in ========================================='
echo '\n\n'
javac -cp .:* sym.java Lexer.java parser.java AP.java  && java -cp .:* AP
rm -rf **/*.class
