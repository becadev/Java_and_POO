package POO.ListaClassAbstratas.Q1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        Figura3d ball = new Esfera(raio);

        double lado = sc.nextDouble();
        Figura3d cubo = new Cubo(lado);

        System.out.printf("Esfera Volume: %.2f\n Cubo Volume: %.2f", ball.getVolume(), cubo.getVolume());
        sc.close();
    }
}
