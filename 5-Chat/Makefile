

all: Mensagem.class ConexaoCliente.class Servidor.class chatServer.class


Mensagem.class: Mensagem.java Consumidora.class
	javac Mensagem.java

ConexaoCliente.class: ConexaoCliente.java
	javac ConexaoCliente.java

Consumidora.class: Consumidora.java
	javac Consumidora.java

Servidor.class: Servidor.java
	javac Servidor.java

chatServer.class: chatServer.java
	javac chatServer.java

clean:
	rm -fv *.backup* *.class

