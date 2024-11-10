package POO.Objetos.Exemplo3.FORCA;
import java.util.Scanner;

public class Jogo_da_forca {
    public static void main(String[] args){
        Forca jogo = new Forca();
        jogo.iniciar();

        System.out.println("Bem-Vindo ao jogo da forca! Digite uma letra: ");
        Scanner sc = new Scanner(System.in);

        while(!jogo.Vitoria() && jogo.getTentativas_Restantes() > 0){// o loop irá acontecer enquanto o jogador não vencer e suas chances não forem zeradas
            char letra = sc.next().charAt(0);
            String resultado = jogo.tentativa(letra); // recebe a letra digitada pelo jogador e realiza a tentativa
            
            if (jogo.getTentativas_Restantes()==0){
                System.out.printf("Você perdeu, a palvra certa era:%s\n", jogo.getPalavra());
                break;
            } 
            else if (resultado.equals("Parabéns, você venceu!")){
                System.out.printf("Parabéns, você acertou a palavra!\n");
                break;
            }
            System.out.println(resultado);
        } //sc.close(); 
    }
}
