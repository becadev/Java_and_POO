package POO.Objetos.Exemplo4;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        // Recebendo dados da conta
        System.out.print ("Bem Vindo ao Banco Javenal \nDigite o Nome do Titular da conta: ");
        String NomeTitular = sc.nextLine();
        System.out.print("Digite o Número da Conta: ");
        String Num_Conta = sc.nextLine();

        ContaBancaria conta = new ContaBancaria(Num_Conta, NomeTitular);

        // Recebendo ação que será realizada
        System.out.print("Qual Operação deseja realiza: \n  [1] Saldo  |  [2] Saque  |  [3] Depósito  | [4] Extrato : ");
        String operacao = sc.nextLine();
        

        if (operacao.equals("1")){
            String Saldo = "R$ " + conta.getSaldo();
            System.out.println(Saldo);
        }
        if (operacao.equals("2")){
            System.out.print("VALOR: R$ "); 
            Double valor = sc.nextDouble();
            conta.realizarSaque(valor);
        }
        if (operacao.equals("3")){ 
            System.out.print("VALOR: R$ "); 
            Double valor = sc.nextDouble();
            conta.realizarDeposito(valor);
        }
        System.out.print(conta.exibirExtrato());
    }
}
