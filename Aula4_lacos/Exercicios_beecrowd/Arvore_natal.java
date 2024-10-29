package Aula4_lacos.Exercicios_beecrowd;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Arvore_natal {
        public static void main(String[] args) {
            try{
                File arquivo = new File("Aula4_lacos/Exercicios_beecrowd/Arvore_natal.txt");
                Scanner sc = new Scanner(arquivo);

                while(sc.hasNext()){
                    int num = sc.nextInt();
                    int espaco = num-1;
                        for (int i = 1; i <= num ; i++){
                            int cont = 0;
                            while (espaco >= cont){
                                System.out.print(" ");
                                cont += 1;
                            }
                            espaco -= 1;
                            for (int asterisco = 1 ; asterisco < 2*i ; asterisco++){
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        int base = 2;
                        int spac = num-1; 
                        for (int i = 1; i <= base ; i++){
                            int cont = 0;
                                while (spac >= cont){
                                    System.out.print(" ");
                                    cont += 1;
                                }
                                spac -= 1;
                                for (int asterisco = 1 ; asterisco < 2*i ; asterisco++){
                                    System.out.print("*");
                                }
                                System.out.println();
                        }
                        System.out.println();
                    }
            sc.close();
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado" + e.getMessage());
        }
    }
}
