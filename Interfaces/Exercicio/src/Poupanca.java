public class Poupanca extends Conta{
    private double rendimento;

    public Poupanca(String descricao, Clientes clientes, String numero, double saldo, double rendimento) {
        super(descricao, clientes, numero, saldo);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public void mostrarDados() {
        System.out.println("\n Descricao: " + getDescricao() +
                "\n Cliente: " + getClientes().getNome() +
                "\n Numero: " + getNumero() +
                "\n Saldo: " + getSaldo() +
                "\n Rendimento: " + getRendimento());
    }
}
