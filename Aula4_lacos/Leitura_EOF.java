package Aula4_lacos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Leitura_EOF {
        
            try{
                File arquivo = new File("Aula4_lacos/Exercicios_beecrowd/Teste.txt");
                Scanner sc = new Scanner(arquivo);
                while(sc.hasNext()){
                    String linha = sc.nextLine();
                    System.out.println(linha);
            }
            sc.close();
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado" + e.getMessage());
        }
    }
}
