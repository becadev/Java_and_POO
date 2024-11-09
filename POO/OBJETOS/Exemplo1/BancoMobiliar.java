package OBJETOS.Exemplo1;

import POO.Dado.Dado;

public class BancoMobiliar {
    
    public static void main(String[] args) {
        Dado dado = new Dado(); // criação do objeto e chamando a classe
        Dado dado2  = new Dado(28);

        System.out.println(dado.getValor())    ;
        dado.rolar();   // comunicação com um objeto com outro
        System.out.println(dado.getValor());
    }
}
// Parametrizar