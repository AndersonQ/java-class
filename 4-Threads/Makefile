.PHONY: clean

all: SMS

SMS: Mensagem.class FilaPC.class Prod_SMS.class Cons_SMS.class CentralSMS.class

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

clean:
	@rm -vf *.class *.backup *~
