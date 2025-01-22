package POO.ListaClassAbstratas.Q3;

public abstract class Item {
    private String d;
    private int qtd;
    public Item(String descricao, int q) {
        this.qtd = q;
        this.d = descricao;
    }
    public abstract double getPreco();
}
