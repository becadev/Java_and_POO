package POO.Objetos.Exemplo4;

public class Extrato {
    private String dadosExtrato;
    private String Nome_Titular;
    private double Saldo;

    public Void GerarExtrato(){
        String[][] dadosExtrato = new String[5][5];
        ContaBancaria dados = new ContaBancaria();
        this.Saldo = dados.getSaldo();
        this.Nome_Titular = dados.getNome_Titular();
        

    }
    public String getExtrato(double Saldo, double Saque, String Numero_da_Conta, String NomeTitular){
        dadosExtrato[0][0] = " ";  dadosExtrato[0][1] = " "; dadosExtrato[0][2] = "Extrato Bancário";  dadosExtrato[0][3] = " "; dadosExtrato[0][4] = " ";
        dadosExtrato[1][0] = "Nome do Titular: ";  dadosExtrato[1][1] = NomeTitular; dadosExtrato[1][2] = " ";  dadosExtrato[1][3] = " "; dadosExtrato[1][4] = " ";
        dadosExtrato[2][0] = "Número da Conta: ";  dadosExtrato[2][1] = Numero_da_Conta; dadosExtrato[2][2] = " ";  dadosExtrato[2][3] = " "; dadosExtrato[2][4] = " ";
        dadosExtrato[3][0] = "Saldo Bancário: R$ ";  dadosExtrato[3][1] = Saldo; dadosExtrato[3][2] = " "; dadosExtrato[3][3] = " "; dadosExtrato[3][4] = " ";
        dadosExtrato[4][0] = "Valor do Saque: R$ ";  dadosExtrato[4][1] = Saque; dadosExtrato[4][2] = " "; dadosExtrato[4][3] = " "; dadosExtrato[4][4] = " ";
    }
}
