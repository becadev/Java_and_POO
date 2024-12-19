package Q1;
import java.util.Scanner;
// import java.io.ArrayList<>;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        
        Retangulo retangulo= new Retangulo(b,h);
        Retangulo quadrado = new Quadrado(h);
        Figura figura = new Retangulo(b,h);

        figura.getArea();
        figura = new Quadrado(b);
        Lista<Figura> figuras = new ArrayList<>();
        figuras.add(figura);
        figuras.add(quadrado);

        // figura = new Figura() -> não pode instanciar uma intreface

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
