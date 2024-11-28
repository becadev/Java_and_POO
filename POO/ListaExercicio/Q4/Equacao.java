package POO.ListaExercicio.Q4;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class Equacao {
    private double delta;
    private double raiz1;
    private double raiz2;

    private int a;
    private int b;
    private int c;

    private List <String> raizes;

    public void equacao(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.raizes = new ArrayList<>();
    }

    public void delta(){
        this.delta = this.b*this.b - (2*a*c);
       // Math.pow(2,b) - 2 * a * c;
    }
    public void raizesReais(){
        this.raiz1 = ((this.b)*(-1) +  Math.sqrt(this.delta)) / 2 * this.a ;
        this.raiz2 = ((this.b)*(-1) -  Math.sqrt(this.delta)) / 2 * this.a;

        if((this.raiz1 % 10 != 0) || (this.raiz2 % 10 != 0)){
            StringBuilder raizesreais = new StringBuilder();
            raizes.add(this.raiz1);
            raizes.add(this.raiz2);
        }
      
    }
}
