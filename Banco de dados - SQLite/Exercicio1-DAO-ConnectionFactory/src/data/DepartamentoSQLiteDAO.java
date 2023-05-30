package data;
import model.Departamento;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartamentoSQLiteDAO implements DepartamentoDAO {

    @Override
    public void salvar(Departamento d) {
        String sql = "INSERT INTO departamento values (?,?,?)";
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)) {
            stmt.setInt(1, d.getId());
            stmt.setString(2, d.getNome());
            stmt.setString(3, d.getSigla());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Departamento d) {
        String sql = "UPDATE departamento SET nome=?, sigla=? WHERE id=?";
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)) {
            stmt.setString(1, d.getNome());
            stmt.setString(2, d.getSigla());
            stmt.setInt(3, d.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void apagar(Departamento d) {
        String sql = "DELETE FROM departamento WHERE id=?";
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)) {
            stmt.setInt(1, d.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Departamento buscar(int id) {
        Departamento d = null;
        String sql = "SELECT * FROM departamento WHERE id=?";
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
                d = new Departamento(rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("sigla"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return d;

    }

    @Override
    public List<Departamento> buscarTodos() {

        List<Departamento> listaDepto = new ArrayList<>();
        String sql = "SELECT * FROM departamento";
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)) {

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Departamento d = new Departamento(rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("sigla"));
                listaDepto.add(d);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaDepto;
    }
}