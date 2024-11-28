package POO.ListaExercicio.Q4;
import java.lang.Math;
import java.util.Arrays;


public class Equacao {
    private double delta;
    private double raiz1;
    private double raiz2;
    private int a;
    private int b;
    private int c;
    private int qtd;
    private double[] raizes;


    public void equacao(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    
    }
    public void delta(){
        this.delta = this.b*this.b - (4*this.a*this.c);
    }
    public void calcRaizes(){
        if (this.delta >= 0){
            if (delta==0){
                this.raiz1 = (-this.b +  Math.sqrt(this.delta)) /(2 * this.a);                    
                this.qtd+= 1;
            }else{
                this.raiz1 = (-this.b +  Math.sqrt(this.delta)) /(2 * this.a);
                this.raiz2 = (-this.b -  Math.sqrt(this.delta)) /(2 * this.a);
                this.qtd += 2;
            }
       }
    }

    public String raizesReais(){
        this.raizes = new double[qtd];

        if (this.qtd == 2){
                this.raizes[0] =  this.raiz1;
                this.raizes[1] =  this.raiz2;
                return "Raizes Reais: " + Arrays.toString(this.raizes);
        }
        if(this.qtd == 1){ 
                this.raizes[0] =  this.raiz1;
                return "Raiz única: " + Arrays.toString(this.raizes);
        }
        return "Não possui raizes";

        // return this.raizes; --> irá devolver o tipo do array e seu endereço de memória. Para exibir corretamente as raízes, você precisa iterar pelo array ou usar utilitários que formatem os elementos.
    }

    public String toString(){
        StringBuilder equacao = new StringBuilder();

        // Adicionando atributos a equcao que será retornada
        equacao.append(a < 0 ? "- ": " ").append("x²");
        equacao.append((b > 0 ? "+ " : "- ")).append(Math.abs(b)).append("x");
        equacao.append((c > 0 ? "+ " : "- ")).append(Math.abs(c)).append(" ");
        equacao.append("= 0");
        return equacao.toString().trim(); // trim = remove os espaços em branco
    }
}

// javac POO/ListaExercicio/Q4/Equacao.java POO/ListaExercicio/Q4/EquacaoEntrada.java
// java POO.ListaExercicio.Q4.EquacaoEntrada