package model;
import model.ItemVenda;
public class Venda implements IMostrarDados{
    private int idVenda;
    private String dataVenda;
    private double valorTotalVenda;

    public Venda(int idVenda, String dataVenda, double valorTotalVenda) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.valorTotalVenda = valorTotalVenda;
    }

    public void calcularValorTotalVenda() {
        this.valorTotalVenda=valorTotalVenda;
    }
    public void incluirItemVenda(){
    }

    public void removerItemVenda(){

    }
    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }
    @Override
    public void mostrarDados() {
        System.out.println("\nId " + getIdVenda() +
                "\nData da venda: " + getDataVenda() +
                "\nValor total da venda: " + getValorTotalVenda());
    }
}
