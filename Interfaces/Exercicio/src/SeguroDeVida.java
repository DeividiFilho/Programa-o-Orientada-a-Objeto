public class SeguroDeVida extends Produto implements ITributavel{
    private double premio;

    public SeguroDeVida(String descricao, Clientes clientes, double premio) {
        super(descricao, clientes);
        this.premio = premio;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }
    @Override
    public void mostrarDados() {
        System.out.println("\n Descricao: " + getDescricao() +
                "\n Cliente: " + getClientes().getNome() +
                "\n Premio: " + getPremio());
    }

    @Override
    public void calcularTributo() {
        double valor = premio * 0.10;
        System.out.println("Tributo: " + valor);
    }
}
