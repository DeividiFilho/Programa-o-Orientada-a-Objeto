public class Professor extends Pessoa{
    private String matricula;
    private String titulacao;

    public Professor(String cpf, String nome, String matricula, String titulacao) {
        super(cpf, nome);
        this.setMatricula(matricula);
        this.setTitulacao(titulacao);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public void mostrarDados() {
        System.out.println("\n CPF: " + this.getCpf() +
                "\n Nome: " +this.getNome() +
                "\n Matrícula: "+this.getMatricula() +
                "\n Titulação: "+this.getTitulacao());
    }
}
