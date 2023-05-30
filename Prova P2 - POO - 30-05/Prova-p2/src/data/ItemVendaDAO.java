package data;

import model.ItemVenda;

import java.util.List;
public interface ItemVendaDAO extends DAO<ItemVenda>{
    void salvar(ItemVenda itemVenda);
    void atualizar(ItemVenda itemVenda);
    void apagar(ItemVenda itemVenda);
    ItemVenda buscar(int id);
    List<ItemVenda> buscarTodos();
}
