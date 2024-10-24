package Aula4_lacos.Exercicios_beecrowd;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        for ( int i = 1 ; i <= 10 ; i++){
            int mult = i*x;
            System.out.printf("%dx%d = %d \n",i,x,mult);
        }
    }
}