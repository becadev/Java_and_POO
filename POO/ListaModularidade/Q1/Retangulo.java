package POO.ListaModularidade.Q1;

public class Retangulo {
    private double b;
    private double h;

    public Retangulo(double b, double h){
        this.b = b;
        this.h = h;
    }
    public double getBase(){
        return this.b;
    }
    public double getAltura(){
        return this.h;
    }
    public double calcArea(){
        return (this.b*this.h);
    }
    public double calcDiagonal(){
        return Math.sqrt((b*b)+(h*h));
    }
    public String toString(){
        StringBuilder dados = new StringBuilder();
        dados.append("base: ").append(String.format("%.2f",getBase())).append("\n");
        dados.append("altura: ").append(String.format("%.2f",(getAltura()))).append("\n");
        dados.append("diagonal: ").append(String.format("%.2f",calcDiagonal())).append("\n");
        dados.append("area: ").append(String.format("%.2f",calcArea())).append("\n");

        return dados.toString();
    }
}
