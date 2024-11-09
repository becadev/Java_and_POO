package OBJETOS.Exemplo2;
import java.util.Scanner;

public class Calculadora2 {
    public static void main(String[] args) {
        Calculadora minhaCalc = new Calculadora(); // criando um objeto do tipo calculadora
        minhaCalc.somar(4); // PASSANDO COMO OBJETO
        System.out.println(minhaCalc.somar(3));
        System.out.println(minhaCalc.getValor());


        double c = Calculadora.somar(3,4);  // METODO STATIC

    }

    
}
// javatest