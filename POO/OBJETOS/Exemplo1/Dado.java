package OBJETOS.Exemplo1;

import java.util.Random;    // Classe que gera numeros aleatorios


// O que o usuario irá utilizar é publico, e o que for dado interno é private

public class Dado{
    private int lados; // parte interna protegida
    private int valor; // parte interna protegida
    private static Random gerador = new Random(); // Gerador de numeros aleatorios

    // public Dado(){  // Criação do dado já pronto
    //     if ()
    //     lados = 6;
    //     valor = 1;
    // }

    public Dado(int la){  // Criação do dado por meio de construção, recebe o valor
        if (la>0){
            lados = la;
        }else lados = la;
        valor = 1;
    }

    public void rolar(){
        valor = gerador.nextInt(lados) + 1;     // Pega o numero gerado até o valor de lados + 1
    }

    public int getValor(){
        return valor;
    }

    public void setValor(int v){
        if (v>0 && v<=lados){
            valor = v;
        }
    }
}