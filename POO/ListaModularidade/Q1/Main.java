package POO.ListaModularidade.Q1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        
        Retangulo retangulo= new Retangulo(b,h);
        Retangulo quadrado = new Quadrado(h);

        retangulo.getAltura();
        retangulo.getBase();
        retangulo.calcArea();
        retangulo.calcDiagonal();

        quadrado.getAltura();
        quadrado.getBase();
        quadrado.calcArea();
        quadrado.calcDiagonal();
        System.out.println(retangulo.toString());
        System.out.println(quadrado.toString());

        sc.close();
    }
}
