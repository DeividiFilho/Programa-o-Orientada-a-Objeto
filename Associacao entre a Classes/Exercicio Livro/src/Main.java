import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Editora editora = new Editora("Pesrson", "123456/0001-87");
        Autor autor = new Autor("Sthepen Hawking", "1234-5678");
        Autor autor2 = new Autor("Neil de Grace", "234234");
        List<Autor> autores = new ArrayList<>();
        autores.add(autor);
        autores.add(autor2);

        Livro livro = new Livro("O universo em uma casca de noz",
                2000, 31, editora,autores);

        livro.mostrarDados();
    }
}
