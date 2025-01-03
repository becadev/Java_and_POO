package POO.ListaModularidade.Q1;
public class Quadrado extends Retangulo{
    public Quadrado(double l){
        super(l,l);
    }
    @Override
    public String toString(){
        StringBuilder dados = new StringBuilder();
        dados.append("lado: ").append(String.format("%.2f",getBase())).append("\n");
        dados.append("diagonal: ").append(String.format("%.2f",calcDiagonal())).append("\n");
        dados.append("area: ").append(String.format("%.2f",calcArea())).append("\n");
        return dados.toString();
    }
}
