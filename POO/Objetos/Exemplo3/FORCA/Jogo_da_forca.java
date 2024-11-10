package POO.Objetos.Exemplo3.FORCA;
import java.util.Scanner;

public class Jogo_da_forca {
    public static void main(String[] args){
        Forca2 jogo = new Forca2();
        jogo.iniciar();

        System.out.println("Bem-Vindo ao jogo da forca! ");
        System.out.printf("A dica da palavra é:  %s\n", jogo.getDica());
        System.out.print("Digite uma letra: ");
        Scanner sc = new Scanner(System.in);

        while(!jogo.Vitoria() && jogo.getTentativas_Restantes() > 0){// o loop irá acontecer enquanto o jogador não vencer e suas chances não forem zeradas
            char letra = sc.next().charAt(0);
            String resultado = jogo.tentativa(letra); // recebe a letra digitada pelo jogador e realiza a tentativa
            
            System.out.println(resultado);

            if (jogo.getTentativas_Restantes()==0){
                System.out.printf("  Você perdeu, a palvra certa era: %s\n", jogo.getPalavra());
                break;
            } 
            else if (resultado.equals("Parabéns, você venceu!")){
                System.out.printf("A palava é: %s\n", jogo.getPalavra());
                break;
            }
            System.out.print("Digite uma letra: ");
        } //sc.close(); 
    }
}

//javac POO/Objetos/Exemplo3/FORCA/Forca2.java POO/Objetos/Exemplo3/FORCA/Jogo_da_forca.java
// java POO.Objetos.Exemplo3.FORCA.Jogo_da_forca
