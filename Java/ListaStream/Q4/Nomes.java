package Java.ListaStream.Q4;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Nomes {
    private List<String> nomes;
    Nomes(){
        this.nomes = Arrays.asList("Rebeca","Noemi","Silva","Ferreira","Donatello","Nity","Seven","Sun");
    }

    public String tdNames(){
        // this.nomes.stream()
        // .collect(Collectors.toList());
        // this.nomes.stream()
        // .collect(Collectors.toSet());
        String nome =  this.nomes.stream()
        .collect(Collectors.joining(", "));
        return nome;
    }
}
