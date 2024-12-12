//  Class para escolher a palavra do termo

package POO.Termo;
import java.util.Random;
import java.io.IOException;
import java.nio.file.*;

public class Palavra {
    private String palavra;
    public String escolher_palavra(){
        try {
            String[] linhas = Files.readAllLines(Paths.get("POO/Termo/palavras.txt")).toArray(new String[0]);
            return linhas[(new Random()).nextInt(linhas.length)];
        } catch (IOException e) {
            e.printStackTrace();
            return "Error ";
        }  
    }
}
