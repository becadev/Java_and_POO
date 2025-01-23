package POO.ListaClassAbstratas.Q1;
import java.lang.Math;

public class Cubo extends Figura{
    private double lado;

    public Cubo(double lado){
        this.lado = lado;
    }
    // @Override
    public double getVolume(){
        return Math.pow(this.lado,3);
    }
}
