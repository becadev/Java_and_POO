package Java.ListaStream.Q1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumerosPares{
    private List<Integer> numeros;
    NumerosPares(){
        this.numeros =  Arrays.asList(2,8,19,5,4,3,10);
    }
    public List<Integer> NumPares(){
        //List<Integer> pares = 
        this.numeros.stream()
            .filter(e-> e%2 == 0)
            .forEach(e-> System.out.println(e));
        return this.numeros;
    }
}