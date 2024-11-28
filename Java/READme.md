# O que o toString() faz?
Por padrão, o método toString() retorna uma representação de string do objeto. Para a classe Object (da qual todas as classes herdam), ele retorna uma string que inclui o nome da classe e o endereço de memória do objeto. Porém, a maioria das classes em Java sobrescreve esse método para fornecer uma descrição mais útil do objeto.

# Quando você usa toString():
Quando você chama o toString() em um objeto, ele geralmente converte o estado do objeto em uma string legível, o que pode ser útil para depuração ou para exibir informações sobre o objeto.

Exemplo 1:

```java
Copiar código
class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Sobrescreve o toString() para fornecer uma descrição mais útil do objeto
    @Override
    public String toString() {
        return "Pessoa: " + nome + ", Idade: " + idade;
    }
}

public class Exemplo {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);
        System.out.println(pessoa.toString());  // Saída: Pessoa: João, Idade: 25
    }
}


Exemplo 2: 

```java
public class ExemploStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Olá, ");
        sb.append("Mundo!");
        
        // Chamando toString() para obter a string final
        String resultado = sb.toString();
        
        // Exibindo a string concatenada
        System.out.println(resultado);  // Saída: "Olá, Mundo!"
    }
}