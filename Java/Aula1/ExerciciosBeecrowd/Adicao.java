package Aula1.ExerciciosBeecrowd; //Declaração do pacote correspondente ao caminho da pasta

import java.util.Scanner; //pacote padrao de scanner de java
public class Adicao//Nome da class
{
    public static int soma(int a, int b){ // tem que ter o static pois o main só poderá chamar funções que também são statics
        int c = a + b;
        return c;
    }
    public static int soma(double a, double b){ // sobrecarga, dois metodos com o mesmo nome porem com dois tipos de parametros diferentes
        return 0;
    }
    public static void main(String[] args) // void tipo de retorno(paramentros)
    {//static serve para agrupar as funções, ele não sofrerá alteração quando um objeto for criado, ele está ligado a classe por isso é declarada como static
        Scanner sc  = new Scanner(System.in); // ele vai ler as variaveis que estão na mesma linha ou um em baixo do outro
        System.out.print("Digite  o valor do primeiro número: ");
        int x = sc.nextInt();
        System.out.print("Digite  o valor do segundo número: ");
        int y = sc.nextInt();
        int z = soma(x,y); // chama a função

        System.out.println(soma(x,y));
        System.out.println("A soma de "+ x + " e " + y + " é " + z);
        //System.out.printf("A soma de %d e %d é %d.",x,y,x); 
        //System.out.printf("%d\n + %d\n ===========\n %8d",x,y,x); 
        //%8d --> 8 casas antes da virgula
        //System.out.println(soma(3,4)); são equivalentes
    }
}

//Nome do arquivo tem que ser o mesmo nome da classe

//Para compilar no terminal:
//javac Aula1/Adicao.java (cria o arquivo class)
// java Aula1.Adicao (Roda o programa)
