package Java.ListaStream.Q7;

public class  Pessoas{
    private String nome;
    private int idade;
    Pessoas(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getNome(){
        return this.nome;
    }
}