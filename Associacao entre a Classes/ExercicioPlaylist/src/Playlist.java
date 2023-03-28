import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas = new ArrayList<>();


    public LocalTime calcularDuracao(){
        LocalTime duracao = LocalTime.of(0,0,0);
        for (Musica m: getMusicas())
            duracao = duracao.plusHours(m.getDuracao().getHour())
                    .plusMinutes(m.getDuracao().getMinute())
                    .plusSeconds(m.getDuracao().getSecond());
        return duracao;
    }

    public void mostraDados(){
        System.out.println("\nNome da playlist: " + getNome());
        System.out.println("\nMúsicas: ");
        for (Musica m:musicas)
            System.out.println(m.getTitulo());
    }

    public void adicionarMusica(Musica m){
        getMusicas().add(m);
    }

    public void removerMusica(Musica m){
        getMusicas().remove(m);
    }

    public Playlist(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }
}
