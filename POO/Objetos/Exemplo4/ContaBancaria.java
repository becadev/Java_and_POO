// Implemente uma classe chamada “ContaBancária” que possua atributos para armazenar o número da conta, 
// nome do titular e saldo. Adicione métodos para realizar depósitos e saques.

package POO.Objetos.Exemplo4;

public class ContaBancaria {
    // Atributos
    private String numeroConta;
    private String NomeTitular;
    private double saldo;
    private double saque;
    private double depositos;

        // Construtor
        public ContaBancaria(String numeroDaConta, String nomeTitular) {
            this.numeroConta = numeroDaConta;
            this.NomeTitular = nomeTitular;
            this.saque = 0.0;
            this.depositos = 0.0;
            this.saldo = 1000.0;
        }
    
    
    // [1] saldo [2] saque [3] Extrato
    // Verifica a Operação que será realizada
    // public void Operacao (String operacao){
    //     if (operacao.equals("1")){
    //         getSaldo();
    //     }
    //     if (operacao.equals("3")){
    //         realizarDeposito();
    //     }
    //     if (operacao.equals("4")){
    //         exibirExtrato();
    //     }
    // }

    // Verifica se há saldo suficiente, se sim, retorna extrato de saque, senão retorna saldo insuficiente
    public void realizarSaque(double valorSaque){
        this.saldo -=  valorSaque;
        if (this.saldo < 0){
            saldoInsuficiente();
        }
    }

    public void realizarDeposito(double valorDeposito){
        this.saldo += valorDeposito;
        this.depositos += valorDeposito;
    }

    public String saldoInsuficiente(){
        String situacao = "Saldo infuficiente para esse valor de saque \n SALDO: " + this.saldo;
        return situacao;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public String getNumero_Conta(){
        return this.numeroConta;
    }
    public String getNome_Titular(){
        return this.NomeTitular;
    }

    // Vai até a class Extrato para formatar e retornar o extrato
    public String exibirExtrato(){
        Extrato geracaoDeExtrato = new Extrato();
        geracaoDeExtrato.gerarExtrato(this.saldo, this.saque, this.depositos, this.numeroConta, this.NomeTitular);

        return geracaoDeExtrato.getExtrato(); 
    }
}
