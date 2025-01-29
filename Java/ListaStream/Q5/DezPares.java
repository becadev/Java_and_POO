package Java.ListaStream.Q5;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class DezPares {
    private IntStream numeros ;
    DezPares(){
        this.numeros = IntStream.range(1, 20);
    }
    public List<Integer> pares() {
        return this.numeros // * 
            .filter(e -> e % 2 == 0)        
            .limit(10)              // Limita a 10 elementos
            .boxed()                        // Converte IntStream para Stream<Integer>
            .collect(Collectors.toList());  
            
    }
    public void getPares() {
        this.pares().forEach(e -> System.out.println(e));
    }
}
