package POO.ListaModularidade.Q2;

public class Frete{
    protected  double distancia;
    protected double peso;
    protected double ValorFrete;

    public Frete(double d,double p){
        this.distancia = d;
        this.peso = p;
    }
    public double getValorFrete(){
        return this.ValorFrete;
    }

    public void calculoFrete(){
        this.ValorFrete = 0.01 * (this.peso * this.distancia);
    }
    public String toString(){
        StringBuilder dados = new StringBuilder();
        dados.append("Valor do Frete: R$ " + getValorFrete()).append("\n");
        dados.append("Peso: " + this.peso).append("\n");
        dados.append("Distancia: " + this.distancia).append("\n");
        return dados.toString();
    }
}
