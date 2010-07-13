

all: Mensagem.class ConexaoCliente.class Servidor.class


Mensagem.class: Mensagem.java Consumidora.class
	javac Mensagem.java

ConexaoCliente.class: ConexaoCliente.java
	javac ConexaoCliente.java

Consumidora.class: Consumidora.java
	javac Consumidora.java

Servidor.class: Servidor.java
	javac Servidor.java

clean:
	rm -fv *.backup* *.class

