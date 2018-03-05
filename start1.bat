@echo off
javac -J-Dfile.encoding=cp866 -encoding utf8 src/by/it_academy/Main.java
java -classpath ./src by.it_academy.Main
Pause
