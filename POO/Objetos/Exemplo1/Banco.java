package POO.Objetos.Exemplo1;
public class Banco {
    
    public static void main(String[] args) {
        Dado dado = new Dado(); // criação do objeto e chamando a classe
        Dado dado2  = new Dado();

        System.out.println(dado.getValor())    ;
        dado.rolar();   // comunicação com um objeto com outro
        System.out.println(dado.getValor());
    }
}
// Parametrizar