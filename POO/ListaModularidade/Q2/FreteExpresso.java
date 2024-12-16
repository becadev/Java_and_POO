package POO.ListaModularidade.Q2;
public class FreteExpresso extends Frete{
    private double seguro;
    public FreteExpresso(double d, double p, double s){
        super(d,p);
        this.seguro = s;
    }
    public void calculoFrete(){
        super.calculoFrete();
        this.ValorFrete = (getValorFrete() * 2.0) + ((0.01) * this.seguro);
    }
    public String toString(){

        StringBuilder dados = new StringBuilder();
        dados.append("Valor do Frete: R$ " + this.ValorFrete).append("\n");
        dados.append("Peso: " + this.peso).append("\n");
        dados.append("Distancia: " + this.distancia).append("\n");
        dados.append("Valor do Seguro: R$ " + this.seguro).append("\n");
        return dados.toString();
    }
}
