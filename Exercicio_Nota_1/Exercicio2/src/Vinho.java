public class Vinho extends Bebida{
    private String uva;
    private String paisOrigem;

    public Vinho(String descricao, double preco, int quantidadeEstoque, String uva, String paisOrigem) {
        super(descricao, preco, quantidadeEstoque);
        this.uva = uva;
        this.paisOrigem = paisOrigem;
    }

    public String getUva() {
        return uva;
    }

    public void setUva(String uva) {
        this.uva = uva;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
       // System.out.println("Produto: Vinho");
        System.out.println("Nome da uva: " + uva);
        System.out.println("País de origem: " + paisOrigem);
    }
}

/* herda bebida e adiciona o tipo de uva e o pais de origem
 */