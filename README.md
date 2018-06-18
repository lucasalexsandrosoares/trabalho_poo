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

```java
if(c instanceof Cachorro) {
	System.out.println("é do tipo Cachorro");  
}
if(g instanceof Gato) {
	System.out.println("é do tipo Gato");
}
```
**Encapsulamento**

**Palavra reservada this** 

Referência ao próprio objeto chamado.

Exemplo:

```java
void tampar() {
	this.tampada = true;
}
```
**Getters/Setters**

Getters: É um método para acessar alguma informação do atributo. 

Setters: É um método que modifica a informação do atributo.

Exemplo:

```java
public class Caneta{
	public String modelo;
	
	public String getModelo(){
		return this.modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;

	}
}
```
**Palavra reservada public/private**

Public: Qualquer método pode ser acessado a partir de outra classe.

Private: Um método pode ser acessado somente dentro da própria classe.

```java
public class Caneta{
	public String modelo;
	private float ponta;
}
```
**Assinatura de método**

**Sobrecarga de método**

**Escopo de classe**

**Escopo de objeto**

**Palavra reservada final**

**Relacionamento de dependência**

Uma classe A depende da outra classe B, ocorre quando usa o serviço da outra classe(método da classe).

**Relacionamento de Agregação** 

Uma classe A agrega valores da outra classe B, relação todo parte, quando parte existe sem o todo(atributo classe).

**Relacionamento de Composição** 

Uma classe não existe sem o todo, relação todo parte,quando a parte não existe sem o todo(atributo classe).	
