package POO.Objetos.Exemplo4;
import java.util.ArrayList;
import java.util.List;

public class Extrato {
    // Atributos
    private String nomeTitular;
    private double saldo;
    private double saques;
    private double depositos;
    private String numConta;
    private List<String> dadosExtrato;


    // Era pra ser um construtor sem o void mas ele só ta rodando com void então ta bom
    public void gerarExtrato(double saldo, double saque, double deposito, String numeroConta, String NomeTitular){
        this.dadosExtrato = new ArrayList<>();
        this.saldo = saldo;
        this.depositos = deposito;
        this.nomeTitular = NomeTitular;
        this.numConta = numeroConta;
        this.saques = saque;
    }

    // Estrutura e os dados dentro de uma String
    public String getExtrato(){
        StringBuilder extratoFinal = new StringBuilder();
        dadosExtrato.add("Extrato Bancário");
        dadosExtrato.add("Nome do Titular: " + this.nomeTitular);
        dadosExtrato.add("Número da Conta: " + this.numConta);
        dadosExtrato.add("Saldo Bancário: R$ " + this.saldo);
        dadosExtrato.add("Valor do Saques totais realizados: R$ " + this.saques);
        dadosExtrato.add("Valor de Depóisitos totais realizados: R$ " + this.depositos);


        // ForEach 
        for (String linha : dadosExtrato){
            extratoFinal.append(linha).append("\n");
        }
        return extratoFinal.toString(); // Retornando o Extrato
    }
}
