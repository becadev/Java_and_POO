// USANDO MATH
package POO.Objetos.Exemplo2;

public class Calculadora {  // criação de class para instanciar os objetos, no outro programa inicial será feito um new criando um objeto de acordo com as instancias dessa class
    private double valor;
    
    public Calculadora(){   // inicializará o atributo
        this.valor = 0;
    }

    public double getValor(){   // Guarda o valor que foi obtido
        return this.valor;
    }

    public void somar(double v1, double v2){
        this.valor = v1 + v2;
    }
    public void subtrair(double v1,double v2){
        this.valor = v1 - v2;
    }
    public double multiplicar(double v1,double v2){    //pode ser void ou double se for double deve colocar o return
        this.valor = v1 * v2;
        return this.valor;
    }
    public void dividir(double v1,double v2){
        if (v2 != 0 || v1!= 0){
            this.valor = v1 / v2;
        }
    }
}
