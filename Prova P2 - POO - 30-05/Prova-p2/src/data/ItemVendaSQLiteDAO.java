package data;
import model.ItemVenda;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class ItemVendaSQLiteDAO implements ItemVendaDAO {

    @Override
    public void salvar(ItemVenda itemVenda) {
        String sql = "INSERT INTO itemvenda(iditemvenda,quantidadevendida,valortotal) VALUES (?,?,?)";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,itemVenda.getIdItemVenda());
            stmt.setInt(2,itemVenda.getQuantidadeVendidade());
            stmt.setDouble(3,itemVenda.getValorTotal());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(ItemVenda itemVenda) {
        String sql = "UPDATE itemvenda SET quantidadevendida=?,valortotal=? WHERE iditemvenda = ?";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1, itemVenda.getQuantidadeVendidade());
            stmt.setDouble(2,itemVenda.getValorTotal());
            stmt.setInt(3,itemVenda.getIdItemVenda());
            stmt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void apagar(ItemVenda itemVenda) {
        String sql = "DELETE FROM itemvenda WHERE iditemvenda=?";
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,itemVenda.getIdItemVenda());
            stmt.executeUpdate();
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public ItemVenda buscar(int id) {
        String sql = "SELECT * FROM itemvenda WHERE iditemvenda=?";
        ItemVenda itemVenda = null;
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
            {
                itemVenda = new ItemVenda(rs.getInt("id"),rs.getInt("quantidade de vendas"),rs.getDouble("valor total"));
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return itemVenda;    }

    @Override
    public List<ItemVenda> buscarTodos() {
        String sql = "SELECT * FROM itemvenda";
        List<ItemVenda> ListasItemVendas = new ArrayList<>();
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
            {
                ItemVenda itemVenda = new ItemVenda(rs.getInt("id"),rs.getInt("quantidade de vendas"),rs.getDouble("valor total"));
                ListasItemVendas.add(itemVenda);
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return ListasItemVendas;    }
}
