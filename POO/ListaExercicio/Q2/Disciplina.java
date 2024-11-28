package POO.ListaExercicio.Q2;

public class Disciplina {
    private String nomeDisciplina;
    private double n1;
    private double n2;
    private double provafinal;
    private double mediaFinal;
    private double mediaParcial;

    public void  disciplina(String nomeDaDisciplina){
        this.nomeDisciplina = nomeDaDisciplina;
    }
    public void caclularMediaParcial(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
        this.mediaParcial = ((this.n1*2) + (this.n2*3)) / 5;
    }
    public void calcularMediaFinal(double provafinal){
        this.provafinal = provafinal;
        this.mediaFinal = (this.mediaParcial + this.provafinal) / 3;
    }
    public double getMediaFinal(){
        return this.mediaFinal;
    }
    public double getMediaParcial(){
        return this.mediaParcial;
    }
}
