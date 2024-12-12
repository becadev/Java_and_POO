package POO.ListaExercicio.Q1;
import java.util.Scanner;

public class Circulodados {
    public static void main(String[] args) {
        System.out.print("Digite o valor do raio: ");
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        Circulo calc = new Circulo();
        calc.circulo(raio);
        calc.calcularArea();
        System.out.printf("Raio = %.2f \n", calc.getArea());
    }   
}
