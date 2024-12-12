package POO.ListaExercicio.Q3;
import java.util.ArrayList;
import java.util.List;

public class Retangulo {
    private List<String> atributosObjeto;
    private double b;
    private double h;
    private double area;
    private double diagonal;

    public void retangulo(double b, double h){
        this.h = h;
        this.b = b;
        this.atributosObjeto = new ArrayList<>();
    }
    public void setBase(double b){
        this.b = b;
    }
    public void setAltura(double h){
        this.h = h;
    }
    public double CalcArea(){
        this.area = this.b * this.h;
        return this.area;
    }
    public double CalcDiagonal(){
        this.diagonal = (this.h * this.h) + (this.b * this.b);
        return (this.diagonal * this.diagonal);
    }
    public String ToString(){
        StringBuilder atributos = new StringBuilder();

       
        atributosObjeto.add("Base: " + this.b);
        atributosObjeto.add("Altura: " + this.h);
        atributosObjeto.add("Area: " + this.area);
        atributosObjeto.add("Diagonal: " + this.diagonal);
        

        for (String linha : atributosObjeto){
            atributos.append(linha).append("\n");
        }
        return atributos.toString(); 
    }
    public double getAltura(){
        return this.h;
    }
    public double getBase(){
        return this.b;
    }

}
