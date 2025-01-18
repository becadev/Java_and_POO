package POO.ListaClassAbstratas.Q1;
import java.lang.Math;

public class Cubo extends Figura3d{
    private double lado;

    Cubo(double lado){
        this.lado = lado;
    }
    public double getVolume(){
        return Math.pow(this.lado,3);
    }
}
