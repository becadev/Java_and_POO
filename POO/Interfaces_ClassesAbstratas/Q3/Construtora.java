package POO.Interfaces_ClassesAbstratas.Q3;
import java.util.ArrayList;
import java.util.List;


// Ainda não sei como seria para saber quem é motorista e quem é engenheiro, como sera feita essa verificação? sinceramente não faço a minima ideia
public class Construtora{
    private List<Funcionario> funcs;
    // private ArrayList<Motorista> motoristas;
    // private ArrayList<Motorista> engenheiros;

    public Construtora(){
        this.funcs = new ArrayList<>();
        // this.motoristas = new ArrayList<>();
        // this.engenheiros = new ArrayList<>();
    }
    public void inserir(Funcionario f){ // adiciona funcionario a lista de  funcionarios
        this.funcs.add(f);
    }

    public List<Motorista> motoristas(){
        List<Motorista> lista = new ArrayList<>();
        for(Funcionario fun: this.funcs){
            if (fun instanceof Motorista){
                lista.add((Motorista)fun);
            }
        }
        // this.funcs.stream.filter(fun => fun instanceof Motorista); essa parte do codigo podia ser substituida por essa parte
        return lista;
    }

    public List<Motorista> engenheiros(){
        return this.engenheiros;
    }

    public List<Motorista> funcionarios(){
        return this.funcs;
    }
}