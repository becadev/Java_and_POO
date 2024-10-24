package Aula1.ExerciciosBeecrowd; //Declaração do pacote correspondente ao caminho da pasta
import java.util.Scanner;

public class Baskhara{
    public static void main(String[] args){
        Scanner numeros = new Scanner(System.in);
        double a = numeros.nextDouble();
        double b = numeros.nextDouble();
        double c = numeros.nextDouble();

        double delta = (b*b)-4*a*c;
        if (delta <= 0 || a == 0){ //verifica o valor de delta e também o de a, pois se a == 0  significa que não é uma equação de terceiro grau
             System.out.println("Impossivel calcular");
        }else{
            double r1 = (-b + Math.pow(delta , 0.5))/(2.0*a); //Math.pow = metodo para fazer a potência de um número. Raiz quadrada é igual um número elevado a meio.
            double r2 = (-b - Math.pow(delta , 0.5))/(2.0*a);
            System.out.printf("R1 = %.5f\n" + "R2 = %.5f\n ", r1,r2);
        }
    }
}