import java.time.LocalTime;

public class Musica {
    private String titulo;
    private String artista;
    private LocalTime duracao;
    private String estilo;

    public void mostrarDados(){
        System.out.println("\n Mítulo: " + getTitulo() +
                            "\n Artista: " + getArtista() +
                            "\n Duração: " + getDuracao() +
                            "\n Estilo: " + getEstilo());
    }

    public Musica(String titulo, String artista, LocalTime duracao, String estilo) {
        this.setTitulo(titulo);
        this.setArtista(artista);
        this.setDuracao(duracao);
        this.setEstilo(estilo);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}
