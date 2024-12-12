package Aula4_lacos.Exercicios_beecrowd;
import java.util.Scanner;

public class Lista_chamada {
    public static void main(String[] args) {
        String  nome, aluno = " ";
        String letra;
        int maior = 1;
        Scanner sc = new Scanner(System.in);
        int qtd = sc.nextInt();
        int posicao = sc.nextInt();
        int[] tamanhos = new int[qtd];

        int[] letras = new int[qtd];
            for( int i = 0 ; i < qtd ; i++){
                Scanner entrada = new Scanner(System.in);
                nome = entrada.next();
                letra = nome.substring(0,1);
                tamanhos[i] = (int) letra.charAt(0);
            }
        System.out.println(aluno);
    }
    // falta ordenar lista para pegar o indice do aluno
}

 // String usuario = "a0000";
        // lenght(senha)
        // String letra = usuario.substring(0, 1); //index inicio, index fim ele vai do inicio ao fim
        
        // System.out.println(letra);
