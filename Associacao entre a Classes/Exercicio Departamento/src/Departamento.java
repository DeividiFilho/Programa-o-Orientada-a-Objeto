import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private String sigla;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Departamento(String nome, String sigla) {
        this.setNome(nome);
        this.setSigla(sigla);
    }

    double calcularFolhaPagamento(){
        double soma=0;
        for (Funcionario f: getFuncionarios())
            soma = soma + f.getSalario();
        return soma;
    }
    public void adicionarFuncionarios(Funcionario...funcionario){
        for (Funcionario f: funcionario)
            this.funcionarios.add(f);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
