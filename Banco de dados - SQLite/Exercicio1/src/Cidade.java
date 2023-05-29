import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Cidade {
    private int idCidade;
    private String nome;

    public Cidade(int idCidade, String nome) {
        this.idCidade = idCidade;
        this.nome = nome;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void salvar(){
        String sql = "INSERT INTO cidade (idCidade, nome) values (?,?)";
        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:aula1.db");
            PreparedStatement stmt = conn.prepareStatement(sql);)
        {
            stmt.setInt(1,getIdCidade());
            stmt.setString(2,getNome());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(){
        String sql = "UPDATE cidade SET nome=? WHERE idCidade=?";
        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:aula1.db");
            PreparedStatement stmt = conn.prepareStatement(sql);)
        {
            stmt.setString(1,getNome());
            stmt.setInt(2,getIdCidade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void apagar(){
        String sql = "DELETE FROM cidade WHERE idCidade=?";

        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:aula1.db");
            PreparedStatement stmt = conn.prepareStatement(sql);)
        {
            stmt.setInt(1,getIdCidade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Cidade buscar(int param){
        String sql = "SELECT * FROM cidade WHERE idCidade=?";
        Cidade c=null;
        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:aula1.db");
            PreparedStatement stmt = conn.prepareStatement(sql);)
        {
            stmt.setInt(1,param);
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
                c = new Cidade(rs.getInt("idCidade"), rs.getString("nome"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    public static List<Cidade> buscarTodos(){
        String sql = "SELECT * FROM cidade";
        List<Cidade> listaCursos =new ArrayList<>();
        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:aula1.db");
            PreparedStatement stmt = conn.prepareStatement(sql);)
        {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cidade c = new Cidade(rs.getInt("idCidade"), rs.getString("nome"));
                listaCursos.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaCursos;
    }

    public void mostrarDados(){
        System.out.println("\n Id: " + getIdCidade() +
                "\n Nome: " + getNome());
    }
}
