package Aula4_lacos.Exercicios_beecrowd;
import java.util.Scanner;

public class Maior {
    public static void main(String[] args){
        int num, posicao = 0, maior = 0;
        for (int i = 0; i < 100 ; i++){
            Scanner entrada = new Scanner(System.in);
            num =  entrada.nextInt();
            if (num>=maior){
                maior = num;
                posicao = i+1;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
    }
}
