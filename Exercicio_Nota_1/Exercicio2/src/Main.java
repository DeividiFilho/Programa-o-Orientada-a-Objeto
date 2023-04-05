public class Main {
    public static void main(String[] args) {
        // Produto
        Produto produto1 = new Produto("Camiseta", 49);

        produto1.mostrarDados();

        // Pizza
        Pizza pizza1 = new Pizza("Calabresa", 30, true);

        pizza1.mostrarDados();

        // Cerveja
        Cerveja cerveja1 = new Cerveja("Imperio", 2.95, 12,3.5);
        cerveja1.mostrarDados();

        // Vinho
        Vinho vinho1 = new Vinho("Cabernet Sauvignon", 79.90, 5, "Sauvignon", "França");
        vinho1.mostrarDados();

    }
}