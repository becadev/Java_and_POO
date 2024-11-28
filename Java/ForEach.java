package Java;

public class ForEach {
        public static void main(String[] args) {
            String[] nomes = {"João", "Maria", "Carlos", "Ana"};
            
            // Usando for-each para iterar sobre o array 'nomes'
            for (String nome : nomes) {
                System.out.println(nome);  // Exibe cada nome
            }
        }
    }
    

    // for (Tipo item : coleção) {
    //     // corpo do loop
    // }

// Tipo: O tipo de elemento que você está iterando (por exemplo, String no seu caso).
// item: A variável que representa o elemento atual da coleção a cada iteração. 
// Esse item recebe o valor de cada elemento da coleção conforme o loop vai passando por ela.
// coleção: O array ou a coleção (como uma List, Set, etc.) que você está percorrendo.
