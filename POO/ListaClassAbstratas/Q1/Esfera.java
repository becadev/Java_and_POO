package POO.ListaClassAbstratas.Q1;
import java.lang.Math;

public class Esfera extends Figura {
    private double raio;

    public Esfera(double raio){
        this.raio = raio;
    }
    @Override
    public double getVolume(){
        return ((4.0/3.0)*3.14* Math.pow(this.raio,3));
    }
}

/*Esfera.java:4: error: cannot find symbol
public class Esfera extends Figura3d {
                            ^
  symbol: class Figura3d
1 error*/