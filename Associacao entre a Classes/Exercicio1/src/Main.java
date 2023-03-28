import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // criando músicas
        Musica musica1 = new Musica("Bohemian Rhapsody", "Queen", 354, "Rock");
        Musica musica2 = new Musica("Sweet Child O' Mine", "Guns N' Roses", 356, "Rock");
        Musica musica3 = new Musica("Thriller", "Michael Jackson", 357, "Pop");

        // criando playlists
        Playlist playlist1 = new Playlist("Rock Classics");
        playlist1.adicionarMusica(musica1);
        playlist1.adicionarMusica(musica2);

        Playlist playlist2 = new Playlist("Party Hits");
        playlist2.adicionarMusica(musica2);
        playlist2.adicionarMusica(musica3);

        // mostrando informações das músicas
        System.out.println("=== Músicas ===");
        System.out.println(musica1);
        System.out.println(musica2);
        System.out.println(musica3);

        // mostrando informações das playlists
        System.out.println("=== Playlists ===");
        System.out.println(playlist1);
        System.out.println(playlist2);

        // mostrando duração de uma playlist
        System.out.println("Duração da playlist " + playlist1.getNome() + ": " + playlist1.getDuracao() + " segundos.");
    }
}

