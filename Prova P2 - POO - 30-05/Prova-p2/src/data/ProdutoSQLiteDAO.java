package data;

import model.Produto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class ProdutoSQLiteDAO implements ProdutoDAO{

    @Override
    public void salvar(Produto produto) {
        String sql = "INSERT INTO produto(idproduto, descricao, precounitario, quantidadeestoque) VALUES (?,?,?,?)";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,produto.getIdProduto());
            stmt.setString(2,produto.getDescricao());
            stmt.setDouble(3,produto.getPrecoUnitario());
            stmt.setInt(4,produto.getQuantidadeEstoque());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Produto produto) {
        String sql = "UPDATE produto SET produto=? WHERE idproduto = ?";
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,produto.getIdProduto());
            stmt.setString(2,produto.getDescricao());
            stmt.setDouble(3,produto.getPrecoUnitario());
            stmt.setInt(4,produto.getQuantidadeEstoque());
            stmt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void apagar(Produto produto) {
        String sql = "DELETE FROM produto WHERE idproduto=?";
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,produto.getIdProduto());
            stmt.executeUpdate();
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public Produto buscar(int id) {
        String sql = "SELECT * FROM produto WHERE idproduto=?";
        Produto produto = null;
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
            {
                produto = new Produto(rs.getInt("idprodtudo"),rs.getString("descricao"),rs.getDouble("preco unitario"), rs.getInt("quantidade estoque"));
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return produto;    }

    @Override
    public List<Produto> buscarTodos() {
        String sql = "SELECT * FROM cargo";
        List<Produto> ListaProdutos = new ArrayList<>();
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
            {
                Produto produto = new Produto(rs.getInt("idproduto"),rs.getString("descricao"),rs.getDouble("preco unitario"), rs.getInt("quantidade estoque"));
                ListaProdutos.add(produto);
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return ListaProdutos;    }
}
