# trabalho_poo
**Construtor**

Criação de um objeto dentro da classe.

Exemplo:

```java
public class Caneta {
	private String cor;
	private boolean tampada;
	
	public Caneta() {
		this.tampar();
		this.cor = "Azul";
	}
}
```
**Instaciação**
 
 Ação de criar um objeto.
 
 ```java
 new
 ```
 **Palavra reserva new**
 
 Usada para instaciar um objeto.
 
 Exemplo:
 
 ```java
 Caneta c1 = new Caneta();
```
**Palavra reserva instanceof**

Determina se um objeto é a instância de uma classe, super classe ou interface.

Exemplo:

**Encapsulamento**

**Palavra reservada this** 

Referência ao próprio objeto chamado.

Exemplo:

```java
void tampar() {
	this.tampada = true;
}
```

