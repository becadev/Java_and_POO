package Aula1; //Declaração do pacote correspondente ao caminho da pasta
public class HelloWorld {//Nome da class
    public static void main(String[] args){// void tipo de retorno(paramentros)
    //static serve para agrupar as funções, ele não sofrerá alteração quando um objeto for criado, ele está ligado a classe por isso é declarada como static
        System.out.println("Hello, World!");
    }
}

//Nome do arquivo tem que ser o mesmo nome da classe
//Para compilar no terminal:
//javac HelloWorld.java (cria o arquivo class)
// java HelloWorld (Roda o programa)
