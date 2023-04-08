public class Corrente extends Conta implements  ITributavel{
    private double limite;

    public Corrente(String descricao, Clientes clientes, String numero, double saldo, double limite) {
        super(descricao, clientes, numero, saldo);
        this.limite = limite;
    }

    @Override
    public void mostrarDados() {
        System.out.println("\n Descricao: " + getDescricao() +
                "\n Cliente: " + getClientes().getNome() +
                "\n Numero: " + getNumero() +
                "\n Saldo: " + getSaldo() +
                "\n Limite: " + getLimite());
    }


    @Override
    public void calcularTributo() {
        double valor = getSaldo() * 0.05;
        System.out.println("Tributo: " + valor);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
