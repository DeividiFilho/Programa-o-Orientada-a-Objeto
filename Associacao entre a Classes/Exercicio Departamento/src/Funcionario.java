public class Funcionario {
    private String cpf;
    private String nome;
    private double salario;
    private Departamento departamento;

    public Funcionario(String cpf, String nome, double salario, Departamento departamento) {
        this.setCpf(cpf);
        this.setNome(nome);
        this.setSalario(salario);
        this.setDepartamento(departamento);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
