package POO.Objetos.Exemplo3.FORCA;
import java.nio.file.*;
import java.util.Random;
import java.io.IOException;
import java.util.ArrayList;

public class Forca2 {
    private int tentativasRestantes;
    private String palavra_e_dica;
    private String palavra;
    private String dica;
    private boolean achou;
    private String jogada;
    private ArrayList<Character> letrastentadas;
    private String [] espacos;


    private String [] escolherPalavra(){
        try {
            String[] linhas = Files.readAllLines(Paths.get("POO/Objetos/Exemplo3/FORCA/Palavras.txt")).toArray(new String[0]);
            String linhaSorteada =  linhas[(new Random()).nextInt(linhas.length)] ; // vai ver o tamanho do arquivo e retornar um valor aleatorio dentro deste intervalo de valores
            String[] palavra_e_dica = linhaSorteada.split(","); // Vai separar as linhas
            return palavra_e_dica;
        } catch (IOException e) {
            e.printStackTrace();
            return new String[]{"Error", " "};
        }   
    }

    public void iniciar(){
        String [] palavra_e_dica = escolherPalavra();
        this.palavra = palavra_e_dica[0];
        this.dica = palavra_e_dica[1];
        this.tentativasRestantes = 6;
        this.jogada = " ";
        this.achou = false;
        this.letrastentadas = new ArrayList<>();
        this.espacos =  new String[palavra.length()]; // Cria uma array para mostrar ao user

        for (int i = 0; i < palavra.length(); i++) { // Array com os espaços vazios mostrando o tamanho da palavra ao user
            this.espacos[i] = "_";  
        }
        
    }
    // public String qtd_letra(String espacos[]){

    // }


    public String tentativa(char letra){ // Diferente das outras func ela não pode ser Void pois deverá retornar um valor para a func Iniciar()
        int tamanho = palavra.length();
        this.achou = false;

        
        if (this.letrastentadas.contains(letra)) { // Avisa ao jogador para que ele não perca uma tentativa com uma jogada já realizada sendo burro
            return "Você já tentou essa letra.";
        }else{this.letrastentadas.add(letra);}
        
        
        // Verifica se a letra está na palavra
            for (int i = 0 ; i < tamanho ; i++){
                if (palavra.charAt(i) == letra) {
                    this.espacos[i] = String.valueOf(letra);  // substitui espaco pela letra tentada
                    this.achou  = true;
                }
            }
            
        if (achou==(false)){ // se achou ainda for falsa ele entra aqui
            this.tentativasRestantes -= 1;
        }
        else if (this.tentativasRestantes == 0) {
            return "Você perdeu!";
        }
        else if (Vitoria()) {
            return "Parabéns, você venceu!";
        }
        this.jogada = "  "+ String.join(" ", this.espacos)+ "\n" + 
        " | Tentativas restantes: " + this.tentativasRestantes + "\n"+
        " | Letras tentadas: " +   this.letrastentadas;
        
        return this.jogada;
    }

    public int qtd_letra(){
        return palavra.length();
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
    public String getDica() { // vai mostrar a dica para o jogador
        return this.dica;
    }

    public String getPalavra(){ // mostrará a palavra caso o jogador perder
        String palavrafinal = this.palavra;
        return palavrafinal;
    }

}

