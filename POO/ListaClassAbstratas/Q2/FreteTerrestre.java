package POO.ListaClassAbstratas.Q2;

class FreteTerrestre extends Frete{
    FreteTerrestre(double d, double p){
        super(d, p);
    }
    public double GetFrete(){
        return ((this.distancia*this.peso)*0.01);
    }
    public String ToString(){
        return String.format(
            "Informações Frete Terrestre: %n /n" +
            "Valor do Frete: R$ %.2f% /n" +
            "Peso: %.2f Kg% /n" +
            "Distância: %.2f Km /n" + 
            GetFrete(), this.peso, this.distancia
        );
    }
}
