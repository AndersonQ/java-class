.PHONY: clean

all: SMS

SMS: Mensagem.class FilaPC.class

Mensagem.class: Mensagem.java
	javac Mensagem.java

FilaPC.class: FilaPC.java
	javac FilaPC.java

Prod_SMS.calss: Prod_SMS.java
	javac Prod_SMS.java

clean:
	@rm -vf *.class *.backup *~
