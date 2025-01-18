package POO.ListaClassAbstratas.Q2;

class FreteAereo extends Frete {
    private double seguro;
    FreteAereo(double d, double p, double s){
        super(d,p);
        this.seguro = s;
    }
    public double GetFrete(){
        return (0.01*this.seguro) + (0.01 *(this.distancia*this.peso));
    }
    public String ToString(){
        return String.format(
            "Informações Frete Terrestre: %n " +
            "Valor do Frete: R$ %.2f%n" +
            "Peso: %.2f Kg%n" +
            "Distância: %.2f Km %n" + 
            "Seguro: R$ %.2f " + 
            GetFrete(), this.peso, this.distancia, this.seguro
        );
    }
}
// %n -> Boa prática: Usar %n em métodos como printf() ou format() é considerado mais apropriado do que usar \n.
