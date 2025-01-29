package Java.ListaStream.Q6;
import java.util.List;
import java.util.stream.IntStream;
import java.util.Optional;
import java.util.stream.Collectors;

public class Aleatorio {
    private IntStream numeros;
    Aleatorio(){
        this.numeros = IntStream.range(1, 1000);
    }
    public List<Integer>  Lista(){ // retorna lista com os valores
       return this.numeros
       .boxed()                        // Converte IntStream para Stream<Integer>
       .collect(Collectors.toList());  
    }
    public Optional<Integer> Maior(){
        return IntStream.range(1,1000)
        .boxed() // calcula qual é o maior de forma paralela
        .reduce(Integer::max); 
    }
    // public Optional<Integer> Maior(){
    //     return this.numeros.parallel().boxed() // calcula qual é o maior de forma paralela
    //     .reduce(Integer::max); 
    // }
}
