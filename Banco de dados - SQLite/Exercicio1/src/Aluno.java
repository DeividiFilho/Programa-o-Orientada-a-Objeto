import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private int idAluno;
    private String prontuario;
    private String nome;
    private Curso curso;
    private Cidade cidade;

    public Aluno(int idAluno, String prontuario, String nome, Curso curso, Cidade cidade) {
        this.idAluno = idAluno;
        this.prontuario = prontuario;
        this.nome = nome;
        this.curso = curso;
        this.cidade = cidade;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    public void salvar(){
        String sql = "INSERT INTO aluno (idAluno, prontuario, nome, curso, cidade) values (?,?,?,?,?)";
        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:aula1.db");
            PreparedStatement stmt = conn.prepareStatement(sql);)
        {
            stmt.setInt(1,getIdAluno());
            stmt.setString(2,getProntuario());
            stmt.setString(3,getNome());
            stmt.setInt(4,getCurso().getIdCurso());
            stmt.setInt(5, getCidade().getIdCidade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(){
        String sql = "UPDATE aluno SET prontuario=?, nome=?, curso=?, cidade=? WHERE idAluno=?";
        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:aula1.db");
            PreparedStatement stmt = conn.prepareStatement(sql);)
        {
            stmt.setString(1,getProntuario());
            stmt.setString(2,getNome());
            stmt.setInt(3,getCurso().getIdCurso());
            stmt.setInt(4, getCidade().getIdCidade());
            stmt.setInt(5,getIdAluno());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void apagar(){
        String sql = "DELETE FROM aluno WHERE idAluno=?";

        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:aula1.db");
            PreparedStatement stmt = conn.prepareStatement(sql);)
        {
            stmt.setInt(1,getIdAluno());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Aluno buscar(int param){
        String sql = "SELECT * FROM aluno WHERE idAluno=?";
        Aluno a=null;
        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:aula1.db");
            PreparedStatement stmt = conn.prepareStatement(sql);)
        {
            stmt.setInt(1,param);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Curso curso = Curso.buscar(rs.getInt("curso"));
                Cidade cidade = Cidade.buscar(rs.getInt("cidade"));
                a = new Aluno(rs.getInt("idAluno"),
                        rs.getString("prontuario"),
                        rs.getString("nome"),
                        curso,cidade);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }

    public static List<Aluno> buscarTodos(){
        String sql = "SELECT * FROM aluno";
        List<Aluno> listaAlunos=new ArrayList<>();
        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:aula1.db");
            PreparedStatement stmt = conn.prepareStatement(sql);)
        {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Curso curso = Curso.buscar(rs.getInt("curso"));
                Cidade cidade = Cidade.buscar(rs.getInt("cidade"));
                Aluno a = new Aluno(rs.getInt("idAluno"),
                        rs.getString("prontuario"),
                        rs.getString("nome"),
                        curso,cidade);
                listaAlunos.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaAlunos;
    }

    public void mostrarDados(){
        System.out.println("\n Id: " + getIdAluno() +
                "\n Nome: " + getNome() +
                "\n Prontuario: " + getProntuario()+
                "\n Curso: " + getCurso().getNome() +
                "\n Cidade: " + getCidade().getNome());
    }
}
