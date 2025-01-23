package Java.ListaStream.Q1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    // List<Integer> numeros =  Arrays.asList(2,8,19,5,4,3,10);
    // numeros.stream()
    //         .filter(e-> e%2 == 0)
    //         .forEach(e-> System.out.println(e));
    NumerosPares filtragem = new NumerosPares();
    System.out.println(filtragem.NumPares());
    }
}
