package POO.ListaModularidade.Q3;
import java.util.ArrayList;
import java.util.List;


// Ainda não sei como seria para saber quem é motorista e quem é engenheiro, como sera feita essa verificação? sinceramente não faço a minima ideia
public class Construtora{
    private ArrayList<Funcionario> funcs;
    private ArrayList<Motorista> motoristas;
    private ArrayList<Motorista> engenheiros;

    public Construtora(){
        this.funcs = new ArrayList<>();
        this.motoristas = new ArrayList<>();
        this.engenheiros = new ArrayList<>();
    }
    public void Inserir(Funcionario f){
        this.funcs.add(f);
    }

    public List<Motorista> Motoristas(){
        return this.motoristas;
    }

    public List<Motorista> Engenheiros(){
        return this.engenheiros;
    }

    public List<Motorista> Funcionarios(){
        return this.funcs;
    }
}