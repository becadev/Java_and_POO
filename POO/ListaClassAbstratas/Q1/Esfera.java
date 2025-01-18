package POO.ListaClassAbstratas.Q1;
import java.lang.Math;

public class Esfera extends Figura3d {
    private double raio;

    Esfera(double raio){
        this.raio = raio;
    }
    public double getVolume(){
        return ((4.0/3.0)*3.14* Math.pow(this.raio,3));
    }
}
