package Java.ListaStream.Q7;
import java.util.List;
import java.util.Arrays;

public class Mapeamento {
    private List<Pessoas> lista_pessoas;
    Mapeamento(){
        this.lista_pessoas = Arrays.asList();
    }
    public List<Pessoas> maioresIdades(){ // filtra os >= 18
        this.lista_pessoas.stream()
                     .filter(p -> p.getIdade() >= 18)
                     .forEach(p -> System.out.println(p));
        return this.lista_pessoas;
    }
    public List<Pessoas> lista_nomes(){ // mapea para uma lista de nomes
        this.lista_pessoas.stream()
                          .filter(p -> p.getIdade() >= 18)
                          .map(p -> p.getNome())
                          .forEach(e -> System.out.println(e));
        return this.lista_pessoas;
    }
    public List<Pessoas> ordemAlfab(){ // mapea para uma lista de nomes
        this.lista_pessoas.stream()
                          .map(p -> p.getNome())
                          .sorted()
                          .forEach(e -> System.out.println(e));
        return this.lista_pessoas;
    }
    public long mediaIdade(){ // mapea para uma lista de nomes
        long qtd = this.lista_pessoas.stream()
                                    .map(p -> p.getIdade())
                                    .count(); // count devolve um valor long
        long soma = this.lista_pessoas.stream()
            .mapToInt(Pessoas :: getIdade)
            .sum();
            return soma/qtd;
    }
    // public List<Pessoas> agrupar(){
    // }
}
/*
Dada uma lista de pessoas (nome e idade), use Streams para:
Filtrar pessoas com mais de 18 anos.
Mapear para uma lista de nomes.
Ordenar os nomes alfabeticamente.
Crie um Stream de números inteiros e calcule a média dos números maiores que 50.
Use Collectors.groupingBy para agrupar uma lista de palavras pelo seu tamanho. */