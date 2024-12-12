package POO.ListaExercicio.Q4;
import java.util.Scanner;

public class EquacaoEntrada {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();

        Equacao equacao = new Equacao();
        equacao.equacao(a, b, c);
        equacao.delta();
        equacao.calcRaizes();

        System.out.println("Equação: " + equacao.toString());
        System.out.println("Raízes: " + equacao.raizesReais());

        // sem isso aqui a parte de scanner sc fica sempre amarela #chatão > codigo verdinho é 10/10
        sc.close();
    }
}
