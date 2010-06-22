.PHONY: clean exe

all: Pratica_2.class

Pratica_2.class: Pratica_2.java Animal.class Mamifero.class Ave.class Reptil.class
	javac Pratica_2.java

Animal.class: Animal.java
	javac Animal.java

Mamifero.class: Animal.class Mamifero.java
	javac Mamifero.java

Ave.class: Animal.class Ave.java
	javac Ave.java

Reptil.class: Animal.class Reptil.java
	javac Reptil.java

jar: main-class Pratica_2.class
	jar cfm Pratica_2.jar main-class *.java *.class

tar: jar
	make clean
	rm -vf Pratica_2.tar.bz2
	tar -jcvf Pratica_2.tar.bz2 *

exe: Pratica_2.class  Animal.class Mamifero.class
	@java Pratica_2

clean:
	@rm -vf *.class *.backup *~ 
