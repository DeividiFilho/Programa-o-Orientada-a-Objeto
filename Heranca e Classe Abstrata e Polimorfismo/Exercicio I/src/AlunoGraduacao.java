public class AlunoGraduacao extends Aluno{
    private int horasAtividadeComplementares;

    public AlunoGraduacao(String cpf, String nome, String prontuario, double ira, Curso curso, int horasAtividadeComplementares) {
        super(cpf, nome, prontuario, ira, curso);
        this.setHorasAtividadeComplementares(horasAtividadeComplementares);
    }


    public int getHorasAtividadeComplementares() {
        return horasAtividadeComplementares;
    }

    public void setHorasAtividadeComplementares(int horasAtividadeComplementares) {
        this.horasAtividadeComplementares = horasAtividadeComplementares;
    }

    @Override
    public void mostrarDados() {
            System.out.println("\n Nome: "+ this.getNome() +
                    "\n CPF: " + this.getCpf() +
                    "\n Prontuário: " +this.getProntuario() +
                    "\n IRA: " +this.getIra() +
                    "\n Horas: " + this.getHorasAtividadeComplementares() +
                    "\n Curso: " + this.getCurso().getNome());
    }
}
