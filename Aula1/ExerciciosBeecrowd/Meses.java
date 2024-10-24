package Aula1.ExerciciosBeecrowd;
import java.util.Scanner;

public class Meses {
    public static String mes(int x){
        String[] meses = {
            "January", "February","March","April","May","June","July","August","September",
            "October","November","December"
        };
        return meses[x - 1];
    }
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        System.out.println(mes(x));
    }
}
// javac Aula1/ExerciciosBeecrowd/Meses.java
// java Aula1.ExerciciosBeecrowd.Meses

