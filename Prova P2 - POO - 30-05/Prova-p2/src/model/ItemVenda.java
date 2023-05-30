package model;

public class ItemVenda implements IMostrarDados {
    private int idItemVenda;
    private int quantidadeVendidade;
    private double valorTotal;

    public void calcularValorTotal() {
        this.quantidadeVendidade=quantidadeVendidade;
        this.valorTotal=valorTotal;
    }

    public ItemVenda(int idItemVenda, int quantidadeVendidade, double valorTotal) {
        this.idItemVenda = idItemVenda;
        this.quantidadeVendidade = quantidadeVendidade;
        this.valorTotal = valorTotal;
    }

    public int getIdItemVenda() {
        return idItemVenda;
    }

    public void setIdItemVenda(int idItemVenda) {
        this.idItemVenda = idItemVenda;
    }

    public int getQuantidadeVendidade() {
        return quantidadeVendidade;
    }

    public void setQuantidadeVendidade(int quantidadeVendidade) {
        this.quantidadeVendidade = quantidadeVendidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public void mostrarDados() {
        System.out.println("\nId " + getIdItemVenda() +
                "\nQuantidade vendida: " + getQuantidadeVendidade() +
                "\nValor total: " + getValorTotal());
    }

}
