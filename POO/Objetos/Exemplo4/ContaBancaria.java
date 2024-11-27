// Implemente uma classe chamada “ContaBancária” que possua atributos para armazenar o número da conta, 
// nome do titular e saldo. Adicione métodos para realizar depósitos e saques.

package POO.Objetos.Exemplo4;

public class ContaBancaria {
    private String Numero_da_Conta;
    private String NomeTitular;
    private double Saldo;
    private double Saque;
    private String dados;

    public void Dados(){
        Extrato dados = new Extrato();
        this.Numero_da_Conta = " ";
        this.NomeTitular = " ";
        this.Saldo = 0.0;
        this.Saque = 0.0;
    }
    // [1] Saldo [2] Saque [3] Extrato
    public void Operacao (String operacao){
        if (operacao.equals("1")){
            getSaldo();
        }
        if (operacao.equals("3")){
            Extrato();
        }

    }

    public void Saque(double valor){
        getSaldo(this.Saldo);
    }

    public String getSaldo(double Saldo){
        this.Saldo -=  this.Saque;
        if (this.Saldo < 0){
            return "Saldo Insuficiente" + this.Saldo;
        }
        String Situacao = Extrato();
        return Situacao;
    }
    public double getNumero_Conta(){
        return this.Numero_da_Conta;
    }
    public double getNome_Titular(){
        return this.NomeTitular;
    }

    public double Extrato(){
        return dados.getExtrato();
    }

   




}
