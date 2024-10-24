package Aula1.ExerciciosBeecrowd; //Declaração do pacote correspondente ao caminho da pasta
import java.util.Scanner;

public class Soma{
    public static int adicao(int a, int b){
        int c = a + b;
        return c;
    }
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int resultado = adicao(a,b);
        System.out.println("Soma = " + resultado);
    }
}