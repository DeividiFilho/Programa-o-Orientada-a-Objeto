public class Cerveja extends Bebida{
    private double teorAlcoolico;

    public Cerveja(String descricao, double preco, int quantidadeEstoque, double teorAlcoolico) {
        super(descricao, preco, quantidadeEstoque);
        this.teorAlcoolico = teorAlcoolico;
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Teor alcoólico: " + teorAlcoolico);
    }
}
/* Herda bebida e adicona o teor alcoólico

 */