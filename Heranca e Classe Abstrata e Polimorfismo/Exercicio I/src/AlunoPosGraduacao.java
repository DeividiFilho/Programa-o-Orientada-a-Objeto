public class AlunoPosGraduacao extends Aluno{
    private String tituloMonografia;
    private Professor orientador;

    public AlunoPosGraduacao(String cpf, String nome, String prontuario, double ira, Curso curso, String tituloMonografia, Professor orientador) {
        super(cpf, nome, prontuario, ira, curso);
        this.setTituloMonografia(tituloMonografia);
        this.setOrientador(orientador);
    }

    public String getTituloMonografia() {
        return tituloMonografia;
    }

    public void setTituloMonografia(String tituloMonografia) {
        this.tituloMonografia = tituloMonografia;
    }

    public Professor getOrientador() {
        return orientador;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }
    @Override
    public void mostrarDados() {
        System.out.println("\n Nome: " +this.getNome() +
                "\n CPF: "+ this.getCpf() +
                "\n Prontuário: " +this.getProntuario()+
                "\n IRA: "+ this.getIra() +
                "\n Curso: " + this.getCurso().getNome() +
                "\n Orientador: " + this.getOrientador().getNome() +
                "\n Título: " + this.getTituloMonografia());
    }
}
