run: 
	javac --module-path ../ --add-modules javafx.controls *.java
	java  --module-path ../ --add-modules javafx.controls --add-opens javafx.graphics/com.sun.javafx.application=ALL-UNNAMED App