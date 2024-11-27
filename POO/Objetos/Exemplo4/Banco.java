package POO.Objetos.Exemplo4;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args){
        ContaBancaria banco = new ContaBancaria();
        banco.Dados();
        Scanner sc = new Scanner (System.in);

        // Recebendo dados da conta
        System.out.println ("Bem Vindo ao Banco Javenal \n Digite o Nome do Titular da conta:");
        String NomeTitular = sc.nextLine();
        System.out.println("Digite o Número da Conta: ");
        String Num_Conta = sc.nextLine();

        // Recebendo ação que será realizada
        System.out.println("Qual Operação deseja realiza: \n  [1] Saldo \n [2] Saque \n [3] Extrato");
        
        String operacao = sc.nextLine();
        banco.Operacao(operacao);

        if (operacao.equals("2")){
            System.out.println("VALOR: R$ "); 
            Double valor = sc.nextDouble();
            banco.Saque(valor);
        }
       




    }
}
