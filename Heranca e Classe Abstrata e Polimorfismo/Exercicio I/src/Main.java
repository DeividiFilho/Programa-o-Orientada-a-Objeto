import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Análise e Desenvolvimento de Sistemas", "ADS");
        Professor professor = new Professor("123456","Maria","9090", "Doutorado");

        Aluno alunoGraduacao = new AlunoGraduacao("9876",
                "José",
                "7777",
                9,
                curso,
                30);

        Aluno alunoPosGraduacao = new AlunoPosGraduacao("4567",
                "João",
                "5555",
                8,
                curso,
                "Aplicativo Android",
                professor);

        List<Aluno> lista = new ArrayList<>();
        lista.add(alunoGraduacao);
        lista.add(alunoPosGraduacao);
        for (Aluno a: lista)
            a.mostrarDados();

    }
}