import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas;

    public Playlist(String nome)   {
        this.setNome(nome);
        this.musicas = new ArrayList<>();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addMusica(Musica musica) {
        this.musicas.add(musica);
    }

    public void removeMusica(Musica musica) {
        this.musicas.remove(musica);
    }

    public int getDuracao() {
        int duracaoTotal = 0;
        for (Musica musica : musicas) {
            duracaoTotal += musica.getDuracao();
        }
        return duracaoTotal;
    }

    public void mostrarMusicas() {
        System.out.println("Música da playlist " + this.nome + ":");
        for (Musica musica : musicas) {
            System.out.println(musica.getTitulo() + " - " + musica.getArtista()  + " (" + musica.getDuracao() + " segundos) - " + musica.getEstilo());
        }
    }

    public void adicionarMusica(Musica musica1) {
    }
}
