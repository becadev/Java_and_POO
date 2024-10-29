package Aula4_lacos.Exercicios_beecrowd;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Arvore_natal2 {
        public static void main(String[] args) throws IOException{
            BufferedReader reader = new BufferedReader(new FileReader("Aula4_lacos/Exercicios_beecrowd/Arvore_natal.txt"));
               String linha;
                while((linha = reader.readLine()) != null){
                    int num = Integer.parseInt(linha.trim());
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
            reader.close();
        } 
}
