package POO.Objetos.Exemplo2;
//import POO.Objetos.Exemplo2.Calculadora;
import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calculo = new Calculadora(); // criando um objeto do tipo calculadora
        // RECEBENDO DADOS
        Scanner sc = new Scanner(System.in);
        double v1 = sc.nextInt();
        double v2 = sc.nextInt();

        calculo.somar(v1,v2); // PASSANDO COMO OBJETO

        System.out.println(calculo.getValor());
        
        calculo.multiplicar(v1,v2); // PASSANDO COMO OBJETO
        System.out.println(calculo.getValor());

        calculo.subtrair(v1,v2); // PASSANDO COMO OBJETO
        System.out.println(calculo.getValor());

        calculo.dividir(v1,v2); // PASSANDO COMO OBJETO
        System.out.printf("%.2f\n",calculo.getValor());
        //calculo.somar(3);
        //double c = Calculadora.somar(3,4);  // METODO STATIC
    }  
}
// javatest