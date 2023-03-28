import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private int anoPublicacao;
    private double preco;
    private Editora editora;
    private List<Autor> autores = new ArrayList<>();

    public void mostrarDados(){
        System.out.println("\n Título: "+ this.getTitulo() +
                            "\n Ano: "+ this.getAnoPublicacao() +
                            "\n Preço: " + this.getPreco() +
                            "\n Editora: " + this.getEditora().getRazaoSocial());
        System.out.println("Autores: ");
        for(Autor autor:getAutores())
            System.out.println(autor.getNome());
    }

    public Livro(String titulo, int anoPublicacao, double preco, Editora editora, List<Autor> autores) {
        this.setTitulo(titulo);
        this.setAnoPublicacao(anoPublicacao);
        this.setPreco(preco);
        this.setEditora(editora);
        this.setAutores(autores);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
}
