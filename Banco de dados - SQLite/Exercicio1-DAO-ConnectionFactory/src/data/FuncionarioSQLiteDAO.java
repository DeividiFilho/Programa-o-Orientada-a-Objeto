package data;

import model.Departamento;
import model.Funcionario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioSQLiteDAO implements FuncionarioDAO{
    @Override
    public void salvar(Funcionario f) {
        String sql = "INSERT INTO funcionario values (?,?,?,?)";
        try(PreparedStatement stmt=ConnectionFactory.criaStatement(sql)) {
            stmt.setInt(1,f.getId());
            stmt.setString(2, f.getCpf());
            stmt.setString(3,f.getNome());
            stmt.setInt(4,f.getDepartamento().getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Funcionario f) {
        String sql = "UPDATE funcionario SET cpf=?, nome=?, departamento=? WHERE id=?)";
        try(PreparedStatement stmt=ConnectionFactory.criaStatement(sql)) {
            stmt.setString(1, f.getCpf());
            stmt.setString(2,f.getNome());
            stmt.setInt(3,f.getDepartamento().getId());
            stmt.setInt(4,f.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void apagar(Funcionario f) {
        String sql = "DELETE FROM funcionario WHERE id=?";
        try(PreparedStatement stmt=ConnectionFactory.criaStatement(sql)) {
            stmt.setInt(1,f.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Funcionario buscar(int id) {
        Funcionario f=null;
        String sql = "SELECT * FROM funcionario WHERE id=?";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
            {
                Departamento d = new DepartamentoSQLiteDAO().
                        buscar(rs.getInt("departamento"));
                f = new Funcionario(rs.getInt("id"),
                        rs.getString("cpf"),
                        rs.getString("nome"),d );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public List<Funcionario> buscarTodos() {
        Funcionario f=null;
        List<Funcionario> listaFunc= new ArrayList<>();
        String sql = "SELECT * FROM funcionario";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
            {
                Departamento d = new DepartamentoSQLiteDAO().
                        buscar(rs.getInt("departamento"));
                f = new Funcionario(rs.getInt("id"),
                        rs.getString("cpf"),
                        rs.getString("nome"),d );
                listaFunc.add(f);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaFunc;
    }
}