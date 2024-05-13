run: 
	javac --module-path ../javafx/lib --add-modules javafx.controls -cp ../junit5fx.jar *.java
	java  --module-path ../javafx/lib --add-modules javafx.controls --add-opens javafx.graphics/com.sun.javafx.application=ALL-UNNAMED App
