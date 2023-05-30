import data.*;
import model.Aluno;
import model.Cidade;
import model.Curso;
import java.util.List;


public class Principal {
    public static void main(String[] args) {
        Curso curso1 = new Curso(100,"Java - POO");
        Curso curso2 = new Curso(200,"Engenharia BioMédica e BioFísica");
        CursoDAO cursoDAO = new CursoSQLiteDAO();

        cursoDAO.salvar(curso1);
        cursoDAO.salvar(curso2);

        Cidade cidade1 = new Cidade(10, "São Carlos");
        Cidade cidade2 = new Cidade(20, "Lisboa");
        CidadeDAO cidadeDAO = new CidadeSQLiteDAO();

        cidadeDAO.salvar(cidade1);
        cidadeDAO.salvar(cidade2);

        Aluno a1 = new Aluno(1,"1010","Deividi",curso1,cidade1);
        Aluno a2 = new Aluno(2,"2020","Júlia Lemos",curso2,cidade2);
        AlunoDAO alunoDAO = new AlunoSQLiteDAO();

        alunoDAO.salvar(a1);
        alunoDAO.salvar(a2);



        List<Curso> listaCursos=cursoDAO.buscarTodos();
        for (Curso c : listaCursos )
            c.mostrarDados();

        List<Cidade> listaCidades=cidadeDAO.buscarTodos();
        for (Cidade c : listaCidades )
            c.mostrarDados();

        List<Aluno> listaAlunos=alunoDAO.buscarTodos();
        for (Aluno a : listaAlunos )
            a.mostrarDados();
    }
}
