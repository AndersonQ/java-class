.PHONY: clean tar

all: Xadrez.class

Xadrez.class: Pecas.class Cavalo.class Rei.class Jogadas.class Xadrez.java Tabuleiro.class
	javac Xadrez.java

Pecas.class: Pecas.java
	javac Pecas.java

Cavalo.class: Cavalo.java
	javac Cavalo.java

Rei.class: Rei.java
	javac Rei.java

Jogadas.class: Jogadas.java
	javac Jogadas.java

Tabuleiro.class: Tabuleiro.java
	javac Tabuleiro.java

play: Xadrez.class
	java Xadrez

jar: main-class Xadrez.class
	jar cfm Xadrez.jar main-class *.java *.class

tar:
	rm -vf Pratica_2.tar.bz2
	tar -jcvf Pratica_2.tar.bz2 *

clean:
	@rm -vf *.class *.backup *~
