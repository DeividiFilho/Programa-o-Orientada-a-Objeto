import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Musica m1 = new Musica("The Night", "Avicii",
                LocalTime.of(0,2,54), "Pop");
        m1.mostrarDados();

        Musica m2 = new Musica("Hear me now", "Alok",
                LocalTime.of(0, 3, 41), "Electronica");
        m2.mostrarDados();

        Playlist playlist = new Playlist("Pop");
        playlist.adicionarMusica(m1);
        playlist.adicionarMusica(m2);
        playlist.mostraDados();
        System.out.println("Tempo total da playlist " + playlist.getNome()
                        +":" + playlist.calcularDuracao());
    }
}
