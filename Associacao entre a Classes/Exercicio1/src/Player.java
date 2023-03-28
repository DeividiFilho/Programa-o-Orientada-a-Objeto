import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Playlist> playlists;

    public Player() {
        this.playlists = new ArrayList<>();
    }

    public void addPlaylist(Playlist playlist) {
        this.playlists.add(playlist);
    }

    public void removePlaylist(Playlist playlist) {
        this.playlists.remove(playlist);
    }

    public void mostrarPlaylists() {
        System.out.println("Playlists:");
        for (Playlist playlist : playlists) {
            System.out.println(playlist.getNome());
            playlist.mostrarMusicas();
            System.out.println("Duração total: " + playlist.getDuracao() + " segundos");
        }
    }
}
