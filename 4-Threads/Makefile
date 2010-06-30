.PHONY: clean

all: SMS

SMS: Mensagem.class FilaPC.class Prod_SMS.class Cons_SMS.class CentralSMS.class Envia_SMS.class Fila.class

Fila.class: Fila.java
	javac Fila.java

Mensagem.class: Mensagem.java
	javac Mensagem.java

FilaPC.class: FilaPC.java
	javac FilaPC.java

Prod_SMS.class: Prod_SMS.java
	javac Prod_SMS.java

Cons_SMS.class: Cons_SMS.java
	javac Cons_SMS.java

CentralSMS.class: CentralSMS.java
	javac CentralSMS.java

Envia_SMS.class:
	javac Envia_SMS.java

run: SMS
	java Envia_SMS

jar: main-class SMS
	jar cfm SMS.jar main-class *.java *.class

tar:
	rm -vf SMS.tar.bz2
	tar -jcvf SMS.tar.bz2 *

clean:
	@rm -vf *.class *.backup *~
