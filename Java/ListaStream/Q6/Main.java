package Java.ListaStream.Q6;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Aleatorio num = new Aleatorio();
        List<Integer> lista = num.Lista();
        Optional<Integer> maior = num.Maior();
        maior.ifPresent(m -> System.out.println(m)); // == if(maior != null)
    }

}
