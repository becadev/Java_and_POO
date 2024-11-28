package POO.ListaExercicio.Q1;

public class Circulo {
    private double raio;
    private double pi;
    private double area;

    public void circulo(double raio){
        this.raio = raio;
        this.pi = 3.14;
    }
    public void calcularArea(){
        this.area = this.pi * (this.raio * this.raio);
    }
    public double getArea(){
        return this.area;
    }
}
