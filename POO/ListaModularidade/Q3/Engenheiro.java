package POO.ListaModularidade.Q3;

public class Engenheiro extends Funcionario{
    private String crea;

    public Engenheiro(String nome, String email, String fone, String crea){
        super(nome,email,fone);
        this.crea = crea;
    }
    public void SteCrea(String other_crea){
        this.crea = other_crea;
    }
    public String getCrea(){
        return this.crea;
    }
    @Override
    public String toString(){
        StringBuffer dados = new StringBuilder();
        dados.append("Nome: " + this.nome + "\n");
        dados.append("Email: " + this.email + "\n");
        dados.append("Fone: " + this.fone + "\n");
        dados.append("crea: " + getCrea() + "\n");
        return dados.toString();
    }
}