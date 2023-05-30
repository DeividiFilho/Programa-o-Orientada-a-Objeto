package data;
import model.Venda;
import model.ItemVenda;
import model.Produto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class VendaSQLiteDAO implements VendaDAO{
    @Override
    public void salvar(Venda venda) {
        String sql = "INSERT INTO venda(id,datavenda,valortotalvenda) VALUES (?,?,?)";
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)) {
            stmt.setInt(1, venda.getIdVenda());
            stmt.setString(2, venda.getDataVenda());
            stmt.setInt(3, (int) venda.getValorTotalVenda());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Venda venda) {
        String sql = "UPDATE venda SET data=?,valor=? WHERE id = ?";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setString(1,venda.getDataVenda());
            stmt.setInt(2,(int) venda.getValorTotalVenda());
            stmt.setInt(3, venda.getIdVenda());
            stmt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void apagar(Venda venda) {
        String sql = "DELETE FROM venda WHERE id=?";
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,venda.getIdVenda());
            stmt.executeUpdate();
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public Venda buscar(int id) {

        String sql = "SELECT * FROM venda WHERE id=?";
        Venda venda = null;
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
            {
                Venda venda1 = new VendaSQLiteDAO().buscar(rs.getInt("venda"));
                Produto produto = new ProdutoSQLiteDAO().buscar(rs.getInt("produto"));
                ItemVenda itemVenda = new ItemVendaSQLiteDAO().buscar(rs.getInt("valor"));
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return venda;
    }

    @Override
    public List<Venda> buscarTodos() {
        String sql = "SELECT * FROM venda";
        List<Venda> ListaVenda = new ArrayList<>();
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
            {
                Produto produto = new ProdutoSQLiteDAO().buscar(rs.getInt("produto"));
                ItemVenda itemvenda = new ItemVendaSQLiteDAO().buscar(rs.getInt("itemvenda"));
                Venda venda= new Venda(rs.getInt("id"),rs.getString("data da venda"),rs.getDouble("valor total"));
                ListaVenda.add(venda);
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return ListaVenda;
    }
}
