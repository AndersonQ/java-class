.PHONY: clean

all: Xadrez

Xadrez: Pecas.class Cavalo.class Rei.class


Pecas.class: Pecas.java
	javac Pecas.java

Cavalo.class: Cavalo.java
	javac Cavalo.java

Rei.class: Rei.java
	javac Rei.java


clean:
	@rm -vf *.class *.backup *~
