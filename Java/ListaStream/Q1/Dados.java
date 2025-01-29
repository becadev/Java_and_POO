package Java.ListaStream.Q1;
import java.util.Scanner;


public class Dados{
    public static void main(String[] args) {
    // List<Integer> numeros =  Arrays.asList(2,8,19,5,4,3,10);
    // numeros.stream()
    //         .filter(e-> e%2 == 0)
    //         .forEach(e-> System.out.println(e));
    NumerosPares filtragem = new NumerosPares();
    filtragem.NumPares();
    }
}
