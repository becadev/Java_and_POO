package POO.ListaClassAbstratas.Q3;

public class Servico extends Item{
    private int tempo;

    public Servico(String d, int t){
        super(descricao, q);
        this.tempo = t;
    }
    public double getPreco(){
        return 1;
    }
    public String toString(){
        return String.format(
            "Descrição: %n /n" +
            "Tempo:  %d /n" +
            "Preco:  %..2f /n" +
            this.d , this.tempo , getPreco()
        );
    }
}
// Streams java