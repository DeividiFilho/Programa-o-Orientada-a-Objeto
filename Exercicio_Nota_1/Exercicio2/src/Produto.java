public class Produto {
    private String descricao;
    private double preco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public void mostrarDados() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: " + preco);
    }
}
/* Cria uma classe Produto onde recebe atributos, gera o construtor, get e set
 */
