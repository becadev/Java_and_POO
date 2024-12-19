package Q3;

public class Motorista extends FuncionarioAbstrato{
    private String cnh;

    public Motorista(String nome, String email, String fone, String cnh){
        super(nome,email,fone);
        this.cnh = cnh;
    }
    public void SteCrea(String other_cnh){
        this.cnh = other_cnh;
    }
    public String getCnh(){
        return this.cnh;
    }
    @Override
    public String toString(){
        StringBuffer dados = new StringBuilder();
        dados.append("Nome: " + this.nome + "\n");
        dados.append("Email: " + this.email + "\n");
        dados.append("Fone: " + this.fone + "\n");
        dados.append("CNH: " + getCnh() + "\n");
        return dados.toString();
    }
}