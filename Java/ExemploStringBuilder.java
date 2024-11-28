package Java;

public class ExemploStringBuilder {
    public static void main(String[] args) {
        // Criando um objeto StringBuilder
        StringBuilder sb = new StringBuilder();

        // Usando append para adicionar partes à string
        sb.append("Olá, ");
        sb.append("Mundo!");
        
        // Convertendo o conteúdo do StringBuilder para uma String
        String resultado = sb.toString();
        
        // Exibindo a string concatenada
        System.out.println(resultado);  // Saída: "Olá, Mundo!"
        
        // Adicionando mais texto
        sb.append(" Como você está?");
        System.out.println(sb.toString());  // Saída: "Olá, Mundo! Como você está?"
    }
}


// Eficiência: Quando você realiza várias operações de concatenação, como adicionar strings em um loop,
// o StringBuilder é muito 
// mais eficiente, pois ele não cria novos objetos a cada operação.

// Evita criação excessiva de objetos: Em vez de criar uma nova instância de String a cada concatenação,
// o StringBuilder altera o próprio objeto internamente, o que reduz o custo de memória e melhora o desempenho.