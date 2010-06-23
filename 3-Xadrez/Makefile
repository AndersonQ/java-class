.PHONY: clean

all: Xadrez

Xadrez: Pecas.class Cavalo.class


Pecas.class: Pecas.java
	javac Pecas.java

Cavalo.class: Cavalo.java
	javac Cavalo.java


clean:
	@rm -vf *.class *.backup *~
