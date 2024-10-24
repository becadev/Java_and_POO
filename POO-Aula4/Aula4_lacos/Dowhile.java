package Aula4_lacos;
import java.util.Scanner; 

public class Dowhile {
        public static void main(String[] args) {
            int x = -1;
            // while (x < 0 || x > 100){
            //     Scanner sc  = new Scanner(System.in);
            //     System.out.println("Digite uma nota (0~100)");
            //     x = sc.nextInt();
            for ( int i = 0 ; x < 1 ; i--){
                Scanner sc  = new Scanner(System.in);
                System.out.println("Digite uma nota (0~100)");
                x = sc.nextInt();
            }
        } 
    }
