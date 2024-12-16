package POO.ListaModularidade.Q2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double d = sc.nextDouble();
        double p = sc.nextDouble();
        double s = sc.nextDouble();

        Frete frete = new Frete(d,p);
        Frete freteExpress = new FreteExpresso(d,p,s);
        frete.calculoFrete();
        freteExpress.calculoFrete();
        frete.getValorFrete();
        freteExpress.getValorFrete();

        System.out.println(frete.toString());
        System.out.println(freteExpress.toString());

    }
}
