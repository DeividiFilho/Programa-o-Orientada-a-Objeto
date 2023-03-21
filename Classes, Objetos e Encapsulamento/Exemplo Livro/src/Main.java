public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.setTitulo("Harry Potter");

        Livro livro2 = new Livro("Java para iniciantes", "Hebert Schildt", 2000, 100.00);
        livro2.setAnoPublicacao(2015);

        Livro livro3 = new Livro("Java", "Deitel", 2016, 350.00);
        livro3.atualizarPreco(10);
        livro3.setTitulo("Java: Como programar");

        System.out.println(livro1.getTitulo());
        System.out.println(livro2.getAnoPublicacao());

        System.out.println(livro3.getTitulo());
        System.out.println(livro3.getAutor());
        System.out.println(livro3.getAnoPublicacao());
        System.out.println(livro3.getPreco());
    }
}