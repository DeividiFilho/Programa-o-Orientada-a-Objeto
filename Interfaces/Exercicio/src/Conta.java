public abstract class Conta extends Produto {
    private String numero;
    private double saldo;

    public Conta(String descricao, Clientes clientes, String numero, double saldo) {
        super(descricao, clientes);
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
