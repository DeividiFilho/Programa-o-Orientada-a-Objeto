import data.*;
import model.ItemVenda;
import model.Venda;
import model.Produto;


public class Main {
    public static void main(String[] args) {
        Venda venda = new Venda(1, "30/05/2023", 310);
        Venda venda1 = new Venda(2, "06/12/2023", 510);

        VendaDAO vendaDAO = new VendaSQLiteDAO();
        vendaDAO.salvar(venda);
        vendaDAO.salvar(venda1);

        // Venda finalizada

        ItemVenda itemVenda = new ItemVenda(1, 2, 100);
        ItemVenda itemVenda1 = new ItemVenda(2, 3, 99);

        ItemVendaDAO itemVendaDAO = new ItemVendaSQLiteDAO();
        itemVendaDAO.salvar(itemVenda);
        itemVendaDAO.salvar(itemVenda1);

        // ItemVenda finalizado

        Produto produto = new Produto(11, "Celular móvel", 1000, 7);
        Produto produto1 = new Produto(15, "Notebook", 5400, 2);

        ProdutoDAO produtoDAO = new ProdutoSQLiteDAO();
        produtoDAO.salvar(produto);
        produtoDAO.salvar(produto);

        // Produto finalizado

        System.out.println("\nVendas:");
        for (Venda v : vendaDAO.buscarTodos())
            v.mostrarDados();


        System.out.println("\nItem vendas:");
        for (ItemVenda i :itemVendaDAO.buscarTodos())
            i.mostrarDados();

        System.out.println("\nProdutos");
        for (Produto p :produtoDAO.buscarTodos())
            p.mostrarDados();
    }
}