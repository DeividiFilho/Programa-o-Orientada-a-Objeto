import java.util.List;
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso(100,"Java - POO");
        curso.salvar();

        Cidade cidade = new Cidade(1, "São Carlos");
        cidade.salvar();

        Aluno aluno = new Aluno(1,"3029948","Deividi",curso, cidade);
        aluno.salvar();

        List<Aluno> listaAlunos;
        listaAlunos=Aluno.buscarTodos();
        for  (Aluno a : listaAlunos)
            a.mostrarDados();

    }
}
