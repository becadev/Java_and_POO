package POO.ListaClassAbstratas.Q2;

public abstract class Frete {
    protected double distancia;
    protected double peso;

    public Frete(double d, double p){
        this.distancia = d;
        this.peso = p;
    }
    public abstract double GetFrete();
    public abstract String ToString();
}
