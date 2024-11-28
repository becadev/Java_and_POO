package POO.ListaExercicio.Q3;
import java.util.Scanner;

public class RetanguloDados {
    public static void main(String[] args) {
        System.out.print("Base: ");
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();

        System.out.print("Altura: ");
        double h = sc.nextDouble();

        Retangulo retang = new Retangulo();
        retang.retangulo(b,h);
        retang.CalcArea();
        retang.CalcDiagonal();

        System.out.println(retang.ToString());
    }
}
