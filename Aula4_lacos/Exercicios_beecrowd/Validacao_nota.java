package Aula4_lacos.Exercicios_beecrowd;
import java.util.Scanner;

public class Validacao_nota {
        public static void main(String[] args) {
            double nota1, nota2, media;
            Scanner entrada = new Scanner(System.in);
            nota1 = entrada.nextDouble();
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("nota invalida");
                nota1 = entrada.nextDouble();
            }
            nota2 = entrada.nextDouble();
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("nota invalida");
                nota2 = entrada.nextDouble();
            }
            media = (nota1+nota2)/2;
            System.out.printf("media = %.2f\n", media);
    }
}
