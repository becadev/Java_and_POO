package Java.ListaStream.Q3;
import java.util.Arrays;
import java.util.List;


public class Soma {
    private List<Integer> numeros;
    Soma(){
        this.numeros = Arrays.asList(4, 5,4, 3, 2, 1, 7, 6, 8, 9, 10, 23,40, 1050);
    }
    public int somaNum(){
        int soma = this.numeros.stream()
        .reduce(0,(n1,n2) -> n1 + n2);
        return soma;
    }
}
