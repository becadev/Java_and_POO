import Aula2_Class_Cond_.Switch;
import java.util.Scanner;

public class Switch{
    public static void main(String[] args){
        System.out.print("Digite um número inteiro entre 1 e 12");
            int x = 2;
            // int dias  = switch(x){
            //     case 1, 3, 5, 8, 10, 12 -> 31;
            //     case 4, 6, 7, 9, 11     -> 30;
            //     default                 -> 28;
            // };
            int dias = switch(x) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> 28; // Considerando não ser ano bissexto
                default -> {
                    System.out.println("Número inválido!");
                }
            };
            // int dias;
            // switch(x){
            //     case 1 | 3 | 5 | 7 | 8 | 10 | 12  : dias = 31; break;
            //     case 4 | 6 | 9 | 11               : dias = 30; break;
            //     default                           : dias = 28;
            System.out.println("Dias = " + dias);
        }
}
