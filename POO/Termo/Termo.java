package POO.Termo;
import java.util.ArrayList;

public class Termo{
    private String palavra;
    private String letra;
    private int tamanho;
    private ArrayList <String> blocos;
    private ArrayList <Character> letras;
    private ArrayList <Character> letras_palavra_tentada;
    Palavra choose_word = new Palavra();

    // Método Construtor
    public void termo() {
        this.palavra = choose_word.escolher_palavra();
        this.tamanho = this.palavra.length();

        for (int i = 0 ; i<this.tamanho ; i++){
            blocos.add("⬜");
        }
        for (int i = 0 ; i<this.tamanho ; i++){
            letras.add(this.palavra.charAt(i));
        }
    }

    public String setEstado(String palavra_tentada){

        for (int i = 0 ; i < this.tamanho ; i++){
            letras_palavra_tentada.add(palavra_tentada.charAt(i));
        }

        for (int letra  = 0 ; letra < this.tamanho ; letra++){
            // verifica se a palavra escolhida contém as letras da palavra tentada
            // Se contém, terá que verificar em qual posição está
            // Se não, o estado continua
            // tem que verificar se os indices das letras são iguais
            if (this.letras.contains(letras_palavra_tentada.get(letra))){
                char letra_palavra_tentada = letras_palavra_tentada.get(letra);
                


            }

        }
        return " "; // é para retornar o esatado dos blocos
    }
}













// 🟩 🟨 ⬛