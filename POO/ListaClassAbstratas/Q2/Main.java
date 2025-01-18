package POO.ListaClassAbstratas.Q2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double d = sc.nextDouble();
        double s = sc.nextDouble();

        FreteTerrestre terra = new FreteTerrestre(d,p);
        FreteAereo ceu = new FreteAereo(d,p,s);

        terra.GetFrete();
        ceu.GetFrete();
        System.out.println(ceu.ToString());
        System.out.println(terra.ToString());
        sc.close();
    }
}
