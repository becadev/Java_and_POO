package Prova;
import java.util.Scanner;
import java.util.ArrayList;

public class Q3 {
    

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int qtd_testes = sc.nextInt();
            String[] alfabeto  = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J","K","L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y","Z"};
            String palavra = "";
            String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            ArrayList<String> decodificadas = new ArrayList<>();

            for (int i = 0 ; i < qtd_testes ; i++){
                Scanner testes = new Scanner(System.in);

                String nome = testes.nextLine();            // Palavra que será modificada
                int qtd_posicoes = testes.nextInt();        // qtd de posicoes
            
                for (int j = 0 ; j < (nome.length()) ; j++){
              
                    String letra = Character.toString(nome.charAt(j));
                    palavra = palavra + alfabeto[letras.indexOf(letra) - qtd_posicoes];
                }

                decodificadas.add(palavra);
             }
             // Exibir palavras decodificadas
             for (String i :  decodificadas) {
                System.out.println(i);
              }  
        }
    }
