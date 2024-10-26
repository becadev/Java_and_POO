package Aula4_lacos.Exercicios_beecrowd;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Maior_posicao {
        public static void main(String[] args) {
            int count = 0, maior = 0, aux = 0;
            try{
                File arquivo = new File("Aula4_lacos/Exercicios_beecrowd/Numeros.txt");
                Scanner sc = new Scanner(arquivo);
                while(sc.hasNext()){
                    int linha = sc.nextInt();
                    count += 1;
                    if (linha > maior){
                        maior = linha;
                        aux = count;
                    }
            }
            sc.close();
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado" + e.getMessage());
        }
        System.out.println(maior);
        System.out.println(aux);
    }
}
