find -name "*.java" > sources.txt
javac @sources.txt

find -name "*.class" > classes.txt
jar cvf lenderPA.jar @classes.txt

java -jar lenderPA.jar
