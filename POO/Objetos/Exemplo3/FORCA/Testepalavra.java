package POO.Objetos.Exemplo3.FORCA;
import java.nio.file.*;
import java.util.Random;
import java.io.IOException;

public class Testepalavra {
    public static void main(String[] args) {   
        try {
            String[] linhas = Files.readAllLines(Paths.get("POO/Objetos/Exemplo3/FORCA/Palavras.txt")).toArray(new String[0]);
            System.out.println(linhas[(new Random()).nextInt(linhas.length)]); // vai ver o tamanho do arquivo e retornar um valor aleatorio dentro deste intervalo de valores
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println ("erro"); 
        }  
    }
}
