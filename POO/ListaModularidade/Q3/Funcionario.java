package POO.ListaModularidade.Q3;

public abstract class Funcionario{
   protected String nome;
   protected String email;
   protected String fone;

    public Funcionario(String nome, String email, String fone){
        this.nome = nome;
        this.email = email;
        this.fone = fone;
    }
    public void SetNome(String other_nome){
        this.nome = other_nome;
    }
    public void SetEmail(String other_email){
        this.email = other_email;
    }
    public void SetFone(String other_fone){
        this.email = other_fone;
    }
    public String getNome(){
        return this.nome;
    }
    public String getEmail(){
        return this.email;
    }
    public String getFone(){
        return this.fone;
    }
    public String toString(){
        StringBuffer dados = new StringBuilder();
        dados.append("Nome: " + this.nome + "\n");
        dados.append("Email: " + this.email + "\n");
        dados.append("Fone: " + this.fone + "\n");
        return dados.toString();
    }
}