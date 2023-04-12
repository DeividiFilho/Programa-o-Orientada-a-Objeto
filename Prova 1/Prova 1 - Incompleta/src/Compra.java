import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compra implements IMostrarDados{
    private String numeroCompra;
    private LocalDate dataCompra;
    private double valorTotal;
    private double valorDesconto;
    private double valorPagar;
    private List<ItemCompra> itemCompras = new ArrayList<>();

    private List<Cliente> clientes = new ArrayList<>();

    public void calcularValorTotalCompra(){
        if (valorTotal >= 5000)
        {
            valorDesconto = valorTotal * 0.03;
        }
        valorPagar = valorTotal - valorDesconto;
    }

    public void incluirItemCompra(ItemCompra ItemCompra){
        itemCompras.add((ItemCompra) itemCompras);
    }
    public void removerItemCompra(ItemCompra itemCompra){
        itemCompras.remove(itemCompras);
    }

    public Compra(String numeroCompra, LocalDate dataCompra, double valorTotal, double valorDesconto, double valorPagar, List<ItemCompra> itemCompras, List<Cliente> clientes) {
        this.numeroCompra = numeroCompra;
        this.dataCompra = dataCompra;
        this.valorTotal = valorTotal;
        this.valorDesconto = valorDesconto;
        this.valorPagar = valorPagar;
        this.itemCompras = itemCompras;
        this.clientes = clientes;
    }

    public String getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(String numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public List<ItemCompra> getItemCompras() {
        return itemCompras;
    }

    public void setItemCompras(List<ItemCompra> itemCompras) {
        this.itemCompras = itemCompras;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }


    @Override
    public void MostrarDados() {
        System.out.println("Compra{" +
                "numeroCompra='" + numeroCompra + '\'' +
                ", dataCompra=" + dataCompra +
                ", valorTotal=" + valorTotal +
                ", valorDesconto=" + valorDesconto +
                ", valorPagar=" + valorPagar +
                ", itemCompras=" + itemCompras +
                ", clientes=" + clientes +
                '}');
    }
}
