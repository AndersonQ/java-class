.PHONY: clean

all: SMS

SMS: Mensagem.class FilaPC.class Prod_SMS.calss Cons_SMS.class

Mensagem.class: Mensagem.java
	javac Mensagem.java

FilaPC.class: FilaPC.java
	javac FilaPC.java

Prod_SMS.calss: Prod_SMS.java
	javac Prod_SMS.java

Cons_SMS.class: Cons_SMS.java
	javac Cons_SMS.java

clean:
	@rm -vf *.class *.backup *~
