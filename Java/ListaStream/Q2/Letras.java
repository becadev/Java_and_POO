package Java.ListaStream.Q2;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Letras {
    private List<String> nomes;
    Letras(){
        this.nomes = Arrays.asList("gabriela", "batata", "arroz", "paralelepipedo", "jogador", "bola");
    }
    public List<String> filtragem(){
        this.nomes.stream()
            .filter(nome -> nome.length() > 5 )
            .map(nome -> nome.toUpperCase().trim())
            .forEach(nome -> System.out.println(nome));
        return this.nomes;
    }
}
