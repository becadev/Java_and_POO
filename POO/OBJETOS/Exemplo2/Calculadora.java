// USANDO MATH

package OBJETOS.Exemplo2;
import java.Math;


public class Calculadora {  // criação de class para instanciar os objetos, no outro programa inicial será feito um new criando um objeto de acordo com as instancias dessa class
    private double valor;
    
    public Calculadora(){   // inicializará o atributo
        this.valor = 0;
    }

    public double getValor(){   // Guarda o valor que foi obtido
        return this.valor;
    }

    public void somar(double valor){
        this.valor += valor;
    }

    public void subtrair(double valor){
        this.valor -= valor;
    }

    public double multiplicar(double valor){    //pode ser void ou double se for double deve colocar o return
        this.valor *= valor;
        return this.valor;
    }

    public void dividir(double valor){
        if (valor != 0){
            this.valor /= valor;
        }
    }
}
