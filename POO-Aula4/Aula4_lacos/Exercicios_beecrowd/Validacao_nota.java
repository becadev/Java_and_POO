package Aula4_lacos.Exercicios_beecrowd;
import java.util.Scanner;

public class Validacao_nota {
        public static void main(String[] args) {
            double nota1 = 11.00, nota2 = 11.00;

            while ((nota1 < 0 || nota1 > 10) || (nota2 < 0 || nota2 > 10)){
                Scanner entrada = new Scanner(System.in);
                nota1 = entrada.nextDouble();
                nota2 = entrada.nextDouble();

                if ((nota1 < 0 || nota1 > 10) || (nota2 < 0 || nota2 > 10)){
                    System.out.print("nota invalida");
            }
        }
    }
}
