package Prova;
import java.util.Scanner;

public class Q2 {

    public static String numero_perfeito(int numero){
        int cont = 0;
        for (int i = 1 ; i< numero-1 ; i++){
            if (numero % i ==0){
                cont+= i;
            }
        }
        if (numero == cont){
            return "X eh perfeito" ;
        }
        return "X nao eh perfeito" ;
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd = sc.nextInt();
        for (int i = 0 ; i < qtd ; i++){
            int numero = sc.nextInt();
            System.out.println(numero_perfeito(numero));
        }
    }
}
