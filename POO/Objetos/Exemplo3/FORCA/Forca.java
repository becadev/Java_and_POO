package POO.Objetos.Exemplo3.FORCA;
import java.nio.file.*;
import java.util.Random;
import java.io.IOException;

public class Forca {
    private int tentativasRestantes;
    private String palavra;
    private String letras_jogadas = " ";
    private String [] espacos;

    private String escolherPalavra(){
        try {
            String[] linhas = Files.readAllLines(Paths.get("POO/Objetos/Exemplo3/FORCA/Palavras.txt")).toArray(new String[0]);
            return linhas[(new Random()).nextInt(linhas.length)]; // vai ver o tamanho do arquivo e retornar um valor aleatorio dentro deste intervalo de valores
        } catch (IOException e) {
            e.printStackTrace();
            return "Error: " ; 
        }   
    }

    public void iniciar(){
        this.palavra = escolherPalavra();
        this.tentativasRestantes = 6;
        //this.letras_jogadas
        //this.letras = new char[26];
        this.espacos =  new String[palavra.length()]; // Cria uma array para mostrar ao user

        for (int i = 0; i < palavra.length(); i++) { // Array com os espaços vazios mostrando o tamanho da palavra ao user
            espacos[i] = "_";  
        }

    }
    public String tentativa(char letra){ // Diferente das outras func ela não pode ser Void pois deverá retornar um valor para a func Iniciar()
        int tamanho = palavra.length();
        String jogada = "";
        boolean achou = false;

        // Verifica se a letra está na palavra
            for (int i = 0 ; i < tamanho ; i++){
                if (palavra.charAt(i) == letra) {
                    this.espacos[i] = String.valueOf(letra);  // substitui espaco pela letra tentada
                    achou  = true;
                }
            }
            
        if (achou==(false)){ // se achou ainda for falsa ele entrará aqui
            this.tentativasRestantes -= 1;
        }
        else if (this.tentativasRestantes == 0) {
            return "Você perdeu!";
        }
        else if (Vitoria()) {
            return "Parabéns, você venceu!";
        }
        jogada = String.join(" ", this.espacos) + " | Tentativas restantes: " + this.tentativasRestantes;
            return jogada;
    }

    public boolean Vitoria(){ // verifica se o jogador venceu
        for (int i = 0 ; i < palavra.length() ; i++){
            if (espacos[i].equals("_")){
                return false;
            }
        }
        return true;
    }

    public int getTentativas_Restantes() { // será usado para inicializar o loop do jogo
        return this.tentativasRestantes;
    }

    public String getPalavra(){ // mostrará a palavra caso o jogador perder
        String palavrafinal = this.palavra;
        return palavrafinal;
    }
}






